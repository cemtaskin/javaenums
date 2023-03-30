class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar) {
            case LOW:
                System.out.println("Device is working on low level");
                break;
            case MEDIUM:
                System.out.println("Device is working on medium level");
                break;
            case HIGH:
                System.out.println("Device is working on high level");
                break;

        }
    }
}
