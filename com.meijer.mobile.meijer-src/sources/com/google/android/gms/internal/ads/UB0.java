package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class UB0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7431Wk f71397a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC8042eh0 f71398b = AbstractC8042eh0.t();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC8363hh0 f71399c = AbstractC8363hh0.d();

    /* renamed from: d, reason: collision with root package name */
    private C7578aF0 f71400d;

    /* renamed from: e, reason: collision with root package name */
    private C7578aF0 f71401e;

    /* renamed from: f, reason: collision with root package name */
    private C7578aF0 f71402f;

    public final C7578aF0 b() {
        return this.f71400d;
    }

    public final C7578aF0 d() {
        return this.f71401e;
    }

    public final C7578aF0 e() {
        return this.f71402f;
    }

    private final void k(C8256gh0 c8256gh0, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl) {
        if (c7578aF0 == null) {
            return;
        }
        if (abstractC7432Wl.a(c7578aF0.f73222a) != -1) {
            c8256gh0.a(c7578aF0, abstractC7432Wl);
            return;
        }
        AbstractC7432Wl abstractC7432Wl2 = (AbstractC7432Wl) this.f71399c.get(c7578aF0);
        if (abstractC7432Wl2 != null) {
            c8256gh0.a(c7578aF0, abstractC7432Wl2);
        }
    }

    private final void l(AbstractC7432Wl abstractC7432Wl) {
        C8256gh0 c8256gh0 = new C8256gh0();
        if (this.f71398b.isEmpty()) {
            k(c8256gh0, this.f71401e, abstractC7432Wl);
            if (!C6680Af0.a(this.f71402f, this.f71401e)) {
                k(c8256gh0, this.f71402f, abstractC7432Wl);
            }
            if (!C6680Af0.a(this.f71400d, this.f71401e) && !C6680Af0.a(this.f71400d, this.f71402f)) {
                k(c8256gh0, this.f71400d, abstractC7432Wl);
            }
        } else {
            for (int i10 = 0; i10 < this.f71398b.size(); i10++) {
                k(c8256gh0, (C7578aF0) this.f71398b.get(i10), abstractC7432Wl);
            }
            if (!this.f71398b.contains(this.f71400d)) {
                k(c8256gh0, this.f71400d, abstractC7432Wl);
            }
        }
        this.f71399c = c8256gh0.c();
    }

    private static boolean m(C7578aF0 c7578aF0, Object obj, boolean z10, int i10, int i11, int i12) {
        if (c7578aF0.f73222a.equals(obj)) {
            return z10 ? c7578aF0.f73223b == i10 && c7578aF0.f73224c == i11 : c7578aF0.f73223b == -1 && c7578aF0.f73226e == i12;
        }
        return false;
    }

    public final AbstractC7432Wl a(C7578aF0 c7578aF0) {
        return (AbstractC7432Wl) this.f71399c.get(c7578aF0);
    }

    public final C7578aF0 c() {
        Object next;
        Object obj;
        if (this.f71398b.isEmpty()) {
            return null;
        }
        AbstractC8042eh0 abstractC8042eh0 = this.f71398b;
        if (abstractC8042eh0 == null) {
            Iterator<E> it = abstractC8042eh0.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (abstractC8042eh0.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = abstractC8042eh0.get(abstractC8042eh0.size() - 1);
        }
        return (C7578aF0) obj;
    }

    public final void g(InterfaceC7619aj interfaceC7619aj) {
        this.f71400d = j(interfaceC7619aj, this.f71398b, this.f71401e, this.f71397a);
    }

    public final void i(InterfaceC7619aj interfaceC7619aj) {
        this.f71400d = j(interfaceC7619aj, this.f71398b, this.f71401e, this.f71397a);
        l(interfaceC7619aj.zzn());
    }

    public UB0(C7431Wk c7431Wk) {
        this.f71397a = c7431Wk;
    }

    private static C7578aF0 j(InterfaceC7619aj interfaceC7619aj, AbstractC8042eh0 abstractC8042eh0, C7578aF0 c7578aF0, C7431Wk c7431Wk) {
        Object objF;
        AbstractC7432Wl abstractC7432WlZzn = interfaceC7619aj.zzn();
        int iZze = interfaceC7619aj.zze();
        if (abstractC7432WlZzn.o()) {
            objF = null;
        } else {
            objF = abstractC7432WlZzn.f(iZze);
        }
        int iC = -1;
        if (!interfaceC7619aj.zzw() && !abstractC7432WlZzn.o()) {
            iC = abstractC7432WlZzn.d(iZze, c7431Wk, false).c(OV.K(interfaceC7619aj.zzk()));
        }
        int i10 = iC;
        for (int i11 = 0; i11 < abstractC8042eh0.size(); i11++) {
            C7578aF0 c7578aF02 = (C7578aF0) abstractC8042eh0.get(i11);
            if (m(c7578aF02, objF, interfaceC7619aj.zzw(), interfaceC7619aj.zzb(), interfaceC7619aj.zzc(), i10)) {
                return c7578aF02;
            }
        }
        if (!abstractC8042eh0.isEmpty() || c7578aF0 == null || !m(c7578aF0, objF, interfaceC7619aj.zzw(), interfaceC7619aj.zzb(), interfaceC7619aj.zzc(), i10)) {
            return null;
        }
        return c7578aF0;
    }

    public final void h(List list, C7578aF0 c7578aF0, InterfaceC7619aj interfaceC7619aj) {
        this.f71398b = AbstractC8042eh0.r(list);
        if (!list.isEmpty()) {
            this.f71401e = (C7578aF0) list.get(0);
            c7578aF0.getClass();
            this.f71402f = c7578aF0;
        }
        if (this.f71400d == null) {
            this.f71400d = j(interfaceC7619aj, this.f71398b, this.f71401e, this.f71397a);
        }
        l(interfaceC7619aj.zzn());
    }
}
