package Bg;

import Gd.C3692k5;
import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.C5519m;
import Vd.InterfaceC5512f;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import com.google.android.gms.common.internal.C6653j;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ug.AbstractC17408f;

/* loaded from: classes8.dex */
public class e<DetectionResultT> implements Closeable, InterfaceC6171r {

    /* renamed from: f, reason: collision with root package name */
    private static final C6653j f2746f = new C6653j("MobileVisionBase", "");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2747g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f2748a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17408f f2749b;

    /* renamed from: c, reason: collision with root package name */
    private final C5508b f2750c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2751d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5516j f2752e;

    public synchronized AbstractC5516j<DetectionResultT> b(final Ag.a aVar) {
        r.m(aVar, "InputImage can not be null");
        if (this.f2748a.get()) {
            return C5519m.e(new MlKitException("This detector is already closed!", 14));
        }
        if (aVar.j() < 32 || aVar.f() < 32) {
            return C5519m.e(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f2749b.a(this.f2751d, new Callable() { // from class: Bg.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2753a.c(aVar);
            }
        }, this.f2750c.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC6132F(AbstractC6165l.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f2748a.getAndSet(true)) {
            return;
        }
        this.f2750c.a();
        this.f2749b.e(this.f2751d);
    }

    final /* synthetic */ Object c(Ag.a aVar) throws Exception {
        C3692k5 c3692k5G = C3692k5.g("detectorTaskWithResource#run");
        c3692k5G.b();
        try {
            Object objI = this.f2749b.i(aVar);
            c3692k5G.close();
            return objI;
        } catch (Throwable th2) {
            try {
                c3692k5G.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public e(AbstractC17408f<DetectionResultT, Ag.a> abstractC17408f, Executor executor) {
        this.f2749b = abstractC17408f;
        C5508b c5508b = new C5508b();
        this.f2750c = c5508b;
        this.f2751d = executor;
        abstractC17408f.c();
        this.f2752e = abstractC17408f.a(executor, new Callable() { // from class: Bg.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = e.f2747g;
                return null;
            }
        }, c5508b.b()).e(new InterfaceC5512f() { // from class: Bg.h
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                e.f2746f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }
}
