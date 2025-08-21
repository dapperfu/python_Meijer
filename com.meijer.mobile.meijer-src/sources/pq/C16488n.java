package pq;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import eq.K;
import eq.f0;
import eq.r;
import hq.ShopAndScanItemDecorator;
import iq.ShopAndScanCartViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\u001að\u0002\u0010&\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00102!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u00172\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0016\u0010\u001e\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\u00150\u00172 \u0010!\u001a\u001c\u0012\b\u0012\u00060\u001fj\u0002` \u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\u00150\u00102\u001c\u0010\"\u001a\u0018\u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00102\u0016\u0010#\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\u00150\u00172\u0016\u0010$\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u001a\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0001¢\u0006\u0004\b&\u0010'¨\u0006)²\u0006\u000e\u0010(\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lhq/f;", "items", "", "isRefreshing", "Liq/E$a;", "cartRefreshMessage", "", "firstVisibleIndex", "firstVisibleItemScrollOffset", "previousItemCount", "", "quantityStepperSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "offset", "", "onSaveScrollPosition", "Lkotlin/Function1;", "listSize", "onSavePreviousItemCount", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "onFocusQuantityStepper", "Lkotlin/Function0;", "onUnfocusedQuantityStepper", "onDismissRestriction", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "onCouponAction", "onUpdateItemQuantity", "onRemoveItem", "onSyncItem", "onSyncCart", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;ZLiq/E$a;IIILjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "topOffset", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pq.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16488n {
    public static final void c(final LocalThemeScope localThemeScope, Modifier modifier, final List<ShopAndScanItemDecorator> items, final boolean z10, final ShopAndScanCartViewState.a cartRefreshMessage, final int i10, final int i11, final int i12, final String quantityStepperSelected, final Function2<? super Integer, ? super Integer, Unit> onSaveScrollPosition, final Function1<? super Integer, Unit> onSavePreviousItemCount, final Function1<? super String, Unit> onFocusQuantityStepper, final Function0<Unit> onUnfocusedQuantityStepper, final Function1<? super String, Unit> onDismissRestriction, final Function2<? super Long, ? super String, Unit> onCouponAction, final Function2<? super String, ? super Integer, Unit> onUpdateItemQuantity, final Function1<? super String, Unit> onRemoveItem, final Function1<? super String, Unit> onSyncItem, final Function0<Unit> onSyncCart, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(items, "items");
        Intrinsics.j(cartRefreshMessage, "cartRefreshMessage");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        Intrinsics.j(onSaveScrollPosition, "onSaveScrollPosition");
        Intrinsics.j(onSavePreviousItemCount, "onSavePreviousItemCount");
        Intrinsics.j(onFocusQuantityStepper, "onFocusQuantityStepper");
        Intrinsics.j(onUnfocusedQuantityStepper, "onUnfocusedQuantityStepper");
        Intrinsics.j(onDismissRestriction, "onDismissRestriction");
        Intrinsics.j(onCouponAction, "onCouponAction");
        Intrinsics.j(onUpdateItemQuantity, "onUpdateItemQuantity");
        Intrinsics.j(onRemoveItem, "onRemoveItem");
        Intrinsics.j(onSyncItem, "onSyncItem");
        Intrinsics.j(onSyncCart, "onSyncCart");
        Composer composerStartRestartGroup = composer.startRestartGroup(-398949408);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= composerStartRestartGroup.D(items) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= composerStartRestartGroup.a(z10) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= composerStartRestartGroup.V(cartRefreshMessage) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i16 = 196608;
            i15 |= composerStartRestartGroup.d(i10) ? 131072 : 65536;
        } else {
            i16 = 196608;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= composerStartRestartGroup.d(i11) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= composerStartRestartGroup.d(i12) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= composerStartRestartGroup.V(quantityStepperSelected) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= composerStartRestartGroup.D(onSaveScrollPosition) ? 536870912 : 268435456;
        }
        int i18 = i15;
        if ((i14 & 6) == 0) {
            i17 = i14 | (composerStartRestartGroup.D(onSavePreviousItemCount) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= composerStartRestartGroup.D(onFocusQuantityStepper) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= composerStartRestartGroup.D(onUnfocusedQuantityStepper) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= composerStartRestartGroup.D(onDismissRestriction) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= composerStartRestartGroup.D(onCouponAction) ? 16384 : 8192;
        }
        if ((i14 & i16) == 0) {
            i17 |= composerStartRestartGroup.D(onUpdateItemQuantity) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= composerStartRestartGroup.D(onRemoveItem) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= composerStartRestartGroup.D(onSyncItem) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= composerStartRestartGroup.D(onSyncCart) ? 67108864 : 33554432;
        }
        int i19 = i17;
        if ((i18 & 306783379) == 306783378 && (38347923 & i19) == 38347922 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-398949408, i18, i19, "com.meijer.mobile.shopandscan.presentation.widget.CartWidget (CartWidget.kt:53)");
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
            A0.g gVarA = A0.h.a(z10, onSyncCart, H1.h.p(100), 0.0f, composerStartRestartGroup, ((i18 >> 9) & 14) | 384 | ((i19 >> 21) & 112), 8);
            if (items.isEmpty()) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-924767786);
                modifier2 = modifier;
                K.b(localThemeScope, modifier2, composer2, LocalThemeScope.f17314g | (i18 & 14) | (i18 & 112));
                composer2.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-926083023);
                Modifier modifierF = J.f(modifier, 0.0f, 1, null);
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierF);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = D1.a(composerStartRestartGroup);
                D1.c(composerA, measurePolicyG, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C5806j c5806j = C5806j.f48836a;
                Modifier modifierD = A0.e.d(modifier, gVarA, false, 2, null);
                int iD = d(interfaceC5868j0);
                int i20 = LocalThemeScope.f17314g;
                int i21 = i18 & 14;
                int i22 = i18 >> 3;
                r.f(localThemeScope, modifierD, items, iD, i10, i11, i12, quantityStepperSelected, onSaveScrollPosition, onSavePreviousItemCount, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onRemoveItem, onSyncItem, composerStartRestartGroup, i20 | i21 | (i18 & 896) | (i22 & 57344) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (i22 & 234881024) | ((i19 << 27) & 1879048192), (i19 >> 3) & 4194302);
                composer2 = composerStartRestartGroup;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer2.startReplaceGroup(5004770);
                Object objB2 = composer2.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: pq.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C16488n.f(interfaceC5868j0, ((Integer) obj).intValue());
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                f0.d(localThemeScope, companion3, gVarA, z10, cartRefreshMessage, (Function1) objB2, composer2, i20 | 196656 | i21 | (A0.g.f55j << 6) | (i18 & 7168) | (i18 & 57344), 0);
                composer2.v();
                composer2.P();
                modifier2 = modifier;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pq.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16488n.g(localThemeScope, modifier2, items, z10, cartRefreshMessage, i10, i11, i12, quantityStepperSelected, onSaveScrollPosition, onSavePreviousItemCount, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onRemoveItem, onSyncItem, onSyncCart, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, List list, boolean z10, ShopAndScanCartViewState.a aVar, int i10, int i11, int i12, String str, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function2 function22, Function2 function23, Function1 function14, Function1 function15, Function0 function02, int i13, int i14, Composer composer, int i15) {
        c(localThemeScope, modifier, list, z10, aVar, i10, i11, i12, str, function2, function1, function12, function0, function13, function22, function23, function14, function15, function02, composer, J0.a(i13 | 1), J0.a(i14));
        return Unit.f143329a;
    }

    private static final int d(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    private static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC5868j0 interfaceC5868j0, int i10) {
        e(interfaceC5868j0, i10);
        return Unit.f143329a;
    }
}
