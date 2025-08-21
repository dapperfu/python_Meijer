package androidx.camera.core;

import F.S;

/* loaded from: classes.dex */
final class j extends i {

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f47758a;

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        a(n nVar) {
            this.f47758a = nVar;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            this.f47758a.close();
        }
    }

    @Override // androidx.camera.core.i
    void g() {
    }

    j() {
    }

    @Override // androidx.camera.core.i
    n d(S s10) {
        return s10.g();
    }

    @Override // androidx.camera.core.i
    void m(n nVar) {
        I.n.j(e(nVar), new a(nVar), H.a.a());
    }
}
