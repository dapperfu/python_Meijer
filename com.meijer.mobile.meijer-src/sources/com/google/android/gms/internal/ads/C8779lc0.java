package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.lc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8779lc0 implements AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C6980Jc0 f76711a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76712b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76713c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f76714d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f76715e;

    /* renamed from: f, reason: collision with root package name */
    private final C7819cc0 f76716f;

    /* renamed from: g, reason: collision with root package name */
    private final long f76717g;

    /* renamed from: h, reason: collision with root package name */
    private final int f76718h;

    public final C7386Vc0 a(int i10) {
        C7386Vc0 c7386Vc0;
        try {
            c7386Vc0 = (C7386Vc0) this.f76714d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            d(2009, this.f76717g, e10);
            c7386Vc0 = null;
        }
        d(3004, this.f76717g, null);
        if (c7386Vc0 != null) {
            if (c7386Vc0.f71737c == 7) {
                C7819cc0.g(3);
            } else {
                C7819cc0.g(2);
            }
        }
        return c7386Vc0 == null ? new C7386Vc0(null, 1) : c7386Vc0;
    }

    public final void b() {
        C6980Jc0 c6980Jc0 = this.f76711a;
        if (c6980Jc0 != null) {
            if (c6980Jc0.isConnected() || this.f76711a.isConnecting()) {
                this.f76711a.disconnect();
            }
        }
    }

    protected final C7149Oc0 c() {
        try {
            return this.f76711a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) throws InterruptedException {
        try {
            d(4012, this.f76717g, null);
            this.f76714d.put(new C7386Vc0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            d(4011, this.f76717g, null);
            this.f76714d.put(new C7386Vc0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public C8779lc0(Context context, int i10, int i11, String str, String str2, String str3, C7819cc0 c7819cc0) {
        this.f76712b = str;
        this.f76718h = i11;
        this.f76713c = str2;
        this.f76716f = c7819cc0;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f76715e = handlerThread;
        handlerThread.start();
        this.f76717g = System.currentTimeMillis();
        C6980Jc0 c6980Jc0 = new C6980Jc0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f76711a = c6980Jc0;
        this.f76714d = new LinkedBlockingQueue();
        c6980Jc0.checkAvailabilityAndConnect();
    }

    private final void d(int i10, long j10, Exception exc) {
        this.f76716f.c(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        C7149Oc0 c7149Oc0C = c();
        if (c7149Oc0C != null) {
            try {
                C7386Vc0 c7386Vc0M6 = c7149Oc0C.m6(new C7319Tc0(1, this.f76718h, this.f76712b, this.f76713c));
                d(5011, this.f76717g, null);
                this.f76714d.put(c7386Vc0M6);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
