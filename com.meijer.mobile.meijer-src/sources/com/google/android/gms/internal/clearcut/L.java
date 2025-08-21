package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class L extends J {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f81978d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81979e;

    /* renamed from: f, reason: collision with root package name */
    private int f81980f;

    /* renamed from: g, reason: collision with root package name */
    private int f81981g;

    /* renamed from: h, reason: collision with root package name */
    private int f81982h;

    /* renamed from: i, reason: collision with root package name */
    private int f81983i;

    /* renamed from: j, reason: collision with root package name */
    private int f81984j;

    private L(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f81984j = a.e.API_PRIORITY_OTHER;
        this.f81978d = bArr;
        this.f81980f = i11 + i10;
        this.f81982h = i10;
        this.f81983i = i10;
        this.f81979e = z10;
    }

    @Override // com.google.android.gms.internal.clearcut.J
    public final int c() {
        return this.f81982h - this.f81983i;
    }

    @Override // com.google.android.gms.internal.clearcut.J
    public final int d(int i10) throws zzco {
        if (i10 < 0) {
            throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iC = i10 + c();
        int i11 = this.f81984j;
        if (iC > i11) {
            throw zzco.a();
        }
        this.f81984j = iC;
        int i12 = this.f81980f + this.f81981g;
        this.f81980f = i12;
        int i13 = i12 - this.f81983i;
        if (i13 <= iC) {
            this.f81981g = 0;
            return i11;
        }
        int i14 = i13 - iC;
        this.f81981g = i14;
        this.f81980f = i12 - i14;
        return i11;
    }
}
