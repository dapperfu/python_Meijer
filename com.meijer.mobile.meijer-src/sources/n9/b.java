package n9;

import android.os.Handler;
import android.os.Looper;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010#\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Ln9/b;", "", "Ln9/c;", "coreHandler", "networkHandler", "backgroundHandler", "<init>", "(Ln9/c;Ln9/c;Ln9/c;)V", "Ljava/lang/Runnable;", "runnable", "", "f", "(Ljava/lang/Runnable;)V", "h", "i", "a", "Ln9/c;", "c", "()Ln9/c;", "b", "d", "Landroid/os/Handler;", "Landroid/os/Handler;", "e", "()Landroid/os/Handler;", "uiHandler", "Landroid/os/Looper;", "Landroid/os/Looper;", "getCoreLooper", "()Landroid/os/Looper;", "coreLooper", "getNetworkLooper", "networkLooper", "g", "getBackgroundLooper", "backgroundLooper", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c coreHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c networkHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c backgroundHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler uiHandler;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Looper coreLooper;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Looper networkLooper;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Looper backgroundLooper;

    public b(c coreHandler, c networkHandler, c backgroundHandler) {
        Intrinsics.j(coreHandler, "coreHandler");
        Intrinsics.j(networkHandler, "networkHandler");
        Intrinsics.j(backgroundHandler, "backgroundHandler");
        this.coreHandler = coreHandler;
        this.networkHandler = networkHandler;
        this.backgroundHandler = backgroundHandler;
        this.uiHandler = new Handler(Looper.getMainLooper());
        Looper looper = getCoreHandler().getHandler().getLooper();
        Intrinsics.i(looper, "getLooper(...)");
        this.coreLooper = looper;
        Looper looper2 = getNetworkHandler().getHandler().getLooper();
        Intrinsics.i(looper2, "getLooper(...)");
        this.networkLooper = looper2;
        Looper looper3 = getBackgroundHandler().getHandler().getLooper();
        Intrinsics.i(looper3, "getLooper(...)");
        this.backgroundLooper = looper3;
    }

    /* renamed from: b, reason: from getter */
    public c getBackgroundHandler() {
        return this.backgroundHandler;
    }

    /* renamed from: c, reason: from getter */
    public c getCoreHandler() {
        return this.coreHandler;
    }

    /* renamed from: d, reason: from getter */
    public c getNetworkHandler() {
        return this.networkHandler;
    }

    /* renamed from: e, reason: from getter */
    public Handler getUiHandler() {
        return this.uiHandler;
    }

    public void f(final Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        if (getCoreHandler().getHandler().getLooper().getThread().getState() != Thread.State.TERMINATED) {
            getCoreHandler().b(runnable);
        } else {
            h(new Runnable() { // from class: n9.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.g(this.f152110a, runnable);
                }
            });
        }
    }

    public void h(Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        getUiHandler().post(runnable);
    }

    public void i(Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        getNetworkHandler().b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, Runnable runnable) {
        bVar.getCoreHandler().b(runnable);
    }
}
