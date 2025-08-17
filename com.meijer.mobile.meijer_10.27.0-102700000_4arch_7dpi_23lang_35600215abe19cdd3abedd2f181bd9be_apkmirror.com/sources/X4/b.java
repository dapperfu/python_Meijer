package X4;

import java.util.concurrent.Executor;
import qv.AbstractC16618K;
import qv.C16669u0;

/* loaded from: classes4.dex */
public interface b {
    Executor a();

    a c();

    default AbstractC16618K b() {
        return C16669u0.b(c());
    }

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
