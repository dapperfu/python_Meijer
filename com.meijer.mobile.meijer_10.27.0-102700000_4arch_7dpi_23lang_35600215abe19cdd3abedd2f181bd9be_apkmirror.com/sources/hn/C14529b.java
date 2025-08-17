package hn;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.T1;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lak/a;", "amount", "balance", "", "isEbtTransactionListAvailable", "Lkotlin/Function0;", "", "onViewDetailsClick", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lak/a;Lak/a;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14529b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.b$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135880b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.b$a$a, reason: collision with other inner class name */
        static final class C2152a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135881a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f135882b;

            C2152a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f135881a = localThemeScope;
                this.f135882b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1769944901, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.EBTCardPaymentSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EBTCardPaymentSection.kt:82)");
                }
                ri.j.h(this.f135881a, this.f135882b.getLabels().getEnabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f99738Oh, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f135879a = localThemeScope;
            this.f135880b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(633735704, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.EBTCardPaymentSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EBTCardPaymentSection.kt:73)");
            }
            E0.b(this.f135879a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.c(0.0f, H1.h.p(0), 1, null), androidx.compose.foundation.layout.J.r(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, H1.h.p(24), 0.0f, 0.0f, 13, null), false, null, 831, null), this.f135880b, ComposableLambdaKt.c(1769944901, true, new C2152a(this.f135879a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final Modifier modifier, final AbstractC5607a abstractC5607a, final AbstractC5607a abstractC5607a2, final boolean z10, final Function0<Unit> onViewDetailsClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onViewDetailsClick, "onViewDetailsClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1580621796);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC5607a) : composerStartRestartGroup.D(abstractC5607a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(abstractC5607a2) : composerStartRestartGroup.D(abstractC5607a2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onViewDetailsClick) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1580621796, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.EBTCardPaymentSection (EBTCardPaymentSection.kt:45)");
            }
            StringBuilder sb2 = new StringBuilder();
            C.g.f fVar = C.g.f.f15532e;
            sb2.append(T1.a(fVar));
            sb2.append(' ');
            sb2.append(C16193g.c(com.meijer.mobile.meijer.Y.f99576G7, composerStartRestartGroup, 0));
            String string = sb2.toString();
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion.k(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            Function0<InterfaceC5811g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA, companion2.e());
            D1.c(composerA2, interfaceC5742sR2, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(fVar, string, null, null, 0.0f, null, null, 124, null);
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            C16307b.b(localThemeScope, drawableIcon, null, null, composerStartRestartGroup, i13 | i14 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composerStartRestartGroup.v();
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion.k(), composerStartRestartGroup, 0);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion3);
            Function0<InterfaceC5811g> function0A3 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyA2, companion2.e());
            D1.c(composerA3, interfaceC5742sR3, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion2.f());
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.e(), companion.l(), composerStartRestartGroup, 6);
            int iA4 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5811g> function0A4 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = D1.a(composerStartRestartGroup);
            D1.c(composerA4, measurePolicyB2, companion2.e());
            D1.c(composerA4, interfaceC5742sR4, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion2.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion2.f());
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 382, null);
            int i15 = AbstractC5607a.f45514b;
            String strA = C6408b.a(abstractC5607a, composerStartRestartGroup, i15 | ((i12 >> 6) & 14));
            int i16 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composerStartRestartGroup, i13 | i14 | (i16 << 3), 4);
            composerStartRestartGroup.startReplaceGroup(-1081616325);
            if (z10) {
                Ji.Q.e(localThemeScope, InterfaceC14971y.a.c.f140290a, ComposableLambdaKt.c(633735704, true, new a(localThemeScope, onViewDetailsClick), composerStartRestartGroup, 54), composerStartRestartGroup, i13 | 384 | i14 | (InterfaceC14971y.a.c.f140291b << 3));
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C16193g.c(com.meijer.mobile.meijer.Y.f100252p4, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i16 << 3) | i13 | i14, 4);
            ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 382, null), C6408b.a(abstractC5607a2, composerStartRestartGroup, i15 | ((i12 >> 9) & 14)), null, composerStartRestartGroup, i13 | i14 | (i16 << 3), 4);
            C17917Z.a(androidx.compose.foundation.layout.D.k(companion3, 0.0f, H1.h.p(4), 1, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 390, 8);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14529b.c(localThemeScope, modifier, abstractC5607a, abstractC5607a2, z10, onViewDetailsClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, abstractC5607a, abstractC5607a2, z10, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
