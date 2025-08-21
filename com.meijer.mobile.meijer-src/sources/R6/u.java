package R6;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LR6/u;", "Ljava/lang/Thread;", "Ljava/lang/Runnable;", "runnable", "", "name", "LR6/t;", "taskType", "<init>", "(Ljava/lang/Runnable;Ljava/lang/String;LR6/t;)V", "a", "LR6/t;", "()LR6/t;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class u extends Thread {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t taskType;

    /* renamed from: a, reason: from getter */
    public final t getTaskType() {
        return this.taskType;
    }

    public u(Runnable runnable, String str, t tVar) {
        super(runnable, str);
        this.taskType = tVar;
    }
}
