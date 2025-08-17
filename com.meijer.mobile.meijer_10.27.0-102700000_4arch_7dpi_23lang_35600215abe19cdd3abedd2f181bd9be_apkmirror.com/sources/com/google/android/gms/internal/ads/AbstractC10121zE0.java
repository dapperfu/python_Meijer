package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.zE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10121zE0 implements InterfaceC7666cF0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f80380a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f80381b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final C8519kF0 f80382c = new C8519kF0();

    /* renamed from: d, reason: collision with root package name */
    private final C9798wD0 f80383d = new C9798wD0();

    /* renamed from: e, reason: collision with root package name */
    private Looper f80384e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC7307Wl f80385f;

    /* renamed from: g, reason: collision with root package name */
    private C7980fC0 f80386g;

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public abstract /* synthetic */ void b(H7 h72);

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public /* synthetic */ AbstractC7307Wl m() {
        return null;
    }

    protected final C9798wD0 q(C7453aF0 c7453aF0) {
        return this.f80383d.a(0, c7453aF0);
    }

    protected final C9798wD0 r(int i10, C7453aF0 c7453aF0) {
        return this.f80383d.a(0, c7453aF0);
    }

    protected final C8519kF0 s(C7453aF0 c7453aF0) {
        return this.f80382c.a(0, c7453aF0);
    }

    protected final C8519kF0 t(int i10, C7453aF0 c7453aF0) {
        return this.f80382c.a(0, c7453aF0);
    }

    protected void u() {
    }

    protected void v() {
    }

    protected abstract void w(Pu0 pu0);

    protected abstract void y();

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public /* synthetic */ boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void d(InterfaceC7560bF0 interfaceC7560bF0) {
        boolean zIsEmpty = this.f80381b.isEmpty();
        this.f80381b.remove(interfaceC7560bF0);
        if (zIsEmpty || !this.f80381b.isEmpty()) {
            return;
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void e(InterfaceC9905xD0 interfaceC9905xD0) {
        this.f80383d.c(interfaceC9905xD0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void f(Handler handler, InterfaceC8626lF0 interfaceC8626lF0) {
        this.f80382c.b(handler, interfaceC8626lF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void g(InterfaceC7560bF0 interfaceC7560bF0) {
        this.f80380a.remove(interfaceC7560bF0);
        if (!this.f80380a.isEmpty()) {
            d(interfaceC7560bF0);
            return;
        }
        this.f80384e = null;
        this.f80385f = null;
        this.f80386g = null;
        this.f80381b.clear();
        y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void l(InterfaceC8626lF0 interfaceC8626lF0) {
        this.f80382c.i(interfaceC8626lF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void n(InterfaceC7560bF0 interfaceC7560bF0) {
        this.f80384e.getClass();
        HashSet hashSet = this.f80381b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC7560bF0);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void o(Handler handler, InterfaceC9905xD0 interfaceC9905xD0) {
        this.f80383d.b(handler, interfaceC9905xD0);
    }

    protected final C7980fC0 p() {
        C7980fC0 c7980fC0 = this.f80386g;
        C8086gC.b(c7980fC0);
        return c7980fC0;
    }

    protected final void x(AbstractC7307Wl abstractC7307Wl) {
        this.f80385f = abstractC7307Wl;
        ArrayList arrayList = this.f80380a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC7560bF0) arrayList.get(i10)).a(this, abstractC7307Wl);
        }
    }

    protected final boolean z() {
        return !this.f80381b.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void i(InterfaceC7560bF0 interfaceC7560bF0, Pu0 pu0, C7980fC0 c7980fC0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f80384e;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f80386g = c7980fC0;
        AbstractC7307Wl abstractC7307Wl = this.f80385f;
        this.f80380a.add(interfaceC7560bF0);
        if (this.f80384e == null) {
            this.f80384e = looperMyLooper;
            this.f80381b.add(interfaceC7560bF0);
            w(pu0);
        } else if (abstractC7307Wl != null) {
            n(interfaceC7560bF0);
            interfaceC7560bF0.a(this, abstractC7307Wl);
        }
    }
}
