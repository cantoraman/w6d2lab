public enum BookGenre {
    CRIME("About fighting criminals"),
    THRILLER("Makes you bite your nails"),
    HORROR("Makes you look under your bed"),
    ROMANTIC("Fifty Shades of Grey is not romantic"),
    ADVENTURE("Like Fifty Shades of Grey");

    private final String value;

    BookGenre(String value){
        this.value = value;
    }

    public String getDescription(){
        return this.value;
    }
}
