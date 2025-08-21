package com.google.android.gms.cloudmessaging;

import Vd.AbstractC5516j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import rd.ThreadFactoryC16893b;
import zd.C18474e;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static l f65556e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f65557a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f65558b;

    /* renamed from: c, reason: collision with root package name */
    private g f65559c = new g(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f65560d = 1;

    private final synchronized int f() {
        int i10;
        i10 = this.f65560d;
        this.f65560d = i10 + 1;
        return i10;
    }

    private final synchronized AbstractC5516j g(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                FS.log_d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!this.f65559c.g(jVar)) {
                g gVar = new g(this, null);
                this.f65559c = gVar;
                gVar.g(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f65553b.a();
    }

    public static synchronized l b(Context context) {
        try {
            if (f65556e == null) {
                C18474e.a();
                f65556e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC16893b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65556e;
    }

    public final AbstractC5516j c(int i10, Bundle bundle) {
        return g(new i(f(), i10, bundle));
    }

    public final AbstractC5516j d(int i10, Bundle bundle) {
        return g(new k(f(), i10, bundle));
    }

    l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f65558b = scheduledExecutorService;
        this.f65557a = context.getApplicationContext();
    }
}
