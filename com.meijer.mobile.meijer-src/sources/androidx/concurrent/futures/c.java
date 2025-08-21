package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f53205a;

        /* renamed from: b, reason: collision with root package name */
        d<T> f53206b;

        /* renamed from: c, reason: collision with root package name */
        private f<Void> f53207c = f.I();

        /* renamed from: d, reason: collision with root package name */
        private boolean f53208d;

        private void e() {
            this.f53205a = null;
            this.f53206b = null;
            this.f53207c = null;
        }

        void b() {
            this.f53205a = null;
            this.f53206b = null;
            this.f53207c.E(null);
        }

        public boolean c(T t10) {
            this.f53208d = true;
            d<T> dVar = this.f53206b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f53208d = true;
            d<T> dVar = this.f53206b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th2) {
            this.f53208d = true;
            d<T> dVar = this.f53206b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        public void a(Runnable runnable, Executor executor) {
            f<Void> fVar = this.f53207c;
            if (fVar != null) {
                fVar.addListener(runnable, executor);
            }
        }

        protected void finalize() {
            f<Void> fVar;
            d<T> dVar = this.f53206b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f53205a));
            }
            if (this.f53208d || (fVar = this.f53207c) == null) {
                return;
            }
            fVar.E(null);
        }

        a() {
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC1101c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    private static final class d<T> implements q<T> {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f53209a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f53210b = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String B() {
                a<T> aVar = d.this.f53209a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f53205a + "]";
            }
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f53210b.get();
        }

        boolean a(boolean z10) {
            return this.f53210b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.q
        public void addListener(Runnable runnable, Executor executor) {
            this.f53210b.addListener(runnable, executor);
        }

        boolean b(T t10) {
            return this.f53210b.E(t10);
        }

        boolean c(Throwable th2) {
            return this.f53210b.F(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f53209a.get();
            boolean zCancel = this.f53210b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f53210b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f53210b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f53210b.isDone();
        }

        public String toString() {
            return this.f53210b.toString();
        }

        d(a<T> aVar) {
            this.f53209a = new WeakReference<>(aVar);
        }
    }

    static final class b extends Throwable {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        b(String str) {
            super(str);
        }
    }

    public static <T> q<T> a(InterfaceC1101c<T> interfaceC1101c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f53206b = dVar;
        aVar.f53205a = interfaceC1101c.getClass();
        try {
            Object objA = interfaceC1101c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f53205a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
