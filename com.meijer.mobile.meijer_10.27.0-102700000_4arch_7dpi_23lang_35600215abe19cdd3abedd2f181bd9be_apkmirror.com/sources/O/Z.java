package O;

import C.AbstractC2967j;
import C.d0;
import C.e0;
import C.o0;
import androidx.camera.core.ProcessingException;
import java.util.Objects;
import java.util.concurrent.Executor;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public class Z implements S {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f22861a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f22862b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15993a<Throwable> f22863c;

    @Override // O.S
    public void release() {
    }

    @Override // C.e0
    public void a(final d0 d0Var) {
        this.f22862b.execute(new Runnable() { // from class: O.Y
            @Override // java.lang.Runnable
            public final void run() {
                Z.d(this.f22859a, d0Var);
            }
        });
    }

    @Override // O.S
    public com.google.common.util.concurrent.q<Void> b(int i10, int i11) {
        return I.n.n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // C.e0
    public void c(final o0 o0Var) {
        this.f22862b.execute(new Runnable() { // from class: O.X
            @Override // java.lang.Runnable
            public final void run() {
                Z.e(this.f22857a, o0Var);
            }
        });
    }

    public Z(AbstractC2967j abstractC2967j) {
        e0 e0VarF = abstractC2967j.f();
        Objects.requireNonNull(e0VarF);
        this.f22861a = e0VarF;
        this.f22862b = abstractC2967j.c();
        this.f22863c = abstractC2967j.b();
    }

    public static /* synthetic */ void d(Z z10, d0 d0Var) {
        z10.getClass();
        try {
            z10.f22861a.a(d0Var);
        } catch (ProcessingException e10) {
            C.P.d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e10);
            z10.f22863c.accept(e10);
        }
    }

    public static /* synthetic */ void e(Z z10, o0 o0Var) {
        z10.getClass();
        try {
            z10.f22861a.c(o0Var);
        } catch (ProcessingException e10) {
            C.P.d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e10);
            z10.f22863c.accept(e10);
        }
    }
}
