package zt;

import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes13.dex */
public final class n implements InterfaceC17477k {

    /* renamed from: a, reason: collision with root package name */
    private final C18548b f173264a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17480n f173265b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f173266c;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (!this.f173266c) {
            return true;
        }
        this.f173266c = false;
        return this.f173264a.b(aVar, list);
    }

    public n(C18548b c18548b) {
        this.f173264a = c18548b;
    }
}
