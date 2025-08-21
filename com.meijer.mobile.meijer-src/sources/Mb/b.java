package Mb;

import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class b extends AbstractC5677b {

    /* renamed from: o, reason: collision with root package name */
    private static final C13784a f19719o = C13785b.a(b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private c f19720n;

    public b(C6346c c6346c, e eVar, c cVar) {
        super(c6346c, eVar, null);
        this.f19720n = cVar;
    }

    @Override // ab.AbstractC5678c, bb.d
    public final String e() {
        return "TimeZoneChangeJob";
    }

    @Override // ab.AbstractC5678c
    public final void x() {
        this.f19720n.b();
    }
}
