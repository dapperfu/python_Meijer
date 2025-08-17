package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7590bd0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f72839a;

    /* renamed from: b, reason: collision with root package name */
    private int f72840b;

    /* renamed from: c, reason: collision with root package name */
    private int f72841c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7803dd0 f72842d;

    /* synthetic */ C7590bd0(C7803dd0 c7803dd0, byte[] bArr, C7696cd0 c7696cd0) {
        this.f72842d = c7803dd0;
        this.f72839a = bArr;
    }

    public final C7590bd0 a(int i10) {
        this.f72841c = i10;
        return this;
    }

    public final C7590bd0 b(int i10) {
        this.f72840b = i10;
        return this;
    }

    public final synchronized void c() {
        try {
            C7803dd0 c7803dd0 = this.f72842d;
            if (c7803dd0.f73439b) {
                c7803dd0.f73438a.zzj(this.f72839a);
                this.f72842d.f73438a.zzi(this.f72840b);
                this.f72842d.f73438a.zzg(this.f72841c);
                this.f72842d.f73438a.zzh(null);
                this.f72842d.f73438a.zzf();
            }
        } catch (RemoteException e10) {
            com.fullstory.FS.log_d("GASS", "Clearcut log failed", e10);
        }
    }
}
