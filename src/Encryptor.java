public class Encryptor
{
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Constructor*/
    public Encryptor(int r, int c)
    {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock()
    {
        return letterBlock;
    }

    /** Places a string into letterBlock in row-major order.
     *
     *   @param str  the string to be processed
     *
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        int index = 0;
        int length = letterBlock.length * letterBlock[0].length - 1;
        for (int row = 0; row < letterBlock.length; row++)
        {
            for (int col = 0; col < letterBlock[0].length; col++)
            {
                if (index < str.length())
                {
                   letterBlock[row][col] = str.substring(index, index + 1);
                }
                else
                {
                    letterBlock[row][col] = "A";
                }
                index++;
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *
     *   Precondition: letterBlock has been filled
     *
     *   @return the encrypted string from letterBlock
     */
    public String encryptBlock()
    {
        String result = "";
        for (int col = 0; col < letterBlock[0].length; col++)
        {
            for (int row = 0; row < letterBlock.length; row++)
            {
                result += letterBlock[row][col];
            }
        }
        return result;
    }

    /** Encrypts a message.
     *
     *  @param message the string to be encrypted
     *
     *  @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        String result = "";
        int length = letterBlock.length * letterBlock[0].length;
        for (int i = 0; i <= message.length() - 1; i += length)
        {
            if (message.length() - (i + length) > 0) {
                fillBlock(message.substring(i, i + length));
            }
            else
            {
                fillBlock(message.substring(i));
            }
            result += encryptBlock();
        }
        return result;
    }

    /**  Decrypts an encrypted message. All filler 'A's that may have been
     *   added during encryption will be removed, so this assumes that the
     *   original message (BEFORE it was encrypted) did NOT end in a capital A!
     *
     *   NOTE! When you are decrypting an encrypted message,
     *         be sure that you have initialized your Encryptor object
     *         with the same row/column used to encrypted the message! (i.e.
     *         the “encryption key” that is necessary for successful decryption)
     *         This is outlined in the precondition below.
     *
     *   Precondition: the Encryptor object being used for decryption has been
     *                 initialized with the same number of rows and columns
     *                 as was used for the Encryptor object used for encryption.
     *
     *   @param encryptedMessage  the encrypted message to decrypt
     *
     *   @return  the decrypted, original message (which had been encrypted)
     *
     *   TIP: You are encouraged to create other helper methods as you see fit
     *        (e.g. a method to decrypt each section of the decrypted message,
     *         similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage)
    {
        String result = "";
        int length = letterBlock.length * letterBlock[0].length;
        for (int i = 0; i < encryptedMessage.length(); i+=length)
        {
            result += decryptBlock(encryptedMessage.substring(i, i + length));
        }
        boolean notA = true;
        int last = result.length();
        for(int j = result.length() - 1; j >= 0 && notA; j--)
        {
            if (!result.substring(j, j + 1).equals("A"))
            {
                last = j;
                notA = false;
            }
        }
        result = result.substring(0, last + 1);

        return result;
    }

    /** Decrypts string from letterBlock by extracting in column-major order and returning in row-major order
     *
     *   Precondition: letterBlock has been filled
     *
     * @param encryptedBlock the decrypted string
     *
     *   @return the encrypted string from letterBlock
     */
    public String decryptBlock(String encryptedBlock)
    {
        String[][] temp = new String[letterBlock.length][letterBlock[0].length];
        int length = letterBlock.length * letterBlock[0].length;
        int index = 0;
        String result = "";
        for (int col = 0; col < letterBlock[0].length; col++)
        {
            for (int row = 0; row < letterBlock.length; row++)
            {
                if (index < length)
                {
                    temp[row][col] = encryptedBlock.substring(index, index + 1);
                    index++;
                }
            }
        }
        for (String[] row : temp)
        {
            for (String col : row)
            {
                result += col;
            }
        }
        //System.out.println(result);
        return result;
    }
}