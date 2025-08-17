package Pr;

import F1.t;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Pk.a;
import Pr.C;
import Xr.CouponListItemDecorator;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import b5.C6197c;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13442i;
import java.util.Locale;
import ji.InterfaceC14905H;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import ni.C15851n1;
import ni.o1;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LXr/c;", "decorator", "", "viewId", "Lkotlin/Function1;", "LPk/a;", "", "onCouponAction", "f", "(LJi/M;Landroidx/compose/ui/Modifier;LXr/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isClipped", "Lkotlin/Function0;", "onButtonClicked", "d", "(LJi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "a", "LXr/c;", "i", "()LXr/c;", "couponListItemDecorator", "lastAction", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final CouponListItemDecorator f28639a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f28640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f28643d;

        a(boolean z10, LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier) {
            this.f28640a = z10;
            this.f28641b = localThemeScope;
            this.f28642c = function0;
            this.f28643d = modifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC14905H interfaceC14905H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(q1.Label.y(interfaceC14905H.getLabels().getEnabledRestingLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorBrandPrimary()), null, 383, null), str);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC14905H interfaceC14905H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(q1.Label.y(interfaceC14905H.getLabels().getEnabledSelectedLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 383, null), str);
            return Unit.f142422a;
        }

        public final void c(final InterfaceC14905H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1237325295, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponActionButton.<anonymous> (CouponListItem.kt:184)");
            }
            final String upperCase = C16193g.c(this.f28640a ? Nr.g.f22739j0 : Nr.g.f22740k, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            if (this.f28640a) {
                composer.startReplaceGroup(-1748362446);
                LocalThemeScope localThemeScope = this.f28641b;
                Function0<Unit> function0 = this.f28642c;
                q1.d.ChipButton chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, C13442i.a(H1.h.p(1), this.f28641b.getAdsColors().getAdsColorBrandPrimary().getColor()), null, null, C18299z.f(androidx.compose.foundation.layout.J.w(this.f28643d, H1.h.p(74), H1.h.p(36)), "shop_button", null, 2, null), false, null, 879, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(Assemble) | composer.D(this.f28641b) | composer.V(upperCase);
                final LocalThemeScope localThemeScope2 = this.f28641b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Pr.A
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.a.d(Assemble, localThemeScope2, upperCase, (o1) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15851n1.h(localThemeScope, null, function0, chipButtonY, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.d.ChipButton.f139940k << 9), 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-1747535025);
                LocalThemeScope localThemeScope3 = this.f28641b;
                Function0<Unit> function02 = this.f28642c;
                q1.d.ChipButton chipButtonY2 = q1.d.ChipButton.y(Assemble.getButtons().getEnabledSelected(), false, null, null, null, null, null, null, C18299z.f(androidx.compose.foundation.layout.J.w(this.f28643d, H1.h.p(74), H1.h.p(36)), "clip_button", null, 2, null), false, null, 895, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(Assemble) | composer.D(this.f28641b) | composer.V(upperCase);
                final LocalThemeScope localThemeScope4 = this.f28641b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Pr.B
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.a.e(Assemble, localThemeScope4, upperCase, (o1) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C15851n1.h(localThemeScope3, null, function02, chipButtonY2, (Function1) objB2, composer, LocalThemeScope.f15770g | (q1.d.ChipButton.f139940k << 9), 1);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            c(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f28644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f28644f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f28644f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f28645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f28646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f28647h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f28648i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ CouponListItemDecorator f28649j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28650k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f28651l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, Modifier modifier, CouponListItemDecorator couponListItemDecorator, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f28646g = nVar;
            this.f28647h = function0;
            this.f28648i = modifier;
            this.f28649j = couponListItemDecorator;
            this.f28650k = localThemeScope;
            this.f28651l = function1;
            this.f28645f = i10;
        }

        public final void a(Composer composer, int i10) {
            L1.h hVar;
            L1.n nVar;
            L1.h hVar2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f28646g.getHelpersHashCode();
            this.f28646g.i();
            L1.n nVar2 = this.f28646g;
            composer.startReplaceGroup(-1592642886);
            n.b bVarM = nVar2.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            float f10 = 104;
            Modifier modifierP = androidx.compose.foundation.layout.J.p(this.f28648i, H1.h.p(f10), H1.h.p(f10));
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(hVarC);
                composer.t(objB);
            }
            composer.P();
            C6197c.e(new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f28649j.getImageURL()).p(Nr.c.f22658c).j(Nr.c.f22658c).c(), null, Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), nVar2.k(modifierP, hVarA, (Function1) objB), null, null, P0.e.INSTANCE.e(), InterfaceC5784k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
            String hatText = this.f28649j.getHatText();
            composer.startReplaceGroup(-2129560158);
            if (hatText == null) {
                nVar = nVar2;
                hVar = hVarA;
                hVar2 = hVarC;
            } else {
                Modifier modifier = this.f28648i;
                composer.startReplaceGroup(-1633490746);
                hVar = hVarA;
                boolean zV2 = composer.V(hVar) | composer.D(this.f28650k);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new e(hVar, this.f28650k);
                    composer.t(objB2);
                }
                composer.P();
                nVar = nVar2;
                hVar2 = hVarC;
                ri.j.h(this.f28650k, new q1.Label(nVar.k(modifier, hVar2, (Function1) objB2), this.f28650k.getAdsColors().getAdsColorSavings(), null, null, F1.t.INSTANCE.b(), false, 1, this.f28650k.getAdsTypography().getHeadings().getEight(), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), hatText, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            }
            composer.P();
            AbstractC5607a title = this.f28649j.getTitle();
            int i11 = AbstractC5607a.f45514b;
            String strB = C6408b.b(title, composer, i11);
            Modifier modifier2 = this.f28648i;
            composer.startReplaceGroup(-1746271574);
            boolean zV3 = composer.V(hVar2) | composer.D(this.f28650k) | composer.V(hVar);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new f(hVar2, this.f28650k, hVar);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifier2, hVarD, (Function1) objB3);
            Ji.I three = this.f28650k.getAdsTypography().getValues().getThree();
            t.Companion companion = F1.t.INSTANCE;
            q1.Label label = new q1.Label(modifierK, null, null, null, companion.b(), false, 2, three, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            LocalThemeScope localThemeScope = this.f28650k;
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strB, null, composer, i12 | (i13 << 3), 4);
            String strB2 = C6408b.b(this.f28649j.getDescription(), composer, i11);
            Modifier modifier3 = this.f28648i;
            composer.startReplaceGroup(-1224400529);
            boolean zV4 = composer.V(hVarD) | composer.D(this.f28650k) | composer.V(hVarG) | composer.V(hVar);
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new g(hVarD, this.f28650k, hVarG, hVar);
                composer.t(objB4);
            }
            composer.P();
            ri.j.h(this.f28650k, new q1.Label(nVar.k(modifier3, hVarE, (Function1) objB4), null, null, null, companion.b(), false, 2, this.f28650k.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), strB2, null, composer, i12 | (i13 << 3), 4);
            String strB3 = C6408b.b(this.f28649j.getCouponExpiration(), composer, i11);
            Modifier modifier4 = this.f28648i;
            composer.startReplaceGroup(-1746271574);
            boolean zV5 = composer.V(hVarE) | composer.D(this.f28650k) | composer.V(hVar);
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new h(hVarE, this.f28650k, hVar);
                composer.t(objB5);
            }
            composer.P();
            ri.j.h(this.f28650k, new q1.Label(nVar.k(modifier4, hVarF, (Function1) objB5), this.f28650k.getAdsColors().getAdsColorText02(), null, null, companion.b(), false, 1, this.f28650k.getAdsTypography().getDetail().getOne(), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), strB3, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(-2129463419);
            if (!this.f28649j.getShouldHideActionButton()) {
                LocalThemeScope localThemeScope2 = this.f28650k;
                boolean isClipped = this.f28649j.getIsClipped();
                Modifier modifier5 = this.f28648i;
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(hVarE) | composer.D(this.f28650k);
                Object objB6 = composer.B();
                if (zV6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new i(hVarE, this.f28650k);
                    composer.t(objB6);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(modifier5, hVarG, (Function1) objB6);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f28649j) | composer.V(this.f28651l);
                Object objB7 = composer.B();
                if (zD || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new j(this.f28649j, this.f28651l);
                    composer.t(objB7);
                }
                composer.P();
                C.d(localThemeScope2, isClipped, modifierK2, (Function0) objB7, composer, i12);
            }
            composer.P();
            composer.P();
            if (this.f28646g.getHelpersHashCode() != helpersHashCode) {
                this.f28647h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28652a;

        d(L1.h hVar) {
            this.f28652a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f28652a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28654b;

        e(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f28653a = hVar;
            this.f28654b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f28653a.getEnd(), this.f28654b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f28654b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f28657c;

        f(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f28655a = hVar;
            this.f28656b = localThemeScope;
            this.f28657c = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f28655a.getBottom(), this.f28656b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), this.f28657c.getEnd(), this.f28656b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f28656b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f28660c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L1.h f28661d;

        g(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2, L1.h hVar3) {
            this.f28658a = hVar;
            this.f28659b = localThemeScope;
            this.f28660c = hVar2;
            this.f28661d = hVar3;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f28658a.getBottom(), this.f28659b.getAdsSpacing().getTwo().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), this.f28660c.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f28661d.getEnd(), this.f28659b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f28659b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f28664c;

        h(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f28662a = hVar;
            this.f28663b = localThemeScope;
            this.f28664c = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f28662a.getBottom(), this.f28663b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), this.f28664c.getEnd(), this.f28663b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f28665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28666b;

        i(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f28665a = hVar;
            this.f28666b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f28665a.getBottom(), this.f28666b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CouponListItemDecorator f28667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f28668b;

        /* JADX WARN: Multi-variable type inference failed */
        j(CouponListItemDecorator couponListItemDecorator, Function1<? super Pk.a, Unit> function1) {
            this.f28667a = couponListItemDecorator;
            this.f28668b = function1;
        }

        public final void a() {
            if (this.f28667a.getIsClipped()) {
                this.f28668b.invoke(new a.ViewCouponDetails(this.f28667a.getCouponIdentity(), null, 2, null));
            } else {
                this.f28668b.invoke(new a.Clip(this.f28667a.getCouponIdentity(), null, 2, null));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final boolean z10, final Modifier modifier, final Function0<Unit> onButtonClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onButtonClicked, "onButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-950896996);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onButtonClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-950896996, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponActionButton (CouponListItem.kt:182)");
            }
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(-1237325295, true, new a(z10, localThemeScope, onButtonClicked, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.C2218a.f140287b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pr.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.e(localThemeScope, z10, modifier, onButtonClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, Composer composer, int i11) {
        d(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final Xr.CouponListItemDecorator r24, java.lang.String r25, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C.f(Ji.M, androidx.compose.ui.Modifier, Xr.c, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, CouponListItemDecorator couponListItemDecorator) {
        function1.invoke(new a.ViewCouponDetails(couponListItemDecorator.getCouponIdentity(), null, 2, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, CouponListItemDecorator couponListItemDecorator, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, couponListItemDecorator, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final CouponListItemDecorator i() {
        return f28639a;
    }

    static {
        Ok.c cVarA = Ok.e.a(11343245987L);
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        f28639a = new CouponListItemDecorator(cVarA, companion.c("Buy 1, Get 2 Free"), companion.c("when you buy TWO BOXES any flavor General Mills cereal listed: Cheerios™ • Cinnamon Toast Crunch™ • Lucky Charms™ • Reeses Puffs • Chex™ • Cocoa Puffs™ • Trix™ • Cookie Crisp™ • Golden Grahams™ • Kix™ • Fiber One™ • Wheaties™ • Raisin Nut Bran • Total™ • Basic 4™ • Oatmeal Crisp™ • Dunkaroos™ • Pokémon™ • Remix™ snack pouches • Nature Valley™ Granola (pouches)"), "https://static.meijer.com/DigitalCoupon/20220724MHDPBabyWeek2.png", "Spring Break", companion.c("Valid thru 01/10/2025"), null, null, false, "Void if altered, copied, sold, purchased, or where prohibited or restricted by law. One coupon per purchase of specified product(s). Good only in USA, APOs & FPOs.", false, false, 2240, null);
    }
}
