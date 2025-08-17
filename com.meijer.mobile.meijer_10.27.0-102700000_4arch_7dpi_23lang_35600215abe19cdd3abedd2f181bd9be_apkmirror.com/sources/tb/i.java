package tb;

import cb.C6380a;
import cb.C6381b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f161556c = C6381b.a(ic.g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Map<String, b> f161557a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    Bb.b f161558b;

    static String a(b bVar) {
        return bVar.L() + "_" + bVar.I() + "_" + bVar.K();
    }

    public i(Bb.b bVar) {
        this.f161558b = bVar;
    }
}
