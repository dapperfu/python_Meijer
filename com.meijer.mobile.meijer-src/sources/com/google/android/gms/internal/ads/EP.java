package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class EP {

    /* renamed from: e, reason: collision with root package name */
    private static EP f67294e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67295a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f67296b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f67297c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f67298d = 0;

    public static synchronized EP b(Context context) {
        try {
            if (f67294e == null) {
                f67294e = new EP(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f67294e;
    }

    static /* synthetic */ void c(EP ep2, int i10) throws Throwable {
        synchronized (ep2.f67297c) {
            try {
                if (ep2.f67298d == i10) {
                    return;
                }
                ep2.f67298d = i10;
                Iterator it = ep2.f67296b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C8222gH0 c8222gH0 = (C8222gH0) weakReference.get();
                    if (c8222gH0 != null) {
                        c8222gH0.f75132a.h(i10);
                    } else {
                        ep2.f67296b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f67297c) {
            i10 = this.f67298d;
        }
        return i10;
    }

    public final void d(final C8222gH0 c8222gH0) {
        Iterator it = this.f67296b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f67296b.remove(weakReference);
            }
        }
        this.f67296b.add(new WeakReference(c8222gH0));
        this.f67295a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.AN
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                c8222gH0.f75132a.h(this.f65961a.a());
            }
        });
    }

    private EP(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new DO(this, null), intentFilter);
    }
}
