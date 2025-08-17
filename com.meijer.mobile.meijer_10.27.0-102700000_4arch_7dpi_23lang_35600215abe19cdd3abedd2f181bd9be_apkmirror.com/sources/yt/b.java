package yt;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes11.dex */
public class b implements InterfaceC17325k {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f171302c = C6381b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.d f171303a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17328n f171304b;

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        return true;
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
        long jF = this.f171303a.f(aVar) * 1000;
        if (jF > 0) {
            this.f171304b.a(jF);
        }
    }

    public b(Dt.d dVar) {
        this.f171303a = dVar;
    }

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
        f(aVar);
    }
}
