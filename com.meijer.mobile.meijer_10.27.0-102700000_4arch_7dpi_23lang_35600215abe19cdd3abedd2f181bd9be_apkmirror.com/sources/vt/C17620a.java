package vt;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import tt.b;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* renamed from: vt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C17620a implements InterfaceC17325k {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f165078c = C6381b.a(C17620a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final b f165079a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17328n f165080b;

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        return true;
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
        double dA = this.f165079a.a() / 60.0d;
        if (dA > 1.0d) {
            this.f165079a.a();
            this.f165080b.v0(dA);
        }
    }

    public C17620a(b bVar) {
        this.f165079a = bVar;
    }

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
        f(aVar);
    }
}
