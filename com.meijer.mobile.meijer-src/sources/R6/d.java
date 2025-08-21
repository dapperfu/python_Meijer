package R6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u0004\u0018\u00010\u0002*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "name", "LR6/t;", "type", "", "keepAlive", "Ljava/util/concurrent/ExecutorService;", "b", "(Ljava/lang/String;LR6/t;Z)Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Thread;", "d", "(Ljava/lang/Thread;)LR6/t;", "taskType", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final ExecutorService b(final String str, final t tVar, boolean z10) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: R6.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.c(str, tVar, runnable);
            }
        };
        return new ThreadPoolExecutor(z10 ? 1 : 0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(String str, t tVar, Runnable runnable) {
        return new u(runnable, str, tVar);
    }

    public static final t d(Thread thread) {
        u uVar = thread instanceof u ? (u) thread : null;
        if (uVar == null) {
            return null;
        }
        return uVar.getTaskType();
    }
}
