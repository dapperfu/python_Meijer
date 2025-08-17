package Q6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u0004\u0018\u00010\u0002*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "name", "LQ6/n;", "type", "", "keepAlive", "Ljava/util/concurrent/ExecutorService;", "a", "(Ljava/lang/String;LQ6/n;Z)Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Thread;", "b", "(Ljava/lang/Thread;)LQ6/n;", "taskType", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class c {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Runnable;", "newThread"}, k = 3, mv = {1, 4, 2})
    static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f29850b;

        a(String str, n nVar) {
            this.f29849a = str;
            this.f29850b = nVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable it) {
            Intrinsics.f(it, "it");
            return new o(it, this.f29849a, this.f29850b);
        }
    }

    public static final ExecutorService a(String str, n nVar, boolean z10) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        a aVar = new a(str, nVar);
        return new ThreadPoolExecutor(z10 ? 1 : 0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public static final n b(Thread thread) {
        if (!(thread instanceof o)) {
            thread = null;
        }
        o oVar = (o) thread;
        if (oVar != null) {
            return oVar.getTaskType();
        }
        return null;
    }
}
