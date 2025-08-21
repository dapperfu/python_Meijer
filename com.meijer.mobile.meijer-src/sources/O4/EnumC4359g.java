package O4;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LO4/g;", "", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4359g implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.j(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
