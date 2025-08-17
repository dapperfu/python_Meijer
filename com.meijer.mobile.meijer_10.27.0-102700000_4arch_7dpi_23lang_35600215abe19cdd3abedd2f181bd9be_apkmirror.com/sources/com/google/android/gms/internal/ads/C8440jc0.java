package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8440jc0 implements AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C6855Jc0 f75462a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75463b;

    /* renamed from: c, reason: collision with root package name */
    private final String f75464c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f75465d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f75466e;

    public final H8 b(int i10) {
        H8 h82;
        try {
            h82 = (H8) this.f75465d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            h82 = null;
        }
        return h82 == null ? a() : h82;
    }

    public final void c() {
        C6855Jc0 c6855Jc0 = this.f75462a;
        if (c6855Jc0 != null) {
            if (c6855Jc0.isConnected() || this.f75462a.isConnecting()) {
                this.f75462a.disconnect();
            }
        }
    }

    protected final C7024Oc0 d() {
        try {
            return this.f75462a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) throws InterruptedException {
        try {
            this.f75465d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.f75465d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public C8440jc0(Context context, String str, String str2) {
        this.f75463b = str;
        this.f75464c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f75466e = handlerThread;
        handlerThread.start();
        C6855Jc0 c6855Jc0 = new C6855Jc0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f75462a = c6855Jc0;
        this.f75465d = new LinkedBlockingQueue();
        c6855Jc0.checkAvailabilityAndConnect();
    }

    static H8 a() {
        C8611l8 c8611l8B0 = H8.B0();
        c8611l8B0.x(32768L);
        return (H8) c8611l8B0.p();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        C7024Oc0 c7024Oc0D = d();
        if (c7024Oc0D != null) {
            try {
                try {
                    this.f75465d.put(c7024Oc0D.N3(new C6889Kc0(this.f75463b, this.f75464c)).B());
                } catch (Throwable unused) {
                    this.f75465d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                c();
                this.f75466e.quit();
                throw th2;
            }
            c();
            this.f75466e.quit();
        }
    }
}
