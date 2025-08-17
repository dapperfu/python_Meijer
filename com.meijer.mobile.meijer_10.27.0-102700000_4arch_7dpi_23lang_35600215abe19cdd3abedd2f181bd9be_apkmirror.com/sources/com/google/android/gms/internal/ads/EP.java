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
    private static EP f66454e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f66455a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f66456b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f66457c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f66458d = 0;

    public static synchronized EP b(Context context) {
        try {
            if (f66454e == null) {
                f66454e = new EP(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f66454e;
    }

    static /* synthetic */ void c(EP ep2, int i10) throws Throwable {
        synchronized (ep2.f66457c) {
            try {
                if (ep2.f66458d == i10) {
                    return;
                }
                ep2.f66458d = i10;
                Iterator it = ep2.f66456b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C8097gH0 c8097gH0 = (C8097gH0) weakReference.get();
                    if (c8097gH0 != null) {
                        c8097gH0.f74292a.h(i10);
                    } else {
                        ep2.f66456b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f66457c) {
            i10 = this.f66458d;
        }
        return i10;
    }

    public final void d(final C8097gH0 c8097gH0) {
        Iterator it = this.f66456b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f66456b.remove(weakReference);
            }
        }
        this.f66456b.add(new WeakReference(c8097gH0));
        this.f66455a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.AN
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                c8097gH0.f74292a.h(this.f65121a.a());
            }
        });
    }

    private EP(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new DO(this, null), intentFilter);
    }
}
