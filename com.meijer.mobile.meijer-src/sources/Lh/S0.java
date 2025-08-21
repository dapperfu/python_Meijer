package Lh;

import Gh.a;
import Ki.LocalThemeScope;
import P0.e;
import Vh.SubscriptionCardDecorator;
import Zh.SubscriptionEmptyOrErrorStateDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import ci.SubscriptionCardViewState;
import dk.C13698b;
import j$.time.LocalDate;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import p1.C16338g;
import wk.C17898a;
import yr.C18370z;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u000e\u001a'\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006!²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lci/a;", "subscriptionCardViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "n", "(LKi/M;Lci/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LVh/g;", "subscriptionCardDecorator", "l", "(LKi/M;LVh/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "buttonText", "q", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j$/time/LocalDate", "nextOrderDate", "deliveryWeek", "s", "(LKi/M;Lj$/time/LocalDate;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "h", "LZh/a;", "emptyOrErrorStateDecorator", "j", "(LKi/M;LZh/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class S0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18559a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionCardViewState f18560b;

        a(LocalThemeScope localThemeScope, SubscriptionCardViewState subscriptionCardViewState) {
            this.f18559a = localThemeScope;
            this.f18560b = subscriptionCardViewState;
        }

        public final void a(Composer composer, int i10) {
            AbstractC6392a abstractC6392aD;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1439469694, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.SubscriptionsCard.<anonymous> (SubscriptionsCard.kt:97)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f18559a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f18559a;
            SubscriptionCardViewState subscriptionCardViewState = this.f18560b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            SubscriptionEmptyOrErrorStateDecorator emptyOrErrorStateDecorator = subscriptionCardViewState.getEmptyOrErrorStateDecorator();
            if (emptyOrErrorStateDecorator == null || (abstractC6392aD = emptyOrErrorStateDecorator.getButtonText()) == null) {
                abstractC6392aD = AbstractC6392a.INSTANCE.d(C15410d.f148736B0, new Object[0]);
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            S0.q(localThemeScope, abstractC6392aD, modifierH, composer, i11 | 384 | (i12 << 3), 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (subscriptionCardViewState.getIsSubscriptionLoading()) {
                composer.startReplaceGroup(-481181991);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else if (subscriptionCardViewState.getSubscriptionCardDecorator() != null) {
                composer.startReplaceGroup(-481178849);
                S0.l(localThemeScope, subscriptionCardViewState.getSubscriptionCardDecorator(), null, composer, i11, 2);
                composer.P();
            } else {
                composer.startReplaceGroup(-481173313);
                S0.j(localThemeScope, subscriptionCardViewState.getEmptyOrErrorStateDecorator(), null, composer, i11 | (i12 << 3), 2);
                composer.P();
            }
            composer.v();
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f18562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalDate f18563c;

        b(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, LocalDate localDate) {
            this.f18561a = localThemeScope;
            this.f18562b = abstractC6392a;
            this.f18563c = localDate;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(809660233, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.SubscriptionsOrderDetailsCard.<anonymous> (SubscriptionsCard.kt:200)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), j0.x.f139749a), this.f18561a.getAdsSpacing().getFour().getDp(), this.f18561a.getAdsSpacing().getTwo().getDp());
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarD = c5800d.d();
            LocalThemeScope localThemeScope = this.f18561a;
            AbstractC6392a abstractC6392a = this.f18562b;
            LocalDate localDate = this.f18563c;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarD, companion2.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            Modifier modifierF = C18370z.f(companion, "subscription_order_details", null, 2, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA2, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            Modifier modifierF2 = C18370z.f(companion, "next_order_row", null, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierF2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            q1.Label label = new q1.Label(C18370z.f(companion, "next_order_title_text", null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            String strC = C16338g.c(C15410d.f148771a0, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            q1.Label label2 = new q1.Label(C18370z.f(companion, "next_order_value_text", null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            String str = localDate.format(C17898a.f167225a.p());
            Intrinsics.i(str, "format(...)");
            si.j.h(localThemeScope, label2, str, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, "delivery_detail_text", null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void h(final Ki.LocalThemeScope r29, Vh.SubscriptionCardDecorator r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.h(Ki.M, Vh.g, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, SubscriptionCardDecorator subscriptionCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, subscriptionCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r34, final Zh.SubscriptionEmptyOrErrorStateDecorator r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.j(Ki.M, Zh.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, subscriptionEmptyOrErrorStateDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r25, final Vh.SubscriptionCardDecorator r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.l(Ki.M, Vh.g, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, SubscriptionCardDecorator subscriptionCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, subscriptionCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r21, final ci.SubscriptionCardViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.n(Ki.M, ci.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Function1 function1) {
        if (z10) {
            function1.invoke(a.v.f12626a);
        } else {
            function1.invoke(a.g.f12609a);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, SubscriptionCardViewState subscriptionCardViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, subscriptionCardViewState, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ki.LocalThemeScope r30, final bk.AbstractC6392a r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.q(Ki.M, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, abstractC6392a, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void s(final Ki.LocalThemeScope r18, final j$.time.LocalDate r19, final bk.AbstractC6392a r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.S0.s(Ki.M, j$.time.LocalDate, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, LocalDate localDate, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, localDate, abstractC6392a, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
