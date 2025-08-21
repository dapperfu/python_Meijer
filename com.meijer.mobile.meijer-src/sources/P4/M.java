package P4;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LP4/M;", "LP4/K;", "LP4/t;", "processor", "LY4/b;", "workTaskExecutor", "<init>", "(LP4/t;LY4/b;)V", "LP4/y;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "", "d", "(LP4/y;Landroidx/work/WorkerParameters$a;)V", "", "reason", "c", "(LP4/y;I)V", "a", "LP4/t;", "getProcessor", "()LP4/t;", "b", "LY4/b;", "getWorkTaskExecutor", "()LY4/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class M implements K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4584t processor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y4.b workTaskExecutor;

    public M(C4584t processor, Y4.b workTaskExecutor) {
        Intrinsics.j(processor, "processor");
        Intrinsics.j(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(M m10, y yVar, WorkerParameters.a aVar) throws Throwable {
        m10.processor.p(yVar, aVar);
    }

    @Override // P4.K
    public void c(y workSpecId, int reason) {
        Intrinsics.j(workSpecId, "workSpecId");
        this.workTaskExecutor.d(new X4.F(this.processor, workSpecId, false, reason));
    }

    @Override // P4.K
    public void d(final y workSpecId, final WorkerParameters.a runtimeExtras) {
        Intrinsics.j(workSpecId, "workSpecId");
        this.workTaskExecutor.d(new Runnable() { // from class: P4.L
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                M.g(this.f25461a, workSpecId, runtimeExtras);
            }
        });
    }
}
