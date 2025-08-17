package Nh;

import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import Nh.x0;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.D1;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.accounts.ux.payments.k;
import com.meijer.mobile.accounts.ux.payments.s;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import kotlin.C17893M0;
import kotlin.C17921a1;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "viewState", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "aurusViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "Lcom/meijer/mobile/accounts/ux/payments/k;", "onResourceAction", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Lcom/meijer/mobile/accounts/ux/payments/d$d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "isLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class x0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1", f = "PaymentsScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f21838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f21840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17893M0 f21841d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1$1", f = "PaymentsScreen.kt", l = {73}, m = "invokeSuspend")
        /* renamed from: Nh.x0$a$a, reason: collision with other inner class name */
        static final class C0347a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f21842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f21843b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0347a(C17893M0 c17893m0, Continuation<? super C0347a> continuation) {
                super(2, continuation);
                this.f21843b = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0347a(this.f21843b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0347a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f21842a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f21843b;
                    this.f21842a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1$2", f = "PaymentsScreen.kt", l = {75}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f21844a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f21845b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f21845b = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f21845b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f21844a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f21845b;
                    this.f21844a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s.PaymentsScreenViewState aVar, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21839b = aVar;
            this.f21840c = interfaceC16622O;
            this.f21841d = c17893m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f21839b, this.f21840c, this.f21841d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f21838a == 0) {
                ResultKt.b(obj);
                if (this.f21839b.getShowModal()) {
                    C16648k.d(this.f21840c, null, null, new C0347a(this.f21841d, null), 3, null);
                } else {
                    C16648k.d(this.f21840c, null, null, new b(this.f21841d, null), 3, null);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$2$1", f = "PaymentsScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f21846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17893M0 f21847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f21848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f21849d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21850e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17893M0 c17893m0, D1 d12, InterfaceC5772o interfaceC5772o, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21847b = c17893m0;
            this.f21848c = d12;
            this.f21849d = interfaceC5772o;
            this.f21850e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f21847b, this.f21848c, this.f21849d, this.f21850e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f21846a == 0) {
                ResultKt.b(obj);
                if (!this.f21847b.k()) {
                    D1 d12 = this.f21848c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5772o.l(this.f21849d, false, 1, null);
                    this.f21850e.invoke(k.c.f94459a);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d.ViewState f21854d;

        /* JADX WARN: Multi-variable type inference failed */
        c(s.PaymentsScreenViewState aVar, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, d.ViewState c1334d) {
            this.f21851a = aVar;
            this.f21852b = localThemeScope;
            this.f21853c = function1;
            this.f21854d = c1334d;
        }

        public final void a(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-653162705, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous> (PaymentsScreen.kt:100)");
            }
            if (!C5608b.a(this.f21851a.getMperksCardLinkingBottomSheetInfoMessage())) {
                composer.startReplaceGroup(2126787975);
                S.c(this.f21852b, this.f21851a.getMperksCardLinkingBottomSheetInfoMessage(), null, this.f21853c, composer, (AbstractC5607a.f45514b << 3) | LocalThemeScope.f15770g, 2);
                composer.P();
            } else if (Intrinsics.e(this.f21851a.getSheetTitle(), AbstractC5607a.INSTANCE.d(Fh.h.f10572O0, new Object[0]))) {
                composer.startReplaceGroup(2127143421);
                N.a0(this.f21852b, this.f21851a, null, this.f21853c, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else {
                composer.startReplaceGroup(2127292531);
                LocalThemeScope localThemeScope = this.f21852b;
                AbstractC5607a abstractC5607aN = this.f21851a.getSheetTitle();
                AbstractC5607a abstractC5607aC = this.f21851a.getAddCardErrorMessage();
                d.ViewState c1334d = this.f21854d;
                Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f21853c;
                int i11 = LocalThemeScope.f15770g;
                int i12 = AbstractC5607a.f45514b;
                C4340e.e(localThemeScope, abstractC5607aN, abstractC5607aC, c1334d, null, function1, composer, (i12 << 6) | i11 | (i12 << 3), 8);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f21855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21858d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21859e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21860a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f21861b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nh.x0$d$a$a, reason: collision with other inner class name */
            static final class C0348a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f21862a;

                C0348a(LocalThemeScope localThemeScope) {
                    this.f21862a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1491365681, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous>.<anonymous> (PaymentsScreen.kt:128)");
                    }
                    Dr.g.g(this.f21862a, C16193g.c(Fh.h.f10491C3, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(981335025, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous> (PaymentsScreen.kt:126)");
                }
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
                C.f.d dVar = C.f.d.f15507e;
                LocalThemeScope localThemeScope = this.f21860a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(1491365681, true, new C0348a(localThemeScope), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f21861b);
                final Function1<Fh.a, Unit> function1 = this.f21861b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Nh.y0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return x0.d.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
                this.f21860a = localThemeScope;
                this.f21861b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(a.k.f10423a);
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s.PaymentsScreenViewState f21863a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21864b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f21865c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f21866d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21867e;

            /* JADX WARN: Multi-variable type inference failed */
            b(s.PaymentsScreenViewState aVar, LocalThemeScope localThemeScope, Modifier modifier, Function1<? super Fh.a, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12) {
                this.f21863a = aVar;
                this.f21864b = localThemeScope;
                this.f21865c = modifier;
                this.f21866d = function1;
                this.f21867e = function12;
            }

            public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                Intrinsics.j(paddingValues, "paddingValues");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(paddingValues) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-125783976, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous> (PaymentsScreen.kt:135)");
                }
                if (this.f21863a.getIsLoading()) {
                    composer.startReplaceGroup(-2018889955);
                    yr.N.b(this.f21864b, null, composer, LocalThemeScope.f15770g, 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-2018829536);
                    s0.p(this.f21864b, this.f21863a, androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(this.f21865c, 0.0f, 1, null), paddingValues), this.f21866d, this.f21867e, composer, LocalThemeScope.f15770g, 0);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                a(interfaceC14794C, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1, s.PaymentsScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12) {
            this.f21855a = modifier;
            this.f21856b = localThemeScope;
            this.f21857c = function1;
            this.f21858d = aVar;
            this.f21859e = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1433165866, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous> (PaymentsScreen.kt:123)");
            }
            C17921a1.a(FullStoryAnnotationsKt.fsUnmask(this.f21855a), null, ComposableLambdaKt.c(981335025, true, new a(this.f21856b, this.f21857c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-125783976, true, new b(this.f21858d, this.f21856b, this.f21855a, this.f21857c, this.f21859e), composer, 54), composer, 384, 12582912, 131066);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r30, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r31, final com.meijer.mobile.accounts.ux.payments.d.ViewState r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.x0.b(Ji.M, com.meijer.mobile.accounts.ux.payments.s$a, com.meijer.mobile.accounts.ux.payments.d$d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, s.PaymentsScreenViewState aVar, d.ViewState c1334d, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, aVar, c1334d, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
