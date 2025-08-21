package com.meijer.mobile.mperks.ux.claim.autoClaim;

import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.AutoClaimReward;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.j0;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a_\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0016\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001c²\u0006\u000e\u0010\u0018\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lco/a;", "autoClaimReward", "", "isAtLeastOneRewardEnrolled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lco/i;", "", "onResourceAction", "Lco/h;", "onNavigationRequest", "o", "(LKi/M;Lco/a;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showConfirmingSwitchButtons", "isFromAutoClaimDetail", "onAutoClaimDetailSwitchButtonsClick", "i", "(LKi/M;Lco/a;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "resId", "r", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rewardPoints", "", "lastAction", "enrolled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoClaimReward f114901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f114902c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6537i, Unit> f114903d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AutoClaimReward autoClaimReward, boolean z10, Function1<? super AbstractC6537i, Unit> function1) {
            this.f114900a = localThemeScope;
            this.f114901b = autoClaimReward;
            this.f114902c = z10;
            this.f114903d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1274173720, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimCard.<anonymous> (AutoClaimCard.kt:95)");
            }
            i.i(this.f114900a, this.f114901b, this.f114902c, false, false, null, this.f114903d, composer, LocalThemeScope.f17314g | 24576, 20);
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
        final /* synthetic */ LocalThemeScope f114904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoClaimReward f114905b;

        b(LocalThemeScope localThemeScope, AutoClaimReward autoClaimReward) {
            this.f114904a = localThemeScope;
            this.f114905b = autoClaimReward;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            LocalThemeScope localThemeScope;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1682197335, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimCard.<anonymous> (AutoClaimCard.kt:103)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.c cVarI = companion2.i();
            LocalThemeScope localThemeScope2 = this.f114904a;
            AutoClaimReward autoClaimReward = this.f114905b;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
            Modifier modifierB = InterfaceC14888I.b(C14889J.f139620a, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(-1001090883);
            if (autoClaimReward.getIsSelected()) {
                Modifier modifierC = androidx.compose.foundation.b.c(companion, localThemeScope2.getAdsColors().getAdsColorSupportSuccess().getColor(), C16806i.c(localThemeScope2.getAdsCornerRadii().getRadius02().getDp()));
                MeasurePolicy measurePolicyB2 = G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierC);
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
                D1.c(composerA3, measurePolicyB2, companion3.e());
                D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                i11 = 0;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(D.k(companion, localThemeScope2.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), localThemeScope2.getAdsColors().getAdsColorUIBackground01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 380, null), C16338g.c(j0.f115163i, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer.v();
            } else {
                i11 = 0;
                localThemeScope = localThemeScope2;
            }
            composer.P();
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, i11);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 383, null);
            composer.startReplaceGroup(-1001054292);
            String strC = autoClaimReward.getIsShowSwitchButtons() ? C16338g.c(j0.f115130Z1, composer, i11) : autoClaimReward.getTitle();
            composer.P();
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i12 | (i13 << 3), 4);
            int i14 = i11;
            q1.Label label2 = new q1.Label(D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null);
            composer.startReplaceGroup(-1001036840);
            String strC2 = autoClaimReward.getIsShowSwitchButtons() ? C16338g.c(j0.f115127Y1, composer, i14) : autoClaimReward.getDescription();
            composer.P();
            si.j.h(localThemeScope, label2, strC2, null, composer, i12 | (i13 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(D.m(J.h(companion, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 380, null), C16338g.c(j0.f115178l2, composer, i14), null, composer, i12 | (i13 << 3), 4);
            composer.v();
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, i14);
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(autoClaimReward.getIsShowSwitchButtons() ? Integer.valueOf(g0.f114998G) : autoClaimReward.getImageURL()).p(ns.s.f153128h).j(ns.s.f153128h).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), J.v(D.m(companion, localThemeScope.getAdsSpacing().getFour().getDp(), 0.0f, 0.0f, 0.0f, 14, null), H1.h.p(80)), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
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
    static final class c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f114906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114907b;

        c(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f114906a = modifier;
            this.f114907b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1711926036, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimLoading.<anonymous>.<anonymous> (AutoClaimCard.kt:364)");
            }
            q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.f(this.f114907b, J.F(this.f114906a, null, false, 3, null), smallLoading, oVar, null, false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 56);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(boolean z10, AutoClaimReward autoClaimReward, boolean z11, Function1 function1, Function1 function12) {
        if (z10 && !autoClaimReward.getIsSelected()) {
            if (z11) {
                function1.invoke(Boolean.TRUE);
            } else {
                function12.invoke(new AbstractC6537i.OnConfirmingSwitchClick(true, autoClaimReward));
            }
            function12.invoke(new AbstractC6537i.TrackAutoClaimAction("mPerks:Activate Different Auto Claim", autoClaimReward));
        } else if (autoClaimReward.getIsSelected()) {
            function12.invoke(new AbstractC6537i.AutoClaimEnroll(false, autoClaimReward.getAutoClaimType(), Double.valueOf(autoClaimReward.getAutoClaimAmount())));
            function12.invoke(new AbstractC6537i.TrackAutoClaimAction("mPerks:Remove Auto Claim", autoClaimReward));
        } else {
            if (z11) {
                function1.invoke(Boolean.FALSE);
            } else {
                function12.invoke(new AbstractC6537i.OnConfirmingSwitchClick(false, autoClaimReward));
            }
            function12.invoke(new AbstractC6537i.AutoClaimEnroll(true, autoClaimReward.getAutoClaimType(), Double.valueOf(autoClaimReward.getAutoClaimAmount())));
            function12.invoke(new AbstractC6537i.TrackAutoClaimAction("mPerks:Activate Auto Claim", autoClaimReward));
        }
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r24, final co.AutoClaimReward r25, final boolean r26, boolean r27, final boolean r28, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r29, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.i.i(Ki.M, co.a, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, AutoClaimReward autoClaimReward, boolean z10, boolean z11, boolean z12, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, autoClaimReward, z10, z11, z12, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z10) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, AutoClaimReward autoClaimReward, boolean z10, Function1 function12) {
        function1.invoke(new AbstractC6537i.AutoClaimEnroll(true, autoClaimReward.getAutoClaimType(), Double.valueOf(autoClaimReward.getAutoClaimAmount())));
        if (z10) {
            function12.invoke(Boolean.FALSE);
        } else {
            function1.invoke(new AbstractC6537i.OnConfirmingSwitchClick(false, autoClaimReward));
        }
        function1.invoke(new AbstractC6537i.TrackAutoClaimAction("mPerks:Switch Auto Claim", autoClaimReward));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function1 function1, Function1 function12, AutoClaimReward autoClaimReward) {
        if (z10) {
            function1.invoke(Boolean.FALSE);
        } else {
            function12.invoke(new AbstractC6537i.OnConfirmingSwitchClick(false, autoClaimReward));
        }
        function12.invoke(new AbstractC6537i.TrackAutoClaimAction("mPerks:Cancel Switch Auto Claim", autoClaimReward));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r25, final co.AutoClaimReward r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r29, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.i.o(Ki.M, co.a, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, AutoClaimReward autoClaimReward) {
        function1.invoke(new AbstractC6536h.OnAutoClaimRewardCardClicked(autoClaimReward));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, AutoClaimReward autoClaimReward, boolean z10, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, autoClaimReward, z10, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(final Ki.LocalThemeScope r29, final int r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.i.r(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        r(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
