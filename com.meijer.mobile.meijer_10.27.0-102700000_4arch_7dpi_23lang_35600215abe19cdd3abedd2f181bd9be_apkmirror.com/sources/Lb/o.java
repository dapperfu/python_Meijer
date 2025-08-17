package Lb;

import cb.C6380a;
import cb.C6381b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f17964c = C6381b.a(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final Bb.l f17965a;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, a> f17966b = new HashMap();

    public final synchronized a a(String str) {
        a aVar;
        try {
            aVar = this.f17966b.get(str);
            if (aVar == null) {
                aVar = (a) this.f17965a.b(str, a.class);
                if (aVar == null) {
                    aVar = new a(str, 2, 120000L, 28800000L);
                }
                aVar.g(2);
                aVar.i(120000L);
                aVar.h(28800000L);
                aVar.j(this);
                this.f17966b.put(aVar.c(), aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public o(Bb.l lVar) {
        this.f17965a = lVar;
    }
}
