package R8;

import J9.k;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.InterfaceC16006a;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J#\u0010\u001a\u001a\u00020\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00180%8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010\u0019\u001a\u00020+8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"LR8/i;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "Landroid/app/Activity;", "Ll9/c;", "handler", "Lo9/a;", "currentActivityProvider", "<init>", "(Ll9/c;Lo9/a;)V", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lkotlin/Function1;", "callback", "h", "(Lkotlin/jvm/functions/Function1;)V", "i", "value", "g", "d", "()Landroid/app/Activity;", "a", "Ll9/c;", "b", "Lo9/a;", "", "c", "Ljava/util/List;", "activityCallbacks", "Landroid/app/Activity;", "mCurrentActivity", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.c handler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16006a<Activity> currentActivityProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<Activity, Unit>> activityCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Activity mCurrentActivity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Runnable callback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.emarsys.core.activity.TransitionSafeCurrentActivityWatchdog$register$1", f = "TransitionSafeCurrentActivityWatchdog.kt", l = {79}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31960a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31961b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Activity, Unit> f31963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Activity, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31963d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = i.this.new a(this.f31963d, continuation);
            aVar.f31961b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC16622O interfaceC16622O;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f31960a;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC16622O = (InterfaceC16622O) this.f31961b;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O2 = (InterfaceC16622O) this.f31961b;
                this.f31961b = interfaceC16622O2;
                this.f31960a = 1;
                Object objA = L8.f.a(this);
                if (objA == objF) {
                    return objF;
                }
                interfaceC16622O = interfaceC16622O2;
                obj = objA;
            }
            Activity activity = (Activity) obj;
            if (activity == null) {
                I9.e.INSTANCE.c(new k(interfaceC16622O.getClass(), "TransitionSafeCurrentActivityWatchdog#register", MapsKt.g(TuplesKt.a("currentActivity", BuildConfig.TRAVIS)), null, 8, null));
            } else {
                i.this.currentActivityProvider.set(activity);
                this.f31963d.invoke(activity);
            }
            return Unit.f142422a;
        }
    }

    public i(l9.c handler, InterfaceC16006a<Activity> currentActivityProvider) {
        Intrinsics.j(handler, "handler");
        Intrinsics.j(currentActivityProvider, "currentActivityProvider");
        this.handler = handler;
        this.currentActivityProvider = currentActivityProvider;
        this.activityCallbacks = new ArrayList();
        this.callback = new Runnable() { // from class: R8.h
            @Override // java.lang.Runnable
            public final void run() {
                i.f(this.f31954a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit e(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, Activity it) {
        Intrinsics.j(it, "it");
        objectRef.f142835a = it;
        countDownLatch.countDown();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i iVar) {
        Activity activity = iVar.mCurrentActivity;
        if (activity != null) {
            Intrinsics.g(activity);
            iVar.g(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Activity d() throws InterruptedException {
        Activity activity = this.mCurrentActivity;
        if (activity != null) {
            Intrinsics.g(activity);
            return activity;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Function1<? super Activity, Unit> function1 = new Function1() { // from class: R8.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.e(objectRef, countDownLatch, (Activity) obj);
            }
        };
        h(function1);
        countDownLatch.await();
        i(function1);
        T t10 = objectRef.f142835a;
        if (t10 != 0) {
            return (Activity) t10;
        }
        Intrinsics.y("result");
        return null;
    }

    public void g(Activity value) {
        Intrinsics.j(value, "value");
        this.currentActivityProvider.set(value);
        Iterator<T> it = this.activityCallbacks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(value);
        }
    }

    public void h(Function1<? super Activity, Unit> callback) {
        Intrinsics.j(callback, "callback");
        this.activityCallbacks.add(callback);
        C16648k.d(C16623P.a(C16639f0.a()), null, null, new a(callback, null), 3, null);
    }

    public void i(Function1<? super Activity, Unit> callback) {
        Intrinsics.j(callback, "callback");
        this.activityCallbacks.remove(callback);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.j(activity, "activity");
        this.mCurrentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (Intrinsics.e(activity, this.mCurrentActivity)) {
            this.mCurrentActivity = null;
            this.handler.d(this.callback);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (Intrinsics.e(activity, this.mCurrentActivity)) {
            this.mCurrentActivity = null;
            this.handler.d(this.callback);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.mCurrentActivity = activity;
        this.handler.c(this.callback, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(outState, "outState");
        if (Intrinsics.e(activity, this.mCurrentActivity)) {
            this.mCurrentActivity = null;
            this.handler.d(this.callback);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.j(activity, "activity");
        this.mCurrentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (Intrinsics.e(activity, this.mCurrentActivity)) {
            this.mCurrentActivity = null;
            this.handler.d(this.callback);
        }
    }
}
