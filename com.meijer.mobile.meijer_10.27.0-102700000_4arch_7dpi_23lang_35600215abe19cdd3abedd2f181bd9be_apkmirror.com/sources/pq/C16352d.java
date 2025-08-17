package pq;

import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import fq.w;
import hq.ShopAndScanItemDecorator;
import j0.C14801J;
import j0.InterfaceC14810b;
import kotlin.C13803b;
import kotlin.C13804c;
import kotlin.C13817p;
import kotlin.C6327j;
import kotlin.EnumC13827z;
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
import pq.C16352d;
import qv.InterfaceC16622O;
import yr.Q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aÙ\u0001\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u00072 \u0010\u0011\u001a\u001c\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u00072\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u0018\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/f;", "decorator", "", "quantityStepperSelected", "Lkotlin/Function1;", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "", "onFocusQuantityStepper", "Lkotlin/Function0;", "onUnfocusedQuantityStepper", "onDismissRestriction", "Lkotlin/Function2;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "onCouponAction", "", "onUpdateItemQuantity", "onRemoveItem", "onSyncItem", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Lhq/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "actionWidth", "", "isClicked", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pq.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16352d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.widget.CartItemWidgetKt$CartItemWidget$1$1", f = "CartItemWidget.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: pq.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13804c<Mr.a> f156234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f156235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C13804c<Mr.a> c13804c, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f156234b = c13804c;
            this.f156235c = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f156234b, this.f156235c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156233a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    aVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13804c<Mr.a> c13804c = this.f156234b;
                Mr.a aVar2 = Mr.a.f21209a;
                this.f156233a = 1;
                aVar = this;
                if (androidx.compose.foundation.gestures.a.q(c13804c, aVar2, null, aVar, 2, null) == objF) {
                    return objF;
                }
            }
            C16352d.j(aVar.f156235c, false);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pq.d$b */
    static final class b implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f156236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f156238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShopAndScanItemDecorator f156239d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f156240e;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, ShopAndScanItemDecorator shopAndScanItemDecorator, InterfaceC5730l0 interfaceC5730l0) {
            C16352d.j(interfaceC5730l0, true);
            function1.invoke(shopAndScanItemDecorator.getLocalId());
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC5726j0 interfaceC5726j0, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, ShopAndScanItemDecorator shopAndScanItemDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f156236a = interfaceC5726j0;
            this.f156237b = localThemeScope;
            this.f156238c = function1;
            this.f156239d = shopAndScanItemDecorator;
            this.f156240e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC5726j0 interfaceC5726j0, LayoutCoordinates it) {
            Intrinsics.j(it, "it");
            C16352d.h(interfaceC5726j0, (int) (it.c() >> 32));
            return Unit.f142422a;
        }

        public final void c(InterfaceC14810b SwipeToRevealAction, Composer composer, int i10) {
            Intrinsics.j(SwipeToRevealAction, "$this$SwipeToRevealAction");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(SwipeToRevealAction) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-86577981, i10, -1, "com.meijer.mobile.shopandscan.presentation.widget.CartItemWidget.<anonymous> (CartItemWidget.kt:94)");
            }
            Modifier modifierH = J.H(J.d(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            final InterfaceC5726j0 interfaceC5726j0 = this.f156236a;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: pq.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16352d.b.d(interfaceC5726j0, (LayoutCoordinates) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = T.a(modifierH, (Function1) objB);
            e.Companion companion2 = P0.e.INSTANCE;
            Modifier modifierG = SwipeToRevealAction.g(modifierA, companion2.f());
            e.c cVarI = companion2.i();
            LocalThemeScope localThemeScope = this.f156237b;
            final Function1<String, Unit> function1 = this.f156238c;
            final ShopAndScanItemDecorator shopAndScanItemDecorator = this.f156239d;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f156240e;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierG);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            String strC = C16193g.c(Q.f170979V, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.D(shopAndScanItemDecorator);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: pq.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16352d.b.e(function1, shopAndScanItemDecorator, interfaceC5730l0);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Mr.d.c(localThemeScope, strC, null, (Function0) objB2, composer, LocalThemeScope.f15770g, 2);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            c(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pq.d$c */
    static final class c implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f156242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanItemDecorator f156243c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f156244d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f156245e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f156246f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f156247g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Long, String, Unit> f156248h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f156249i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f156250j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f156251k;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanItemDecorator shopAndScanItemDecorator, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function12, Function2<? super Long, ? super String, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, Function1<? super String, Unit> function13, Function1<? super String, Unit> function14) {
            this.f156241a = localThemeScope;
            this.f156242b = modifier;
            this.f156243c = shopAndScanItemDecorator;
            this.f156244d = str;
            this.f156245e = function1;
            this.f156246f = function0;
            this.f156247g = function12;
            this.f156248h = function2;
            this.f156249i = function22;
            this.f156250j = function13;
            this.f156251k = function14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function2 function2, String id2, int i10) {
            Intrinsics.j(id2, "id");
            function2.invoke(id2, Integer.valueOf(i10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, String localId) {
            Intrinsics.j(localId, "localId");
            function1.invoke(localId);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String localId) {
            Intrinsics.j(localId, "localId");
            function1.invoke(localId);
            return Unit.f142422a;
        }

        public final void d(InterfaceC14810b SwipeToRevealAction, Composer composer, int i10) {
            Intrinsics.j(SwipeToRevealAction, "$this$SwipeToRevealAction");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1959791518, i10, -1, "com.meijer.mobile.shopandscan.presentation.widget.CartItemWidget.<anonymous> (CartItemWidget.kt:114)");
            }
            LocalThemeScope localThemeScope = this.f156241a;
            Modifier modifier = this.f156242b;
            ShopAndScanItemDecorator shopAndScanItemDecorator = this.f156243c;
            String str = this.f156244d;
            Function1<String, Unit> function1 = this.f156245e;
            Function0<Unit> function0 = this.f156246f;
            Function1<String, Unit> function12 = this.f156247g;
            Function2<Long, String, Unit> function2 = this.f156248h;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f156249i);
            final Function2<String, Integer, Unit> function22 = this.f156249i;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: pq.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C16352d.c.e(function22, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function23 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f156250j);
            final Function1<String, Unit> function13 = this.f156250j;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: pq.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16352d.c.f(function13, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function14 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f156251k);
            final Function1<String, Unit> function15 = this.f156251k;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: pq.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16352d.c.g(function15, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            w.h(localThemeScope, modifier, shopAndScanItemDecorator, str, function1, function0, function12, function2, function23, function14, (Function1) objB3, composer, LocalThemeScope.f15770g, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            d(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final Modifier modifier, final ShopAndScanItemDecorator decorator, final String quantityStepperSelected, final Function1<? super String, Unit> onFocusQuantityStepper, final Function0<Unit> onUnfocusedQuantityStepper, final Function1<? super String, Unit> onDismissRestriction, final Function2<? super Long, ? super String, Unit> onCouponAction, final Function2<? super String, ? super Integer, Unit> onUpdateItemQuantity, final Function1<? super String, Unit> onRemoveItem, final Function1<? super String, Unit> onSyncItem, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        Intrinsics.j(onFocusQuantityStepper, "onFocusQuantityStepper");
        Intrinsics.j(onUnfocusedQuantityStepper, "onUnfocusedQuantityStepper");
        Intrinsics.j(onDismissRestriction, "onDismissRestriction");
        Intrinsics.j(onCouponAction, "onCouponAction");
        Intrinsics.j(onUpdateItemQuantity, "onUpdateItemQuantity");
        Intrinsics.j(onRemoveItem, "onRemoveItem");
        Intrinsics.j(onSyncItem, "onSyncItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(199331535);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(quantityStepperSelected) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onFocusQuantityStepper) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(onUnfocusedQuantityStepper) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(onDismissRestriction) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(onCouponAction) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(onUpdateItemQuantity) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= composerStartRestartGroup.D(onRemoveItem) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.D(onSyncItem) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i14 & 306783379) == 306783378 && (i13 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(199331535, i14, i13, "com.meijer.mobile.shopandscan.presentation.widget.CartItemWidget (CartItemWidget.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            int iE = e(interfaceC5726j0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.d(iE);
            Object objB3 = composerStartRestartGroup.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C13804c(Mr.a.f21209a, androidx.compose.foundation.gestures.a.b(new Function1() { // from class: pq.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16352d.k(interfaceC5726j0, (C13817p) obj);
                    }
                }));
                composerStartRestartGroup.t(objB3);
            }
            C13804c c13804c = (C13804c) objB3;
            composerStartRestartGroup.P();
            Boolean boolValueOf = Boolean.valueOf(i(interfaceC5730l0));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(c13804c);
            Object objB4 = composerStartRestartGroup.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new a(c13804c, interfaceC5730l0, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB4, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            EnumC13827z enumC13827z = EnumC13827z.f130586b;
            C13803b c13803b = C13803b.f130302a;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB5 = composerStartRestartGroup.B();
            if (objB5 == companion.a()) {
                objB5 = new Function1() { // from class: pq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(C16352d.f(((Float) obj).floatValue()));
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            Mr.g.c(localThemeScope, androidx.compose.foundation.gestures.a.l(companion2, c13804c, enumC13827z, false, null, null, c13803b.a(c13804c, (Function1) objB5, C6327j.l(0, 0, null, 7, null), composerStartRestartGroup, (C13803b.f130306e << 9) | 432, 0), 28, null), c13804c, ComposableLambdaKt.c(-86577981, true, new b(interfaceC5726j0, localThemeScope, onRemoveItem, decorator, interfaceC5730l0), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1959791518, true, new c(localThemeScope, modifier, decorator, quantityStepperSelected, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onSyncItem, onRemoveItem), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 27648 | (i14 & 14), 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pq.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16352d.g(localThemeScope, modifier, decorator, quantityStepperSelected, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onRemoveItem, onSyncItem, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        return f10 * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanItemDecorator shopAndScanItemDecorator, String str, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function2 function22, Function1 function13, Function1 function14, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, shopAndScanItemDecorator, str, function1, function0, function12, function2, function22, function13, function14, composer, J0.a(i10 | 1), J0.a(i11));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(InterfaceC5726j0 interfaceC5726j0, C13817p DraggableAnchors) {
        Intrinsics.j(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.a(Mr.a.f21209a, 0.0f);
        DraggableAnchors.a(Mr.a.f21210b, e(interfaceC5726j0));
        return Unit.f142422a;
    }

    private static final int e(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    private static final boolean i(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
