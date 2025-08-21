package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.concurrent.futures.c;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.C17557u;
import z.C18390g;

/* loaded from: classes.dex */
final class X1 {

    /* renamed from: a, reason: collision with root package name */
    private final C17557u f164930a;

    /* renamed from: b, reason: collision with root package name */
    private final C6130D<Integer> f164931b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f164932c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f164933d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f164934e;

    /* renamed from: f, reason: collision with root package name */
    c.a<Void> f164935f;

    /* renamed from: g, reason: collision with root package name */
    boolean f164936g;

    public static /* synthetic */ boolean a(X1 x12, TotalCaptureResult totalCaptureResult) {
        if (x12.f164935f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == x12.f164936g) {
                x12.f164935f.c(null);
                x12.f164935f = null;
            }
        }
        return false;
    }

    void b(c.a<Void> aVar, boolean z10) {
        if (!this.f164932c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f164934e) {
                e(this.f164931b, 0);
                if (aVar != null) {
                    aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.f164936g = z10;
            this.f164930a.w(z10);
            e(this.f164931b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f164935f;
            if (aVar2 != null) {
                aVar2.f(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f164935f = aVar;
        }
    }

    AbstractC6127A<Integer> c() {
        return this.f164931b;
    }

    void d(boolean z10) {
        if (this.f164934e == z10) {
            return;
        }
        this.f164934e = z10;
        if (z10) {
            return;
        }
        if (this.f164936g) {
            this.f164936g = false;
            this.f164930a.w(false);
            e(this.f164931b, 0);
        }
        c.a<Void> aVar = this.f164935f;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f164935f = null;
        }
    }

    X1(C17557u c17557u, w.B b10, Executor executor) {
        this.f164930a = c17557u;
        this.f164933d = executor;
        Objects.requireNonNull(b10);
        this.f164932c = C18390g.a(new X(b10));
        this.f164931b = new C6130D<>(0);
        c17557u.t(new C17557u.c() { // from class: v.W1
            @Override // v.C17557u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return X1.a(this.f164928a, totalCaptureResult);
            }
        });
    }

    private <T> void e(C6130D<T> c6130d, T t10) {
        if (G.o.c()) {
            c6130d.o(t10);
        } else {
            c6130d.m(t10);
        }
    }
}
