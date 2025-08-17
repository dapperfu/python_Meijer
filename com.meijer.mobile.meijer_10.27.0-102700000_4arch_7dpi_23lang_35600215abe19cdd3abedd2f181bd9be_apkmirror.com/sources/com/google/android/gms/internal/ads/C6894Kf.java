package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6894Kf extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f68139b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private Context f68140c;

    /* renamed from: d, reason: collision with root package name */
    private C9812wN f68141d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f68142e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.browser.customtabs.c f68143f;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f68143f = null;
        this.f68142e = null;
    }

    private final void h(Context context) {
        String strC;
        if (this.f68143f != null || context == null || (strC = androidx.browser.customtabs.c.c(context, null)) == null) {
            return;
        }
        androidx.browser.customtabs.c.a(context, strC, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.f68143f = cVar;
        cVar.g(0L);
        this.f68142e = cVar.e(new C6860Jf(this));
    }

    public final androidx.browser.customtabs.f c() {
        if (this.f68142e == null) {
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.If
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67658a.e();
                }
            });
        }
        return this.f68142e;
    }

    public final void d(Context context, C9812wN c9812wN) {
        if (this.f68139b.getAndSet(true)) {
            return;
        }
        this.f68140c = context;
        this.f68141d = c9812wN;
        h(context);
    }

    final /* synthetic */ void e() {
        h(this.f68140c);
    }

    final /* synthetic */ void f(int i10) {
        C9812wN c9812wN = this.f68141d;
        if (c9812wN != null) {
            C9705vN c9705vNA = c9812wN.a();
            c9705vNA.b("action", "cct_nav");
            c9705vNA.b("cct_navs", String.valueOf(i10));
            c9705vNA.g();
        }
    }

    public final void g(final int i10) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f75961F4)).booleanValue() || this.f68141d == null) {
            return;
        }
        C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hf
            @Override // java.lang.Runnable
            public final void run() {
                this.f67481a.f(i10);
            }
        });
    }
}
