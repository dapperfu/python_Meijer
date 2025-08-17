package I;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class p<V> implements q<List<V>> {

    /* renamed from: a, reason: collision with root package name */
    List<? extends q<? extends V>> f13433a;

    /* renamed from: b, reason: collision with root package name */
    List<V> f13434b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13435c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f13436d;

    /* renamed from: e, reason: collision with root package name */
    private final q<List<V>> f13437e = androidx.concurrent.futures.c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    c.a<List<V>> f13438f;

    class a implements c.InterfaceC1088c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC1088c
        public Object a(c.a<List<V>> aVar) {
            o2.i.j(p.this.f13438f == null, "The result can only set once!");
            p.this.f13438f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f13434b = null;
            pVar.f13433a = null;
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f13442b;

        c(int i10, q qVar) {
            this.f13441a = i10;
            this.f13442b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.e(this.f13441a, this.f13442b);
        }
    }

    private void a() throws InterruptedException {
        List<? extends q<? extends V>> list = this.f13433a;
        if (list == null || isDone()) {
            return;
        }
        for (q<? extends V> qVar : list) {
            while (!qVar.isDone()) {
                try {
                    qVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f13435c) {
                        return;
                    }
                }
            }
        }
    }

    private void d(Executor executor) {
        addListener(new b(), H.a.a());
        if (this.f13433a.isEmpty()) {
            this.f13438f.c(new ArrayList(this.f13434b));
            return;
        }
        for (int i10 = 0; i10 < this.f13433a.size(); i10++) {
            this.f13434b.add(null);
        }
        List<? extends q<? extends V>> list = this.f13433a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            q<? extends V> qVar = list.get(i11);
            qVar.addListener(new c(i11, qVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        this.f13437e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f13437e.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends q<? extends V>> list = this.f13433a;
        if (list != null) {
            Iterator<? extends q<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f13437e.cancel(z10);
    }

    void e(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.f13434b;
        if (isDone() || list == null) {
            o2.i.j(this.f13435c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            o2.i.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, n.m(future));
                            int iDecrementAndGet = this.f13436d.decrementAndGet();
                            o2.i.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.f13434b;
                                if (list2 != null) {
                                    this.f13438f.c(new ArrayList(list2));
                                } else {
                                    o2.i.i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f13435c) {
                                this.f13438f.f(e10.getCause());
                            }
                            int iDecrementAndGet2 = this.f13436d.decrementAndGet();
                            o2.i.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.f13434b;
                                if (list3 != null) {
                                    aVar = this.f13438f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                o2.i.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f13435c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f13436d.decrementAndGet();
                        o2.i.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.f13434b;
                            if (list4 != null) {
                                aVar = this.f13438f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            o2.i.i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f13438f.f(e11);
                    int iDecrementAndGet4 = this.f13436d.decrementAndGet();
                    o2.i.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.f13434b;
                        if (list5 != null) {
                            aVar = this.f13438f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        o2.i.i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f13435c) {
                    this.f13438f.f(e12);
                }
                int iDecrementAndGet5 = this.f13436d.decrementAndGet();
                o2.i.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.f13434b;
                    if (list6 != null) {
                        aVar = this.f13438f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    o2.i.i(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.f13436d.decrementAndGet();
            o2.i.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f13434b;
                if (list7 != null) {
                    this.f13438f.c(new ArrayList(list7));
                } else {
                    o2.i.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13437e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f13437e.isDone();
    }

    p(List<? extends q<? extends V>> list, boolean z10, Executor executor) {
        this.f13433a = (List) o2.i.g(list);
        this.f13434b = new ArrayList(list.size());
        this.f13435c = z10;
        this.f13436d = new AtomicInteger(list.size());
        d(executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws ExecutionException, InterruptedException {
        a();
        return this.f13437e.get();
    }
}
