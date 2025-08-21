package mb;

import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import eb.C13784a;
import eb.C13785b;

/* renamed from: mb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15701b extends AbstractC5677b {

    /* renamed from: o, reason: collision with root package name */
    private static final C13784a f150946o = C13785b.a(C15701b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private C15700a f150947n;

    public C15701b(C6346c c6346c, e eVar, C15700a c15700a) {
        super(c6346c, eVar, "ClientStateMonitorJob");
        this.f150947n = c15700a;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        this.f150947n.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.AbstractC5678c
    public final long o() {
        return 25200000L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.g
    public final long z() {
        return 28800000L;
    }
}
