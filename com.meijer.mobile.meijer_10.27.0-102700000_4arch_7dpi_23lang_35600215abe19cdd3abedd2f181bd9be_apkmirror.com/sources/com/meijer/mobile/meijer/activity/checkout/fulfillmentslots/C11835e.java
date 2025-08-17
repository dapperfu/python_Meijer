package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Bm.FulfillmentPartnerDecorator;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import j0.C14815g;
import java.util.ArrayList;
import java.util.List;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "informationButtonContentDescription", "", "LBm/a;", "fulfillmentPartners", "Landroidx/compose/ui/Modifier;", "modifier", "", "isSinglePageCheckout", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "onAction", "Lkotlin/Function0;", "onInformationClick", "c", "(LJi/M;Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11835e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f102911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102912c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102913d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<FulfillmentPartnerDecorator> f102914e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102915f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$a, reason: collision with other inner class name */
        static final class C1454a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C1454a f102916a = new C1454a();

            C1454a() {
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$b */
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f102917a = new b();

            b() {
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$c */
        static final class c implements Function1<r1.u, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f102918a;

            c(String str) {
                this.f102918a = str;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, this.f102918a);
                r1.s.s0(semantics, Role.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$d */
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f102919a;

            d(Function0<Unit> function0) {
                this.f102919a = function0;
            }

            public final void a() {
                this.f102919a.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$e, reason: collision with other inner class name */
        static final class C1455e implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f102920a;

            C1455e(L1.h hVar) {
                this.f102920a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f102920a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$f */
        static final class f implements Function1<Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<q1.g, Unit> f102921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FulfillmentPartnerDecorator f102922b;

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super q1.g, Unit> function1, FulfillmentPartnerDecorator fulfillmentPartnerDecorator) {
                this.f102921a = function1;
                this.f102922b = fulfillmentPartnerDecorator;
            }

            public final void a(boolean z10) {
                this.f102921a.invoke(new q1.g.DeliveryFulfillmentPartnerSelected(this.f102922b.getFulfillmentPartner()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                a(bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$g */
        public static final class g extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f102923f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(L1.A a10) {
                super(1);
                this.f102923f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f102923f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e$a$h */
        public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f102924f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f102925g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f102926h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102927i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f102928j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f102929k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function0 f102930l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ List f102931m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f102932n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, String str, Function0 function02, List list, Function1 function1) {
                super(2);
                this.f102925g = nVar;
                this.f102926h = function0;
                this.f102927i = localThemeScope;
                this.f102928j = z10;
                this.f102929k = str;
                this.f102930l = function02;
                this.f102931m = list;
                this.f102932n = function1;
                this.f102924f = i10;
            }

            public final void a(Composer composer, int i10) {
                h hVar = this;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = hVar.f102925g.getHelpersHashCode();
                hVar.f102925g.i();
                L1.n nVar = hVar.f102925g;
                composer.startReplaceGroup(-631502009);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                LocalThemeScope localThemeScope = hVar.f102927i;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, hVar.f102928j ? hVar.f102927i.getAdsTypography().getHeadings().getEight() : hVar.f102927i.getAdsTypography().getHeadings().getSix(), null, 383, null);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = C1454a.f102916a;
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, q1.Label.y(label, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarA, (Function1) objB), hVar.f102927i.getAdsSpacing().getFive().getDp(), hVar.f102927i.getAdsSpacing().getFive().getDp(), hVar.f102927i.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(com.meijer.mobile.meijer.Y.f99480B6, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                Composer composer2 = composer;
                Z0.c cVarC = C16190d.c(C.i.h.f15557d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer2, 0);
                long color = hVar.f102927i.getAdsColors().getAdsColorBrandPrimary().getColor();
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion2.a()) {
                    objB2 = b.f102917a;
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK = nVar.k(companion, hVarC, (Function1) objB2);
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(hVar.f102929k);
                Object objB3 = composer2.B();
                if (zV || objB3 == companion2.a()) {
                    objB3 = new c(hVar.f102929k);
                    composer2.t(objB3);
                }
                composer2.P();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(C16705m.d(modifierK, false, (Function1) objB3, 1, null), 0.0f, hVar.f102927i.getAdsSpacing().getFive().getDp(), hVar.f102927i.getAdsSpacing().getFive().getDp(), 0.0f, 9, null);
                composer2.startReplaceGroup(5004770);
                boolean zV2 = composer2.V(hVar.f102930l);
                Object objB4 = composer2.B();
                if (zV2 || objB4 == companion2.a()) {
                    objB4 = new d(hVar.f102930l);
                    composer2.t(objB4);
                }
                composer2.P();
                C17988z0.a(cVarC, null, ClickableKt.d(modifierM, false, null, null, (Function0) objB4, 7, null), color, composer2, 48, 0);
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, hVar.f102927i.getAdsSpacing().getFive().getDp(), hVar.f102927i.getAdsSpacing().getThree().getDp(), hVar.f102927i.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                composer2.startReplaceGroup(5004770);
                boolean zV3 = composer2.V(hVarA);
                Object objB5 = composer2.B();
                if (zV3 || objB5 == companion2.a()) {
                    objB5 = new C1455e(hVarA);
                    composer2.t(objB5);
                }
                composer2.P();
                Modifier modifierK2 = nVar.k(modifierM2, hVarD, (Function1) objB5);
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.o((hVar.f102928j ? hVar.f102927i.getAdsSpacing().getThree() : hVar.f102927i.getAdsSpacing().getFive()).getDp()), P0.e.INSTANCE.k(), composer2, 0);
                int iA = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK2);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                composer2.startReplaceGroup(36614972);
                if (!hVar.f102928j) {
                    C17917Z.a(null, hVar.f102927i.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                }
                composer2.P();
                composer2.startReplaceGroup(36621486);
                List<FulfillmentPartnerDecorator> list = hVar.f102931m;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (FulfillmentPartnerDecorator fulfillmentPartnerDecorator : list) {
                    LocalThemeScope localThemeScope2 = hVar.f102927i;
                    Modifier modifierFsAttribute = Modifier.INSTANCE;
                    if (hVar.f102928j) {
                        modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(modifierFsAttribute, "Button", Intrinsics.e(fulfillmentPartnerDecorator.getFulfillmentPartner().getPartnerName(), ej.o.f128952f.getPartnerName()) ? "buncha delivery" : "shipt delivery");
                    }
                    AbstractC5607a partnerTitle = fulfillmentPartnerDecorator.getPartnerTitle();
                    int i11 = AbstractC5607a.f45514b;
                    String strA = C6408b.a(partnerTitle, composer2, i11);
                    String strA2 = C6408b.a(fulfillmentPartnerDecorator.getPartnerDescription(), composer2, i11);
                    String strA3 = C6408b.a(fulfillmentPartnerDecorator.getDeliveryCostFormatted(), composer2, i11);
                    ArrayList arrayList2 = arrayList;
                    Modifier modifier = modifierFsAttribute;
                    boolean isPartnerSelected = fulfillmentPartnerDecorator.getIsPartnerSelected();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV4 = composer2.V(hVar.f102932n) | composer2.D(fulfillmentPartnerDecorator);
                    Object objB6 = composer2.B();
                    if (zV4 || objB6 == Composer.INSTANCE.a()) {
                        objB6 = new f(hVar.f102932n, fulfillmentPartnerDecorator);
                        composer2.t(objB6);
                    }
                    composer2.P();
                    ti.E.F(localThemeScope2, modifier, strA, strA2, null, strA3, false, isPartnerSelected, (Function1) objB6, null, null, null, null, false, null, composer, LocalThemeScope.f15770g, 0, 16168);
                    arrayList2.add(Unit.f142422a);
                    composer2 = composer;
                    arrayList = arrayList2;
                    helpersHashCode = helpersHashCode;
                    hVar = this;
                }
                int i12 = helpersHashCode;
                composer.P();
                composer.v();
                composer.P();
                if (this.f102925g.getHelpersHashCode() != i12) {
                    this.f102926h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, String str, Function0<Unit> function0, List<FulfillmentPartnerDecorator> list, Function1<? super q1.g, Unit> function1) {
            this.f102910a = localThemeScope;
            this.f102911b = z10;
            this.f102912c = str;
            this.f102913d = function0;
            this.f102914e = list;
            this.f102915f = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-689312708, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.DeliveryPartnerSelection.<anonymous> (DeliveryPartnerSelection.kt:63)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f102910a.getAdsSpacing().getFive().getDp(), 7, null), 0.0f, 1, null);
            LocalThemeScope localThemeScope = this.f102910a;
            boolean z10 = this.f102911b;
            String str = this.f102912c;
            Function0<Unit> function0 = this.f102913d;
            List<FulfillmentPartnerDecorator> list = this.f102914e;
            Function1<q1.g, Unit> function1 = this.f102915f;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierH, false, new g(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new h(nVar, 0, pairH.b(), localThemeScope, z10, str, function0, list, function1)), pairH.a(), composer, 48, 0);
            composer.U();
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r16, final java.lang.String r17, final java.util.List<Bm.FulfillmentPartnerDecorator> r18, androidx.compose.ui.Modifier r19, boolean r20, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C11835e.c(Ji.M, java.lang.String, java.util.List, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, List list, Modifier modifier, boolean z10, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, str, list, modifier, z10, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
