package e3;

import a3.y;
import d3.C13466a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f128070a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f128071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f128072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f128073d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f128070a.equals(bVar.f128070a) && Arrays.equals(this.f128071b, bVar.f128071b) && this.f128072c == bVar.f128072c && this.f128073d == bVar.f128073d) {
                return true;
            }
        }
        return false;
    }

    private static String e(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        Be.i.g(',').c(sb2, list);
        return sb2.toString();
    }

    public List<Integer> d() {
        C13466a.h(this.f128070a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f128071b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f128071b[i10 + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((((((527 + this.f128070a.hashCode()) * 31) + Arrays.hashCode(this.f128071b)) * 31) + this.f128072c) * 31) + this.f128073d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f128073d
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            d3.D r0 = new d3.D
            byte[] r1 = r3.f128071b
            r0.<init>(r1)
            long r0 = r0.O()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f128071b
            r1 = 0
            r0 = r0[r1]
            int r0 = e3.C13607a.a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f128071b
            int r0 = He.f.f(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f128071b
            int r0 = He.f.f(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f128071b
            java.lang.String r0 = d3.P.G(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f128070a
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.d()
            java.lang.String r0 = e(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f128071b
            java.lang.String r0 = d3.P.g1(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r2 = r3.f128070a
            r1.append(r2)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.toString():java.lang.String");
    }

    public b(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f128070a = str;
        this.f128071b = bArr;
        this.f128072c = i10;
        this.f128073d = i11;
    }

    private static void f(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                C13466a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                C13466a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                C13466a.a(z10);
                break;
            case "auxiliary.tracks.map":
                if (i10 == 0) {
                    z10 = true;
                }
                C13466a.a(z10);
                break;
        }
    }
}
