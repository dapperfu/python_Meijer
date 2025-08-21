package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7019Kf extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f68979b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private Context f68980c;

    /* renamed from: d, reason: collision with root package name */
    private C9937wN f68981d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f68982e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.browser.customtabs.c f68983f;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f68983f = null;
        this.f68982e = null;
    }

    private final void h(Context context) {
        String strC;
        if (this.f68983f != null || context == null || (strC = androidx.browser.customtabs.c.c(context, null)) == null) {
            return;
        }
        androidx.browser.customtabs.c.a(context, strC, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.f68983f = cVar;
        cVar.g(0L);
        this.f68982e = cVar.e(new C6985Jf(this));
    }

    public final androidx.browser.customtabs.f c() {
        if (this.f68982e == null) {
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.If
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68498a.e();
                }
            });
        }
        return this.f68982e;
    }

    public final void d(Context context, C9937wN c9937wN) {
        if (this.f68979b.getAndSet(true)) {
            return;
        }
        this.f68980c = context;
        this.f68981d = c9937wN;
        h(context);
    }

    final /* synthetic */ void e() {
        h(this.f68980c);
    }

    final /* synthetic */ void f(int i10) {
        C9937wN c9937wN = this.f68981d;
        if (c9937wN != null) {
            C9830vN c9830vNA = c9937wN.a();
            c9830vNA.b("action", "cct_nav");
            c9830vNA.b("cct_navs", String.valueOf(i10));
            c9830vNA.g();
        }
    }

    public final void g(final int i10) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76801F4)).booleanValue() || this.f68981d == null) {
            return;
        }
        C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hf
            @Override // java.lang.Runnable
            public final void run() {
                this.f68321a.f(i10);
            }
        });
    }
}
