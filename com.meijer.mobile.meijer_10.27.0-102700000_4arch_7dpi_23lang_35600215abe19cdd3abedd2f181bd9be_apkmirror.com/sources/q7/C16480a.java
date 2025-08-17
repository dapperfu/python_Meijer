package q7;

import android.util.Log;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import o2.h;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16480a {

    /* renamed from: a, reason: collision with root package name */
    private static final g<Object> f156952a = new C2431a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: q7.a$b */
    class b<T> implements d<List<T>> {
        @Override // q7.C16480a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }

        b() {
        }
    }

    /* renamed from: q7.a$d */
    public interface d<T> {
        T a();
    }

    /* renamed from: q7.a$e */
    private static final class e<T> implements o2.f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f156953a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f156954b;

        /* renamed from: c, reason: collision with root package name */
        private final o2.f<T> f156955c;

        @Override // o2.f
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).e().b(true);
            }
            this.f156954b.a(t10);
            return this.f156955c.a(t10);
        }

        @Override // o2.f
        public T b() {
            T tB = this.f156955c.b();
            if (tB == null) {
                tB = this.f156953a.a();
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
            this.f156955c = fVar;
            this.f156953a = dVar;
            this.f156954b = gVar;
        }
    }

    /* renamed from: q7.a$f */
    public interface f {
        q7.c e();
    }

    /* renamed from: q7.a$g */
    public interface g<T> {
        void a(T t10);
    }

    /* renamed from: q7.a$a, reason: collision with other inner class name */
    class C2431a implements g<Object> {
        @Override // q7.C16480a.g
        public void a(Object obj) {
        }

        C2431a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: q7.a$c */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // q7.C16480a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    private static <T> o2.f<T> b(o2.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f156952a;
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
