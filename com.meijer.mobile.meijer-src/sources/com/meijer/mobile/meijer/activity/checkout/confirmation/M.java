package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Bm.C2985b0;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.confirmation.M;
import com.meijer.mobile.meijer.activity.checkout.confirmation.Y;
import dk.C13698b;
import gi.GoogleAdAnalytics;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17957L0;
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
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0084\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001at\u0010\u0016\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u000e\u0010\u001c\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "viewState", "", "isRoktAdEnabled", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "", "onAction", "Lkotlin/Function0;", "onNavigateToHomeScreen", "onLoadOrderDetails", "", "Lkotlin/ParameterName;", "name", "orderId", "onOpenOrderDetails", "v", "(Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LKi/M;", "onPreAuthToolTipClicked", "s", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "m", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "q", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;Landroidx/compose/runtime/Composer;I)V", "isAdVisible", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y.ViewState f102880b;

        a(LocalThemeScope localThemeScope, Y.ViewState bVar) {
            this.f102879a = localThemeScope;
            this.f102880b = bVar;
        }

        public final void a(Composer composer, int i10) {
            String string;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1982067465, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.AppBar.<anonymous> (OrderConfirmationScreen.kt:182)");
            }
            LocalThemeScope localThemeScope = this.f102879a;
            OrderConfirmationDecorator c11920pD = this.f102880b.getOrder();
            AbstractC6392a abstractC6392aW = c11920pD != null ? c11920pD.w() : null;
            composer.startReplaceGroup(2096324834);
            if (abstractC6392aW == null) {
                string = null;
            } else {
                Y.ViewState bVar = this.f102880b;
                StringBuilder sb2 = new StringBuilder();
                AbstractC6392a abstractC6392aX = bVar.getOrder().x();
                int i11 = AbstractC6392a.f60445b;
                sb2.append(C13698b.a(abstractC6392aX, composer, i11));
                sb2.append(' ');
                sb2.append(C13698b.a(abstractC6392aW, composer, i11));
                string = sb2.toString();
            }
            composer.P();
            composer.startReplaceGroup(2096323797);
            if (string == null) {
                OrderConfirmationDecorator c11920pD2 = this.f102880b.getOrder();
                string = C13698b.a(c11920pD2 != null ? c11920pD2.x() : null, composer, AbstractC6392a.f60445b);
            }
            composer.P();
            Dr.g.g(localThemeScope, string, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102881a;

        b(LocalThemeScope localThemeScope) {
            this.f102881a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1884752505, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.LoadingState.<anonymous> (OrderConfirmationScreen.kt:250)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f102881a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17959M0 f102882a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<C0> f102883b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f102884c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102885d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y.ViewState f102886e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102887f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f102888g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<C0> f102889h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Y.a, Unit> f102890i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f102891j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102892a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f102893b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function0<? extends C0> function0) {
                this.f102892a = localThemeScope;
                this.f102893b = function0;
            }

            public final void b(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1492908755, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreen.<anonymous>.<anonymous> (OrderConfirmationScreen.kt:90)");
                }
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101288xi, composer, 0);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101266wg, composer, 0);
                String strC3 = C16338g.c(com.meijer.mobile.meijer.Y.f101286xg, composer, 0);
                LocalThemeScope localThemeScope = this.f102892a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f102893b);
                final Function0<C0> function0 = this.f102893b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M.c.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C2985b0.g(localThemeScope, null, strC, strC2, strC3, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                b(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f102894a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f102895b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102896c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Y.ViewState f102897d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f102898e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f102899f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f102900g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<Y.a, Unit> f102901h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f102902i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102903a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Y.ViewState f102904b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f102905c;

                a(LocalThemeScope localThemeScope, Y.ViewState bVar, Function0<Unit> function0) {
                    this.f102903a = localThemeScope;
                    this.f102904b = bVar;
                    this.f102905c = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1860782507, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreen.<anonymous>.<anonymous>.<anonymous> (OrderConfirmationScreen.kt:100)");
                    }
                    M.m(this.f102903a, this.f102904b, null, this.f102905c, composer, LocalThemeScope.f17314g, 2);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.M$c$b$b, reason: collision with other inner class name */
            static final class C1439b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102906a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Y.ViewState f102907b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f102908c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f102909d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function1<Y.a, Unit> f102910e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function1<String, Unit> f102911f;

                /* JADX WARN: Multi-variable type inference failed */
                C1439b(LocalThemeScope localThemeScope, Y.ViewState bVar, boolean z10, Function0<? extends C0> function0, Function1<? super Y.a, Unit> function1, Function1<? super String, Unit> function12) {
                    this.f102906a = localThemeScope;
                    this.f102907b = bVar;
                    this.f102908c = z10;
                    this.f102909d = function0;
                    this.f102910e = function1;
                    this.f102911f = function12;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function1 function1, Y.a it) {
                    Intrinsics.j(it, "it");
                    function1.invoke(it);
                    return Unit.f143329a;
                }

                public final void c(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-664930908, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreen.<anonymous>.<anonymous>.<anonymous> (OrderConfirmationScreen.kt:102)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                    LocalThemeScope localThemeScope = this.f102906a;
                    Y.ViewState bVar = this.f102907b;
                    boolean z10 = this.f102908c;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f102909d);
                    final Function0<C0> function0 = this.f102909d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.O
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return M.c.b.C1439b.d(function0);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function02 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(this.f102910e);
                    final Function1<Y.a, Unit> function1 = this.f102910e;
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.P
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return M.c.b.C1439b.e(function1, (Y.a) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    M.s(localThemeScope, bVar, modifierH, z10, function02, (Function1) objB2, this.f102911f, composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    c(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreenKt$OrderConfirmationScreen$4$2$3$1", f = "OrderConfirmationScreen.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.M$c$b$c, reason: collision with other inner class name */
            static final class C1440c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f102912a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f102913b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1440c(Function0<Unit> function0, Continuation<? super C1440c> continuation) {
                    super(2, continuation);
                    this.f102913b = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1440c(this.f102913b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1440c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f102912a == 0) {
                        ResultKt.b(obj);
                        this.f102913b.invoke();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(Modifier modifier, Function0<Unit> function0, LocalThemeScope localThemeScope, Y.ViewState bVar, Function0<Unit> function02, boolean z10, Function0<? extends C0> function03, Function1<? super Y.a, Unit> function1, Function1<? super String, Unit> function12) {
                this.f102894a = modifier;
                this.f102895b = function0;
                this.f102896c = localThemeScope;
                this.f102897d = bVar;
                this.f102898e = function02;
                this.f102899f = z10;
                this.f102900g = function03;
                this.f102901h = function1;
                this.f102902i = function12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1439697690, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreen.<anonymous>.<anonymous> (OrderConfirmationScreen.kt:98)");
                }
                C17987a1.a(this.f102894a, null, ComposableLambdaKt.c(1860782507, true, new a(this.f102896c, this.f102897d, this.f102898e), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-664930908, true, new C1439b(this.f102896c, this.f102897d, this.f102899f, this.f102900g, this.f102901h, this.f102902i), composer, 54), composer, 384, 12582912, 131066);
                Boolean bool = Boolean.TRUE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f102895b);
                Function0<Unit> function0 = this.f102895b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C1440c(function0, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
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

        /* JADX WARN: Multi-variable type inference failed */
        c(C17959M0 c17959m0, Function0<? extends C0> function0, Modifier modifier, Function0<Unit> function02, Y.ViewState bVar, Function0<Unit> function03, boolean z10, Function0<? extends C0> function04, Function1<? super Y.a, Unit> function1, Function1<? super String, Unit> function12) {
            this.f102882a = c17959m0;
            this.f102883b = function0;
            this.f102884c = modifier;
            this.f102885d = function02;
            this.f102886e = bVar;
            this.f102887f = function03;
            this.f102888g = z10;
            this.f102889h = function04;
            this.f102890i = function1;
            this.f102891j = function12;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1494547839, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreen.<anonymous> (OrderConfirmationScreen.kt:86)");
            }
            float f10 = 10;
            C17957L0.b(ComposableLambdaKt.c(-1492908755, true, new a(AdsTheme, this.f102883b), composer, 54), null, this.f102882a, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-1439697690, true, new b(this.f102884c, this.f102885d, AdsTheme, this.f102886e, this.f102887f, this.f102888g, this.f102889h, this.f102890i, this.f102891j), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreenKt$OrderConfirmationScreen$closeSheet$1$1$1", f = "OrderConfirmationScreen.kt", l = {83}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f102915b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f102915b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17959M0 c17959m0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f102915b = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102914a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f102915b;
                this.f102914a = 1;
                if (c17959m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationScreenKt$OrderConfirmationScreen$openSheet$1$1$1", f = "OrderConfirmationScreen.kt", l = {84}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102916a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f102917b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f102917b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17959M0 c17959m0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f102917b = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102916a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f102917b;
                this.f102916a = 1;
                if (c17959m0.l(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Modifier modifier, Y.ViewState bVar, boolean z10, Function1 function1, Function0 function0, Function0 function02, Function1 function12, int i10, int i11, Composer composer, int i12) {
        v(modifier, bVar, z10, function1, function0, function02, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 A(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
        return C15809k.d(interfaceC15783O, null, null, new d(c17959m0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 B(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
        return C15809k.d(interfaceC15783O, null, null, new e(c17959m0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r17, final com.meijer.mobile.meijer.activity.checkout.confirmation.Y.ViewState r18, androidx.compose.ui.Modifier r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.M.m(Ki.M, com.meijer.mobile.meijer.activity.checkout.confirmation.Y$b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Y.ViewState bVar, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, bVar, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Y.ViewState bVar, int i10, Composer composer, int i11) {
        q(localThemeScope, bVar, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee A[PHI: r4
      0x01ee: PHI (r4v1 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v4 androidx.compose.runtime.Composer) binds: [B:109:0x01a1, B:111:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ki.LocalThemeScope r23, final com.meijer.mobile.meijer.activity.checkout.confirmation.Y.ViewState r24, androidx.compose.ui.Modifier r25, boolean r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.confirmation.Y.a, kotlin.Unit> r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.M.s(Ki.M, com.meijer.mobile.meijer.activity.checkout.confirmation.Y$b, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        function1.invoke(new Y.a.GoogleAdClicked(googleAdAnalytics));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, Y.ViewState bVar, Modifier modifier, boolean z10, Function0 function0, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, bVar, modifier, z10, function0, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(androidx.compose.ui.Modifier r19, final com.meijer.mobile.meijer.activity.checkout.confirmation.Y.ViewState r20, boolean r21, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.confirmation.Y.a, kotlin.Unit> r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.M.v(androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.confirmation.Y$b, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Y.a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final void q(final LocalThemeScope localThemeScope, final Y.ViewState bVar, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(680942333);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(bVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(680942333, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.LoadingState (OrderConfirmationScreen.kt:247)");
            }
            if (bVar.getIsLoading()) {
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1884752505, true, new b(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.r(localThemeScope, bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
