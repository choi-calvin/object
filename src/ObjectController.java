class ObjectController {
    private ObjectModel model;

    void initModel(ObjectModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model ;
    }

}
