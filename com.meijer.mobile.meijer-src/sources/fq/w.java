package fq;

import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import dk.C13698b;
import eq.I;
import eq.b0;
import fq.w;
import hq.ShopAndScanCouponDecorator;
import hq.ShopAndScanItemDecorator;
import hq.ShopAndScanRestrictionDecorator;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001aß\u0001\u0010\u0016\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\b2 \u0010\u0011\u001a\u001c\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\b2\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/f;", "decorator", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "quantityStepperSelected", "Lkotlin/Function1;", "", "onFocusedQuantityStepper", "Lkotlin/Function0;", "onUnfocusedQuantityStepper", "onDismissRestriction", "Lkotlin/Function2;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "onCouponAction", "", "onUpdateItemQuantity", "onSyncItem", "onRemoveItem", "h", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShopAndScanItemDecorator f132588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f132590c;

        /* JADX WARN: Multi-variable type inference failed */
        a(ShopAndScanItemDecorator shopAndScanItemDecorator, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f132588a = shopAndScanItemDecorator;
            this.f132589b = localThemeScope;
            this.f132590c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(final Function1 function1, final ShopAndScanItemDecorator shopAndScanItemDecorator, Di.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.T(new Function0() { // from class: fq.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a.e(function1, shopAndScanItemDecorator);
                }
            });
            return Unit.f143329a;
        }

        public final void c(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1432023313, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.item.ShopAndScanItemComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanItemComponent.kt:97)");
            }
            q1.m.Inline warning = Assemble.getToastVariant().getWarning();
            AbstractC6392a title = this.f132588a.getRestriction().getTitle();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(title, composer, i11);
            String strA2 = C13698b.a(this.f132588a.getRestriction().getDescription(), composer, i11);
            LocalThemeScope localThemeScope = this.f132589b;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f132590c) | composer.D(this.f132588a);
            final Function1<String, Unit> function1 = this.f132590c;
            final ShopAndScanItemDecorator shopAndScanItemDecorator = this.f132588a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: fq.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.a.d(function1, shopAndScanItemDecorator, (Di.o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Di.j.i(localThemeScope, null, strA2, strA, warning, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            c(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, ShopAndScanItemDecorator shopAndScanItemDecorator) {
            function1.invoke(shopAndScanItemDecorator.getLocalId());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void h(final LocalThemeScope localThemeScope, Modifier modifier, final ShopAndScanItemDecorator decorator, final String quantityStepperSelected, Function1<? super String, Unit> function1, Function0<Unit> onUnfocusedQuantityStepper, final Function1<? super String, Unit> onDismissRestriction, final Function2<? super Long, ? super String, Unit> onCouponAction, Function2<? super String, ? super Integer, Unit> onUpdateItemQuantity, final Function1<? super String, Unit> onSyncItem, final Function1<? super String, Unit> onRemoveItem, Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        final Function0<Unit> function0;
        final ShopAndScanItemDecorator shopAndScanItemDecorator;
        Modifier.Companion companion;
        int i15;
        boolean z10;
        ?? r13;
        boolean z11;
        int i16;
        int i17;
        final Function2<? super String, ? super Integer, Unit> function2;
        Composer composer2;
        final Modifier modifier3;
        final Function1<? super String, Unit> onFocusedQuantityStepper = function1;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        Intrinsics.j(onFocusedQuantityStepper, "onFocusedQuantityStepper");
        Intrinsics.j(onUnfocusedQuantityStepper, "onUnfocusedQuantityStepper");
        Intrinsics.j(onDismissRestriction, "onDismissRestriction");
        Intrinsics.j(onCouponAction, "onCouponAction");
        Intrinsics.j(onUpdateItemQuantity, "onUpdateItemQuantity");
        Intrinsics.j(onSyncItem, "onSyncItem");
        Intrinsics.j(onRemoveItem, "onRemoveItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-944941883);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 |= 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i10 & 48) == 0) {
                i13 |= composerStartRestartGroup.V(modifier2) ? 32 : 16;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.V(quantityStepperSelected) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 8) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.D(onFocusedQuantityStepper) ? 16384 : 8192;
        }
        if ((i12 & 16) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i13 |= composerStartRestartGroup.D(onUnfocusedQuantityStepper) ? 131072 : 65536;
        }
        if ((i12 & 32) != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.D(onDismissRestriction) ? 1048576 : 524288;
        }
        if ((i12 & 64) != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.D(onCouponAction) ? 8388608 : 4194304;
        }
        if ((i12 & 128) != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.D(onUpdateItemQuantity) ? 67108864 : 33554432;
        }
        if ((i12 & 256) != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.D(onSyncItem) ? 536870912 : 268435456;
        }
        if ((i12 & 512) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.D(onRemoveItem) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
            function2 = onUpdateItemQuantity;
            function0 = onUnfocusedQuantityStepper;
        } else {
            Modifier modifier4 = i18 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-944941883, i13, i14, "com.meijer.mobile.shopandscan.presentation.component.item.ShopAndScanItemComponent (ShopAndScanItemComponent.kt:47)");
            }
            boolean zE = Intrinsics.e(decorator.getLocalId(), quantityStepperSelected);
            Modifier modifierD = androidx.compose.foundation.b.d(modifier4, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            int i19 = i14;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion4);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            int i20 = i13;
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            float f10 = 16;
            Modifier modifierH = J.h(D.i(modifier4, H1.h.p(f10)), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion2.l(), composerStartRestartGroup, 6);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyB, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            boolean isLoading = decorator.getIsLoading();
            String imageUrl = decorator.getImageUrl();
            ShopAndScanItemDecorator.b imageType = decorator.getImageType();
            int i21 = LocalThemeScope.f17314g;
            int i22 = i20 & 14;
            Modifier modifier5 = modifier4;
            b0.b(localThemeScope, null, isLoading, imageUrl, imageType, composerStartRestartGroup, i21 | i22, 1);
            Modifier modifierB = InterfaceC14888I.b(c14889j, modifier5, 2.0f, false, 2, null);
            String localId = decorator.getLocalId();
            AbstractC6392a primaryText = decorator.getPrimaryText();
            AbstractC6392a primarySupportingText = decorator.getPrimarySupportingText();
            AbstractC6392a topText = decorator.getTopText();
            AbstractC6392a bottomText = decorator.getBottomText();
            AbstractC6392a bottomSupportingText = decorator.getBottomSupportingText();
            boolean showSalePriceFormat = decorator.getShowSalePriceFormat();
            boolean isLoading2 = decorator.getIsLoading();
            boolean zK = decorator.k();
            ShopAndScanRestrictionDecorator restriction = decorator.getRestriction();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z12 = (i20 & 1879048192) == 536870912;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: fq.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.l(onSyncItem, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function12 = (Function1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z13 = (i19 & 14) == 4;
            Object objB2 = composerStartRestartGroup.B();
            if (z13 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: fq.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.m(onRemoveItem, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            int i23 = AbstractC6392a.f60445b;
            h.d(localThemeScope, modifierB, localId, topText, primaryText, primarySupportingText, bottomText, bottomSupportingText, showSalePriceFormat, isLoading2, zK, restriction, onUnfocusedQuantityStepper, function12, (Function1) objB2, composerStartRestartGroup, i21 | i22 | (i23 << 9) | (i23 << 12) | (i23 << 15) | (i23 << 18) | (i23 << 21), (i23 << 3) | ((i20 >> 9) & 896), 0);
            function0 = onUnfocusedQuantityStepper;
            composerStartRestartGroup.v();
            composerStartRestartGroup.startReplaceGroup(1236889643);
            if (decorator.getRestriction() == null || decorator.getRestriction().getIsDismissed()) {
                shopAndScanItemDecorator = decorator;
                companion = companion4;
                i15 = i21;
                z10 = true;
                r13 = 0;
            } else {
                companion = companion4;
                Modifier modifierM = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f10), 2, null);
                r13 = 0;
                MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
                int iA4 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A4);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA4 = D1.a(composerStartRestartGroup);
                D1.c(composerA4, measurePolicyG2, companion3.e());
                D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                shopAndScanItemDecorator = decorator;
                z10 = true;
                i15 = i21;
                Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(-1432023313, true, new a(shopAndScanItemDecorator, localThemeScope, onDismissRestriction), composerStartRestartGroup, 54), composerStartRestartGroup, i15 | 384 | i22 | (a1.f142016b << 3));
                composerStartRestartGroup.v();
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1236923521);
            if (shopAndScanItemDecorator.getCoupon() != null) {
                Modifier modifierI = D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp());
                ShopAndScanCouponDecorator coupon = shopAndScanItemDecorator.getCoupon();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD = ((i20 & 29360128) == 8388608 ? z10 : r13) | composerStartRestartGroup.D(shopAndScanItemDecorator);
                Object objB3 = composerStartRestartGroup.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: fq.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w.n(onCouponAction, shopAndScanItemDecorator);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                composerStartRestartGroup.P();
                I.c(localThemeScope, modifierI, coupon, (Function0) objB3, composerStartRestartGroup, i15 | i22 | (i23 << 6), 0);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            composerStartRestartGroup.startReplaceGroup(-564864909);
            if (zE) {
                i16 = i15;
                z11 = z10;
                i17 = i20;
                Modifier modifierH2 = c5806j.h(androidx.compose.foundation.b.d(companion, C5489q0.q(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null));
                float f11 = 15;
                C5804h.a(D.m(modifierH2, 0.0f, H1.h.p(f11), H1.h.p(f11), 0.0f, 9, null), composerStartRestartGroup, r13);
            } else {
                z11 = z10;
                i16 = i15;
                i17 = i20;
            }
            composerStartRestartGroup.P();
            boolean isLoading3 = shopAndScanItemDecorator.getIsLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z14 = (57344 & i17) == 16384 ? z11 : r13;
            Object objB4 = composerStartRestartGroup.B();
            if (z14 || objB4 == Composer.INSTANCE.a()) {
                onFocusedQuantityStepper = function1;
                objB4 = new Function1() { // from class: fq.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.i(onFocusedQuantityStepper, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB4);
            } else {
                onFocusedQuantityStepper = function1;
            }
            Function1 function13 = (Function1) objB4;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z15 = (458752 & i17) == 131072 ? z11 : r13;
            Object objB5 = composerStartRestartGroup.B();
            if (z15 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function0() { // from class: fq.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.j(function0);
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            Function0 function02 = (Function0) objB5;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z16 = (234881024 & i17) == 67108864 ? z11 : r13;
            Object objB6 = composerStartRestartGroup.B();
            if (z16 || objB6 == Composer.INSTANCE.a()) {
                function2 = onUpdateItemQuantity;
                objB6 = new Function2() { // from class: fq.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w.k(function2, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composerStartRestartGroup.t(objB6);
            } else {
                function2 = onUpdateItemQuantity;
            }
            composerStartRestartGroup.P();
            m.e(localThemeScope, modifier5, shopAndScanItemDecorator, isLoading3, zE, function13, function02, (Function2) objB6, composerStartRestartGroup, i16 | i22 | (i17 & 112) | (i17 & 896));
            composer2 = composerStartRestartGroup;
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier5;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            final Function1<? super String, Unit> function14 = onFocusedQuantityStepper;
            final Function2<? super String, ? super Integer, Unit> function22 = function2;
            final Function0<Unit> function03 = function0;
            t0L.a(new Function2() { // from class: fq.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.o(localThemeScope, modifier3, decorator, quantityStepperSelected, function14, function03, onDismissRestriction, onCouponAction, function22, onSyncItem, onRemoveItem, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, String itemId) {
        Intrinsics.j(itemId, "itemId");
        function1.invoke(itemId);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function2 function2, String id2, int i10) {
        Intrinsics.j(id2, "id");
        function2.invoke(id2, Integer.valueOf(i10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, String itemId) {
        Intrinsics.j(itemId, "itemId");
        function1.invoke(itemId);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, String itemId) {
        Intrinsics.j(itemId, "itemId");
        function1.invoke(itemId);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanItemDecorator shopAndScanItemDecorator, String str, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function2 function22, Function1 function13, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        h(localThemeScope, modifier, shopAndScanItemDecorator, str, function1, function0, function12, function2, function22, function13, function14, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function2 function2, ShopAndScanItemDecorator shopAndScanItemDecorator) {
        function2.invoke(Long.valueOf(shopAndScanItemDecorator.getCoupon().getOfferId()), shopAndScanItemDecorator.getLocalId());
        return Unit.f143329a;
    }
}
