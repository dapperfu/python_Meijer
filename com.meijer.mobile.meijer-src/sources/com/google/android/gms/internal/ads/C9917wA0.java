package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9917wA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8105fC0 f80277a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9703uA0 f80281e;

    /* renamed from: h, reason: collision with root package name */
    private final PA0 f80284h;

    /* renamed from: i, reason: collision with root package name */
    private final QH f80285i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f80286j;

    /* renamed from: k, reason: collision with root package name */
    private Pu0 f80287k;

    /* renamed from: l, reason: collision with root package name */
    private WF0 f80288l = new WF0(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f80279c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f80280d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f80278b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f80282f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f80283g = new HashSet();

    public final AbstractC7432Wl c(int i10, int i11, List list) {
        C8211gC.d(i10 >= 0 && i10 <= i11 && i11 <= a());
        C8211gC.d(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((C9596tA0) this.f80278b.get(i12)).f79338a.b((H7) list.get(i12 - i10));
        }
        return b();
    }

    public final boolean j() {
        return this.f80286j;
    }

    public final AbstractC7432Wl m(int i10, int i11, WF0 wf0) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= a()) {
            z10 = true;
        }
        C8211gC.d(z10);
        this.f80288l = wf0;
        w(i10, i11);
        return b();
    }

    public final WF0 q() {
        return this.f80288l;
    }

    private final void r(int i10, int i11) {
        while (i10 < this.f80278b.size()) {
            ((C9596tA0) this.f80278b.get(i10)).f79341d += i11;
            i10++;
        }
    }

    private final void s(C9596tA0 c9596tA0) {
        C9489sA0 c9489sA0 = (C9489sA0) this.f80282f.get(c9596tA0);
        if (c9489sA0 != null) {
            c9489sA0.f79020a.d(c9489sA0.f79021b);
        }
    }

    private final void t() {
        Iterator it = this.f80283g.iterator();
        while (it.hasNext()) {
            C9596tA0 c9596tA0 = (C9596tA0) it.next();
            if (c9596tA0.f79340c.isEmpty()) {
                s(c9596tA0);
                it.remove();
            }
        }
    }

    private final void u(C9596tA0 c9596tA0) {
        if (c9596tA0.f79342e && c9596tA0.f79340c.isEmpty()) {
            C9489sA0 c9489sA0 = (C9489sA0) this.f80282f.remove(c9596tA0);
            c9489sA0.getClass();
            c9489sA0.f79020a.g(c9489sA0.f79021b);
            c9489sA0.f79020a.l(c9489sA0.f79022c);
            c9489sA0.f79020a.e(c9489sA0.f79022c);
            this.f80283g.remove(c9596tA0);
        }
    }

    private final void v(C9596tA0 c9596tA0) {
        VE0 ve0 = c9596tA0.f79338a;
        InterfaceC7685bF0 interfaceC7685bF0 = new InterfaceC7685bF0() { // from class: com.google.android.gms.internal.ads.lA0
            @Override // com.google.android.gms.internal.ads.InterfaceC7685bF0
            public final void a(InterfaceC7791cF0 interfaceC7791cF0, AbstractC7432Wl abstractC7432Wl) {
                this.f76603a.f(interfaceC7791cF0, abstractC7432Wl);
            }
        };
        C9382rA0 c9382rA0 = new C9382rA0(this, c9596tA0);
        this.f80282f.put(c9596tA0, new C9489sA0(ve0, interfaceC7685bF0, c9382rA0));
        ve0.f(new Handler(OV.R(), null), c9382rA0);
        ve0.o(new Handler(OV.R(), null), c9382rA0);
        ve0.i(interfaceC7685bF0, this.f80287k, this.f80277a);
    }

    private final void w(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            C9596tA0 c9596tA0 = (C9596tA0) this.f80278b.remove(i11);
            this.f80280d.remove(c9596tA0.f79339b);
            r(i11, -c9596tA0.f79338a.I().c());
            c9596tA0.f79342e = true;
            if (this.f80286j) {
                u(c9596tA0);
            }
        }
    }

    public final int a() {
        return this.f80278b.size();
    }

    public final AbstractC7432Wl b() {
        if (this.f80278b.isEmpty()) {
            return AbstractC7432Wl.f71995a;
        }
        int iC = 0;
        for (int i10 = 0; i10 < this.f80278b.size(); i10++) {
            C9596tA0 c9596tA0 = (C9596tA0) this.f80278b.get(i10);
            c9596tA0.f79341d = iC;
            iC += c9596tA0.f79338a.I().c();
        }
        return new DA0(this.f80278b, this.f80288l);
    }

    final /* synthetic */ void f(InterfaceC7791cF0 interfaceC7791cF0, AbstractC7432Wl abstractC7432Wl) {
        this.f80281e.zzh();
    }

    public final void g(Pu0 pu0) {
        C8211gC.f(!this.f80286j);
        this.f80287k = pu0;
        for (int i10 = 0; i10 < this.f80278b.size(); i10++) {
            C9596tA0 c9596tA0 = (C9596tA0) this.f80278b.get(i10);
            v(c9596tA0);
            this.f80283g.add(c9596tA0);
        }
        this.f80286j = true;
    }

    public final void h() {
        for (C9489sA0 c9489sA0 : this.f80282f.values()) {
            try {
                c9489sA0.f79020a.g(c9489sA0.f79021b);
            } catch (RuntimeException e10) {
                C10042xL.d("MediaSourceList", "Failed to release child source.", e10);
            }
            c9489sA0.f79020a.l(c9489sA0.f79022c);
            c9489sA0.f79020a.e(c9489sA0.f79022c);
        }
        this.f80282f.clear();
        this.f80283g.clear();
        this.f80286j = false;
    }

    public final void i(YE0 ye0) {
        C9596tA0 c9596tA0 = (C9596tA0) this.f80279c.remove(ye0);
        c9596tA0.getClass();
        c9596tA0.f79338a.a(ye0);
        c9596tA0.f79340c.remove(((RE0) ye0).f70646a);
        if (!this.f80279c.isEmpty()) {
            t();
        }
        u(c9596tA0);
    }

    public final AbstractC7432Wl n(List list, WF0 wf0) {
        w(0, this.f80278b.size());
        return k(this.f80278b.size(), list, wf0);
    }

    public final YE0 p(C7578aF0 c7578aF0, C8115fH0 c8115fH0, long j10) {
        int i10 = DA0.f67020k;
        Object obj = c7578aF0.f73222a;
        Object obj2 = ((Pair) obj).first;
        C7578aF0 c7578aF0A = c7578aF0.a(((Pair) obj).second);
        C9596tA0 c9596tA0 = (C9596tA0) this.f80280d.get(obj2);
        c9596tA0.getClass();
        this.f80283g.add(c9596tA0);
        C9489sA0 c9489sA0 = (C9489sA0) this.f80282f.get(c9596tA0);
        if (c9489sA0 != null) {
            c9489sA0.f79020a.n(c9489sA0.f79021b);
        }
        c9596tA0.f79340c.add(c7578aF0A);
        RE0 re0H = c9596tA0.f79338a.h(c7578aF0A, c8115fH0, j10);
        this.f80279c.put(re0H, c9596tA0);
        t();
        return re0H;
    }

    public C9917wA0(InterfaceC9703uA0 interfaceC9703uA0, PA0 pa0, QH qh2, C8105fC0 c8105fC0) {
        this.f80277a = c8105fC0;
        this.f80281e = interfaceC9703uA0;
        this.f80284h = pa0;
        this.f80285i = qh2;
    }

    public final AbstractC7432Wl k(int i10, List list, WF0 wf0) {
        if (!list.isEmpty()) {
            this.f80288l = wf0;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                C9596tA0 c9596tA0 = (C9596tA0) list.get(i11 - i10);
                if (i11 > 0) {
                    C9596tA0 c9596tA02 = (C9596tA0) this.f80278b.get(i11 - 1);
                    c9596tA0.a(c9596tA02.f79341d + c9596tA02.f79338a.I().c());
                } else {
                    c9596tA0.a(0);
                }
                r(i11, c9596tA0.f79338a.I().c());
                this.f80278b.add(i11, c9596tA0);
                this.f80280d.put(c9596tA0.f79339b, c9596tA0);
                if (this.f80286j) {
                    v(c9596tA0);
                    if (this.f80279c.isEmpty()) {
                        this.f80283g.add(c9596tA0);
                    } else {
                        s(c9596tA0);
                    }
                }
            }
        }
        return b();
    }

    public final AbstractC7432Wl l(int i10, int i11, int i12, WF0 wf0) {
        boolean z10;
        if (a() >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f80288l = null;
        return b();
    }

    public final AbstractC7432Wl o(WF0 wf0) {
        int iA = a();
        if (wf0.c() != iA) {
            wf0 = wf0.f().g(0, iA);
        }
        this.f80288l = wf0;
        return b();
    }
}
