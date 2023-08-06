package snippet_splitter_out.ds_6;
public class ds_6_snip_4$OpenCMSCore_generateContent {
public static int generateContent(CmsObject cms, String vfsFolder, int numberOfFiles, double fileTypeDistribution)
            throws Exception {

        int maxProps = 10;
        double propertyDistribution = 0.0;
        int writtenFiles = 0;

        int numberOfBinaryFiles = (int)(numberOfFiles * fileTypeDistribution);

        // generate binary files
        writtenFiles += generateResources(
                cms,
                "org/opencms/search/pdf-test-112.pdf",
                vfsFolder,
                numberOfBinaryFiles,
                CmsResourceTypeBinary.getStaticTypeId(),
                maxProps,
                propertyDistribution);

        // generate text files
        writtenFiles += generateResources(
                cms,
                "org/opencms/search/extractors/test1.html",
                vfsFolder,
                numberOfFiles - numberOfBinaryFiles,
                CmsResourceTypePlain.getStaticTypeId(),
                maxProps,
                propertyDistribution);

        System.out.println("" + writtenFiles + " files written in Folder " + vfsFolder);

        return writtenFiles;
    }
}