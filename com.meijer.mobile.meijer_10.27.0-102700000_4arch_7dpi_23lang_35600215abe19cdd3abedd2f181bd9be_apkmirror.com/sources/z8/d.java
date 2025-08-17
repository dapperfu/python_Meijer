package z8;

/* loaded from: classes4.dex */
public class d implements J8.b {
    @Override // J8.b
    public String a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }
}
