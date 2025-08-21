package vb;

import eb.C13784a;
import eb.C13785b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f165734c = C13785b.a(kc.g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Map<String, b> f165735a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    Db.b f165736b;

    static String a(b bVar) {
        return bVar.L() + "_" + bVar.I() + "_" + bVar.K();
    }

    public i(Db.b bVar) {
        this.f165736b = bVar;
    }
}
