package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class R1 {

    /* renamed from: f, reason: collision with root package name */
    private static final R1 f80862f = new R1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f80863a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f80864b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f80865c;

    /* renamed from: d, reason: collision with root package name */
    private int f80866d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f80867e;

    private R1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f80866d = -1;
        this.f80863a = 0;
        this.f80864b = iArr;
        this.f80865c = objArr;
        this.f80867e = z10;
    }

    public static R1 c() {
        return f80862f;
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
        if (this.f80867e) {
            this.f80867e = false;
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
        int i10 = r12.f80863a;
        int i11 = r13.f80863a;
        int[] iArrCopyOf = Arrays.copyOf(r12.f80864b, 0);
        System.arraycopy(r13.f80864b, 0, iArrCopyOf, 0, 0);
        Object[] objArrCopyOf = Arrays.copyOf(r12.f80865c, 0);
        System.arraycopy(r13.f80865c, 0, objArrCopyOf, 0, 0);
        return new R1(0, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int i10 = this.f80866d;
        if (i10 != -1) {
            return i10;
        }
        this.f80866d = 0;
        return 0;
    }

    public final int b() {
        int i10 = this.f80866d;
        if (i10 != -1) {
            return i10;
        }
        this.f80866d = 0;
        return 0;
    }

    final R1 d(R1 r12) {
        if (r12.equals(f80862f)) {
            return this;
        }
        if (!this.f80867e) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.f80864b;
        int length = iArr.length;
        System.arraycopy(r12.f80864b, 0, iArr, 0, 0);
        System.arraycopy(r12.f80865c, 0, this.f80865c, 0, 0);
        this.f80863a = 0;
        return this;
    }
}
