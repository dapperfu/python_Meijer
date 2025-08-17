package X5;

import Q5.t;
import U5.k;
import U5.l;
import U5.m;
import U5.n;
import U5.o;
import U5.r;
import X5.b;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 V*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001!B9\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0017H\u0003¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020.H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u0002062\u0010\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000109H&¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u0011\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010Q\u001a\u00020K8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\"\u001a\u0004\bN\u0010OR\u001e\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006W"}, d2 = {"LX5/a;", "LU5/n;", "T", "LU5/m;", "LX5/b$a;", "presentation", "LU5/r;", "presentationUtilityProvider", "LU5/o;", "presentationDelegate", "LX5/b;", "appLifecycleProvider", "Lqv/O;", "mainScope", "<init>", "(LU5/n;LU5/r;LU5/o;LX5/b;Lqv/O;)V", "LX5/d;", "presentationStateManager", "LL5/c;", "activityCompatOwnerUtils", "LX5/c;", "presentationObserver", "(LU5/n;LU5/r;LU5/o;LX5/b;LX5/d;LL5/c;Lqv/O;LX5/c;)V", "Landroid/app/Activity;", "activity", "", "w", "(Landroid/app/Activity;)V", "activityToAttach", "n", "q", "activityToDetach", "p", "a", "()V", "dismiss", "b", "onActivityResumed", "onActivityDestroyed", "LU5/m$a;", "getState", "()LU5/m$a;", "Lkotlin/Function0;", "onAnimationComplete", "o", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "u", "(Landroid/content/Context;)Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "s", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "r", "()Z", "", "visiblePresentations", "v", "(Ljava/util/List;)Z", "LU5/n;", "LU5/r;", "c", "LX5/b;", "d", "LX5/c;", "e", "LL5/c;", "f", "Lqv/O;", "g", "LX5/d;", "t", "()LX5/d;", "", "h", "I", "getContentIdentifier$core_phoneRelease", "()I", "getContentIdentifier$core_phoneRelease$annotations", "contentIdentifier", "Ljava/lang/ref/WeakReference;", "i", "Ljava/lang/ref/WeakReference;", "attachmentHandle", "j", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a<T extends n<T>> implements m<T>, b.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n<T> presentation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r presentationUtilityProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final X5.b appLifecycleProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X5.c presentationObserver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final L5.c activityCompatOwnerUtils;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O mainScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final X5.d presentationStateManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int contentIdentifier;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private WeakReference<Activity> attachmentHandle;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU5/n;", "T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$dismiss$1", f = "AEPPresentable.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f39131b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f39131b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f39131b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39130a == 0) {
                ResultKt.b(obj);
                ((a) this.f39131b).appLifecycleProvider.e(this.f39131b);
                if (this.f39131b.getState() == m.a.DETACHED) {
                    t.a("Services", "AEPPresentable", "Presentable is already detached. Ignoring dismiss request.", new Object[0]);
                    ((a) this.f39131b).presentation.b().a(this.f39131b, U5.c.f35755b);
                    return Unit.f142422a;
                }
                Activity activityC = ((a) this.f39131b).presentationUtilityProvider.c();
                if (activityC != null) {
                    this.f39131b.q(activityC);
                    ((a) this.f39131b).presentation.b().c(this.f39131b);
                    a.j(this.f39131b);
                    ((a) this.f39131b).presentationObserver.c(this.f39131b.c());
                    return Unit.f142422a;
                }
                t.a("Services", "AEPPresentable", "Current activity is null. Cannot dismiss presentable.", new Object[0]);
                ((a) this.f39131b).presentation.b().a(this.f39131b, k.f35767b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU5/n;", "T", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<T> f39132f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f39133g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<T> aVar, Activity activity) {
            super(0);
            this.f39132f = aVar;
            this.f39133g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f39132f.p(this.f39133g);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU5/n;", "T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$hide$1", f = "AEPPresentable.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39134a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f39135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f39135b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f39135b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39134a == 0) {
                ResultKt.b(obj);
                if (this.f39135b.getState() != m.a.VISIBLE) {
                    t.a("Services", "AEPPresentable", "Presentable is already hidden. Ignoring hide request.", new Object[0]);
                    ((a) this.f39135b).presentation.b().a(this.f39135b, U5.d.f35756b);
                    return Unit.f142422a;
                }
                this.f39135b.getPresentationStateManager().d();
                ((a) this.f39135b).presentation.b().b(this.f39135b);
                a.j(this.f39135b);
                ((a) this.f39135b).presentationObserver.c(this.f39135b.c());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU5/n;", "T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityDestroyed$1", f = "AEPPresentable.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f39137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f39138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<T> aVar, Activity activity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f39137b = aVar;
            this.f39138c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f39137b, this.f39138c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39136a == 0) {
                ResultKt.b(obj);
                this.f39137b.p(this.f39138c);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU5/n;", "T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityResumed$1", f = "AEPPresentable.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f39140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f39141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, Activity activity, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f39140b = aVar;
            this.f39141c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f39140b, this.f39141c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39139a == 0) {
                ResultKt.b(obj);
                if (this.f39140b.getState() != m.a.VISIBLE) {
                    return Unit.f142422a;
                }
                Activity activity = (Activity) ((a) this.f39140b).attachmentHandle.get();
                if (activity != null && !Intrinsics.e(activity, this.f39141c)) {
                    t.e("Services", "AEPPresentable", "Detaching from " + activity + " before attaching to " + this.f39141c + '.', new Object[0]);
                    this.f39140b.p(activity);
                }
                this.f39140b.n(this.f39141c);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU5/n;", "T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$show$1", f = "AEPPresentable.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f39142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f39143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a<T> aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f39143b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f39143b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f39142a == 0) {
                ResultKt.b(obj);
                if (this.f39143b.getState() == m.a.VISIBLE) {
                    t.a("Services", "AEPPresentable", "Presentable is already shown. Ignoring show request.", new Object[0]);
                    ((a) this.f39143b).presentation.b().a(this.f39143b, U5.e.f35757b);
                    return Unit.f142422a;
                }
                Activity activityC = ((a) this.f39143b).presentationUtilityProvider.c();
                if (activityC == null) {
                    t.a("Services", "AEPPresentable", "Current activity is null. Cannot show presentable.", new Object[0]);
                    ((a) this.f39143b).presentation.b().a(this.f39143b, l.f35768b);
                    return Unit.f142422a;
                }
                a<T> aVar = this.f39143b;
                if (aVar.v(((a) aVar).presentationObserver.b())) {
                    t.a("Services", "AEPPresentable", "Presentable has conflicts with other visible presentations. Ignoring show request.", new Object[0]);
                    ((a) this.f39143b).presentation.b().a(this.f39143b, U5.f.f35758b);
                    return Unit.f142422a;
                }
                if (this.f39143b.r()) {
                    a.j(this.f39143b);
                }
                this.f39143b.w(activityC);
                ((a) this.f39143b).appLifecycleProvider.c(this.f39143b);
                ((a) this.f39143b).presentation.b().f(this.f39143b);
                a.j(this.f39143b);
                ((a) this.f39143b).presentationObserver.d(this.f39143b.c());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(n<T> presentation, r presentationUtilityProvider, o oVar, X5.b appLifecycleProvider, InterfaceC16622O mainScope) {
        this(presentation, presentationUtilityProvider, oVar, appLifecycleProvider, new X5.d(), new L5.c(), mainScope, X5.c.INSTANCE.a());
        Intrinsics.j(presentation, "presentation");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
        Intrinsics.j(mainScope, "mainScope");
    }

    public abstract boolean r();

    public abstract ComposeView s(Context activityContext);

    public abstract boolean v(List<? extends n<?>> visiblePresentations);

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Activity activityToAttach) {
        if (activityToAttach.findViewById(this.contentIdentifier) != null) {
            t.a("Services", "AEPPresentable", "Compose view already exists with id: " + this.contentIdentifier + ". Showing it instead of creating a new one.", new Object[0]);
            return;
        }
        this.activityCompatOwnerUtils.a(activityToAttach);
        ComposeView composeViewS = s(activityToAttach);
        composeViewS.setId(this.contentIdentifier);
        ((ViewGroup) activityToAttach.findViewById(R.id.content)).addView(composeViewS);
        this.attachmentHandle = new WeakReference<>(activityToAttach);
        t.e("Services", "AEPPresentable", "Attached " + this.contentIdentifier + " to " + activityToAttach + '.', new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Activity activity) {
        this.presentationStateManager.c();
        o(new c(this, activity));
    }

    @Override // U5.m
    public void a() {
        C16648k.d(this.mainScope, null, null, new g(this, null), 3, null);
    }

    @Override // U5.m
    public void b() {
        C16648k.d(this.mainScope, null, null, new d(this, null), 3, null);
    }

    @Override // U5.m
    public void dismiss() {
        C16648k.d(this.mainScope, null, null, new b(this, null), 3, null);
    }

    @Override // U5.m
    public m.a getState() {
        return this.presentationStateManager.a().getValue();
    }

    protected void o(Function0<Unit> onAnimationComplete) {
        Intrinsics.j(onAnimationComplete, "onAnimationComplete");
        onAnimationComplete.invoke();
    }

    @Override // X5.b.a
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.j(activity, "activity");
        C16648k.d(this.mainScope, null, null, new e(this, activity, null), 3, null);
    }

    @Override // X5.b.a
    public void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
        C16648k.d(this.mainScope, null, null, new f(this, activity, null), 3, null);
    }

    /* renamed from: t, reason: from getter */
    protected final X5.d getPresentationStateManager() {
        return this.presentationStateManager;
    }

    public final Context u(Context context) {
        Intrinsics.j(context, "context");
        try {
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, themeNewTheme);
            contextThemeWrapper.getTheme().applyStyle(F5.a.f10260a, true);
            return contextThemeWrapper;
        } catch (Exception e10) {
            t.b("Services", "AEPPresentable", "Error while creating themed context", e10);
            return context;
        }
    }

    public static final /* synthetic */ o j(a aVar) {
        aVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Activity activityToDetach) {
        View viewFindViewById = activityToDetach.findViewById(R.id.content);
        Intrinsics.i(viewFindViewById, "activityToDetach.findVie…yId(android.R.id.content)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        ComposeView composeView = (ComposeView) activityToDetach.findViewById(this.contentIdentifier);
        if (composeView == null) {
            t.a("Services", "AEPPresentable", "Compose view does not exist. Nothing to detach.", new Object[0]);
            return;
        }
        composeView.removeAllViews();
        viewGroup.removeView(composeView);
        if (Intrinsics.e(this.attachmentHandle.get(), activityToDetach)) {
            t.e("Services", "AEPPresentable", "Clearing attachment handle (" + activityToDetach + ").", new Object[0]);
            this.attachmentHandle.clear();
        }
        this.activityCompatOwnerUtils.b(activityToDetach);
        t.e("Services", "AEPPresentable", "Detached " + this.contentIdentifier + "from " + activityToDetach + '.', new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Activity activity) {
        n(activity);
        this.presentationStateManager.e();
    }

    public a(n<T> presentation, r presentationUtilityProvider, o oVar, X5.b appLifecycleProvider, X5.d presentationStateManager, L5.c activityCompatOwnerUtils, InterfaceC16622O mainScope, X5.c presentationObserver) {
        Intrinsics.j(presentation, "presentation");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
        Intrinsics.j(presentationStateManager, "presentationStateManager");
        Intrinsics.j(activityCompatOwnerUtils, "activityCompatOwnerUtils");
        Intrinsics.j(mainScope, "mainScope");
        Intrinsics.j(presentationObserver, "presentationObserver");
        this.contentIdentifier = new Random().nextInt();
        this.attachmentHandle = new WeakReference<>(null);
        this.presentation = presentation;
        this.presentationUtilityProvider = presentationUtilityProvider;
        this.appLifecycleProvider = appLifecycleProvider;
        this.presentationStateManager = presentationStateManager;
        this.activityCompatOwnerUtils = activityCompatOwnerUtils;
        this.mainScope = mainScope;
        this.presentationObserver = presentationObserver;
    }
}
