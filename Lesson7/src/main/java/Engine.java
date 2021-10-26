public class Engine {
    private String engine;

    Engine(String engine) {
        this.engine = engine;
        setEngine(engine);
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        if (!engine.trim().isEmpty()) {
            this.engine = engine;
        } else {
            System.out.println("Incorrect engine");
        }
    }
}
