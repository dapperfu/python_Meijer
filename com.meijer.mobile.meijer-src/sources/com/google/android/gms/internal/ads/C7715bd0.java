package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7715bd0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f73679a;

    /* renamed from: b, reason: collision with root package name */
    private int f73680b;

    /* renamed from: c, reason: collision with root package name */
    private int f73681c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7928dd0 f73682d;

    /* synthetic */ C7715bd0(C7928dd0 c7928dd0, byte[] bArr, C7821cd0 c7821cd0) {
        this.f73682d = c7928dd0;
        this.f73679a = bArr;
    }

    public final C7715bd0 a(int i10) {
        this.f73681c = i10;
        return this;
    }

    public final C7715bd0 b(int i10) {
        this.f73680b = i10;
        return this;
    }

    public final synchronized void c() {
        try {
            C7928dd0 c7928dd0 = this.f73682d;
            if (c7928dd0.f74279b) {
                c7928dd0.f74278a.zzj(this.f73679a);
                this.f73682d.f74278a.zzi(this.f73680b);
                this.f73682d.f74278a.zzg(this.f73681c);
                this.f73682d.f74278a.zzh(null);
                this.f73682d.f74278a.zzf();
            }
        } catch (RemoteException e10) {
            com.fullstory.FS.log_d("GASS", "Clearcut log failed", e10);
        }
    }
}
