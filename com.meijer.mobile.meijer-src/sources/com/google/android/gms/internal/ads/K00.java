package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class K00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f68849a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f68850b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f68851c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f68852d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f68853e;

    public K00(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f68849a = str;
        this.f68850b = z10;
        this.f68851c = z11;
        this.f68852d = z12;
        this.f68853e = z13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65929b;
        if (!this.f68849a.isEmpty()) {
            bundle.putString("inspector_extras", this.f68849a);
        }
        bundle.putInt("test_mode", this.f68850b ? 1 : 0);
        bundle.putInt("linked_device", this.f68851c ? 1 : 0);
        if (this.f68850b || this.f68851c) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77211i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f68853e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        if (!this.f68849a.isEmpty()) {
            bundle.putString("inspector_extras", this.f68849a);
        }
        bundle.putInt("test_mode", this.f68850b ? 1 : 0);
        bundle.putInt("linked_device", this.f68851c ? 1 : 0);
        if (this.f68850b || this.f68851c) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77155e9)).booleanValue()) {
                bundle.putInt("risd", !this.f68852d ? 1 : 0);
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f77211i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f68853e);
            }
        }
    }
}
