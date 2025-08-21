package Ig;

import com.google.android.gms.common.api.a;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class n implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14542a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14543b;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final char f14544a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14545b;

        /* renamed from: c, reason: collision with root package name */
        private final b f14546c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14547d;

        private b(char c10, h hVar, int i10, b bVar, int i11) {
            char c11 = c10 == i11 ? (char) 1000 : c10;
            this.f14544a = c11;
            this.f14545b = i10;
            this.f14546c = bVar;
            int length = c11 == 1000 ? 1 : hVar.b(c10, i10).length;
            length = (bVar == null ? 0 : bVar.f14545b) != i10 ? length + 3 : length;
            this.f14547d = bVar != null ? length + bVar.f14547d : length;
        }

        boolean e() {
            return this.f14544a == 1000;
        }
    }

    static void c(b[][] bVarArr, int i10, b bVar) {
        if (bVarArr[i10][bVar.f14545b] == null || bVarArr[i10][bVar.f14545b].f14547d > bVar.f14547d) {
            bVarArr[i10][bVar.f14545b] = bVar;
        }
    }

    @Override // Ig.i
    public boolean a(int i10) {
        if (i10 >= 0 && i10 < length()) {
            int i11 = this.f14542a[i10];
            return i11 > 255 && i11 <= 999;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // Ig.i
    public int b(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (a(i10)) {
            return this.f14542a[i10] - 256;
        }
        throw new IllegalArgumentException("value at " + i10 + " is not an ECI but a character");
    }

    @Override // Ig.i
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        if (!a(i10)) {
            return (char) (h(i10) ? this.f14543b : this.f14542a[i10]);
        }
        throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
    }

    public int f() {
        return this.f14543b;
    }

    public boolean g(int i10, int i11) {
        if ((i10 + i11) - 1 >= this.f14542a.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i10) {
        if (i10 >= 0 && i10 < length()) {
            return this.f14542a[i10] == 1000;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    @Override // Ig.i
    public int length() {
        return this.f14542a.length;
    }

    @Override // Ig.i
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < i11) {
            if (a(i10)) {
                throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
            }
            sb2.append(charAt(i10));
            i10++;
        }
        return sb2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length(); i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            if (a(i10)) {
                sb2.append("ECI(");
                sb2.append(b(i10));
                sb2.append(')');
            } else if (charAt(i10) < 128) {
                sb2.append('\'');
                sb2.append(charAt(i10));
                sb2.append('\'');
            } else {
                sb2.append((int) charAt(i10));
            }
        }
        return sb2.toString();
    }

    public n(String str, Charset charset, int i10) {
        this.f14543b = i10;
        h hVar = new h(str, charset, i10);
        if (hVar.g() == 1) {
            this.f14542a = new int[str.length()];
            for (int i11 = 0; i11 < this.f14542a.length; i11++) {
                char cCharAt = str.charAt(i11);
                int[] iArr = this.f14542a;
                if (cCharAt == i10) {
                    cCharAt = 1000;
                }
                iArr[i11] = cCharAt;
            }
            return;
        }
        this.f14542a = e(str, hVar, i10);
    }

    static void d(String str, h hVar, b[][] bVarArr, int i10, b bVar, int i11) {
        int i12;
        int iF;
        h hVar2;
        b bVar2;
        int i13;
        char cCharAt = str.charAt(i10);
        int iG = hVar.g();
        if (hVar.f() >= 0 && (cCharAt == i11 || hVar.a(cCharAt, hVar.f()))) {
            iF = hVar.f();
            i12 = iF + 1;
        } else {
            i12 = iG;
            iF = 0;
        }
        int i14 = iF;
        while (i14 < i12) {
            if (cCharAt != i11 && !hVar.a(cCharAt, i14)) {
                hVar2 = hVar;
                bVar2 = bVar;
                i13 = i11;
            } else {
                hVar2 = hVar;
                bVar2 = bVar;
                i13 = i11;
                c(bVarArr, i10 + 1, new b(cCharAt, hVar2, i14, bVar2, i13));
            }
            i14++;
            hVar = hVar2;
            bVar = bVar2;
            i11 = i13;
        }
    }

    static int[] e(String str, h hVar, int i10) {
        int i11;
        int length = str.length();
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, hVar.g());
        d(str, hVar, bVarArr, 0, null, i10);
        for (int i12 = 1; i12 <= length; i12++) {
            for (int i13 = 0; i13 < hVar.g(); i13++) {
                b bVar = bVarArr[i12][i13];
                if (bVar != null && i12 < length) {
                    d(str, hVar, bVarArr, i12, bVar, i10);
                }
            }
            for (int i14 = 0; i14 < hVar.g(); i14++) {
                bVarArr[i12 - 1][i14] = null;
            }
        }
        int i15 = -1;
        int i16 = a.e.API_PRIORITY_OTHER;
        for (int i17 = 0; i17 < hVar.g(); i17++) {
            b bVar2 = bVarArr[length][i17];
            if (bVar2 != null && bVar2.f14547d < i16) {
                i16 = bVar2.f14547d;
                i15 = i17;
            }
        }
        if (i15 >= 0) {
            ArrayList arrayList = new ArrayList();
            for (b bVar3 = bVarArr[length][i15]; bVar3 != null; bVar3 = bVar3.f14546c) {
                if (bVar3.e()) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] bArrB = hVar.b(bVar3.f14544a, bVar3.f14545b);
                    for (int length2 = bArrB.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(bArrB[length2] & 255));
                    }
                }
                if (bVar3.f14546c != null) {
                    i11 = bVar3.f14546c.f14545b;
                } else {
                    i11 = 0;
                }
                if (i11 != bVar3.f14545b) {
                    arrayList.add(0, Integer.valueOf(hVar.e(bVar3.f14545b) + 256));
                }
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = ((Integer) arrayList.get(i18)).intValue();
            }
            return iArr;
        }
        throw new IllegalStateException("Failed to encode \"" + str + "\"");
    }
}
