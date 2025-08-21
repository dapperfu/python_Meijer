package Pr;

import F1.t;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import Pr.C;
import Qk.a;
import Xr.CouponListItemDecorator;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import c5.C6484c;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13575i;
import dk.C13698b;
import java.util.Locale;
import ki.InterfaceC15139H;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import oi.C16185n1;
import oi.o1;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LXr/c;", "decorator", "", "viewId", "Lkotlin/Function1;", "LQk/a;", "", "onCouponAction", "f", "(LKi/M;Landroidx/compose/ui/Modifier;LXr/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isClipped", "Lkotlin/Function0;", "onButtonClicked", "d", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "a", "LXr/c;", "i", "()LXr/c;", "couponListItemDecorator", "lastAction", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final CouponListItemDecorator f26521a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26523b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26524c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f26525d;

        a(boolean z10, LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier) {
            this.f26522a = z10;
            this.f26523b = localThemeScope;
            this.f26524c = function0;
            this.f26525d = modifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC15139H interfaceC15139H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(q1.Label.y(interfaceC15139H.getLabels().getEnabledRestingLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorBrandPrimary()), null, 383, null), str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC15139H interfaceC15139H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(q1.Label.y(interfaceC15139H.getLabels().getEnabledSelectedLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 383, null), str);
            return Unit.f143329a;
        }

        public final void c(final InterfaceC15139H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1237325295, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponActionButton.<anonymous> (CouponListItem.kt:184)");
            }
            final String upperCase = C16338g.c(this.f26522a ? Nr.g.f22695j0 : Nr.g.f22696k, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            if (this.f26522a) {
                composer.startReplaceGroup(-1748362446);
                LocalThemeScope localThemeScope = this.f26523b;
                Function0<Unit> function0 = this.f26524c;
                q1.d.ChipButton chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, C13575i.a(H1.h.p(1), this.f26523b.getAdsColors().getAdsColorBrandPrimary().getColor()), null, null, C18370z.f(androidx.compose.foundation.layout.J.w(this.f26525d, H1.h.p(74), H1.h.p(36)), "shop_button", null, 2, null), false, null, 879, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(Assemble) | composer.D(this.f26523b) | composer.V(upperCase);
                final LocalThemeScope localThemeScope2 = this.f26523b;
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
                C16185n1.h(localThemeScope, null, function0, chipButtonY, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.d.ChipButton.f142195k << 9), 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-1747535025);
                LocalThemeScope localThemeScope3 = this.f26523b;
                Function0<Unit> function02 = this.f26524c;
                q1.d.ChipButton chipButtonY2 = q1.d.ChipButton.y(Assemble.getButtons().getEnabledSelected(), false, null, null, null, null, null, null, C18370z.f(androidx.compose.foundation.layout.J.w(this.f26525d, H1.h.p(74), H1.h.p(36)), "clip_button", null, 2, null), false, null, 895, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(Assemble) | composer.D(this.f26523b) | composer.V(upperCase);
                final LocalThemeScope localThemeScope4 = this.f26523b;
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
                C16185n1.h(localThemeScope3, null, function02, chipButtonY2, (Function1) objB2, composer, LocalThemeScope.f17314g | (q1.d.ChipButton.f142195k << 9), 1);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
            c(interfaceC15139H, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f26526f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f26526f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f26526f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f26527f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f26528g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f26529h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f26530i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ CouponListItemDecorator f26531j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26532k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f26533l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, Modifier modifier, CouponListItemDecorator couponListItemDecorator, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f26528g = nVar;
            this.f26529h = function0;
            this.f26530i = modifier;
            this.f26531j = couponListItemDecorator;
            this.f26532k = localThemeScope;
            this.f26533l = function1;
            this.f26527f = i10;
        }

        public final void a(Composer composer, int i10) {
            L1.h hVar;
            L1.n nVar;
            L1.h hVar2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f26528g.getHelpersHashCode();
            this.f26528g.i();
            L1.n nVar2 = this.f26528g;
            composer.startReplaceGroup(-1592642886);
            n.b bVarM = nVar2.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            float f10 = 104;
            Modifier modifierP = androidx.compose.foundation.layout.J.p(this.f26530i, H1.h.p(f10), H1.h.p(f10));
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(hVarC);
                composer.t(objB);
            }
            composer.P();
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f26531j.getImageURL()).p(Nr.c.f22614c).j(Nr.c.f22614c).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), nVar2.k(modifierP, hVarA, (Function1) objB), null, null, P0.e.INSTANCE.e(), InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
            String hatText = this.f26531j.getHatText();
            composer.startReplaceGroup(-2129560158);
            if (hatText == null) {
                nVar = nVar2;
                hVar = hVarA;
                hVar2 = hVarC;
            } else {
                Modifier modifier = this.f26530i;
                composer.startReplaceGroup(-1633490746);
                hVar = hVarA;
                boolean zV2 = composer.V(hVar) | composer.D(this.f26532k);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new e(hVar, this.f26532k);
                    composer.t(objB2);
                }
                composer.P();
                nVar = nVar2;
                hVar2 = hVarC;
                si.j.h(this.f26532k, new q1.Label(nVar.k(modifier, hVar2, (Function1) objB2), this.f26532k.getAdsColors().getAdsColorSavings(), null, null, F1.t.INSTANCE.b(), false, 1, this.f26532k.getAdsTypography().getHeadings().getEight(), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), hatText, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            }
            composer.P();
            AbstractC6392a title = this.f26531j.getTitle();
            int i11 = AbstractC6392a.f60445b;
            String strB = C13698b.b(title, composer, i11);
            Modifier modifier2 = this.f26530i;
            composer.startReplaceGroup(-1746271574);
            boolean zV3 = composer.V(hVar2) | composer.D(this.f26532k) | composer.V(hVar);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new f(hVar2, this.f26532k, hVar);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifier2, hVarD, (Function1) objB3);
            Ki.I three = this.f26532k.getAdsTypography().getValues().getThree();
            t.Companion companion = F1.t.INSTANCE;
            q1.Label label = new q1.Label(modifierK, null, null, null, companion.b(), false, 2, three, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            LocalThemeScope localThemeScope = this.f26532k;
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strB, null, composer, i12 | (i13 << 3), 4);
            String strB2 = C13698b.b(this.f26531j.getDescription(), composer, i11);
            Modifier modifier3 = this.f26530i;
            composer.startReplaceGroup(-1224400529);
            boolean zV4 = composer.V(hVarD) | composer.D(this.f26532k) | composer.V(hVarG) | composer.V(hVar);
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new g(hVarD, this.f26532k, hVarG, hVar);
                composer.t(objB4);
            }
            composer.P();
            si.j.h(this.f26532k, new q1.Label(nVar.k(modifier3, hVarE, (Function1) objB4), null, null, null, companion.b(), false, 2, this.f26532k.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), strB2, null, composer, i12 | (i13 << 3), 4);
            String strB3 = C13698b.b(this.f26531j.getCouponExpiration(), composer, i11);
            Modifier modifier4 = this.f26530i;
            composer.startReplaceGroup(-1746271574);
            boolean zV5 = composer.V(hVarE) | composer.D(this.f26532k) | composer.V(hVar);
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new h(hVarE, this.f26532k, hVar);
                composer.t(objB5);
            }
            composer.P();
            si.j.h(this.f26532k, new q1.Label(nVar.k(modifier4, hVarF, (Function1) objB5), this.f26532k.getAdsColors().getAdsColorText02(), null, null, companion.b(), false, 1, this.f26532k.getAdsTypography().getDetail().getOne(), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), strB3, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(-2129463419);
            if (!this.f26531j.getShouldHideActionButton()) {
                LocalThemeScope localThemeScope2 = this.f26532k;
                boolean isClipped = this.f26531j.getIsClipped();
                Modifier modifier5 = this.f26530i;
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(hVarE) | composer.D(this.f26532k);
                Object objB6 = composer.B();
                if (zV6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new i(hVarE, this.f26532k);
                    composer.t(objB6);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(modifier5, hVarG, (Function1) objB6);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f26531j) | composer.V(this.f26533l);
                Object objB7 = composer.B();
                if (zD || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new j(this.f26531j, this.f26533l);
                    composer.t(objB7);
                }
                composer.P();
                C.d(localThemeScope2, isClipped, modifierK2, (Function0) objB7, composer, i12);
            }
            composer.P();
            composer.P();
            if (this.f26528g.getHelpersHashCode() != helpersHashCode) {
                this.f26529h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26534a;

        d(L1.h hVar) {
            this.f26534a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f26534a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26536b;

        e(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f26535a = hVar;
            this.f26536b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f26535a.getEnd(), this.f26536b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f26536b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f26539c;

        f(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f26537a = hVar;
            this.f26538b = localThemeScope;
            this.f26539c = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f26537a.getBottom(), this.f26538b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), this.f26539c.getEnd(), this.f26538b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f26538b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f26542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L1.h f26543d;

        g(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2, L1.h hVar3) {
            this.f26540a = hVar;
            this.f26541b = localThemeScope;
            this.f26542c = hVar2;
            this.f26543d = hVar3;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f26540a.getBottom(), this.f26541b.getAdsSpacing().getTwo().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), this.f26542c.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f26543d.getEnd(), this.f26541b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f26541b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f26546c;

        h(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f26544a = hVar;
            this.f26545b = localThemeScope;
            this.f26546c = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f26544a.getBottom(), this.f26545b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), this.f26546c.getEnd(), this.f26545b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f26547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26548b;

        i(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f26547a = hVar;
            this.f26548b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f26547a.getBottom(), this.f26548b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CouponListItemDecorator f26549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Qk.a, Unit> f26550b;

        /* JADX WARN: Multi-variable type inference failed */
        j(CouponListItemDecorator couponListItemDecorator, Function1<? super Qk.a, Unit> function1) {
            this.f26549a = couponListItemDecorator;
            this.f26550b = function1;
        }

        public final void a() {
            if (this.f26549a.getIsClipped()) {
                this.f26550b.invoke(new a.ViewCouponDetails(this.f26549a.getCouponIdentity(), null, 2, null));
            } else {
                this.f26550b.invoke(new a.Clip(this.f26549a.getCouponIdentity(), null, 2, null));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.C2257a.f142541a, ComposableLambdaKt.c(-1237325295, true, new a(z10, localThemeScope, onButtonClicked, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.C2257a.f142542b << 3));
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
        return Unit.f143329a;
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
    public static final void f(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final Xr.CouponListItemDecorator r24, java.lang.String r25, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C.f(Ki.M, androidx.compose.ui.Modifier, Xr.c, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, CouponListItemDecorator couponListItemDecorator) {
        function1.invoke(new a.ViewCouponDetails(couponListItemDecorator.getCouponIdentity(), null, 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, CouponListItemDecorator couponListItemDecorator, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, couponListItemDecorator, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final CouponListItemDecorator i() {
        return f26521a;
    }

    static {
        Pk.c cVarA = Pk.e.a(11343245987L);
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        f26521a = new CouponListItemDecorator(cVarA, companion.c("Buy 1, Get 2 Free"), companion.c("when you buy TWO BOXES any flavor General Mills cereal listed: Cheerios™ • Cinnamon Toast Crunch™ • Lucky Charms™ • Reeses Puffs • Chex™ • Cocoa Puffs™ • Trix™ • Cookie Crisp™ • Golden Grahams™ • Kix™ • Fiber One™ • Wheaties™ • Raisin Nut Bran • Total™ • Basic 4™ • Oatmeal Crisp™ • Dunkaroos™ • Pokémon™ • Remix™ snack pouches • Nature Valley™ Granola (pouches)"), "https://static.meijer.com/DigitalCoupon/20220724MHDPBabyWeek2.png", "Spring Break", companion.c("Valid thru 01/10/2025"), null, null, false, "Void if altered, copied, sold, purchased, or where prohibited or restricted by law. One coupon per purchase of specified product(s). Good only in USA, APOs & FPOs.", false, false, 2240, null);
    }
}
