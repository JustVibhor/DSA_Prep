package com.vibhor.OOP;



class OuterClass {

    static class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }

        @Override        // instead of printing hash value its prints the name given
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        InnerClass a = new InnerClass("Vibhor");
        InnerClass b = new InnerClass("Mia_Khalifa");

        System.out.println(a);



    }


}

class Singelton {

    private Singelton() {

    }
    private static Singelton instance;

    public static Singelton getInstance() {
        if(instance == null) {
            instance = new Singelton();
        }

        return instance;
    }

}
