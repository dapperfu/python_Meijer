package F;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3604a extends F {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9933a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9934b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f9933a.equals(f10.b()) && this.f9934b.equals(f10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.F
    public Executor b() {
        return this.f9933a;
    }

    @Override // F.F
    public Handler c() {
        return this.f9934b;
    }

    public int hashCode() {
        return ((this.f9933a.hashCode() ^ 1000003) * 1000003) ^ this.f9934b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f9933a + ", schedulerHandler=" + this.f9934b + "}";
    }

    C3604a(Executor executor, Handler handler) {
        if (executor != null) {
            this.f9933a = executor;
            if (handler != null) {
                this.f9934b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }
}
