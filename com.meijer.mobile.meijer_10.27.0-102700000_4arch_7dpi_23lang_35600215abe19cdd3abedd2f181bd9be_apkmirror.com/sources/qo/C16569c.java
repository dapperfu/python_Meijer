package qo;

import F1.t;
import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import bo.ClippedReward;
import bo.g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14802K;
import j0.C14815g;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Lbo/d;", "clippedReward", "Landroidx/compose/ui/Modifier;", "modifier", "", "fromYourRewards", "Lkotlin/Function1;", "Lbo/g;", "", "onNavigationRequest", "c", "(LJi/M;Lbo/d;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qo.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16569c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClippedReward f157397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f157398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f157399c;

        a(ClippedReward clippedReward, LocalThemeScope localThemeScope, boolean z10) {
            this.f157397a = clippedReward;
            this.f157398b = localThemeScope;
            this.f157399c = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1616464235, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ClippedRewardCard.<anonymous> (ClippedRewardCard.kt:78)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            ClippedReward clippedReward = this.f157397a;
            LocalThemeScope localThemeScope = this.f157398b;
            boolean z10 = this.f157399c;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C15372h c15372hC = new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(clippedReward.getImageUrl()).p(ns.s.f152676h).j(ns.s.f152676h).c();
            Z4.h hVarA = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            float dp2 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp3 = localThemeScope.getAdsSpacing().getFive().getDp();
            Ji.E adsSpacing = localThemeScope.getAdsSpacing();
            C6197c.e(c15372hC, null, hVarA, T0.a.a(androidx.compose.foundation.layout.J.v(c5664j.g(androidx.compose.foundation.layout.D.m(companion, dp2, dp3, (z10 ? adsSpacing.getFour() : adsSpacing.getFive()).getDp(), 0.0f, 8, null), companion2.o()), localThemeScope.getAdsSpacing().getEleven().getDp()), ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), localThemeScope.getAdsSpacing().getThirteen().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.e(), companion2.k(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Ji.I three = localThemeScope.getAdsTypography().getValues().getThree();
            int i11 = z10 ? 2 : Integer.MAX_VALUE;
            t.Companion companion4 = F1.t.INSTANCE;
            q1.Label label = new q1.Label(T0.a.a(companion, ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, companion4.b(), false, i11, three, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            String name = clippedReward.getName();
            String str = name == null ? "" : name;
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(-1082677432);
            if (!z10) {
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            }
            composer.P();
            Ji.I two = localThemeScope.getAdsTypography().getBody().getTwo();
            q1.Label label2 = new q1.Label(T0.a.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, companion4.b(), false, z10 ? 1 : 2, two, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            String description = clippedReward.getDescription();
            ri.j.h(localThemeScope, label2, description == null ? "" : description, null, composer, i12 | (i13 << 3), 4);
            Ji.E adsSpacing2 = localThemeScope.getAdsSpacing();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, (z10 ? adsSpacing2.getTwo() : adsSpacing2.getThree()).getDp()), composer, 0);
            composer.v();
            ri.j.h(localThemeScope, new q1.Label(null, (ClippedReward.h(clippedReward, null, 1, null) || clippedReward.getDaysLeft() <= 7) ? localThemeScope.getAdsColors().getAdsColorBrandSecondary() : localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C16193g.d(ns.u.f152709Y, new Object[]{clippedReward.d()}, composer, 0), null, composer, i12 | (i13 << 3), 4);
            composer.v();
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.i.h.f15557d, null, null, null, 0.0f, null, c5664j.g(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 9, null), localThemeScope.getAdsSpacing().getSix().getDp()), companion2.n()), 62, null), null, null, composer, i12 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r20, final bo.ClippedReward r21, androidx.compose.ui.Modifier r22, boolean r23, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16569c.c(Ji.M, bo.d, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, ClippedReward clippedReward) {
        function1.invoke(new g.OnClippedRewardCardClicked(clippedReward));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, ClippedReward clippedReward, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, clippedReward, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
