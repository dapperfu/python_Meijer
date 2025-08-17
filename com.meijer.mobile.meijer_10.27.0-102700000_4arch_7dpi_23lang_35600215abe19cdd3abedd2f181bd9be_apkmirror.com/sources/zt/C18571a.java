package zt;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* renamed from: zt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C18571a implements InterfaceC17325k {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f173245d = C6381b.a(C18571a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.b f173246a;

    /* renamed from: b, reason: collision with root package name */
    private final C18572b f173247b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceRunnableC17328n f173248c;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (this.f173246a.b()) {
            return this.f173247b.b(aVar, list);
        }
        return true;
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
        if (this.f173246a.a() < 0.6f) {
            this.f173248c.v0(Math.pow(100.0d, 1.0d - (r5 / 0.6f)));
        }
    }

    public C18571a(Dt.b bVar, C18572b c18572b) {
        this.f173246a = bVar;
        this.f173247b = c18572b;
    }
}
