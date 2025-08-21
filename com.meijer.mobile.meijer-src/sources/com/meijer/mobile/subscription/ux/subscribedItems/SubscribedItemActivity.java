package com.meijer.mobile.subscription.ux.subscribedItems;

import Ki.K;
import Ki.LocalThemeScope;
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
import e.C13737e;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/SubscribedItemActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lmv/O;", "v", "Lmv/O;", "coroutineScope", "LDl/e;", "w", "LDl/e;", "p1", "()LDl/e;", "setMeijerIntent$ux_release", "(LDl/e;)V", "meijerIntent", "Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "x", "Lkotlin/Lazy;", "q1", "()Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "subscribedItemViewModel", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SubscribedItemActivity extends Hilt_SubscribedItemActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscribedItemViewModel = new e0(Reflection.b(m.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$onCreate$1$1$1", f = "SubscribedItemActivity.kt", l = {46}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$a, reason: collision with other inner class name */
        static final class C1931a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119715a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscribedItemActivity f119716b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$a$a, reason: collision with other inner class name */
            static final class C1932a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SubscribedItemActivity f119717a;

                C1932a(SubscribedItemActivity subscribedItemActivity) {
                    this.f119717a = subscribedItemActivity;
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(s sVar, Continuation<? super Unit> continuation) {
                    if (!(sVar instanceof s.NavigateToManageSubscription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SubscribedItemActivity subscribedItemActivity = this.f119717a;
                    subscribedItemActivity.startActivity(subscribedItemActivity.p1().I(((s.NavigateToManageSubscription) sVar).getProduct()));
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1931a(SubscribedItemActivity subscribedItemActivity, Continuation<? super C1931a> continuation) {
                super(2, continuation);
                this.f119716b = subscribedItemActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1931a(this.f119716b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1931a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119715a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<s> interfaceC16553FT = this.f119716b.q1().t();
                    C1932a c1932a = new C1932a(this.f119716b);
                    this.f119715a = 1;
                    if (interfaceC16553FT.collect(c1932a, this) == objF) {
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
            final /* synthetic */ SubscribedItemActivity f119718a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$onCreate$1$2$1$1$1", f = "SubscribedItemActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity$a$b$a, reason: collision with other inner class name */
            static final class C1933a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119719a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SubscribedItemActivity f119720b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionDetails f119721c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1933a(this.f119720b, this.f119721c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1933a(SubscribedItemActivity subscribedItemActivity, SubscriptionDetails subscriptionDetails, Continuation<? super C1933a> continuation) {
                    super(2, continuation);
                    this.f119720b = subscribedItemActivity;
                    this.f119721c = subscriptionDetails;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1933a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f119719a == 0) {
                        ResultKt.b(obj);
                        this.f119720b.q1().r(this.f119721c.getProductInfo().getProductCode());
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            b(SubscribedItemActivity subscribedItemActivity) {
                this.f119718a = subscribedItemActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(SubscribedItemActivity subscribedItemActivity, SubscriptionDetails subscriptionDetails) {
                InterfaceC15783O interfaceC15783O;
                Intrinsics.j(subscriptionDetails, "subscriptionDetails");
                InterfaceC15783O interfaceC15783O2 = subscribedItemActivity.coroutineScope;
                if (interfaceC15783O2 == null) {
                    Intrinsics.x("coroutineScope");
                    interfaceC15783O = null;
                } else {
                    interfaceC15783O = interfaceC15783O2;
                }
                C15809k.d(interfaceC15783O, null, null, new C1933a(subscribedItemActivity, subscriptionDetails, null), 3, null);
                return Unit.f143329a;
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
                boolean zD = composer.D(this.f119718a);
                final SubscribedItemActivity subscribedItemActivity = this.f119718a;
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
                boolean zD2 = composer.D(this.f119718a);
                final SubscribedItemActivity subscribedItemActivity2 = this.f119718a;
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
                l.h(AdsTheme, null, function1, (Function0) objB2, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(SubscribedItemActivity subscribedItemActivity) {
                subscribedItemActivity.finish();
                return Unit.f143329a;
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
                objB = J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            subscribedItemActivity.coroutineScope = (InterfaceC15783O) objB;
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(SubscribedItemActivity.this);
            SubscribedItemActivity subscribedItemActivity2 = SubscribedItemActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new C1931a(subscribedItemActivity2, null);
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119722f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f119722f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119722f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119723f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f119723f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119723f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119724f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119725g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119724f = function0;
            this.f119725g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119724f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119725g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m q1() {
        return (m) this.subscribedItemViewModel.getValue();
    }

    public final Dl.e p1() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.subscription.ux.subscribedItems.Hilt_SubscribedItemActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-616891627, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        q1().s();
    }
}
