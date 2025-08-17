package yt;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import zt.C18572b;

/* loaded from: classes11.dex */
public class d implements InterfaceC17325k {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f171309d = C6381b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final long f171310a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    private final c f171311b;

    /* renamed from: c, reason: collision with root package name */
    private final C18572b f171312c;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (this.f171311b.b() <= 1800000) {
            return true;
        }
        this.f171311b.b();
        return this.f171312c.b(aVar, list);
    }

    public d(c cVar, C18572b c18572b) {
        this.f171311b = cVar;
        this.f171312c = c18572b;
    }
}
