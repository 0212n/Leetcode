package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1903;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1903Test {
    private static _1903.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1903.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("5", solution1.largestOddNumber("52"));
    }

    @Test
    public void test2() {
        assertEquals("35427", solution1.largestOddNumber("35427"));
    }

    @Test
    public void test3() {
        assertEquals("", solution1.largestOddNumber("682240884028086868404428842828664608862668422848464222044808062248028626808622648468064684002662206226066026484442422688042080684686220644488204022062860680482080686642464640464808662064884824260028648606444680200422064006864880486640800648828268684608460686600424266848424006442022080400840864222486042862488644828486026242662426040828662088280044400400424020064640620248088446626800004044064806462400400808484282028844606842644222262268080240226642826480202242048684644022206008424648828488048060828220426484664062040088682460884424244242680060828686004084220646404684460668220446600022404464840226860682284864260460062842664002264620886406204262808446844460642604220688262062206042420262486060840840200204428206042808202226686442802082260602448060888208640660040042842868040226042806882022200082868802846462486282022688286468886460484864682266006842422680488062820228682402042462442020680806828680682860066248862048260424084866468262220822282466082622820044066420086022044644488868064226204280402044466444662008040804488442842204888822242848628666060006844088448804684608462068840266664428842804224226488266880408840028880666482806262486642804886804020802602826800026262682488440426248848408228828402648406066826028286866602226282202064046026606802880680206048008826400288046824246002402848264680620268826046040682460022406248462448266202008446048806644840666482206486460260068046426846804462440420428626624282804686840266280868428264024428400242244466882240660662866626886866086022082226662266622222806468088084466446686080068200882082440048686088260622260026066842422840646000440660628886482088266406406646628464060442240480080428040044408066824082600648688222682062806686862800642842822862806288886042668262448668042444244488284228664648240824048482826604426828048406062684464280468848428424866268608022804082240424842868240080248264628846842082446428266822680204242042482866848480006022286888204466242824064642008284404664042466288424202066280466668280082844028000248022448060886222420226688228806602680082482282244644446824824400226688686600200444400486880626660448806482682002004606884280846866484648620864406460224484266020486608004402240220402266646466288600022066206602280442406606288884424464682482266882484222262488000080828660462222062288424002444400442062002280066266444044622026888464280288802028020226400066288268208044406860208484000668208806268080842484620886468624240248882444848428820662224028684626264884224668866602606268644024686428028204200200204400068224664086428488064068480688424848684822246004626620806848244280066602806402208624868202848060288888804204246408228042460808868648262462226000260204424000008004260886062828822288264602206062086064662826866466266262244624008804880084688604442402482066668888868426484662244862268660860460800802424286642020884082064200080886868628088468000024204846686286064688086422240280282022828048662200600862048480486808462828640604868028064828200248060264604848282884682400682822604806266606246266468064644802824020008226026680804626420264242842468400648604842480480882426648006622660200206422004680060644440024062840640226820068422482822080224006202086844260208444646288042206820668426422060240826022864402044200486486866428022604440824408244028084860842626264224842862402888244608646642868284224660042428224068864446860648084428806068642206080066864864648884820464846040882642680248442406028440068448888242602400428248622002640626046680860200480286046822002426262260846606826020824284026200628040804862660260020004808882626646804284028842660664246282420408046088202000026460440884660620444646866084642866240284408084280242820040008468284088664204826204402868000682086406482206244620228484402088848460606202046002884664884466200420680068602862424600022466046280228802826288808662220080440820684826204846246266042446220626202468660468460426604228202200888882860464424288008462882000622860064886888226220242428644026864606406880024688408844288206400846048800828424828602442804826642484644642620228686020404482008064620202822008068284024808208800080224200280462600208402240420246484440242604000264086004402664868442660082484442868048802404680828026846066000068840820804288682606682420642202426024868662462462220682408642228408284224022264640806220826068688000862824288806286662822240026822064200608800640644808864064826204482084260208028846848800066806284622802668400688862648460266262862448662088200206848002602422484048804608264064822686024682608228400068668880848406804040822662866244200460208406444224842466084404262602468800046484208246600688024422080264040684664668020024824228826860842444862802622666826804402206846228262680406204402046462842466220602808062640022264486400482088086800426246400022622000828880828820044084680864846260222068280806206200260246242844266420400268022066840086222840688004202228808826424826244862886604640000802466204240828242646060286866266040246248680882462462600824022808626226428466622622424288660646422446282406826428888844048206226066800428446886220628220880244888604208226466604488442284246884604404860440244204422466462624626484862460800846880044888824088606644228066482448886648844840668044648448824848006042422666028800680084824068464224662842204204022608624466222088604882406022284864224686482048060664640826024200086024622640628626046460666020004000266602866282824864480284844046242066862840006242846400602828620848248288280228060822228408460068408046640400804068202682228668628262068680888822800422288240246264662660840608626006064024260086802240860628246448002804662608860060622288608842088004800086008026660808282002082880024640220466062200828628020020620884086208264488468244068848608820828208826202488400226066022286804886046420224046640044068820660222026408244862622660044800426602080666208086482606628680260842824822066846622066088846602282628808268842648244424240606628622840644084802266224406826882644842686022020220022622608024206806228882244000842866628242066600226842004806046682226604260040402480628244046806042288602206242286080222224846006020086286488826824288808460808844206824642808204664046266880442208668848080220608024064446422880602620024006242666024820844444840408006442860882682208800826280228260226802222420480008804482208606426624846204026022846286448026660684808488062864440880420222828006006204444028806046420286424488822606242226222028086662444806822802404486246464086068626646424682062400424684468600426488860226088040440662622420266604820064662846662802406426064608228442826848682064826680004882022406884640840662424442840604286200468202422082062880222686822822002080026442046660646284282842640088680642064246262802006202088662280624600262426664264828060228642246260040844068442400868284840288064000484882886608462488248846662624280480266640682424828248202602484442026420282800884282202202080064268862884680488684842062608202480282200684668460608222628826864028620660664604804848442002844244006206488080860660446400628462086846080440822682842624224648882062080080246800268044426026660408082200424646480206280288604880824888444648888462880244440868808664446668420480808484444046444086060822020068042668602268440266224880262080888240668642862644884486606088064624220204408022064048068426040888642264888642224800682624460408062828228266462028884440684802864806602042002820668622802664842088240402688868044464262806646426684404602446480868206024264248044228648086600680842440682868662808844266626628640822224826802224008822442646284088664648464848200688488602800084482226440804240200662406282082640462286060226822484628640088404244424426228082640400486244280642288264622082882004040204068488204840284226680886264048282644082488260846606262864400206006064488884068422080240048608802262442660064086280088288244628882224264286002224648268426064060284400440664642404646082228006226622280222462608000060680606842686028886668666404664284264402624224284460062602844822482266808200262828404626602804206628066806020440880686686602246282882260060284824828080622088806048846606024046866084642206446286086842442042684024800600862840626280422428004606460868606660428022466648068848884444868242040024688648486622680040004084062408686868688424446048228208266606826828402682468062620820208660442622608400226248244260624226422280286404620282620684844628022482644240046246268426068404260882280662484666466008866826404048824082860046666844426622044428646406244602882288888048428246086040668404060006862684408440006622206644868646480486684826046224460648824246880662484820420866824064268682408862686280480464462644264020000000606202002466660022204286028662226620424622864042862806048068660284402840628882404240486462486424264842424608846060066226608040484628402848442000882626600488444060800684828222860484446064846008688000808042260608686282064668226660068606666604608608200688264864448608022682466488408840262620268682006624446268246844022266026026600242220806286000228848026260008008622608084884086666648402488488262226668226886208460006408246268666446488860224624826842226886064402246066266806462204604888026422028200026420684824222880084002420642464808684246268862880428408646864088024622228866682888068202244060804820648268084068008840462208682800200240848226808484668426206882406422080482624002246464264204280404480460828882048864484020286882024420020406800460640208480228204266800846842406820084646422244444080244442262608228488248884000660046626468262086624840848264668600640866622246286804042080668860082806068600648444068228028042040800648282602802264806204626464242466044004024284228408484626806440488646206888404662022866406066008206260204820022688808826646806022088042048464608228442282286440408284668408408426064280822642408240020820040888462488444442080448880884244484800626484806860840004406404224624802000264288444826422622602640888268484062486684604008000228486820648266680022460624648608822240660824662464880608622608224280886680648606426860242202820006048006684426620864004000644806868228404060220424020288662026400644062022444008626206262064408486286262026028662428208604402640246622464848222068640282042600086664268488248408000688000482068200628884664482064484848220286042404860868622248804082640082044204602280046446688644640202626662864888422068846808404866264480202008048068646482220084406864464666280444862882466264668846408824620646008200822622206440248266668840606086286640682882666024084026408622886868604820642220808006680864860282222486268082460804288602024824222046820002200280868082648022640220824680002622026642624868484602864880660662444200062888204600808828024220420600842220200486244462486400406042462824044082462004406488666468468806240448208084882420006028826084622644484082420480864406240040226640440220008000820420008086468446824468860266662600668842668260688462206682664442088622648684668680240822400802002600468828402640840862046648088824066086466826802684064442824488042264046280226468648662284246482882686200022424424844826846846822860200680248806648808460600844440642486680828624062662266880066088820064004228260862266886080008062600424828240802820486240002204462268060604482222602808408060004844808848602620408284846064082264420440266026860884840240206226882828620446044626026602428042886608464602640402608260220066400280662020226642402426628040202246064686606024686604462288404028264646008848680022406686422480246686604268620604642686824442600402800044062404440224228642882064060406404062288442864828204206002042006428028048486028444604488240664004460664862422482288824000046266044688622066604040626822244288204006662020426284626468468624020802404062422608482280804660286802204884066464602206282288202248420800868640648084886248824406628802840424622464226648044204086864660000842808464840206042608024684248620660664048204680426064480028800684466848604668046802220420684822206664820246026480064862868428806682480866842822802224620864486806280606228008822248226882028828822044082446448688682828266024880484422422288266002680426040462406844620468246064622002644208046808048828208226062442222248268060042200446202284088280004866880624280866242202660228406066664846604822046222628026626806262006804444444226646820886024064642444082200226088200604244660660448648244602608204820224608464824808864646482660228088840460824240004888828862480646666840828002660082440822404402080442420060040268086280080620226206244262880284800028664062040484220440844688020000820868880262602606222482662828886408020842444684688062680262408864622466242042666486000466208482420448086282442648640064626822684208220260468682602262842422204662844462826086686682624888488600664462206046640880404828804620884068464800862680666882606226044828086224044460606648026808844886060444820244864882428486024448220462286800624882802408222224806600646442882060004864682846866440608002440842224486264446606080606084608446648084820022848064400822400246406248880408024008024402606626866206822482460060622860808286822268662662060260682860466226428820840864880480886068080488244244466642008208042802088660808060802688642842226086482602266684084808886480804866804648862640600682808648822046488628202486086206880468842026462868808026080680066484000640666824268024800004042028828264606202044048864686004880226666260468644204482646806466404804408226820426064406220246842884466060480462488444480246046088262808828020880244800280888022442864448466604248468246086402406842440820200842284024604266266860888044082846206684268822288868226860266488024284806648448008428848604602404284080448828608206808626620202060684204604688624268080048864484008846462286822224688006006264462820220068426862604648682686248648226206266688282880288462200646840226686880680646848600246628626642466482862082482480606026680822824466482282066828462484042886444006006288448402024826260288226422626020468066466622444846620848200220422244264020802244022224466822682608628288842486620002208044268400086846862646068042644640040424422624082626802680666202260842822640608604428660246006286244620448204086006662808404826002806204680428424664028244428244462664644006208440202044842040066842220200064222002220424404806068222828824248060820264840064288006260060222220688840062260448266406024008686446246422028424408642440688006082006048082286042008006844628406064808888642046622842022800668846482666462048620046606626222482620048682082600444004428420824864668624062080486820086862640840864262602026044808222688484066020468008400866648660086040044680464266042822642682266400804066246220080080844866648286660486286684464840240620606842462208800264008088044884862442862046600828628000266464682022686642006600824464642220802460222264660040486040282240868664244804640640460426482224442800684666604046088668826488406242022660802286688826420226206026226462224228282882484286602288048802422842886688844802242264606620226220684082604848020202888864488666800620264600886662464484868888488602868064446608648464404660086642628824046864800626862868000468648244004226666880662242866228682000402280844664224044000284068680466048284606880402268004244408444448842488648244882822826466486402248404046488448640202800400428426028466464082464840408022228084640226086460822662286468628602840444422262860268648022060442864604488824402642608640442622686020"));
    }

}