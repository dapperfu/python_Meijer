package rg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: rg.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16788c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f158617a = new HashMap();

    /* renamed from: rg.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f158618a;

        /* renamed from: b, reason: collision with root package name */
        private final If.b f158619b;

        final If.b a() {
            return this.f158619b;
        }

        final Class b() {
            return this.f158618a;
        }

        public <RemoteT extends AbstractC16787b> a(Class<RemoteT> cls, If.b<Object> bVar) {
            this.f158618a = cls;
            this.f158619b = bVar;
        }
    }

    public C16788c(Set<a> set) {
        for (a aVar : set) {
            this.f158617a.put(aVar.b(), aVar.a());
        }
    }
}
