package O;

import C.AbstractC2967j;
import C.L;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import o2.InterfaceC15993a;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4438y {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f22928a;

    /* renamed from: b, reason: collision with root package name */
    private final C.L f22929b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15993a<Throwable> f22930c;

    public static /* synthetic */ Object a(final C4438y c4438y, final L.a aVar, final c.a aVar2) {
        c4438y.f22928a.execute(new Runnable() { // from class: O.x
            @Override // java.lang.Runnable
            public final void run() {
                C4438y.b(this.f22925a, aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public L.b c(final L.a aVar) throws ImageCaptureException {
        try {
            return (L.b) androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: O.w
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar2) {
                    return C4438y.a(this.f22923a, aVar, aVar2);
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }

    public C4438y(AbstractC2967j abstractC2967j) {
        boolean z10;
        if (abstractC2967j.g() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.a(z10);
        this.f22928a = abstractC2967j.c();
        C.L lD = abstractC2967j.d();
        Objects.requireNonNull(lD);
        this.f22929b = lD;
        this.f22930c = abstractC2967j.b();
    }

    public static /* synthetic */ void b(C4438y c4438y, L.a aVar, c.a aVar2) {
        c4438y.getClass();
        try {
            aVar2.c(c4438y.f22929b.a(aVar));
        } catch (ProcessingException e10) {
            c4438y.f22930c.accept(e10);
            aVar2.f(e10);
        }
    }
}
