package yt;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import zt.C18548b;

/* loaded from: classes12.dex */
public class d implements InterfaceC17477k {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f172084d = C13785b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final long f172085a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    private final c f172086b;

    /* renamed from: c, reason: collision with root package name */
    private final C18548b f172087c;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (this.f172086b.b() <= 1800000) {
            return true;
        }
        this.f172086b.b();
        return this.f172087c.b(aVar, list);
    }

    public d(c cVar, C18548b c18548b) {
        this.f172086b = cVar;
        this.f172087c = c18548b;
    }
}
