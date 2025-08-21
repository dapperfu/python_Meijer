package vt;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import tt.b;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* renamed from: vt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C17736a implements InterfaceC17477k {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f166312c = C13785b.a(C17736a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final b f166313a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17480n f166314b;

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        return true;
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
        double dA = this.f166313a.a() / 60.0d;
        if (dA > 1.0d) {
            this.f166313a.a();
            this.f166314b.s0(dA);
        }
    }

    public C17736a(b bVar) {
        this.f166313a = bVar;
    }

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
        f(aVar);
    }
}
