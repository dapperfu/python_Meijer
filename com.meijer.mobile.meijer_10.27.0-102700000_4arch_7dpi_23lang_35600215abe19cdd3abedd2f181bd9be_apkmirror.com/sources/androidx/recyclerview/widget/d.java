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
    private static final Executor f58075h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final r f58076a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f58077b;

    /* renamed from: c, reason: collision with root package name */
    Executor f58078c;

    /* renamed from: e, reason: collision with root package name */
    private List<T> f58080e;

    /* renamed from: g, reason: collision with root package name */
    int f58082g;

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f58079d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    private List<T> f58081f = Collections.EMPTY_LIST;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58083a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f58084b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58085c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f58086d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C1136a extends h.b {
            C1136a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f58083a.get(i10);
                Object obj2 = a.this.f58084b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f58077b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f58083a.get(i10);
                Object obj2 = a.this.f58084b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f58077b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f58083a.get(i10);
                Object obj2 = a.this.f58084b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f58077b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f58084b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f58083a.size();
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.e f58089a;

            b(h.e eVar) {
                this.f58089a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f58082g == aVar.f58085c) {
                    dVar.c(aVar.f58084b, this.f58089a, aVar.f58086d);
                }
            }
        }

        a(List list, List list2, int i10, Runnable runnable) {
            this.f58083a = list;
            this.f58084b = list2;
            this.f58085c = i10;
            this.f58086d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58078c.execute(new b(h.b(new C1136a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final Handler f58091a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f58091a.post(runnable);
        }

        c() {
        }
    }

    public void e(List<T> list) {
        f(list, null);
    }

    private void d(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f58079d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f58081f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f58079d.add(bVar);
    }

    public List<T> b() {
        return this.f58081f;
    }

    void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f58081f;
        this.f58080e = list;
        this.f58081f = Collections.unmodifiableList(list);
        eVar.b(this.f58076a);
        d(list2, runnable);
    }

    public void f(List<T> list, Runnable runnable) {
        int i10 = this.f58082g + 1;
        this.f58082g = i10;
        List<T> list2 = this.f58080e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f58081f;
        if (list == null) {
            int size = list2.size();
            this.f58080e = null;
            this.f58081f = Collections.EMPTY_LIST;
            this.f58076a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f58077b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f58080e = list;
        this.f58081f = Collections.unmodifiableList(list);
        this.f58076a.a(0, list.size());
        d(list3, runnable);
    }

    public d(r rVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f58076a = rVar;
        this.f58077b = cVar;
        if (cVar.c() != null) {
            this.f58078c = cVar.c();
        } else {
            this.f58078c = f58075h;
        }
    }
}
