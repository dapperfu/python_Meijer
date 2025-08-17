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
final class C9792wA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7980fC0 f79437a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9578uA0 f79441e;

    /* renamed from: h, reason: collision with root package name */
    private final PA0 f79444h;

    /* renamed from: i, reason: collision with root package name */
    private final QH f79445i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f79446j;

    /* renamed from: k, reason: collision with root package name */
    private Pu0 f79447k;

    /* renamed from: l, reason: collision with root package name */
    private WF0 f79448l = new WF0(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f79439c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f79440d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f79438b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f79442f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f79443g = new HashSet();

    public final AbstractC7307Wl c(int i10, int i11, List list) {
        C8086gC.d(i10 >= 0 && i10 <= i11 && i11 <= a());
        C8086gC.d(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((C9471tA0) this.f79438b.get(i12)).f78498a.b((H7) list.get(i12 - i10));
        }
        return b();
    }

    public final boolean j() {
        return this.f79446j;
    }

    public final AbstractC7307Wl m(int i10, int i11, WF0 wf0) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= a()) {
            z10 = true;
        }
        C8086gC.d(z10);
        this.f79448l = wf0;
        w(i10, i11);
        return b();
    }

    public final WF0 q() {
        return this.f79448l;
    }

    private final void r(int i10, int i11) {
        while (i10 < this.f79438b.size()) {
            ((C9471tA0) this.f79438b.get(i10)).f78501d += i11;
            i10++;
        }
    }

    private final void s(C9471tA0 c9471tA0) {
        C9364sA0 c9364sA0 = (C9364sA0) this.f79442f.get(c9471tA0);
        if (c9364sA0 != null) {
            c9364sA0.f78180a.d(c9364sA0.f78181b);
        }
    }

    private final void t() {
        Iterator it = this.f79443g.iterator();
        while (it.hasNext()) {
            C9471tA0 c9471tA0 = (C9471tA0) it.next();
            if (c9471tA0.f78500c.isEmpty()) {
                s(c9471tA0);
                it.remove();
            }
        }
    }

    private final void u(C9471tA0 c9471tA0) {
        if (c9471tA0.f78502e && c9471tA0.f78500c.isEmpty()) {
            C9364sA0 c9364sA0 = (C9364sA0) this.f79442f.remove(c9471tA0);
            c9364sA0.getClass();
            c9364sA0.f78180a.g(c9364sA0.f78181b);
            c9364sA0.f78180a.l(c9364sA0.f78182c);
            c9364sA0.f78180a.e(c9364sA0.f78182c);
            this.f79443g.remove(c9471tA0);
        }
    }

    private final void v(C9471tA0 c9471tA0) {
        VE0 ve0 = c9471tA0.f78498a;
        InterfaceC7560bF0 interfaceC7560bF0 = new InterfaceC7560bF0() { // from class: com.google.android.gms.internal.ads.lA0
            @Override // com.google.android.gms.internal.ads.InterfaceC7560bF0
            public final void a(InterfaceC7666cF0 interfaceC7666cF0, AbstractC7307Wl abstractC7307Wl) {
                this.f75763a.f(interfaceC7666cF0, abstractC7307Wl);
            }
        };
        C9257rA0 c9257rA0 = new C9257rA0(this, c9471tA0);
        this.f79442f.put(c9471tA0, new C9364sA0(ve0, interfaceC7560bF0, c9257rA0));
        ve0.f(new Handler(OV.R(), null), c9257rA0);
        ve0.o(new Handler(OV.R(), null), c9257rA0);
        ve0.i(interfaceC7560bF0, this.f79447k, this.f79437a);
    }

    private final void w(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            C9471tA0 c9471tA0 = (C9471tA0) this.f79438b.remove(i11);
            this.f79440d.remove(c9471tA0.f78499b);
            r(i11, -c9471tA0.f78498a.I().c());
            c9471tA0.f78502e = true;
            if (this.f79446j) {
                u(c9471tA0);
            }
        }
    }

    public final int a() {
        return this.f79438b.size();
    }

    public final AbstractC7307Wl b() {
        if (this.f79438b.isEmpty()) {
            return AbstractC7307Wl.f71155a;
        }
        int iC = 0;
        for (int i10 = 0; i10 < this.f79438b.size(); i10++) {
            C9471tA0 c9471tA0 = (C9471tA0) this.f79438b.get(i10);
            c9471tA0.f78501d = iC;
            iC += c9471tA0.f78498a.I().c();
        }
        return new DA0(this.f79438b, this.f79448l);
    }

    final /* synthetic */ void f(InterfaceC7666cF0 interfaceC7666cF0, AbstractC7307Wl abstractC7307Wl) {
        this.f79441e.zzh();
    }

    public final void g(Pu0 pu0) {
        C8086gC.f(!this.f79446j);
        this.f79447k = pu0;
        for (int i10 = 0; i10 < this.f79438b.size(); i10++) {
            C9471tA0 c9471tA0 = (C9471tA0) this.f79438b.get(i10);
            v(c9471tA0);
            this.f79443g.add(c9471tA0);
        }
        this.f79446j = true;
    }

    public final void h() {
        for (C9364sA0 c9364sA0 : this.f79442f.values()) {
            try {
                c9364sA0.f78180a.g(c9364sA0.f78181b);
            } catch (RuntimeException e10) {
                C9917xL.d("MediaSourceList", "Failed to release child source.", e10);
            }
            c9364sA0.f78180a.l(c9364sA0.f78182c);
            c9364sA0.f78180a.e(c9364sA0.f78182c);
        }
        this.f79442f.clear();
        this.f79443g.clear();
        this.f79446j = false;
    }

    public final void i(YE0 ye0) {
        C9471tA0 c9471tA0 = (C9471tA0) this.f79439c.remove(ye0);
        c9471tA0.getClass();
        c9471tA0.f78498a.a(ye0);
        c9471tA0.f78500c.remove(((RE0) ye0).f69806a);
        if (!this.f79439c.isEmpty()) {
            t();
        }
        u(c9471tA0);
    }

    public final AbstractC7307Wl n(List list, WF0 wf0) {
        w(0, this.f79438b.size());
        return k(this.f79438b.size(), list, wf0);
    }

    public final YE0 p(C7453aF0 c7453aF0, C7990fH0 c7990fH0, long j10) {
        int i10 = DA0.f66180k;
        Object obj = c7453aF0.f72382a;
        Object obj2 = ((Pair) obj).first;
        C7453aF0 c7453aF0A = c7453aF0.a(((Pair) obj).second);
        C9471tA0 c9471tA0 = (C9471tA0) this.f79440d.get(obj2);
        c9471tA0.getClass();
        this.f79443g.add(c9471tA0);
        C9364sA0 c9364sA0 = (C9364sA0) this.f79442f.get(c9471tA0);
        if (c9364sA0 != null) {
            c9364sA0.f78180a.n(c9364sA0.f78181b);
        }
        c9471tA0.f78500c.add(c7453aF0A);
        RE0 re0H = c9471tA0.f78498a.h(c7453aF0A, c7990fH0, j10);
        this.f79439c.put(re0H, c9471tA0);
        t();
        return re0H;
    }

    public C9792wA0(InterfaceC9578uA0 interfaceC9578uA0, PA0 pa0, QH qh2, C7980fC0 c7980fC0) {
        this.f79437a = c7980fC0;
        this.f79441e = interfaceC9578uA0;
        this.f79444h = pa0;
        this.f79445i = qh2;
    }

    public final AbstractC7307Wl k(int i10, List list, WF0 wf0) {
        if (!list.isEmpty()) {
            this.f79448l = wf0;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                C9471tA0 c9471tA0 = (C9471tA0) list.get(i11 - i10);
                if (i11 > 0) {
                    C9471tA0 c9471tA02 = (C9471tA0) this.f79438b.get(i11 - 1);
                    c9471tA0.a(c9471tA02.f78501d + c9471tA02.f78498a.I().c());
                } else {
                    c9471tA0.a(0);
                }
                r(i11, c9471tA0.f78498a.I().c());
                this.f79438b.add(i11, c9471tA0);
                this.f79440d.put(c9471tA0.f78499b, c9471tA0);
                if (this.f79446j) {
                    v(c9471tA0);
                    if (this.f79439c.isEmpty()) {
                        this.f79443g.add(c9471tA0);
                    } else {
                        s(c9471tA0);
                    }
                }
            }
        }
        return b();
    }

    public final AbstractC7307Wl l(int i10, int i11, int i12, WF0 wf0) {
        boolean z10;
        if (a() >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f79448l = null;
        return b();
    }

    public final AbstractC7307Wl o(WF0 wf0) {
        int iA = a();
        if (wf0.c() != iA) {
            wf0 = wf0.f().g(0, iA);
        }
        this.f79448l = wf0;
        return b();
    }
}
