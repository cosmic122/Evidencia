public class Doctores {

    public Doctores() {
        this.docID = docID;
        this.docName = docName;
        this.docSpec = docSpec;
    }

    private String docID;
    private String docName;
    private String docSpec;

    public String getDocID() { return docID; }
    public String getDocName() { return docName; }
    public String getDocSpec() { return docSpec; }

    public void setDocID(String docID) { this.docID = docID; }
    public void setDocName(String docName) { this.docName = docName; }
    public void setDocSpec(String docSpec) { this.docSpec = docSpec; }

}
