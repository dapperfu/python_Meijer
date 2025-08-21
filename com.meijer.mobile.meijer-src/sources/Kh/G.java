package Kh;

import Gh.a;
import Kh.G;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.D1;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.addresses.a;
import com.meijer.mobile.accounts.ux.addresses.i;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import kotlin.C17987a1;
import kotlin.C18036r;
import kotlin.C18039s;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "LGh/a;", "onNavigationRequest", "c", "(LKi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "isLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class G {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1", f = "AddressesScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f16665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f16666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18036r f16667d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1$1", f = "AddressesScreen.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: Kh.G$a$a, reason: collision with other inner class name */
        static final class C0280a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f16668a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f16669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0280a(C18036r c18036r, Continuation<? super C0280a> continuation) {
                super(2, continuation);
                this.f16669b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0280a(this.f16669b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0280a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f16668a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s c18039sA = this.f16669b.getBottomSheetState();
                    this.f16668a = 1;
                    if (c18039sA.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$1$1$2", f = "AddressesScreen.kt", l = {72}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f16670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18036r f16671b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C18036r c18036r, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f16671b = c18036r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f16671b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f16670a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C18039s c18039sA = this.f16671b.getBottomSheetState();
                    this.f16670a = 1;
                    if (c18039sA.a(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i.AddressesScreenViewState aVar, InterfaceC15783O interfaceC15783O, C18036r c18036r, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16665b = aVar;
            this.f16666c = interfaceC15783O;
            this.f16667d = c18036r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16665b, this.f16666c, this.f16667d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f16664a == 0) {
                ResultKt.b(obj);
                if (this.f16665b.getShowModal()) {
                    C15809k.d(this.f16666c, null, null, new C0280a(this.f16667d, null), 3, null);
                } else {
                    C15809k.d(this.f16666c, null, null, new b(this.f16667d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreenKt$AddressesScreen$2$1", f = "AddressesScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18036r f16673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D1 f16674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f16675d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f16676e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C18036r c18036r, D1 d12, InterfaceC5914o interfaceC5914o, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16673b = c18036r;
            this.f16674c = d12;
            this.f16675d = interfaceC5914o;
            this.f16676e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16673b, this.f16674c, this.f16675d, this.f16676e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f16672a == 0) {
                ResultKt.b(obj);
                if (this.f16673b.getBottomSheetState().f()) {
                    D1 d12 = this.f16674c;
                    if (d12 != null) {
                        d12.b();
                    }
                    InterfaceC5914o.l(this.f16675d, false, 1, null);
                    this.f16676e.invoke(a.b.f94902a);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f16678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f16679c;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, i.AddressesScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
            this.f16677a = localThemeScope;
            this.f16678b = aVar;
            this.f16679c = function1;
        }

        public final void a(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1989687232, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous> (AddressesScreen.kt:97)");
            }
            X.h(this.f16677a, this.f16678b, null, this.f16679c, composer, LocalThemeScope.f17314g, 2);
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
    static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16680a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f16681b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f16682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f16683d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f16684e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f16685a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Gh.a, Unit> f16686b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Kh.G$d$a$a, reason: collision with other inner class name */
            static final class C0281a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f16687a;

                C0281a(LocalThemeScope localThemeScope) {
                    this.f16687a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1504363218, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous>.<anonymous> (AddressesScreen.kt:106)");
                    }
                    Dr.g.g(this.f16687a, C16338g.c(Gh.h.f12909j, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                    ComposerKt.U(175482990, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous> (AddressesScreen.kt:104)");
                }
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
                C.f.d dVar = C.f.d.f17051e;
                LocalThemeScope localThemeScope = this.f16685a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1504363218, true, new C0281a(localThemeScope), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f16686b);
                final Function1<Gh.a, Unit> function1 = this.f16686b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Kh.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return G.d.a.c(function1);
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
                this.f16685a = localThemeScope;
                this.f16686b = function1;
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
            final /* synthetic */ i.AddressesScreenViewState f16688a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f16689b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f16690c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f16691d;

            /* JADX WARN: Multi-variable type inference failed */
            b(i.AddressesScreenViewState aVar, LocalThemeScope localThemeScope, Modifier modifier, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
                this.f16688a = aVar;
                this.f16689b = localThemeScope;
                this.f16690c = modifier;
                this.f16691d = function1;
            }

            public final void a(InterfaceC14882C padding, Composer composer, int i10) {
                Intrinsics.j(padding, "padding");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(padding) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1782145945, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous>.<anonymous> (AddressesScreen.kt:116)");
                }
                if (this.f16688a.getIsLoading()) {
                    composer.startReplaceGroup(-1819050642);
                    yr.N.b(this.f16689b, null, composer, LocalThemeScope.f17314g, 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1818994315);
                    C.j(this.f16689b, this.f16688a, androidx.compose.foundation.layout.D.h(this.f16690c, padding), this.f16691d, composer, LocalThemeScope.f17314g, 0);
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
        d(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super Gh.a, Unit> function1, i.AddressesScreenViewState aVar, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function12) {
            this.f16680a = localThemeScope;
            this.f16681b = modifier;
            this.f16682c = function1;
            this.f16683d = aVar;
            this.f16684e = function12;
        }

        public final void a(InterfaceC14882C it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(204712873, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressesScreen.<anonymous> (AddressesScreen.kt:102)");
            }
            C17987a1.a(androidx.compose.foundation.layout.J.f(this.f16681b, 0.0f, 1, null), null, ComposableLambdaKt.c(175482990, true, new a(this.f16680a, this.f16682c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, this.f16680a.getAdsColors().getAdsColorUIBackground02().getColor(), 0L, ComposableLambdaKt.c(-1782145945, true, new b(this.f16683d, this.f16680a, this.f16681b, this.f16684e), composer, 54), composer, 384, 12582912, 98298);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r34, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.G.c(Ki.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, i.AddressesScreenViewState aVar, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, aVar, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(C18036r c18036r, Function1 function1, Function1 function12) {
        if (c18036r.getBottomSheetState().g()) {
            function1.invoke(a.b.f94902a);
        } else {
            function12.invoke(a.k.f12614a);
        }
        return Unit.f143329a;
    }
}
