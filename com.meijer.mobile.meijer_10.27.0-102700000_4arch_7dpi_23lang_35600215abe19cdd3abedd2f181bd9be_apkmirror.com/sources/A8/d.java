package A8;

import J8.f;
import J8.h;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import t8.C17073a;

/* loaded from: classes4.dex */
public class d<T extends Enum<T>> implements A8.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f123a;

    /* renamed from: b, reason: collision with root package name */
    private final C17073a f124b;

    /* renamed from: c, reason: collision with root package name */
    private final h f125c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private final f f126d;

    /* renamed from: g, reason: collision with root package name */
    private C17073a f129g;

    /* renamed from: f, reason: collision with root package name */
    private final Map<T, C17073a> f128f = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f127e = new AtomicBoolean(false);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f130a;

        /* renamed from: b, reason: collision with root package name */
        private C17073a f131b;

        /* renamed from: c, reason: collision with root package name */
        private h f132c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        private f f133d;

        public String a() {
            return this.f130a;
        }

        public h b() {
            return this.f132c;
        }

        public f c() {
            return this.f133d;
        }

        public C17073a d() {
            return this.f131b;
        }

        public void e(String str) {
            this.f130a = str;
        }

        public void f(h hVar) {
            this.f132c = hVar;
        }

        @Deprecated
        public void g(f fVar) {
            this.f133d = fVar;
        }

        public void h(C17073a c17073a) {
            this.f131b = c17073a;
        }
    }

    @Override // A8.a
    public AtomicBoolean a() {
        return this.f127e;
    }

    @Override // A8.a
    public C17073a b() {
        return this.f124b;
    }

    @Override // A8.a
    public f c() {
        return this.f126d;
    }

    @Override // A8.a
    public Map<T, C17073a> d() {
        return this.f128f;
    }

    @Override // A8.a
    public C17073a e() {
        return this.f129g;
    }

    @Override // A8.a
    public void f(G8.b<T> bVar) {
        this.f128f.put(bVar.a(), new C17073a(bVar.c(), bVar.b()));
    }

    @Override // A8.a
    public h g() {
        return this.f125c;
    }

    @Override // A8.a
    public String getName() {
        return this.f123a;
    }

    @Override // A8.a
    public void h(C17073a c17073a) {
        this.f129g = c17073a;
    }

    public String toString() {
        return "LifecycleActionImpl{name='" + this.f123a + "', startPoint=" + this.f124b + ", endPoint=" + this.f129g + ", parentAction=" + this.f125c + ", lifecycleEvents=" + this.f128f + '}';
    }

    public d(a aVar) {
        this.f123a = aVar.a();
        this.f124b = aVar.d();
        this.f125c = aVar.b();
        this.f126d = aVar.c();
    }
}
