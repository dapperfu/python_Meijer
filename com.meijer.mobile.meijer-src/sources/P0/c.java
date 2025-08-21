package P0;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "b", "()J", "delayMillis", "Lkotlin/Function0;", "", "block", "", "c", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "token", "e", "(Ljava/lang/Object;)V", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "handler", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f25179a = new Handler(Looper.getMainLooper());

    public static final Object c(long j10, final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: P0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(function0);
            }
        };
        f25179a.postDelayed(runnable, j10);
        return runnable;
    }

    public static final void e(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f25179a.removeCallbacks((Runnable) obj);
    }

    public static final long b() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0) {
        function0.invoke();
    }
}
