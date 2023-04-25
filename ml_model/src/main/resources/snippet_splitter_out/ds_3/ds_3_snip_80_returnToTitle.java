package FeatureExtraction.snippet_splitter_out;
public class ds_3_snip_80_returnToTitle {
// Added to allow compilation
// Snippet s80
/**
 * Closes all panels, changes the background and shows the main menu.
 */
// SNIPPET_STARTS
public void returnToTitle() {
    // TODO: check if the GUI object knows that we're not
    // inGame. (Retrieve value of GUI::inGame.)  If GUI thinks
    // we're still in the game then log an error because at this
    // point the GUI should have been informed.
    closeMenus();
    removeInGameComponents();
    showMainPanel();
}
}