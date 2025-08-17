package yt;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes11.dex */
public class e implements InterfaceC17325k {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f171313c = C6381b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f171314a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17328n f171315b;

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        return true;
    }

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
        if (this.f171314a.d() >= 50.0f || this.f171314a.b() >= 300000) {
            this.f171314a.d();
        } else {
            this.f171314a.d();
            this.f171315b.a((aVar.c() * 1000) - this.f171314a.b());
        }
    }

    public e(c cVar) {
        this.f171314a = cVar;
    }
}
