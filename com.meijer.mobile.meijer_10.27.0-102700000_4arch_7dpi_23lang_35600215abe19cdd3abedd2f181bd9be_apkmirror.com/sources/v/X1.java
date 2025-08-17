package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.concurrent.futures.c;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.C17418u;
import z.C18327g;

/* loaded from: classes.dex */
final class X1 {

    /* renamed from: a, reason: collision with root package name */
    private final C17418u f163896a;

    /* renamed from: b, reason: collision with root package name */
    private final C5988D<Integer> f163897b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f163898c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f163899d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f163900e;

    /* renamed from: f, reason: collision with root package name */
    c.a<Void> f163901f;

    /* renamed from: g, reason: collision with root package name */
    boolean f163902g;

    public static /* synthetic */ boolean a(X1 x12, TotalCaptureResult totalCaptureResult) {
        if (x12.f163901f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == x12.f163902g) {
                x12.f163901f.c(null);
                x12.f163901f = null;
            }
        }
        return false;
    }

    void b(c.a<Void> aVar, boolean z10) {
        if (!this.f163898c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f163900e) {
                e(this.f163897b, 0);
                if (aVar != null) {
                    aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.f163902g = z10;
            this.f163896a.w(z10);
            e(this.f163897b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f163901f;
            if (aVar2 != null) {
                aVar2.f(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f163901f = aVar;
        }
    }

    AbstractC5985A<Integer> c() {
        return this.f163897b;
    }

    void d(boolean z10) {
        if (this.f163900e == z10) {
            return;
        }
        this.f163900e = z10;
        if (z10) {
            return;
        }
        if (this.f163902g) {
            this.f163902g = false;
            this.f163896a.w(false);
            e(this.f163897b, 0);
        }
        c.a<Void> aVar = this.f163901f;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f163901f = null;
        }
    }

    X1(C17418u c17418u, w.B b10, Executor executor) {
        this.f163896a = c17418u;
        this.f163899d = executor;
        Objects.requireNonNull(b10);
        this.f163898c = C18327g.a(new X(b10));
        this.f163897b = new C5988D<>(0);
        c17418u.t(new C17418u.c() { // from class: v.W1
            @Override // v.C17418u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return X1.a(this.f163894a, totalCaptureResult);
            }
        });
    }

    private <T> void e(C5988D<T> c5988d, T t10) {
        if (G.o.c()) {
            c5988d.o(t10);
        } else {
            c5988d.m(t10);
        }
    }
}
