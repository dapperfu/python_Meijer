package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class UB0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7306Wk f70557a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7917eh0 f70558b = AbstractC7917eh0.t();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC8238hh0 f70559c = AbstractC8238hh0.d();

    /* renamed from: d, reason: collision with root package name */
    private C7453aF0 f70560d;

    /* renamed from: e, reason: collision with root package name */
    private C7453aF0 f70561e;

    /* renamed from: f, reason: collision with root package name */
    private C7453aF0 f70562f;

    public final C7453aF0 b() {
        return this.f70560d;
    }

    public final C7453aF0 d() {
        return this.f70561e;
    }

    public final C7453aF0 e() {
        return this.f70562f;
    }

    private final void k(C8131gh0 c8131gh0, C7453aF0 c7453aF0, AbstractC7307Wl abstractC7307Wl) {
        if (c7453aF0 == null) {
            return;
        }
        if (abstractC7307Wl.a(c7453aF0.f72382a) != -1) {
            c8131gh0.a(c7453aF0, abstractC7307Wl);
            return;
        }
        AbstractC7307Wl abstractC7307Wl2 = (AbstractC7307Wl) this.f70559c.get(c7453aF0);
        if (abstractC7307Wl2 != null) {
            c8131gh0.a(c7453aF0, abstractC7307Wl2);
        }
    }

    private final void l(AbstractC7307Wl abstractC7307Wl) {
        C8131gh0 c8131gh0 = new C8131gh0();
        if (this.f70558b.isEmpty()) {
            k(c8131gh0, this.f70561e, abstractC7307Wl);
            if (!C6555Af0.a(this.f70562f, this.f70561e)) {
                k(c8131gh0, this.f70562f, abstractC7307Wl);
            }
            if (!C6555Af0.a(this.f70560d, this.f70561e) && !C6555Af0.a(this.f70560d, this.f70562f)) {
                k(c8131gh0, this.f70560d, abstractC7307Wl);
            }
        } else {
            for (int i10 = 0; i10 < this.f70558b.size(); i10++) {
                k(c8131gh0, (C7453aF0) this.f70558b.get(i10), abstractC7307Wl);
            }
            if (!this.f70558b.contains(this.f70560d)) {
                k(c8131gh0, this.f70560d, abstractC7307Wl);
            }
        }
        this.f70559c = c8131gh0.c();
    }

    private static boolean m(C7453aF0 c7453aF0, Object obj, boolean z10, int i10, int i11, int i12) {
        if (c7453aF0.f72382a.equals(obj)) {
            return z10 ? c7453aF0.f72383b == i10 && c7453aF0.f72384c == i11 : c7453aF0.f72383b == -1 && c7453aF0.f72386e == i12;
        }
        return false;
    }

    public final AbstractC7307Wl a(C7453aF0 c7453aF0) {
        return (AbstractC7307Wl) this.f70559c.get(c7453aF0);
    }

    public final C7453aF0 c() {
        Object next;
        Object obj;
        if (this.f70558b.isEmpty()) {
            return null;
        }
        AbstractC7917eh0 abstractC7917eh0 = this.f70558b;
        if (abstractC7917eh0 == null) {
            Iterator<E> it = abstractC7917eh0.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (abstractC7917eh0.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = abstractC7917eh0.get(abstractC7917eh0.size() - 1);
        }
        return (C7453aF0) obj;
    }

    public final void g(InterfaceC7494aj interfaceC7494aj) {
        this.f70560d = j(interfaceC7494aj, this.f70558b, this.f70561e, this.f70557a);
    }

    public final void i(InterfaceC7494aj interfaceC7494aj) {
        this.f70560d = j(interfaceC7494aj, this.f70558b, this.f70561e, this.f70557a);
        l(interfaceC7494aj.zzn());
    }

    public UB0(C7306Wk c7306Wk) {
        this.f70557a = c7306Wk;
    }

    private static C7453aF0 j(InterfaceC7494aj interfaceC7494aj, AbstractC7917eh0 abstractC7917eh0, C7453aF0 c7453aF0, C7306Wk c7306Wk) {
        Object objF;
        AbstractC7307Wl abstractC7307WlZzn = interfaceC7494aj.zzn();
        int iZze = interfaceC7494aj.zze();
        if (abstractC7307WlZzn.o()) {
            objF = null;
        } else {
            objF = abstractC7307WlZzn.f(iZze);
        }
        int iC = -1;
        if (!interfaceC7494aj.zzw() && !abstractC7307WlZzn.o()) {
            iC = abstractC7307WlZzn.d(iZze, c7306Wk, false).c(OV.K(interfaceC7494aj.zzk()));
        }
        int i10 = iC;
        for (int i11 = 0; i11 < abstractC7917eh0.size(); i11++) {
            C7453aF0 c7453aF02 = (C7453aF0) abstractC7917eh0.get(i11);
            if (m(c7453aF02, objF, interfaceC7494aj.zzw(), interfaceC7494aj.zzb(), interfaceC7494aj.zzc(), i10)) {
                return c7453aF02;
            }
        }
        if (!abstractC7917eh0.isEmpty() || c7453aF0 == null || !m(c7453aF0, objF, interfaceC7494aj.zzw(), interfaceC7494aj.zzb(), interfaceC7494aj.zzc(), i10)) {
            return null;
        }
        return c7453aF0;
    }

    public final void h(List list, C7453aF0 c7453aF0, InterfaceC7494aj interfaceC7494aj) {
        this.f70558b = AbstractC7917eh0.r(list);
        if (!list.isEmpty()) {
            this.f70561e = (C7453aF0) list.get(0);
            c7453aF0.getClass();
            this.f70562f = c7453aF0;
        }
        if (this.f70560d == null) {
            this.f70560d = j(interfaceC7494aj, this.f70558b, this.f70561e, this.f70557a);
        }
        l(interfaceC7494aj.zzn());
    }
}
