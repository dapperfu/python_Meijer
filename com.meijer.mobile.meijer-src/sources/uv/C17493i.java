package uv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import mv.C15787T;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Luv/i;", "Luv/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(Ljava/lang/Runnable;JZ)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C17493i extends AbstractRunnableC17492h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Runnable block;

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    public String toString() {
        return "Task[" + C15787T.a(this.block) + '@' + C15787T.b(this.block) + ", " + this.submissionTime + ", " + C17494j.c(this.taskContext) + ']';
    }

    public C17493i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.block = runnable;
    }
}
