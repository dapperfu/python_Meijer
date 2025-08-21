package B8;

/* loaded from: classes4.dex */
public class d implements L8.b {
    @Override // L8.b
    public String a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }
}
