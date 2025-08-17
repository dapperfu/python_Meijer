package l9;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ll9/c;", "", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)Z", "", "delay", "", "c", "(Ljava/lang/Runnable;J)V", "d", "(Ljava/lang/Runnable;)V", "a", "Landroid/os/Handler;", "()Landroid/os/Handler;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    public c(Handler handler) {
        Intrinsics.j(handler, "handler");
        this.handler = handler;
    }

    /* renamed from: a, reason: from getter */
    public Handler getHandler() {
        return this.handler;
    }

    public boolean b(Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        return getHandler().post(runnable);
    }

    public void c(Runnable runnable, long delay) {
        Intrinsics.j(runnable, "runnable");
        getHandler().postDelayed(runnable, delay);
    }

    public void d(Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        getHandler().removeCallbacks(runnable);
    }
}
