package uv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0010¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luv/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(JZ)V", "()V", "a", "J", "b", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractRunnableC17492h implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long submissionTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public boolean taskContext;

    public AbstractRunnableC17492h(long j10, boolean z10) {
        this.submissionTime = j10;
        this.taskContext = z10;
    }

    public AbstractRunnableC17492h() {
        this(0L, false);
    }
}
