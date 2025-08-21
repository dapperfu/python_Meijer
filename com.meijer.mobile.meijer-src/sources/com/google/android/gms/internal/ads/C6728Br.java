package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Br, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6728Br {

    /* renamed from: b, reason: collision with root package name */
    private long f66447b;

    /* renamed from: a, reason: collision with root package name */
    private final long f66446a = TimeUnit.MILLISECONDS.toNanos(((Long) Oc.A.c().a(C8784lf.f76950Q)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f66448c = true;

    public final void b() {
        this.f66448c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, final InterfaceC9022nr interfaceC9022nr) {
        if (interfaceC9022nr == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f66448c) {
            long j10 = timestamp - this.f66447b;
            if (Math.abs(j10) < this.f66446a) {
                return;
            }
        }
        this.f66448c = false;
        this.f66447b = timestamp;
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ar
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9022nr.zzk();
            }
        });
    }

    C6728Br() {
    }
}
