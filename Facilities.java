package Facility;
import java.util.Scanner;
interface KLU
{
void Sports();
void Finfo();
void Doffer();
void Boffer();
void Transport();
}
public class Facilities  implements KLU
{
	public void Sports()
	{
		System.out.print("Athletic track\nHockey field\nBadminton Courts -4\nTenni-koit Courts -2\nCricket field with Net practice - 3\nVolleyball Courts -4\nTennis Courts - 2\nHandball Court\nNetball Courts - 2\nThrow ball courts - 2\nBeach Volleyball Court\nFootball field\nBasketball Courts – 2\nKabaddi Courts – 2\nTable Tennis - 6\nChess\nCaroms\nKho Kho Court\nSoft Ball\nArchery\n");
	}
	public void Finfo()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Select The Branch\n");
						System.out.print("1.Bio- Technology (BT)\n2.Civil Engineering (CE)\n3.Computer Science and Engineering (CSE)\n4.Electronics and Communication Engineering(ECE)\n5.Electronics and Computer Engineering (ECM)\n6.Electrical and Electronics Engineering (EEE)\n7.Mechanical Engineering (ME)\n8.Petroleum Engineering (PE)\n");
						x=sc.nextInt();
						switch(x)
			{
							case 1: System.out.print("Kamma Srinivasulu\nTondepu Subbaiah\nTangiri Sudhakar Jhonson\nRonda Srinivasa Reddy\nB Jayakumar Singh");
										break;
							case 2: System.out.print("Vummaneni Ranga Rao\nKonda Rajasekhar Reddy\nChappidi Hanumantha Rao\nAsadi Siva Sankar\nSubrata Goshal");
										break;
							case 3: System.out.print("L.S.S.Reddy\nE.Suresh Babu\nV.Srikanth\nV.Chandra Prakash\nY.Prashanth");
										break;
							case 4: System.out.print("Kodati Satya Prasad\nHabibulla Khan\nV.S.V.Prabhakar\nV.Rajesh\nKotamaraju Sarat Kumar");
										break;
							case 5: System.out.print("Komaragiri Raghava Rao\nN.Venkatram\nD.Haritha\nAruna Kumari Devarakonda\nJ.K.R.Sastry");
										break;
							case 6: System.out.print("M.Rama Moorthy\nA.Anand Kumar\nObbu Chandra Sekhar\nP.Linga Reddy\nG.Kesava Rao");
										break;
							case 7: System.out.print("Adusumilli Srinath\nAnne Jagadeesh\nkamineni Jayanendra Babu\nKavuluri Venkata Ramana\nKonijeti Rama Krishna");
										break;
							case 8: System.out.print("Kethineni Chandrika\nDau Tapas Kumar Dora\nSukanta DE\nShirsendu Banerjee\nDadi Naga Ramesh");
										break;

			}
	}
	public void Doffer()
	{
		System.out.print("1.UG\n2.PG\nResearch(Ph.D)\nM.Tech(By Research) leading to Ph.D\nM.Phil\n");
	}
	public void Boffer()
	{
		System.out.print("1.Bio- Technology (BT)\n2.Civil Engineering (CE)\n3.Computer Science and Engineering (CSE)\n4.Electronics and Communication Engineering(ECE)\n5.Electronics and Computer Engineering (ECM)\n6.Electrical and Electronics Engineering (EEE)\n7.Mechanical Engineering (ME)\n8.Petroleum Engineering (PE)\n");
	}
	public void Transport()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The institution runs 60 buses covering all the important points in Vijayawada City, "
