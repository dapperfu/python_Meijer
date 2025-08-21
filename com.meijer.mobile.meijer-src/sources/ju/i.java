package ju;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class i implements InterfaceC15068c, InterfaceC15070e {

    /* renamed from: a, reason: collision with root package name */
    private final b f141283a = new b();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final List<InterfaceC15070e> f141284a;

        private b() {
            this.f141284a = new ArrayList();
        }

        void a(InterfaceC15068c interfaceC15068c, int i10, int i11) {
            for (int size = this.f141284a.size() - 1; size >= 0; size--) {
                this.f141284a.get(size).e(interfaceC15068c, i10, i11);
            }
        }

        void b(InterfaceC15068c interfaceC15068c, int i10, int i11, Object obj) {
            for (int size = this.f141284a.size() - 1; size >= 0; size--) {
                this.f141284a.get(size).b(interfaceC15068c, i10, i11, obj);
            }
        }

        void c(InterfaceC15068c interfaceC15068c, int i10, int i11) {
            for (int size = this.f141284a.size() - 1; size >= 0; size--) {
                this.f141284a.get(size).f(interfaceC15068c, i10, i11);
            }
        }

        void d(InterfaceC15068c interfaceC15068c, int i10, int i11) {
            for (int size = this.f141284a.size() - 1; size >= 0; size--) {
                this.f141284a.get(size).d(interfaceC15068c, i10, i11);
            }
        }

        void e(InterfaceC15070e interfaceC15070e) {
            synchronized (this.f141284a) {
                try {
                    if (this.f141284a.contains(interfaceC15070e)) {
                        throw new IllegalStateException("Observer " + interfaceC15070e + " is already registered.");
                    }
                    this.f141284a.add(interfaceC15070e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void f(InterfaceC15070e interfaceC15070e) {
            synchronized (this.f141284a) {
                this.f141284a.remove(this.f141284a.indexOf(interfaceC15070e));
            }
        }
    }

    @Override // ju.InterfaceC15068c
    public int a() {
        int iA = 0;
        for (int i10 = 0; i10 < j(); i10++) {
            iA += i(i10).a();
        }
        return iA;
    }

    @Override // ju.InterfaceC15068c
    public h getItem(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < j()) {
            InterfaceC15068c interfaceC15068cI = i(i11);
            int iA = interfaceC15068cI.a() + i12;
            if (iA > i10) {
                return interfaceC15068cI.getItem(i10 - i12);
            }
            i11++;
            i12 = iA;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i10 + " but there are only " + a() + " items");
    }

    public abstract InterfaceC15068c i(int i10);

    public abstract int j();

    protected int k(int i10) {
        int iA = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iA += i(i11).a();
        }
        return iA;
    }

    public abstract int m(InterfaceC15068c interfaceC15068c);

    @Override // ju.InterfaceC15070e
    public void b(InterfaceC15068c interfaceC15068c, int i10, int i11, Object obj) {
        this.f141283a.b(this, l(interfaceC15068c) + i10, i11, obj);
    }

    @Override // ju.InterfaceC15068c
    public final void c(InterfaceC15070e interfaceC15070e) {
        this.f141283a.e(interfaceC15070e);
    }

    @Override // ju.InterfaceC15070e
    public void d(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        this.f141283a.d(this, l(interfaceC15068c) + i10, i11);
    }

    @Override // ju.InterfaceC15070e
    public void f(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        this.f141283a.c(this, l(interfaceC15068c) + i10, i11);
    }

    @Override // ju.InterfaceC15068c
    public void g(InterfaceC15070e interfaceC15070e) {
        this.f141283a.f(interfaceC15070e);
    }

    public void n(int i10, int i11) {
        this.f141283a.a(this, i10, i11);
    }

    public void o(int i10, int i11, Object obj) {
        this.f141283a.b(this, i10, i11, obj);
    }

    public void p(int i10, int i11) {
        this.f141283a.c(this, i10, i11);
    }

    public void q(int i10, int i11) {
        this.f141283a.d(this, i10, i11);
    }

    @Override // ju.InterfaceC15070e
    public void e(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        int iL = l(interfaceC15068c);
        this.f141283a.a(this, i10 + iL, iL + i11);
    }

    public void h(Collection<? extends InterfaceC15068c> collection) {
        Iterator<? extends InterfaceC15068c> it = collection.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    protected int l(InterfaceC15068c interfaceC15068c) {
        return k(m(interfaceC15068c));
    }

    public void r(Collection<? extends InterfaceC15068c> collection) {
        Iterator<? extends InterfaceC15068c> it = collection.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
    }
}
