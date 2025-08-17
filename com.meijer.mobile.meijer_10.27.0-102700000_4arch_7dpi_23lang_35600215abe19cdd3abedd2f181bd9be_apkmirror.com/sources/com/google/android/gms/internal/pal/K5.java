package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.util.VisibleForTesting;
import gd.C14243b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes6.dex */
final class K5 implements AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    protected final M5 f82723a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82724b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82725c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f82726d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f82727e;

    public final B1 b(int i10) {
        B1 b12;
        try {
            b12 = (B1) this.f82726d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            b12 = null;
        }
        return b12 == null ? a() : b12;
    }

    public final void c() {
        M5 m52 = this.f82723a;
        if (m52 != null) {
            if (m52.isConnected() || this.f82723a.isConnecting()) {
                this.f82723a.disconnect();
            }
        }
    }

    protected final R5 d() {
        try {
            return this.f82723a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) throws InterruptedException {
        try {
            this.f82726d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.f82726d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public K5(Context context, String str, String str2) {
        this.f82724b = str;
        this.f82725c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f82727e = handlerThread;
        handlerThread.start();
        M5 m52 = new M5(context, handlerThread.getLooper(), this, this, 9200000);
        this.f82723a = m52;
        this.f82726d = new LinkedBlockingQueue();
        m52.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    static B1 a() {
        Ya yaY = B1.Y();
        yaY.p(32768L);
        return (B1) yaY.j();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        R5 r5D = d();
        if (r5D != null) {
            try {
                try {
                    this.f82726d.put(r5D.N3(new N5(this.f82724b, this.f82725c)).B());
                } catch (Throwable unused) {
                    this.f82726d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                c();
                this.f82727e.quit();
                throw th2;
            }
            c();
            this.f82727e.quit();
        }
    }
}
