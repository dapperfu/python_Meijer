package fq;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5864h0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.Y0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import hq.ShopAndScanItemDecorator;
import j0.C14903g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16806i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001aw\u0010\u0012\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u001c\u0010\u0011\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/f;", "decorator", "", "isItemSyncing", "isQuantityStepperSelected", "Lkotlin/Function1;", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "", "onFocusedQuantityStepper", "Lkotlin/Function0;", "onUnfocusedQuantityStepper", "Lkotlin/Function2;", "", "onUpdateItemQuantity", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "qtyIncrement", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class m {
    public static final void e(final LocalThemeScope localThemeScope, final Modifier modifier, final ShopAndScanItemDecorator decorator, final boolean z10, final boolean z11, final Function1<? super String, Unit> onFocusedQuantityStepper, final Function0<Unit> onUnfocusedQuantityStepper, final Function2<? super String, ? super Integer, Unit> onUpdateItemQuantity, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(onFocusedQuantityStepper, "onFocusedQuantityStepper");
        Intrinsics.j(onUnfocusedQuantityStepper, "onUnfocusedQuantityStepper");
        Intrinsics.j(onUpdateItemQuantity, "onUpdateItemQuantity");
        Composer composerStartRestartGroup = composer.startRestartGroup(64237501);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onFocusedQuantityStepper) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onUnfocusedQuantityStepper) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onUpdateItemQuantity) ? 8388608 : 4194304;
        }
        if ((4793475 & i11) == 4793474 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(64237501, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.item.QuantityStepperComponent (QuantityStepperComponent.kt:42)");
            }
            double d10 = decorator.getShowQuantityStepper() ? 300.0d : 1.0d;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = Y0.a(1.0d);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5864h0 interfaceC5864h0 = (InterfaceC5864h0) objB;
            composerStartRestartGroup.P();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 15;
            Modifier modifierH = J.h(D.m(companion2, 0.0f, H1.h.p(f10), H1.h.p(f10), 0.0f, 9, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.j(), composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1161085520);
                float f11 = 50;
                C5804h.a(Ej.a.b(T0.e.a(J.i(J.z(companion2, H1.h.p(f11)), H1.h.p(f11)), C16806i.c(H1.h.p(45))), localThemeScope.getAdsColors().getAdsColorSupportInformationalBg().getColor(), null, 0, null, 14, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
                composer2 = composerStartRestartGroup;
            } else {
                if (decorator.o() || !decorator.getShowQuantityStepper()) {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1160051205);
                    composer2.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1160709490);
                    double quantity = decorator.getQuantity();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zD = ((29360128 & i11) == 8388608) | composerStartRestartGroup.D(decorator);
                    Object objB2 = composerStartRestartGroup.B();
                    if (zD || objB2 == companion.a()) {
                        objB2 = new Function2() { // from class: fq.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m.g(onUpdateItemQuantity, decorator, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                            }
                        };
                        composerStartRestartGroup.t(objB2);
                    }
                    Function2 function2 = (Function2) objB2;
                    composerStartRestartGroup.P();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zD2 = ((458752 & i11) == 131072) | composerStartRestartGroup.D(decorator);
                    Object objB3 = composerStartRestartGroup.B();
                    if (zD2 || objB3 == companion.a()) {
                        objB3 = new Function0() { // from class: fq.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return m.h(onFocusedQuantityStepper, decorator);
                            }
                        };
                        composerStartRestartGroup.t(objB3);
                    }
                    Function0 function0 = (Function0) objB3;
                    composerStartRestartGroup.P();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z12 = (3670016 & i11) == 1048576;
                    Object objB4 = composerStartRestartGroup.B();
                    if (z12 || objB4 == companion.a()) {
                        objB4 = new Function0() { // from class: fq.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return m.i(onUnfocusedQuantityStepper);
                            }
                        };
                        composerStartRestartGroup.t(objB4);
                    }
                    composerStartRestartGroup.P();
                    Lj.k.n(localThemeScope, quantity, function2, z11, function0, (Function0) objB4, f(interfaceC5864h0), d10, AnimatedGradientTextView.ANIMATION_DURATION, null, null, null, null, null, false, null, composerStartRestartGroup, 100663296 | LocalThemeScope.f17314g | (i11 & 14) | ((i11 >> 3) & 7168), 0, 32512);
                    composer2 = composerStartRestartGroup;
                    composer2.P();
                }
            }
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: fq.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.j(localThemeScope, modifier, decorator, z10, z11, onFocusedQuantityStepper, onUnfocusedQuantityStepper, onUpdateItemQuantity, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanItemDecorator shopAndScanItemDecorator, boolean z10, boolean z11, Function1 function1, Function0 function0, Function2 function2, int i10, Composer composer, int i11) {
        e(localThemeScope, modifier, shopAndScanItemDecorator, z10, z11, function1, function0, function2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final double f(InterfaceC5864h0 interfaceC5864h0) {
        return interfaceC5864h0.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function2 function2, ShopAndScanItemDecorator shopAndScanItemDecorator, double d10, double d11) {
        function2.invoke(shopAndScanItemDecorator.getLocalId(), Integer.valueOf((int) d10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, ShopAndScanItemDecorator shopAndScanItemDecorator) {
        function1.invoke(shopAndScanItemDecorator.getLocalId());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
