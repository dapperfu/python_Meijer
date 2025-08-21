package com.google.android.gms.maps;

import Md.InterfaceC4116i;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final n f85616a;

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) com.google.android.gms.common.internal.r.m(context, "context must not be null"));
        this.f85616a = new n(this, context, streetViewPanoramaOptions);
    }

    public void a(InterfaceC4116i interfaceC4116i) {
        com.google.android.gms.common.internal.r.m(interfaceC4116i, "callback must not be null");
        com.google.android.gms.common.internal.r.e("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f85616a.v(interfaceC4116i);
    }

    public void c() {
        this.f85616a.f();
    }

    public final void d() {
        this.f85616a.i();
    }

    public final void e() {
        this.f85616a.j();
    }

    public void f() {
        this.f85616a.k();
    }

    public void g() {
        this.f85616a.m();
    }

    public void h() {
        this.f85616a.n();
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            n nVar = this.f85616a;
            nVar.d(bundle);
            if (nVar.b() == null) {
                com.google.android.gms.dynamic.a.o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
