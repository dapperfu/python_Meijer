package Wd;

import Wd.c;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40924a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC0880b<T> f40925b;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<T> f40926a;

        /* renamed from: b, reason: collision with root package name */
        private final c.b f40927b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40928c;

        @RecentlyNonNull
        public SparseArray<T> a() {
            return this.f40926a;
        }

        public a(@RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull c.b bVar, boolean z10) {
            this.f40926a = sparseArray;
            this.f40927b = bVar;
            this.f40928c = z10;
        }
    }

    /* renamed from: Wd.b$b, reason: collision with other inner class name */
    public interface InterfaceC0880b<T> {
        void a(@RecentlyNonNull a<T> aVar);

        void release();
    }

    @RecentlyNonNull
    public abstract SparseArray<T> a(@RecentlyNonNull c cVar);

    public boolean b() {
        return true;
    }

    public void c(@RecentlyNonNull c cVar) {
        c.b bVar = new c.b(cVar.c());
        bVar.i();
        a<T> aVar = new a<>(a(cVar), bVar, b());
        synchronized (this.f40924a) {
            try {
                InterfaceC0880b<T> interfaceC0880b = this.f40925b;
                if (interfaceC0880b == null) {
                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                }
                interfaceC0880b.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f40924a) {
            try {
                InterfaceC0880b<T> interfaceC0880b = this.f40925b;
                if (interfaceC0880b != null) {
                    interfaceC0880b.release();
                    this.f40925b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(@RecentlyNonNull InterfaceC0880b<T> interfaceC0880b) {
        synchronized (this.f40924a) {
            try {
                InterfaceC0880b<T> interfaceC0880b2 = this.f40925b;
                if (interfaceC0880b2 != null) {
                    interfaceC0880b2.release();
                }
                this.f40925b = interfaceC0880b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
