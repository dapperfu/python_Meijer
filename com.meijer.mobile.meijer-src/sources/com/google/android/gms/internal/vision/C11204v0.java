package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.vision.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11204v0 extends AbstractC11201u0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f85490d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f85491e;

    /* renamed from: f, reason: collision with root package name */
    private int f85492f;

    /* renamed from: g, reason: collision with root package name */
    private int f85493g;

    /* renamed from: h, reason: collision with root package name */
    private int f85494h;

    /* renamed from: i, reason: collision with root package name */
    private int f85495i;

    /* renamed from: j, reason: collision with root package name */
    private int f85496j;

    private C11204v0(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f85496j = a.e.API_PRIORITY_OTHER;
        this.f85490d = bArr;
        this.f85492f = i11 + i10;
        this.f85494h = i10;
        this.f85495i = i10;
        this.f85491e = z10;
    }

    private final void f() {
        int i10 = this.f85492f + this.f85493g;
        this.f85492f = i10;
        int i11 = i10 - this.f85495i;
        int i12 = this.f85496j;
        if (i11 <= i12) {
            this.f85493g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f85493g = i13;
        this.f85492f = i10 - i13;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11201u0
    public final int c(int i10) throws zzjk {
        if (i10 < 0) {
            throw zzjk.b();
        }
        int iE = i10 + e();
        int i11 = this.f85496j;
        if (iE > i11) {
            throw zzjk.a();
        }
        this.f85496j = iE;
        f();
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11201u0
    public final int e() {
        return this.f85494h - this.f85495i;
    }
}
