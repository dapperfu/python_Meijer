package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class R1 {

    /* renamed from: f, reason: collision with root package name */
    private static final R1 f81702f = new R1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f81703a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f81704b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f81705c;

    /* renamed from: d, reason: collision with root package name */
    private int f81706d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f81707e;

    private R1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f81706d = -1;
        this.f81703a = 0;
        this.f81704b = iArr;
        this.f81705c = objArr;
        this.f81707e = z10;
    }

    public static R1 c() {
        return f81702f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof R1)) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (this.f81707e) {
            this.f81707e = false;
        }
    }

    final void g(StringBuilder sb2, int i10) {
    }

    public final int hashCode() {
        return 506991;
    }

    private R1() {
        this(0, new int[8], new Object[8], true);
    }

    static R1 e(R1 r12, R1 r13) {
        int i10 = r12.f81703a;
        int i11 = r13.f81703a;
        int[] iArrCopyOf = Arrays.copyOf(r12.f81704b, 0);
        System.arraycopy(r13.f81704b, 0, iArrCopyOf, 0, 0);
        Object[] objArrCopyOf = Arrays.copyOf(r12.f81705c, 0);
        System.arraycopy(r13.f81705c, 0, objArrCopyOf, 0, 0);
        return new R1(0, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int i10 = this.f81706d;
        if (i10 != -1) {
            return i10;
        }
        this.f81706d = 0;
        return 0;
    }

    public final int b() {
        int i10 = this.f81706d;
        if (i10 != -1) {
            return i10;
        }
        this.f81706d = 0;
        return 0;
    }

    final R1 d(R1 r12) {
        if (r12.equals(f81702f)) {
            return this;
        }
        if (!this.f81707e) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.f81704b;
        int length = iArr.length;
        System.arraycopy(r12.f81704b, 0, iArr, 0, 0);
        System.arraycopy(r12.f81705c, 0, this.f81705c, 0, 0);
        this.f81703a = 0;
        return this;
    }
}
