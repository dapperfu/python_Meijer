package Oh;

import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Wh.PaymentsCardDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.payments.k;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import ki.ProductCardTags;
import ki.q1;
import kotlin.C17983Z;
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
import oi.C16143M;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;
import yr.C18370z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LWh/d;", "paymentsCardDecorator", "", "isMperksCardLinkingEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/payments/k;", "", "onResourceAction", "b", "(LKi/M;LWh/d;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isPrimaryCardEnabled", "isCardExpiredEnabled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PaymentsCardDecorator f23867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f23869d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oh.Z$a$a, reason: collision with other inner class name */
        static final class C0384a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0384a f23870a = new C0384a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            C0384a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f23871a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f23872b;

            b(L1.h hVar, L1.h hVar2) {
                this.f23871a = hVar;
                this.f23872b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f23871a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f23872b.getBottom(), H1.h.p(8), 0.0f, 4, null);
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
            final /* synthetic */ L1.h f23873a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f23874b;

            c(L1.h hVar, L1.h hVar2) {
                this.f23873a = hVar;
                this.f23874b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f23873a.getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f23874b.getBottom(), H1.h.p(4), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f23875a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f23876b;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, PaymentsCardDecorator paymentsCardDecorator) {
                this.f23875a = function1;
                this.f23876b = paymentsCardDecorator;
            }

            public final void a() {
                this.f23875a.invoke(new k.ShowMperksCardLinkingInfoBottomSheet(this.f23876b.getIsLinkedToMperks()));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f23877a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f23878b;

            /* JADX WARN: Multi-variable type inference failed */
            e(Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, PaymentsCardDecorator paymentsCardDecorator) {
                this.f23877a = function1;
                this.f23878b = paymentsCardDecorator;
            }

            public final void a() {
                this.f23877a.invoke(new k.EditCard(this.f23878b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f23879a;

            f(L1.h hVar) {
                this.f23879a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f23879a.getBottom(), H1.h.p(8), 0.0f, 4, null);
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
            final /* synthetic */ L1.h f23880a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23881b;

            g(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f23880a = hVar;
                this.f23881b = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f23880a.getBottom(), this.f23881b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final h f23882h = new h();

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
            final /* synthetic */ LocalThemeScope f23883a;

            i(LocalThemeScope localThemeScope) {
                this.f23883a = localThemeScope;
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
                Ii.h.h(this.f23883a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f23883a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f23883a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f23883a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16338g.c(Gh.h.f12942n4, composer, 0), null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
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
        /* synthetic */ class j extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final j f23884h = new j();

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
            final /* synthetic */ LocalThemeScope f23885a;

            k(LocalThemeScope localThemeScope) {
                this.f23885a = localThemeScope;
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
                Ii.h.h(this.f23885a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f23885a.getAdsColors().getAdsColorActiveDanger(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f23885a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f23885a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16338g.c(Gh.h.f12671B, composer, 0), null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
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
        static final class l implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f23886a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f23887b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23888c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f23889d;

            l(PaymentsCardDecorator paymentsCardDecorator, L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
                this.f23886a = paymentsCardDecorator;
                this.f23887b = hVar;
                this.f23888c = localThemeScope;
                this.f23889d = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                if (this.f23886a.getIsPrimary() || this.f23886a.getIsExpired()) {
                    x.a.a(constrainAs.getTop(), this.f23887b.getBottom(), this.f23888c.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                } else {
                    x.a.a(constrainAs.getTop(), this.f23889d.getBottom(), this.f23888c.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class m implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f23890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f23891b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f23892c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23893d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ L1.h f23894e;

            m(L1.h hVar, PaymentsCardDecorator paymentsCardDecorator, L1.h hVar2, LocalThemeScope localThemeScope, L1.h hVar3) {
                this.f23890a = hVar;
                this.f23891b = paymentsCardDecorator;
                this.f23892c = hVar2;
                this.f23893d = localThemeScope;
                this.f23894e = hVar3;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f23890a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                if (this.f23891b.getIsPrimary() || this.f23891b.getIsExpired()) {
                    x.a.a(constrainAs.getTop(), this.f23892c.getBottom(), this.f23893d.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                } else {
                    x.a.a(constrainAs.getTop(), this.f23894e.getBottom(), this.f23893d.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class n implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f23895a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f23896b;

            n(L1.h hVar, L1.h hVar2) {
                this.f23895a = hVar;
                this.f23896b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f23895a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f23896b.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class o implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f23897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f23898b;

            o(L1.h hVar, L1.h hVar2) {
                this.f23897a = hVar;
                this.f23898b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f23897a.getEnd(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f23898b.getBottom(), H1.h.p(8), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class p extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f23899f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(L1.A a10) {
                super(1);
                this.f23899f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f23899f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f23900f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f23901g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f23902h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23903i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ PaymentsCardDecorator f23904j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f23905k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1 f23906l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Function1 function1) {
                super(2);
                this.f23901g = nVar;
                this.f23902h = function0;
                this.f23903i = localThemeScope;
                this.f23904j = paymentsCardDecorator;
                this.f23905k = z10;
                this.f23906l = function1;
                this.f23900f = i10;
            }

            public final void a(Composer composer, int i10) {
                int i11;
                int i12;
                int i13;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f23901g.getHelpersHashCode();
                this.f23901g.i();
                L1.n nVar = this.f23901g;
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
                    objB = C0384a.f23870a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C5800d c5800d = C5800d.f48779a;
                C5800d.f fVarE = c5800d.e();
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion3.i(), composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion4.a();
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
                D1.c(composerA, measurePolicyB, companion4.e());
                D1.c(composerA, interfaceC5884sR, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14889J c14889j = C14889J.f139620a;
                LocalThemeScope localThemeScope = this.f23903i;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f23903i.getAdsTypography().getHeadings().getSix(), null, 383, null);
                String cardTypeName = this.f23904j.getCardTypeName();
                int i14 = LocalThemeScope.f17314g;
                int i15 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, cardTypeName, null, composer, (i15 << 3) | i14, 4);
                LocalThemeScope localThemeScope2 = this.f23903i;
                C16143M c16143m = C16143M.f153976a;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f23906l) | composer.D(this.f23904j);
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new e(this.f23906l, this.f23904j);
                    composer.t(objB2);
                }
                composer.P();
                P0.i(localThemeScope2, c16143m, (Function0) objB2, C.a.C3927m.f16894e, C16338g.c(Gh.h.f12700F0, composer, 0), null, false, false, 0L, composer, i14 | (C16143M.f153977b << 3) | (C.a.C3927m.f16895f << 9), 240);
                composer.v();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(hVarA);
                Object objB3 = composer.B();
                if (zV2 || objB3 == companion2.a()) {
                    objB3 = new f(hVarA);
                    composer.t(objB3);
                }
                composer.P();
                C17983Z.a(nVar.k(companion, hVarC, (Function1) objB3), 0L, 0.0f, 0.0f, composer, 0, 14);
                composer.startReplaceGroup(-1633490746);
                boolean zV3 = composer.V(hVarC) | composer.D(this.f23903i);
                Object objB4 = composer.B();
                if (zV3 || objB4 == companion2.a()) {
                    objB4 = new g(hVarC, this.f23903i);
                    composer.t(objB4);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB4);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                Function0<InterfaceC5953g> function0A2 = companion4.a();
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
                D1.c(composerA2, measurePolicyB2, companion4.e());
                D1.c(composerA2, interfaceC5884sR2, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion4.f());
                composer.startReplaceGroup(185375556);
                if (this.f23904j.getIsPrimary()) {
                    LocalThemeScope localThemeScope3 = this.f23903i;
                    i12 = 1849434622;
                    composer.startReplaceGroup(1849434622);
                    Object objB5 = composer.B();
                    if (objB5 == companion2.a()) {
                        objB5 = h.f23882h;
                        composer.t(objB5);
                    }
                    composer.P();
                    i13 = 54;
                    i11 = i14;
                    Ki.Q.f(localThemeScope3, (Function1) objB5, ComposableLambdaKt.c(-1682991079, true, new i(this.f23903i), composer, 54), composer, i11 | 432);
                    C14890K.a(androidx.compose.foundation.layout.J.z(companion, this.f23903i.getAdsSpacing().getThree().getDp()), composer, 0);
                } else {
                    i11 = i14;
                    i12 = 1849434622;
                    i13 = 54;
                }
                composer.P();
                composer.startReplaceGroup(185404889);
                if (this.f23904j.getIsExpired()) {
                    LocalThemeScope localThemeScope4 = this.f23903i;
                    composer.startReplaceGroup(i12);
                    Object objB6 = composer.B();
                    if (objB6 == companion2.a()) {
                        objB6 = j.f23884h;
                        composer.t(objB6);
                    }
                    composer.P();
                    Ki.Q.f(localThemeScope4, (Function1) objB6, ComposableLambdaKt.c(503219394, true, new k(this.f23903i), composer, i13), composer, i11 | 432);
                }
                composer.P();
                composer.v();
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(this.f23904j) | composer.V(hVarD) | composer.D(this.f23903i) | composer.V(hVarC);
                Object objB7 = composer.B();
                if (zD || objB7 == companion2.a()) {
                    objB7 = new l(this.f23904j, hVarD, this.f23903i, hVarC);
                    composer.t(objB7);
                }
                composer.P();
                int i16 = i11;
                C13590y.a(C16335d.c(this.f23904j.getCardType().b(), composer, 0), null, nVar.k(companion, hVarE, (Function1) objB7), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                LocalThemeScope localThemeScope5 = this.f23903i;
                Ki.I seven = localThemeScope5.getAdsTypography().getHeadings().getSeven();
                composer.startReplaceGroup(-1224400529);
                boolean zV4 = composer.V(hVarE) | composer.D(this.f23904j) | composer.V(hVarD) | composer.D(this.f23903i) | composer.V(hVarC);
                Object objB8 = composer.B();
                if (zV4 || objB8 == companion2.a()) {
                    Object mVar = new m(hVarE, this.f23904j, hVarD, this.f23903i, hVarC);
                    composer.t(mVar);
                    objB8 = mVar;
                }
                composer.P();
                q1.Label label2 = new q1.Label(nVar.k(companion, hVarF, (Function1) objB8), null, null, null, 0, false, 0, seven, null, 382, null);
                AbstractC6392a cardDescription = this.f23904j.getCardDescription();
                int i17 = AbstractC6392a.f60445b;
                si.j.h(localThemeScope5, label2, C13698b.a(cardDescription, composer, i17), null, composer, i16 | (i15 << 3), 4);
                LocalThemeScope localThemeScope6 = this.f23903i;
                Ki.I one = localThemeScope6.getAdsTypography().getBodyCompact().getOne();
                composer.startReplaceGroup(-1633490746);
                boolean zV5 = composer.V(hVarE) | composer.V(hVarF);
                Object objB9 = composer.B();
                if (zV5 || objB9 == companion2.a()) {
                    objB9 = new n(hVarE, hVarF);
                    composer.t(objB9);
                }
                composer.P();
                si.j.h(localThemeScope6, new q1.Label(nVar.k(companion, hVarG, (Function1) objB9), null, null, null, 0, false, 0, one, null, 382, null), C13698b.a(this.f23904j.getCardExpirationDate(), composer, i17), null, composer, i16 | (i15 << 3), 4);
                LocalThemeScope localThemeScope7 = this.f23903i;
                Ki.I one2 = localThemeScope7.getAdsTypography().getBodyCompact().getOne();
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(hVarE) | composer.V(hVarG);
                Object objB10 = composer.B();
                if (zV6 || objB10 == companion2.a()) {
                    objB10 = new o(hVarE, hVarG);
                    composer.t(objB10);
                }
                composer.P();
                si.j.h(localThemeScope7, new q1.Label(nVar.k(companion, hVarH, (Function1) objB10), null, null, null, 0, false, 0, one2, null, 382, null), this.f23904j.getCardHolderName(), null, composer, i16 | (i15 << 3), 4);
                composer.startReplaceGroup(-1184667231);
                if (this.f23905k) {
                    Z0.c cVarC = C16335d.c(this.f23904j.getIsLinkedToMperks() ? Cj.i.f4791h2 : Cj.i.f4795i2, composer, 0);
                    String strC = C16338g.c(this.f23904j.getIsLinkedToMperks() ? Cj.o.f5017G : Cj.o.f5019H, composer, 0);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV7 = composer.V(hVarE) | composer.V(hVarH);
                    Object objB11 = composer.B();
                    if (zV7 || objB11 == companion2.a()) {
                        objB11 = new b(hVarE, hVarH);
                        composer.t(objB11);
                    }
                    composer.P();
                    C13590y.a(cVarC, strC, nVar.k(companion, hVarI, (Function1) objB11), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV8 = composer.V(hVarI) | composer.V(hVarH);
                    Object objB12 = composer.B();
                    if (zV8 || objB12 == companion2.a()) {
                        objB12 = new c(hVarI, hVarH);
                        composer.t(objB12);
                    }
                    composer.P();
                    Modifier modifierK3 = nVar.k(companion, hVarJ, (Function1) objB12);
                    MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
                    int iA3 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK3);
                    Function0<InterfaceC5953g> function0A3 = companion4.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A3);
                    } else {
                        composer.s();
                    }
                    Composer composerA3 = D1.a(composer);
                    D1.c(composerA3, measurePolicyG, companion4.e());
                    D1.c(composerA3, interfaceC5884sR3, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C5806j c5806j = C5806j.f48836a;
                    Modifier modifierF = C18370z.f(companion, "payments_card_linking_button", null, 2, null);
                    oi.N n10 = oi.N.f153988a;
                    C.i.h hVar = C.i.h.f17101d;
                    String strC2 = C16338g.c(Gh.h.f12856b2, composer, 0);
                    LocalThemeScope localThemeScope8 = this.f23903i;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV9 = composer.V(this.f23906l) | composer.D(this.f23904j);
                    Object objB13 = composer.B();
                    if (zV9 || objB13 == companion2.a()) {
                        objB13 = new d(this.f23906l, this.f23904j);
                        composer.t(objB13);
                    }
                    composer.P();
                    P0.i(localThemeScope8, n10, (Function0) objB13, hVar, strC2, modifierF, false, false, 0L, composer, i16 | (oi.N.f153989b << 3) | (C.i.h.f17102e << 9), 224);
                    composer.v();
                }
                composer.P();
                composer.P();
                if (this.f23901g.getHelpersHashCode() != helpersHashCode) {
                    this.f23902h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1) {
            this.f23866a = localThemeScope;
            this.f23867b = paymentsCardDecorator;
            this.f23868c = z10;
            this.f23869d = function1;
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
            LocalThemeScope localThemeScope = this.f23866a;
            PaymentsCardDecorator paymentsCardDecorator = this.f23867b;
            boolean z10 = this.f23868c;
            Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f23869d;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierI, false, new p(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new q(nVar, 6, pairH.b(), localThemeScope, paymentsCardDecorator, z10, function1)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r19, final Wh.PaymentsCardDecorator r20, final boolean r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.Z.b(Ki.M, Wh.d, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, paymentsCardDecorator, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
