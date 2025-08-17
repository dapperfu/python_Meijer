package com.google.android.gms.maps;

import Kd.InterfaceC3949g;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final g f84764a;

    public void a(InterfaceC3949g interfaceC3949g) {
        com.google.android.gms.common.internal.r.e("getMapAsync() must be called on the main thread");
        com.google.android.gms.common.internal.r.m(interfaceC3949g, "callback must not be null.");
        this.f84764a.v(interfaceC3949g);
    }

    public void c() {
        this.f84764a.f();
    }

    public void d() {
        this.f84764a.i();
    }

    public void e() {
        this.f84764a.j();
    }

    public void f() {
        this.f84764a.k();
    }

    public void g() {
        this.f84764a.m();
    }

    public void h() {
        this.f84764a.n();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f84764a = new g(this, context, googleMapOptions);
        setClickable(true);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            g gVar = this.f84764a;
            gVar.d(bundle);
            if (gVar.b() == null) {
                com.google.android.gms.dynamic.a.o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
