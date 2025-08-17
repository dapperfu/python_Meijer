package nu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class i implements InterfaceC15948c, InterfaceC15950e {

    /* renamed from: a, reason: collision with root package name */
    private final b f152833a = new b();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final List<InterfaceC15950e> f152834a;

        private b() {
            this.f152834a = new ArrayList();
        }

        void a(InterfaceC15948c interfaceC15948c, int i10, int i11) {
            for (int size = this.f152834a.size() - 1; size >= 0; size--) {
                this.f152834a.get(size).b(interfaceC15948c, i10, i11);
            }
        }

        void b(InterfaceC15948c interfaceC15948c, int i10, int i11, Object obj) {
            for (int size = this.f152834a.size() - 1; size >= 0; size--) {
                this.f152834a.get(size).e(interfaceC15948c, i10, i11, obj);
            }
        }

        void c(InterfaceC15948c interfaceC15948c, int i10, int i11) {
            for (int size = this.f152834a.size() - 1; size >= 0; size--) {
                this.f152834a.get(size).d(interfaceC15948c, i10, i11);
            }
        }

        void d(InterfaceC15948c interfaceC15948c, int i10, int i11) {
            for (int size = this.f152834a.size() - 1; size >= 0; size--) {
                this.f152834a.get(size).g(interfaceC15948c, i10, i11);
            }
        }

        void e(InterfaceC15950e interfaceC15950e) {
            synchronized (this.f152834a) {
                try {
                    if (this.f152834a.contains(interfaceC15950e)) {
                        throw new IllegalStateException("Observer " + interfaceC15950e + " is already registered.");
                    }
                    this.f152834a.add(interfaceC15950e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void f(InterfaceC15950e interfaceC15950e) {
            synchronized (this.f152834a) {
                this.f152834a.remove(this.f152834a.indexOf(interfaceC15950e));
            }
        }
    }

    @Override // nu.InterfaceC15948c
    public int a() {
        int iA = 0;
        for (int i10 = 0; i10 < j(); i10++) {
            iA += i(i10).a();
        }
        return iA;
    }

    @Override // nu.InterfaceC15948c
    public h getItem(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < j()) {
            InterfaceC15948c interfaceC15948cI = i(i11);
            int iA = interfaceC15948cI.a() + i12;
            if (iA > i10) {
                return interfaceC15948cI.getItem(i10 - i12);
            }
            i11++;
            i12 = iA;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i10 + " but there are only " + a() + " items");
    }

    public abstract InterfaceC15948c i(int i10);

    public abstract int j();

    protected int k(int i10) {
        int iA = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iA += i(i11).a();
        }
        return iA;
    }

    public abstract int m(InterfaceC15948c interfaceC15948c);

    @Override // nu.InterfaceC15948c
    public final void c(InterfaceC15950e interfaceC15950e) {
        this.f152833a.e(interfaceC15950e);
    }

    @Override // nu.InterfaceC15950e
    public void d(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        this.f152833a.c(this, l(interfaceC15948c) + i10, i11);
    }

    @Override // nu.InterfaceC15950e
    public void e(InterfaceC15948c interfaceC15948c, int i10, int i11, Object obj) {
        this.f152833a.b(this, l(interfaceC15948c) + i10, i11, obj);
    }

    @Override // nu.InterfaceC15948c
    public void f(InterfaceC15950e interfaceC15950e) {
        this.f152833a.f(interfaceC15950e);
    }

    @Override // nu.InterfaceC15950e
    public void g(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        this.f152833a.d(this, l(interfaceC15948c) + i10, i11);
    }

    public void n(int i10, int i11) {
        this.f152833a.a(this, i10, i11);
    }

    public void o(int i10, int i11, Object obj) {
        this.f152833a.b(this, i10, i11, obj);
    }

    public void p(int i10, int i11) {
        this.f152833a.c(this, i10, i11);
    }

    public void q(int i10, int i11) {
        this.f152833a.d(this, i10, i11);
    }

    @Override // nu.InterfaceC15950e
    public void b(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        int iL = l(interfaceC15948c);
        this.f152833a.a(this, i10 + iL, iL + i11);
    }

    public void h(Collection<? extends InterfaceC15948c> collection) {
        Iterator<? extends InterfaceC15948c> it = collection.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    protected int l(InterfaceC15948c interfaceC15948c) {
        return k(m(interfaceC15948c));
    }

    public void r(Collection<? extends InterfaceC15948c> collection) {
        Iterator<? extends InterfaceC15948c> it = collection.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }
}
