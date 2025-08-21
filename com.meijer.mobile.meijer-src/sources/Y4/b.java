package Y4;

import java.util.concurrent.Executor;
import mv.AbstractC15779K;
import mv.C15830u0;

/* loaded from: classes4.dex */
public interface b {
    Executor a();

    a c();

    default AbstractC15779K b() {
        return C15830u0.b(c());
    }

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
