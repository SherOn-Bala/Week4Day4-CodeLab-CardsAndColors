package ca.judacribz.week4day5_codelab_cardsandcolors;

/**
 * Data model for each row of the RecyclerView.
 */
class Sport {

    //Member variables representing the title and information about the sport
    private String title;
    private String info;

    /**
     * Constructor for the Sport data model
     *
     * @param title The name if the sport.
     * @param info  Information about the sport.
     */
    Sport(String title, String info) {
        this.title = title;
        this.info = info;
    }

    /**
     * Gets the title of the sport
     *
     * @return The title of the sport.
     */
    String getTitle() {
        return title;
    }

    /**
     * Gets the info about the sport
     *
     * @return The info about the sport.
     */
    String getInfo() {
        return info;
    }
}
