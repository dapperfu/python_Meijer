package Eu;

/* loaded from: classes8.dex */
public final class c {
    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(d(str, objArr));
        }
    }

    public static <T> T c(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static String d(String str, Object... objArr) {
        int iIndexOf;
        if (objArr == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
