public class test {
    public static void main(String[] args) 
    {
        DocumentFactory wf = new WordDocumentFactory();
        DocumentFactory pf = new PdfDocumentFactory();
        DocumentFactory ef = new ExcelDocumentFactory();

        Document wd = wf.createDocument();
        Document pd = pf.createDocument();
        Document ed = ef.createDocument();

        wd.open();
        wd.manage();
        wd.save();
        pd.open();
        pd.manage();
        pd.save();
        ed.open();
        ed.manage();
        ed.save();
    }
}
