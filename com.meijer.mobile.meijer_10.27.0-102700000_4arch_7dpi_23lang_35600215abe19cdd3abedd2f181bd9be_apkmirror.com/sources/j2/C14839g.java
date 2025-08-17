package j2;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14839g {

    /* renamed from: j2.g$a */
    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f139175a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f139175a.post((Runnable) o2.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f139175a + " is shutting down");
        }

        a(Handler handler) {
            this.f139175a = (Handler) o2.i.g(handler);
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
