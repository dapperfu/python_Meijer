package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class H4 extends I4 {

    /* renamed from: b, reason: collision with root package name */
    private int f82620b;

    /* renamed from: c, reason: collision with root package name */
    private int f82621c;

    /* renamed from: d, reason: collision with root package name */
    private int f82622d;

    /* synthetic */ H4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f82622d = a.e.API_PRIORITY_OTHER;
        this.f82620b = 0;
    }

    public final int c(int i10) throws zzmr {
        int i11 = this.f82622d;
        this.f82622d = 0;
        int i12 = this.f82620b + this.f82621c;
        this.f82620b = i12;
        if (i12 <= 0) {
            this.f82621c = 0;
            return i11;
        }
        this.f82621c = i12;
        this.f82620b = 0;
        return i11;
    }
}
