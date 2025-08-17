package Kb;

import Za.e;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class b extends Ya.b {

    /* renamed from: o, reason: collision with root package name */
    private static final C6380a f16360o = C6381b.a(b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private c f16361n;

    public b(Za.c cVar, e eVar, c cVar2) {
        super(cVar, eVar, null);
        this.f16361n = cVar2;
    }

    @Override // Ya.c, Za.d
    public final String e() {
        return "TimeZoneChangeJob";
    }

    @Override // Ya.c
    public final void x() {
        this.f16361n.b();
    }
}
