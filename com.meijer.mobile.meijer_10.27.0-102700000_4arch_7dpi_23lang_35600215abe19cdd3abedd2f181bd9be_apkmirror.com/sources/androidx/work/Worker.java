package androidx.work;

import N4.C4322j;
import N4.X;
import android.content.Context;
import androidx.work.c;
import com.google.common.util.concurrent.q;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/c;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "()Landroidx/work/c$a;", "Lcom/google/common/util/concurrent/q;", "startWork", "()Lcom/google/common/util/concurrent/q;", "LN4/j;", "getForegroundInfoAsync", "getForegroundInfo", "()LN4/j;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Worker extends c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN4/j;", "c", "()LN4/j;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<C4322j> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C4322j invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/c$a;", "c", "()Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function0<c.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c.a invoke() {
            return Worker.this.doWork();
        }
    }

    public abstract c.a doWork();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.j(context, "context");
        Intrinsics.j(workerParams, "workerParams");
    }

    public C4322j getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.c
    public q<C4322j> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.i(backgroundExecutor, "backgroundExecutor");
        return X.e(backgroundExecutor, new a());
    }

    @Override // androidx.work.c
    public final q<c.a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.i(backgroundExecutor, "backgroundExecutor");
        return X.e(backgroundExecutor, new b());
    }
}
