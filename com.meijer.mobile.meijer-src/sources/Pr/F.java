package Pr;

import F1.t;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import P0.e;
import Pk.Coupon;
import V0.C5490r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import el.SpecialOffer;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.C15132A;
import ki.ProductCardTags;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lel/b;", "specialOffer", "Lkotlin/Function1;", "LPk/a;", "", "onCouponClicked", "onCouponActionButtonClicked", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lel/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class F {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SpecialOffer f26560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Coupon, Unit> f26562c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pr.F$a$a, reason: collision with other inner class name */
        static final class C0488a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0488a f26563a = new C0488a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            C0488a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f26564a;

            b(L1.h hVar) {
                this.f26564a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f26564a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f26565a;

            c(L1.h hVar) {
                this.f26565a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                float f10 = 4;
                x.a.a(constrainAs.getTop(), this.f26565a.getTop(), H1.h.p(f10), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f26565a.getBottom(), H1.h.p(f10), 0.0f, 4, null);
                D.a.a(constrainAs.getStart(), this.f26565a.getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f26565a.getEnd(), 0.0f, 0.0f, 6, null);
                v.Companion companion = L1.v.INSTANCE;
                constrainAs.p(companion.a());
                constrainAs.r(companion.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.n f26567b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f26568c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f26569d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Coupon, Unit> f26570e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SpecialOffer f26571f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pr.F$a$d$a, reason: collision with other inner class name */
            static final class C0489a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f26572a;

                C0489a(L1.h hVar) {
                    this.f26572a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f26572a.getBottom(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function0<Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1<Coupon, Unit> f26573a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SpecialOffer f26574b;

                /* JADX WARN: Multi-variable type inference failed */
                b(Function1<? super Coupon, Unit> function1, SpecialOffer specialOffer) {
                    this.f26573a = function1;
                    this.f26574b = specialOffer;
                }

                public final void a() {
                    this.f26573a.invoke(this.f26574b.getCoupon());
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f26575a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f26576b;

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(607380696, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:198)");
                    }
                    Z0.c cVarC = C16335d.c(Cj.i.f4772d, composer, 0);
                    InterfaceC5926k interfaceC5926kD = InterfaceC5926k.INSTANCE.d();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C13590y.a(cVarC, null, androidx.compose.foundation.layout.J.v(companion, H1.h.p(18)), null, interfaceC5926kD, 0.0f, null, composer, 25008, 104);
                    C14890K.a(androidx.compose.foundation.layout.J.z(companion, this.f26575a.getAdsSpacing().getTwo().getDp()), composer, 0);
                    si.j.h(this.f26575a, this.f26576b.getLabels().getEnabledLabel(), C16338g.c(Nr.g.f22696k, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                c(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f26575a = localThemeScope;
                    this.f26576b = j1Var;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, Function1<? super Coupon, Unit> function1, SpecialOffer specialOffer) {
                this.f26566a = localThemeScope;
                this.f26567b = nVar;
                this.f26568c = hVar;
                this.f26569d = hVar2;
                this.f26570e = function1;
                this.f26571f = specialOffer;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1199291867, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListItemVertical.<anonymous>.<anonymous>.<anonymous> (CouponListItemVertical.kt:186)");
                }
                LocalThemeScope localThemeScope = this.f26566a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                L1.n nVar = this.f26567b;
                float f10 = 1;
                Modifier modifierA = androidx.compose.foundation.layout.J.a(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f26566a.getAdsSpacing().getSeven().getDp(), H1.h.p(0)), H1.h.p(f10), H1.h.p(f10));
                L1.h hVar = this.f26568c;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f26569d);
                L1.h hVar2 = this.f26569d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C0489a(hVar2);
                    composer.t(objB);
                }
                composer.P();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, nVar.k(modifierA, hVar, (Function1) objB), false, null, 895, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f26570e) | composer.D(this.f26571f);
                Function1<Coupon, Unit> function1 = this.f26570e;
                SpecialOffer specialOffer = this.f26571f;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(function1, specialOffer);
                    composer.t(objB2);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB2, ComposableLambdaKt.c(607380696, true, new c(this.f26566a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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
        static final class e implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f26577a = new e();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
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
        /* synthetic */ class f extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final f f26578h = new f();

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
            final /* synthetic */ LocalThemeScope f26579a;

            g(LocalThemeScope localThemeScope) {
                this.f26579a = localThemeScope;
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
                String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22721w0);
                Intrinsics.i(string, "getString(...)");
                Ii.h.h(this.f26579a, q1.Tag.y(Assemble.getTags().getPickupOnly(), null, q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getModifier().then(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f26579a.getAdsSpacing().getThree().getDp(), this.f26579a.getAdsSpacing().getOne().getDp())), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), string, null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final h f26580h = new h();

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
            final /* synthetic */ LocalThemeScope f26581a;

            i(LocalThemeScope localThemeScope) {
                this.f26581a = localThemeScope;
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
                String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22719v0);
                Intrinsics.i(string, "getString(...)");
                Ii.h.h(this.f26581a, q1.Tag.y(Assemble.getTags().getLowStock(), null, q1.Label.y(Assemble.getTags().getLowStock().getLabel(), Assemble.getTags().getLowStock().getModifier().then(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f26581a.getAdsSpacing().getThree().getDp(), this.f26581a.getAdsSpacing().getOne().getDp())), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), string, null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class j extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f26582f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(L1.A a10) {
                super(1);
                this.f26582f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f26582f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f26583f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f26584g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f26585h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ SpecialOffer f26586i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26587j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1 f26588k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.n nVar, int i10, Function0 function0, SpecialOffer specialOffer, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f26584g = nVar;
                this.f26585h = function0;
                this.f26586i = specialOffer;
                this.f26587j = localThemeScope;
                this.f26588k = function1;
                this.f26583f = i10;
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
                int helpersHashCode = this.f26584g.getHelpersHashCode();
                this.f26584g.i();
                L1.n nVar2 = this.f26584g;
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
                    objB = C0488a.f26563a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar2.k(companion2, hVarC, (Function1) objB);
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion4 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion4.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion5.a();
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
                D1.c(composerA, measurePolicyA, companion5.e());
                D1.c(composerA, interfaceC5884sR, companion5.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion5.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion5.f());
                C14903g c14903g = C14903g.f139698a;
                C15669h.a aVar = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                String imageURL = this.f26586i.getCoupon().getImageURL();
                if (imageURL == null) {
                    imageURL = "";
                }
                C15669h c15669hC = aVar.f(imageURL).p(Nr.c.f22615d).j(Nr.c.f22615d).c();
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(companion2, H1.h.p(BinsView.TOTE_HEIGHT_DP));
                a5.h hVarA2 = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                InterfaceC5926k.Companion companion6 = InterfaceC5926k.INSTANCE;
                C6484c.e(c15669hC, null, hVarA2, modifierZ, null, null, null, companion6.e(), 0.0f, null, 0, false, null, composer, 12586032, 0, 8048);
                String title = this.f26586i.getTitle();
                String str = title == null ? "" : title;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f26587j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                Ki.I two = this.f26587j.getAdsTypography().getValues().getTwo();
                t.Companion companion7 = F1.t.INSTANCE;
                q1.Label label = new q1.Label(modifierM, null, null, null, companion7.b(), false, 2, two, null, HttpResponseStatus.REDIRECTION_FOUND, null);
                LocalThemeScope localThemeScope = this.f26587j;
                int i13 = LocalThemeScope.f17314g;
                int i14 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, str, null, composer, i13 | (i14 << 3), 4);
                String description = this.f26586i.getDescription();
                String str2 = description == null ? "" : description;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f26587j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                int iB = companion7.b();
                Ki.I one = this.f26587j.getAdsTypography().getBodyCompact().getOne();
                FontWeight.Companion companion8 = FontWeight.INSTANCE;
                si.j.h(this.f26587j, new q1.Label(modifierM2, null, null, null, iB, false, 3, one.g(companion8.f()), null, HttpResponseStatus.REDIRECTION_FOUND, null), str2, null, composer, i13 | (i14 << 3), 4);
                si.j.h(this.f26587j, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, 0.0f, this.f26587j.getAdsSpacing().getThree().getDp(), 0.0f, this.f26587j.getAdsSpacing().getFive().getDp(), 5, null), this.f26587j.getAdsColors().getAdsColorText02(), null, null, companion7.b(), false, 1, this.f26587j.getAdsTypography().getBodyCompact().getTwo().g(companion8.f()), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), C13698b.a(SpecialOffer.b(this.f26586i, null, 1, null), composer, AbstractC6392a.f60445b), null, composer, (i14 << 3) | i13, 4);
                composer.v();
                if (this.f26586i.getIsClipped()) {
                    composer.startReplaceGroup(-1312675506);
                    e.c cVarI = companion4.i();
                    Modifier modifierI = androidx.compose.foundation.layout.D.i(companion2, this.f26587j.getAdsSpacing().getTwo().getDp());
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarC);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion3.a()) {
                        objB2 = new b(hVarC);
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierK2 = nVar2.k(modifierI, hVarD, (Function1) objB2);
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), cVarI, composer, 48);
                    int iA2 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                    Function0<InterfaceC5953g> function0A2 = companion5.a();
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
                    D1.c(composerA2, measurePolicyB, companion5.e());
                    D1.c(composerA2, interfaceC5884sR2, companion5.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion5.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion5.f());
                    C14889J c14889j = C14889J.f139620a;
                    C13590y.a(C16335d.c(Cj.i.f4784g, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                    C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f26587j.getAdsSpacing().getTwo().getDp()), composer, 0);
                    LocalThemeScope localThemeScope2 = this.f26587j;
                    si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.J.D(companion2, null, false, 3, null), this.f26587j.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 380, null), C16338g.c(Nr.g.f22704o, composer, 0), null, composer, i13 | (i14 << 3), 4);
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
                    Drawable drawableE = Z1.b.e((Context) composer.o(AndroidCompositionLocals_androidKt.g()), Cj.i.f4760a);
                    InterfaceC5926k interfaceC5926kB = companion6.b();
                    C5490r0 c5490r0C = C5490r0.Companion.c(C5490r0.INSTANCE, this.f26587j.getAdsColors().getAdsColorBrandPrimary().getColor(), 0, 2, null);
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
                    c5.v.a(drawableE, null, nVar2.k(companion2, hVarE, (Function1) objB3), null, null, null, interfaceC5926kB, 0.0f, c5490r0C, 0, false, null, composer2, 1572912, 0, 3768);
                    LocalThemeScope localThemeScope3 = this.f26587j;
                    C15132A c15132a = C15132A.f141851a;
                    d dVar = new d(localThemeScope3, nVar2, hVarD, hVarC, this.f26588k, this.f26586i);
                    nVar = nVar2;
                    i11 = 54;
                    r62 = 1;
                    i12 = i13;
                    Ki.Q.e(localThemeScope3, c15132a, ComposableLambdaKt.c(-1199291867, true, dVar, composer2, 54), composer2, i12 | 384 | (C15132A.f141852b << 3));
                    composer2.P();
                }
                C5800d.e eVarG = c5800d.g();
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion3.a()) {
                    objB4 = e.f26577a;
                    composer2.t(objB4);
                }
                composer2.P();
                Modifier modifierK3 = nVar.k(companion, hVarA, (Function1) objB4);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(eVarG, companion4.l(), composer2, 6);
                int iA3 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierK3);
                Function0<InterfaceC5953g> function0A3 = companion5.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A3);
                } else {
                    composer2.s();
                }
                Composer composerA3 = D1.a(composer2);
                D1.c(composerA3, measurePolicyB2, companion5.e());
                D1.c(composerA3, interfaceC5884sR3, companion5.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion5.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion5.f());
                C14889J c14889j2 = C14889J.f139620a;
                if (SpecialOffer.k(this.f26586i, null, r62, null)) {
                    composer2.startReplaceGroup(2073407698);
                    LocalThemeScope localThemeScope4 = this.f26587j;
                    composer2.startReplaceGroup(1849434622);
                    Object objB5 = composer2.B();
                    if (objB5 == companion3.a()) {
                        objB5 = f.f26578h;
                        composer2.t(objB5);
                    }
                    composer2.P();
                    Ki.Q.f(localThemeScope4, (Function1) objB5, ComposableLambdaKt.c(-1832121372, r62, new g(this.f26587j), composer2, i11), composer2, i12 | 432);
                    composer2.P();
                } else if (SpecialOffer.i(this.f26586i, null, r62, null)) {
                    composer2.startReplaceGroup(2074311534);
                    LocalThemeScope localThemeScope5 = this.f26587j;
                    composer2.startReplaceGroup(1849434622);
                    Object objB6 = composer2.B();
                    if (objB6 == companion3.a()) {
                        objB6 = h.f26580h;
                        composer2.t(objB6);
                    }
                    composer2.P();
                    Ki.Q.f(localThemeScope5, (Function1) objB6, ComposableLambdaKt.c(-161352165, r62, new i(this.f26587j), composer2, i11), composer2, i12 | 432);
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(2075090905);
                    composer2.P();
                }
                composer2.v();
                composer2.P();
                if (this.f26584g.getHelpersHashCode() != helpersHashCode) {
                    this.f26585h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
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
            SpecialOffer specialOffer = this.f26560a;
            LocalThemeScope localThemeScope = this.f26561b;
            Function1<Coupon, Unit> function1 = this.f26562c;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(companion, false, new j(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new k(nVar, 0, pairH.b(), specialOffer, localThemeScope, function1)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(SpecialOffer specialOffer, LocalThemeScope localThemeScope, Function1<? super Coupon, Unit> function1) {
            this.f26560a = specialOffer;
            this.f26561b = localThemeScope;
            this.f26562c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void c(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final el.SpecialOffer r24, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.F.c(Ki.M, androidx.compose.ui.Modifier, el.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, SpecialOffer specialOffer, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, specialOffer, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, SpecialOffer specialOffer) {
        function1.invoke(specialOffer.getCoupon());
        return Unit.f143329a;
    }
}
