package kb;

import Za.e;
import cb.C6380a;
import cb.C6381b;

/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15130b extends Ya.b {

    /* renamed from: o, reason: collision with root package name */
    private static final C6380a f141800o = C6381b.a(C15130b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private C15129a f141801n;

    public C15130b(Za.c cVar, e eVar, C15129a c15129a) {
        super(cVar, eVar, "ClientStateMonitorJob");
        this.f141801n = c15129a;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        this.f141801n.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.c
    public final long o() {
        return 25200000L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.g
    public final long z() {
        return 28800000L;
    }
}
