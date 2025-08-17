package F;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class F {
    public abstract Executor b();

    public abstract Handler c();

    public static F a(Executor executor, Handler handler) {
        return new C3604a(executor, handler);
    }
}
