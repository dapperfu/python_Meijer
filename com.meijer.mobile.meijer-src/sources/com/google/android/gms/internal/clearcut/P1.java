package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
public final class P1 implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Q1 f82028e = new Q1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f82029a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82030b;

    /* renamed from: c, reason: collision with root package name */
    private Q1[] f82031c;

    /* renamed from: d, reason: collision with root package name */
    private int f82032d;

    P1() {
        this(10);
    }

    public final boolean a() {
        return this.f82032d == 0;
    }

    final int b() {
        return this.f82032d;
    }

    final Q1 c(int i10) {
        return this.f82031c[i10];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i10 = this.f82032d;
        P1 p12 = new P1(i10);
        System.arraycopy(this.f82030b, 0, p12.f82030b, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Q1 q12 = this.f82031c[i11];
            if (q12 != null) {
                p12.f82031c[i11] = (Q1) q12.clone();
            }
        }
        p12.f82032d = i10;
        return p12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P1)) {
            return false;
        }
        P1 p12 = (P1) obj;
        int i10 = this.f82032d;
        if (i10 != p12.f82032d) {
            return false;
        }
        int[] iArr = this.f82030b;
        int[] iArr2 = p12.f82030b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                Q1[] q1Arr = this.f82031c;
                Q1[] q1Arr2 = p12.f82031c;
                int i12 = this.f82032d;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (q1Arr[i13].equals(q1Arr2[i13])) {
                    }
                }
                return true;
            }
            if (iArr[i11] != iArr2[i11]) {
                break;
            }
            i11++;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i10 = 0; i10 < this.f82032d; i10++) {
            iHashCode = (((iHashCode * 31) + this.f82030b[i10]) * 31) + this.f82031c[i10].hashCode();
        }
        return iHashCode;
    }

    private P1(int i10) {
        this.f82029a = false;
        int i11 = i10 << 2;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f82030b = new int[i14];
        this.f82031c = new Q1[i14];
        this.f82032d = 0;
    }
}
