package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9647us implements com.google.android.gms.common.api.i {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f78933a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f78934b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f78935c;

    public abstract void b();

    protected void i(int i10) {
    }

    protected void j(int i10) {
    }

    protected void k(int i10) {
    }

    protected void m(int i10) {
    }

    public abstract boolean n(String str);

    @Override // com.google.android.gms.common.api.i
    public void release() {
    }

    static /* bridge */ /* synthetic */ void a(AbstractC9647us abstractC9647us, String str, Map map) {
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) abstractC9647us.f78935c.get();
        if (interfaceC6807Hr != null) {
            interfaceC6807Hr.L("onPrecacheEvent", map);
        }
    }

    public final void d(String str, String str2, String str3, String str4) {
        Qc.g.f29940b.post(new RunnableC9540ts(this, str, str2, str3, str4));
    }

    protected final void e(String str, String str2, int i10) {
        Qc.g.f29940b.post(new RunnableC9326rs(this, str, str2, i10));
    }

    public final void f(String str, String str2, long j10) {
        Qc.g.f29940b.post(new RunnableC9433ss(this, str, str2, j10));
    }

    public final void g(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        Qc.g.f29940b.post(new RunnableC9220qs(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void h(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        Qc.g.f29940b.post(new RunnableC9006os(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public AbstractC9647us(InterfaceC6807Hr interfaceC6807Hr) {
        Context context = interfaceC6807Hr.getContext();
        this.f78933a = context;
        this.f78934b = Lc.v.t().H(context, interfaceC6807Hr.zzn().f29929a);
        this.f78935c = new WeakReference(interfaceC6807Hr);
    }

    public boolean o(String str, String[] strArr) {
        return n(str);
    }

    public boolean r(String str, String[] strArr, C8685ls c8685ls) {
        return n(str);
    }
}
