package String.test3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
        public boolean checkInclusion(String s1, String s2) {
              boolean flag = false ;
              if(s1 == null || s2 == null || s1.length() > s2.length()) {
                  return false;
              }
            Map<Character ,Integer > s1map = new HashMap<>();
              for(int i = 0 ; i < s1.length() ; i ++) {
                  s1map.put(s1.charAt(i) , s1map.getOrDefault(s1.charAt(i) , 0) + 1);
              }
              for(int i = 0 ; i <= s2.length() - s1.length() ; i ++) {
                  int count = 0;
                   Map<Character , Integer> map = new HashMap<>();
                   for(int j = i  ; j < i + s1.length() ; j ++) {
                       map.put(s2.charAt(j) , map.getOrDefault(s2.charAt(j) , 0) + 1);
                   }
                   for(Character key : s1map.keySet()) {
                       if(map.get(key) == null) {
                           break;
                       }
                       if((int)(s1map.get(key)) == (int)(map.get(key))) {                      //Integer比较时会出问题 ， 必须要强类型转换？
                            count ++;
                           if(count == s1map.keySet().size()) {
                               flag = true;
                               break;
                           }
                       }
                       else {
                           break;
                       }
                   }
              }
              return flag;
        }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion("ckzviabspcfbabslodcxtzanlsnwbqrozvnfadhtskosxhxaxzwcthvirwivsfuyxgkdvvdmmaoohvnfegkzdajhzibfiuxvsihpseyyiapmgldyojfselzzudzrxcksvfoqoeimyfhnvidryqhhpvjawwpzspcfnvmewnhcbbbwfjifmcuspbrrjyhcusyiuydscwenyicdlfzaoaiudsdyjmhmzwmeaozheiaddevjrrgsfgqnyeoyxfvktctazsfizkynlookeorzmdvtloyfpbqjgzhjvykdthwkuubnbalrddjxpizysaptrinlytecouekkpsfzbjaitckodcdinydtaaakbntwbvrcabylllxtgtkdqfkjggvbrnxnvcsfpcutabvazyeqzitpwhhdpcxaklhbjrcsqzveytzbgoeqnyrbkvkfnlqhrnedjomfmkuadwabnzomgvtdypocbvipryedcxnrcrqwpefqducxxilhpoewlliilidxucjydpahcumngpekrlroftwpbaejfjmohnkulxdglcpcszpyqestonhxskshzmdkikjkeymddyiysmigvqjveocbabhcofwyseytwfgiqmufcqrugwofytxzwwwiwlxdshtamwneosotqbfjjdxmhjkmzcvpmkuumycqzvlmwvjdwkcikyewupwaotrseyomhuykdkohveftgqfoqjcnstlxdasnvimslmuqsqrhvbukyfvpswmlavtxegbcesxgzswwnslxymmrdwmpalcazukvyyotlvwvlishtgbmlznrmcjysjemwqfjgbehnowgjlvtgemlkkdqpxiuqwhqkqdkexoflxfescoblknurkntbpfqfiervqgeiasguycmjoyzyujgzdfjobrswjpxixmadnnkdtazbasmnnlbubokkvomtupdpqwnoddummmqbwbthfhqdgdawdwxlmgvelhefvqcrpxbkgvhyrpxmfivrvkkqfpxjhzqesiqoeanqzpvbgonwptzqgtajoiiphivxtefarwjyoklkxumrndswebdsgiipzrcunpnibmxwlkihnzlswaujflztxxnuhojrpkzldwhnuiizxalawskkvaplopthvzjrbqfwpwjfkzrhyciajdsaeusctnvajuubjiqdqsaqjxtxgxabpdwxzgiedyyeosfdbkairekywkilyksjratftctphompqoomxucysbzrpywjzumoiizklkooilgeapimiixawfgiszfqucihxfrtrwijyeiebudncwnxbnafohhhqaltksafjfegxlbbewetsyrtuxxlngffpcnyfdarqwznsuiuhvqshjpvbiqkxgfwyrkdlorlwgexfinunbfzifxlfufalbkyfdekhupuuflsetpbppaahwbtjpjguygpnavimbbaeikwjxurdxyfgmldgdbkyxzhvwlxzlpnpmzlyosvhngmuqkrvcsabhiahhguxuakphuaptbjfpxybqnlfazkagwlbvzcnzorpymafiwvtkjtilwihwoyelogtpdyipzkurqcghpdqgrfpnmrmahbkbyupxwooblaydongjrlnuhoikoyiexgzlzgonceyhfwypsgypilxcnkdhxvbfddnhvdicolrjyzttrymmcvoyswaszbbugsuuewhewtoxgnrbfqsysjqqcutoikssesxaohxxfxofiguvpgzfkimmqdjuyljlpndapzygidopwxnaetmmpyaqozybbpfqlonebiilvckmtyaommksfcrmdeyjjbjncmpruofaaccnvndkovjugcrzcwkbdhqdiwnvnavnngloshyataygyukrecamzftmeephucmofjgrzsexsprpdkazhmtaepqppgzjmxxzlpbkouqlhqcxdpaslrjrsnfbjvbekpyqsldzhxarpzbbjteudfwfjdipgcdwylorxivwbjkegazpcngzkokygjfnmfeumbetznsxsmyhccurqdzznvhrtawpklrrrbedqzkiczignlaoaiydezgktdecaxwxxecymbuisvhlcjlhmnpjuegnaawfxopvvkxihehquxzlveabigomeptsqbfurytjikpbtsotgfghadilylnimxcsvgtmzjgxjyhabtfawzmomctquctwnolglflghdugeutgdmkitunbkhgoceqyrzvwprotiysaiqcnwxflcjgjqobeskizjqqwihnmxyvbeeufyvouupnyuuyauxtmhtqlbgoacjdkvmuqohbkpctfwxvwlghevsuozrgxkrrrllnvjloeligxvnvzluxlajszgeilxdjaviawhlthtxuclqypgdiwgwrhynmzqghyzeednlmyepgxxvtmjsuprisbgyvcojhculwdkjmpmvueaftiujrmdqptrmlrwdyjtjlznuhftzmffbcqsjemrpjrqxtuxhlnqvckgcuvhswgtxonfljjwnexdafpjzwjdypdfwhwogikkpsvuckmgehcqmdecriamdqsdsxuhsdqenrpifzjnpvrbpvetatbmvsncltabzspzedumeclbxiqnsmdkbqfedikoalfsnxkhewwzyeqxlecfimvdpxdnvrtlxlxzakupknvchursvilyjyfxmvdeojclhjjwxtpqiogsfdnzchrlztvxmibbociiberaevpjmyqxvcicxuwkmyjlgxhvrjdqbjzdctzwidoplkvazhgsdbkavmrpfjgebydmloykqtxocdhcpwrtvawhofvwnohtwodppmcrbhvrvexzijiwgkptntyljvikjlzpjvpxaejfwzyldxrckbzylvhpqmjjeyatmrbcgozvcalcctngwuysjqmkmhjwmyyfxhdjswimahqzptrphtjekkabpgopfdnhwaclxzavftmswadgztxceonrkczurtdvxhabiafyzdbdbyorerekjzgpueihiamlscdndjjgqwdjsmeweqrfpypfrfsciclvrrqchnmtxscbvbbipzingkeopuvlnpqaeqidlpvusbkjhntvxbookqctymjmhqjvsnaiblmnofxphanpxspmkmxmyejooqpytdixgguonbpaipurpwwfqxrrtekvvtpgndabbvjcoxonxciuypxqcfolxirvafnmgsrcrenwyuxfekuqyfdtvhvmonvkstbmvygsbguiknltpixsebxktczniurulxpyxckrtmhpvgqpbvlqwvcqwaocalqtdwomgrjyvryodeikbeeebcrrkugliqgktoohsneynmfafykpmndfgwtpdwfrmicenyntbfyyntlqqrujfioycrhopgiadmsjcycucyuqvzufbvachmlwyfxspzrvkkvkhuykoqrwshzmyypmvosuezpsgtqtecayj"
                 ,"livsugnixbcmmajhinduvzfjzxtzneixibupxfezifaovcbowfayjtlcdsjogjytuczxbwluiktkdyecquebuvkgfobhpiqfbyckfbchvfkdowckrvuiblhbmubugrrovdhbyvevwetlusthiyxgtaqcdfytgbkrnnjifdslzntgnryqcmwkumdvqctymyffanmawobfihsfqmtqvivvouunsexpzcfmiituppwxgjyspyoeuspyystyneoonatbojiufzhhfeakqzeypaopkyscadbkzsnnjewgflysazhwaigicrzeccanemfmrvrdzxtcbuqvjblrynlhbmtkzhtiqnhrfclxovtijwucgvsreirqmhweoazxdyydksrchvizmljhdkekaxbqkleaolqnepijxpwbcxfadfsxswhzmmffsmoiyfosbwjjcgqpexddwizaiqpsaagwxkajdhqeyouihwlfrmnelakembxwcrvwqyaguvqewjczfmfqiqmjbqxcmfrpqoewszkomwckfgrlkannjefxsulbpkpxlvbrgwruvhdonuezoomvnyridrosfzhfvhmqbzdsfvjgfdqvafheuhveaqwrofhgkfobkkevdsqyumzrvapfjypvjsdzaxxwcnsbxasqewmkmucxbgjqntdsvrbndebttkoiznatcjgtgklljurkkdvpbrtbolvgrqwsnuoubhgvtmbakwgvxypndpqtireuvbdxfjcioqqsbfrqahqsfbwfnlkwobnqdbptxrizourrxyjejflgkbcwmrtttqeeqkyzrzdcfakwcfajhjfmcpnsbekwtzgpbwrotgsxopaemsnywoxsqxoyricgosfurfggulchgyoocivnkqytgbroijmaduoywbudtgwugekikebdadoygtmikcficifdcsvritesbvznlbrgbveudwzatarhbehowrrakimocgqyxzedhlqxzxtqloupbwbdvewcbehkmoahoykouhilivtxukqhwmyjjqmfxqybahsubfvnhctudtpxwsnwfmsamavjkqiabzzcqgqssygswavqpdtxfyognqybsogsbkzkktfjqebhitvqnawokacbkfkthqoammdscyvxgaaqyaplexhlwweambfwtylvihpdedshaeluxgthrejkgkvwrtyzpuygqghtlkmpnzkyjiwyuaqijkxttvdsxddfkmgnnlmamjumsbjmjxqkrgncrwyoyetdsmtanoasirkfklcsxukfdebnlbgobwgyqrthzwjbwpxuxmheplqyjaucgrptfewjahejsfypktnpafmlrzekbjqsgthrwbdxttitsqyglsjgnzmscncgvkooxdlxsmmugeeayicndgoagpfckerzuwdphqksijniyckzviabspcfbabslodcxtzanlsnwbqrozvnfadhtskosxhxaxzwcthvirwivsfuyxgkdvvdmmaoohvnfegkzdajhzibfiuxvsihpseyyiapmgldyojfselzzudzrxcksvfoqoeimyfhnvidryqhhpvjawwpzspcfnvmewnhcbbbwfjifmcuspbrrjyhcusyiuydscwenyicdlfznoaiudsdyjmcmzwmeaozheiaddevjrrgsfgqnyeoyxfvktctazsfizkynlookeorzmdvtloyfpbqjgzhjvykdthwkuubnbalrddjxpihysaptrinlytecouekkpsfzbjaitckodcdinydtaaakbntwbvrcasylllxtgtkdqfkjggvbanxnvcsfphutabvazyeqzitpwhhdpcxaklhbjrcsqzveytzbgoeqnyrbkvkfnlqhrnedjomfmkuadwabnzomgvtdypocbvipryedcxnrcrqwpefqducxxilhpoewlliilidxucjydpahcumagpekrlroftwpbaejfjmohnkulxdglcpcszpyqestonhxskshzmdkikjkeymdfyiysmigvqjveocbabhcofwyseytwfgiqmufcqrugwofytxzwwwiwlxdshtamwneosotqbfjjdxmhjkmzcvpmkuumycqzvlmwvjdwkcityewupwaotrseyomhuykdkohveftgqfoqjcnstlxdasnvimslmuqsqrhvbukyfvpswmlavtxegbcesxgzswwnslxymmrdwmpalcazukvyyotlvwvlishtgbmlznrmcjysjemwqfjgbehnowgjlvtgemlkkdqpxiuqwhqkqdkexoflxfescoblknurkntbpfqfiervqgeiesguycmjoyzyujgzdfjobrswjpxixmadnnkdtazbasmnnlbubokkvomtupdpqwnoddummmqbwbthfhqdgdawdwxlmgvelhefvqcrpxbkgvhyrpxmfivrvkkqfpxjhzqesiqoeanqzpvbgonwptzqgtajoiiphivxtefarwjyoklkxumrndswebdsghipzrcunpnibmxwlkihnzlswaujflztxxnuhojrpkzldwhnuiizxalawskkvaplopthvzjrbqfwpwjfkzrhyciajdsaeusctnvajuubjiqdqsaqjxtxgxabpdwxzgiedyyeosfdbkrirekywkilyksjratftctphompqoomxucysbzrpywjzumoiizklkooilgeapimiixawfgiszfqucihxfrtrwijyeiebudncwnxbnafohhhqaltksafjfegxlbbewetsyrtuxxlngffpcnyfdarqwznsuiuhvqshjpvbiqkxgfwyrkdlorlwgexfinunbfzifxlfufalbkyddekhupuuflsetpbppaahwbkjpjguygpnavimbbaeikwjxurdxyfgmldgdbkyxzhvwlxzlpnpmzlyosvhngmuqkrvcsabhiahhguxuakphuaptbjfpxybqnlfazkagwlbvzcnzorpymafiwvtkjtilwihwoyelogtpdyipzkurqcghpdqgrfpnmrmahbkbyupxwooblaydongjrlnuhoikoyiexgzlzgonceyhfwypsgypilxcnkdhxvbfddnhvdicolrjyzttrymmcvoyswaszbbugsuuewhawtoxgnrbfqsysjqqcutoikssesxaohxxfxofiguvpgzfkimmqdjuyljlpndapzygidopwxnaetmmpyaqozybbpfqlonebiilvckmtyaommksfcrmdeyjjbjncmpruofaaccnvndkovjugcrzcwkbdhqdiwnvnavnngloshyataygyukrecamzftmeephucmofjgrzsepsprpdkazhmtaepqppgzjmxxzlpbkouqlhqcxdpaslrjrsnfbjvbekpyqsldzhxarpzbbjteudfwfjdipgcdwylorxivwbjkegazpcngzkokygjfnmfeumbetznsxsmyhccurqdzznvhrtawpklrrrbedqzkiczignlaoaiydezgktdecaxwxxecymbuisvhlcjlhmnpjuegnaawfxopvvkxihehquxzlveabigomeptsqbfurytjikpbtsotgfghadilylnimxcsvgtmzjgxjyhabtfawzmomctquctwnolglflghdugeutgdmkitunbkhgoceqyrzvwprotiysaiqcnwnflcjgjqobeskizjqqwihnmxyvbeeufyvouupnyuuyauxtmhtqlbgoacjdkvmuqohbkpctfwxvwlgievsuozrgxkrrrllnvjloeligxvnvzluxlajszgeilxdjaviawhlthtxuclqypgdiwgwrhynmzqghyzeednlmyepgxxvtmjsuprisbgyvcojhculwdkjmpmvueaftiujrmdqptrmlrwdyjtjlznuhftzmffbcqsjemrpjrqxtuxhlnqvckgcuvhswgtxonfljjwnexdafpjzwjdypdfwhwogikkpsvuckmgehcqmdecriamdqsdsxuhsdqenrpifzjnpvrbpvetatbmvsncltabzspzedumeclbxiqnsmdkbqfedikoalfsnxkhewwzyeqxlecfimvdpxdnvrtlxlxzakupknvchursvilyjyfxmvdfojclhjjwxtpqiogsfdxzczrlztvxmibbociiberaevpjmyqxvcicxuwkmyjlgxhvrjdqbjzdctzwidoplkvazhgsdbkavmrpfjgebydmloykqtxocdhcpwrtvawhofvwnohtwodxpmcrbhvrvexzijiwgkptntyljvikjlzpjvpxaejfwzyldxrckbzylvhpqmjjeyatmrbcgozvcalcctngwuysjqmkmhjwmyyfxhdjswimahqzptrphtjekkabpgopfdnhwaclxzavftmswadgztxceonrkczurtdvxhabiafyzdbdbyorerekjzgpueihiamlscdndjjgqwdjsmeweqrfpypfrfsciclvrrqchnmtxscbvbbipzingkeopuvlnpqaeqidlpvusbkjhntvxbookqctymjmhqjvsnaiblmnofxphanpxspmkmxmyejooqpytdixgguonbpaipurpwwfqxrrtekvvtpgndabbvjcoxonxciuypxqcfolxirvafnmgsrcrenwyuxeekuqyfdtvhvmonvkbtbmvygsbguiknltpixsebxktczniurulxpyxckrtmhpvgqpbvlqwvcqwaocalqtdwomgrjyvryodeikbeeebcrrkugliqgktoohsneynmfafykpmndfgwtpdwfrmicenyntbfyyntlqqrujfioycrhopgiadmsjcycucyuqvzufbvachmlwyfxspzrvkkvkhuykoqrwshzmyypmvosuezpsgtqtecayjdasrysrmdewxmqntqmuavczczrcrzokjzqtiucdfmijfqkizfftxsddkdwlofkjbuhzodgzeslpezdifpdfktufgekrrbsxfeqduphoemwhncbblqkoyychuwlkjfxjmvdasfhwxnxjmstabgiujditpmpnojsfzpgqvupkdipphutiewfynvoxmdaloyxsksaxnyyizreshgejskhokarxddrrkoeglwledovrbarhkfcetrshiuucmbrtqjawsavbhuoijshkzcmogbjurybhwduushlmhjzgthhlvftpytayjzzbcxbtvozwhsmtkltgrugyfaoldnnswbohpsqvwbwtjcxeewsvfwpkwltxmomlwsylwvcmmrwjvvbbktqxnypfmhjigzaqacmprjfnooinkgbjzzwyuafxsmqdcmsxhbfoejjzxizufvfejrrcfaijqovlxdngkgwisvryevivawbcttftuxympktxbxotvdycxhfokmtdeqacdceffvhvjpnzfuhqslixvlcxehvbkritokoqqlbmkdkgflthhhdgiaidjjpvcatctiosolfqzcjmdppttztpklgosnshspna"));
       System.out.println(solution.checkInclusion("ab"
              , "eidbaooo"));
        }
}