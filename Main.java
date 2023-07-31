import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        // test all other classes
        System.out.println("Test all other classes");

        Employee e1 = new Employee("Feras123","Feras",5000);


        System.out.println("id of this employee is : "+ e1.getId());
        System.out.println("name of this employee is : "+e1.getName());
        System.out.println("The AnnualSalary is : "+ e1.AnnualSalary());

        System.out.println(e1.raisedSalary(2));

        System.out.println(e1.toString());

        Account a1 = new Account("Ali07","Ali",500);
        Account a2 = new Account("Ahmed07","Ahmed",500);
        Account a3= new Account("Feras123","Feras");

        System.out.println(a1.getId());
        System.out.println(a2.getName());

        a2.credit(100);
        System.out.println(a2.getBalance());


        // transfer from a2 to a1 with 300
        a2.transferTo(a1,300);

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        a2.debit(200);
        System.out.println(a2.toString());
        a1.credit(1000);

        System.out.println(a3.toString());

        System.out.println(a2.transferTo(a1,10000));


        // using Scanner exceptions and loops
        System.out.println("//// //// //// //// ");
        System.out.println("Create account or employee objects by using Scanner exceptions and loops ");

        int chose = 0;
        for (int i = 0 ; i<1;i--){
            Scanner input = new Scanner(System.in);
            System.out.println("please choose 1 to enter as user 2 to enter as employee");
            try {
                chose = input.nextInt();
                if(chose != 1 && chose != 2){
                    throwException();
                }
                break;
            }catch(InputMismatchException m1){
                System.out.println("Please Do not enter a String try again");
            } catch (Exception m2){
                System.out.println(m2.getMessage()+" you entered number "+chose);
            }

        }

        String id="";
        String name="" ;
        int balance = 0;

        if( chose == 1) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter ur id");
            id = input.nextLine();
            System.out.println("Please Enter ur name");
            name = input.nextLine();
            for (int i = 0; i < 1; i--) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please Enter ur balance if you have ...");
                try {

                    balance = scanner.nextInt();
                    if (balance < 0) {
                        throwNegativeexception();
                    }
                    break;
                } catch (InputMismatchException m1) {
                    System.out.println("Please Do not enter a String try again");
                } catch (Exception m2) {
                    System.out.println(m2.getMessage() + " you entered number " + balance);
                }

            }


            Account a4 = new Account(id, name, balance);
            int j = 0;
            for (int i = 0; i < 1; i--) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please press 1 to show your details 2 to use credit 3 to use depit 4 to exit");
                try {
                    j = sc.nextInt();
                    if (j > 5 && j < 0) {
                        throwException();
                    }
                } catch (InputMismatchException m1) {
                    System.out.println("Please Do not enter a String try again");
                } catch (Exception m2) {
                    System.out.println(m2.getMessage() + " you entered number " + balance);
                }

                switch (j) {

                    case 1:
                        System.out.println(a4.toString());
                        break;
                    case 2:
                        for (int k = 0; k < 1; k--) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Please Enter ur balance if you have ...");
                            try {
                                balance = scanner.nextInt();
                                if (balance < 0) {
                                    throwNegativeexception();
                                }
                                break;
                            } catch (InputMismatchException m1) {
                                System.out.println("Please Do not enter a String try again");
                            } catch (Exception m2) {
                                System.out.println(m2.getMessage() + " you entered number " + balance);
                            }

                        }
                        a4.credit(balance);
                        break;
                    case 3:
                        for (int k = 0; k < 1; k--) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Please Enter ur balance if you have ...");
                            try {
                                balance = scanner.nextInt();
                                if (balance < 0) {
                                    throwNegativeexception();
                                }
                                break;
                            } catch (InputMismatchException m1) {
                                System.out.println("Please Do not enter a String try again");
                            } catch (Exception m2) {
                                System.out.println(m2.getMessage() + " you entered number " + balance);
                            }
                        }
                        a4.debit(balance);
                        break;

                    case 4:

                        i = 10;
                        break;

                    default:
                        System.out.println("please Enter range from 1 to 4 ");

                }
                if (i ==10 ){
                    break;
                }

            }
        }else{
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter ur id");
            id = input.nextLine();
            System.out.println("Please Enter ur name");
            name = input.nextLine();
            for (int i = 0; i < 1; i--) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please Enter ur price ");
                try {

                    balance = scanner.nextInt();
                    if (balance < 0) {
                        throwNegativeexception();
                    }
                    break;
                } catch (InputMismatchException m1) {
                    System.out.println("Please Do not enter a String try again");
                } catch (Exception m2) {
                    System.out.println(m2.getMessage() + " you entered number " + balance);
                }

            }


            Employee e4 = new Employee(id, name, balance);
            int j = 0;
            for (int i = 0; i < 1; i--) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please press 1 to show your details 2 to add percent to ur price 3 to see AnnualSalary 4 to exit ");
                try {
                    j = sc.nextInt();
                    if (j > 3 && j < 0) {
                        throwException();
                    }
                } catch (InputMismatchException m1) {
                    System.out.println("Please Do not enter a String try again");
                } catch (Exception m2) {
                    System.out.println(m2.getMessage() + " you entered number " + balance);
                }

                switch (j) {

                    case 1:
                        System.out.println(e4.toString());
                        break;
                    case 2:
                        for (int k = 0; k < 1; k--) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Please Enter ur Percent ");
                            try {
                                balance = scanner.nextInt();
                                if (balance < 0) {
                                    throwNegativeexception();
                                }
                                break;
                            } catch (InputMismatchException m1) {
                                System.out.println("Please Do not enter a String try again");
                            } catch (Exception m2) {
                                System.out.println(m2.getMessage() + " you entered number " + balance);
                            }

                        }
                        e4.raisedSalary(balance);
                        break;
                    case 3:
                        System.out.println("The AnnualSalary is "+ e4.AnnualSalary());
                        break;
                    case 4:
                        i = 10;
                        break;

                    default:
                        System.out.println("please Enter range from 1 to 3 ");

                }
                if (i == 10) {
                    break;
                }

            }
            }
    }
    public static void throwNegativeexception()throws Exception{
        throw new Exception("You cant enter a negative number");
    }

    public static void throwException()throws Exception{
        throw new Exception("Please enter number in this range");
    }
}