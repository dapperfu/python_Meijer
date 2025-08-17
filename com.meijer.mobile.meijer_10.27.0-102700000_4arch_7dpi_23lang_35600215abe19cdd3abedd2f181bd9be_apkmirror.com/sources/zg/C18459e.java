package zg;

import Ed.C3500k5;
import Td.AbstractC5232j;
import Td.C5224b;
import Td.C5235m;
import Td.InterfaceC5228f;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import com.google.android.gms.common.internal.C6528j;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.AbstractC16961f;
import yg.C18212a;

/* renamed from: zg.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18459e<DetectionResultT> implements Closeable, InterfaceC6029r {

    /* renamed from: f, reason: collision with root package name */
    private static final C6528j f171832f = new C6528j("MobileVisionBase", "");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f171833g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f171834a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16961f f171835b;

    /* renamed from: c, reason: collision with root package name */
    private final C5224b f171836c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f171837d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5232j f171838e;

    public synchronized AbstractC5232j<DetectionResultT> b(final C18212a c18212a) {
        r.m(c18212a, "InputImage can not be null");
        if (this.f171834a.get()) {
            return C5235m.e(new MlKitException("This detector is already closed!", 14));
        }
        if (c18212a.j() < 32 || c18212a.f() < 32) {
            return C5235m.e(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f171835b.a(this.f171837d, new Callable() { // from class: zg.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f171839a.c(c18212a);
            }
        }, this.f171836c.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, ug.InterfaceC17254a
    @InterfaceC5990F(AbstractC6023l.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f171834a.getAndSet(true)) {
            return;
        }
        this.f171836c.a();
        this.f171835b.e(this.f171837d);
    }

    final /* synthetic */ Object c(C18212a c18212a) throws Exception {
        C3500k5 c3500k5G = C3500k5.g("detectorTaskWithResource#run");
        c3500k5G.b();
        try {
            Object objI = this.f171835b.i(c18212a);
            c3500k5G.close();
            return objI;
        } catch (Throwable th2) {
            try {
                c3500k5G.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public C18459e(AbstractC16961f<DetectionResultT, C18212a> abstractC16961f, Executor executor) {
        this.f171835b = abstractC16961f;
        C5224b c5224b = new C5224b();
        this.f171836c = c5224b;
        this.f171837d = executor;
        abstractC16961f.c();
        this.f171838e = abstractC16961f.a(executor, new Callable() { // from class: zg.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = C18459e.f171833g;
                return null;
            }
        }, c5224b.b()).e(new InterfaceC5228f() { // from class: zg.h
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                C18459e.f171832f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }
}
