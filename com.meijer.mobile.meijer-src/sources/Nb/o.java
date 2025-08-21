package Nb;

import eb.C13784a;
import eb.C13785b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f20784c = C13785b.a(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final Db.l f20785a;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, a> f20786b = new HashMap();

    public final synchronized a a(String str) {
        a aVar;
        try {
            aVar = this.f20786b.get(str);
            if (aVar == null) {
                aVar = (a) this.f20785a.b(str, a.class);
                if (aVar == null) {
                    aVar = new a(str, 2, 120000L, 28800000L);
                }
                aVar.g(2);
                aVar.i(120000L);
                aVar.h(28800000L);
                aVar.j(this);
                this.f20786b.put(aVar.c(), aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public o(Db.l lVar) {
        this.f20785a = lVar;
    }
}
