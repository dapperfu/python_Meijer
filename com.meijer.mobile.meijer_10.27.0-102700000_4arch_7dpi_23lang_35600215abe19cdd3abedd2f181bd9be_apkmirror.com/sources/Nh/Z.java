package Nh;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Vh.PaymentsCardDecorator;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.meijer.mobile.accounts.ux.payments.k;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import ji.ProductCardTags;
import ji.q1;
import kotlin.C17917Z;
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
import ni.C15809M;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;
import yr.C18299z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LVh/d;", "paymentsCardDecorator", "", "isMperksCardLinkingEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/payments/k;", "", "onResourceAction", "b", "(LJi/M;LVh/d;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isPrimaryCardEnabled", "isCardExpiredEnabled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class Z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PaymentsCardDecorator f21625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21626c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21627d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nh.Z$a$a, reason: collision with other inner class name */
        static final class C0345a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0345a f21628a = new C0345a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            C0345a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f21629a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f21630b;

            b(L1.h hVar, L1.h hVar2) {
                this.f21629a = hVar;
                this.f21630b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f21629a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f21630b.getBottom(), H1.h.p(8), 0.0f, 4, null);
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
            final /* synthetic */ L1.h f21631a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f21632b;

            c(L1.h hVar, L1.h hVar2) {
                this.f21631a = hVar;
                this.f21632b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f21631a.getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f21632b.getBottom(), H1.h.p(4), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21633a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f21634b;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, PaymentsCardDecorator paymentsCardDecorator) {
                this.f21633a = function1;
                this.f21634b = paymentsCardDecorator;
            }

            public final void a() {
                this.f21633a.invoke(new k.ShowMperksCardLinkingInfoBottomSheet(this.f21634b.getIsLinkedToMperks()));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f21636b;

            /* JADX WARN: Multi-variable type inference failed */
            e(Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, PaymentsCardDecorator paymentsCardDecorator) {
                this.f21635a = function1;
                this.f21636b = paymentsCardDecorator;
            }

            public final void a() {
                this.f21635a.invoke(new k.EditCard(this.f21636b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f21637a;

            f(L1.h hVar) {
                this.f21637a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f21637a.getBottom(), H1.h.p(8), 0.0f, 4, null);
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
            final /* synthetic */ L1.h f21638a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21639b;

            g(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f21638a = hVar;
                this.f21639b = localThemeScope;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f21638a.getBottom(), this.f21639b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final h f21640h = new h();

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
        static final class i implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21641a;

            i(LocalThemeScope localThemeScope) {
                this.f21641a = localThemeScope;
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
                    ComposerKt.U(-1682991079, i11, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsCard.kt:114)");
                }
                Hi.h.h(this.f21641a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f21641a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f21641a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f21641a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16193g.c(Fh.h.f10751n4, composer, 0), null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
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
        /* synthetic */ class j extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final j f21642h = new j();

            j() {
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
        static final class k implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21643a;

            k(LocalThemeScope localThemeScope) {
                this.f21643a = localThemeScope;
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
                    ComposerKt.U(503219394, i11, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsCard.kt:131)");
                }
                Hi.h.h(this.f21643a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f21643a.getAdsColors().getAdsColorActiveDanger(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f21643a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f21643a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16193g.c(Fh.h.f10480B, composer, 0), null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
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
        static final class l implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f21644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f21645b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21646c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f21647d;

            l(PaymentsCardDecorator paymentsCardDecorator, L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
                this.f21644a = paymentsCardDecorator;
                this.f21645b = hVar;
                this.f21646c = localThemeScope;
                this.f21647d = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                if (this.f21644a.getIsPrimary() || this.f21644a.getIsExpired()) {
                    x.a.a(constrainAs.getTop(), this.f21645b.getBottom(), this.f21646c.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                } else {
                    x.a.a(constrainAs.getTop(), this.f21647d.getBottom(), this.f21646c.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class m implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f21648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f21649b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f21650c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21651d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ L1.h f21652e;

            m(L1.h hVar, PaymentsCardDecorator paymentsCardDecorator, L1.h hVar2, LocalThemeScope localThemeScope, L1.h hVar3) {
                this.f21648a = hVar;
                this.f21649b = paymentsCardDecorator;
                this.f21650c = hVar2;
                this.f21651d = localThemeScope;
                this.f21652e = hVar3;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f21648a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                if (this.f21649b.getIsPrimary() || this.f21649b.getIsExpired()) {
                    x.a.a(constrainAs.getTop(), this.f21650c.getBottom(), this.f21651d.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                } else {
                    x.a.a(constrainAs.getTop(), this.f21652e.getBottom(), this.f21651d.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class n implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f21653a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f21654b;

            n(L1.h hVar, L1.h hVar2) {
                this.f21653a = hVar;
                this.f21654b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f21653a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f21654b.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class o implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f21655a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f21656b;

            o(L1.h hVar, L1.h hVar2) {
                this.f21655a = hVar;
                this.f21656b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f21655a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f21656b.getBottom(), H1.h.p(8), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class p extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f21657f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(L1.A a10) {
                super(1);
                this.f21657f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f21657f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f21658f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f21659g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f21660h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21661i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f21662j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f21663k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1 f21664l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Function1 function1) {
                super(2);
                this.f21659g = nVar;
                this.f21660h = function0;
                this.f21661i = localThemeScope;
                this.f21662j = paymentsCardDecorator;
                this.f21663k = z10;
                this.f21664l = function1;
                this.f21658f = i10;
            }

            public final void a(Composer composer, int i10) {
                int i11;
                int i12;
                int i13;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f21659g.getHelpersHashCode();
                this.f21659g.i();
                L1.n nVar = this.f21659g;
                composer.startReplaceGroup(1924403500);
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
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = C0345a.f21628a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C5658d c5658d = C5658d.f48555a;
                C5658d.f fVarE = c5658d.e();
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion3.i(), composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion4.a();
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
                D1.c(composerA, measurePolicyB, companion4.e());
                D1.c(composerA, interfaceC5742sR, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f21661i;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f21661i.getAdsTypography().getHeadings().getSix(), null, 383, null);
                String cardTypeName = this.f21662j.getCardTypeName();
                int i14 = LocalThemeScope.f15770g;
                int i15 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, cardTypeName, null, composer, (i15 << 3) | i14, 4);
                LocalThemeScope localThemeScope2 = this.f21661i;
                C15809M c15809m = C15809M.f151517a;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f21664l) | composer.D(this.f21662j);
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new e(this.f21664l, this.f21662j);
                    composer.t(objB2);
                }
                composer.P();
                P0.i(localThemeScope2, c15809m, (Function0) objB2, C.a.C3841m.f15350e, C16193g.c(Fh.h.f10509F0, composer, 0), null, false, false, 0L, composer, i14 | (C15809M.f151518b << 3) | (C.a.C3841m.f15351f << 9), 240);
                composer.v();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(hVarA);
                Object objB3 = composer.B();
                if (zV2 || objB3 == companion2.a()) {
                    objB3 = new f(hVarA);
                    composer.t(objB3);
                }
                composer.P();
                C17917Z.a(nVar.k(companion, hVarC, (Function1) objB3), 0L, 0.0f, 0.0f, composer, 0, 14);
                composer.startReplaceGroup(-1633490746);
                boolean zV3 = composer.V(hVarC) | composer.D(this.f21661i);
                Object objB4 = composer.B();
                if (zV3 || objB4 == companion2.a()) {
                    objB4 = new g(hVarC, this.f21661i);
                    composer.t(objB4);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB4);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                Function0<InterfaceC5811g> function0A2 = companion4.a();
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
                D1.c(composerA2, measurePolicyB2, companion4.e());
                D1.c(composerA2, interfaceC5742sR2, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion4.f());
                composer.startReplaceGroup(185375556);
                if (this.f21662j.getIsPrimary()) {
                    LocalThemeScope localThemeScope3 = this.f21661i;
                    i12 = 1849434622;
                    composer.startReplaceGroup(1849434622);
                    Object objB5 = composer.B();
                    if (objB5 == companion2.a()) {
                        objB5 = h.f21640h;
                        composer.t(objB5);
                    }
                    composer.P();
                    i13 = 54;
                    i11 = i14;
                    Ji.Q.f(localThemeScope3, (Function1) objB5, ComposableLambdaKt.c(-1682991079, true, new i(this.f21661i), composer, 54), composer, i11 | 432);
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion, this.f21661i.getAdsSpacing().getThree().getDp()), composer, 0);
                } else {
                    i11 = i14;
                    i12 = 1849434622;
                    i13 = 54;
                }
                composer.P();
                composer.startReplaceGroup(185404889);
                if (this.f21662j.getIsExpired()) {
                    LocalThemeScope localThemeScope4 = this.f21661i;
                    composer.startReplaceGroup(i12);
                    Object objB6 = composer.B();
                    if (objB6 == companion2.a()) {
                        objB6 = j.f21642h;
                        composer.t(objB6);
                    }
                    composer.P();
                    Ji.Q.f(localThemeScope4, (Function1) objB6, ComposableLambdaKt.c(503219394, true, new k(this.f21661i), composer, i13), composer, i11 | 432);
                }
                composer.P();
                composer.v();
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(this.f21662j) | composer.V(hVarD) | composer.D(this.f21661i) | composer.V(hVarC);
                Object objB7 = composer.B();
                if (zD || objB7 == companion2.a()) {
                    objB7 = new l(this.f21662j, hVarD, this.f21661i, hVarC);
                    composer.t(objB7);
                }
                composer.P();
                int i16 = i11;
                C13457y.a(C16190d.c(this.f21662j.getCardType().b(), composer, 0), null, nVar.k(companion, hVarE, (Function1) objB7), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                LocalThemeScope localThemeScope5 = this.f21661i;
                Ji.I seven = localThemeScope5.getAdsTypography().getHeadings().getSeven();
                composer.startReplaceGroup(-1224400529);
                boolean zV4 = composer.V(hVarE) | composer.D(this.f21662j) | composer.V(hVarD) | composer.D(this.f21661i) | composer.V(hVarC);
                Object objB8 = composer.B();
                if (zV4 || objB8 == companion2.a()) {
                    Object mVar = new m(hVarE, this.f21662j, hVarD, this.f21661i, hVarC);
                    composer.t(mVar);
                    objB8 = mVar;
                }
                composer.P();
                q1.Label label2 = new q1.Label(nVar.k(companion, hVarF, (Function1) objB8), null, null, null, 0, false, 0, seven, null, 382, null);
                AbstractC5607a cardDescription = this.f21662j.getCardDescription();
                int i17 = AbstractC5607a.f45514b;
                ri.j.h(localThemeScope5, label2, C6408b.a(cardDescription, composer, i17), null, composer, i16 | (i15 << 3), 4);
                LocalThemeScope localThemeScope6 = this.f21661i;
                Ji.I one = localThemeScope6.getAdsTypography().getBodyCompact().getOne();
                composer.startReplaceGroup(-1633490746);
                boolean zV5 = composer.V(hVarE) | composer.V(hVarF);
                Object objB9 = composer.B();
                if (zV5 || objB9 == companion2.a()) {
                    objB9 = new n(hVarE, hVarF);
                    composer.t(objB9);
                }
                composer.P();
                ri.j.h(localThemeScope6, new q1.Label(nVar.k(companion, hVarG, (Function1) objB9), null, null, null, 0, false, 0, one, null, 382, null), C6408b.a(this.f21662j.getCardExpirationDate(), composer, i17), null, composer, i16 | (i15 << 3), 4);
                LocalThemeScope localThemeScope7 = this.f21661i;
                Ji.I one2 = localThemeScope7.getAdsTypography().getBodyCompact().getOne();
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(hVarE) | composer.V(hVarG);
                Object objB10 = composer.B();
                if (zV6 || objB10 == companion2.a()) {
                    objB10 = new o(hVarE, hVarG);
                    composer.t(objB10);
                }
                composer.P();
                ri.j.h(localThemeScope7, new q1.Label(nVar.k(companion, hVarH, (Function1) objB10), null, null, null, 0, false, 0, one2, null, 382, null), this.f21662j.getCardHolderName(), null, composer, i16 | (i15 << 3), 4);
                composer.startReplaceGroup(-1184667231);
                if (this.f21663k) {
                    Z0.c cVarC = C16190d.c(this.f21662j.getIsLinkedToMperks() ? Bj.i.f2746h2 : Bj.i.f2750i2, composer, 0);
                    String strC = C16193g.c(this.f21662j.getIsLinkedToMperks() ? Bj.o.f2972G : Bj.o.f2974H, composer, 0);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV7 = composer.V(hVarE) | composer.V(hVarH);
                    Object objB11 = composer.B();
                    if (zV7 || objB11 == companion2.a()) {
                        objB11 = new b(hVarE, hVarH);
                        composer.t(objB11);
                    }
                    composer.P();
                    C13457y.a(cVarC, strC, nVar.k(companion, hVarI, (Function1) objB11), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV8 = composer.V(hVarI) | composer.V(hVarH);
                    Object objB12 = composer.B();
                    if (zV8 || objB12 == companion2.a()) {
                        objB12 = new c(hVarI, hVarH);
                        composer.t(objB12);
                    }
                    composer.P();
                    Modifier modifierK3 = nVar.k(companion, hVarJ, (Function1) objB12);
                    MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
                    int iA3 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK3);
                    Function0<InterfaceC5811g> function0A3 = companion4.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A3);
                    } else {
                        composer.s();
                    }
                    Composer composerA3 = D1.a(composer);
                    D1.c(composerA3, measurePolicyG, companion4.e());
                    D1.c(composerA3, interfaceC5742sR3, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C5664j c5664j = C5664j.f48612a;
                    Modifier modifierF = C18299z.f(companion, "payments_card_linking_button", null, 2, null);
                    ni.N n10 = ni.N.f151529a;
                    C.i.h hVar = C.i.h.f15557d;
                    String strC2 = C16193g.c(Fh.h.f10665b2, composer, 0);
                    LocalThemeScope localThemeScope8 = this.f21661i;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV9 = composer.V(this.f21664l) | composer.D(this.f21662j);
                    Object objB13 = composer.B();
                    if (zV9 || objB13 == companion2.a()) {
                        objB13 = new d(this.f21664l, this.f21662j);
                        composer.t(objB13);
                    }
                    composer.P();
                    P0.i(localThemeScope8, n10, (Function0) objB13, hVar, strC2, modifierF, false, false, 0L, composer, i16 | (ni.N.f151530b << 3) | (C.i.h.f15558e << 9), 224);
                    composer.v();
                }
                composer.P();
                composer.P();
                if (this.f21659g.getHelpersHashCode() != helpersHashCode) {
                    this.f21660h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1) {
            this.f21624a = localThemeScope;
            this.f21625b = paymentsCardDecorator;
            this.f21626c = z10;
            this.f21627d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1270926674, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsCard.<anonymous> (PaymentsCard.kt:70)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16));
            LocalThemeScope localThemeScope = this.f21624a;
            PaymentsCardDecorator paymentsCardDecorator = this.f21625b;
            boolean z10 = this.f21626c;
            Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f21627d;
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
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierI, false, new p(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new q(nVar, 6, pairH.b(), localThemeScope, paymentsCardDecorator, z10, function1)), pairH.a(), composer, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r19, final Vh.PaymentsCardDecorator r20, final boolean r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.Z.b(Ji.M, Vh.d, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, paymentsCardDecorator, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
