package s7;

import android.util.Log;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import o2.h;

/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17028a {

    /* renamed from: a, reason: collision with root package name */
    private static final g<Object> f160067a = new C2496a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: s7.a$b */
    class b<T> implements d<List<T>> {
        @Override // s7.C17028a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }

        b() {
        }
    }

    /* renamed from: s7.a$d */
    public interface d<T> {
        T a();
    }

    /* renamed from: s7.a$e */
    private static final class e<T> implements o2.f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f160068a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f160069b;

        /* renamed from: c, reason: collision with root package name */
        private final o2.f<T> f160070c;

        @Override // o2.f
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).e().b(true);
            }
            this.f160069b.a(t10);
            return this.f160070c.a(t10);
        }

        @Override // o2.f
        public T b() {
            T tB = this.f160070c.b();
            if (tB == null) {
                tB = this.f160068a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    FS.log_v("FactoryPools", "Created new " + tB.getClass());
                }
            }
            if (tB instanceof f) {
                tB.e().b(false);
            }
            return (T) tB;
        }

        e(o2.f<T> fVar, d<T> dVar, g<T> gVar) {
            this.f160070c = fVar;
            this.f160068a = dVar;
            this.f160069b = gVar;
        }
    }

    /* renamed from: s7.a$f */
    public interface f {
        s7.c e();
    }

    /* renamed from: s7.a$g */
    public interface g<T> {
        void a(T t10);
    }

    /* renamed from: s7.a$a, reason: collision with other inner class name */
    class C2496a implements g<Object> {
        @Override // s7.C17028a.g
        public void a(Object obj) {
        }

        C2496a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: s7.a$c */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // s7.C17028a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    private static <T> o2.f<T> b(o2.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f160067a;
    }

    public static <T extends f> o2.f<T> d(int i10, d<T> dVar) {
        return a(new h(i10), dVar);
    }

    public static <T> o2.f<List<T>> e() {
        return f(20);
    }

    public static <T> o2.f<List<T>> f(int i10) {
        return b(new h(i10), new b(), new c());
    }

    private static <T extends f> o2.f<T> a(o2.f<T> fVar, d<T> dVar) {
        return b(fVar, dVar, c());
    }
}
