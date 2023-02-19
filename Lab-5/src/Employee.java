public class Employee {



        private double  salary  ;
        private String name ;



        public Employee()
        {
            this.name="Adnan";
            this.salary=1000;
        }

        public Employee(String a ,double b) {

            this .name =a;
            this.salary=b;
        }


        public String getName() {
            return name;
        }

        public double getSalary() {

            return salary;
        }


        public static void main(String[]argn) {
            Employee obj =new Employee();

            Employee obj2 =new Employee();
            System.out.println("This  is"+obj.getName() );
            System.out.println("This is"+obj2.getSalary() );

        }
    }






