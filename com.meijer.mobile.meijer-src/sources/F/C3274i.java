package F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3274i {

    /* renamed from: F.i$a */
    public static final class a extends AbstractC3273h {

        /* renamed from: a, reason: collision with root package name */
        private final List<AbstractC3273h> f8727a = new ArrayList();

        @Override // F.AbstractC3273h
        public void a(int i10) {
            Iterator<AbstractC3273h> it = this.f8727a.iterator();
            while (it.hasNext()) {
                it.next().a(i10);
            }
        }

        @Override // F.AbstractC3273h
        public void b(int i10, r rVar) {
            Iterator<AbstractC3273h> it = this.f8727a.iterator();
            while (it.hasNext()) {
                it.next().b(i10, rVar);
            }
        }

        @Override // F.AbstractC3273h
        public void c(int i10, C3275j c3275j) {
            Iterator<AbstractC3273h> it = this.f8727a.iterator();
            while (it.hasNext()) {
                it.next().c(i10, c3275j);
            }
        }

        @Override // F.AbstractC3273h
        public void d(int i10) {
            Iterator<AbstractC3273h> it = this.f8727a.iterator();
            while (it.hasNext()) {
                it.next().d(i10);
            }
        }

        public List<AbstractC3273h> e() {
            return this.f8727a;
        }

        a(List<AbstractC3273h> list) {
            for (AbstractC3273h abstractC3273h : list) {
                if (!(abstractC3273h instanceof b)) {
                    this.f8727a.add(abstractC3273h);
                }
            }
        }
    }

    /* renamed from: F.i$b */
    static final class b extends AbstractC3273h {
        @Override // F.AbstractC3273h
        public void b(int i10, r rVar) {
        }

        @Override // F.AbstractC3273h
        public void c(int i10, C3275j c3275j) {
        }

        @Override // F.AbstractC3273h
        public void d(int i10) {
        }

        b() {
        }
    }

    public static AbstractC3273h c() {
        return new b();
    }

    static AbstractC3273h a(List<AbstractC3273h> list) {
        if (list.isEmpty()) {
            return c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static AbstractC3273h b(AbstractC3273h... abstractC3273hArr) {
        return a(Arrays.asList(abstractC3273hArr));
    }
}
