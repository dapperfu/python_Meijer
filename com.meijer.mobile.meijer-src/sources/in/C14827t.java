package in;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.k;
import L1.n;
import L1.x;
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
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import as.C6293f;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.substitution.C12658d;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import es.OrderDetailStatusDecorator;
import es.OrderSubstitutionsDetailBannerDecorator;
import in.C14827t;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;
import sn.L;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a}\u0010\u0010\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Les/d;", "decorator", "Les/J;", "orderSubstitutionDetailBanner", "Lkotlin/Function0;", "", "navigateMPerksDashboard", "onClickOnMyWay", "onClickImHere", "onClickParkingSpot", "onClickSubstitutionBanner", "Lsn/L$h;", "viewState", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Les/d;Les/J;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lsn/L$h;Landroidx/compose/runtime/Composer;II)V", "c", "(LKi/M;Les/d;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14827t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f138709f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f138709f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f138709f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.t$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f138710f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f138711g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f138712h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDecorator f138713i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138714j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f138715k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, OrderDetailStatusDecorator orderDetailStatusDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f138711g = nVar;
            this.f138712h = function0;
            this.f138713i = orderDetailStatusDecorator;
            this.f138714j = localThemeScope;
            this.f138715k = function02;
            this.f138710f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            L1.h hVar;
            k.VerticalAnchor verticalAnchor;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f138711g.getHelpersHashCode();
            this.f138711g.i();
            L1.n nVar = this.f138711g;
            composer.startReplaceGroup(-979438559);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            L1.h hVarH = bVarM.h();
            L1.h hVarI = bVarM.i();
            L1.h hVarJ = bVarM.j();
            L1.h hVarB = bVarM.b();
            k.VerticalAnchor verticalAnchorC = nVar.c(0.4f);
            Z0.c cVarC = C16335d.c(com.meijer.mobile.meijer.S.f99548G, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f138716a;
                composer.t(objB);
            }
            composer.P();
            C13590y.a(cVarC, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(nVar.k(companion, hVarA, (Function1) objB), H1.h.p(11), 0.0f, 2, null), 0.0f, 1, null), null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Z0.c cVarC2 = C16335d.c(com.meijer.mobile.meijer.S.f99543B, composer, 0);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100534L8, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = f.f138723a;
                composer.t(objB2);
            }
            composer.P();
            C13590y.a(cVarC2, strC, nVar.k(companion, hVarC, (Function1) objB2), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            if (this.f138713i.getDisplayMperksPoints()) {
                composer.startReplaceGroup(-978333162);
                Z0.c cVarC3 = C16335d.c(com.meijer.mobile.meijer.S.f99555N, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarA);
                Object objB3 = composer.B();
                if (zV || objB3 == companion2.a()) {
                    objB3 = new g(hVarA);
                    composer.t(objB3);
                }
                composer.P();
                C13590y.a(cVarC3, null, P0.o.a(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarE, (Function1) objB3), H1.h.p(32), H1.h.p(14), 0.0f, 0.0f, 12, null), 1.0f), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                LocalThemeScope localThemeScope = this.f138714j;
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.V(hVarE);
                Object objB4 = composer.B();
                if (zV2 || objB4 == companion2.a()) {
                    objB4 = new h(hVarA, hVarE);
                    composer.t(objB4);
                }
                composer.P();
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB4), 0.0f, H1.h.p(25), 0.0f, 0.0f, 13, null), this.f138714j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138714j.getAdsTypography().getHeadings().getThree(), null, 380, null);
                String strA = C13698b.a(this.f138713i.getMperksPoints(), composer, AbstractC6392a.f60445b);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f138714j;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(5), 0.0f, H1.h.p(16), 0.0f, 10, null);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(hVarF);
                Object objB5 = composer.B();
                if (zV3 || objB5 == companion2.a()) {
                    objB5 = new i(hVarF);
                    composer.t(objB5);
                }
                composer.P();
                int i14 = i12 | (i13 << 3);
                i11 = 5004770;
                si.j.h(localThemeScope2, new q1.Label(P0.o.a(nVar.k(modifierM, hVarH, (Function1) objB5), 2.0f), this.f138714j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138714j.getAdsTypography().getHeadings().getSeven(), null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100496J8, composer, 0), null, composer, i14, 4);
                composer.P();
                hVar = hVarH;
                verticalAnchor = verticalAnchorC;
            } else {
                i11 = 5004770;
                composer.startReplaceGroup(-976684458);
                Z0.c cVarC4 = C16335d.c(this.f138713i.getMperksItemResId(), composer, 0);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100477I8, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV4 = composer.V(verticalAnchorC);
                Object objB6 = composer.B();
                if (zV4 || objB6 == companion2.a()) {
                    objB6 = new j(verticalAnchorC);
                    composer.t(objB6);
                }
                composer.P();
                hVar = hVarH;
                verticalAnchor = verticalAnchorC;
                C13590y.a(cVarC4, strC2, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarD, (Function1) objB6), 0.0f, H1.h.p(9), H1.h.p(16), 0.0f, 9, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                composer.P();
            }
            Z0.c cVarC5 = C16335d.c(com.meijer.mobile.meijer.S.f99547F, composer, 0);
            float f10 = 23;
            Modifier modifierZ = androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), H1.h.p(f10));
            composer.startReplaceGroup(i11);
            boolean zV5 = composer.V(hVar);
            Object objB7 = composer.B();
            if (zV5 || objB7 == companion2.a()) {
                objB7 = new k(hVar);
                composer.t(objB7);
            }
            composer.P();
            C13590y.a(cVarC5, null, nVar.k(modifierZ, hVarG, (Function1) objB7), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope3 = this.f138714j;
            float f11 = 16;
            float f12 = 24;
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f11), H1.h.p(f11), H1.h.p(f12), 0.0f, 8, null);
            composer.startReplaceGroup(-1633490746);
            k.VerticalAnchor verticalAnchor2 = verticalAnchor;
            boolean zV6 = composer.V(hVarA) | composer.V(verticalAnchor2);
            Object objB8 = composer.B();
            if (zV6 || objB8 == companion2.a()) {
                objB8 = new l(hVarA, verticalAnchor2);
                composer.t(objB8);
            }
            composer.P();
            q1.Label label2 = new q1.Label(nVar.k(modifierM2, hVarI, (Function1) objB8), this.f138714j.getAdsColors().getAdsColorText01(), null, null, 0, false, 3, this.f138714j.getAdsTypography().getDetail().getOne(), null, 316, null);
            String strA2 = C13698b.a(this.f138713i.getMperksMessage(), composer, AbstractC6392a.f60445b);
            int i15 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope3, label2, strA2, null, composer, i15 | (q1.Label.f142335j << 3), 4);
            Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(8), 0.0f, 0.0f, H1.h.p(f12), 6, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV7 = composer.V(hVarI) | composer.V(verticalAnchor2);
            Object objB9 = composer.B();
            if (zV7 || objB9 == companion2.a()) {
                objB9 = new m(hVarI, verticalAnchor2);
                composer.t(objB9);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM3, hVarJ, (Function1) objB9);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            LocalThemeScope localThemeScope4 = this.f138714j;
            Ki.Q.e(localThemeScope4, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(568688004, true, new d(localThemeScope4, this.f138715k), composer, 54), composer, i15 | 384 | (InterfaceC15205y.a.c.f142546b << 3));
            composer.v();
            Z0.c cVarC6 = C16335d.c(com.meijer.mobile.meijer.S.f99553L, composer, 0);
            String strC3 = C16338g.c(com.meijer.mobile.meijer.Y.f100534L8, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objB10 = composer.B();
            if (objB10 == companion2.a()) {
                objB10 = e.f138722a;
                composer.t(objB10);
            }
            composer.P();
            C13590y.a(cVarC6, strC3, nVar.k(companion, hVarB, (Function1) objB10), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            composer.P();
            if (this.f138711g.getHelpersHashCode() != helpersHashCode) {
                this.f138712h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f138716a = new c();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.t$d */
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138718b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.t$d$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138719a;

            a(Function0<Unit> function0) {
                this.f138719a = function0;
            }

            public final void a() {
                this.f138719a.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.t$d$b */
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138720a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f138721b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f138720a = localThemeScope;
                this.f138721b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2093944311, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailMperksRewards.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:367)");
                }
                si.j.h(this.f138720a, q1.Label.y(this.f138721b.getLabels().getEnabledLabel(), null, this.f138720a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, this.f138720a.getAdsTypography().getBody().getTwo(), null, 381, null), C16338g.c(com.meijer.mobile.meijer.Y.f100515K8, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        d(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138717a = localThemeScope;
            this.f138718b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(568688004, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailMperksRewards.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:364)");
            }
            LocalThemeScope localThemeScope = this.f138717a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f138718b);
            Function0<Unit> function0 = this.f138718b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function0);
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2093944311, true, new b(this.f138717a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$e */
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f138722a = new e();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$f */
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f138723a = new f();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$g */
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138724a;

        g(L1.h hVar) {
            this.f138724a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f138724a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$h */
    static final class h implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f138726b;

        h(L1.h hVar, L1.h hVar2) {
            this.f138725a = hVar;
            this.f138726b = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f138725a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f138726b.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$i */
    static final class i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138727a;

        i(L1.h hVar) {
            this.f138727a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f138727a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f138727a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$j */
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f138728a;

        j(k.VerticalAnchor verticalAnchor) {
            this.f138728a = verticalAnchor;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f138728a, 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$k */
    static final class k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138729a;

        k(L1.h hVar) {
            this.f138729a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f138729a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f138729a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$l */
    static final class l implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138730a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f138731b;

        l(L1.h hVar, k.VerticalAnchor verticalAnchor) {
            this.f138730a = hVar;
            this.f138731b = verticalAnchor;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f138730a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f138731b, 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.t$m */
    static final class m implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f138732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f138733b;

        m(L1.h hVar, k.VerticalAnchor verticalAnchor) {
            this.f138732a = hVar;
            this.f138733b = verticalAnchor;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f138732a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f138733b, 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.t$n */
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f138734a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDecorator f138737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f138738e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L.OrderDetailsViewState f138739f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138740g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138741h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138742i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138743j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.t$n$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138744a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f138745b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138746c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.t$n$a$a, reason: collision with other inner class name */
            static final class C2201a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138747a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138748b;

                C2201a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f138747a = localThemeScope;
                    this.f138748b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-726410148, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:180)");
                    }
                    LocalThemeScope localThemeScope = this.f138747a;
                    q1.Label enabledLabel = this.f138748b.getLabels().getEnabledLabel();
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100745Wa, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, Function0<Unit> function0) {
                this.f138744a = localThemeScope;
                this.f138745b = interfaceC14888I;
                this.f138746c = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1761880849, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:172)");
                }
                E0.b(this.f138744a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f138745b, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), false, null, 895, null), this.f138746c, ComposableLambdaKt.c(-726410148, true, new C2201a(this.f138744a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.t$n$b */
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138749a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f138750b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138751c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.t$n$b$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138752a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138753b;

                a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f138752a = localThemeScope;
                    this.f138753b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1991347411, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:198)");
                    }
                    LocalThemeScope localThemeScope = this.f138752a;
                    q1.Label enabledLabel = this.f138753b.getLabels().getEnabledLabel();
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100726Va, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            b(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, Function0<Unit> function0) {
                this.f138749a = localThemeScope;
                this.f138750b = interfaceC14888I;
                this.f138751c = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-958550874, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:190)");
                }
                float f10 = 8;
                E0.b(this.f138749a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f138750b, Modifier.INSTANCE, 1.0f, false, 2, null), H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), false, null, 895, null), this.f138751c, ComposableLambdaKt.c(1991347411, true, new a(this.f138749a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.t$n$c */
        static final class c implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138754a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138755b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderDetailStatusDecorator f138756c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: in.t$n$c$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138757a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138758b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderDetailStatusDecorator f138759c;

                a(LocalThemeScope localThemeScope, j1 j1Var, OrderDetailStatusDecorator orderDetailStatusDecorator) {
                    this.f138757a = localThemeScope;
                    this.f138758b = j1Var;
                    this.f138759c = orderDetailStatusDecorator;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1109492488, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:218)");
                    }
                    LocalThemeScope localThemeScope = this.f138757a;
                    q1.Label enabledLabel = this.f138758b.getLabels().getEnabledLabel();
                    AbstractC6392a parkingSpotLabel = this.f138759c.getParkingSpotLabel();
                    composer.startReplaceGroup(-1070385670);
                    String upperCase = null;
                    String strB = parkingSpotLabel == null ? null : parkingSpotLabel.b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                    composer.P();
                    if (strB != null) {
                        upperCase = strB.toUpperCase(Locale.ROOT);
                        Intrinsics.i(upperCase, "toUpperCase(...)");
                    }
                    composer.startReplaceGroup(-1070386265);
                    if (upperCase == null) {
                        upperCase = C16338g.c(C6293f.f59656l, composer, 0).toUpperCase(Locale.ROOT);
                        Intrinsics.i(upperCase, "toUpperCase(...)");
                    }
                    composer.P();
                    si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            c(LocalThemeScope localThemeScope, Function0<Unit> function0, OrderDetailStatusDecorator orderDetailStatusDecorator) {
                this.f138754a = localThemeScope;
                this.f138755b = function0;
                this.f138756c = orderDetailStatusDecorator;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-920211765, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:209)");
                }
                E0.b(this.f138754a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, H1.h.p(12), 0.0f, 0.0f, 13, null), false, null, 895, null), this.f138755b, ComposableLambdaKt.c(-1109492488, true, new a(this.f138754a, Assemble, this.f138756c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

        n(OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0, OrderDetailStatusDecorator orderDetailStatusDecorator, boolean z10, L.OrderDetailsViewState orderDetailsViewState, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
            this.f138734a = orderSubstitutionsDetailBannerDecorator;
            this.f138735b = localThemeScope;
            this.f138736c = function0;
            this.f138737d = orderDetailStatusDecorator;
            this.f138738e = z10;
            this.f138739f = orderDetailsViewState;
            this.f138740g = function02;
            this.f138741h = function03;
            this.f138742i = function04;
            this.f138743j = function05;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2;
            LocalThemeScope localThemeScope;
            Function0<Unit> function0;
            OrderDetailStatusDecorator orderDetailStatusDecorator;
            int i11;
            boolean z10;
            LocalThemeScope localThemeScope2;
            Composer composer3;
            Composer composer4;
            LocalThemeScope localThemeScope3;
            Function0<Unit> function02;
            Function0<Unit> function03;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1602027210, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous> (OrderStatusView.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), H1.h.p(16));
            OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.f138734a;
            LocalThemeScope localThemeScope4 = this.f138735b;
            Function0<Unit> function04 = this.f138736c;
            OrderDetailStatusDecorator orderDetailStatusDecorator2 = this.f138737d;
            boolean z11 = this.f138738e;
            L.OrderDetailsViewState orderDetailsViewState = this.f138739f;
            Function0<Unit> function05 = this.f138740g;
            Function0<Unit> function06 = this.f138741h;
            Function0<Unit> function07 = this.f138742i;
            Function0<Unit> function08 = this.f138743j;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            composer.startReplaceGroup(77670421);
            if (orderSubstitutionsDetailBannerDecorator != null && orderSubstitutionsDetailBannerDecorator.getIsOrderDetailBannerVisible()) {
                C12658d.c(localThemeScope4, orderSubstitutionsDetailBannerDecorator, function04, composer, LocalThemeScope.f17314g | (OrderSubstitutionsDetailBannerDecorator.f130656e << 3));
            }
            composer.P();
            Ki.I seven = localThemeScope4.getAdsTypography().getHeadings().getSeven();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: in.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14827t.n.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null);
            String orderStatus = orderDetailStatusDecorator2.getOrderStatus();
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope4, label, orderStatus, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(77687817);
            if (z11) {
                i11 = 3;
                z10 = z11;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                companion = companion;
                function0 = function08;
                orderDetailStatusDecorator = orderDetailStatusDecorator2;
                composer2 = composer;
                localThemeScope = localThemeScope4;
                si.j.h(localThemeScope, new q1.Label(modifierM, null, null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne().g(FontWeight.INSTANCE.g()), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f100382Da, composer, 0), null, composer2, (i13 << 3) | i12, 4);
            } else {
                composer2 = composer;
                localThemeScope = localThemeScope4;
                function0 = function08;
                orderDetailStatusDecorator = orderDetailStatusDecorator2;
                i11 = 3;
                z10 = z11;
            }
            composer2.P();
            composer2.startReplaceGroup(77700951);
            if (orderDetailStatusDecorator.getIsOrderProgressBarVisible()) {
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer2, 0);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM2);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyA2, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14820m.b(localThemeScope, orderDetailsViewState.getProgressValue(), orderDetailsViewState.getProgressDuration(), orderDetailsViewState.getProgressColor(), composer2, i12);
                localThemeScope2 = localThemeScope;
                composer3 = composer2;
                composer3.v();
            } else {
                localThemeScope2 = localThemeScope;
                composer3 = composer2;
            }
            composer3.P();
            composer3.startReplaceGroup(77717508);
            if (z10) {
                composer4 = composer3;
                localThemeScope3 = localThemeScope2;
                function02 = function07;
                function03 = function0;
            } else {
                Modifier.Companion companion4 = companion;
                OrderDetailStatusDecorator orderDetailStatusDecorator3 = orderDetailStatusDecorator;
                companion = companion4;
                q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(companion4, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne().g(FontWeight.INSTANCE.g()), null, 382, null);
                AbstractC6392a statusUpdateReason = orderDetailStatusDecorator3.getStatusUpdateReason();
                if (statusUpdateReason == null) {
                    statusUpdateReason = orderDetailStatusDecorator3.getOrderStatusDescription();
                }
                orderDetailStatusDecorator = orderDetailStatusDecorator3;
                composer4 = composer3;
                localThemeScope3 = localThemeScope2;
                function02 = function07;
                function03 = function0;
                si.j.h(localThemeScope3, label2, C13698b.a(statusUpdateReason, composer3, AbstractC6392a.f60445b), null, composer4, i12 | (i13 << 3), 4);
            }
            composer4.P();
            AbstractC6392a statusUpdateTimestampString = orderDetailStatusDecorator.getStatusUpdateTimestampString();
            composer4.startReplaceGroup(77735712);
            if (statusUpdateTimestampString != null) {
                composer4.startReplaceGroup(77736380);
                if (orderDetailStatusDecorator.getIsOrderCanceled() || (orderDetailStatusDecorator.getIsOrderCompleted() && !orderDetailStatusDecorator.getIsOutForDelivery())) {
                    si.j.h(localThemeScope3, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne().g(FontWeight.INSTANCE.g()), null, 383, null), StringsKt.Q(StringsKt.Q(statusUpdateTimestampString.b((Context) composer4.o(AndroidCompositionLocals_androidKt.g())), "AM", "am", false, 4, null), "PM", "pm", false, 4, null), null, composer4, i12 | (i13 << 3), 4);
                }
                composer4.P();
                Unit unit = Unit.f143329a;
            }
            composer4.P();
            composer4.startReplaceGroup(77752529);
            if (orderDetailStatusDecorator.getIsOrderCompleted() || orderDetailStatusDecorator.getIsOrderCanceled()) {
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion2.k(), composer4, 0);
                int iA3 = C5859f.a(composer4, 0);
                InterfaceC5884s interfaceC5884sR3 = composer4.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer4, modifierM3);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer4.k() == null) {
                    C5859f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A3);
                } else {
                    composer4.s();
                }
                Composer composerA3 = D1.a(composer4);
                D1.c(composerA3, measurePolicyA3, companion3.e());
                D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                C14827t.c(localThemeScope3, orderDetailStatusDecorator, function05, composer4, (OrderDetailStatusDecorator.f130677z << i11) | i12);
                composer4.v();
            }
            composer4.P();
            composer4.startReplaceGroup(77772043);
            if (orderDetailStatusDecorator.getShouldShowFlyBuyButtonSection()) {
                Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null);
                MeasurePolicy measurePolicyA4 = C5807k.a(c5800d.h(), companion2.k(), composer4, 0);
                int iA4 = C5859f.a(composer4, 0);
                InterfaceC5884s interfaceC5884sR4 = composer4.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer4, modifierD);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer4.k() == null) {
                    C5859f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A4);
                } else {
                    composer4.s();
                }
                Composer composerA4 = D1.a(composer4);
                D1.c(composerA4, measurePolicyA4, companion3.e());
                D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                Modifier modifierM4 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer4, 6);
                int iA5 = C5859f.a(composer4, 0);
                InterfaceC5884s interfaceC5884sR5 = composer4.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer4, modifierM4);
                Function0<InterfaceC5953g> function0A5 = companion3.a();
                if (composer4.k() == null) {
                    C5859f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A5);
                } else {
                    composer4.s();
                }
                Composer composerA5 = D1.a(composer4);
                D1.c(composerA5, measurePolicyB, companion3.e());
                D1.c(composerA5, interfaceC5884sR5, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                composer4.startReplaceGroup(-1485688639);
                if (orderDetailStatusDecorator.getShouldShowCustomerOnWay()) {
                    Ki.Q.e(localThemeScope3, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-1761880849, true, new a(localThemeScope3, c14889j, function06), composer4, 54), composer4, i12 | 384 | (InterfaceC15205y.a.d.f142548b << i11));
                }
                composer4.P();
                composer4.startReplaceGroup(-1485658577);
                if (orderDetailStatusDecorator.getShouldShowCustomerHere()) {
                    Ki.Q.e(localThemeScope3, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(-958550874, true, new b(localThemeScope3, c14889j, function02), composer4, 54), composer4, i12 | 384 | (InterfaceC15205y.a.e.f142550b << i11));
                }
                composer4.P();
                composer4.v();
                composer4.startReplaceGroup(1525306316);
                if (orderDetailStatusDecorator.getShouldShowParkingSpotInfo()) {
                    Ki.Q.e(localThemeScope3, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-920211765, true, new c(localThemeScope3, function03, orderDetailStatusDecorator), composer4, 54), composer4, i12 | 384 | (InterfaceC15205y.a.d.f142548b << i11));
                }
                composer4.P();
                composer4.v();
            }
            composer4.P();
            composer4.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LocalThemeScope localThemeScope, OrderDetailStatusDecorator orderDetailStatusDecorator, Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        final OrderDetailStatusDecorator orderDetailStatusDecorator2;
        final LocalThemeScope localThemeScope2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(713488163);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(orderDetailStatusDecorator) : composerStartRestartGroup.D(orderDetailStatusDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            orderDetailStatusDecorator2 = orderDetailStatusDecorator;
            localThemeScope2 = localThemeScope;
            function02 = function0;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(713488163, i11, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailMperksRewards (OrderStatusView.kt:238)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16819m.d(modifierM, false, new a(a10), 1, null);
            b bVar = new b(nVar, 6, function0B, orderDetailStatusDecorator, localThemeScope, function0);
            orderDetailStatusDecorator2 = orderDetailStatusDecorator;
            localThemeScope2 = localThemeScope;
            function02 = function0;
            androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, bVar), measurePolicyA, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14827t.d(localThemeScope2, orderDetailStatusDecorator2, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, OrderDetailStatusDecorator orderDetailStatusDecorator, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, orderDetailStatusDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final es.OrderDetailStatusDecorator r28, final es.OrderSubstitutionsDetailBannerDecorator r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, final kotlin.jvm.functions.Function0<kotlin.Unit> r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, final sn.L.OrderDetailsViewState r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14827t.e(Ki.M, androidx.compose.ui.Modifier, es.d, es.J, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, sn.L$h, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailStatusDecorator orderDetailStatusDecorator, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, L.OrderDetailsViewState orderDetailsViewState, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, orderDetailStatusDecorator, orderSubstitutionsDetailBannerDecorator, function0, function02, function03, function04, function05, orderDetailsViewState, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
