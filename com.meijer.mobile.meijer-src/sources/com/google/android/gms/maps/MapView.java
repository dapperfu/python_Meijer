package com.google.android.gms.maps;

import Md.InterfaceC4114g;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final g f85604a;

    public void a(InterfaceC4114g interfaceC4114g) {
        com.google.android.gms.common.internal.r.e("getMapAsync() must be called on the main thread");
        com.google.android.gms.common.internal.r.m(interfaceC4114g, "callback must not be null.");
        this.f85604a.v(interfaceC4114g);
    }

    public void c() {
        this.f85604a.f();
    }

    public void d() {
        this.f85604a.i();
    }

    public void e() {
        this.f85604a.j();
    }

    public void f() {
        this.f85604a.k();
    }

    public void g() {
        this.f85604a.m();
    }

    public void h() {
        this.f85604a.n();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f85604a = new g(this, context, googleMapOptions);
        setClickable(true);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            g gVar = this.f85604a;
            gVar.d(bundle);
            if (gVar.b() == null) {
                com.google.android.gms.dynamic.a.o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
