package Hl;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import ri.j;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJi/M;", "LHl/a;", "fulfillmentMode", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onClick", "b", "(LJi/M;LHl/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentBarDecorator f12751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f12752b;

        a(FulfillmentBarDecorator fulfillmentBarDecorator, LocalThemeScope localThemeScope) {
            this.f12751a = fulfillmentBarDecorator;
            this.f12752b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1400455555, i10, -1, "com.meijer.mobile.fulfillment.ux.FulfillmentStatusCard.<anonymous> (FulfillmentStatusCard.kt:51)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion2, 0.0f, 1, null);
            FulfillmentBarDecorator fulfillmentBarDecorator = this.f12751a;
            LocalThemeScope localThemeScope = this.f12752b;
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyB = G.b(c5658d.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            float f10 = 16;
            C13457y.a(C16190d.c(fulfillmentBarDecorator.e(), composer, 0), null, D.i(companion2, H1.h.p(f10)), null, null, 0.0f, null, composer, 432, BinsView.TOTE_HEIGHT_DP);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null);
            AbstractC5607a abstractC5607aD = fulfillmentBarDecorator.d();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(abstractC5607aD, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            AbstractC5607a abstractC5607aB = fulfillmentBarDecorator.b();
            composer.startReplaceGroup(595255100);
            if (abstractC5607aB != null) {
                j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(abstractC5607aB, composer, i11), null, composer, i12 | (i13 << 3), 4);
            }
            composer.P();
            composer.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion2, 1.0f, false, 2, null), composer, 0);
            C17988z0.a(C16190d.c(C.f.i.f15513e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C16193g.c(h.f12779a, composer, 0), D.i(companion2, H1.h.p(f10)), 0L, composer, 384, 8);
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
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r18, final Hl.FulfillmentBarDecorator r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hl.g.b(Ji.M, Hl.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, FulfillmentBarDecorator fulfillmentBarDecorator, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, fulfillmentBarDecorator, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
