package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class L extends J {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f81138d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81139e;

    /* renamed from: f, reason: collision with root package name */
    private int f81140f;

    /* renamed from: g, reason: collision with root package name */
    private int f81141g;

    /* renamed from: h, reason: collision with root package name */
    private int f81142h;

    /* renamed from: i, reason: collision with root package name */
    private int f81143i;

    /* renamed from: j, reason: collision with root package name */
    private int f81144j;

    private L(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f81144j = a.e.API_PRIORITY_OTHER;
        this.f81138d = bArr;
        this.f81140f = i11 + i10;
        this.f81142h = i10;
        this.f81143i = i10;
        this.f81139e = z10;
    }

    @Override // com.google.android.gms.internal.clearcut.J
    public final int c() {
        return this.f81142h - this.f81143i;
    }

    @Override // com.google.android.gms.internal.clearcut.J
    public final int d(int i10) throws zzco {
        if (i10 < 0) {
            throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iC = i10 + c();
        int i11 = this.f81144j;
        if (iC > i11) {
            throw zzco.a();
        }
        this.f81144j = iC;
        int i12 = this.f81140f + this.f81141g;
        this.f81140f = i12;
        int i13 = i12 - this.f81143i;
        if (i13 <= iC) {
            this.f81141g = 0;
            return i11;
        }
        int i14 = i13 - iC;
        this.f81141g = i14;
        this.f81140f = i12 - i14;
        return i11;
    }
}
