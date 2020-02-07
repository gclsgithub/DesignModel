package demo.singleTon.hunger;

public enum EnumSingleton {
    SINGLE{
        protected void doSomthing(){
            System.out.println("hellp out");
        }
    };

    protected abstract void doSomthing();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
