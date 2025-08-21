package androidx.view;

import java.util.Iterator;
import java.util.Map;
import p.C16327b;

/* renamed from: androidx.lifecycle.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6128B<T> extends C6130D<T> {

    /* renamed from: l, reason: collision with root package name */
    private C16327b<AbstractC6127A<?>, a<?>> f55370l;

    /* renamed from: androidx.lifecycle.B$a */
    private static class a<V> implements InterfaceC6131E<V> {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC6127A<V> f55371a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6131E<? super V> f55372b;

        /* renamed from: c, reason: collision with root package name */
        int f55373c = -1;

        void a() {
            this.f55371a.j(this);
        }

        void b() {
            this.f55371a.n(this);
        }

        @Override // androidx.view.InterfaceC6131E
        public void onChanged(V v10) {
            if (this.f55373c != this.f55371a.f()) {
                this.f55373c = this.f55371a.f();
                this.f55372b.onChanged(v10);
            }
        }

        a(AbstractC6127A<V> abstractC6127A, InterfaceC6131E<? super V> interfaceC6131E) {
            this.f55371a = abstractC6127A;
            this.f55372b = interfaceC6131E;
        }
    }

    public C6128B() {
        this.f55370l = new C16327b<>();
    }

    @Override // androidx.view.AbstractC6127A
    protected void k() {
        Iterator<Map.Entry<AbstractC6127A<?>, a<?>>> it = this.f55370l.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.view.AbstractC6127A
    protected void l() {
        Iterator<Map.Entry<AbstractC6127A<?>, a<?>>> it = this.f55370l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public <S> void p(AbstractC6127A<S> abstractC6127A, InterfaceC6131E<? super S> interfaceC6131E) {
        if (abstractC6127A == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(abstractC6127A, interfaceC6131E);
        a<?> aVarL = this.f55370l.l(abstractC6127A, aVar);
        if (aVarL != null && aVarL.f55372b != interfaceC6131E) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarL == null && g()) {
            aVar.a();
        }
    }

    public <S> void q(AbstractC6127A<S> abstractC6127A) {
        a<?> aVarM = this.f55370l.m(abstractC6127A);
        if (aVarM != null) {
            aVarM.b();
        }
    }

    public C6128B(T t10) {
        super(t10);
        this.f55370l = new C16327b<>();
    }
}
