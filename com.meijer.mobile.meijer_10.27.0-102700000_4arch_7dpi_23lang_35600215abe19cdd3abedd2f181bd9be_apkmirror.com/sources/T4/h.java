package T4;

import N4.AbstractC4333v;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010%\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"LT4/h;", "T", "", "Landroid/content/Context;", "context", "LX4/b;", "taskExecutor", "<init>", "(Landroid/content/Context;LX4/b;)V", "LR4/a;", "listener", "", "c", "(LR4/a;)V", "f", "e", "()Ljava/lang/Object;", "h", "()V", "i", "a", "LX4/b;", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "currentState", "newState", "getState", "g", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X4.b taskExecutor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<R4.a<T>> listeners;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private T currentState;

    public abstract T e();

    public abstract void h();

    public abstract void i();

    protected h(Context context, X4.b taskExecutor) {
        Intrinsics.j(context, "context");
        Intrinsics.j(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((R4.a) it.next()).a(hVar.currentState);
        }
    }

    public final void c(R4.a<T> listener) {
        Intrinsics.j(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = e();
                        AbstractC4333v.e().a(i.f34806a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        h();
                    }
                    listener.a(this.currentState);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d, reason: from getter */
    protected final Context getAppContext() {
        return this.appContext;
    }

    public final void f(R4.a<T> listener) {
        Intrinsics.j(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    i();
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(T t10) {
        synchronized (this.lock) {
            T t11 = this.currentState;
            if (t11 == null || !Intrinsics.e(t11, t10)) {
                this.currentState = t10;
                final List listJ1 = CollectionsKt.j1(this.listeners);
                this.taskExecutor.a().execute(new Runnable() { // from class: T4.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listJ1, this);
                    }
                });
                Unit unit = Unit.f142422a;
            }
        }
    }
}
