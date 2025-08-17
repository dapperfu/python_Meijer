package J8;

/* loaded from: classes4.dex */
public class g implements b {
    @Override // J8.b
    public String a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        return "Loading " + str;
    }
}
