package Dq;

import Bq.a;
import Cq.U;
import Dq.H;
import Fq.ShoppingListItem;
import Ji.LocalThemeScope;
import P0.e;
import Pq.h;
import androidx.compose.foundation.layout.C5658d;
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
import qv.InterfaceC16622O;
import yr.Q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aS\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LFq/c;", "shoppingItem", "", "isInEditMode", "isShoppingListIterationTwoEnabled", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "d", "(LJi/M;LFq/c;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "actionWidth", "isClicked", "", "lastAction", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class H {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListItemWidgetKt$ShoppingListItemWidget$1$1", f = "ShoppingListItemWidget.kt", l = {78}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13804c<Mr.a> f7081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f7082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C13804c<Mr.a> c13804c, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7081b = c13804c;
            this.f7082c = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f7081b, this.f7082c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7080a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    aVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13804c<Mr.a> c13804c = this.f7081b;
                Mr.a aVar2 = Mr.a.f21209a;
                this.f7080a = 1;
                aVar = this;
                if (androidx.compose.foundation.gestures.a.q(c13804c, aVar2, null, aVar, 2, null) == objF) {
                    return objF;
                }
            }
            H.j(aVar.f7082c, false);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f7083a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7084b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f7085c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f7086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f7087e;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC5726j0 interfaceC5726j0, LocalThemeScope localThemeScope, Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f7083a = interfaceC5726j0;
            this.f7084b = localThemeScope;
            this.f7085c = function1;
            this.f7086d = shoppingListItem;
            this.f7087e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC5726j0 interfaceC5726j0, LayoutCoordinates it) {
            Intrinsics.j(it, "it");
            H.h(interfaceC5726j0, (int) (it.c() >> 32));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, ShoppingListItem shoppingListItem, InterfaceC5730l0 interfaceC5730l0) {
            function1.invoke(new a.Remove(shoppingListItem));
            H.j(interfaceC5730l0, true);
            return Unit.f142422a;
        }

        public final void c(InterfaceC14810b SwipeToRevealAction, Composer composer, int i10) {
            int i11;
            Intrinsics.j(SwipeToRevealAction, "$this$SwipeToRevealAction");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(SwipeToRevealAction) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1241237013, i11, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListItemWidget.<anonymous> (ShoppingListItemWidget.kt:93)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.H(androidx.compose.foundation.layout.J.d(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            final InterfaceC5726j0 interfaceC5726j0 = this.f7083a;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Dq.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return H.b.d(interfaceC5726j0, (LayoutCoordinates) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = T.a(modifierH, (Function1) objB);
            e.Companion companion2 = P0.e.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(SwipeToRevealAction.g(modifierA, companion2.f()), 0.0f, H1.h.p(1), 1, null);
            e.c cVarI = companion2.i();
            LocalThemeScope localThemeScope = this.f7084b;
            final Function1<Bq.a, Unit> function1 = this.f7085c;
            final ShoppingListItem shoppingListItem = this.f7086d;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f7087e;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            boolean zV = composer.V(function1) | composer.D(shoppingListItem);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Dq.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return H.b.e(function1, shoppingListItem, interfaceC5730l0);
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
    static final class c implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f7089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7091d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f7092e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f7093f;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, boolean z10, boolean z11, Function1<? super h.AbstractC5014e, Unit> function1, Function1<? super Bq.a, Unit> function12) {
            this.f7088a = localThemeScope;
            this.f7089b = shoppingListItem;
            this.f7090c = z10;
            this.f7091d = z11;
            this.f7092e = function1;
            this.f7093f = function12;
        }

        public final void a(InterfaceC14810b SwipeToRevealAction, Composer composer, int i10) {
            Intrinsics.j(SwipeToRevealAction, "$this$SwipeToRevealAction");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1726182262, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListItemWidget.<anonymous> (ShoppingListItemWidget.kt:114)");
            }
            U.l(this.f7088a, this.f7089b, null, this.f7090c, this.f7091d, this.f7092e, this.f7093f, composer, LocalThemeScope.f15770g, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final ShoppingListItem shoppingItem, final boolean z10, final boolean z11, final Function1<? super h.AbstractC5014e, Unit> onAction, final Function1<? super Bq.a, Unit> onShoppingListItemAction, Composer composer, final int i10) {
        int i11;
        boolean z12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(shoppingItem, "shoppingItem");
        Intrinsics.j(onAction, "onAction");
        Intrinsics.j(onShoppingListItemAction, "onShoppingListItemAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1425877001);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(shoppingItem) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z12 = z10;
            i11 |= composerStartRestartGroup.a(z12) ? 256 : 128;
        } else {
            z12 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onShoppingListItemAction) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1425877001, i11, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListItemWidget (ShoppingListItemWidget.kt:59)");
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
                objB3 = new C13804c(Mr.a.f21209a, androidx.compose.foundation.gestures.a.b(new Function1() { // from class: Dq.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return H.k(interfaceC5726j0, (C13817p) obj);
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
                objB5 = new Function1() { // from class: Dq.F
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(H.f(((Float) obj).floatValue()));
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            Mr.g.c(localThemeScope, androidx.compose.foundation.gestures.a.l(companion2, c13804c, enumC13827z, false, null, null, c13803b.a(c13804c, (Function1) objB5, C6327j.l(0, 0, null, 7, null), composerStartRestartGroup, (C13803b.f130306e << 9) | 432, 0), 28, null), c13804c, ComposableLambdaKt.c(-1241237013, true, new b(interfaceC5726j0, localThemeScope, onShoppingListItemAction, shoppingItem, interfaceC5730l0), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1726182262, true, new c(localThemeScope, shoppingItem, z12, z11, onAction, onShoppingListItemAction), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 27648 | (i11 & 14), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Dq.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return H.g(localThemeScope, shoppingItem, z10, z11, onAction, onShoppingListItemAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        return f10 * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, boolean z10, boolean z11, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        d(localThemeScope, shoppingListItem, z10, z11, function1, function12, composer, J0.a(i10 | 1));
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
