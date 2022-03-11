public class Tester {
    public static void main(String[] args)
    {
        Encryptor one = new Encryptor(3, 4);
        String oneActual = one.encryptMessage("What are you doing next weekend?");
        System.out.println(oneActual);
        Encryptor two = new Encryptor(6, 5);
        String twoActual = two.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again.");
        System.out.println(twoActual);

        Encryptor three = new Encryptor(3, 2);
        System.out.println(three.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));

        Encryptor four = new Encryptor(5, 5);
        System.out.println(four.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));

        Encryptor five = new Encryptor(6, 5);
        System.out.println(five.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));

        Encryptor six = new Encryptor(9, 8);
        System.out.println(six.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA"));

        Encryptor mine = new Encryptor(8, 9);
        System.out.println(mine.encryptMessage("A life not examined is not worth living. To be a man in ancient Athens corrupting the youth with newfangled ideas. He drinks hemlock and dies."));
        System.out.println(mine.decryptMessage("Atdwien    on  Aleirgaatixst. nhfa h mceemn Tain iolonesnnti  n oe vbitco hwi edrt fddm rhwaerldueinaioip tgsncetyhl.kksio e s .nundH aAgte ehnA"));
        Encryptor crystal = new Encryptor(4, 3);
        System.out.println(crystal.decryptMessage("Negneroav n geoui upvy …Negneroav n l uoey wtodn…h rHasra,oy…AAAAAAAAAAA"));
        Encryptor aaron = new Encryptor(6, 6);
        System.out.println(aaron.decryptMessage("Il' nmnim,dy t    ry5Some 'tnoaI4a ne 'AAAyI6AAA 'AAAAnmAAAAo AAAAw6AAAA"));
    }
}
