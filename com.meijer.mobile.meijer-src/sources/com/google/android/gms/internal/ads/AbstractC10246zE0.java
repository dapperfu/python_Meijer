package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.zE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10246zE0 implements InterfaceC7791cF0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f81220a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f81221b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final C8644kF0 f81222c = new C8644kF0();

    /* renamed from: d, reason: collision with root package name */
    private final C9923wD0 f81223d = new C9923wD0();

    /* renamed from: e, reason: collision with root package name */
    private Looper f81224e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC7432Wl f81225f;

    /* renamed from: g, reason: collision with root package name */
    private C8105fC0 f81226g;

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public abstract /* synthetic */ void b(H7 h72);

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public /* synthetic */ AbstractC7432Wl m() {
        return null;
    }

    protected final C9923wD0 q(C7578aF0 c7578aF0) {
        return this.f81223d.a(0, c7578aF0);
    }

    protected final C9923wD0 r(int i10, C7578aF0 c7578aF0) {
        return this.f81223d.a(0, c7578aF0);
    }

    protected final C8644kF0 s(C7578aF0 c7578aF0) {
        return this.f81222c.a(0, c7578aF0);
    }

    protected final C8644kF0 t(int i10, C7578aF0 c7578aF0) {
        return this.f81222c.a(0, c7578aF0);
    }

    protected void u() {
    }

    protected void v() {
    }

    protected abstract void w(Pu0 pu0);

    protected abstract void y();

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public /* synthetic */ boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void d(InterfaceC7685bF0 interfaceC7685bF0) {
        boolean zIsEmpty = this.f81221b.isEmpty();
        this.f81221b.remove(interfaceC7685bF0);
        if (zIsEmpty || !this.f81221b.isEmpty()) {
            return;
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void e(InterfaceC10030xD0 interfaceC10030xD0) {
        this.f81223d.c(interfaceC10030xD0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void f(Handler handler, InterfaceC8751lF0 interfaceC8751lF0) {
        this.f81222c.b(handler, interfaceC8751lF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void g(InterfaceC7685bF0 interfaceC7685bF0) {
        this.f81220a.remove(interfaceC7685bF0);
        if (!this.f81220a.isEmpty()) {
            d(interfaceC7685bF0);
            return;
        }
        this.f81224e = null;
        this.f81225f = null;
        this.f81226g = null;
        this.f81221b.clear();
        y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void l(InterfaceC8751lF0 interfaceC8751lF0) {
        this.f81222c.i(interfaceC8751lF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void n(InterfaceC7685bF0 interfaceC7685bF0) {
        this.f81224e.getClass();
        HashSet hashSet = this.f81221b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC7685bF0);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void o(Handler handler, InterfaceC10030xD0 interfaceC10030xD0) {
        this.f81223d.b(handler, interfaceC10030xD0);
    }

    protected final C8105fC0 p() {
        C8105fC0 c8105fC0 = this.f81226g;
        C8211gC.b(c8105fC0);
        return c8105fC0;
    }

    protected final void x(AbstractC7432Wl abstractC7432Wl) {
        this.f81225f = abstractC7432Wl;
        ArrayList arrayList = this.f81220a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC7685bF0) arrayList.get(i10)).a(this, abstractC7432Wl);
        }
    }

    protected final boolean z() {
        return !this.f81221b.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void i(InterfaceC7685bF0 interfaceC7685bF0, Pu0 pu0, C8105fC0 c8105fC0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f81224e;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f81226g = c8105fC0;
        AbstractC7432Wl abstractC7432Wl = this.f81225f;
        this.f81220a.add(interfaceC7685bF0);
        if (this.f81224e == null) {
            this.f81224e = looperMyLooper;
            this.f81221b.add(interfaceC7685bF0);
            w(pu0);
        } else if (abstractC7432Wl != null) {
            n(interfaceC7685bF0);
            interfaceC7685bF0.a(this, abstractC7432Wl);
        }
    }
}
