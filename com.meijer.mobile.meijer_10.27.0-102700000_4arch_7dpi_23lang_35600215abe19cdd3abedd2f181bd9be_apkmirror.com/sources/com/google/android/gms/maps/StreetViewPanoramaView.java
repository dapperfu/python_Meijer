package com.google.android.gms.maps;

import Kd.InterfaceC3951i;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final n f84776a;

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) com.google.android.gms.common.internal.r.m(context, "context must not be null"));
        this.f84776a = new n(this, context, streetViewPanoramaOptions);
    }

    public void a(InterfaceC3951i interfaceC3951i) {
        com.google.android.gms.common.internal.r.m(interfaceC3951i, "callback must not be null");
        com.google.android.gms.common.internal.r.e("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f84776a.v(interfaceC3951i);
    }

    public void c() {
        this.f84776a.f();
    }

    public final void d() {
        this.f84776a.i();
    }

    public final void e() {
        this.f84776a.j();
    }

    public void f() {
        this.f84776a.k();
    }

    public void g() {
        this.f84776a.m();
    }

    public void h() {
        this.f84776a.n();
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            n nVar = this.f84776a;
            nVar.d(bundle);
            if (nVar.b() == null) {
                com.google.android.gms.dynamic.a.o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
