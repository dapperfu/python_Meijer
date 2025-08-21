package Dq;

import Bq.a;
import Cq.C3081g;
import Dq.B;
import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import P0.e;
import Pq.h;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14889J;
import j0.InterfaceC14898b;
import kotlin.C13913b;
import kotlin.C13914c;
import kotlin.C13927p;
import kotlin.C6453j;
import kotlin.EnumC13937z;
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
import mv.InterfaceC15783O;
import p1.C16338g;
import yr.Q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aC\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LFq/c;", "shoppingItem", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "d", "(LKi/M;LFq/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "actionWidth", "", "isClicked", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListCompletedItemWidgetKt$ShoppingListCompletedItemWidget$1$1", f = "ShoppingListCompletedItemWidget.kt", l = {72}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13914c<Mr.a> f6364b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f6365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C13914c<Mr.a> c13914c, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6364b = c13914c;
            this.f6365c = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f6364b, this.f6365c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6363a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    aVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13914c<Mr.a> c13914c = this.f6364b;
                Mr.a aVar2 = Mr.a.f20408a;
                this.f6363a = 1;
                aVar = this;
                if (androidx.compose.foundation.gestures.a.q(c13914c, aVar2, null, aVar, 2, null) == objF) {
                    return objF;
                }
            }
            B.j(aVar.f6365c, false);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f6367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f6368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f6369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f6370e;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f6366a = localThemeScope;
            this.f6367b = interfaceC5868j0;
            this.f6368c = function1;
            this.f6369d = shoppingListItem;
            this.f6370e = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC5868j0 interfaceC5868j0, LayoutCoordinates it) {
            Intrinsics.j(it, "it");
            B.h(interfaceC5868j0, (int) (it.c() >> 32));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, ShoppingListItem shoppingListItem, InterfaceC5872l0 interfaceC5872l0) {
            function1.invoke(new a.Remove(shoppingListItem));
            B.j(interfaceC5872l0, true);
            return Unit.f143329a;
        }

        public final void c(InterfaceC14898b SwipeToRevealAction, Composer composer, int i10) {
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
                ComposerKt.U(-1046484707, i11, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListCompletedItemWidget.<anonymous> (ShoppingListCompletedItemWidget.kt:87)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.H(androidx.compose.foundation.layout.J.d(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            final InterfaceC5868j0 interfaceC5868j0 = this.f6367b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Dq.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return B.b.d(interfaceC5868j0, (LayoutCoordinates) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = T.a(modifierH, (Function1) objB);
            e.Companion companion2 = P0.e.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(SwipeToRevealAction.g(modifierA, companion2.f()), 0.0f, this.f6366a.getAdsSpacing().getOne().getDp(), 1, null);
            e.c cVarI = companion2.i();
            LocalThemeScope localThemeScope = this.f6366a;
            final Function1<Bq.a, Unit> function1 = this.f6368c;
            final ShoppingListItem shoppingListItem = this.f6369d;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f6370e;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            String strC = C16338g.c(Q.f171754V, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(function1) | composer.D(shoppingListItem);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Dq.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return B.b.e(function1, shoppingListItem, interfaceC5872l0);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Mr.d.c(localThemeScope, strC, null, (Function0) objB2, composer, LocalThemeScope.f17314g, 2);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14898b interfaceC14898b, Composer composer, Integer num) {
            c(interfaceC14898b, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f6372b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f6373c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f6374d;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1<? super h.AbstractC4612e, Unit> function1, Function1<? super Bq.a, Unit> function12) {
            this.f6371a = localThemeScope;
            this.f6372b = shoppingListItem;
            this.f6373c = function1;
            this.f6374d = function12;
        }

        public final void a(InterfaceC14898b SwipeToRevealAction, Composer composer, int i10) {
            Intrinsics.j(SwipeToRevealAction, "$this$SwipeToRevealAction");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1072566268, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListCompletedItemWidget.<anonymous> (ShoppingListCompletedItemWidget.kt:108)");
            }
            C3081g.g(this.f6371a, this.f6372b, null, this.f6373c, this.f6374d, composer, LocalThemeScope.f17314g, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14898b interfaceC14898b, Composer composer, Integer num) {
            a(interfaceC14898b, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, ShoppingListItem shoppingItem, final Function1<? super h.AbstractC4612e, Unit> onAction, Function1<? super Bq.a, Unit> onShoppingListItemAction, Composer composer, final int i10) {
        int i11;
        Function1<? super Bq.a, Unit> function1;
        ShoppingListItem shoppingListItem;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(shoppingItem, "shoppingItem");
        Intrinsics.j(onAction, "onAction");
        Intrinsics.j(onShoppingListItemAction, "onShoppingListItemAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1903113257);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(shoppingItem) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onShoppingListItemAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            shoppingListItem = shoppingItem;
            function1 = onShoppingListItemAction;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1903113257, i12, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingListCompletedItemWidget (ShoppingListCompletedItemWidget.kt:53)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
            composerStartRestartGroup.P();
            int iE = e(interfaceC5868j0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.d(iE);
            Object objB3 = composerStartRestartGroup.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C13914c(Mr.a.f20408a, androidx.compose.foundation.gestures.a.b(new Function1() { // from class: Dq.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return B.k(interfaceC5868j0, (C13927p) obj);
                    }
                }));
                composerStartRestartGroup.t(objB3);
            }
            C13914c c13914c = (C13914c) objB3;
            composerStartRestartGroup.P();
            Boolean boolValueOf = Boolean.valueOf(i(interfaceC5872l0));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(c13914c);
            Object objB4 = composerStartRestartGroup.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new a(c13914c, interfaceC5872l0, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB4, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            EnumC13937z enumC13937z = EnumC13937z.f131420b;
            C13913b c13913b = C13913b.f131136a;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB5 = composerStartRestartGroup.B();
            if (objB5 == companion.a()) {
                objB5 = new Function1() { // from class: Dq.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(B.f(((Float) obj).floatValue()));
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            Modifier modifierL = androidx.compose.foundation.gestures.a.l(companion2, c13914c, enumC13937z, false, null, null, c13913b.a(c13914c, (Function1) objB5, C6453j.l(0, 0, null, 7, null), composerStartRestartGroup, (C13913b.f131140e << 9) | 432, 0), 28, null);
            function1 = onShoppingListItemAction;
            shoppingListItem = shoppingItem;
            Mr.g.c(localThemeScope, modifierL, c13914c, ComposableLambdaKt.c(-1046484707, true, new b(localThemeScope, interfaceC5868j0, onShoppingListItemAction, shoppingItem, interfaceC5872l0), composerStartRestartGroup, 54), ComposableLambdaKt.c(1072566268, true, new c(localThemeScope, shoppingListItem, onAction, function1), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 27648 | (i12 & 14), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final ShoppingListItem shoppingListItem2 = shoppingListItem;
            final Function1<? super Bq.a, Unit> function12 = function1;
            t0L.a(new Function2() { // from class: Dq.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return B.g(localThemeScope, shoppingListItem2, onAction, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        return f10 * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        d(localThemeScope, shoppingListItem, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(InterfaceC5868j0 interfaceC5868j0, C13927p DraggableAnchors) {
        Intrinsics.j(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.a(Mr.a.f20408a, 0.0f);
        DraggableAnchors.a(Mr.a.f20409b, e(interfaceC5868j0));
        return Unit.f143329a;
    }

    private static final int e(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    private static final boolean i(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
