package F;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3266a extends F {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8700a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8701b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f8700a.equals(f10.b()) && this.f8701b.equals(f10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.F
    public Executor b() {
        return this.f8700a;
    }

    @Override // F.F
    public Handler c() {
        return this.f8701b;
    }

    public int hashCode() {
        return ((this.f8700a.hashCode() ^ 1000003) * 1000003) ^ this.f8701b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f8700a + ", schedulerHandler=" + this.f8701b + "}";
    }

    C3266a(Executor executor, Handler handler) {
        if (executor != null) {
            this.f8700a = executor;
            if (handler != null) {
                this.f8701b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }
}
