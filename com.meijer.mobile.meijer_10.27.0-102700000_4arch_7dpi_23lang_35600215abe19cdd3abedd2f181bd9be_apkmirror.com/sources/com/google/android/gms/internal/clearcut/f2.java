package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class f2 extends O1<f2> implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private String[] f81451c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f81452d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f81453e;

    /* renamed from: f, reason: collision with root package name */
    private long[] f81454f;

    /* renamed from: g, reason: collision with root package name */
    private long[] f81455g;

    public f2() {
        String[] strArr = V1.f81215f;
        this.f81451c = strArr;
        this.f81452d = strArr;
        this.f81453e = V1.f81210a;
        long[] jArr = V1.f81211b;
        this.f81454f = jArr;
        this.f81455g = jArr;
        this.f81186b = null;
        this.f81203a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final f2 clone() {
        try {
            f2 f2Var = (f2) super.clone();
            String[] strArr = this.f81451c;
            if (strArr != null && strArr.length > 0) {
                f2Var.f81451c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f81452d;
            if (strArr2 != null && strArr2.length > 0) {
                f2Var.f81452d = (String[]) strArr2.clone();
            }
            int[] iArr = this.f81453e;
            if (iArr != null && iArr.length > 0) {
                f2Var.f81453e = (int[]) iArr.clone();
            }
            long[] jArr = this.f81454f;
            if (jArr != null && jArr.length > 0) {
                f2Var.f81454f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f81455g;
            if (jArr2 != null && jArr2.length > 0) {
                f2Var.f81455g = (long[]) jArr2.clone();
            }
            return f2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    public final void a(N1 n12) throws IOException {
        String[] strArr = this.f81451c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f81451c;
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
        String[] strArr3 = this.f81452d;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f81452d;
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
        int[] iArr = this.f81453e;
        if (iArr != null && iArr.length > 0) {
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f81453e;
                if (i13 >= iArr2.length) {
                    break;
                }
                n12.l(3, iArr2[i13]);
                i13++;
            }
        }
        long[] jArr = this.f81454f;
        if (jArr != null && jArr.length > 0) {
            int i14 = 0;
            while (true) {
                long[] jArr2 = this.f81454f;
                if (i14 >= jArr2.length) {
                    break;
                }
                n12.u(4, jArr2[i14]);
                i14++;
            }
        }
        long[] jArr3 = this.f81455g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f81455g;
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
        String[] strArr = this.f81451c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iR = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f81451c;
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
        String[] strArr3 = this.f81452d;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iR2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f81452d;
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
        int[] iArr2 = this.f81453e;
        if (iArr2 != null && iArr2.length > 0) {
            int i15 = 0;
            int iZ = 0;
            while (true) {
                iArr = this.f81453e;
                if (i15 >= iArr.length) {
                    break;
                }
                iZ += N1.z(iArr[i15]);
                i15++;
            }
            iD = iD + iZ + iArr.length;
        }
        long[] jArr2 = this.f81454f;
        if (jArr2 != null && jArr2.length > 0) {
            int i16 = 0;
            int iX = 0;
            while (true) {
                jArr = this.f81454f;
                if (i16 >= jArr.length) {
                    break;
                }
                iX += N1.x(jArr[i16]);
                i16++;
            }
            iD = iD + iX + jArr.length;
        }
        long[] jArr3 = this.f81455g;
        if (jArr3 == null || jArr3.length <= 0) {
            return iD;
        }
        int iX2 = 0;
        while (true) {
            long[] jArr4 = this.f81455g;
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
        if (!R1.c(this.f81451c, f2Var.f81451c) || !R1.c(this.f81452d, f2Var.f81452d) || !R1.a(this.f81453e, f2Var.f81453e) || !R1.b(this.f81454f, f2Var.f81454f) || !R1.b(this.f81455g, f2Var.f81455g)) {
            return false;
        }
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            return this.f81186b.equals(f2Var.f81186b);
        }
        P1 p13 = f2Var.f81186b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (f2) clone();
    }

    public final int hashCode() {
        int iHashCode = (((((((((((f2.class.getName().hashCode() + 527) * 31) + R1.f(this.f81451c)) * 31) + R1.f(this.f81452d)) * 31) + R1.d(this.f81453e)) * 31) + R1.e(this.f81454f)) * 31) + R1.e(this.f81455g)) * 31;
        P1 p12 = this.f81186b;
        return iHashCode + ((p12 == null || p12.a()) ? 0 : this.f81186b.hashCode());
    }
}
