 import java.util.Scanner;

public class UnitConverter 
{
 public static void main(String[] args)
 {
  int typeconvert;
  int miscunit;
  int scienceunit;
  double number;
  int selectedunit;
  
  Scanner input = new Scanner(System.in);
   
  System.out.println("Input a number you want to convert : ");
  number = input.nextDouble();

  
  System.out.println("1 - Science");
  System.out.println("2 - Misc");

  
  System.out.println("Select Beween 1 - 2 to convert");
  typeconvert = input.nextInt();
  
  
  switch (typeconvert)
  {
     
      case 1:
           System.out.println("You have selected Sience units");
           System.out.println("1 - Power ");
           System.out.println("2 - Work ");
           System.out.println("3 - Force ");
           System.out.println("4 - Preasure");
           System.out.println("select Units you want to convert: ");
           scienceunit = input.nextInt();
           switch(scienceunit)
           {
               
               case 1:
                   System.out.println("You have selected 1-Power convertion");
                   System.out.println("1 - W");
                   System.out.println("2 - KW");
                   System.out.println("3 - MW");
                   System.out.println("4 - kcal/s");
                   System.out.println("5 - kcal/h");
                   System.out.println("6 - HP");
                   System.out.println("7 - PS");
                   System.out.println("8 - BTU/h");
                   System.out.println("9 - TR");
                   System.out.println("10 - dBm");
                   System.out.println("Please Selec Unit you want to convert: ");
                   selectedunit = input.nextInt();
                   switch (selectedunit)
                   {
                   
                      case 1:
                         System.out.println("You have selected 1-W.");
                          System.out.println("W = "+number);
                         System.out.println("kW = "+number/1000);
                         System.out.println("MW = "+number*1000);
                     System.out.println("kcal/s = "+number*0.00023900573613767);
                     System.out.println("kcal/h = "+number*0.86042065174077);
                         System.out.println("HP = "+number*0.0013410220895631);
                         System.out.println("PS = "+number*0.00136);
                      System.out.println("BTU/h = "+number/3.41);
                         System.out.println("TR = "+number/3516.853);
                        System.out.println("dBm = "+number*30);
                                          break;
                         
                      
                      
                      case 2:
                         System.out.println("You have selected 2-kW.");
                         System.out.println("kW = "+number);
                          System.out.println("W = "+number*1000);
                         System.out.println("MW = "+number*1e+6);
                     System.out.println("kcal/s = "+number*0.23900573613767);
                     System.out.println("kcal/h = "+number*860.42065174077);
                         System.out.println("HP = "+number*1.341);
                         System.out.println("PS = "+number*1.359619);
                      System.out.println("BTU/h = "+number*3412.1416351331);
                      System.out.println("TR is = "+number/3.517);
                        System.out.println("dBm = "+number*60);
                                          break;
                           
                      
                      
                      case 3:
                         System.out.println("You have selected 3-MW.");
                         System.out.println("MW = "+number);
                          System.out.println("W = "+number/1000);
                         System.out.println("kW = "+number/1e+6);
                     System.out.println("kcal/s = "+number*239.00573613767);
                     System.out.println("kcal/h = "+number*860420.65174077);
                         System.out.println("HP = "+number*0.00074569987158227);
                         System.out.println("PS = "+number*1359.6216173);
                      System.out.println("BTU/h = "+number*3412141.6351331);
                         System.out.println("TR = "+number/3.517e+6);
                        System.out.println("dBm = "+number*90);
                                          break;
                      
                       
                       
                      case 4:
                         System.out.println("You have selected 4-kcal/s.");
                         System.out.println("kcal/h = "+number);
                              System.out.println("W = "+number*0.00023900573613767);
                             System.out.println("kW = "+number*4.184);
                             System.out.println("MW = "+number*0.004184);
                         System.out.println("kcal/h = "+number*3600);
                             System.out.println("HP = "+number*0.17578842017208);
                             System.out.println("PS = "+number*1359.61931);
                          System.out.println("BTU/h = "+number*14276.401);
                             System.out.println("TR = "+number*0.84054804015296);
                            System.out.println("dBm = "+number*4184);
                                          break;    
                       
                       
                       
                      case 5:
                         System.out.println("You have selected 5-kcal/h.");
                         System.out.println("kcal/h = "+number);
                              System.out.println("W = "+number*0.86042065174077);
                             System.out.println("kW = "+number*0.00116222222);
                             System.out.println("MW = "+number*1.16222222E-6);
                         System.out.println("kcal/s = "+number/3600);
                             System.out.println("HP = "+number*641.87380619861);
                             System.out.println("PS = "+number*0.00033047222047666);
                          System.out.println("BTU/h = "+number*3.966);
                             System.out.println("TR = "+number*3025.9729503365);
                            System.out.println("dBm = "+number*30.652892);
                                          break;
                      
                        
                        
                      case 6:
                         System.out.println("You have selected 6-HP.");
                         System.out.println("HP = "+number);
                          System.out.println("W = "+number*745.7);
                         System.out.println("kW = "+number*1.341);
                         System.out.println("MW = "+number*745699.872);
                     System.out.println("kcal/s = "+number*2.3448032982792);
                     System.out.println("kcal/h = "+number*8441.2918899451);
                         System.out.println("PS = "+number*1.014);
                      System.out.println("BTU/h = "+number*2545.458268);
                         System.out.println("TR = "+number/4.716);
                        System.out.println("dBm = "+number*58.725641);
                                          break;                            
                           
                          
                          
                      case 7:
                         System.out.println("You have selected 7-PS.");
                         System.out.println("PS = "+number);
                          System.out.println("W = "+number*735.499);
                         System.out.println("kW = "+number/1.36);
                         System.out.println("MW = "+number*735498.75);
                     System.out.println("kcal/s = "+number*0.17578842017208);
                     System.out.println("kcal/h = "+number*860.42065174077);
                         System.out.println("HP = "+number/1.014);
                      System.out.println("BTU/h = "+number*1);
                         System.out.println("TR = "+number/4.782);
                       System.out.println("dBm  = "+number*24.66973);
                                          break;
                           
                          
                          
                      case 8:
                         System.out.println("You have selected 8-BTU/h.");
                         System.out.println("BTU/h = "+number);
                             System.out.println("W = "+number*3.41);
                            System.out.println("kW = "+number*0.00029307107);
                            System.out.println("MW = "+number*3412141.6351331);
                        System.out.println("kcal/s = "+number/14276.401);
                        System.out.println("kcal/h = "+number/3.966);
                            System.out.println("PS = "+number*2544.434187);
                            System.out.println("HP = "+number*0.00039301477869125);
                            System.out.println("TR = "+number*12000.000545943);
                           System.out.println("dBm = "+number*24.66973);
                                          break;
                           
                          
                          
                      case 9:
                         System.out.println("You have selected 9-TR.");
                         System.out.println("TR = "+number);
                          System.out.println("W = "+number*3516.853);
                         System.out.println("kW = "+number*3.517);
                         System.out.println("MW = "+number*3.517e+6);
                     System.out.println("kcal/s = "+number*0.84054804015296);
                     System.out.println("kcal/h = "+number*3025.9729503365);
                         System.out.println("PS = "+number*4.782);
                         System.out.println("HP = "+number*4.716);																																			
                      System.out.println("BTU/h = "+number/2.204);							
                                          break;
                              
                          
                          
                      case 10:
                         System.out.println("You have selected 10-dBm.");
                         System.out.println("dBm = "+number);
                           System.out.println("W = "+number*0.001259);
                          System.out.println("kW = "+number*0.000001);
                          System.out.println("MW = "+number*1.2589E-9);
                      System.out.println("kcal/s = "+number*3.00898E-7);
                      System.out.println("kcal/h = "+number*0.001083);
                          System.out.println("PS = "+number*0.000002);
                          System.out.println("HP = "+number*0.004296);
                       System.out.println("BTU/h = "+number*0.004296);
                          System.out.println("TR = "+number*3.5821E-7);
                         break;
                             }
                             break;
                   
    
                              case 2: 
                                 System.out.println("You have selected 2-Work convertion.");
                                 System.out.println("1 - J");
                                 System.out.println("2 - KJ");
                                 System.out.println("3 - cal");
                                 System.out.println("4 - kcal(cal)");
                                 System.out.println("5 - kW.h");
                                 System.out.println("6 - kgf.m");
                                 System.out.println("7 - in.lbf");
                                 System.out.println("8 - ft.lbf");
                                 System.out.println("9 - BTU");
                                 System.out.println("10 - toe");
                                 System.out.println("Please Selec UnitNumber you want to convert: ");
                                 selectedunit = input.nextInt();
                                 switch (selectedunit)
                                  {
                       
                                    case 1:
                                       System.out.println("You have seleceted 1-J.");
                                       System.out.println("J = "+number);
                                      System.out.println("kJ = "+number/1000);
                                     System.out.println("cal = "+number/4.184);
                               System.out.println("kcal(Cal) = "+number/4184);
                                    System.out.println("kW.h = "+number/3.6e+6);
                                   System.out.println("kgf.m = "+number/0.10197162);
                                  System.out.println("in.lbf = "+number*8.8507457913272);
                                  System.out.println("ft.lbf = "+number/1.356);
                                     System.out.println("BTU = "+number/1055.056);
                                     System.out.println("toe = "+number*2.3885E-11);
                                                        break;  


                         
                                    case 2:
                                       System.out.println("You have selsected 2-KJ.");
                                       System.out.println("KJ = "+number);
                                        System.out.println("J = "+number/1000);
                                      System.out.println("cal = "+number/239.005736);
                                System.out.println("kcal(Cal) = "+number/0.239006);
                                     System.out.println("kW.h = "+number/0.000278);
                                    System.out.println("kgf.m = "+number/101.971621);
                                   System.out.println("in.lbf = "+number/8850.74579);
                                   System.out.println("ft.lbf = "+number/737.562141);
                                      System.out.println("BTU = "+number/0.947817);
                                      System.out.println("toe = "+number/2.3885E-8);
                                                        break;
                           
                           
                           
                                    case 3:
                                       System.out.println("You have seleceted 3-cal.");
                                       System.out.println("cal = "+number);
                                         System.out.println("J = "+number*4184);
                                        System.out.println("kJ = "+number*0.004184);
                                 System.out.println("kcal(Cal) = "+number/1000);
                                      System.out.println("kW.h = "+number*1.1622222222222E-6);
                                     System.out.println("kgf.m = "+number/0.00234228);
                                    System.out.println("in.lbf = "+number*37.031520390913);
                                    System.out.println("ft.lbf = "+number*3.0859600325761);
                                       System.out.println("BTU = "+number*252.1644007218);
                                       System.out.println("toe = "+number*10006692.160612);
                                                        break;
                           
                          
                          
                                    case 4:
                                       System.out.println("You have seleceted 4-kcal(Cal).");
                                       System.out.println("kcal(Cal) = "+number);
                                               System.out.println("J = "+number*4184);
                                              System.out.println("kJ = "+number*4.184);
                                             System.out.println("cal = "+number*1000);
                                            System.out.println("kW.h = "+number/860.421);
                                           System.out.println("kgf.m = "+number/426.93478405);
                                          System.out.println("in.lbf = "+number*37031.520390913);
                                          System.out.println("ft.lbf = "+number*3085.96);
                                             System.out.println("BTU = "+number*3.966);
                                             System.out.println("toe = "+number*9.9933123148944E-8);
                                                        break;
                           
                          
                          
                                    case 5:
                                       System.out.println("You have been seleceted 5-kW.h.");
                                       System.out.println("kW.h = "+number);
                                          System.out.println("J = "+number*3.6e+6);
                                         System.out.println("kJ = "+number*3600);
                                        System.out.println("cal = "+number*860.42);
                                  System.out.println("kcal(Cal) = "+number*860.421);
                                      System.out.println("kgf.m = "+number/0.00000272);
                                     System.out.println("in.lbf = "+number*2655200);
                                     System.out.println("ft.lbf = "+number*2.655e+6);
                                        System.out.println("BTU = "+number*3412.142);
                                        System.out.println("toe = "+number*8.5984522785899E-5);
                                                        break;
                           
                          
                          
                                    case 6:
                                       System.out.println("You have been seleceted 6-kgf.m.");
                                       System.out.println("kgf.m = "+number);
                                           System.out.println("J = "+number/9.80665);
                                          System.out.println("kJ = "+number/101.9716213);
                                         System.out.println("cal = "+number/0.00234228);
                                   System.out.println("kcal(Cal) = "+number/426.934784);
                                        System.out.println("kW.h = "+number/0.000002721);
                                      System.out.println("in.lbf = "+number*86.796);
                                      System.out.println("ft.lbf = "+number*7.23);
                                         System.out.println("BTU = "+number*107.59);
                                         System.out.println("toe = "+number*7.23);
                                                        break;
                           
                          
                          
                                    case 7:
                                       System.out.println("You have selecetd 7-in.lbf.");
                                       System.out.println("in.lbf = "+number);
                                            System.out.println("J = "+number*0.11298482902762);
                                           System.out.println("kJ = "+number*0.00113558179483314);
                                          System.out.println("cal = "+number*0.32404826680961);
                                    System.out.println("kcal(Cal) = "+number*0.00032404826680961);
                                         System.out.println("kW.h = "+number*2655200);
                                        System.out.println("kgf.m = "+number*0.0225212466370609);
                                      System.out.println("ft.lbf = "+number*0.083333333333333);
                                          System.out.println("BTU = "+number*0.00011);
                                          System.out.println("toe = "+number*0.083);
                                                        break;
                           
                      
                          
                                    case 8:
                                       System.out.println("You have selecetd 8-ft.lbf.");
                                       System.out.println("ft.lbf = "+number);
                                            System.out.println("J = "+number*1.356);
                                           System.out.println("kJ = "+number/737.562);
                                          System.out.println("cal = "+number*3.0880252065941);
                                    System.out.println("kcal(Cal) = "+number/3085.96);
                                        System.out.println("kgf.m = "+number*7.233014);
                                         System.out.println("kW.h = "+number/2.655e+6);
                                       System.out.println("in.lbf = "+number*12);
                                          System.out.println("BTU = "+number/778.169);
                                          System.out.println("toe = "+number*1.00);
                                                        break; 
                           
                         
                         
                                    case 9:
                                       System.out.println("You have selecetd 9-BTU.");
                                       System.out.println("BTU = "+number);
                                         System.out.println("J = "+number*105.056);
                                        System.out.println("kJ = "+number*1.055);
                                       System.out.println("cal = "+number*252.1644007218);
                                 System.out.println("kcal(Cal) = "+number/3.966);
                                     System.out.println("kgf.m = "+number/107.58576068);
                                      System.out.println("kW.h = "+number/3412.142);
                                    System.out.println("ft.lbf = "+number*778.169);
                                    System.out.println("in.lbf = "+number*9338.0311471916);
                                       System.out.println("toe = "+number*39683207.193278);
                                                        break;
                           
                         
                         
                                    case 10:
                                       System.out.println("You have selecetd 10-toe.");
                                       System.out.println("toe = "+number);
                                         System.out.println("J = "+number*4.1870E+10);
                                        System.out.println("kJ = "+number*41868000);
                                       System.out.println("cal = "+number*10006692160.612);
                                 System.out.println("kcal(Cal) = "+number*10006692.160612);
                                     System.out.println("kgf.m = "+number*7.23);
                                      System.out.println("kW.h = "+number*11630);
                                    System.out.println("ft.lbf = "+number*3.0880E+10);
                                    System.out.println("in.lbf = "+number*3.7060E+11);
                                       System.out.println("BTU = "+number*39683207.193278);
                                       break;
                                           } 
                                           break;
           
                                          case 3:
                                             System.out.println("You have selected 3-Force convertion.");
                                             System.out.println("1 - dyn");
                                             System.out.println("2 - N");
                                             System.out.println("3 - daN");
                                             System.out.println("4 - kN");
                                             System.out.println("5 - kgf");
                                             System.out.println("6 - lbf");
                                             System.out.println("7 - kip");
                                             System.out.println("Please Selec UnitNumber you want to convert: ");
                                             typeconvert = input.nextInt();
                                             switch (typeconvert)
                                             {
                                                 
                                              case 1:
                                                 System.out.println("You havebeen selected 1-dyn.");
                                                 System.out.println("dyn = "+number);
                                                   System.out.println("N = "+number/100000);
                                                 System.out.println("daN = "+number*100000);
                                                  System.out.println("kN = "+number/1e+8);
                                                 System.out.println("kgf = "+number/980665);
                                                 System.out.println("lbf = "+number/444822.16);
                                                 System.out.println("kip = "+number*2.2480894309971E-9);
                                                                  break; 
                           
                           
                           
                                              case 2:
                                                 System.out.println("You havebeen selected 2-N.");
                                                 System.out.println("N = "+number);
                                               System.out.println("dyn = "+number*100000);
                                               System.out.println("daN = "+number*0.1);
                                                System.out.println("kN = "+number*0.001);
                                               System.out.println("kgf = "+number/9.807);
                                               System.out.println("lbf = "+number/4.448);
                                               System.out.println("kip = "+number*0.00022480894309971);
                                                                  break;
                           
                           
                           
                                              case 3:
                                                 System.out.println("You havebeen selected 3-daN.");
                                                 System.out.println("daN = "+number);
                                                 System.out.println("dyn = "+number*100000);
                                                   System.out.println("N = "+number*10);
                                                  System.out.println("kN = "+number*0.01);
                                                 System.out.println("kgf = "+number*0.980665);
                                                 System.out.println("lbf = "+number*0.44482216152605);
                                                 System.out.println("kip = "+number*0.0022480894309971);
                                                                  break;
                           
                           
                           
                                              case 4:
                                                 System.out.println("You havebeen selected 4-kN.");
                                                 System.out.println("kN = "+number);
                                                System.out.println("dyn = "+number*100000);
                                                  System.out.println("N = "+number*1000);
                                                System.out.println("daN = "+number*100);
                                                System.out.println("kgf = "+number/9.806);
                                                System.out.println("lbf = "+number/4.448);
                                                System.out.println("kip = "+number*0.22480894309971);
                                                                  break;
                           
                           
                           
                                              case 5:
                                                 System.out.println("You havebeen selected 5-kgf.");
                                                 System.out.println("kgf = "+number);
                                                 System.out.println("dyn = "+number*980665);
                                                   System.out.println("N = "+number*9.807);
                                                 System.out.println("daN = "+number*0.980665);
                                                  System.out.println("kN = "+number*9.807);
                                                 System.out.println("lbf = "+number*2.205);
                                                 System.out.println("kip = "+number*0.0022046226218488);
                                                                  break;
                           
                           
                        
                                              case 6:
                                                 System.out.println("You havebeen selected 5-lbf.");
                                                 System.out.println("lbf = "+number);
                                                 System.out.println("dyn = "+number*444822.16);
                                                   System.out.println("N = "+number*4.448);
                                                 System.out.println("daN = "+number*0.444822161526095);
                                                  System.out.println("kn = "+number*4.448);
                                                 System.out.println("kgf = "+number/2.205);
                                                 System.out.println("kip = "+number*0.001);
                                                                  break;
                           
                           
                           
                                              case 7:
                                                 System.out.println("You havebeen selected 7-kip");
                                                 System.out.println("kip = "+number);
                                                 System.out.println("dyn = "+number*2.2480894387096);
                                                   System.out.println("N = "+number/9.80665);
                                                 System.out.println("daN = "+number*0.0022480894387096);
                                                  System.out.println("kn = "+number*0.22480894387096);
                                                 System.out.println("kgf = "+number*0.0022046226294122);
                                                 System.out.println("lbf = "+number*1000);
                                                 break;
                                                     }
                                                     break;
                             
      
                       
                                                     case 4:
                                                        System.out.println("You have selected 4-Pressure convertion");
                                                        System.out.println("1 - atm");
                                                        System.out.println("2 - Pa");
                                                        System.out.println("3 - hPa(mbar)");
                                                        System.out.println("4 - kPa");
                                                        System.out.println("5 - MPa");
                                                        System.out.println("6 - bar");
                                                        System.out.println("7 - psi(lbf/in2)");
                                                        System.out.println("8 - Psf(lbf/ft2)");
                                                        System.out.println("9 - ksi");
                                                        System.out.println("10 - kgf/cm2");
                                                        System.out.println("11 - kgf/m2");
                                                        System.out.println("12 - mmHg(Torr)");
                                                        System.out.println("13 - cmHg");
                                                        System.out.println("14 - inchHg");
                                                        System.out.println("15 - mmH2O");
                                                        System.out.println("16 - cmH2O");
                                                        System.out.println("17 - inchH2O");
                                                        System.out.println("18 - mTorr"); 
                                                        System.out.println("Please Select UnitNumber you want to convert: ");
                                                        typeconvert = input.nextInt();
                                                        switch (typeconvert)
                                                        {
                                                         case 1:
                                                            System.out.println("You have selected 1-atm.");
                                                            System.out.println("atm = "+number);
                                                             System.out.println("Pa = "+number*101325);
                                                            System.out.println("hPa = "+number*1013.25);
                                                            System.out.println("kPa = "+number*101.325);
                                                            System.out.println("MPa = "+number*0.101325);
                                                            System.out.println("bar = "+number*1.01325);
                                                   System.out.println("psi(lbf/in2) = "+number*14.695964);
                                                   System.out.println("psf(lbf/ft2) = "+number*2116.22);
                                                            System.out.println("ksi = "+number*0.014695948803581);
                                                        System.out.println("kgf/cm2 = "+number*1.033);
                                                         System.out.println("kgf/m2 = "+number*10332.275);
                                                           System.out.println("mmHg = "+number*760);
                                                           System.out.println("cmHg = "+number*0.013157896570442);
                                                         System.out.println("inchHg = "+number*0.033421060942512);
                                                          System.out.println("mmH2O = "+number*10332);
                                                          System.out.println("cmH2O = "+number*1033.2559007503);
                                                        System.out.println("inchH2O = "+number*406.78);
                                                         System.out.println("mTorr = "+number*0.13332237);
                                                                             break;
                          
                          
                          
                                                         case 2:
                                                            System.out.println("You have selected 2-Pa.");
                                                            System.out.println("Pa = "+number);
                                                           System.out.println("atm = "+number/101325);
                                                           System.out.println("hPa = "+number*100);
                                                           System.out.println("kPa = "+number/1000);
                                                           System.out.println("MPa = "+number*0.000001);
                                                           System.out.println("bar = "+number*1.0E-5);
                                                  System.out.println("psi(lbf/in2) = "+number*0.00014503773);
                                                  System.out.println("psf(lbf/ft2) = "+number*0.020885);
                                                           System.out.println("ksi = "+number*1.4503773800722E-7);
                                                       System.out.println("kgf/cm2 = "+number*98066.5);
                                                        System.out.println("kgf/m2 = "+number*0.10197162129779);
                                                          System.out.println("mmHg = "+number*0.00750062);
                                                          System.out.println("cmHg = "+number*1333.22387);
                                                        System.out.println("inchHg = "+number*3386.389);
                                                         System.out.println("mmH2O = "+number*9.80638);
                                                         System.out.println("cmH2O = "+number*0.010197442889221);
                                                       System.out.println("inchH2O = "+number*0.0040146);
                                                         System.out.println("mTorr = "+number*7.5006167382113);
                                                                             break;
                          
                          
                          
                                                         case 3:    
                                                            System.out.println("You have selected 3-hPa.");
                                                            System.out.println("hPa = "+number);
                                                            System.out.println("atm = "+number*0.000987);
                                                             System.out.println("Pa = "+number*100);
                                                            System.out.println("kPa = "+number*0.1);
                                                            System.out.println("MPa = "+number*0.0001);
                                                            System.out.println("bar = "+number*0.001);
                                                   System.out.println("psi(lbf/in2) = "+number*0.014503773800722);
                                                   System.out.println("psf(lbf/ft2) = "+number*2.0885434272991);
                                                            System.out.println("ksi = "+number*1.4503773800722E-5);
                                                        System.out.println("kgf/cm2 = "+number*0.0010197162129779);
                                                         System.out.println("kgf/m2 = "+number*0.101972);
                                                           System.out.println("mmHg = "+number*0.75006157818041);
                                                           System.out.println("cmHg = "+number*13.3322387);
                                                         System.out.println("inchHg = "+number*33.86389);
                                                          System.out.println("mmH2O = "+number/0.10197);
                                                          System.out.println("cmH2O = "+number*0.0197442889221);
                                                        System.out.println("inchH2O = "+number*2.49089);
                                                          System.out.println("mTorr = "+number*750.06167);
                                                                             break;
                          
                          
                          
                                                         case 4:
                                                            System.out.println("You have selected 4-kPa.");
                                                            System.out.println("hPa = "+number);
                                                            System.out.println("atm = "+number/101.325);
                                                             System.out.println("Pa = "+number*1000);
                                                            System.out.println("hPa = "+number*10);
                                                            System.out.println("MPa = "+number/1000);
                                                            System.out.println("bar = "+number/100);
                                                   System.out.println("psi(lbf/in2) = "+number/6.895);
                                                   System.out.println("psf(lbf/ft2) = "+number*20.885434272991);
                                                            System.out.println("ksi = "+number/6894.757);
                                                        System.out.println("kgf/cm2 = "+number/98.066);
                                                         System.out.println("kgf/m2 = "+number*101.972);
                                                           System.out.println("mmHg = "+number*7.501);
                                                           System.out.println("cmHg = "+number*7.501);
                                                         System.out.println("inchHg = "+number/3.386);
                                                          System.out.println("mmH2O = "+number*101.97442889221);
                                                          System.out.println("cmH2O = "+number*10.197);
                                                        System.out.println("inchH2O = "+number*4.019);
                                                         System.out.println("mTorr  = "+number*7.501);
                                                                             break;
                          
                          
                          
                                                         case 5:
                                                            System.out.println("You have selected 5-MPa.");
                                                            System.out.println("atm = "+number*9.869);
                                                             System.out.println("Pa = "+number*1e+6);
                                                            System.out.println("hPa = "+number*10000);
                                                            System.out.println("kPa = "+number*1000);
                                                            System.out.println("bar = "+number*10);
                                                   System.out.println("psi(lbf/in2) = "+number*146.038);
                                                   System.out.println("psf(lbf/ft2) = "+number*20885.434272991);
                                                            System.out.println("ksi = "+number/6.895);
                                                        System.out.println("kgf/cm2 = "+number*10.197);
                                                         System.out.println("kgf/m2 = "+number*101971.621);
                                                           System.out.println("mmHg = "+number*7500.616);
                                                           System.out.println("cmHg = "+number*7500.617);
                                                         System.out.println("inchHg = "+number*295.3);
                                                          System.out.println("mmH2O = "+number*101971.6213);
                                                          System.out.println("cmH2O = "+number*10197.162);
                                                        System.out.println("inchH2O = "+number*0.000249);
                                                          System.out.println("mTorr = "+number*7500.617);
                                                                             break;
                          
                          
                          
                                                         case 6:
                                                            System.out.println("You have selected 6-bar.");
                                                            System.out.println("bar = "+number);
                                                            System.out.println("atm = "+number*1.013);
                                                             System.out.println("Pa = "+number*100000);
                                                            System.out.println("hPa = "+number*1000);
                                                            System.out.println("kPa = "+number*100);
                                                            System.out.println("MPa = "+number*10);
                                                   System.out.println("psi(lbf/in2) = "+number*14.504);
                                                   System.out.println("psf(lbf/ft2) = "+number*2088.5434272991);
                                                            System.out.println("ksi = "+number/68.948);
                                                        System.out.println("kgf/cm2 = "+number*1.02);
                                                         System.out.println("kgf/m2 = "+number*10197.165);
                                                           System.out.println("mmHg = "+number*750.062);
                                                           System.out.println("cmHg = "+number*750.062);
                                                         System.out.println("inchHg = "+number*29.53);
                                                          System.out.println("mmH2O = "+number*10197.442889221);
                                                          System.out.println("cmH2O = "+number*1019.716);
                                                        System.out.println("inchH2O = "+number*401.46308);
                                                       System.out.println("mTorr is = "+number*750.062);
                                                                             break;
                            
                          
                              
                                                         case 7:                           
                                                             System.out.println("You have selected 7--psi(lbf/in2).");
                                                            System.out.println("psi(lbf/in2) = "+number);
                                                                     System.out.println("atm = "+number/14.696);
                                                                      System.out.println("Pa = "+number*6894.757);
                                                                     System.out.println("hPa = "+number*0.014503773800722);
                                                                     System.out.println("kPa = "+number*6.895);
                                                                     System.out.println("MPa = "+number/145.038);
                                                                     System.out.println("bar = "+number/14.504);
                                                            System.out.println("psf(lbf/ft2) = "+number*143.99999999967);
                                                                     System.out.println("ksi = "+number/1000);
                                                                 System.out.println("kgf/cm2 = "+number/14.223);
                                                                  System.out.println("kgf/m2 = "+number*703.07);
                                                                    System.out.println("mmHg = "+number*51.715);
                                                                    System.out.println("cmHg = "+number*51.715);
                                                                  System.out.println("inchHg = "+number*2.036);
                                                                   System.out.println("mmH2O = "+number*703.08893732448);
                                                                   System.out.println("cmH2O = "+number*70.307);
                                                                 System.out.println("inchH2O = "+number*27.708);
                                                                   System.out.println("mTorr = "+number*51.715);
                                                                                      break; 
                          
                          
                          
                                                         case 8:
                                                            System.out.println("You have selected 8-psf(lbf/ft2).");
                                                            System.out.println("psf(lbf/ft2) = "+number);
                                                                     System.out.println("atm = "+number*0.0004725414151394);
                                                                      System.out.println("Pa = "+number*47.880258889);
                                                                     System.out.println("hPa = "+number*0.47880258889);
                                                                     System.out.println("kPa = "+number*0.047880258889);
                                                                     System.out.println("MPa = "+number*4.7880258889E-5);
                                                                     System.out.println("bar = "+number*0.00047880258889);
                                                            System.out.println("psi(lbf/in2) = "+number*0.0069444444444606);
                                                                     System.out.println("ksi = "+number*6.9444444444606E-6);
                                                                 System.out.println("kgf/cm2 = "+number*0.00048824276270649);
                                                                  System.out.println("kgf/m2 = "+number*4.8824);
                                                                    System.out.println("mmHg = "+number*0.35913);
                                                                    System.out.println("cmHg = "+number*27.844959508068);
                                                                  System.out.println("inchHg = "+number*70.726);
                                                                   System.out.println("mmH2O = "+number*4.8824);
                                                                   System.out.println("cmH2O = "+number*2.0481050494597);
                                                                 System.out.println("inchH2O = "+number*0.19222);
                                                                   System.out.println("mTorr = "+number*359.13147);
                                                                                        break;
                          
                          
                          
                                                         case 9:
                                                            System.out.println("You have selected 9-ksi.");
                                                            System.out.println("ksi = "+number);
                                                            System.out.println("atm = "+number*68.046);
                                                             System.out.println("Pa = "+number*6.89e+6);
                                                            System.out.println("hPa = "+number*68947.5728);
                                                            System.out.println("kPa = "+number*6894.757);
                                                            System.out.println("MPa = "+number*6.895);
                                                            System.out.println("bar = "+number*68.948);
                                                   System.out.println("psi(lbf/in2) = "+number*1000);
                                                   System.out.println("psf(lbf/ft2) = "+number*143999.99999967);
                                                        System.out.println("kgf/cm2 = "+number*70.307);
                                                         System.out.println("kgf/m2 = "+number*703069.579);
                                                           System.out.println("mmHg = "+number*51714.925);
                                                           System.out.println("cmHg = "+number*51714933);
                                                         System.out.println("inchHg = "+number*2036.021);
                                                          System.out.println("mmH2O = "+number*0.14503773772954);
                                                          System.out.println("cmH2O = "+number*70306.958);
                                                        System.out.println("inchH2O = "+number*1.4503773800722E-7);
                                                          System.out.println("mTorr = "+number*51714.933);
                                                                             break;
                          
                           
                           
                                                         case 10:
                                                            System.out.println("You have selected 10-kgf/cm2.");
                                                            System.out.println("kgf/cm2 = "+number);
                                                                System.out.println("atm = "+number/1.033);
                                                                 System.out.println("Pa = "+number*98066.5);
                                                                System.out.println("hPa = "+number*0.0010197162129776);
                                                                System.out.println("kPa = "+number*98.066);
                                                                System.out.println("MPa = "+number/10.197);
                                                                System.out.println("bar = "+number/1.02);
                                                       System.out.println("psi(lbf/in2) = "+number*14.223);
                                                       System.out.println("psf(lbf/ft2) = "+number*4.8824);
                                                                System.out.println("ksi = "+number/70.307);
                                                             System.out.println("kgf/m2 = "+number*10000);
                                                               System.out.println("mmHg = "+number*735.559);
                                                               System.out.println("cmHg = "+number*735.559);
                                                             System.out.println("inchHg = "+number*28.959);
                                                              System.out.println("mmH2O = "+number*0.0001);
                                                              System.out.println("cmH2O = "+number*1000);
                                                            System.out.println("inchH2O = "+number*393.700696);
                                                              System.out.println("mTorr = "+number*735.559);
                                                                             break;  
                           
                           
                           
                                                         case 11:
                                                            System.out.println("You have selected 11-kgf/m2.");
                                                            System.out.println("kgf/m2 = "+number);
                                                               System.out.println("atm = "+number/10332.275);
                                                                System.out.println("Pa = "+number*9.807);
                                                               System.out.println("hPa = "+number*0.098067);
                                                               System.out.println("kPa = "+number/101.972);
                                                               System.out.println("MPa = "+number/101971.621);
                                                               System.out.println("bar = "+number/10197.162);
                                                      System.out.println("psi(lbf/in2) = "+number/703.07);
                                                      System.out.println("psf(lbf/ft2) = "+number*4.8824);
                                                               System.out.println("ksi = "+number/703069.579);
                                                           System.out.println("kgf/cm2 = "+number/10000);
                                                              System.out.println("mmHg = "+number/13.595);
                                                              System.out.println("cmHg = "+number/13.595);
                                                            System.out.println("inchHg = "+number/345.316);
                                                             System.out.println("mmH2O = "+number*1);
                                                             System.out.println("cmH2O = "+number/10);
                                                           System.out.println("inchH2O = "+number*0.03937);
                                                             System.out.println("mTorr = "+number*73.555956);
                                                                             break; 
                          
                          
                          
                                                         case 12:
                                                            System.out.println("You have selected 12-mmHg.");
                                                            System.out.println("mmHg = "+number);
                                                             System.out.println("atm = "+number/760);
                                                              System.out.println("Pa = "+number*133.322);
                                                             System.out.println("hPa = "+number*1.33322387);
                                                             System.out.println("kPa = "+number/7.501);
                                                             System.out.println("MPa = "+number/7500.616);
                                                             System.out.println("bar = "+number/750.062);
                                                    System.out.println("psi(lbf/in2) = "+number/51.715);
                                                    System.out.println("psf(lbf/ft2) = "+number*2.7844959508068);
                                                             System.out.println("ksi = "+number/51714.925);
                                                         System.out.println("kgf/cm2 = "+number/735.559);
                                                          System.out.println("kgf/m2 = "+number*13.595);
                                                            System.out.println("cmHg = "+number*1);
                                                          System.out.println("inchHg = "+number/25.4);
                                                           System.out.println("mmH2O = "+number*13.595474272871);
                                                           System.out.println("cmH2O = "+number*1.36);
                                                         System.out.println("inchH2O = "+number*1.8683);
                                                           System.out.println("mTorr = "+number*1);
                                                                             break;   
                          
                          
                          
                                                         case 13:
                                                            System.out.println("You have selected 13-cmHg.");
                                                            System.out.println("cmHg = "+number);
                                                             System.out.println("atm = "+number/760);
                                                              System.out.println("Pa = "+number*133.322);
                                                             System.out.println("hPa = "+number*13.3322387);
                                                             System.out.println("kPa = "+number/7.501);
                                                             System.out.println("MPa = "+number/7500.617);
                                                             System.out.println("bar = "+number/750.062);
                                                    System.out.println("psi(lbf/in2) = "+number/51.715);
                                                    System.out.println("psf()lbf/ft2 = "+number*27.844959508068);
                                                             System.out.println("ksi = "+number/51714.933);
                                                         System.out.println("kgf/cm2 = "+number/735.559);
                                                          System.out.println("kgf/m2 = "+number*13.595);
                                                            System.out.println("mmHg = "+number/1);
                                                          System.out.println("inchHg = "+number/25.4);
                                                           System.out.println("mmH2O = "+number*135.95474272871);
                                                           System.out.println("cmH2O = "+number*1.36);
                                                         System.out.println("inchH2O = "+number*13.5954742728771);
                                                           System.out.println("mTorr = "+number*10);
                                                                             break;
                          
                          
                          
                                                         case 14:
                                                            System.out.println("You have selected 14-inchHg.");
                                                            System.out.println("inchHg = "+number);
                                                               System.out.println("atm = "+number/29.921);
                                                                System.out.println("Pa = "+number*3386.389);
                                                               System.out.println("hPa = "+number*33.86389);
                                                               System.out.println("kPa = "+number*3.386);
                                                               System.out.println("MPa = "+number/295.3);
                                                               System.out.println("bar = "+number/29.53);
                                                      System.out.println("psi(lbf/in2) = "+number/2.036);
                                                      System.out.println("psf(lbf/ft2) = "+number*70.72620488228);
                                                               System.out.println("ksi = "+number/2036.021);
                                                           System.out.println("kgf/cm2 = "+number/28.959);
                                                            System.out.println("kgf/m2 = "+number*345.316);
                                                              System.out.println("mmHg = "+number*25.4);
                                                              System.out.println("cmHg = "+number*25.4);
                                                             System.out.println("mmH2O = "+number*345.32508428187);
                                                             System.out.println("cmH2O = "+number*34.532);
                                                           System.out.println("inchH2O = "+number*13.609);
                                                             System.out.println("mTorr = "+number*25.4);
                                                                             break;
                          
                          
                          
                                                         case 15:
                                                            System.out.println("You have selected 15-mmH2O.");
                                                            System.out.println("mmH20 = "+number);
                                                              System.out.println("atm = "+number*10332);
                                                               System.out.println("Pa = "+number/0.10197);
                                                              System.out.println("hPa = "+number*0.098067);
                                                              System.out.println("kPa = "+number*0.00980638);
                                                              System.out.println("MPa = "+number/10.197);
                                                              System.out.println("bar = "+number/10197);
                                                     System.out.println("psi(lbf/in2) = "+number*0.0014223);
                                                     System.out.println("psf(lbf/ft2) = "+number*0.20482);
                                                              System.out.println("ksi = "+number*0.000001);
                                                          System.out.println("kgf/cm2 = "+number*0.0001);
                                                           System.out.println("kgf/m2 = "+number*1);
                                                             System.out.println("mmHg = "+number*13.595);
                                                             System.out.println("cmHg = "+number*135.95474272871);
                                                           System.out.println("inchHg = "+number*345.32);
                                                            System.out.println("cmH2O = "+number*0.1);
                                                          System.out.println("inchH2O = "+number*25.400);
                                                            System.out.println("mTorr = "+number*0.0980638);
                                                                             break; 
                          
                          
                          
                                                         case 16:
                                                            System.out.println("You have selected 16-cmH20.");
                                                            System.out.println("cmH20 = "+number);
                                                              System.out.println("atm = "+number/1033.227);
                                                               System.out.println("Pa = "+number*98.066);
                                                              System.out.println("hPa = "+number*0.980638);
                                                              System.out.println("kPa = "+number/10.197);
                                                              System.out.println("MPa = "+number/10197.162);
                                                              System.out.println("bar = "+number/1019.716);
                                                     System.out.println("psi(lbf/in2) = "+number/70.307);
                                                     System.out.println("psf(lbf/ft2) = "+number*2.0481050494597);
                                                              System.out.println("ksi = "+number/70306.958);
                                                          System.out.println("kgf/cm2 = "+number/1000);
                                                           System.out.println("kgf/m2 = "+number/10);
                                                             System.out.println("mmHg = "+number/1.36);
                                                             System.out.println("cmHg = "+number*0.073556);
                                                           System.out.println("inchHg = "+number/34.532);
                                                            System.out.println("mmH2O = "+number*10);
                                                          System.out.println("inchH2O = "+number/2.537);
                                                            System.out.println("mTorr = "+number*735.559733);
                                                                             break;
                          
                          
                          
                                                         case 17:
                                                            System.out.println("You have selected 17-inchH2O.");
                                                            System.out.println("inchH2O = "+number);
                                                                System.out.println("atm = "+number*406.78);
                                                                 System.out.println("Pa = "+number/0.0040146);
                                                                System.out.println("hPa = "+number*2.490891);
                                                                System.out.println("kPa = "+number*0.249083);
                                                                System.out.println("MPa = "+number*0.000249);
                                                                System.out.println("bar = "+number/402.46);
                                                       System.out.println("psi(lbf/in2) = "+number/27.708);
                                                       System.out.println("psf(lbf.ft2) = "+number*5.2023);
                                                                System.out.println("ksi = "+number*0.000036);
                                                            System.out.println("kgf/cm2 = "+number*0.00254);
                                                             System.out.println("kgf/m2 = "+number*25.400006);
                                                               System.out.println("mmHg = "+number*1.866);
                                                               System.out.println("cmHg = "+number*13.595474272871);
                                                             System.out.println("inchHg = "+number*13.595);
                                                              System.out.println("mmH2O = "+number*25.39999469733);
                                                              System.out.println("cmH2O = "+number*2.537);
                                                              System.out.println("mTorr = "+number*1868.32172);
                                                                             break;
                          
                         
                         
                                                         case 18:
                                                            System.out.println("You have selected 18mTorr.");
                                                            System.out.println("mTorr = "+number*0.000001);
                                                              System.out.println("atm = "+number*0.133322);
                                                               System.out.println("Pa = "+number*0.001333);
                                                              System.out.println("hPa = "+number*0.001333);
                                                              System.out.println("kPa = "+number*0.000133);
                                                              System.out.println("MPa = "+number*1.3332E-7);
                                                              System.out.println("bar = "+number*0.000001);
                                                     System.out.println("psi(lbf/in2) = "+number*0.000019);
                                                     System.out.println("psf(lbf/ft2) = "+number*0.002784);
                                                              System.out.println("ksi = "+number*1.9337E-8);
                                                          System.out.println("kgf/cm2 = "+number*0.000001);
                                                           System.out.println("kgf/m2 = "+number*0.013595);
                                                             System.out.println("mmHg = "+number*0.001);
                                                             System.out.println("cmHg = "+number*0.0001);
                                                           System.out.println("inchHg = "+number*0.000039);
                                                            System.out.println("mmH2O = "+number*0.013595);
                                                            System.out.println("cmH2O = "+number*0.00136);
                                                          System.out.println("inchH2O = "+number*0.000535);
                                                          break;               
                                                              }
                                                              }
                                                              break;
                                                              
                                                              
                                                              
                                                                                                                     
                                                              
                                
                                                              
                                                              
                                                              
                                                              
                                                              
           
          case 2:
             System.out.println("You have selected 2-Misc units");   
             System.out.println("1 - Angle ");
             System.out.println("2 - Data ");
             System.out.println("3 - Fuel ");
             System.out.println("4 - Cooking ");
             System.out.println("select UnitsNumber you qant to convert: ");
             miscunit = input.nextInt();
            switch (miscunit)
             {
                
               case 1:
                   System.out.println("You have selected 1-Angle convertion");
                   System.out.println("1 - rad");
                   System.out.println("2 - deg(')");
                   System.out.println("3 - min(')");
                   System.out.println("4 - sec(')");
                   System.out.println("5 - deg min sec");
                   System.out.println("6 - grad"); 
                   System.out.println("7 - %");
                   System.out.println("8 - circle");
                   System.out.println("9 - 6400 mil");
                   System.out.println("10 - 6000 mil");
                   System.out.println("Please select UnitNumber you want to convert: ");
                   selectedunit = input.nextInt();
                   switch (selectedunit)
                   {
                       
                       case 1:
                         System.out.println("You have selected 1-rad.");
                         System.out.println("rad = "+number);
                      System.out.println("deg(') = "+number*180);
                      System.out.println("min(') = "+number*10800);
                      System.out.println("sec(') = "+number* 206264.8062471);
                 System.out.println("deg min sec = "+number/57_17_44.8063);
                        System.out.println("grad = "+number*200); 
                           System.out.println("% = "+number*155.740772);
                      System.out.println("circle = "+number*0.159155);
                    System.out.println("6400 mil = "+number*1018.59155);
                    System.out.println("6000 mil = "+number*954.929659);
                                    break;
                         
                         
                         
                       case 2:
                         System.out.println("You have selected 2-deg(').");
                         System.out.println("deg(') = "+number);
                            System.out.println("rad = "+number*0.017453);
                         System.out.println("min(') = "+number*60);
                         System.out.println("sec(') = "+number*3600);
                    System.out.println("deg min sec = "+number/1_00_00);
                           System.out.println("grad = "+number*1.111111); 
                              System.out.println("% = "+number*1.745506);
                         System.out.println("circle = "+number*1.745506);
                       System.out.println("6400 mil = "+number*17.777778);
                       System.out.println("6000 mil = "+number*16.666667);
                                       break;
                         
                         
                         
                       case 3:
                         System.out.println("You have selected 3-min(').");
                         System.out.println("min(') = "+number);
                            System.out.println("rad = "+number*0.000291);
                         System.out.println("deg(') = "+number*0.016667);
                         System.out.println("sec(') = "+number*60);
                    System.out.println("deg min sec = "+number/0_01_00);
                           System.out.println("grad = "+number*0.018519); 
                              System.out.println("% = "+number*0.029089);
                         System.out.println("circle = "+number*0.000046);
                       System.out.println("6400 mil = "+number*0.296296);
                       System.out.println("6000 mil = "+number*0.277778);
                                       break;
                         
                         
                         
                       case 4:
                         System.out.println("You have selected 4-sec(').");
                         System.out.println("sec(') = "+number);
                            System.out.println("rad = "+number*0.000005);
                         System.out.println("deg(') = "+number*0.000278);
                         System.out.println("min(') = "+number*0.016667);
                    System.out.println("deg min sec = "+number/0_00_01);
                           System.out.println("grad = "+number*0.000309); 
                              System.out.println("% = "+number*0.000485);
                         System.out.println("circle = "+number*7.716E-7);
                       System.out.println("6400 mil = "+number*0.004938);
                       System.out.println("6000 mil = "+number*0.00463);
                                       break;
                         
                         
                         
                       case 5:
                         System.out.println("You have selected 5-deg min sec.");
                         System.out.println("deg min sec = "+number);
                                 System.out.println("rad = "+number*0.017453);
                              System.out.println("deg(') = "+number*1);
                              System.out.println("min(') = "+number*60);
                              System.out.println("sec(') = "+number*3600);
                                System.out.println("grad = "+number*1.111111); 
                                   System.out.println("% = "+number*1.745506);
                              System.out.println("circle = "+number*0.002778);
                            System.out.println("6400 mil = "+number*17.777778);
                            System.out.println("6000 mil = "+number*16.666667);
                                            break;
                         
                         
                         
                       case 6:
                         System.out.println("You have selected 6-grad.");
                         System.out.println("grad = "+number);
                          System.out.println("rad = "+number*0.015708);
                       System.out.println("deg(') = "+number*0.9);
                       System.out.println("min(') = "+number*54);
                       System.out.println("sec(') = "+number*3240);
                  System.out.println("deg min sec = "+number/0_54_00); 
                            System.out.println("% = "+number*1.570926);
                       System.out.println("circle = "+number*0.0025);
                     System.out.println("6400 mil = "+number*16);
                     System.out.println("6000 mil = "+number*815);
                                     break;
                         
                         
                         
                       case 7:
                         System.out.println("You have selected 7-%.");
                         System.out.println("% = "+number);
                       System.out.println("rad = "+number*0.01);
                    System.out.println("deg(') = "+number*0.572939);
                    System.out.println("min(') = "+number*834.376322);
                    System.out.println("sec(') = "+number*82062.57931);
               System.out.println("deg min sec = "+number/0_34_22.5793); 
                      System.out.println("grad = "+number*0.636599);
                    System.out.println("circle = "+number*0.001591);
                  System.out.println("6400 mil = "+number*10.185577);
                  System.out.println("6000 mil = "+number*9.548978);
                                  break;
                         
                         
                         
                       case 8:
                         System.out.println("You have selected 8-circle.");
                         System.out.println("circle = "+number);
                            System.out.println("rad = "+number*6.283185);
                         System.out.println("deg(') = "+number*360);
                         System.out.println("min(') = "+number*21600);
                         System.out.println("sec(') = "+number*1296000);
                    System.out.println("deg min sec = "+number/0_00_00); 
                           System.out.println("grad = "+number*400);
                              System.out.println("% = "+number*0);
                       System.out.println("6400 mil = "+number*6400);
                       System.out.println("6000 mil = "+number*6000);
                                   break;
                          
                         
                         
                       case 9:
                         System.out.println("You have selected 9-6400 mil.");
                         System.out.println("6400 mil = "+number);
                              System.out.println("rad = "+number*0.000982);
                           System.out.println("deg(') = "+number*0.05625);
                           System.out.println("min(') = "+number*3.375);
                           System.out.println("sec(') = "+number*202.5);
                      System.out.println("deg min sec = "+number/0_03_22.5); 
                             System.out.println("grad = "+number*0.0625);
                                System.out.println("% = "+number*0.098175);
                           System.out.println("circle = "+number*0.000156);
                         System.out.println("6000 mil = "+number*0.9375);
                                      break;
                         
                         
                         
                       case 10: 
                         System.out.println("You have selected 10-6000 mil.");
                         System.out.println("6000 mil = "+number);
                              System.out.println("rad = "+number*0.001047);
                           System.out.println("deg(') = "+number*0.06);
                           System.out.println("min(') = "+number*3.6);
                           System.out.println("sec(') = "+number*216);
                      System.out.println("deg min sec = "+number/0_03_36); 
                             System.out.println("grad = "+number*0.066667);
                                System.out.println("% = "+number*0.10472);
                           System.out.println("circle = "+number*0.000167);
                         System.out.println("6400 mil = "+number*1.066667);
                         break;
                             }
                             break;
                   
                   
                              case 2:
                                System.out.println("You have selected 2-Data convertion");
                                System.out.println("1 - bit");
                                System.out.println("2 - Byte");
                                System.out.println("3 - kB");
                                System.out.println("4 - KiB");
                                System.out.println("5 - MiB");
                                System.out.println("6 - GiB"); 
                                System.out.println("7 - TiB");
                                System.out.println("8 - PiB");
                                System.out.println("9 - kbit/s");
                                System.out.println("10 - Mbit/s");
                                System.out.println("11 - Gbit/s");
                                System.out.println("12 - packet");
                                System.out.println("13 - block");
                                System.out.println("Please select UnitNumber you want to convert: ");
                                selectedunit = input.nextInt();
                                switch (selectedunit)
                                   {
                                    
                                     case 1: 
                                       System.out.println("You have selected 1-bit.");
                                       System.out.println("bit = "+number);
                                      System.out.println("Byte = "+number*0.125);
                                        System.out.println("kB = "+number*0.000125);
                                       System.out.println("KiB = "+number*0.000122);
                                       System.out.println("MiB = "+number*1.1921E-7);
                                       System.out.println("GiB = "+number*1.1642E-10); 
                                       System.out.println("TiB = "+number*1.1369E-13);
                                       System.out.println("PiB = "+number*1.1102E-16);
                                    System.out.println("kbit/s = "+number*0.001);
                                    System.out.println("Mbit/s = "+number*0.000001);
                                    System.out.println("Gbit/s = "+number*1.0E-9);
                                    System.out.println("packet = "+number*0.000977);
                                     System.out.println("block = "+number*0.000244);
                                                     break;
                         
                         
                         
                                     case 2:
                                       System.out.println("You have selected 2-Byte.");
                                       System.out.println("Byte = "+number);
                                        System.out.println("bit = "+number*8);
                                         System.out.println("kB = "+number*0.001);
                                        System.out.println("KiB = "+number*0.000977);
                                        System.out.println("MiB = "+number*9.5367E-7);
                                        System.out.println("GiB = "+number*9.3132E-10); 
                                        System.out.println("TiB = "+number*9.0949E-13);
                                        System.out.println("PiB = "+number*8.8818E-16);
                                     System.out.println("kbit/s = "+number*0.008);
                                     System.out.println("Mbit/s = "+number*0.000008);
                                     System.out.println("Gbit/s = "+number*8.0E-9);
                                     System.out.println("packet = "+number*0.007812);
                                      System.out.println("block = "+number*0.001953);
                                                     break;
                         
                         
                         
                                     case 3:
                                       System.out.println("You have selected 3-kB.");
                                       System.out.println("kB = "+number);
                                      System.out.println("bit = "+number*8000);
                                     System.out.println("Byte = "+number*1000);
                                      System.out.println("KiB = "+number*0.976562);
                                      System.out.println("MiB = "+number*0.000954);
                                      System.out.println("GiB = "+number*9.3132E-7); 
                                      System.out.println("TiB = "+number*9.0949E-10);
                                      System.out.println("PiB = "+number*8.8818E-13);
                                   System.out.println("kbit/s = "+number*8);
                                   System.out.println("Mbit/s = "+number*0.008);
                                   System.out.println("Gbit/s = "+number*0.000008);
                                   System.out.println("packet = "+number*7.8125);
                                    System.out.println("block = "+number*1.953125);
                                                     break;
                         
                         
                         
                                     case 4:
                                       System.out.println("You have selected 4-kiB.");
                                       System.out.println("kiB = "+number);
                                       System.out.println("bit = "+number*8192);
                                      System.out.println("Byte = "+number*1024);
                                        System.out.println("kB = "+number*1.024);
                                       System.out.println("MiB = "+number*0.000977);
                                       System.out.println("GiB = "+number*9.5367E-7); 
                                       System.out.println("TiB = "+number*9.3132E-10);
                                       System.out.println("PiB = "+number*9.0949E-13);
                                    System.out.println("kbit/s = "+number*8.192);
                                    System.out.println("Mbit/s = "+number*0.008192);
                                    System.out.println("Gbit/s = "+number*0.000008);
                                    System.out.println("packet = "+number*8);
                                     System.out.println("block = "+number*2);
                                                    break;
                         
                         
                         
                                     case 5:
                                       System.out.println("You have selected 5-MiB.");
                                       System.out.println("MiB = "+number);
                                       System.out.println("bit = "+number*88388608);
                                      System.out.println("Byte = "+number*1048576);
                                        System.out.println("kB = "+number*1048.576);
                                       System.out.println("kiB = "+number*1024);
                                       System.out.println("GiB = "+number*0.000977); 
                                       System.out.println("TiB = "+number*9.5367E-7);
                                       System.out.println("PiB = "+number*9.3132E-10);
                                    System.out.println("kbit/s = "+number*8388.608);
                                    System.out.println("Mbit/s = "+number*8.388608);
                                    System.out.println("Gbit/s = "+number*0.008389);
                                    System.out.println("packet = "+number*8192);
                                     System.out.println("block = "+number*2048);
                                                       break;
                         
                         
                         
                                     case 6:
                                       System.out.println("You have selected 6-GiB.");
                                       System.out.println("GiM = "+number);
                                       System.out.println("bit = "+number*8589934592.1);
                                      System.out.println("Byte = "+number*1073741824);
                                        System.out.println("kB = "+number*1073741.82);
                                       System.out.println("kiB = "+number*1048576);
                                       System.out.println("MiB = "+number*1024); 
                                       System.out.println("TiB = "+number*0.000977);
                                       System.out.println("PiB = "+number*9.5367E-7);
                                    System.out.println("kbit/s = "+number*8589934.59);
                                    System.out.println("Mbit/s = "+number*8589.93459);
                                    System.out.println("Gbit/s = "+number*8.589935);
                                    System.out.println("packet = "+number*8388608);
                                     System.out.println("block = "+number*2097152);
                                                        break;
                         
                         
                         
                                     case 7:
                                       System.out.println("You have selected 7-TiB.");
                                       System.out.println("TiB = "+number);
                                       System.out.println("bit = "+number*8.7960E+12);
                                      System.out.println("Byte = "+number*1.1000E+12);
                                        System.out.println("kB = "+number*1099511628);
                                       System.out.println("kiB = "+number*1073741824);
                                       System.out.println("MiB = "+number*1048576); 
                                       System.out.println("GiB = "+number*1024);
                                       System.out.println("PiB = "+number*0.000977);
                                    System.out.println("kbit/s = "+number*8796093022.1);
                                    System.out.println("Mbit/s = "+number*8796093.02);
                                    System.out.println("Gbit/s = "+number*8796.09302);
                                    System.out.println("packet = "+number*8589934592.1);
                                     System.out.println("block = "+number*2147483648.1);
                                                           break;
                         
                         
                         
                                     case 8:
                                       System.out.println("You have selected 8-PiB.");
                                       System.out.println("PiB = "+number);
                                       System.out.println("bit = "+number*9.0070E+15);
                                      System.out.println("Byte = "+number*1.1260E+15);
                                        System.out.println("kB = "+number*1.1260E+12);
                                       System.out.println("kiB = "+number*1.1000E+12);
                                       System.out.println("MiB = "+number*1073741824); 
                                       System.out.println("GiB = "+number*1048576);
                                       System.out.println("TiB = "+number*1024);
                                    System.out.println("kbit/s = "+number*9.0070E+12);
                                    System.out.println("Mbit/s = "+number*9007199255.1);
                                    System.out.println("Gbit/s = "+number*9007199.25);
                                    System.out.println("packet = "+number*8.7960E+12);
                                     System.out.println("block = "+number*2.1990E+12);
                                                           break;
                         
                         
                         
                                     case 9:
                                       System.out.println("You have selected 9-kbit/s.");
                                       System.out.println("kbit/s = "+number);
                                          System.out.println("bit = "+number*1000);
                                         System.out.println("Byte = "+number*125);
                                           System.out.println("kB = "+number*0.125);
                                          System.out.println("kiB = "+number*0.12207);
                                          System.out.println("MiB = "+number*0.000119); 
                                          System.out.println("GiB = "+number*1.1642E-7);
                                          System.out.println("TiB = "+number*1.1369E-7);
                                          System.out.println("PiB = "+number*1.1102E-13);
                                       System.out.println("Mbit/s = "+number*0.001);
                                       System.out.println("Gbit/s = "+number*0.000001);
                                       System.out.println("packet = "+number*0.976562);
                                        System.out.println("block = "+number*0.244141);
                                                            break;
                         
                         
                         
                                     case 10:
                                       System.out.println("You have selected 10-Mbit/s.");
                                       System.out.println("Mbit/s = "+number);
                                          System.out.println("bit = "+number*1000000);
                                         System.out.println("Byte = "+number*125000);
                                           System.out.println("kB = "+number*125);
                                          System.out.println("kiB = "+number*122.070312);
                                          System.out.println("MiB = "+number*0.119209); 
                                          System.out.println("GiB = "+number*0.000116);
                                          System.out.println("TiB = "+number*1.1369E-7);
                                          System.out.println("PiB = "+number*1.1102E-10);
                                       System.out.println("kbit/s = "+number*1000);
                                       System.out.println("Gbit/s = "+number*0.001);
                                       System.out.println("packet = "+number*976.5625);
                                        System.out.println("block = "+number*244.140625);
                                                            break;
                         
                         
                         
                                     case 11:
                                       System.out.println("You have selected 11-Gbit/s.");
                                       System.out.println("Gbit/s = "+number);
                                          System.out.println("bit = "+number*1000000000);
                                         System.out.println("Byte = "+number*125000000);
                                           System.out.println("kB = "+number*125000);
                                          System.out.println("kiB = "+number*122070.312);
                                          System.out.println("MiB = "+number*119.20929); 
                                          System.out.println("GiB = "+number*0.116415);
                                          System.out.println("TiB = "+number*0.000114);
                                          System.out.println("PiB = "+number*1.1102E-7);
                                       System.out.println("kbit/s = "+number*1000000);
                                       System.out.println("Mbit/s = "+number*1000);
                                       System.out.println("packet = "+number*976562.2);
                                        System.out.println("block = "+number*244140625);
                                                             break;
                         
                         
                         
                                     case 12:
                                       System.out.println("You have selected 12-packet.");
                                       System.out.println("packet = "+number);
                                          System.out.println("bit = "+number*1024);
                                         System.out.println("Byte = "+number*128);
                                           System.out.println("kB = "+number*0.128);
                                          System.out.println("kiB = "+number*0.125);
                                          System.out.println("MiB = "+number*0.000122); 
                                          System.out.println("GiB = "+number*1.1921E-7);
                                          System.out.println("TiB = "+number*1.1642E-10);
                                          System.out.println("PiB = "+number*1.1369E-13);
                                       System.out.println("kbit/s = "+number*1.024);
                                       System.out.println("Mbit/s = "+number*0.001024);
                                       System.out.println("Gbit/s = "+number*0.000001);
                                        System.out.println("block = "+number*0.25);
                                                         break;
                         
                         
                         
                                     case 13:
                                       System.out.println("You have selected 13-block.");
                                       System.out.println("block = "+number);
                                         System.out.println("bit = "+number*4096);
                                        System.out.println("Byte = "+number*512);
                                          System.out.println("kB = "+number*0.512);
                                         System.out.println("kiB = "+number*0.05);
                                         System.out.println("MiB = "+number*0.000488); 
                                         System.out.println("GiB = "+number*4.7684E-7);
                                         System.out.println("TiB = "+number*4.6566E-10);
                                         System.out.println("PiB = "+number*4.5475E-13);
                                      System.out.println("kbit/s = "+number*4096);
                                      System.out.println("Mbit/s = "+number*0.004096);
                                      System.out.println("Gbit/s = "+number*0.00004);
                                      System.out.println("packet = "+number*4);
                                      break;
                                          }
                                          break;
                                          
                   
                                           case 3:
                                             System.out.println("You have selected 3-Fuel convertion");
                                             System.out.println("1 - km/l");
                                             System.out.println("2 - mi/l");
                                             System.out.println("3 - km/gal(US)");
                                             System.out.println("4 - mi/gal(US)");
                                             System.out.println("5 - mi/gal(UK)");
                                             System.out.println("6 - l/100km");
                                             System.out.println("Please select UnitNumber you want to convert: ");
                                             selectedunit = input.nextInt();
                                             switch (selectedunit)
                                             {
                                                 
                                               case 1:
                                                 System.out.println("You have selected 1-km/l.");
                                                 System.out.println("km/l = "+number);
                                                 System.out.println("mi/l = "+number*0.621371);
                                           System.out.println("km/gal(US) = "+number*3.785412);
                                           System.out.println("mi/gal(US) = "+number*2.352146);
                                           System.out.println("mi/gal(UK) = "+number*2.824811);
                                              System.out.println("l/100km = "+number*100);   
                                                                   break;
                         
                         
                         
                                               case 2:
                                                 System.out.println("You have selected 2-mi/l.");
                                                 System.out.println("mi/l = "+number);
                                                 System.out.println("km/l = "+number*1.609344);
                                           System.out.println("km/gal(US) = "+number*6.09203);
                                           System.out.println("mi/gal(US) = "+number*3.785412);
                                           System.out.println("mi/gal(UK) = "+number*4.546092);
                                              System.out.println("l/100km = "+number*62.137119);   
                                                                 break;
                         
                         
                         
                                               case 3:
                                                  System.out.println("You have selected 3-km/gal(US).");
                                                  System.out.println("km/gal(US) = "+number);
                                                        System.out.println("km/l = "+number*0.264172);
                                                        System.out.println("mi/l = "+number*0.164149);
                                                  System.out.println("mi/gal(US) = "+number*0.621371);
                                                  System.out.println("mi/gal(UK) = "+number*0.746236);
                                                     System.out.println("l/100km = "+number*378.5412);   
                                                                          break;
                         
                         
                         
                                               case 4:
                                                 System.out.println("You have selected 4-mi/gal(US).");
                                                 System.out.println("mi/gal(US) = "+number);
                                                       System.out.println("km/l = "+number*0.425144);
                                                       System.out.println("mi/l = "+number*0.264172);
                                                 System.out.println("km/gal(US) = "+number*1.609344);
                                                 System.out.println("mi/gal(UK) = "+number*1.20095);
                                                    System.out.println("l/100km = "+number*235.214597);   
                                                                              break;
                         
                         
                         
                                               case 5:
                                                 System.out.println("You have selected 5-mi/gal(UK).");
                                                 System.out.println("mi/gal(UK) = "+number);
                                                       System.out.println("km/l = "+number*0.354006);
                                                       System.out.println("mi/l = "+number*0.219969);
                                                 System.out.println("km/gal(US) = "+number*1.340059);
                                                 System.out.println("mi/gal(US) = "+number*0.832674);
                                                    System.out.println("l/100km = "+number*282.481061);   
                                                                         break;
                         
                         
                         
                                               case 6:
                                                 System.out.println("You have selected 6-mi/l/100km).");
                                                 System.out.println("l/100km = "+number);
                                                    System.out.println("km/l = "+number*100);
                                                    System.out.println("mi/l = "+number*62.137119);
                                              System.out.println("km/gal(US) = "+number*378.5412);
                                              System.out.println("mi/gal(US) = "+number*235.214597);
                                              System.out.println("mi/gal(UK) = "+number*282.481061);   
                                              break;
                                                  }
                                                  break;
                                                  
                   
                                                    case 4:
                                                      System.out.println("You have selected 4-Cooking convertion");
                                                      System.out.println("1 - ml(cc)");
                                                      System.out.println("2 - teaspoon");
                                                      System.out.println("3 - tablespoon");
                                                      System.out.println("4 - cup(US)");
                                                      System.out.println("5 - cup(UK)");
                                                      System.out.println("6 - cup(metric)");
                                                      System.out.println("7 - fl oz(US)"); 
                                                      System.out.println("8 - fl oz(UK)");
                                                      System.out.println("9 - pt(US)");
                                                      System.out.println("10 - pt(UK)");
                                                      System.out.println("Please select UnitNumber you want to convert: ");
                                                      selectedunit = input.nextInt();
                                                      switch (selectedunit)
                                                      {
                                                          
                                                        case 1:
                                                          System.out.println("You have selected 1-ml(cc).");
                                                          System.out.println("ml(cc) = "+number);
                                                        System.out.println("teaspoon = "+number*0.202884);
                                                      System.out.println("tablespoon = "+number*0.067628);
                                                         System.out.println("cup(US) = "+number*0.004227);
                                                         System.out.println("cup(UK) = "+number*0.003521);
                                                     System.out.println("cup(metric) = "+number*0.004);
                                                       System.out.println("fl oz(US) = "+number*0.033814); 
                                                       System.out.println("fl oz(UK) = "+number*0.035195);
                                                          System.out.println("pt(US) = "+number*0.002113);
                                                          System.out.println("pt(UK) = "+number*0.00176);
                                                                                break;
                   
                   
                   
                       
                                                        case 2:
                                                          System.out.println("You have selected 2-teaspoon.");
                                                          System.out.println("teaspoon = "+number);
                                                            System.out.println("ml(cc) = "+number*4.9289222);
                                                        System.out.println("tablespoon = "+number*0.333333);
                                                           System.out.println("cup(US) = "+number*0.20833);
                                                           System.out.println("cup(UK) = "+number*0.017355);
                                                       System.out.println("cup(metric) = "+number*0.019716);
                                                         System.out.println("fl oz(US) = "+number*0.166667); 
                                                         System.out.println("fl oz(UK) = "+number*0.173474);
                                                            System.out.println("pt(US) = "+number*0.010417);
                                                            System.out.println("pt(UK) = "+number*0.008674);
                                                                                 break;
                   
                   
                   
                                                        case 3:
                                                          System.out.println("You have selected 3-tablespoon.");
                                                          System.out.println("tablespoon = "+number);
                                                              System.out.println("ml(cc) = "+number*14.786765);
                                                            System.out.println("teaspoon = "+number*3);
                                                             System.out.println("cup(US) = "+number*0.0625);
                                                             System.out.println("cup(UK) = "+number*0.052066);
                                                         System.out.println("cup(metric) = "+number*0.059147);
                                                           System.out.println("fl oz(US) = "+number*0.5); 
                                                           System.out.println("fl oz(UK) = "+number*0.520421);
                                                              System.out.println("pt(US) = "+number*0.03125);
                                                              System.out.println("pt(UK) = "+number*0.026021);
                                                                                  break;
                   
                   
                   
                                                        case 4:
                                                          System.out.println("You have selected 4-cup(US).");
                                                          System.out.println("cup(US) = "+number);
                                                           System.out.println("ml(cc) = "+number*236.588236);
                                                         System.out.println("teaspoon = "+number*48);
                                                       System.out.println("tablespoon = "+number*16);
                                                          System.out.println("cup(UK) = "+number*0.833057);
                                                      System.out.println("cup(metric) = "+number*0.946353);
                                                        System.out.println("fl oz(US) = "+number*8); 
                                                        System.out.println("fl oz(UK) = "+number*8.326742);
                                                           System.out.println("pt(US) = "+number*0.5);
                                                           System.out.println("pt(UK) = "+number*0.416337);
                                                                                 break;
                   
                   
                   
                                                        case 5:
                                                          System.out.println("You have selected 5-cup(UK).");
                                                          System.out.println("cup(UK) = "+number);
                                                           System.out.println("ml(cc) = "+number*284);
                                                         System.out.println("teaspoon = "+number*57.619095);
                                                       System.out.println("tablespoon = "+number*19.206365);
                                                          System.out.println("cup(US) = "+number*1.200398);
                                                      System.out.println("cup(metric) = "+number*0.946353);
                                                        System.out.println("fl oz(US) = "+number*1.136); 
                                                        System.out.println("fl oz(UK) = "+number*9.603182);
                                                           System.out.println("pt(US) = "+number*0.600199);
                                                           System.out.println("pt(UK) = "+number*0.49977);
                                                                                   break;
                   
                   
                   
                                                        case 6:
                                                          System.out.println("You have selected 6-cup(metric).");
                                                          System.out.println("cup(metric) = "+number);
                                                               System.out.println("ml(cc) = "+number*250);
                                                             System.out.println("teaspoon = "+number*50.721034);
                                                           System.out.println("tablespoon = "+number*16.907011);
                                                              System.out.println("cup(US) = "+number*1.056688);
                                                              System.out.println("cup(UK) = "+number*0.880282);
                                                            System.out.println("fl oz(US) = "+number*8.453506); 
                                                            System.out.println("fl oz(UK) = "+number*8.79877);
                                                               System.out.println("pt(US) = "+number*0.528344);
                                                               System.out.println("pt(UK) = "+number*0.439938);
                                                                                 break;
                   
                   
                   
                                                        case 7:
                                                          System.out.println("You have selected 7-fl oz(US).");
                                                          System.out.println("fl oz(US) = "+number);
                                                             System.out.println("ml(cc) = "+number*29.57353);
                                                           System.out.println("teaspoon = "+number*6);
                                                         System.out.println("tablespoon = "+number*2);
                                                            System.out.println("cup(US) = "+number*0.125);
                                                            System.out.println("cup(UK) = "+number*0.104132);
                                                        System.out.println("cup(metric) = "+number*0.118294); 
                                                          System.out.println("fl oz(UK) = "+number*1.040843);
                                                             System.out.println("pt(US) = "+number*0.0625);
                                                             System.out.println("pt(UK) = "+number*0.052042);
                                                                                   break;
                  
                   
                   
                                                        case 8:
                                                          System.out.println("You have selected 8-fl oz(UK).");
                                                          System.out.println("fl oz(UK) = "+number);
                                                             System.out.println("ml(cc) = "+number*28.413062);
                                                           System.out.println("teaspoon = "+number*5.76456);
                                                         System.out.println("tablespoon = "+number*1.92152);
                                                            System.out.println("cup(US) = "+number*0.120095);
                                                            System.out.println("cup(UK) = "+number*0.100046);
                                                        System.out.println("cup(metric) = "+number*0.113652); 
                                                          System.out.println("fl oz(US) = "+number*0.96076);
                                                             System.out.println("pt(US) = "+number*0.060047);
                                                             System.out.println("pt(UK) = "+number*0.05);
                                                                                   break;
                   
                  
                   
                                                        case 9:
                                                          System.out.println("You have selected 9-pt(US).");
                                                          System.out.println("pt(US) = "+number);
                                                          System.out.println("ml(cc) = "+number*473.176473);
                                                        System.out.println("teaspoon = "+number*96);
                                                      System.out.println("tablespoon = "+number*32);
                                                         System.out.println("cup(US) = "+number*2);
                                                         System.out.println("cup(UK) = "+number*1.666114);
                                                     System.out.println("cup(metric) = "+number*1.892706); 
                                                       System.out.println("fl oz(US) = "+number*16);
                                                       System.out.println("fl oz(UK) = "+number*16.653484);
                                                          System.out.println("pt(UK) = "+number*0.832674);
                                                                           break;
                   
                   
                  
                                                        case 10:
                                                          System.out.println("You have selected 10-pt(UK).");
                                                          System.out.println("pt(UK) = "+number);
                                                          System.out.println("ml(cc) = "+number*68.261248);
                                                        System.out.println("teaspoon = "+number*115.291193);
                                                      System.out.println("tablespoon = "+number*38.430398);
                                                         System.out.println("cup(US) = "+number*2.4019);
                                                         System.out.println("cup(UK) = "+number*2.00092);
                                                     System.out.println("cup(metric) = "+number*2.273045); 
                                                       System.out.println("fl oz(US) = "+number*20);
                                                       System.out.println("fl oz(UK) = "+number*1.20095);
                                                          System.out.println("pt(US) = "+number*1.20095);
                                                          break;
                                                         }
                                                   break;
                                                  }
                                                 }
                                                } 
                                               }
