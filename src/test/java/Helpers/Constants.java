package Helpers;

/**
 * This class contains paths for our files
 * @author RashwanM3
 *
 */
public class Constants {
    public static final String FileSeprator = System.getProperty("file.separator");

    public static final String Foldertest = System.getProperty("user.dir") + FileSeprator + "src" + FileSeprator
            + "test" + FileSeprator;

    public static final String testDataPath = Foldertest + "resources" + FileSeprator + "TestDataFiles" + FileSeprator;

}
