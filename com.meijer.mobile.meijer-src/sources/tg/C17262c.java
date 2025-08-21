package tg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: tg.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17262c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f163063a = new HashMap();

    /* renamed from: tg.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f163064a;

        /* renamed from: b, reason: collision with root package name */
        private final Kf.b f163065b;

        final Kf.b a() {
            return this.f163065b;
        }

        final Class b() {
            return this.f163064a;
        }

        public <RemoteT extends AbstractC17261b> a(Class<RemoteT> cls, Kf.b<Object> bVar) {
            this.f163064a = cls;
            this.f163065b = bVar;
        }
    }

    public C17262c(Set<a> set) {
        for (a aVar : set) {
            this.f163063a.put(aVar.b(), aVar.a());
        }
    }
}
