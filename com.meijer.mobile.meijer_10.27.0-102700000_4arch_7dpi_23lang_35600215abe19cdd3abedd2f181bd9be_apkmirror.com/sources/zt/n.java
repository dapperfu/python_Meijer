package zt;

import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes12.dex */
public final class n implements InterfaceC17325k {

    /* renamed from: a, reason: collision with root package name */
    private final C18572b f173303a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17328n f173304b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f173305c;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (!this.f173305c) {
            return true;
        }
        this.f173305c = false;
        return this.f173303a.b(aVar, list);
    }

    public n(C18572b c18572b) {
        this.f173303a = c18572b;
    }
}
