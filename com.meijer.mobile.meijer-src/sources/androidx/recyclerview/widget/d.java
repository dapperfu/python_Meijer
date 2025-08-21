package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f58299h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final r f58300a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f58301b;

    /* renamed from: c, reason: collision with root package name */
    Executor f58302c;

    /* renamed from: e, reason: collision with root package name */
    private List<T> f58304e;

    /* renamed from: g, reason: collision with root package name */
    int f58306g;

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f58303d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    private List<T> f58305f = Collections.EMPTY_LIST;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f58308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58309c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f58310d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C1149a extends h.b {
            C1149a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f58307a.get(i10);
                Object obj2 = a.this.f58308b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f58301b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f58307a.get(i10);
                Object obj2 = a.this.f58308b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f58301b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f58307a.get(i10);
                Object obj2 = a.this.f58308b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f58301b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f58308b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f58307a.size();
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.e f58313a;

            b(h.e eVar) {
                this.f58313a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f58306g == aVar.f58309c) {
                    dVar.c(aVar.f58308b, this.f58313a, aVar.f58310d);
                }
            }
        }

        a(List list, List list2, int i10, Runnable runnable) {
            this.f58307a = list;
            this.f58308b = list2;
            this.f58309c = i10;
            this.f58310d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58302c.execute(new b(h.b(new C1149a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final Handler f58315a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f58315a.post(runnable);
        }

        c() {
        }
    }

    public void e(List<T> list) {
        f(list, null);
    }

    private void d(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f58303d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f58305f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f58303d.add(bVar);
    }

    public List<T> b() {
        return this.f58305f;
    }

    void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f58305f;
        this.f58304e = list;
        this.f58305f = Collections.unmodifiableList(list);
        eVar.b(this.f58300a);
        d(list2, runnable);
    }

    public void f(List<T> list, Runnable runnable) {
        int i10 = this.f58306g + 1;
        this.f58306g = i10;
        List<T> list2 = this.f58304e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f58305f;
        if (list == null) {
            int size = list2.size();
            this.f58304e = null;
            this.f58305f = Collections.EMPTY_LIST;
            this.f58300a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f58301b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f58304e = list;
        this.f58305f = Collections.unmodifiableList(list);
        this.f58300a.a(0, list.size());
        d(list3, runnable);
    }

    public d(r rVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f58300a = rVar;
        this.f58301b = cVar;
        if (cVar.c() != null) {
            this.f58302c = cVar.c();
        } else {
            this.f58302c = f58299h;
        }
    }
}
