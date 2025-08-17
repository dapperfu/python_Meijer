package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class K00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f68009a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f68010b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f68011c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f68012d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f68013e;

    public K00(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f68009a = str;
        this.f68010b = z10;
        this.f68011c = z11;
        this.f68012d = z12;
        this.f68013e = z13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65089b;
        if (!this.f68009a.isEmpty()) {
            bundle.putString("inspector_extras", this.f68009a);
        }
        bundle.putInt("test_mode", this.f68010b ? 1 : 0);
        bundle.putInt("linked_device", this.f68011c ? 1 : 0);
        if (this.f68010b || this.f68011c) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76371i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f68013e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        if (!this.f68009a.isEmpty()) {
            bundle.putString("inspector_extras", this.f68009a);
        }
        bundle.putInt("test_mode", this.f68010b ? 1 : 0);
        bundle.putInt("linked_device", this.f68011c ? 1 : 0);
        if (this.f68010b || this.f68011c) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76315e9)).booleanValue()) {
                bundle.putInt("risd", !this.f68012d ? 1 : 0);
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f76371i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f68013e);
            }
        }
    }
}
