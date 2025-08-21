package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7927dd {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f74275a;

    /* renamed from: b, reason: collision with root package name */
    private int f74276b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8140fd f74277c;

    /* synthetic */ C7927dd(C8140fd c8140fd, byte[] bArr, C8033ed c8033ed) {
        this.f74277c = c8140fd;
        this.f74275a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            C8140fd c8140fd = this.f74277c;
            if (c8140fd.f74971b) {
                c8140fd.f74970a.zzj(this.f74275a);
                this.f74277c.f74970a.zzi(0);
                this.f74277c.f74970a.zzg(this.f74276b);
                this.f74277c.f74970a.zzh(null);
                this.f74277c.f74970a.zzf();
            }
        } catch (RemoteException e10) {
            Sc.p.c("Clearcut log failed", e10);
        }
    }

    public final C7927dd a(int i10) {
        this.f74276b = i10;
        return this;
    }

    public final synchronized void c() {
        this.f74277c.f74972c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cd
            @Override // java.lang.Runnable
            public final void run() {
                this.f74057a.d();
            }
        });
    }
}
