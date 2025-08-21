package ef;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public class j {

    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new k(executor);
    }
}
