package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.lc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8654lc0 implements AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C6855Jc0 f75871a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75872b;

    /* renamed from: c, reason: collision with root package name */
    private final String f75873c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f75874d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f75875e;

    /* renamed from: f, reason: collision with root package name */
    private final C7694cc0 f75876f;

    /* renamed from: g, reason: collision with root package name */
    private final long f75877g;

    /* renamed from: h, reason: collision with root package name */
    private final int f75878h;

    public final C7261Vc0 a(int i10) {
        C7261Vc0 c7261Vc0;
        try {
            c7261Vc0 = (C7261Vc0) this.f75874d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            d(2009, this.f75877g, e10);
            c7261Vc0 = null;
        }
        d(3004, this.f75877g, null);
        if (c7261Vc0 != null) {
            if (c7261Vc0.f70897c == 7) {
                C7694cc0.g(3);
            } else {
                C7694cc0.g(2);
            }
        }
        return c7261Vc0 == null ? new C7261Vc0(null, 1) : c7261Vc0;
    }

    public final void b() {
        C6855Jc0 c6855Jc0 = this.f75871a;
        if (c6855Jc0 != null) {
            if (c6855Jc0.isConnected() || this.f75871a.isConnecting()) {
                this.f75871a.disconnect();
            }
        }
    }

    protected final C7024Oc0 c() {
        try {
            return this.f75871a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) throws InterruptedException {
        try {
            d(4012, this.f75877g, null);
            this.f75874d.put(new C7261Vc0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            d(4011, this.f75877g, null);
            this.f75874d.put(new C7261Vc0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public C8654lc0(Context context, int i10, int i11, String str, String str2, String str3, C7694cc0 c7694cc0) {
        this.f75872b = str;
        this.f75878h = i11;
        this.f75873c = str2;
        this.f75876f = c7694cc0;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f75875e = handlerThread;
        handlerThread.start();
        this.f75877g = System.currentTimeMillis();
        C6855Jc0 c6855Jc0 = new C6855Jc0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f75871a = c6855Jc0;
        this.f75874d = new LinkedBlockingQueue();
        c6855Jc0.checkAvailabilityAndConnect();
    }

    private final void d(int i10, long j10, Exception exc) {
        this.f75876f.c(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        C7024Oc0 c7024Oc0C = c();
        if (c7024Oc0C != null) {
            try {
                C7261Vc0 c7261Vc0W5 = c7024Oc0C.W5(new C7194Tc0(1, this.f75878h, this.f75872b, this.f75873c));
                d(5011, this.f75877g, null);
                this.f75874d.put(c7261Vc0W5);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
