package com.google.android.gms.cloudmessaging;

import Td.AbstractC5232j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import pd.ThreadFactoryC16289b;
import xd.C18037e;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static l f64716e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f64717a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f64718b;

    /* renamed from: c, reason: collision with root package name */
    private g f64719c = new g(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f64720d = 1;

    private final synchronized int f() {
        int i10;
        i10 = this.f64720d;
        this.f64720d = i10 + 1;
        return i10;
    }

    private final synchronized AbstractC5232j g(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                FS.log_d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!this.f64719c.g(jVar)) {
                g gVar = new g(this, null);
                this.f64719c = gVar;
                gVar.g(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f64713b.a();
    }

    public static synchronized l b(Context context) {
        try {
            if (f64716e == null) {
                C18037e.a();
                f64716e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC16289b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f64716e;
    }

    public final AbstractC5232j c(int i10, Bundle bundle) {
        return g(new i(f(), i10, bundle));
    }

    public final AbstractC5232j d(int i10, Bundle bundle) {
        return g(new k(f(), i10, bundle));
    }

    l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f64718b = scheduledExecutorService;
        this.f64717a = context.getApplicationContext();
    }
}
