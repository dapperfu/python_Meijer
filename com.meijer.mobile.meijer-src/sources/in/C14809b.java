package in;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
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
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.T1;
import dk.C13698b;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "amount", "balance", "", "isEbtTransactionListAvailable", "Lkotlin/Function0;", "", "onViewDetailsClick", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lbk/a;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14809b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.b$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138519a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138520b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.b$a$a, reason: collision with other inner class name */
        static final class C2195a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138521a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f138522b;

            C2195a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f138521a = localThemeScope;
                this.f138522b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1769944901, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.EBTCardPaymentSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EBTCardPaymentSection.kt:82)");
                }
                si.j.h(this.f138521a, this.f138522b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f100695Th, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138519a = localThemeScope;
            this.f138520b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(633735704, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.EBTCardPaymentSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EBTCardPaymentSection.kt:73)");
            }
            E0.b(this.f138519a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.c(0.0f, H1.h.p(0), 1, null), androidx.compose.foundation.layout.J.r(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, H1.h.p(24), 0.0f, 0.0f, 13, null), false, null, 831, null), this.f138520b, ComposableLambdaKt.c(1769944901, true, new C2195a(this.f138519a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final Modifier modifier, final AbstractC6392a abstractC6392a, final AbstractC6392a abstractC6392a2, final boolean z10, final Function0<Unit> onViewDetailsClick, Composer composer, final int i10) {
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
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(abstractC6392a2) : composerStartRestartGroup.D(abstractC6392a2) ? RecyclerView.m.FLAG_MOVED : 1024;
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
            C.g.f fVar = C.g.f.f17076e;
            sb2.append(T1.a(fVar));
            sb2.append(' ');
            sb2.append(C16338g.c(com.meijer.mobile.meijer.Y.f100495J7, composerStartRestartGroup, 0));
            String string = sb2.toString();
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
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
            D1.c(composerA2, measurePolicyA, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(fVar, string, null, null, 0.0f, null, null, 124, null);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            C16671b.b(localThemeScope, drawableIcon, null, null, composerStartRestartGroup, i13 | i14 | (q1.h.DrawableIcon.f142322h << 3), 6);
            composerStartRestartGroup.v();
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion.k(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion3);
            Function0<InterfaceC5953g> function0A3 = companion2.a();
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
            D1.c(composerA3, measurePolicyA2, companion2.e());
            D1.c(composerA3, interfaceC5884sR3, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion2.f());
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion.l(), composerStartRestartGroup, 6);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A4 = companion2.a();
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
            D1.c(composerA4, measurePolicyB2, companion2.e());
            D1.c(composerA4, interfaceC5884sR4, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion2.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion2.f());
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 382, null);
            int i15 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392a, composerStartRestartGroup, i15 | ((i12 >> 6) & 14));
            int i16 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composerStartRestartGroup, i13 | i14 | (i16 << 3), 4);
            composerStartRestartGroup.startReplaceGroup(-1081616325);
            if (z10) {
                Ki.Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(633735704, true, new a(localThemeScope, onViewDetailsClick), composerStartRestartGroup, 54), composerStartRestartGroup, i13 | 384 | i14 | (InterfaceC15205y.a.c.f142546b << 3));
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f101114p4, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i16 << 3) | i13 | i14, 4);
            si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(companion3), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 382, null), C13698b.a(abstractC6392a2, composerStartRestartGroup, i15 | ((i12 >> 9) & 14)), null, composerStartRestartGroup, i13 | i14 | (i16 << 3), 4);
            C17983Z.a(androidx.compose.foundation.layout.D.k(companion3, 0.0f, H1.h.p(4), 1, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 390, 8);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14809b.c(localThemeScope, modifier, abstractC6392a, abstractC6392a2, z10, onViewDetailsClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, modifier, abstractC6392a, abstractC6392a2, z10, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
