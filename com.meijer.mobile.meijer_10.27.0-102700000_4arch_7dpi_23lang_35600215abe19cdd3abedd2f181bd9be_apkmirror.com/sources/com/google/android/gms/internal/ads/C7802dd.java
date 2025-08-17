package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7802dd {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f73435a;

    /* renamed from: b, reason: collision with root package name */
    private int f73436b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8015fd f73437c;

    /* synthetic */ C7802dd(C8015fd c8015fd, byte[] bArr, C7908ed c7908ed) {
        this.f73437c = c8015fd;
        this.f73435a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            C8015fd c8015fd = this.f73437c;
            if (c8015fd.f74131b) {
                c8015fd.f74130a.zzj(this.f73435a);
                this.f73437c.f74130a.zzi(0);
                this.f73437c.f74130a.zzg(this.f73436b);
                this.f73437c.f74130a.zzh(null);
                this.f73437c.f74130a.zzf();
            }
        } catch (RemoteException e10) {
            Qc.p.c("Clearcut log failed", e10);
        }
    }

    public final C7802dd a(int i10) {
        this.f73436b = i10;
        return this;
    }

    public final synchronized void c() {
        this.f73437c.f74132c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cd
            @Override // java.lang.Runnable
            public final void run() {
                this.f73217a.d();
            }
        });
    }
}
