package androidx.view;

import java.util.Iterator;
import java.util.Map;
import p.C16182b;

/* renamed from: androidx.lifecycle.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5986B<T> extends C5988D<T> {

    /* renamed from: l, reason: collision with root package name */
    private C16182b<AbstractC5985A<?>, a<?>> f55146l;

    /* renamed from: androidx.lifecycle.B$a */
    private static class a<V> implements InterfaceC5989E<V> {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5985A<V> f55147a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC5989E<? super V> f55148b;

        /* renamed from: c, reason: collision with root package name */
        int f55149c = -1;

        void a() {
            this.f55147a.j(this);
        }

        void b() {
            this.f55147a.n(this);
        }

        @Override // androidx.view.InterfaceC5989E
        public void onChanged(V v10) {
            if (this.f55149c != this.f55147a.f()) {
                this.f55149c = this.f55147a.f();
                this.f55148b.onChanged(v10);
            }
        }

        a(AbstractC5985A<V> abstractC5985A, InterfaceC5989E<? super V> interfaceC5989E) {
            this.f55147a = abstractC5985A;
            this.f55148b = interfaceC5989E;
        }
    }

    public C5986B() {
        this.f55146l = new C16182b<>();
    }

    @Override // androidx.view.AbstractC5985A
    protected void k() {
        Iterator<Map.Entry<AbstractC5985A<?>, a<?>>> it = this.f55146l.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.view.AbstractC5985A
    protected void l() {
        Iterator<Map.Entry<AbstractC5985A<?>, a<?>>> it = this.f55146l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public <S> void p(AbstractC5985A<S> abstractC5985A, InterfaceC5989E<? super S> interfaceC5989E) {
        if (abstractC5985A == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(abstractC5985A, interfaceC5989E);
        a<?> aVarL = this.f55146l.l(abstractC5985A, aVar);
        if (aVarL != null && aVarL.f55148b != interfaceC5989E) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarL == null && g()) {
            aVar.a();
        }
    }

    public <S> void q(AbstractC5985A<S> abstractC5985A) {
        a<?> aVarM = this.f55146l.m(abstractC5985A);
        if (aVarM != null) {
            aVarM.b();
        }
    }

    public C5986B(T t10) {
        super(t10);
        this.f55146l = new C16182b<>();
    }
}
