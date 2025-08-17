package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8893np {

    /* renamed from: a, reason: collision with root package name */
    public final int f77141a;

    /* renamed from: b, reason: collision with root package name */
    private final C9742vm f77142b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f77143c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f77144d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean[] f77145e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8893np.class == obj.getClass()) {
            C8893np c8893np = (C8893np) obj;
            if (this.f77143c == c8893np.f77143c && this.f77142b.equals(c8893np.f77142b) && Arrays.equals(this.f77144d, c8893np.f77144d) && Arrays.equals(this.f77145e, c8893np.f77145e)) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return this.f77142b.f79123c;
    }

    public final C b(int i10) {
        return this.f77142b.b(i10);
    }

    public final boolean c() {
        for (boolean z10 : this.f77145e) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i10) {
        return this.f77145e[i10];
    }

    public final int hashCode() {
        return (((((this.f77142b.hashCode() * 31) + (this.f77143c ? 1 : 0)) * 31) + Arrays.hashCode(this.f77144d)) * 31) + Arrays.hashCode(this.f77145e);
    }

    public C8893np(C9742vm c9742vm, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = c9742vm.f79121a;
        this.f77141a = i10;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C8086gC.d(z11);
        this.f77142b = c9742vm;
        this.f77143c = z10 && i10 > 1;
        this.f77144d = (int[]) iArr.clone();
        this.f77145e = (boolean[]) zArr.clone();
    }
}
