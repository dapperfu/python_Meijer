package qo;

import F1.t;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
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
import co.ClippedReward;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Lco/e;", "clippedReward", "Landroidx/compose/ui/Modifier;", "modifier", "", "fromYourRewards", "Lkotlin/Function1;", "Lco/h;", "", "onNavigationRequest", "c", "(LKi/M;Lco/e;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qo.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16728c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClippedReward f158834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f158836c;

        a(ClippedReward clippedReward, LocalThemeScope localThemeScope, boolean z10) {
            this.f158834a = clippedReward;
            this.f158835b = localThemeScope;
            this.f158836c = z10;
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
            ClippedReward clippedReward = this.f158834a;
            LocalThemeScope localThemeScope = this.f158835b;
            boolean z10 = this.f158836c;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(clippedReward.getImageUrl()).p(ns.s.f153128h).j(ns.s.f153128h).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            float dp2 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp3 = localThemeScope.getAdsSpacing().getFive().getDp();
            Ki.E adsSpacing = localThemeScope.getAdsSpacing();
            C6484c.e(c15669hC, null, hVarA, T0.a.a(androidx.compose.foundation.layout.J.v(c5806j.g(androidx.compose.foundation.layout.D.m(companion, dp2, dp3, (z10 ? adsSpacing.getFour() : adsSpacing.getFive()).getDp(), 0.0f, 8, null), companion2.o()), localThemeScope.getAdsSpacing().getEleven().getDp()), ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), localThemeScope.getAdsSpacing().getThirteen().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.e(), companion2.k(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
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
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Ki.I three = localThemeScope.getAdsTypography().getValues().getThree();
            int i11 = z10 ? 2 : Integer.MAX_VALUE;
            t.Companion companion4 = F1.t.INSTANCE;
            q1.Label label = new q1.Label(T0.a.a(companion, ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, companion4.b(), false, i11, three, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            String name = clippedReward.getName();
            String str = name == null ? "" : name;
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, str, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(-1082677432);
            if (!z10) {
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            }
            composer.P();
            Ki.I two = localThemeScope.getAdsTypography().getBody().getTwo();
            q1.Label label2 = new q1.Label(T0.a.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), ClippedReward.h(clippedReward, null, 1, null) ? 0.3f : 1.0f), null, null, null, companion4.b(), false, z10 ? 1 : 2, two, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            String description = clippedReward.getDescription();
            si.j.h(localThemeScope, label2, description == null ? "" : description, null, composer, i12 | (i13 << 3), 4);
            Ki.E adsSpacing2 = localThemeScope.getAdsSpacing();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, (z10 ? adsSpacing2.getTwo() : adsSpacing2.getThree()).getDp()), composer, 0);
            composer.v();
            si.j.h(localThemeScope, new q1.Label(null, (ClippedReward.h(clippedReward, null, 1, null) || clippedReward.getDaysLeft() <= 7) ? localThemeScope.getAdsColors().getAdsColorBrandSecondary() : localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.d(ns.u.f153161Y, new Object[]{clippedReward.d()}, composer, 0), null, composer, i12 | (i13 << 3), 4);
            composer.v();
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(C.i.h.f17101d, null, null, null, 0.0f, null, c5806j.g(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 9, null), localThemeScope.getAdsSpacing().getSix().getDp()), companion2.n()), 62, null), null, null, composer, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
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
    public static final void c(final Ki.LocalThemeScope r20, final co.ClippedReward r21, androidx.compose.ui.Modifier r22, boolean r23, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16728c.c(Ki.M, co.e, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, ClippedReward clippedReward) {
        function1.invoke(new AbstractC6536h.OnClippedRewardCardClicked(clippedReward));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, ClippedReward clippedReward, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, clippedReward, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
