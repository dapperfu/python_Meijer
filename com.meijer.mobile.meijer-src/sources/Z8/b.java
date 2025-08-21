package Z8;

import K9.e;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZ8/b;", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "handlerThread", "<init>", "(Landroid/os/HandlerThread;)V", "Landroid/os/Message;", "msg", "", "dispatchMessage", "(Landroid/os/Message;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        Intrinsics.j(handlerThread, "handlerThread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void dispatchMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        try {
            super.dispatchMessage(msg);
        } catch (Exception e10) {
            e.INSTANCE.c(new L9.b(e10, null, 2, 0 == true ? 1 : 0));
        }
    }
}
