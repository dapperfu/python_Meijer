package F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3612i {

    /* renamed from: F.i$a */
    public static final class a extends AbstractC3611h {

        /* renamed from: a, reason: collision with root package name */
        private final List<AbstractC3611h> f9960a = new ArrayList();

        @Override // F.AbstractC3611h
        public void a(int i10) {
            Iterator<AbstractC3611h> it = this.f9960a.iterator();
            while (it.hasNext()) {
                it.next().a(i10);
            }
        }

        @Override // F.AbstractC3611h
        public void b(int i10, r rVar) {
            Iterator<AbstractC3611h> it = this.f9960a.iterator();
            while (it.hasNext()) {
                it.next().b(i10, rVar);
            }
        }

        @Override // F.AbstractC3611h
        public void c(int i10, C3613j c3613j) {
            Iterator<AbstractC3611h> it = this.f9960a.iterator();
            while (it.hasNext()) {
                it.next().c(i10, c3613j);
            }
        }

        @Override // F.AbstractC3611h
        public void d(int i10) {
            Iterator<AbstractC3611h> it = this.f9960a.iterator();
            while (it.hasNext()) {
                it.next().d(i10);
            }
        }

        public List<AbstractC3611h> e() {
            return this.f9960a;
        }

        a(List<AbstractC3611h> list) {
            for (AbstractC3611h abstractC3611h : list) {
                if (!(abstractC3611h instanceof b)) {
                    this.f9960a.add(abstractC3611h);
                }
            }
        }
    }

    /* renamed from: F.i$b */
    static final class b extends AbstractC3611h {
        @Override // F.AbstractC3611h
        public void b(int i10, r rVar) {
        }

        @Override // F.AbstractC3611h
        public void c(int i10, C3613j c3613j) {
        }

        @Override // F.AbstractC3611h
        public void d(int i10) {
        }

        b() {
        }
    }

    public static AbstractC3611h c() {
        return new b();
    }

    static AbstractC3611h a(List<AbstractC3611h> list) {
        if (list.isEmpty()) {
            return c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static AbstractC3611h b(AbstractC3611h... abstractC3611hArr) {
        return a(Arrays.asList(abstractC3611hArr));
    }
}
