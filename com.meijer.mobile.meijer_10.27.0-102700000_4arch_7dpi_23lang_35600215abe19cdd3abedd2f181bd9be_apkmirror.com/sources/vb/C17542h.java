package vb;

/* renamed from: vb.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17542h extends AbstractC17543i {
    public C17542h() {
        super(new Class[0]);
    }

    public static String c(String str) {
        if (str == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (Character.isUpperCase(c10)) {
                sb2.append('_');
                sb2.append(Character.toLowerCase(c10));
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (str == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (char c10 : str.toCharArray()) {
            if (c10 == '_') {
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(c10));
                z10 = false;
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    @Override // vb.AbstractC17543i
    public String a(Class<?> cls, String str) {
        return d(str);
    }

    @Override // vb.AbstractC17543i
    public String b(Class<?> cls, String str) {
        return c(str);
    }
}
