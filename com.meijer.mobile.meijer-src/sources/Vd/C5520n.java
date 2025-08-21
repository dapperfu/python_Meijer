package Vd;

/* renamed from: Vd.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5520n implements InterfaceC5513g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5514h f39868a;

    C5520n(t tVar, InterfaceC5514h interfaceC5514h) {
        this.f39868a = interfaceC5514h;
    }

    @Override // Vd.InterfaceC5513g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f39868a.onCanceled();
    }
}
