package O;

import C.AbstractC3025j;
import C.L;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import o2.InterfaceC16068a;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4351y {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f22921a;

    /* renamed from: b, reason: collision with root package name */
    private final C.L f22922b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC16068a<Throwable> f22923c;

    public static /* synthetic */ Object a(final C4351y c4351y, final L.a aVar, final c.a aVar2) {
        c4351y.f22921a.execute(new Runnable() { // from class: O.x
            @Override // java.lang.Runnable
            public final void run() {
                C4351y.b(this.f22918a, aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public L.b c(final L.a aVar) throws ImageCaptureException {
        try {
            return (L.b) androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O.w
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar2) {
                    return C4351y.a(this.f22916a, aVar, aVar2);
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

    public C4351y(AbstractC3025j abstractC3025j) {
        boolean z10;
        if (abstractC3025j.g() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.a(z10);
        this.f22921a = abstractC3025j.c();
        C.L lD = abstractC3025j.d();
        Objects.requireNonNull(lD);
        this.f22922b = lD;
        this.f22923c = abstractC3025j.b();
    }

    public static /* synthetic */ void b(C4351y c4351y, L.a aVar, c.a aVar2) {
        c4351y.getClass();
        try {
            aVar2.c(c4351y.f22922b.a(aVar));
        } catch (ProcessingException e10) {
            c4351y.f22923c.accept(e10);
            aVar2.f(e10);
        }
    }
}
