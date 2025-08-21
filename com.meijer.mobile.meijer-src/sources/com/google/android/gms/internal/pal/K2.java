package com.google.android.gms.internal.pal;

import Vd.AbstractC5516j;
import Vd.C5519m;
import android.os.Handler;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public abstract class K2 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f83552a;

    /* renamed from: b, reason: collision with root package name */
    private final C10783e2 f83553b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f83554c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5516j f83555d = C5519m.f(AbstractC10995r6.e());

    abstract AbstractC10995r6 a() throws NonceLoaderException;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f83554c.removeCallbacksAndMessages(null);
        this.f83554c.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.pal.I2
            @Override // java.lang.Runnable
            public final void run() {
                this.f83490a.f();
            }
        }, (this.f83553b.zzd() / 1000) * 1000);
        this.f83555d = C5519m.c(this.f83552a, new Callable() { // from class: com.google.android.gms.internal.pal.J2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f83522a.a();
            }
        });
    }

    public final AbstractC5516j b() {
        if (this.f83555d.q() && !this.f83555d.r()) {
            f();
        }
        return this.f83555d;
    }

    public final void e() {
        this.f83554c.removeCallbacksAndMessages(null);
    }

    K2(Handler handler, ExecutorService executorService, C10783e2 c10783e2) {
        this.f83552a = executorService;
        this.f83554c = handler;
        this.f83553b = c10783e2;
    }

    public final void d() {
        f();
    }
}
