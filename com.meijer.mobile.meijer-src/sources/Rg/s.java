package Rg;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public abstract class s implements com.google.zxing.q {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f32613a = Pattern.compile("[0-9]+");

    protected static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    private static Ig.b h(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int iMax = Math.max(i10, i13);
        int iMax2 = Math.max(1, i11);
        int i14 = iMax / i13;
        int i15 = (iMax - (length * i14)) / 2;
        Ig.b bVar = new Ig.b(iMax, iMax2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.r(i15, 0, i14, iMax2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    public abstract boolean[] d(String str);

    protected abstract Collection<com.google.zxing.a> g();

    protected static void c(String str) {
        if (!f32613a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    public int f() {
        return 10;
    }

    @Override // com.google.zxing.q
    public Ig.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.f, ?> map) throws NumberFormatException {
        if (!str.isEmpty()) {
            if (i10 >= 0 && i11 >= 0) {
                Collection<com.google.zxing.a> collectionG = g();
                if (collectionG != null && !collectionG.contains(aVar)) {
                    throw new IllegalArgumentException("Can only encode " + collectionG + ", but got " + aVar);
                }
                int iF = f();
                if (map != null) {
                    com.google.zxing.f fVar = com.google.zxing.f.MARGIN;
                    if (map.containsKey(fVar)) {
                        iF = Integer.parseInt(map.get(fVar).toString());
                    }
                }
                return h(e(str, map), i10, i11, iF);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public boolean[] e(String str, Map<com.google.zxing.f, ?> map) {
        return d(str);
    }
}
