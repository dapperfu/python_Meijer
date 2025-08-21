package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes6.dex */
public abstract class zzcay extends TextureView implements InterfaceC7034Kr {

    /* renamed from: a, reason: collision with root package name */
    protected final C6728Br f81439a;

    /* renamed from: b, reason: collision with root package name */
    protected final Lr f81440b;

    public void a(int i10) {
    }

    public void b(int i10) {
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract long j();

    public abstract long k();

    public abstract String l();

    public abstract void m();

    public abstract void n();

    public abstract void o(int i10);

    public abstract void p(InterfaceC9022nr interfaceC9022nr);

    public abstract void q(String str);

    public abstract void r();

    public abstract void s(float f10, float f11);

    public Integer t() {
        return null;
    }

    public void u(int i10) {
    }

    public void v(int i10) {
    }

    public void w(int i10) {
    }

    public abstract void zzn();

    public zzcay(Context context) {
        super(context);
        this.f81439a = new C6728Br();
        this.f81440b = new Lr(context, this);
    }

    public void c(String str, String[] strArr, Integer num) {
        q(str);
    }
}
