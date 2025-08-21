package yt;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes12.dex */
public class e implements InterfaceC17477k {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f172088c = C13785b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f172089a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17480n f172090b;

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        return true;
    }

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
        if (this.f172089a.d() >= 50.0f || this.f172089a.b() >= 300000) {
            this.f172089a.d();
        } else {
            this.f172089a.d();
            this.f172090b.a((aVar.c() * 1000) - this.f172089a.b());
        }
    }

    public e(c cVar) {
        this.f172089a = cVar;
    }
}
