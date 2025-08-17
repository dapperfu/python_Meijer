package Td;

/* renamed from: Td.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5236n implements InterfaceC5229g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5230h f34935a;

    C5236n(t tVar, InterfaceC5230h interfaceC5230h) {
        this.f34935a = interfaceC5230h;
    }

    @Override // Td.InterfaceC5229g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f34935a.onCanceled();
    }
}
