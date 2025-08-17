package F;

import F.Y;
import F.c0;
import androidx.view.C5988D;
import androidx.view.InterfaceC5989E;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Y<T> implements c0<T> {

    /* renamed from: a, reason: collision with root package name */
    final C5988D<b<T>> f9925a = new C5988D<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<c0.a<? super T>, a<T>> f9926b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<T> implements InterfaceC5989E<b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f9927a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        final c0.a<? super T> f9928b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f9929c;

        public static /* synthetic */ void a(a aVar, b bVar) {
            if (aVar.f9927a.get()) {
                if (bVar.a()) {
                    aVar.f9928b.a((Object) bVar.d());
                } else {
                    o2.i.g(bVar.c());
                    aVar.f9928b.onError(bVar.c());
                }
            }
        }

        void b() {
            this.f9927a.set(false);
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onChanged(final b<T> bVar) {
            this.f9929c.execute(new Runnable() { // from class: F.X
                @Override // java.lang.Runnable
                public final void run() {
                    Y.a.a(this.f9923a, bVar);
                }
            });
        }

        a(Executor executor, c0.a<? super T> aVar) {
            this.f9929c = executor;
            this.f9928b = aVar;
        }
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f9930a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f9931b;

        static <T> b<T> b(T t10) {
            return new b<>(t10, null);
        }

        public boolean a() {
            return this.f9931b == null;
        }

        public Throwable c() {
            return this.f9931b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f9930a;
            } else {
                str = "Error: " + this.f9931b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }

        private b(T t10, Throwable th2) {
            this.f9930a = t10;
            this.f9931b = th2;
        }

        public T d() {
            if (a()) {
                return this.f9930a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }
    }

    public static /* synthetic */ void d(Y y10, a aVar, a aVar2) {
        if (aVar != null) {
            y10.f9925a.n(aVar);
        }
        y10.f9925a.j(aVar2);
    }

    @Override // F.c0
    public void a(Executor executor, c0.a<? super T> aVar) {
        synchronized (this.f9926b) {
            try {
                final a<T> aVar2 = this.f9926b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.f9926b.put(aVar, aVar3);
                H.a.d().execute(new Runnable() { // from class: F.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        Y.d(this.f9918a, aVar2, aVar3);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.c0
    public void b(c0.a<? super T> aVar) {
        synchronized (this.f9926b) {
            try {
                final a<T> aVarRemove = this.f9926b.remove(aVar);
                if (aVarRemove != null) {
                    aVarRemove.b();
                    H.a.d().execute(new Runnable() { // from class: F.W
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9921a.f9925a.n(aVarRemove);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(T t10) {
        this.f9925a.m(b.b(t10));
    }
}
