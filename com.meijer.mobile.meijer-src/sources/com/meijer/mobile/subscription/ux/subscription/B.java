package com.meijer.mobile.subscription.ux.subscription;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import com.meijer.mobile.subscription.ux.subscription.C;
import kotlin.C14667h;
import kotlin.C14678s;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import lr.C15601e;
import mv.InterfaceC15783O;
import pr.SubscriptionSummaryDecorator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Li4/s;", "LKi/M;", "localThemeScope", "Lcom/meijer/mobile/subscription/ux/subscription/A;", "config", "Lcom/meijer/mobile/subscription/ux/subscription/E;", "viewModel", "Lkotlin/Function0;", "", "onShowSubscriptionInfoBottomSheet", "a", "(Li4/s;LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/A;Lcom/meijer/mobile/subscription/ux/subscription/E;Lkotlin/jvm/functions/Function0;)V", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f119827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionNavConfig f119828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119829c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119830d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.subscription.ux.subscription.B$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1934a extends FunctionReferenceImpl implements Function1<AbstractC13119k, Unit> {
            C1934a(Object obj) {
                super(1, obj, E.class, "onAction", "onAction(Lcom/meijer/mobile/subscription/ux/subscription/ManageSubscriptionAction;)V", 0);
            }

            public final void a(AbstractC13119k p02) {
                Intrinsics.j(p02, "p0");
                ((E) this.receiver).E(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC13119k abstractC13119k) {
                a(abstractC13119k);
                return Unit.f143329a;
            }
        }

        a(E e10, SubscriptionNavConfig subscriptionNavConfig, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f119827a = e10;
            this.f119828b = subscriptionNavConfig;
            this.f119829c = localThemeScope;
            this.f119830d = function0;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-1133349959, i10, -1, "com.meijer.mobile.subscription.ux.subscription.subscriptionNavGraph.<anonymous>.<anonymous> (SubscriptionNavGraph.kt:34)");
            }
            SubscriptionViewState subscriptionViewStateB = b(S2.a.c(this.f119827a.B(), null, null, null, composer, 0, 7));
            SubscriptionSummaryDecorator subscriptionSummary = this.f119828b.getSubscriptionSummary();
            E e10 = this.f119827a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(e10);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1934a(e10);
                composer.t(objB);
            }
            composer.P();
            Function0<Unit> function0A = this.f119828b.a();
            C13111c.c(this.f119829c, null, null, null, (Function1) ((KFunction) objB), function0A, subscriptionSummary, this.f119830d, subscriptionViewStateB, composer, LocalThemeScope.f17314g, 7);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final SubscriptionViewState b(z1<SubscriptionViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionNavConfig f119831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f119832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119833c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119834d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC13119k, Unit> {
            a(Object obj) {
                super(1, obj, E.class, "onAction", "onAction(Lcom/meijer/mobile/subscription/ux/subscription/ManageSubscriptionAction;)V", 0);
            }

            public final void a(AbstractC13119k p02) {
                Intrinsics.j(p02, "p0");
                ((E) this.receiver).E(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC13119k abstractC13119k) {
                a(abstractC13119k);
                return Unit.f143329a;
            }
        }

        b(SubscriptionNavConfig subscriptionNavConfig, E e10, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f119831a = subscriptionNavConfig;
            this.f119832b = e10;
            this.f119833c = localThemeScope;
            this.f119834d = function0;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-1673817744, i10, -1, "com.meijer.mobile.subscription.ux.subscription.subscriptionNavGraph.<anonymous>.<anonymous> (SubscriptionNavGraph.kt:47)");
            }
            SubscriptionViewState subscriptionViewState = this.f119831a.getSubscriptionViewState();
            SubscriptionSummaryDecorator subscriptionSummary = this.f119831a.getSubscriptionSummary();
            E e10 = this.f119832b;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(e10);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(e10);
                composer.t(objB);
            }
            composer.P();
            C15601e.e(this.f119833c, subscriptionViewState, subscriptionSummary, null, (Function1) ((KFunction) objB), this.f119834d, this.f119831a.a(), composer, LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f119835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionNavConfig f119837c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionNavGraphKt$subscriptionNavGraph$1$3$1$1", f = "SubscriptionNavGraph.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f119839b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E e10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119839b = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f119839b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f119838a == 0) {
                    ResultKt.b(obj);
                    this.f119839b.w();
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC13119k, Unit> {
            b(Object obj) {
                super(1, obj, E.class, "onAction", "onAction(Lcom/meijer/mobile/subscription/ux/subscription/ManageSubscriptionAction;)V", 0);
            }

            public final void a(AbstractC13119k p02) {
                Intrinsics.j(p02, "p0");
                ((E) this.receiver).E(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC13119k abstractC13119k) {
                a(abstractC13119k);
                return Unit.f143329a;
            }
        }

        c(E e10, LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig) {
            this.f119835a = e10;
            this.f119836b = localThemeScope;
            this.f119837c = subscriptionNavConfig;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-2068221583, i10, -1, "com.meijer.mobile.subscription.ux.subscription.subscriptionNavGraph.<anonymous>.<anonymous> (SubscriptionNavGraph.kt:59)");
            }
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f119835a);
            E e10 = this.f119835a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(e10, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composer, 6);
            LocalThemeScope localThemeScope = this.f119836b;
            SubscriptionViewState subscriptionViewState = this.f119837c.getSubscriptionViewState();
            E e11 = this.f119835a;
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(e11);
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(e11);
                composer.t(objB2);
            }
            composer.P();
            mr.h.g(localThemeScope, subscriptionViewState, null, (Function1) ((KFunction) objB2), this.f119837c.a(), composer, LocalThemeScope.f17314g, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f119840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionNavConfig f119842c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionNavGraphKt$subscriptionNavGraph$1$4$1$1", f = "SubscriptionNavGraph.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119843a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f119844b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E e10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119844b = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f119844b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f119843a == 0) {
                    ResultKt.b(obj);
                    E.A(this.f119844b, null, 1, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC13119k, Unit> {
            b(Object obj) {
                super(1, obj, E.class, "onAction", "onAction(Lcom/meijer/mobile/subscription/ux/subscription/ManageSubscriptionAction;)V", 0);
            }

            public final void a(AbstractC13119k p02) {
                Intrinsics.j(p02, "p0");
                ((E) this.receiver).E(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC13119k abstractC13119k) {
                a(abstractC13119k);
                return Unit.f143329a;
            }
        }

        d(E e10, LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig) {
            this.f119840a = e10;
            this.f119841b = localThemeScope;
            this.f119842c = subscriptionNavConfig;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1832341874, i10, -1, "com.meijer.mobile.subscription.ux.subscription.subscriptionNavGraph.<anonymous>.<anonymous> (SubscriptionNavGraph.kt:72)");
            }
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f119840a);
            E e10 = this.f119840a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(e10, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composer, 6);
            LocalThemeScope localThemeScope = this.f119841b;
            SubscriptionViewState subscriptionViewState = this.f119842c.getSubscriptionViewState();
            E e11 = this.f119840a;
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(e11);
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(e11);
                composer.t(objB2);
            }
            composer.P();
            mr.z.p(localThemeScope, subscriptionViewState, null, (Function1) ((KFunction) objB2), this.f119842c.a(), composer, LocalThemeScope.f17314g, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(C14678s c14678s, LocalThemeScope localThemeScope, SubscriptionNavConfig config, E viewModel, Function0<Unit> onShowSubscriptionInfoBottomSheet) {
        Intrinsics.j(c14678s, "<this>");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(config, "config");
        Intrinsics.j(viewModel, "viewModel");
        Intrinsics.j(onShowSubscriptionInfoBottomSheet, "onShowSubscriptionInfoBottomSheet");
        C.c.a aVar = C.c.a.f119849c;
        C14678s c14678s2 = new C14678s(c14678s.getProvider(), aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "SubscriptionRoute");
        j4.i.c(c14678s2, aVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1133349959, true, new a(viewModel, config, localThemeScope, onShowSubscriptionInfoBottomSheet)), 126, null);
        j4.i.c(c14678s2, C.c.b.f119850c.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1673817744, true, new b(config, viewModel, localThemeScope, onShowSubscriptionInfoBottomSheet)), 126, null);
        j4.i.c(c14678s2, C.c.C1935c.f119851c.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-2068221583, true, new c(viewModel, localThemeScope, config)), 126, null);
        j4.i.c(c14678s2, C.c.d.f119852c.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1832341874, true, new d(viewModel, localThemeScope, config)), 126, null);
        c14678s.e(c14678s2);
    }
}
