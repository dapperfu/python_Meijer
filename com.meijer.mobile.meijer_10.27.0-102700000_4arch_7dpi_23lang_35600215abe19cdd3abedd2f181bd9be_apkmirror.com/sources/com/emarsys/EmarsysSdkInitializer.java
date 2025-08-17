package com.emarsys;

import L8.f;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.X0;
import qv.Z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/emarsys/EmarsysSdkInitializer;", "LD4/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "b", "()Ljava/util/List;", "Lqv/O;", "a", "Lqv/O;", "scope", "Lqv/C0;", "Lqv/C0;", "setActivityJob", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmarsysSdkInitializer implements D4.a<Unit> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope = C16623P.a(X0.b(null, 1, null).m0(C16639f0.a()));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C0 setActivityJob;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"com/emarsys/EmarsysSdkInitializer$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Application.ActivityLifecycleCallbacks {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.emarsys.EmarsysSdkInitializer$create$1$onActivityResumed$1", f = "EmarsysSdkInitializer.kt", l = {46}, m = "invokeSuspend")
        /* renamed from: com.emarsys.EmarsysSdkInitializer$a$a, reason: collision with other inner class name */
        static final class C1252a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f64187a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f64188b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1252a(Activity activity, Continuation<? super C1252a> continuation) {
                super(2, continuation);
                this.f64188b = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1252a(this.f64188b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1252a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f64187a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    this.f64187a = 1;
                    if (Z.b(500L, this) == objF) {
                        return objF;
                    }
                }
                f.b().setValue(new WeakReference<>(this.f64188b));
                return Unit.f142422a;
            }
        }

        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.j(activity, "activity");
            f.b().setValue(null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.j(activity, "activity");
            if (Intrinsics.e(activity, f.b().getValue())) {
                f.b().setValue(null);
                C0 c02 = EmarsysSdkInitializer.this.setActivityJob;
                if (c02 != null) {
                    C0.a.a(c02, null, 1, null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.j(activity, "activity");
            if (Intrinsics.e(activity, f.b().getValue())) {
                f.b().setValue(null);
                C0 c02 = EmarsysSdkInitializer.this.setActivityJob;
                if (c02 != null) {
                    C0.a.a(c02, null, 1, null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.j(activity, "activity");
            EmarsysSdkInitializer emarsysSdkInitializer = EmarsysSdkInitializer.this;
            emarsysSdkInitializer.setActivityJob = C16648k.d(emarsysSdkInitializer.scope, null, null, new C1252a(activity, null), 3, null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.j(activity, "activity");
            Intrinsics.j(outState, "outState");
            if (Intrinsics.e(activity, f.b().getValue())) {
                f.b().setValue(null);
                C0 c02 = EmarsysSdkInitializer.this.setActivityJob;
                if (c02 != null) {
                    C0.a.a(c02, null, 1, null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.j(activity, "activity");
            f.b().setValue(null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.j(activity, "activity");
            if (Intrinsics.e(activity, f.b().getValue())) {
                f.b().setValue(null);
                C0 c02 = EmarsysSdkInitializer.this.setActivityJob;
                if (c02 != null) {
                    C0.a.a(c02, null, 1, null);
                }
            }
        }
    }

    public void f(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }

    @Override // D4.a
    public /* bridge */ /* synthetic */ Unit a(Context context) {
        f(context);
        return Unit.f142422a;
    }

    @Override // D4.a
    public List<Class<? extends D4.a<?>>> b() {
        return CollectionsKt.m();
    }
}
