package hn;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.k;
import L1.n;
import L1.x;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import as.C6152f;
import ck.C6408b;
import com.meijer.mobile.meijer.activity.substitution.C12532d;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import es.OrderDetailStatusDecorator;
import es.OrderSubstitutionsDetailBannerDecorator;
import hn.C14547t;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
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
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;
import rn.L;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a}\u0010\u0010\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Les/d;", "decorator", "Les/J;", "orderSubstitutionDetailBanner", "Lkotlin/Function0;", "", "navigateMPerksDashboard", "onClickOnMyWay", "onClickImHere", "onClickParkingSpot", "onClickSubstitutionBanner", "Lrn/L$h;", "viewState", "e", "(LJi/M;Landroidx/compose/ui/Modifier;Les/d;Les/J;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lrn/L$h;Landroidx/compose/runtime/Composer;II)V", "c", "(LJi/M;Les/d;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14547t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f136069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f136069f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f136069f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.t$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f136070f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f136071g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f136072h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDecorator f136073i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136074j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f136075k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, OrderDetailStatusDecorator orderDetailStatusDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f136071g = nVar;
            this.f136072h = function0;
            this.f136073i = orderDetailStatusDecorator;
            this.f136074j = localThemeScope;
            this.f136075k = function02;
            this.f136070f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            L1.h hVar;
            k.VerticalAnchor verticalAnchor;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f136071g.getHelpersHashCode();
            this.f136071g.i();
            L1.n nVar = this.f136071g;
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
            Z0.c cVarC = C16190d.c(com.meijer.mobile.meijer.S.f98691G, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f136076a;
                composer.t(objB);
            }
            composer.P();
            C13457y.a(cVarC, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(nVar.k(companion, hVarA, (Function1) objB), H1.h.p(11), 0.0f, 2, null), 0.0f, 1, null), null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Z0.c cVarC2 = C16190d.c(com.meijer.mobile.meijer.S.f98686B, composer, 0);
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99615I8, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = f.f136083a;
                composer.t(objB2);
            }
            composer.P();
            C13457y.a(cVarC2, strC, nVar.k(companion, hVarC, (Function1) objB2), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            if (this.f136073i.getDisplayMperksPoints()) {
                composer.startReplaceGroup(-978333162);
                Z0.c cVarC3 = C16190d.c(com.meijer.mobile.meijer.S.f98698N, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarA);
                Object objB3 = composer.B();
                if (zV || objB3 == companion2.a()) {
                    objB3 = new g(hVarA);
                    composer.t(objB3);
                }
                composer.P();
                C13457y.a(cVarC3, null, P0.o.a(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarE, (Function1) objB3), H1.h.p(32), H1.h.p(14), 0.0f, 0.0f, 12, null), 1.0f), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                LocalThemeScope localThemeScope = this.f136074j;
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.V(hVarE);
                Object objB4 = composer.B();
                if (zV2 || objB4 == companion2.a()) {
                    objB4 = new h(hVarA, hVarE);
                    composer.t(objB4);
                }
                composer.P();
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB4), 0.0f, H1.h.p(25), 0.0f, 0.0f, 13, null), this.f136074j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f136074j.getAdsTypography().getHeadings().getThree(), null, 380, null);
                String strA = C6408b.a(this.f136073i.getMperksPoints(), composer, AbstractC5607a.f45514b);
                int i12 = LocalThemeScope.f15770g;
                int i13 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f136074j;
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
                ri.j.h(localThemeScope2, new q1.Label(P0.o.a(nVar.k(modifierM, hVarH, (Function1) objB5), 2.0f), this.f136074j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f136074j.getAdsTypography().getHeadings().getSeven(), null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99577G8, composer, 0), null, composer, i14, 4);
                composer.P();
                hVar = hVarH;
                verticalAnchor = verticalAnchorC;
            } else {
                i11 = 5004770;
                composer.startReplaceGroup(-976684458);
                Z0.c cVarC4 = C16190d.c(this.f136073i.getMperksItemResId(), composer, 0);
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f99558F8, composer, 0);
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
                C13457y.a(cVarC4, strC2, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarD, (Function1) objB6), 0.0f, H1.h.p(9), H1.h.p(16), 0.0f, 9, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                composer.P();
            }
            Z0.c cVarC5 = C16190d.c(com.meijer.mobile.meijer.S.f98690F, composer, 0);
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
            C13457y.a(cVarC5, null, nVar.k(modifierZ, hVarG, (Function1) objB7), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope3 = this.f136074j;
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
            q1.Label label2 = new q1.Label(nVar.k(modifierM2, hVarI, (Function1) objB8), this.f136074j.getAdsColors().getAdsColorText01(), null, null, 0, false, 3, this.f136074j.getAdsTypography().getDetail().getOne(), null, 316, null);
            String strA2 = C6408b.a(this.f136073i.getMperksMessage(), composer, AbstractC5607a.f45514b);
            int i15 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope3, label2, strA2, null, composer, i15 | (q1.Label.f140080j << 3), 4);
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
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            LocalThemeScope localThemeScope4 = this.f136074j;
            Ji.Q.e(localThemeScope4, InterfaceC14971y.a.c.f140290a, ComposableLambdaKt.c(568688004, true, new d(localThemeScope4, this.f136075k), composer, 54), composer, i15 | 384 | (InterfaceC14971y.a.c.f140291b << 3));
            composer.v();
            Z0.c cVarC6 = C16190d.c(com.meijer.mobile.meijer.S.f98696L, composer, 0);
            String strC3 = C16193g.c(com.meijer.mobile.meijer.Y.f99615I8, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objB10 = composer.B();
            if (objB10 == companion2.a()) {
                objB10 = e.f136082a;
                composer.t(objB10);
            }
            composer.P();
            C13457y.a(cVarC6, strC3, nVar.k(companion, hVarB, (Function1) objB10), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            composer.P();
            if (this.f136071g.getHelpersHashCode() != helpersHashCode) {
                this.f136072h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f136076a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.t$d */
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136078b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.t$d$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f136079a;

            a(Function0<Unit> function0) {
                this.f136079a = function0;
            }

            public final void a() {
                this.f136079a.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.t$d$b */
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136080a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f136081b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f136080a = localThemeScope;
                this.f136081b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2093944311, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailMperksRewards.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:367)");
                }
                ri.j.h(this.f136080a, q1.Label.y(this.f136081b.getLabels().getEnabledLabel(), null, this.f136080a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, this.f136080a.getAdsTypography().getBody().getTwo(), null, 381, null), C16193g.c(com.meijer.mobile.meijer.Y.f99596H8, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        d(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f136077a = localThemeScope;
            this.f136078b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(568688004, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailMperksRewards.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:364)");
            }
            LocalThemeScope localThemeScope = this.f136077a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f136078b);
            Function0<Unit> function0 = this.f136078b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function0);
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2093944311, true, new b(this.f136077a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$e */
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f136082a = new e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$f */
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f136083a = new f();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$g */
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136084a;

        g(L1.h hVar) {
            this.f136084a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f136084a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$h */
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136085a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f136086b;

        h(L1.h hVar, L1.h hVar2) {
            this.f136085a = hVar;
            this.f136086b = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f136085a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f136086b.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$i */
    static final class i implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136087a;

        i(L1.h hVar) {
            this.f136087a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f136087a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f136087a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$j */
    static final class j implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f136088a;

        j(k.VerticalAnchor verticalAnchor) {
            this.f136088a = verticalAnchor;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f136088a, 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$k */
    static final class k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136089a;

        k(L1.h hVar) {
            this.f136089a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f136089a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f136089a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$l */
    static final class l implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f136091b;

        l(L1.h hVar, k.VerticalAnchor verticalAnchor) {
            this.f136090a = hVar;
            this.f136091b = verticalAnchor;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f136090a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f136091b, 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.t$m */
    static final class m implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f136092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.VerticalAnchor f136093b;

        m(L1.h hVar, k.VerticalAnchor verticalAnchor) {
            this.f136092a = hVar;
            this.f136093b = verticalAnchor;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f136092a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f136093b, 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.t$n */
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f136094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136096c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDecorator f136097d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f136098e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L.OrderDetailsViewState f136099f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136100g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136101h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136102i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136103j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.t$n$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136104a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14800I f136105b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f136106c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.t$n$a$a, reason: collision with other inner class name */
            static final class C2158a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f136107a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f136108b;

                C2158a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f136107a = localThemeScope;
                    this.f136108b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-726410148, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:180)");
                    }
                    LocalThemeScope localThemeScope = this.f136107a;
                    q1.Label enabledLabel = this.f136108b.getLabels().getEnabledLabel();
                    String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99826Ta, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14800I interfaceC14800I, Function0<Unit> function0) {
                this.f136104a = localThemeScope;
                this.f136105b = interfaceC14800I;
                this.f136106c = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1761880849, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:172)");
                }
                E0.b(this.f136104a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(this.f136105b, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), false, null, 895, null), this.f136106c, ComposableLambdaKt.c(-726410148, true, new C2158a(this.f136104a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.t$n$b */
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136109a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14800I f136110b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f136111c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.t$n$b$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f136112a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f136113b;

                a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f136112a = localThemeScope;
                    this.f136113b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1991347411, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:198)");
                    }
                    LocalThemeScope localThemeScope = this.f136112a;
                    q1.Label enabledLabel = this.f136113b.getLabels().getEnabledLabel();
                    String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99807Sa, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            b(LocalThemeScope localThemeScope, InterfaceC14800I interfaceC14800I, Function0<Unit> function0) {
                this.f136109a = localThemeScope;
                this.f136110b = interfaceC14800I;
                this.f136111c = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-958550874, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:190)");
                }
                float f10 = 8;
                E0.b(this.f136109a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(this.f136110b, Modifier.INSTANCE, 1.0f, false, 2, null), H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), false, null, 895, null), this.f136111c, ComposableLambdaKt.c(1991347411, true, new a(this.f136109a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.t$n$c */
        static final class c implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136114a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f136115b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderDetailStatusDecorator f136116c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: hn.t$n$c$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f136117a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f136118b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderDetailStatusDecorator f136119c;

                a(LocalThemeScope localThemeScope, j1 j1Var, OrderDetailStatusDecorator orderDetailStatusDecorator) {
                    this.f136117a = localThemeScope;
                    this.f136118b = j1Var;
                    this.f136119c = orderDetailStatusDecorator;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1109492488, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:218)");
                    }
                    LocalThemeScope localThemeScope = this.f136117a;
                    q1.Label enabledLabel = this.f136118b.getLabels().getEnabledLabel();
                    AbstractC5607a parkingSpotLabel = this.f136119c.getParkingSpotLabel();
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
                        upperCase = C16193g.c(C6152f.f59456l, composer, 0).toUpperCase(Locale.ROOT);
                        Intrinsics.i(upperCase, "toUpperCase(...)");
                    }
                    composer.P();
                    ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            c(LocalThemeScope localThemeScope, Function0<Unit> function0, OrderDetailStatusDecorator orderDetailStatusDecorator) {
                this.f136114a = localThemeScope;
                this.f136115b = function0;
                this.f136116c = orderDetailStatusDecorator;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-920211765, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusView.kt:209)");
                }
                E0.b(this.f136114a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, H1.h.p(12), 0.0f, 0.0f, 13, null), false, null, 895, null), this.f136115b, ComposableLambdaKt.c(-1109492488, true, new a(this.f136114a, Assemble, this.f136116c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

        n(OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0, OrderDetailStatusDecorator orderDetailStatusDecorator, boolean z10, L.OrderDetailsViewState orderDetailsViewState, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
            this.f136094a = orderSubstitutionsDetailBannerDecorator;
            this.f136095b = localThemeScope;
            this.f136096c = function0;
            this.f136097d = orderDetailStatusDecorator;
            this.f136098e = z10;
            this.f136099f = orderDetailsViewState;
            this.f136100g = function02;
            this.f136101h = function03;
            this.f136102i = function04;
            this.f136103j = function05;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
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
            OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.f136094a;
            LocalThemeScope localThemeScope4 = this.f136095b;
            Function0<Unit> function04 = this.f136096c;
            OrderDetailStatusDecorator orderDetailStatusDecorator2 = this.f136097d;
            boolean z11 = this.f136098e;
            L.OrderDetailsViewState orderDetailsViewState = this.f136099f;
            Function0<Unit> function05 = this.f136100g;
            Function0<Unit> function06 = this.f136101h;
            Function0<Unit> function07 = this.f136102i;
            Function0<Unit> function08 = this.f136103j;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            composer.startReplaceGroup(77670421);
            if (orderSubstitutionsDetailBannerDecorator != null && orderSubstitutionsDetailBannerDecorator.getIsOrderDetailBannerVisible()) {
                C12532d.c(localThemeScope4, orderSubstitutionsDetailBannerDecorator, function04, composer, LocalThemeScope.f15770g | (OrderSubstitutionsDetailBannerDecorator.f129815e << 3));
            }
            composer.P();
            Ji.I seven = localThemeScope4.getAdsTypography().getHeadings().getSeven();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: hn.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14547t.n.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null);
            String orderStatus = orderDetailStatusDecorator2.getOrderStatus();
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope4, label, orderStatus, null, composer, i12 | (i13 << 3), 4);
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
                ri.j.h(localThemeScope, new q1.Label(modifierM, null, null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.g()), null, 382, null), C16193g.c(com.meijer.mobile.meijer.Y.f99465Aa, composer, 0), null, composer2, (i13 << 3) | i12, 4);
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
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composer2, 0);
                int iA2 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM2);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyA2, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14540m.b(localThemeScope, orderDetailsViewState.getProgressValue(), orderDetailsViewState.getProgressDuration(), orderDetailsViewState.getProgressColor(), composer2, i12);
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
                q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(companion4, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.g()), null, 382, null);
                AbstractC5607a statusUpdateReason = orderDetailStatusDecorator3.getStatusUpdateReason();
                if (statusUpdateReason == null) {
                    statusUpdateReason = orderDetailStatusDecorator3.getOrderStatusDescription();
                }
                orderDetailStatusDecorator = orderDetailStatusDecorator3;
                composer4 = composer3;
                localThemeScope3 = localThemeScope2;
                function02 = function07;
                function03 = function0;
                ri.j.h(localThemeScope3, label2, C6408b.a(statusUpdateReason, composer3, AbstractC5607a.f45514b), null, composer4, i12 | (i13 << 3), 4);
            }
            composer4.P();
            AbstractC5607a statusUpdateTimestampString = orderDetailStatusDecorator.getStatusUpdateTimestampString();
            composer4.startReplaceGroup(77735712);
            if (statusUpdateTimestampString != null) {
                composer4.startReplaceGroup(77736380);
                if (orderDetailStatusDecorator.getIsOrderCanceled() || (orderDetailStatusDecorator.getIsOrderCompleted() && !orderDetailStatusDecorator.getIsOutForDelivery())) {
                    ri.j.h(localThemeScope3, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.g()), null, 383, null), StringsKt.Q(StringsKt.Q(statusUpdateTimestampString.b((Context) composer4.o(AndroidCompositionLocals_androidKt.g())), "AM", "am", false, 4, null), "PM", "pm", false, 4, null), null, composer4, i12 | (i13 << 3), 4);
                }
                composer4.P();
                Unit unit = Unit.f142422a;
            }
            composer4.P();
            composer4.startReplaceGroup(77752529);
            if (orderDetailStatusDecorator.getIsOrderCompleted() || orderDetailStatusDecorator.getIsOrderCanceled()) {
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyA3 = C5665k.a(c5658d.h(), companion2.k(), composer4, 0);
                int iA3 = C5717f.a(composer4, 0);
                InterfaceC5742s interfaceC5742sR3 = composer4.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer4, modifierM3);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer4.k() == null) {
                    C5717f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A3);
                } else {
                    composer4.s();
                }
                Composer composerA3 = D1.a(composer4);
                D1.c(composerA3, measurePolicyA3, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                C14547t.c(localThemeScope3, orderDetailStatusDecorator, function05, composer4, (OrderDetailStatusDecorator.f129836z << i11) | i12);
                composer4.v();
            }
            composer4.P();
            composer4.startReplaceGroup(77772043);
            if (orderDetailStatusDecorator.getShouldShowFlyBuyButtonSection()) {
                Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null);
                MeasurePolicy measurePolicyA4 = C5665k.a(c5658d.h(), companion2.k(), composer4, 0);
                int iA4 = C5717f.a(composer4, 0);
                InterfaceC5742s interfaceC5742sR4 = composer4.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer4, modifierD);
                Function0<InterfaceC5811g> function0A4 = companion3.a();
                if (composer4.k() == null) {
                    C5717f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A4);
                } else {
                    composer4.s();
                }
                Composer composerA4 = D1.a(composer4);
                D1.c(composerA4, measurePolicyA4, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                Modifier modifierM4 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i11, null), 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.e(), companion2.l(), composer4, 6);
                int iA5 = C5717f.a(composer4, 0);
                InterfaceC5742s interfaceC5742sR5 = composer4.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer4, modifierM4);
                Function0<InterfaceC5811g> function0A5 = companion3.a();
                if (composer4.k() == null) {
                    C5717f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A5);
                } else {
                    composer4.s();
                }
                Composer composerA5 = D1.a(composer4);
                D1.c(composerA5, measurePolicyB, companion3.e());
                D1.c(composerA5, interfaceC5742sR5, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                composer4.startReplaceGroup(-1485688639);
                if (orderDetailStatusDecorator.getShouldShowCustomerOnWay()) {
                    Ji.Q.e(localThemeScope3, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-1761880849, true, new a(localThemeScope3, c14801j, function06), composer4, 54), composer4, i12 | 384 | (InterfaceC14971y.a.d.f140293b << i11));
                }
                composer4.P();
                composer4.startReplaceGroup(-1485658577);
                if (orderDetailStatusDecorator.getShouldShowCustomerHere()) {
                    Ji.Q.e(localThemeScope3, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(-958550874, true, new b(localThemeScope3, c14801j, function02), composer4, 54), composer4, i12 | 384 | (InterfaceC14971y.a.e.f140295b << i11));
                }
                composer4.P();
                composer4.v();
                composer4.startReplaceGroup(1525306316);
                if (orderDetailStatusDecorator.getShouldShowParkingSpotInfo()) {
                    Ji.Q.e(localThemeScope3, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-920211765, true, new c(localThemeScope3, function03, orderDetailStatusDecorator), composer4, 54), composer4, i12 | 384 | (InterfaceC14971y.a.d.f140293b << i11));
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
            return Unit.f142422a;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16705m.d(modifierM, false, new a(a10), 1, null);
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
            t0L.a(new Function2() { // from class: hn.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14547t.d(localThemeScope2, orderDetailStatusDecorator2, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, OrderDetailStatusDecorator orderDetailStatusDecorator, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, orderDetailStatusDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void e(final Ji.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final es.OrderDetailStatusDecorator r28, final es.OrderSubstitutionsDetailBannerDecorator r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, final kotlin.jvm.functions.Function0<kotlin.Unit> r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, final rn.L.OrderDetailsViewState r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14547t.e(Ji.M, androidx.compose.ui.Modifier, es.d, es.J, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, rn.L$h, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailStatusDecorator orderDetailStatusDecorator, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, L.OrderDetailsViewState orderDetailsViewState, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, orderDetailStatusDecorator, orderSubstitutionsDetailBannerDecorator, function0, function02, function03, function04, function05, orderDetailsViewState, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