+"Mangalagiri, Guntur,Tenali&Amaravathi towns with a total seating capacity of 4000 students in two shifts.\n"
+"Ambulance Service is available 24 hrs in case of any emergency in the institute / hostels\n"
+"Transportation is available for conducting industrial tours and visits etc.\n"
+"Regular transport facility available up to 8:10 PM.");
System.out.println("_______________________TIMINGS______________________________");
System.out.println("1.VIJAYAWADA ,2.GUNTUR,3.TENALI");
System.out.println("_____________________________________________________________");
int v;
v=sc.nextInt();
switch(v)
{
case 1:
System.out.println("VIJAYAWADA\n"
+"1-A	Gosala - Edupugallu - Gangur - Penamaluru	7.50 AM	5.20 PM\n"
+"1-B	Seetapuram Colony - Poranki - Tadigadapa - VRSE	8.05 AM	5.20 PM\n"
+"1-C	KamayyaThopu - Pappula Mill - Ashok Nagar - Chowdary Pet 	8.10 AM	5.20 PM\n"
+"1-D	Old Check Post - Auto Nagar Gate - High School Road	8.10 AM	5.20 PM\n"
+"2-A	E.S.I - Gunadala - Padavalarevu - Machavaram Down - AnjaneyaSwamy Temple - NimmaThota	8.00 AM	5.20 PM\n"
+"2-BC	SRR. College - Maruthi Nagar - Chuttugunta - Sitarampuram - Kothavantena - Vijaya Talkies - Rammandiram - Challapalli Bungalow	8.10 AM	5.20 PM\n"
+"3-A	I.T.I bus stop - Sunnapubattilu - Siddartha Arts College - Chennupati Petrol Bunk	8.05 AM	5.20 PM\n"
+"3-B	Jemmichettu-Madhu Gardens-MoghalRajpuram-Sikamani Centre-Red Circle-Fire station-American Hospital	8.10 AM	5.20 PM\n"
+"4-A	Gannavaram - Kesarapalli - Gudavalli - Nidamanuru - Enikepadu	7.40 AM	5.20 PM\n"
+"4-B	SER Centre - Prasadampadu - Ramavarappadu - Bunk Centre - Currency Nagar 	8.05 AM	5.20 PM\n"
+"4-C	NTR Health University - Bank Colony - Vinayak Theatre - Sri Nagar Colony - Ramesh Hospital	8.10 AM	5.20 PM\n"
+"4-D	Stella College - Talwakers - Screw Bridge 02	8.15 AM	5.20 PM\n"
+"5-A	Eenadu - Varun Motors -P &T Quarters - D.V. Manor - Kandhari - Veternary Hospital	8.15 AM	5.20 PM\n"
+"5-B	Postal colony - Patamata - N.T.R Circle - Screw-bridge 01 - Balajinagar - Ice Factory	8.15 AM	5.20 PM\n"
+"6-B	Raghavendra Theatre - Prabhas College - Ambedkar Statue - Gynkana Grounds - Eluru Locks	8.05 AM	5.20 PM\n"
+"6-A	Nunna - Prakash Nagar - Ajith Singh Nagar - Budameru Bridge	7.50 AM	5.20 PM\n"
+"6-C	SangeethKalasala (Food Junction)	8.10 AM	5.20 PM\n"
+"6-D	Madhura Nagar - Kothavanthena - Inox (Urvasi Theatre) - Alankar Theatre - Manipal Hospital - Highway Towers - Aravinda School	8.10 AM	5.20 PM\n"
+"7-A	Sai Baba Temple - A colony - Ibrahimpatnam - Tummalapalem - Khazipeta - Guntupalli - Nallakunta	7.40 AM	5.20 PM\n"
+"7-B	Sitara Theatre - Chittinagar - SrinivasMahal - Panja Centre - K.R. Market - Government Hospital (Old)	8.05 AM	5.20 PM\n"
+"7-C	Gollapudi - Mile Roy Centre - VenkateshFoundary - Swathi Theatre	8.05 AM	5.20 PM\n"
+"7-D	Sivalayam - Joji Nagar Church - Raja kumari Theatre	8.05 AM	5.20 PM\n");
break;
case 2:
System.out.println("GUNTUR\n"
+"8-A	ChillisDhaba - Nagaralu - Medical Hostel - Ala Hospital - Rama Buildings	7.30 AM	5.20 PM\n"
+"8-B	S.V.N. Colony - Hanumaiah Company - Collector Office - 3 Bommalu Centre	7.30 AM	5.20 PM\n"
+"8-C	GujjanaGundla - Chalapathi School - Guest House - Vidya Nagar	7.30 AM	5.20 PM\n"
+"8-D	Sai Baba Road - Koritapadu	7.30 AM	5.20 PM\n"
+"8-E	Rajendra Nagar - VenkateswaraSwamy Temple - Gardens - N.T.R. Stadium	7.30 AM	5.20 PM\n"
+"8-F	Seetharamaiah High School - Baker's Fun - K F C - Union Bank	7.30 AM	5.20 PM\n"
+"8-G	Syamala Nagar - Recruitment Office - PattabhiPuram - Jute Mill	7.30 AM	5.20 PM\n"
+"8-H	Housing Board - A.T. Agraharam - Chuttugunta	7.30 AM	5.20 PM\n"
+"8-I	Lodge - Sankar Vilas - Old Bus Stand	7.30 AM	5.20 PM\n"
+"8-J	I.T.C - Vijaya Lakshmi Theatre - Ethu Road - Market - N.T.R. Circle	7.30 AM	5.20 PM\n"
+"8-K	N.T.R. Circle - R.T.C. Bus Stand 	7.30 AM	5.20 PM\n"
+"8-L	Padmaja Petrol Bunk - PedaKakani - Highway	7.30 AM	5.20 PM\n");
break;
case 3:
System.out.println("TENALI\n"
+"9-A	Chinnaravuri Park - Sai Baba Temple - KothaVanthena	7.30 AM	5.20 PM\n"
+"9-B	Montessori (Krishna Temple) - SivajiBomma - ChakaliCheruvu - A.S.N. College - Samrat Hotel	7.30 AM	5.20 PM\n"
+"9-C	Chenchu Pet - Station Road - V.S.R. College - Nandi Velugu - Duggirala - RevendraPadu - Pedavadlapudi - Mangalagiri Bye Pass	7.30 AM	5.20 PM\n");
break;
}
	}
}
