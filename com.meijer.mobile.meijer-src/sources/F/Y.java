package F;

import F.Y;
import F.c0;
import androidx.view.C6130D;
import androidx.view.InterfaceC6131E;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Y<T> implements c0<T> {

    /* renamed from: a, reason: collision with root package name */
    final C6130D<b<T>> f8692a = new C6130D<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<c0.a<? super T>, a<T>> f8693b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<T> implements InterfaceC6131E<b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f8694a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        final c0.a<? super T> f8695b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f8696c;

        public static /* synthetic */ void a(a aVar, b bVar) {
            if (aVar.f8694a.get()) {
                if (bVar.a()) {
                    aVar.f8695b.a((Object) bVar.d());
                } else {
                    o2.i.g(bVar.c());
                    aVar.f8695b.onError(bVar.c());
                }
            }
        }

        void b() {
            this.f8694a.set(false);
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onChanged(final b<T> bVar) {
            this.f8696c.execute(new Runnable() { // from class: F.X
                @Override // java.lang.Runnable
                public final void run() {
                    Y.a.a(this.f8690a, bVar);
                }
            });
        }

        a(Executor executor, c0.a<? super T> aVar) {
            this.f8696c = executor;
            this.f8695b = aVar;
        }
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f8697a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f8698b;

        static <T> b<T> b(T t10) {
            return new b<>(t10, null);
        }

        public boolean a() {
            return this.f8698b == null;
        }

        public Throwable c() {
            return this.f8698b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f8697a;
            } else {
                str = "Error: " + this.f8698b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }

        private b(T t10, Throwable th2) {
            this.f8697a = t10;
            this.f8698b = th2;
        }

        public T d() {
            if (a()) {
                return this.f8697a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }
    }

    public static /* synthetic */ void d(Y y10, a aVar, a aVar2) {
        if (aVar != null) {
            y10.f8692a.n(aVar);
        }
        y10.f8692a.j(aVar2);
    }

    @Override // F.c0
    public void a(Executor executor, c0.a<? super T> aVar) {
        synchronized (this.f8693b) {
            try {
                final a<T> aVar2 = this.f8693b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.f8693b.put(aVar, aVar3);
                H.a.d().execute(new Runnable() { // from class: F.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        Y.d(this.f8685a, aVar2, aVar3);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.c0
    public void b(c0.a<? super T> aVar) {
        synchronized (this.f8693b) {
            try {
                final a<T> aVarRemove = this.f8693b.remove(aVar);
                if (aVarRemove != null) {
                    aVarRemove.b();
                    H.a.d().execute(new Runnable() { // from class: F.W
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8688a.f8692a.n(aVarRemove);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(T t10) {
        this.f8692a.m(b.b(t10));
    }
}
