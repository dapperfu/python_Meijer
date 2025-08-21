package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.util.VisibleForTesting;
import id.C14719b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes6.dex */
final class K5 implements AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    protected final M5 f83563a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83564b;

    /* renamed from: c, reason: collision with root package name */
    private final String f83565c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f83566d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f83567e;

    public final B1 b(int i10) {
        B1 b12;
        try {
            b12 = (B1) this.f83566d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            b12 = null;
        }
        return b12 == null ? a() : b12;
    }

    public final void c() {
        M5 m52 = this.f83563a;
        if (m52 != null) {
            if (m52.isConnected() || this.f83563a.isConnecting()) {
                this.f83563a.disconnect();
            }
        }
    }

    protected final R5 d() {
        try {
            return this.f83563a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) throws InterruptedException {
        try {
            this.f83566d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.f83566d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public K5(Context context, String str, String str2) {
        this.f83564b = str;
        this.f83565c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f83567e = handlerThread;
        handlerThread.start();
        M5 m52 = new M5(context, handlerThread.getLooper(), this, this, 9200000);
        this.f83563a = m52;
        this.f83566d = new LinkedBlockingQueue();
        m52.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    static B1 a() {
        Ya yaY = B1.Y();
        yaY.p(32768L);
        return (B1) yaY.j();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        R5 r5D = d();
        if (r5D != null) {
            try {
                try {
                    this.f83566d.put(r5D.Z3(new N5(this.f83564b, this.f83565c)).B());
                } catch (Throwable unused) {
                    this.f83566d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                c();
                this.f83567e.quit();
                throw th2;
            }
            c();
            this.f83567e.quit();
        }
    }
}
