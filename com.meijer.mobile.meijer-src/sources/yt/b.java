package yt;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes12.dex */
public class b implements InterfaceC17477k {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f172077c = C13785b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.d f172078a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17480n f172079b;

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        return true;
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
        long jF = this.f172078a.f(aVar) * 1000;
        if (jF > 0) {
            this.f172079b.a(jF);
        }
    }

    public b(Dt.d dVar) {
        this.f172078a = dVar;
    }

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
        f(aVar);
    }
}
