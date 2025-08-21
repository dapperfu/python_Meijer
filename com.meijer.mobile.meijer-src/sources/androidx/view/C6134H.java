package androidx.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.view.AbstractC6165l;
import androidx.view.ReportFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/lifecycle/H;", "Landroidx/lifecycle/s;", "<init>", "()V", "", "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/u;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/ReportFragment$a;", "Landroidx/lifecycle/ReportFragment$a;", "initializationListener", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "i", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6134H implements InterfaceC6172s {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final C6134H f55377j = new C6134H();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int startedCounter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int resumedCounter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean pauseSent = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean stopSent = true;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C6174u registry = new C6174u(this);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.G
        @Override // java.lang.Runnable
        public final void run() {
            C6134H.i(this.f55375a);
        }
    };

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ReportFragment.a initializationListener = new d();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/H$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.H$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f55386a = new a();

        @JvmStatic
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.j(activity, "activity");
            Intrinsics.j(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/H$b;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "a", "()Landroidx/lifecycle/s;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/H;", "newInstance", "Landroidx/lifecycle/H;", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.H$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void b(Context context) {
            Intrinsics.j(context, "context");
            C6134H.f55377j.h(context);
        }

        @JvmStatic
        public final InterfaceC6172s a() {
            return C6134H.f55377j;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/H$c", "Landroidx/lifecycle/h;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.H$c */
    public static final class c extends C6159h {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/H$c$a", "Landroidx/lifecycle/h;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.H$c$a */
        public static final class a extends C6159h {
            final /* synthetic */ C6134H this$0;

            a(C6134H c6134h) {
                this.this$0 = c6134h;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.j(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.j(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.view.C6159h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.j(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.INSTANCE.b(activity).e(C6134H.this.initializationListener);
            }
        }

        @Override // androidx.view.C6159h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.j(activity, "activity");
            C6134H.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.j(activity, "activity");
            a.a(activity, new a(C6134H.this));
        }

        @Override // androidx.view.C6159h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.j(activity, "activity");
            C6134H.this.g();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/H$d", "Landroidx/lifecycle/ReportFragment$a;", "", "onCreate", "()V", "onStart", "onResume", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.H$d */
    public static final class d implements ReportFragment.a {
        @Override // androidx.lifecycle.ReportFragment.a
        public void onCreate() {
        }

        d() {
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onResume() {
            C6134H.this.e();
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onStart() {
            C6134H.this.f();
        }
    }

    @JvmStatic
    public static final InterfaceC6172s l() {
        return INSTANCE.a();
    }

    public final void d() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            Intrinsics.g(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void e() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.i(AbstractC6165l.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.g(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void f() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.i(AbstractC6165l.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void g() {
        this.startedCounter--;
        k();
    }

    @Override // androidx.view.InterfaceC6172s
    public AbstractC6165l getLifecycle() {
        return this.registry;
    }

    public final void h(Context context) {
        Intrinsics.j(context, "context");
        this.handler = new Handler();
        this.registry.i(AbstractC6165l.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.i(AbstractC6165l.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.i(AbstractC6165l.a.ON_STOP);
            this.stopSent = true;
        }
    }

    private C6134H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C6134H c6134h) {
        c6134h.j();
        c6134h.k();
    }
}
