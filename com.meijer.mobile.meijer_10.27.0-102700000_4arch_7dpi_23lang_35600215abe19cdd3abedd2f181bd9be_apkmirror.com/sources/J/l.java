package J;

import androidx.camera.core.impl.k;
import androidx.camera.core.impl.v;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface l extends v {

    /* renamed from: d, reason: collision with root package name */
    public static final k.a<Executor> f14475d = k.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor V(Executor executor) {
        return (Executor) h(f14475d, executor);
    }
}
