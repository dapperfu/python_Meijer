package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class f2 extends O1<f2> implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private String[] f82291c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f82292d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f82293e;

    /* renamed from: f, reason: collision with root package name */
    private long[] f82294f;

    /* renamed from: g, reason: collision with root package name */
    private long[] f82295g;

    public f2() {
        String[] strArr = V1.f82055f;
        this.f82291c = strArr;
        this.f82292d = strArr;
        this.f82293e = V1.f82050a;
        long[] jArr = V1.f82051b;
        this.f82294f = jArr;
        this.f82295g = jArr;
        this.f82026b = null;
        this.f82043a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final f2 clone() {
        try {
            f2 f2Var = (f2) super.clone();
            String[] strArr = this.f82291c;
            if (strArr != null && strArr.length > 0) {
                f2Var.f82291c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f82292d;
            if (strArr2 != null && strArr2.length > 0) {
                f2Var.f82292d = (String[]) strArr2.clone();
            }
            int[] iArr = this.f82293e;
            if (iArr != null && iArr.length > 0) {
                f2Var.f82293e = (int[]) iArr.clone();
            }
            long[] jArr = this.f82294f;
            if (jArr != null && jArr.length > 0) {
                f2Var.f82294f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f82295g;
            if (jArr2 != null && jArr2.length > 0) {
                f2Var.f82295g = (long[]) jArr2.clone();
            }
            return f2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    public final void a(N1 n12) throws IOException {
        String[] strArr = this.f82291c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f82291c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    n12.c(1, str);
                }
                i11++;
            }
        }
        String[] strArr3 = this.f82292d;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f82292d;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    n12.c(2, str2);
                }
                i12++;
            }
        }
        int[] iArr = this.f82293e;
        if (iArr != null && iArr.length > 0) {
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f82293e;
                if (i13 >= iArr2.length) {
                    break;
                }
                n12.l(3, iArr2[i13]);
                i13++;
            }
        }
        long[] jArr = this.f82294f;
        if (jArr != null && jArr.length > 0) {
            int i14 = 0;
            while (true) {
                long[] jArr2 = this.f82294f;
                if (i14 >= jArr2.length) {
                    break;
                }
                n12.u(4, jArr2[i14]);
                i14++;
            }
        }
        long[] jArr3 = this.f82295g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f82295g;
                if (i10 >= jArr4.length) {
                    break;
                }
                n12.u(5, jArr4[i10]);
                i10++;
            }
        }
        super.a(n12);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    protected final int d() {
        long[] jArr;
        int[] iArr;
        int iD = super.d();
        String[] strArr = this.f82291c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iR = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f82291c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iR += N1.r(str);
                }
                i11++;
            }
            iD = iD + iR + i12;
        }
        String[] strArr3 = this.f82292d;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iR2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f82292d;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iR2 += N1.r(str2);
                }
                i13++;
            }
            iD = iD + iR2 + i14;
        }
        int[] iArr2 = this.f82293e;
        if (iArr2 != null && iArr2.length > 0) {
            int i15 = 0;
            int iZ = 0;
            while (true) {
                iArr = this.f82293e;
                if (i15 >= iArr.length) {
                    break;
                }
                iZ += N1.z(iArr[i15]);
                i15++;
            }
            iD = iD + iZ + iArr.length;
        }
        long[] jArr2 = this.f82294f;
        if (jArr2 != null && jArr2.length > 0) {
            int i16 = 0;
            int iX = 0;
            while (true) {
                jArr = this.f82294f;
                if (i16 >= jArr.length) {
                    break;
                }
                iX += N1.x(jArr[i16]);
                i16++;
            }
            iD = iD + iX + jArr.length;
        }
        long[] jArr3 = this.f82295g;
        if (jArr3 == null || jArr3.length <= 0) {
            return iD;
        }
        int iX2 = 0;
        while (true) {
            long[] jArr4 = this.f82295g;
            if (i10 >= jArr4.length) {
                return iD + iX2 + jArr4.length;
            }
            iX2 += N1.x(jArr4[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: e */
    public final /* synthetic */ S1 clone() throws CloneNotSupportedException {
        return (f2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (!R1.c(this.f82291c, f2Var.f82291c) || !R1.c(this.f82292d, f2Var.f82292d) || !R1.a(this.f82293e, f2Var.f82293e) || !R1.b(this.f82294f, f2Var.f82294f) || !R1.b(this.f82295g, f2Var.f82295g)) {
            return false;
        }
        P1 p12 = this.f82026b;
        if (p12 != null && !p12.a()) {
            return this.f82026b.equals(f2Var.f82026b);
        }
        P1 p13 = f2Var.f82026b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (f2) clone();
    }

    public final int hashCode() {
        int iHashCode = (((((((((((f2.class.getName().hashCode() + 527) * 31) + R1.f(this.f82291c)) * 31) + R1.f(this.f82292d)) * 31) + R1.d(this.f82293e)) * 31) + R1.e(this.f82294f)) * 31) + R1.e(this.f82295g)) * 31;
        P1 p12 = this.f82026b;
        return iHashCode + ((p12 == null || p12.a()) ? 0 : this.f82026b.hashCode());
    }
}
