package Mm;

import Ji.LocalThemeScope;
import Lm.a;
import P0.e;
import Rm.g;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
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
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import j0.C14801J;
import j0.InterfaceC14800I;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;
import zp.CustomerSavings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LRm/g$d;", "viewState", "Lkotlin/Function1;", "LLm/a;", "", "onAction", "f", "(LJi/M;Landroidx/compose/ui/Modifier;LRm/g$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.ViewState f19767b;

        a(LocalThemeScope localThemeScope, g.ViewState dVar) {
            this.f19766a = localThemeScope;
            this.f19767b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1119494860, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.DigitalReceiptsAuthScreen.<anonymous>.<anonymous> (DigitalReceiptsAuthScreen.kt:87)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = D.m(companion, 0.0f, 0.0f, this.f19766a.getAdsSpacing().getThree().getDp(), 0.0f, 11, null);
            LocalThemeScope localThemeScope = this.f19766a;
            g.ViewState dVar = this.f19767b;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierV = J.v(companion, H1.h.p(60));
            List<ChartData> listC = dVar.c();
            CustomerSavings customerSavingsG = dVar.getSavingsDetails();
            double savingsTotal = customerSavingsG != null ? customerSavingsG.getSavingsTotal() : 0.0d;
            int i11 = LocalThemeScope.f15770g;
            A.d(localThemeScope, modifierV, listC, savingsTotal, composer, i11 | 48, 0);
            q1.Label label = new q1.Label(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
            composer.startReplaceGroup(-1187647245);
            CustomerSavings customerSavingsG2 = dVar.getSavingsDetails();
            String strA = C6408b.a((customerSavingsG2 != null ? customerSavingsG2.getSavingsSinceDate() : null) == null ? AbstractC5607a.INSTANCE.a() : AbstractC5607a.INSTANCE.d(Y.f99924Yd, dVar.getSavingsDetails().getSavingsSinceDate().format(C17590a.f164803a.h())), composer, AbstractC5607a.f45514b);
            composer.P();
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i11 | (i12 << 3), 4);
            q1.Label label2 = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorSupportSuccess(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            CustomerSavings customerSavingsG3 = dVar.getSavingsDetails();
            String strC = customerSavingsG3 != null ? Fk.g.c(customerSavingsG3.getSavingsTotal()) : null;
            if (strC == null) {
                strC = "";
            }
            ri.j.h(localThemeScope, label2, strC, null, composer, i11 | (i12 << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final Rm.g.ViewState r46, final kotlin.jvm.functions.Function1<? super Lm.a, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.f.f(Ji.M, androidx.compose.ui.Modifier, Rm.g$d, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, final g.ViewState dVar) {
        function1.invoke(new a.DisplaySavingsDetails(dVar.getSavingsDetails(), C14480g.a(C14476c.a("event: click annual savings"), new Function1() { // from class: Mm.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.h(dVar, (TrackingData) obj);
            }
        })));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(g.ViewState dVar, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("receipts and savings");
        TrackingData.v("receipt and savings");
        CustomerSavings customerSavingsG = dVar.getSavingsDetails();
        TrackingData.h("savings", String.valueOf(customerSavingsG != null ? Double.valueOf(customerSavingsG.getSavingsTotal()) : null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(new a.AddTransaction(C14480g.a(C14476c.a("event: receipts and savings: enter receipt information"), new Function1() { // from class: Mm.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.j((TrackingData) obj);
            }
        })));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("mperks: receipts and savings");
        TrackingData.v("mperks");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, g.ViewState dVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, dVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
