package zt;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* renamed from: zt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C18547a implements InterfaceC17477k {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f173206d = C13785b.a(C18547a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.b f173207a;

    /* renamed from: b, reason: collision with root package name */
    private final C18548b f173208b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceRunnableC17480n f173209c;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (this.f173207a.b()) {
            return this.f173208b.b(aVar, list);
        }
        return true;
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
        if (this.f173207a.a() < 0.6f) {
            this.f173209c.s0(Math.pow(100.0d, 1.0d - (r5 / 0.6f)));
        }
    }

    public C18547a(Dt.b bVar, C18548b c18548b) {
        this.f173207a = bVar;
        this.f173208b = c18548b;
    }
}
