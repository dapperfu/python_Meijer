package C8;

import L8.f;
import L8.h;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import v8.C17648a;

/* loaded from: classes4.dex */
public class d<T extends Enum<T>> implements C8.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4119a;

    /* renamed from: b, reason: collision with root package name */
    private final C17648a f4120b;

    /* renamed from: c, reason: collision with root package name */
    private final h f4121c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private final f f4122d;

    /* renamed from: g, reason: collision with root package name */
    private C17648a f4125g;

    /* renamed from: f, reason: collision with root package name */
    private final Map<T, C17648a> f4124f = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4123e = new AtomicBoolean(false);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f4126a;

        /* renamed from: b, reason: collision with root package name */
        private C17648a f4127b;

        /* renamed from: c, reason: collision with root package name */
        private h f4128c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        private f f4129d;

        public String a() {
            return this.f4126a;
        }

        public h b() {
            return this.f4128c;
        }

        public f c() {
            return this.f4129d;
        }

        public C17648a d() {
            return this.f4127b;
        }

        public void e(String str) {
            this.f4126a = str;
        }

        public void f(h hVar) {
            this.f4128c = hVar;
        }

        @Deprecated
        public void g(f fVar) {
            this.f4129d = fVar;
        }

        public void h(C17648a c17648a) {
            this.f4127b = c17648a;
        }
    }

    @Override // C8.a
    public AtomicBoolean a() {
        return this.f4123e;
    }

    @Override // C8.a
    public void b(C17648a c17648a) {
        this.f4125g = c17648a;
    }

    @Override // C8.a
    public C17648a c() {
        return this.f4120b;
    }

    @Override // C8.a
    public void d(I8.b<T> bVar) {
        this.f4124f.put(bVar.a(), new C17648a(bVar.c(), bVar.b()));
    }

    @Override // C8.a
    public f e() {
        return this.f4122d;
    }

    @Override // C8.a
    public Map<T, C17648a> f() {
        return this.f4124f;
    }

    @Override // C8.a
    public C17648a g() {
        return this.f4125g;
    }

    @Override // C8.a
    public String getName() {
        return this.f4119a;
    }

    @Override // C8.a
    public h h() {
        return this.f4121c;
    }

    public String toString() {
        return "LifecycleActionImpl{name='" + this.f4119a + "', startPoint=" + this.f4120b + ", endPoint=" + this.f4125g + ", parentAction=" + this.f4121c + ", lifecycleEvents=" + this.f4124f + '}';
    }

    public d(a aVar) {
        this.f4119a = aVar.a();
        this.f4120b = aVar.d();
        this.f4121c = aVar.b();
        this.f4122d = aVar.c();
    }
}
