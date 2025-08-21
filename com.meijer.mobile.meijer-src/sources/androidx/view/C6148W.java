package androidx.view;

import android.os.Handler;
import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/W;", "", "Landroidx/lifecycle/s;", "provider", "<init>", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l$a;", "event", "", "f", "(Landroidx/lifecycle/l$a;)V", "c", "()V", "b", "e", "d", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/W$a;", "Landroidx/lifecycle/W$a;", "lastDispatchRunnable", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6148W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6174u registry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a lastDispatchRunnable;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/W$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/u;", "registry", "Landroidx/lifecycle/l$a;", "event", "<init>", "(Landroidx/lifecycle/u;Landroidx/lifecycle/l$a;)V", "", "run", "()V", "a", "Landroidx/lifecycle/u;", "b", "Landroidx/lifecycle/l$a;", "getEvent", "()Landroidx/lifecycle/l$a;", "", "c", "Z", "wasExecuted", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.W$a */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C6174u registry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC6165l.a event;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean wasExecuted;

        public a(C6174u registry, AbstractC6165l.a event) {
            Intrinsics.j(registry, "registry");
            Intrinsics.j(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.i(this.event);
            this.wasExecuted = true;
        }
    }

    public C6148W(InterfaceC6172s provider) {
        Intrinsics.j(provider, "provider");
        this.registry = new C6174u(provider);
        this.handler = new Handler();
    }

    private final void f(AbstractC6165l.a event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        Handler handler = this.handler;
        Intrinsics.g(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    public AbstractC6165l a() {
        return this.registry;
    }

    public void b() {
        f(AbstractC6165l.a.ON_START);
    }

    public void c() {
        f(AbstractC6165l.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC6165l.a.ON_STOP);
        f(AbstractC6165l.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC6165l.a.ON_START);
    }
}
