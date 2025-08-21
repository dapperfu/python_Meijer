package Y5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000f\u000b\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LY5/b;", "", "<init>", "()V", "Landroid/app/Application;", "app", "", "d", "(Landroid/app/Application;)V", "LY5/b$a;", "listener", "c", "(LY5/b$a;)V", "e", "", "a", "Ljava/util/Set;", "listeners", "", "b", "Z", "started", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy<b> f42949d = LazyKt.b(C0908b.f42952f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<a> listeners;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean started;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LY5/b$a;", "", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityDestroyed", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        void onActivityDestroyed(Activity activity);

        void onActivityResumed(Activity activity);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY5/b;", "c", "()LY5/b;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: Y5.b$b, reason: collision with other inner class name */
    static final class C0908b extends Lambda implements Function0<b> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0908b f42952f = new C0908b();

        C0908b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LY5/b$c;", "", "<init>", "()V", "LY5/b;", "INSTANCE$delegate", "Lkotlin/Lazy;", "a", "()LY5/b;", "INSTANCE", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: Y5.b$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final b a() {
            return (b) b.f42949d.getValue();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LY5/b$d;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "LY5/b;", "appLifecycleProvider", "<init>", "(LY5/b;)V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityDestroyed", "onActivityStarted", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "a", "LY5/b;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b appLifecycleProvider;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.j(activity, "activity");
            Intrinsics.j(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.j(activity, "activity");
        }

        public d(b appLifecycleProvider) {
            Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
            this.appLifecycleProvider = appLifecycleProvider;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.j(activity, "activity");
            Iterator it = this.appLifecycleProvider.listeners.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onActivityDestroyed(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.j(activity, "activity");
            Iterator it = this.appLifecycleProvider.listeners.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onActivityResumed(activity);
            }
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final synchronized void c(a listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.add(listener);
    }

    public final synchronized void d(Application app) {
        Intrinsics.j(app, "app");
        if (this.started) {
            return;
        }
        this.started = true;
        app.registerActivityLifecycleCallbacks(new d(this));
    }

    public final synchronized void e(a listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.remove(listener);
    }

    private b() {
        this.listeners = new LinkedHashSet();
    }
}
