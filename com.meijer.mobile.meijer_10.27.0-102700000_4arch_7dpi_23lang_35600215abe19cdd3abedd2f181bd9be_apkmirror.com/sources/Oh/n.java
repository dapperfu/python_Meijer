package Oh;

import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import Oh.n;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.preferences.g;
import com.meijer.mobile.accounts.ux.preferences.k;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import kotlin.C17921a1;
import kotlin.C17970r;
import kotlin.C17973s;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "viewState", "", "isAccountOverviewScreenEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "onAction", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/preferences/g$b;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1", f = "PreferenceScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f23707b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f23708c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17970r f23709d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1$1", f = "PreferenceScreen.kt", l = {64}, m = "invokeSuspend")
        /* renamed from: Oh.n$a$a, reason: collision with other inner class name */
        static final class C0381a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f23710a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f23711b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0381a(C17970r c17970r, Continuation<? super C0381a> continuation) {
                super(2, continuation);
                this.f23711b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0381a(this.f23711b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0381a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f23710a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s bottomSheetState = this.f23711b.getBottomSheetState();
                    this.f23710a = 1;
                    if (bottomSheetState.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$1$1$2", f = "PreferenceScreen.kt", l = {66}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f23712a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f23713b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17970r c17970r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f23713b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f23713b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f23712a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s bottomSheetState = this.f23713b.getBottomSheetState();
                    this.f23712a = 1;
                    if (bottomSheetState.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.PreferenceScreenViewState bVar, InterfaceC16622O interfaceC16622O, C17970r c17970r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23707b = bVar;
            this.f23708c = interfaceC16622O;
            this.f23709d = c17970r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23707b, this.f23708c, this.f23709d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f23706a == 0) {
                ResultKt.b(obj);
                if (this.f23707b.getShowModal()) {
                    C16648k.d(this.f23708c, null, null, new C0381a(this.f23709d, null), 3, null);
                } else {
                    C16648k.d(this.f23708c, null, null, new b(this.f23709d, null), 3, null);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenKt$PreferenceScreen$2$1", f = "PreferenceScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17970r f23715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17970r c17970r, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23715b = c17970r;
            this.f23716c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f23715b, this.f23716c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f23714a == 0) {
                ResultKt.b(obj);
                if (this.f23715b.getBottomSheetState().f()) {
                    this.f23716c.invoke(k.a.f94692a);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f23718b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17970r f23719c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23720d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, C17970r c17970r, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
            this.f23717a = localThemeScope;
            this.f23718b = bVar;
            this.f23719c = c17970r;
            this.f23720d = function1;
        }

        public final void a(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-86632197, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous> (PreferenceScreen.kt:81)");
            }
            LocalThemeScope localThemeScope = this.f23717a;
            String strC = this.f23718b.getEmail();
            AbstractC5607a abstractC5607aH = this.f23718b.getResendEmailErrorTitle();
            AbstractC5607a abstractC5607aG = this.f23718b.getResendEmailErrorDescription();
            boolean zF = this.f23719c.getBottomSheetState().f();
            Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function1 = this.f23720d;
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            y.e(localThemeScope, strC, abstractC5607aH, abstractC5607aG, zF, null, function1, composer, i11 | (i12 << 6) | (i12 << 9), 16);
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
    static final class d implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f23721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f23723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23724d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f23725e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23726f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23727a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f23728b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f23729c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Oh.n$d$a$a, reason: collision with other inner class name */
            static final class C0382a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f23730a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f23731b;

                C0382a(LocalThemeScope localThemeScope, boolean z10) {
                    this.f23730a = localThemeScope;
                    this.f23731b = z10;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2104060211, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous>.<anonymous> (PreferenceScreen.kt:94)");
                    }
                    Dr.g.g(this.f23730a, C16193g.c(this.f23731b ? Fh.h.f10564N : Fh.h.f10652Z3, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                    ComposerKt.U(-47287411, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous> (PreferenceScreen.kt:92)");
                }
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
                C.f.d dVar = C.f.d.f15507e;
                LocalThemeScope localThemeScope = this.f23727a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-2104060211, true, new C0382a(localThemeScope, this.f23729c), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f23728b);
                final Function1<Fh.a, Unit> function1 = this.f23728b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Oh.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.d.a.c(function1);
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
            a(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1, boolean z10) {
                this.f23727a = localThemeScope;
                this.f23728b = function1;
                this.f23729c = z10;
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
            final /* synthetic */ LocalThemeScope f23732a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.PreferenceScreenViewState f23733b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23734c;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
                this.f23732a = localThemeScope;
                this.f23733b = bVar;
                this.f23734c = function1;
            }

            public final void a(InterfaceC14794C padding, Composer composer, int i10) {
                Intrinsics.j(padding, "padding");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(padding) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1963361228, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous>.<anonymous> (PreferenceScreen.kt:109)");
                }
                l.d(this.f23732a, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), padding), this.f23733b, this.f23734c, composer, LocalThemeScope.f15770g, 0);
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
        d(Modifier modifier, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1, boolean z10, g.PreferenceScreenViewState bVar, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function12) {
            this.f23721a = modifier;
            this.f23722b = localThemeScope;
            this.f23723c = function1;
            this.f23724d = z10;
            this.f23725e = bVar;
            this.f23726f = function12;
        }

        public final void a(InterfaceC14794C it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-408238030, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreen.<anonymous> (PreferenceScreen.kt:89)");
            }
            C17921a1.a(FullStoryAnnotationsKt.fsUnmask(this.f23721a), null, ComposableLambdaKt.c(-47287411, true, new a(this.f23722b, this.f23723c, this.f23724d), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1963361228, true, new b(this.f23722b, this.f23725e, this.f23726f), composer, 54), composer, 384, 12582912, 131066);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r32, final com.meijer.mobile.accounts.ux.preferences.g.PreferenceScreenViewState r33, final boolean r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.preferences.k, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.n.b(Ji.M, com.meijer.mobile.accounts.ux.preferences.g$b, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, g.PreferenceScreenViewState bVar, boolean z10, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, bVar, z10, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
