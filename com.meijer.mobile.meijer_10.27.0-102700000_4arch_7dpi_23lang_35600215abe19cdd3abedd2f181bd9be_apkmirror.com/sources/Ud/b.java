package Ud;

import Ud.c;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35899a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC0787b<T> f35900b;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<T> f35901a;

        /* renamed from: b, reason: collision with root package name */
        private final c.b f35902b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35903c;

        @RecentlyNonNull
        public SparseArray<T> a() {
            return this.f35901a;
        }

        public a(@RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull c.b bVar, boolean z10) {
            this.f35901a = sparseArray;
            this.f35902b = bVar;
            this.f35903c = z10;
        }
    }

    /* renamed from: Ud.b$b, reason: collision with other inner class name */
    public interface InterfaceC0787b<T> {
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
        synchronized (this.f35899a) {
            try {
                InterfaceC0787b<T> interfaceC0787b = this.f35900b;
                if (interfaceC0787b == null) {
                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                }
                interfaceC0787b.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f35899a) {
            try {
                InterfaceC0787b<T> interfaceC0787b = this.f35900b;
                if (interfaceC0787b != null) {
                    interfaceC0787b.release();
                    this.f35900b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(@RecentlyNonNull InterfaceC0787b<T> interfaceC0787b) {
        synchronized (this.f35899a) {
            try {
                InterfaceC0787b<T> interfaceC0787b2 = this.f35900b;
                if (interfaceC0787b2 != null) {
                    interfaceC0787b2.release();
                }
                this.f35900b = interfaceC0787b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
