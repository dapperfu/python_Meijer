package a9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"La9/g;", "Landroid/content/BroadcastReceiver;", "La9/a;", "connectionChangeListener", "La9/e;", "connectionWatchDog", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(La9/a;La9/e;Ln9/b;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "La9/a;", "b", "La9/e;", "c", "Ln9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5669a connectionChangeListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5673e connectionWatchDog;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    public g(InterfaceC5669a connectionChangeListener, C5673e connectionWatchDog, n9.b concurrentHandlerHolder) {
        Intrinsics.j(connectionChangeListener, "connectionChangeListener");
        Intrinsics.j(connectionWatchDog, "connectionWatchDog");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.connectionChangeListener = connectionChangeListener;
        this.connectionWatchDog = connectionWatchDog;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g gVar) {
        gVar.connectionChangeListener.a(gVar.connectionWatchDog.a(), gVar.connectionWatchDog.b());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.j(context, "context");
        Intrinsics.j(intent, "intent");
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: a9.f
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f45322a);
            }
        });
    }
}
