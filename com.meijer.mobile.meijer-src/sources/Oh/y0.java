package Oh;

import Gh.a;
import Ki.C;
import Ki.LocalThemeScope;
import Oh.y0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.D1;
import bk.AbstractC6392a;
import bk.C6393b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.accounts.ux.payments.k;
import com.meijer.mobile.accounts.ux.payments.s;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import kotlin.C17959M0;
import kotlin.C17987a1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "viewState", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "aurusViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "Lcom/meijer/mobile/accounts/ux/payments/k;", "onResourceAction", "c", "(LKi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Lcom/meijer/mobile/accounts/ux/payments/d$d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "isLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class y0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1", f = "PaymentsScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24089a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f24090b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f24091c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17959M0 f24092d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1$1", f = "PaymentsScreen.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: Oh.y0$a$a, reason: collision with other inner class name */
        static final class C0386a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f24093a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f24094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0386a(C17959M0 c17959m0, Continuation<? super C0386a> continuation) {
                super(2, continuation);
                this.f24094b = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0386a(this.f24094b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0386a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f24093a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f24094b;
                    this.f24093a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$1$1$2", f = "PaymentsScreen.kt", l = {76}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f24095a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f24096b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17959M0 c17959m0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f24096b = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f24096b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f24095a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f24096b;
                    this.f24095a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s.PaymentsScreenViewState aVar, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f24090b = aVar;
            this.f24091c = interfaceC15783O;
            this.f24092d = c17959m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f24090b, this.f24091c, this.f24092d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f24089a == 0) {
                ResultKt.b(obj);
                if (this.f24090b.getShowModal()) {
                    C15809k.d(this.f24091c, null, null, new C0386a(this.f24092d, null), 3, null);
                } else {
                    C15809k.d(this.f24091c, null, null, new b(this.f24092d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenKt$PaymentsScreen$2$1", f = "PaymentsScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f24098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f24099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f24100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f24101e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17959M0 c17959m0, D1 d12, InterfaceC5914o interfaceC5914o, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f24098b = c17959m0;
            this.f24099c = d12;
            this.f24100d = interfaceC5914o;
            this.f24101e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f24098b, this.f24099c, this.f24100d, this.f24101e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f24097a == 0) {
                ResultKt.b(obj);
                if (!this.f24098b.k()) {
                    D1 d12 = this.f24099c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5914o.l(this.f24100d, false, 1, null);
                    this.f24101e.invoke(k.c.f95304a);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f24102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f24104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d.ViewState f24105d;

        /* JADX WARN: Multi-variable type inference failed */
        c(s.PaymentsScreenViewState aVar, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, d.ViewState c1343d) {
            this.f24102a = aVar;
            this.f24103b = localThemeScope;
            this.f24104c = function1;
            this.f24105d = c1343d;
        }

        public final void a(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-653162705, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous> (PaymentsScreen.kt:109)");
            }
            if (!C6393b.a(this.f24102a.getMperksCardLinkingBottomSheetInfoMessage())) {
                composer.startReplaceGroup(2126787975);
                S.c(this.f24103b, this.f24102a.getMperksCardLinkingBottomSheetInfoMessage(), null, this.f24104c, composer, (AbstractC6392a.f60445b << 3) | LocalThemeScope.f17314g, 2);
                composer.P();
            } else if (Intrinsics.e(this.f24102a.getSheetTitle(), AbstractC6392a.INSTANCE.d(Gh.h.f12763O0, new Object[0]))) {
                composer.startReplaceGroup(2127143421);
                N.a0(this.f24103b, this.f24102a, null, this.f24104c, composer, LocalThemeScope.f17314g, 2);
                composer.P();
            } else {
                composer.startReplaceGroup(2127292531);
                LocalThemeScope localThemeScope = this.f24103b;
                AbstractC6392a abstractC6392aN = this.f24102a.getSheetTitle();
                AbstractC6392a abstractC6392aC = this.f24102a.getAddCardErrorMessage();
                d.ViewState c1343d = this.f24105d;
                Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f24104c;
                int i11 = LocalThemeScope.f17314g;
                int i12 = AbstractC6392a.f60445b;
                C4482e.e(localThemeScope, abstractC6392aN, abstractC6392aC, c1343d, null, function1, composer, (i12 << 6) | i11 | (i12 << 3), 8);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f24106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f24108c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f24109d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f24110e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24111a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f24112b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Oh.y0$d$a$a, reason: collision with other inner class name */
            static final class C0387a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24113a;

                C0387a(LocalThemeScope localThemeScope) {
                    this.f24113a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1491365681, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous>.<anonymous> (PaymentsScreen.kt:137)");
                    }
                    Dr.g.g(this.f24113a, C16338g.c(Gh.h.f12689D3, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(981335025, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous> (PaymentsScreen.kt:135)");
                }
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
                C.f.d dVar = C.f.d.f17051e;
                LocalThemeScope localThemeScope = this.f24111a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(1491365681, true, new C0387a(localThemeScope), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f24112b);
                final Function1<Gh.a, Unit> function1 = this.f24112b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Oh.z0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return y0.d.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
                this.f24111a = localThemeScope;
                this.f24112b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(a.k.f12614a);
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s.PaymentsScreenViewState f24114a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24115b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f24116c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f24117d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f24118e;

            /* JADX WARN: Multi-variable type inference failed */
            b(s.PaymentsScreenViewState aVar, LocalThemeScope localThemeScope, Modifier modifier, Function1<? super Gh.a, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12) {
                this.f24114a = aVar;
                this.f24115b = localThemeScope;
                this.f24116c = modifier;
                this.f24117d = function1;
                this.f24118e = function12;
            }

            public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
                Intrinsics.j(paddingValues, "paddingValues");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(paddingValues) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-125783976, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous>.<anonymous> (PaymentsScreen.kt:144)");
                }
                if (this.f24114a.getIsLoading()) {
                    composer.startReplaceGroup(-2018889955);
                    yr.N.b(this.f24115b, null, composer, LocalThemeScope.f17314g, 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-2018829536);
                    s0.p(this.f24115b, this.f24114a, androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(this.f24116c, 0.0f, 1, null), paddingValues), this.f24117d, this.f24118e, composer, LocalThemeScope.f17314g, 0);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                a(interfaceC14882C, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1, s.PaymentsScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12) {
            this.f24106a = modifier;
            this.f24107b = localThemeScope;
            this.f24108c = function1;
            this.f24109d = aVar;
            this.f24110e = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1433165866, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreen.<anonymous> (PaymentsScreen.kt:132)");
            }
            C17987a1.a(FullStoryAnnotationsKt.fsUnmask(this.f24106a), null, ComposableLambdaKt.c(981335025, true, new a(this.f24107b, this.f24108c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-125783976, true, new b(this.f24109d, this.f24107b, this.f24106a, this.f24108c, this.f24110e), composer, 54), composer, 384, 12582912, 131066);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r30, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r31, final com.meijer.mobile.accounts.ux.payments.d.ViewState r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.y0.c(Ki.M, com.meijer.mobile.accounts.ux.payments.s$a, com.meijer.mobile.accounts.ux.payments.d$d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, s.PaymentsScreenViewState aVar, d.ViewState c1343d, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, aVar, c1343d, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(C17959M0 c17959m0, Function1 function1, Function1 function12) {
        if (c17959m0.k()) {
            function1.invoke(k.c.f95304a);
        } else {
            function12.invoke(a.k.f12614a);
        }
        return Unit.f143329a;
    }
}
