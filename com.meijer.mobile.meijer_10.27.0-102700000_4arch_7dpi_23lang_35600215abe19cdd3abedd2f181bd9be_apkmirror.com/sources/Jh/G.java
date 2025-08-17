package Jh;

import Fh.a;
import Jh.G;
import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.D1;
import com.meijer.mobile.accounts.ux.addresses.a;
import com.meijer.mobile.accounts.ux.addresses.i;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "LFh/a;", "onNavigationRequest", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "isLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class G {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1", f = "AddressesScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f15126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f15127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17970r f15128d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1$1", f = "AddressesScreen.kt", l = {69}, m = "invokeSuspend")
        /* renamed from: Jh.G$a$a, reason: collision with other inner class name */
        static final class C0238a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f15129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f15130b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0238a(C17970r c17970r, Continuation<? super C0238a> continuation) {
                super(2, continuation);
                this.f15130b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0238a(this.f15130b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0238a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f15129a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s c17973sA = this.f15130b.getBottomSheetState();
                    this.f15129a = 1;
                    if (c17973sA.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1$2", f = "AddressesScreen.kt", l = {71}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f15131a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17970r f15132b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17970r c17970r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f15132b = c17970r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f15132b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f15131a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17973s c17973sA = this.f15132b.getBottomSheetState();
                    this.f15131a = 1;
                    if (c17973sA.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i.AddressesScreenViewState aVar, InterfaceC16622O interfaceC16622O, C17970r c17970r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15126b = aVar;
            this.f15127c = interfaceC16622O;
            this.f15128d = c17970r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f15126b, this.f15127c, this.f15128d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f15125a == 0) {
                ResultKt.b(obj);
                if (this.f15126b.getShowModal()) {
                    C16648k.d(this.f15127c, null, null, new C0238a(this.f15128d, null), 3, null);
                } else {
                    C16648k.d(this.f15127c, null, null, new b(this.f15128d, null), 3, null);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$2$1", f = "AddressesScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17970r f15134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f15135c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f15136d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C17970r c17970r, D1 d12, InterfaceC5772o interfaceC5772o, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15134b = c17970r;
            this.f15135c = d12;
            this.f15136d = interfaceC5772o;
            this.f15137e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15134b, this.f15135c, this.f15136d, this.f15137e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f15133a == 0) {
                ResultKt.b(obj);
                if (this.f15134b.getBottomSheetState().f()) {
                    D1 d12 = this.f15135c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5772o.l(this.f15136d, false, 1, null);
                    this.f15137e.invoke(a.b.f94057a);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f15139b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15140c;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, i.AddressesScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
            this.f15138a = localThemeScope;
            this.f15139b = aVar;
            this.f15140c = function1;
        }

        public final void a(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1989687232, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous> (AddressesScreen.kt:88)");
            }
            X.h(this.f15138a, this.f15139b, null, this.f15140c, composer, LocalThemeScope.f15770g, 2);
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
        final /* synthetic */ LocalThemeScope f15141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f15142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f15143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f15144d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15145e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15146a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Fh.a, Unit> f15147b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Jh.G$d$a$a, reason: collision with other inner class name */
            static final class C0239a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f15148a;

                C0239a(LocalThemeScope localThemeScope) {
                    this.f15148a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1504363218, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous>.<anonymous> (AddressesScreen.kt:97)");
                    }
                    Dr.g.g(this.f15148a, C16193g.c(Fh.h.f10718j, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                    ComposerKt.U(175482990, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous> (AddressesScreen.kt:95)");
                }
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
                C.f.d dVar = C.f.d.f15507e;
                LocalThemeScope localThemeScope = this.f15146a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1504363218, true, new C0239a(localThemeScope), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f15147b);
                final Function1<Fh.a, Unit> function1 = this.f15147b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Jh.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return G.d.a.c(function1);
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
                this.f15146a = localThemeScope;
                this.f15147b = function1;
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
            final /* synthetic */ i.AddressesScreenViewState f15149a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15150b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f15151c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15152d;

            /* JADX WARN: Multi-variable type inference failed */
            b(i.AddressesScreenViewState aVar, LocalThemeScope localThemeScope, Modifier modifier, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
                this.f15149a = aVar;
                this.f15150b = localThemeScope;
                this.f15151c = modifier;
                this.f15152d = function1;
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
                    ComposerKt.U(-1782145945, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous> (AddressesScreen.kt:107)");
                }
                if (this.f15149a.getIsLoading()) {
                    composer.startReplaceGroup(-1819050642);
                    yr.N.b(this.f15150b, null, composer, LocalThemeScope.f15770g, 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1818994315);
                    D.j(this.f15150b, this.f15149a, androidx.compose.foundation.layout.D.h(this.f15151c, padding), this.f15152d, composer, LocalThemeScope.f15770g, 0);
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
        d(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super Fh.a, Unit> function1, i.AddressesScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function12) {
            this.f15141a = localThemeScope;
            this.f15142b = modifier;
            this.f15143c = function1;
            this.f15144d = aVar;
            this.f15145e = function12;
        }

        public final void a(InterfaceC14794C it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(204712873, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous> (AddressesScreen.kt:93)");
            }
            C17921a1.a(androidx.compose.foundation.layout.J.f(this.f15142b, 0.0f, 1, null), null, ComposableLambdaKt.c(175482990, true, new a(this.f15141a, this.f15143c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, this.f15141a.getAdsColors().getAdsColorUIBackground02().getColor(), 0L, ComposableLambdaKt.c(-1782145945, true, new b(this.f15144d, this.f15141a, this.f15142b, this.f15145e), composer, 54), composer, 384, 12582912, 98298);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r34, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.G.b(Ji.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, i.AddressesScreenViewState aVar, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, aVar, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
