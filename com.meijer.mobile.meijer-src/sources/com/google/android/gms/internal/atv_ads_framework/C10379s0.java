package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10379s0 extends C10385u0 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f81876b;

    /* renamed from: c, reason: collision with root package name */
    private int f81877c;

    /* renamed from: d, reason: collision with root package name */
    private int f81878d;

    /* renamed from: e, reason: collision with root package name */
    private int f81879e;

    /* synthetic */ C10379s0(byte[] bArr, int i10, int i11, boolean z10, C10376r0 c10376r0) {
        super(null);
        this.f81879e = a.e.API_PRIORITY_OTHER;
        this.f81876b = bArr;
        this.f81877c = 0;
    }

    public final int a(int i10) throws zzdr {
        int i11 = this.f81879e;
        this.f81879e = 0;
        int i12 = this.f81877c + this.f81878d;
        this.f81877c = i12;
        if (i12 <= 0) {
            this.f81878d = 0;
            return i11;
        }
        this.f81878d = i12;
        this.f81877c = 0;
        return i11;
    }
}
