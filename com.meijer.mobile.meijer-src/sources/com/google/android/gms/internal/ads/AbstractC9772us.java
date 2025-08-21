package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9772us implements com.google.android.gms.common.api.i {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f79773a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f79774b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f79775c;

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

    static /* bridge */ /* synthetic */ void a(AbstractC9772us abstractC9772us, String str, Map map) {
        InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) abstractC9772us.f79775c.get();
        if (interfaceC6932Hr != null) {
            interfaceC6932Hr.L("onPrecacheEvent", map);
        }
    }

    public final void d(String str, String str2, String str3, String str4) {
        Sc.g.f34490b.post(new RunnableC9665ts(this, str, str2, str3, str4));
    }

    protected final void e(String str, String str2, int i10) {
        Sc.g.f34490b.post(new RunnableC9451rs(this, str, str2, i10));
    }

    public final void f(String str, String str2, long j10) {
        Sc.g.f34490b.post(new RunnableC9558ss(this, str, str2, j10));
    }

    public final void g(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        Sc.g.f34490b.post(new RunnableC9345qs(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void h(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        Sc.g.f34490b.post(new RunnableC9131os(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public AbstractC9772us(InterfaceC6932Hr interfaceC6932Hr) {
        Context context = interfaceC6932Hr.getContext();
        this.f79773a = context;
        this.f79774b = Nc.v.t().H(context, interfaceC6932Hr.zzn().f34479a);
        this.f79775c = new WeakReference(interfaceC6932Hr);
    }

    public boolean o(String str, String[] strArr) {
        return n(str);
    }

    public boolean r(String str, String[] strArr, C8810ls c8810ls) {
        return n(str);
    }
}
