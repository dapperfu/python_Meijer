package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10254s0 extends C10260u0 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f81036b;

    /* renamed from: c, reason: collision with root package name */
    private int f81037c;

    /* renamed from: d, reason: collision with root package name */
    private int f81038d;

    /* renamed from: e, reason: collision with root package name */
    private int f81039e;

    /* synthetic */ C10254s0(byte[] bArr, int i10, int i11, boolean z10, C10251r0 c10251r0) {
        super(null);
        this.f81039e = a.e.API_PRIORITY_OTHER;
        this.f81036b = bArr;
        this.f81037c = 0;
    }

    public final int a(int i10) throws zzdr {
        int i11 = this.f81039e;
        this.f81039e = 0;
        int i12 = this.f81037c + this.f81038d;
        this.f81037c = i12;
        if (i12 <= 0) {
            this.f81038d = 0;
            return i11;
        }
        this.f81038d = i12;
        this.f81037c = 0;
        return i11;
    }
}
