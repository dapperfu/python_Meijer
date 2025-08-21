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
    List<? extends q<? extends V>> f14106a;

    /* renamed from: b, reason: collision with root package name */
    List<V> f14107b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14108c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f14109d;

    /* renamed from: e, reason: collision with root package name */
    private final q<List<V>> f14110e = androidx.concurrent.futures.c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    c.a<List<V>> f14111f;

    class a implements c.InterfaceC1101c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC1101c
        public Object a(c.a<List<V>> aVar) {
            o2.i.j(p.this.f14111f == null, "The result can only set once!");
            p.this.f14111f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f14107b = null;
            pVar.f14106a = null;
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f14115b;

        c(int i10, q qVar) {
            this.f14114a = i10;
            this.f14115b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.e(this.f14114a, this.f14115b);
        }
    }

    private void a() throws InterruptedException {
        List<? extends q<? extends V>> list = this.f14106a;
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
                    if (this.f14108c) {
                        return;
                    }
                }
            }
        }
    }

    private void d(Executor executor) {
        addListener(new b(), H.a.a());
        if (this.f14106a.isEmpty()) {
            this.f14111f.c(new ArrayList(this.f14107b));
            return;
        }
        for (int i10 = 0; i10 < this.f14106a.size(); i10++) {
            this.f14107b.add(null);
        }
        List<? extends q<? extends V>> list = this.f14106a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            q<? extends V> qVar = list.get(i11);
            qVar.addListener(new c(i11, qVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        this.f14110e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f14110e.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends q<? extends V>> list = this.f14106a;
        if (list != null) {
            Iterator<? extends q<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f14110e.cancel(z10);
    }

    void e(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.f14107b;
        if (isDone() || list == null) {
            o2.i.j(this.f14108c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            o2.i.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, n.m(future));
                            int iDecrementAndGet = this.f14109d.decrementAndGet();
                            o2.i.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.f14107b;
                                if (list2 != null) {
                                    this.f14111f.c(new ArrayList(list2));
                                } else {
                                    o2.i.i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f14108c) {
                                this.f14111f.f(e10.getCause());
                            }
                            int iDecrementAndGet2 = this.f14109d.decrementAndGet();
                            o2.i.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.f14107b;
                                if (list3 != null) {
                                    aVar = this.f14111f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                o2.i.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f14108c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f14109d.decrementAndGet();
                        o2.i.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.f14107b;
                            if (list4 != null) {
                                aVar = this.f14111f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            o2.i.i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f14111f.f(e11);
                    int iDecrementAndGet4 = this.f14109d.decrementAndGet();
                    o2.i.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.f14107b;
                        if (list5 != null) {
                            aVar = this.f14111f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        o2.i.i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f14108c) {
                    this.f14111f.f(e12);
                }
                int iDecrementAndGet5 = this.f14109d.decrementAndGet();
                o2.i.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.f14107b;
                    if (list6 != null) {
                        aVar = this.f14111f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    o2.i.i(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.f14109d.decrementAndGet();
            o2.i.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f14107b;
                if (list7 != null) {
                    this.f14111f.c(new ArrayList(list7));
                } else {
                    o2.i.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f14110e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f14110e.isDone();
    }

    p(List<? extends q<? extends V>> list, boolean z10, Executor executor) {
        this.f14106a = (List) o2.i.g(list);
        this.f14107b = new ArrayList(list.size());
        this.f14108c = z10;
        this.f14109d = new AtomicInteger(list.size());
        d(executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws ExecutionException, InterruptedException {
        a();
        return this.f14110e.get();
    }
}
