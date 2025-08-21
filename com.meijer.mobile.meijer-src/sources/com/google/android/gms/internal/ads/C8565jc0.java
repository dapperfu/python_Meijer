package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8565jc0 implements AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C6980Jc0 f76302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76303b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76304c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f76305d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f76306e;

    public final H8 b(int i10) {
        H8 h82;
        try {
            h82 = (H8) this.f76305d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            h82 = null;
        }
        return h82 == null ? a() : h82;
    }

    public final void c() {
        C6980Jc0 c6980Jc0 = this.f76302a;
        if (c6980Jc0 != null) {
            if (c6980Jc0.isConnected() || this.f76302a.isConnecting()) {
                this.f76302a.disconnect();
            }
        }
    }

    protected final C7149Oc0 d() {
        try {
            return this.f76302a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) throws InterruptedException {
        try {
            this.f76305d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.f76305d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public C8565jc0(Context context, String str, String str2) {
        this.f76303b = str;
        this.f76304c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f76306e = handlerThread;
        handlerThread.start();
        C6980Jc0 c6980Jc0 = new C6980Jc0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f76302a = c6980Jc0;
        this.f76305d = new LinkedBlockingQueue();
        c6980Jc0.checkAvailabilityAndConnect();
    }

    static H8 a() {
        C8736l8 c8736l8B0 = H8.B0();
        c8736l8B0.x(32768L);
        return (H8) c8736l8B0.p();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        C7149Oc0 c7149Oc0D = d();
        if (c7149Oc0D != null) {
            try {
                try {
                    this.f76305d.put(c7149Oc0D.Z3(new C7014Kc0(this.f76303b, this.f76304c)).B());
                } catch (Throwable unused) {
                    this.f76305d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                c();
                this.f76306e.quit();
                throw th2;
            }
            c();
            this.f76306e.quit();
        }
    }
}
