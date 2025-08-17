package Ce;

/* loaded from: classes6.dex */
public final class f0 {
    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return (T[]) i0.b(tArr, i10);
    }
}
