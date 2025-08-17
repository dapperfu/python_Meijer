package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class H4 extends I4 {

    /* renamed from: b, reason: collision with root package name */
    private int f81780b;

    /* renamed from: c, reason: collision with root package name */
    private int f81781c;

    /* renamed from: d, reason: collision with root package name */
    private int f81782d;

    /* synthetic */ H4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f81782d = a.e.API_PRIORITY_OTHER;
        this.f81780b = 0;
    }

    public final int c(int i10) throws zzmr {
        int i11 = this.f81782d;
        this.f81782d = 0;
        int i12 = this.f81780b + this.f81781c;
        this.f81780b = i12;
        if (i12 <= 0) {
            this.f81781c = 0;
            return i11;
        }
        this.f81781c = i12;
        this.f81780b = 0;
        return i11;
    }
}
