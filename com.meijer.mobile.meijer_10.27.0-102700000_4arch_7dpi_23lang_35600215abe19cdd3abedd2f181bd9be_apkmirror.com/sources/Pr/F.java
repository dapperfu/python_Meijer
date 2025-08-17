package Pr;

import F1.t;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import Ok.Coupon;
import P0.e;
import V0.C5347r0;
import ak.AbstractC5607a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import dl.SpecialOffer;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.C14898A;
import ji.ProductCardTags;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Ldl/b;", "specialOffer", "Lkotlin/Function1;", "LOk/a;", "", "onCouponClicked", "onCouponActionButtonClicked", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Ldl/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class F {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SpecialOffer f28678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Coupon, Unit> f28680c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pr.F$a$a, reason: collision with other inner class name */
        static final class C0668a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0668a f28681a = new C0668a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            C0668a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f28682a;

            b(L1.h hVar) {
                this.f28682a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f28682a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f28683a;

            c(L1.h hVar) {
                this.f28683a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                float f10 = 4;
                x.a.a(constrainAs.getTop(), this.f28683a.getTop(), H1.h.p(f10), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f28683a.getBottom(), H1.h.p(f10), 0.0f, 4, null);
                D.a.a(constrainAs.getStart(), this.f28683a.getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f28683a.getEnd(), 0.0f, 0.0f, 6, null);
                v.Companion companion = L1.v.INSTANCE;
                constrainAs.p(companion.a());
                constrainAs.r(companion.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28684a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.n f28685b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f28686c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f28687d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Coupon, Unit> f28688e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SpecialOffer f28689f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pr.F$a$d$a, reason: collision with other inner class name */
            static final class C0669a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f28690a;

                C0669a(L1.h hVar) {
                    this.f28690a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f28690a.getBottom(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function0<Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1<Coupon, Unit> f28691a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SpecialOffer f28692b;

                /* JADX WARN: Multi-variable type inference failed */
                b(Function1<? super Coupon, Unit> function1, SpecialOffer specialOffer) {
                    this.f28691a = function1;
                    this.f28692b = specialOffer;
                }

                public final void a() {
                    this.f28691a.invoke(this.f28692b.getCoupon());
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28693a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f28694b;

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(607380696, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:198)");
                    }
                    Z0.c cVarC = C16190d.c(Bj.i.f2727d, composer, 0);
                    InterfaceC5784k interfaceC5784kD = InterfaceC5784k.INSTANCE.d();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C13457y.a(cVarC, null, androidx.compose.foundation.layout.J.v(companion, H1.h.p(18)), null, interfaceC5784kD, 0.0f, null, composer, 25008, 104);
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion, this.f28693a.getAdsSpacing().getTwo().getDp()), composer, 0);
                    ri.j.h(this.f28693a, this.f28694b.getLabels().getEnabledLabel(), C16193g.c(Nr.g.f22740k, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                c(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f28693a = localThemeScope;
                    this.f28694b = j1Var;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, Function1<? super Coupon, Unit> function1, SpecialOffer specialOffer) {
                this.f28684a = localThemeScope;
                this.f28685b = nVar;
                this.f28686c = hVar;
                this.f28687d = hVar2;
                this.f28688e = function1;
                this.f28689f = specialOffer;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1199291867, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:186)");
                }
                LocalThemeScope localThemeScope = this.f28684a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                L1.n nVar = this.f28685b;
                float f10 = 1;
                Modifier modifierA = androidx.compose.foundation.layout.J.a(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f28684a.getAdsSpacing().getSeven().getDp(), H1.h.p(0)), H1.h.p(f10), H1.h.p(f10));
                L1.h hVar = this.f28686c;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f28687d);
                L1.h hVar2 = this.f28687d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C0669a(hVar2);
                    composer.t(objB);
                }
                composer.P();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, nVar.k(modifierA, hVar, (Function1) objB), false, null, 895, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f28688e) | composer.D(this.f28689f);
                Function1<Coupon, Unit> function1 = this.f28688e;
                SpecialOffer specialOffer = this.f28689f;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(function1, specialOffer);
                    composer.t(objB2);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB2, ComposableLambdaKt.c(607380696, true, new c(this.f28684a, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
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
        static final class e implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f28695a = new e();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
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
        /* synthetic */ class f extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final f f28696h = new f();

            f() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class g implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28697a;

            g(LocalThemeScope localThemeScope) {
                this.f28697a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1832121372, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:223)");
                }
                String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22765w0);
                Intrinsics.i(string, "getString(...)");
                Hi.h.h(this.f28697a, q1.Tag.y(Assemble.getTags().getPickupOnly(), null, q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getModifier().then(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f28697a.getAdsSpacing().getThree().getDp(), this.f28697a.getAdsSpacing().getOne().getDp())), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), string, null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final h f28698h = new h();

            h() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class i implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28699a;

            i(LocalThemeScope localThemeScope) {
                this.f28699a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-161352165, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:242)");
                }
                String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22763v0);
                Intrinsics.i(string, "getString(...)");
                Hi.h.h(this.f28699a, q1.Tag.y(Assemble.getTags().getLowStock(), null, q1.Label.y(Assemble.getTags().getLowStock().getLabel(), Assemble.getTags().getLowStock().getModifier().then(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f28699a.getAdsSpacing().getThree().getDp(), this.f28699a.getAdsSpacing().getOne().getDp())), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), string, null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class j extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f28700f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(L1.A a10) {
                super(1);
                this.f28700f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f28700f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f28701f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f28702g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f28703h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ SpecialOffer f28704i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28705j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1 f28706k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.n nVar, int i10, Function0 function0, SpecialOffer specialOffer, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f28702g = nVar;
                this.f28703h = function0;
                this.f28704i = specialOffer;
                this.f28705j = localThemeScope;
                this.f28706k = function1;
                this.f28701f = i10;
            }

            /* JADX WARN: Type inference failed for: r6v15 */
            /* JADX WARN: Type inference failed for: r6v16, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r6v22 */
            public final void a(Composer composer, int i10) {
                Composer composer2;
                Modifier.Companion companion;
                L1.n nVar;
                int i11;
                ?? r62;
                int i12;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f28702g.getHelpersHashCode();
                this.f28702g.i();
                L1.n nVar2 = this.f28702g;
                composer.startReplaceGroup(-1315075649);
                n.b bVarM = nVar2.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = C0668a.f28681a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar2.k(companion2, hVarC, (Function1) objB);
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion4 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion4.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion5 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion5.a();
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
                D1.c(composerA, measurePolicyA, companion5.e());
                D1.c(composerA, interfaceC5742sR, companion5.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion5.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion5.f());
                C14815g c14815g = C14815g.f139108a;
                C15372h.a aVar = new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                String imageURL = this.f28704i.getCoupon().getImageURL();
                if (imageURL == null) {
                    imageURL = "";
                }
                C15372h c15372hC = aVar.f(imageURL).p(Nr.c.f22659d).j(Nr.c.f22659d).c();
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(companion2, H1.h.p(BinsView.TOTE_HEIGHT_DP));
                Z4.h hVarA2 = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                InterfaceC5784k.Companion companion6 = InterfaceC5784k.INSTANCE;
                C6197c.e(c15372hC, null, hVarA2, modifierZ, null, null, null, companion6.e(), 0.0f, null, 0, false, null, composer, 12586032, 0, 8048);
                String title = this.f28704i.getTitle();
                String str = title == null ? "" : title;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f28705j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                Ji.I two = this.f28705j.getAdsTypography().getValues().getTwo();
                t.Companion companion7 = F1.t.INSTANCE;
                q1.Label label = new q1.Label(modifierM, null, null, null, companion7.b(), false, 2, two, null, HttpResponseStatus.REDIRECTION_FOUND, null);
                LocalThemeScope localThemeScope = this.f28705j;
                int i13 = LocalThemeScope.f15770g;
                int i14 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, str, null, composer, i13 | (i14 << 3), 4);
                String description = this.f28704i.getDescription();
                String str2 = description == null ? "" : description;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f28705j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                int iB = companion7.b();
                Ji.I one = this.f28705j.getAdsTypography().getBodyCompact().getOne();
                FontWeight.Companion companion8 = FontWeight.INSTANCE;
                ri.j.h(this.f28705j, new q1.Label(modifierM2, null, null, null, iB, false, 3, one.f(companion8.f()), null, HttpResponseStatus.REDIRECTION_FOUND, null), str2, null, composer, i13 | (i14 << 3), 4);
                ri.j.h(this.f28705j, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f28705j.getAdsSpacing().getThree().getDp(), 0.0f, this.f28705j.getAdsSpacing().getFive().getDp(), 5, null), this.f28705j.getAdsColors().getAdsColorText02(), null, null, companion7.b(), false, 1, this.f28705j.getAdsTypography().getBodyCompact().getTwo().f(companion8.f()), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), C6408b.a(SpecialOffer.b(this.f28704i, null, 1, null), composer, AbstractC5607a.f45514b), null, composer, (i14 << 3) | i13, 4);
                composer.v();
                if (this.f28704i.getIsClipped()) {
                    composer.startReplaceGroup(-1312675506);
                    e.c cVarI = companion4.i();
                    Modifier modifierI = androidx.compose.foundation.layout.D.i(companion2, this.f28705j.getAdsSpacing().getTwo().getDp());
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarC);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion3.a()) {
                        objB2 = new b(hVarC);
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierK2 = nVar2.k(modifierI, hVarD, (Function1) objB2);
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), cVarI, composer, 48);
                    int iA2 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                    Function0<InterfaceC5811g> function0A2 = companion5.a();
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
                    D1.c(composerA2, measurePolicyB, companion5.e());
                    D1.c(composerA2, interfaceC5742sR2, companion5.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion5.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion5.f());
                    C14801J c14801j = C14801J.f139030a;
                    C13457y.a(C16190d.c(Bj.i.f2739g, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f28705j.getAdsSpacing().getTwo().getDp()), composer, 0);
                    LocalThemeScope localThemeScope2 = this.f28705j;
                    ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.J.D(companion2, null, false, 3, null), this.f28705j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 380, null), C16193g.c(Nr.g.f22748o, composer, 0), null, composer, i13 | (i14 << 3), 4);
                    composer.v();
                    composer.P();
                    i12 = i13;
                    companion = companion2;
                    nVar = nVar2;
                    r62 = 1;
                    composer2 = composer;
                    i11 = 54;
                } else {
                    composer.startReplaceGroup(-1311543107);
                    Drawable drawableE = Z1.b.e((Context) composer.o(AndroidCompositionLocals_androidKt.g()), Bj.i.f2715a);
                    InterfaceC5784k interfaceC5784kB = companion6.b();
                    C5347r0 c5347r0C = C5347r0.Companion.c(C5347r0.INSTANCE, this.f28705j.getAdsColors().getAdsColorBrandPrimary().getColor(), 0, 2, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarD);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion3.a()) {
                        objB3 = new c(hVarD);
                        composer.t(objB3);
                    }
                    composer.P();
                    composer2 = composer;
                    companion = companion2;
                    b5.v.a(drawableE, null, nVar2.k(companion2, hVarE, (Function1) objB3), null, null, null, interfaceC5784kB, 0.0f, c5347r0C, 0, false, null, composer2, 1572912, 0, 3768);
                    LocalThemeScope localThemeScope3 = this.f28705j;
                    C14898A c14898a = C14898A.f139596a;
                    d dVar = new d(localThemeScope3, nVar2, hVarD, hVarC, this.f28706k, this.f28704i);
                    nVar = nVar2;
                    i11 = 54;
                    r62 = 1;
                    i12 = i13;
                    Ji.Q.e(localThemeScope3, c14898a, ComposableLambdaKt.c(-1199291867, true, dVar, composer2, 54), composer2, i12 | 384 | (C14898A.f139597b << 3));
                    composer2.P();
                }
                C5658d.e eVarG = c5658d.g();
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion3.a()) {
                    objB4 = e.f28695a;
                    composer2.t(objB4);
                }
                composer2.P();
                Modifier modifierK3 = nVar.k(companion, hVarA, (Function1) objB4);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(eVarG, companion4.l(), composer2, 6);
                int iA3 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierK3);
                Function0<InterfaceC5811g> function0A3 = companion5.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A3);
                } else {
                    composer2.s();
                }
                Composer composerA3 = D1.a(composer2);
                D1.c(composerA3, measurePolicyB2, companion5.e());
                D1.c(composerA3, interfaceC5742sR3, companion5.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion5.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion5.f());
                C14801J c14801j2 = C14801J.f139030a;
                if (SpecialOffer.k(this.f28704i, null, r62, null)) {
                    composer2.startReplaceGroup(2073407698);
                    LocalThemeScope localThemeScope4 = this.f28705j;
                    composer2.startReplaceGroup(1849434622);
                    Object objB5 = composer2.B();
                    if (objB5 == companion3.a()) {
                        objB5 = f.f28696h;
                        composer2.t(objB5);
                    }
                    composer2.P();
                    Ji.Q.f(localThemeScope4, (Function1) objB5, ComposableLambdaKt.c(-1832121372, r62, new g(this.f28705j), composer2, i11), composer2, i12 | 432);
                    composer2.P();
                } else if (SpecialOffer.i(this.f28704i, null, r62, null)) {
                    composer2.startReplaceGroup(2074311534);
                    LocalThemeScope localThemeScope5 = this.f28705j;
                    composer2.startReplaceGroup(1849434622);
                    Object objB6 = composer2.B();
                    if (objB6 == companion3.a()) {
                        objB6 = h.f28698h;
                        composer2.t(objB6);
                    }
                    composer2.P();
                    Ji.Q.f(localThemeScope5, (Function1) objB6, ComposableLambdaKt.c(-161352165, r62, new i(this.f28705j), composer2, i11), composer2, i12 | 432);
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(2075090905);
                    composer2.P();
                }
                composer2.v();
                composer2.P();
                if (this.f28702g.getHelpersHashCode() != helpersHashCode) {
                    this.f28703h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-279888990, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous> (CouponListItemVertical.kt:76)");
            }
            SpecialOffer specialOffer = this.f28678a;
            LocalThemeScope localThemeScope = this.f28679b;
            Function1<Coupon, Unit> function1 = this.f28680c;
            composer.startReplaceableGroup(-270267587);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(companion, false, new j(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new k(nVar, 0, pairH.b(), specialOffer, localThemeScope, function1)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(SpecialOffer specialOffer, LocalThemeScope localThemeScope, Function1<? super Coupon, Unit> function1) {
            this.f28678a = specialOffer;
            this.f28679b = localThemeScope;
            this.f28680c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final dl.SpecialOffer r24, final kotlin.jvm.functions.Function1<? super Ok.Coupon, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Ok.Coupon, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.F.c(Ji.M, androidx.compose.ui.Modifier, dl.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, SpecialOffer specialOffer, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, specialOffer, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, SpecialOffer specialOffer) {
        function1.invoke(specialOffer.getCoupon());
        return Unit.f142422a;
    }
}
