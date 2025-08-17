package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Br, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6603Br {

    /* renamed from: b, reason: collision with root package name */
    private long f65607b;

    /* renamed from: a, reason: collision with root package name */
    private final long f65606a = TimeUnit.MILLISECONDS.toNanos(((Long) Mc.A.c().a(C8659lf.f76110Q)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f65608c = true;

    public final void b() {
        this.f65608c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, final InterfaceC8897nr interfaceC8897nr) {
        if (interfaceC8897nr == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f65608c) {
            long j10 = timestamp - this.f65607b;
            if (Math.abs(j10) < this.f65606a) {
                return;
            }
        }
        this.f65608c = false;
        this.f65607b = timestamp;
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ar
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC8897nr.zzk();
            }
        });
    }

    C6603Br() {
    }
}
