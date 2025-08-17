package G9;

/* loaded from: classes4.dex */
public class c {
    public static String a(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder(str + " IN (?");
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(", ?");
        }
        sb2.append(")");
        return sb2.toString();
    }
}
