package sw;

import com.google.maps.android.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class f {
    static final boolean k(String str, int i10) {
        return i10 >= 2 && str.charAt(i10 - 2) == '\\';
    }

    static final boolean l(String str, int i10) {
        return i10 != 0 && str.charAt(i10 - 1) == '\\';
    }

    public static final d b(String str, Object[] objArr, Throwable th2) {
        int i10;
        if (str == null) {
            return new d(null, objArr, th2);
        }
        if (objArr == null) {
            return new d(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 50);
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i12);
            if (iIndexOf == -1) {
                if (i12 == 0) {
                    return new d(str, objArr, th2);
                }
                sb2.append((CharSequence) str, i12, str.length());
                return new d(sb2.toString(), objArr, th2);
            }
            if (!l(str, iIndexOf)) {
                sb2.append((CharSequence) str, i12, iIndexOf);
                f(sb2, objArr[i11], new HashMap());
            } else if (k(str, iIndexOf)) {
                sb2.append((CharSequence) str, i12, iIndexOf - 1);
                f(sb2, objArr[i11], new HashMap());
            } else {
                i11--;
                sb2.append((CharSequence) str, i12, iIndexOf - 1);
                sb2.append('{');
                i10 = iIndexOf + 1;
                i12 = i10;
                i11++;
            }
            i10 = iIndexOf + 2;
            i12 = i10;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        return new d(sb2.toString(), objArr, th2);
    }

    private static void c(StringBuilder sb2, boolean[] zArr) {
        sb2.append('[');
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(zArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void d(StringBuilder sb2, byte[] bArr) {
        sb2.append('[');
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append((int) bArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void e(StringBuilder sb2, char[] cArr) {
        sb2.append('[');
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(cArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void f(StringBuilder sb2, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb2.append(BuildConfig.TRAVIS);
            return;
        }
        if (!obj.getClass().isArray()) {
            o(sb2, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            c(sb2, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            d(sb2, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            e(sb2, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            p(sb2, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            j(sb2, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            m(sb2, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            h(sb2, (float[]) obj);
        } else if (obj instanceof double[]) {
            g(sb2, (double[]) obj);
        } else {
            n(sb2, (Object[]) obj, map);
        }
    }

    private static void g(StringBuilder sb2, double[] dArr) {
        sb2.append('[');
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(dArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void h(StringBuilder sb2, float[] fArr) {
        sb2.append('[');
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(fArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void j(StringBuilder sb2, int[] iArr) {
        sb2.append('[');
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(iArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void m(StringBuilder sb2, long[] jArr) {
        sb2.append('[');
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(jArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void n(StringBuilder sb2, Object[] objArr, Map<Object[], Object> map) {
        sb2.append('[');
        if (map.containsKey(objArr)) {
            sb2.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                f(sb2, objArr[i10], map);
                if (i10 != length - 1) {
                    sb2.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb2.append(']');
    }

    private static void p(StringBuilder sb2, short[] sArr) {
        sb2.append('[');
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append((int) sArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    public static final d a(String str, Object[] objArr) {
        Throwable thI = i(objArr);
        if (thI != null) {
            objArr = q(objArr);
        }
        return b(str, objArr, thI);
    }

    public static Throwable i(Object[] objArr) {
        return l.a(objArr);
    }

    private static void o(StringBuilder sb2, Object obj) {
        try {
            sb2.append(obj.toString());
        } catch (Throwable th2) {
            q.b("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th2);
            sb2.append("[FAILED toString()]");
        }
    }

    public static Object[] q(Object[] objArr) {
        return l.b(objArr);
    }
}
