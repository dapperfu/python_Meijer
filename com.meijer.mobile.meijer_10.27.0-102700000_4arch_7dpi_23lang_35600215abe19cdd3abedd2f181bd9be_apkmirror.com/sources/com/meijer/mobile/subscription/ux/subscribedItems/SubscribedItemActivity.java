package com.meijer.mobile.subscription.ux.subscribedItems;

import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity;
import com.meijer.mobile.subscription.ux.subscribedItems.s;
import cr.SubscriptionDetails;
import e.C13589e;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/SubscribedItemActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lqv/O;", "v", "Lqv/O;", "coroutineScope", "LCl/e;", "w", "LCl/e;", "p1", "()LCl/e;", "setMeijerIntent$ux_release", "(LCl/e;)V", "meijerIntent", "Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "x", "Lkotlin/Lazy;", "q1", "()Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "subscribedItemViewModel", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SubscribedItemActivity extends Hilt_SubscribedItemActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O coroutineScope;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscribedItemViewModel = new e0(Reflection.b(m.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$onCreate$1$1$1", f = "SubscribedItemActivity.kt", l = {46}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$a, reason: collision with other inner class name */
        static final class C1924a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118767a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscribedItemActivity f118768b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$a$a, reason: collision with other inner class name */
            static final class C1925a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SubscribedItemActivity f118769a;

                C1925a(SubscribedItemActivity subscribedItemActivity) {
                    this.f118769a = subscribedItemActivity;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(s sVar, Continuation<? super Unit> continuation) {
                    if (!(sVar instanceof s.NavigateToManageSubscription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SubscribedItemActivity subscribedItemActivity = this.f118769a;
                    subscribedItemActivity.startActivity(subscribedItemActivity.p1().I(((s.NavigateToManageSubscription) sVar).getProduct()));
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1924a(SubscribedItemActivity subscribedItemActivity, Continuation<? super C1924a> continuation) {
                super(2, continuation);
                this.f118768b = subscribedItemActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1924a(this.f118768b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1924a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118767a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<s> interfaceC17144FT = this.f118768b.q1().t();
                    C1925a c1925a = new C1925a(this.f118768b);
                    this.f118767a = 1;
                    if (interfaceC17144FT.collect(c1925a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SubscribedItemActivity f118770a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$onCreate$1$2$1$1$1", f = "SubscribedItemActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$b$a, reason: collision with other inner class name */
            static final class C1926a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118771a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SubscribedItemActivity f118772b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionDetails f118773c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1926a(this.f118772b, this.f118773c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1926a(SubscribedItemActivity subscribedItemActivity, SubscriptionDetails subscriptionDetails, Continuation<? super C1926a> continuation) {
                    super(2, continuation);
                    this.f118772b = subscribedItemActivity;
                    this.f118773c = subscriptionDetails;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1926a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f118771a == 0) {
                        ResultKt.b(obj);
                        this.f118772b.q1().r(this.f118773c.getProductInfo().getProductCode());
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            b(SubscribedItemActivity subscribedItemActivity) {
                this.f118770a = subscribedItemActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(SubscribedItemActivity subscribedItemActivity, SubscriptionDetails subscriptionDetails) {
                InterfaceC16622O interfaceC16622O;
                Intrinsics.j(subscriptionDetails, "subscriptionDetails");
                InterfaceC16622O interfaceC16622O2 = subscribedItemActivity.coroutineScope;
                if (interfaceC16622O2 == null) {
                    Intrinsics.y("coroutineScope");
                    interfaceC16622O = null;
                } else {
                    interfaceC16622O = interfaceC16622O2;
                }
                C16648k.d(interfaceC16622O, null, null, new C1926a(subscribedItemActivity, subscriptionDetails, null), 3, null);
                return Unit.f142422a;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-161065562, i10, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity.onCreate.<anonymous>.<anonymous> (SubscribedItemActivity.kt:55)");
                }
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118770a);
                final SubscribedItemActivity subscribedItemActivity = this.f118770a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.subscription.ux.subscribedItems.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SubscribedItemActivity.a.b.d(subscribedItemActivity, (SubscriptionDetails) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118770a);
                final SubscribedItemActivity subscribedItemActivity2 = this.f118770a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscribedItems.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscribedItemActivity.a.b.e(subscribedItemActivity2);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                l.h(AdsTheme, null, function1, (Function0) objB2, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(SubscribedItemActivity subscribedItemActivity) {
                subscribedItemActivity.finish();
                return Unit.f142422a;
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-616891627, i10, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity.onCreate.<anonymous> (SubscribedItemActivity.kt:42)");
            }
            SubscribedItemActivity subscribedItemActivity = SubscribedItemActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            subscribedItemActivity.coroutineScope = (InterfaceC16622O) objB;
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(SubscribedItemActivity.this);
            SubscribedItemActivity subscribedItemActivity2 = SubscribedItemActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new C1924a(subscribedItemActivity2, null);
                composer.t(objB2);
            }
            composer.P();
            J.g(unit, (Function2) objB2, composer, 6);
            K.b(null, ComposableLambdaKt.c(-161065562, true, new b(SubscribedItemActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118774f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f118774f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118774f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118775f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f118775f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f118775f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118776f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118777g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118776f = function0;
            this.f118777g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118776f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118777g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m q1() {
        return (m) this.subscribedItemViewModel.getValue();
    }

    public final Cl.e p1() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.subscription.ux.subscribedItems.Hilt_SubscribedItemActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-616891627, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        q1().s();
    }
}
