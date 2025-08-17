package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.vision.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11079v0 extends AbstractC11076u0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f84650d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f84651e;

    /* renamed from: f, reason: collision with root package name */
    private int f84652f;

    /* renamed from: g, reason: collision with root package name */
    private int f84653g;

    /* renamed from: h, reason: collision with root package name */
    private int f84654h;

    /* renamed from: i, reason: collision with root package name */
    private int f84655i;

    /* renamed from: j, reason: collision with root package name */
    private int f84656j;

    private C11079v0(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f84656j = a.e.API_PRIORITY_OTHER;
        this.f84650d = bArr;
        this.f84652f = i11 + i10;
        this.f84654h = i10;
        this.f84655i = i10;
        this.f84651e = z10;
    }

    private final void f() {
        int i10 = this.f84652f + this.f84653g;
        this.f84652f = i10;
        int i11 = i10 - this.f84655i;
        int i12 = this.f84656j;
        if (i11 <= i12) {
            this.f84653g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f84653g = i13;
        this.f84652f = i10 - i13;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11076u0
    public final int c(int i10) throws zzjk {
        if (i10 < 0) {
            throw zzjk.b();
        }
        int iE = i10 + e();
        int i11 = this.f84656j;
        if (iE > i11) {
            throw zzjk.a();
        }
        this.f84656j = iE;
        f();
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11076u0
    public final int e() {
        return this.f84654h - this.f84655i;
    }
}
