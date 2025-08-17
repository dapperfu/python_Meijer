package com.google.android.gms.internal.pal;

import Td.AbstractC5232j;
import Td.C5235m;
import android.os.Handler;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public abstract class K2 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f82712a;

    /* renamed from: b, reason: collision with root package name */
    private final C10658e2 f82713b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f82714c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5232j f82715d = C5235m.f(AbstractC10870r6.e());

    abstract AbstractC10870r6 a() throws NonceLoaderException;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f82714c.removeCallbacksAndMessages(null);
        this.f82714c.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.pal.I2
            @Override // java.lang.Runnable
            public final void run() {
                this.f82650a.f();
            }
        }, (this.f82713b.zzd() / 1000) * 1000);
        this.f82715d = C5235m.c(this.f82712a, new Callable() { // from class: com.google.android.gms.internal.pal.J2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f82682a.a();
            }
        });
    }

    public final AbstractC5232j b() {
        if (this.f82715d.q() && !this.f82715d.r()) {
            f();
        }
        return this.f82715d;
    }

    public final void e() {
        this.f82714c.removeCallbacksAndMessages(null);
    }

    K2(Handler handler, ExecutorService executorService, C10658e2 c10658e2) {
        this.f82712a = executorService;
        this.f82714c = handler;
        this.f82713b = c10658e2;
    }

    public final void d() {
        f();
    }
}
