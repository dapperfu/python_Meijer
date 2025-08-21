package os;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Wl.HomeMperksClippedReward;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
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
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.List;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\r\u001a\u00020\t*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LKi/M;", "", "LWl/c;", "rewards", "", "isShowViewYourRewards", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "onYourRewardCardClicked", "Lkotlin/Function0;", "onViewAllRewardsClicked", "d", "(LKi/M;Ljava/util/List;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "reward", "f", "(LKi/M;LWl/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: os.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16307p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.p$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeMperksClippedReward f155792b;

        a(LocalThemeScope localThemeScope, HomeMperksClippedReward homeMperksClippedReward) {
            this.f155791a = localThemeScope;
            this.f155792b = homeMperksClippedReward;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(636654582, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.YourRewardCardItem.<anonymous> (HomeMperksYourRewards.kt:118)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion2, this.f155791a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), this.f155791a.getAdsSpacing().getFive().getDp(), this.f155791a.getAdsSpacing().getThree().getDp(), this.f155791a.getAdsSpacing().getFour().getDp(), this.f155791a.getAdsSpacing().getThree().getDp());
            HomeMperksClippedReward homeMperksClippedReward = this.f155792b;
            LocalThemeScope localThemeScope = this.f155791a;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
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
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(homeMperksClippedReward.getImageUrl()).p(ns.s.f153128h).j(ns.s.f153128h).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(companion2, localThemeScope.getAdsSpacing().getEleven().getDp()), null, null, companion.e(), InterfaceC5926k.INSTANCE.d(), 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
            Modifier modifierB = InterfaceC14888I.b(c14889j, androidx.compose.foundation.layout.D.m(companion2, localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getTwo().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 8, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composer, 0);
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
            q1.Label label = new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getValues().getThree(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null);
            String name = homeMperksClippedReward.getName();
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, name, null, composer, i11 | (i12 << 3), 4);
            si.j.h(localThemeScope, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, (HomeMperksClippedReward.g(homeMperksClippedReward, null, 1, null) || homeMperksClippedReward.getDaysLeft() <= 7) ? localThemeScope.getAdsTypography().getHeadings().getNine() : localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), null, (HomeMperksClippedReward.g(homeMperksClippedReward, null, 1, null) || homeMperksClippedReward.getDaysLeft() <= 7) ? localThemeScope.getAdsColors().getAdsColorBrandSecondary() : localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, null, null, 509, null), C16338g.d(ns.u.f153161Y, new Object[]{homeMperksClippedReward.e()}, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(C.i.h.f17101d, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0291 A[LOOP:0: B:109:0x028b->B:111:0x0291, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r27, final java.util.List<Wl.HomeMperksClippedReward> r28, final boolean r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function1<? super Wl.HomeMperksClippedReward, kotlin.Unit> r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16307p.d(Ki.M, java.util.List, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, List list, boolean z10, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, list, z10, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void f(final Ki.LocalThemeScope r21, final Wl.HomeMperksClippedReward r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Wl.HomeMperksClippedReward, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16307p.f(Ki.M, Wl.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, HomeMperksClippedReward homeMperksClippedReward, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, homeMperksClippedReward, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, HomeMperksClippedReward homeMperksClippedReward) {
        function1.invoke(homeMperksClippedReward);
        return Unit.f143329a;
    }
}
