package Im;

import Im.k;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.Q;
import Km.k;
import Km.l;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
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
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.List;
import java.util.Locale;
import ji.InterfaceC14914Q;
import ji.InterfaceC14932e0;
import ji.q1;
import ji.s1;
import kotlin.C17917Z;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import l0.w;
import ni.C15874z0;
import ni.P0;
import p1.C16193g;
import vi.s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001aP\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a]\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001926\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006\u000e\u0010\u001e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LKm/l$b;", "viewState", "Lkotlin/Function1;", "LKm/k;", "", "onAction", "t", "(LJi/M;Landroidx/compose/ui/Modifier;LKm/l$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "checked", "Lkotlin/ParameterName;", "name", "onCheckChanged", "w", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isClearAllButtonEnabled", "Lkotlin/Function0;", "onClearAllClicked", "k", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/coupons/api/models/Category;", "category", "Lkotlin/Function2;", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/coupons/api/models/Category;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isChecked", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f14150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14151c;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z10) {
            this.f14149a = localThemeScope;
            this.f14150b = function0;
            this.f14151c = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(812413318, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CategoryFilterHeader.<anonymous> (CouponFilterScreen.kt:205)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f14149a;
            Function0<Unit> function0 = this.f14150b;
            boolean z10 = this.f14151c;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null);
            String strC = C16193g.c(Nr.g.f22754r, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f140080j << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            C15874z0 c15874z0 = C15874z0.f151826a;
            String upperCase = C16193g.c(Y.f100149k1, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            P0.k(localThemeScope, c15874z0, upperCase, function0, null, null, false, 0L, z10, composer, (C15874z0.f151827b << 3) | i11, BinsView.TOTE_HEIGHT_DP);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Category f14153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f14154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Category, Boolean, Unit> f14155d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14156a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f14157b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<Category, Boolean, Unit> f14158c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Category f14159d;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, Function2<? super Category, ? super Boolean, Unit> function2, Category category) {
                this.f14156a = localThemeScope;
                this.f14157b = interfaceC5730l0;
                this.f14158c = function2;
                this.f14159d = category;
            }

            public final void b(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1290432326, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterCategory.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:272)");
                }
                LocalThemeScope localThemeScope = this.f14156a;
                q1.s.Checkbox defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                boolean zP = k.p(this.f14157b);
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(this.f14157b) | composer.V(this.f14158c) | composer.D(this.f14159d);
                final Function2<Category, Boolean, Unit> function2 = this.f14158c;
                final Category category = this.f14159d;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f14157b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Im.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k.b.a.c(function2, category, interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                s.b(localThemeScope, defaultToggleButton, zP, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.Checkbox.f140173e << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                b(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function2 function2, Category category, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                k.q(interfaceC5730l0, z10);
                function2.invoke(category, Boolean.valueOf(k.p(interfaceC5730l0)));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Category category, InterfaceC5730l0<Boolean> interfaceC5730l0, Function2<? super Category, ? super Boolean, Unit> function2) {
            this.f14152a = localThemeScope;
            this.f14153b = category;
            this.f14154c = interfaceC5730l0;
            this.f14155d = function2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-357476646, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterCategory.<anonymous> (CouponFilterScreen.kt:249)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            LocalThemeScope localThemeScope = this.f14152a;
            Category category = this.f14153b;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f14154c;
            Function2<Category, Boolean, Unit> function2 = this.f14155d;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, (category.getIsCustomCategory() || Intrinsics.e(category.getCategoryID(), "SPLOFRS")) ? localThemeScope.getAdsTypography().getHeadings().getSeven() : localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            String categoryName = category.getCategoryName();
            if (categoryName == null) {
                categoryName = "";
            }
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, categoryName, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.z(companion, H1.h.p(8)), composer, 6);
            q1.Label label2 = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(category.getOfferCountCategory());
            sb2.append(')');
            ri.j.h(localThemeScope, label2, sb2.toString(), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-1290432326, true, new a(localThemeScope, interfaceC5730l0, function2, category), composer, 54), composer, i11 | 384 | (s1.b.f140197b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14160a;

        c(LocalThemeScope localThemeScope) {
            this.f14160a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-109973738, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:65)");
            }
            LocalThemeScope localThemeScope = this.f14160a;
            ri.j.h(localThemeScope, new q1.Label(D.i(Modifier.INSTANCE, H1.h.p(16)), this.f14160a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 380, null), C16193g.c(Y.f100357u9, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Km.k, Unit> f14161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ViewState f14162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14163c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14164a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l.ViewState f14165b;

            a(LocalThemeScope localThemeScope, l.ViewState bVar) {
                this.f14164a = localThemeScope;
                this.f14165b = bVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1056720563, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:87)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = J.h(companion, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f14164a;
                l.ViewState bVar = this.f14165b;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                float f10 = 16;
                q1.Label label = new q1.Label(D.k(companion, H1.h.p(f10), 0.0f, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                String strC = C16193g.c(Bj.o.f2973G0, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                ri.j.h(localThemeScope, new q1.Label(D.k(companion, H1.h.p(f10), 0.0f, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 382, null), bVar.getCouponOptions().i().l(), null, composer, i11 | (i12 << 3), 4);
                C14802K.a(J.i(companion, H1.h.p(8)), composer, 6);
                C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Km.k, Unit> function1, l.ViewState bVar, LocalThemeScope localThemeScope) {
            this.f14161a = function1;
            this.f14162b = bVar;
            this.f14163c = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, l.ViewState bVar) {
            function1.invoke(new k.ShowSortOptions(bVar.h(), bVar.getCouponOptions().i()));
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1298652979, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:77)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f14161a) | composer.D(this.f14162b);
            final Function1<Km.k, Unit> function1 = this.f14161a;
            final l.ViewState bVar = this.f14162b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Im.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k.d.c(function1, bVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17985y.b((Function0) objB, null, false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(1056720563, true, new a(this.f14163c, this.f14162b), composer, 54), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14166a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ViewState f14167b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Km.k, Unit> f14168c;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, l.ViewState bVar, Function1<? super Km.k, Unit> function1) {
            this.f14166a = localThemeScope;
            this.f14167b = bVar;
            this.f14168c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, boolean z10) {
            function1.invoke(new k.ShowClippedCoupons(z10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, boolean z10) {
            function1.invoke(new k.ShowCategoryHeaders(z10));
            return Unit.f142422a;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1175749042, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:113)");
            }
            LocalThemeScope localThemeScope = this.f14166a;
            String strC = C16193g.c(Nr.g.f22745m0, composer, 0);
            boolean isShowClippedCoupons = this.f14167b.getCouponOptions().getIsShowClippedCoupons();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f14168c);
            final Function1<Km.k, Unit> function1 = this.f14168c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Im.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.e.d(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            Function1 function12 = (Function1) objB;
            composer.P();
            int i11 = LocalThemeScope.f15770g;
            k.w(localThemeScope, null, strC, isShowClippedCoupons, function12, composer, i11, 1);
            C17917Z.a(null, this.f14166a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            LocalThemeScope localThemeScope2 = this.f14166a;
            String strC2 = C16193g.c(Nr.g.f22743l0, composer, 0);
            boolean isShowCategoryHeaders = this.f14167b.getCouponOptions().getIsShowCategoryHeaders();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f14168c);
            final Function1<Km.k, Unit> function13 = this.f14168c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Im.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.e.e(function13, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            k.w(localThemeScope2, null, strC2, isShowCategoryHeaders, (Function1) objB2, composer, i11, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14169a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14170a;

            a(LocalThemeScope localThemeScope) {
                this.f14170a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1265533234, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:129)");
                }
                C17917Z.a(null, this.f14170a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

        f(LocalThemeScope localThemeScope) {
            this.f14169a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1052845105, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:128)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C17985y.a(J.h(companion, 0.0f, 1, null), null, 0L, 0L, null, H1.h.p(1), ComposableLambdaKt.c(1265533234, true, new a(this.f14169a), composer, 54), composer, 1769478, 30);
            C5662h.a(androidx.compose.foundation.b.d(J.i(J.h(companion, 0.0f, 1, null), H1.h.p(4)), this.f14169a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.ViewState f14172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Km.k, Unit> f14173c;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, l.ViewState bVar, Function1<? super Km.k, Unit> function1) {
            this.f14171a = localThemeScope;
            this.f14172b = bVar;
            this.f14173c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(k.b.f17380a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-929941168, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.CouponFilterScreen.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:141)");
            }
            LocalThemeScope localThemeScope = this.f14171a;
            boolean z10 = !this.f14172b.getCouponOptions().e().isEmpty();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f14173c);
            final Function1<Km.k, Unit> function1 = this.f14173c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Im.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k.g.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            k.k(localThemeScope, null, z10, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function2<Category, Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Km.k, Unit> f14174a;

        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super Km.k, Unit> function1) {
            this.f14174a = function1;
        }

        public final void a(Category cat, boolean z10) {
            Intrinsics.j(cat, "cat");
            this.f14174a.invoke(new k.CategorySelection(Category.a(cat, null, null, 0, false, z10, 15, null)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Category category, Boolean bool) {
            a(category, bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final i f14175f = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Category category) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f14176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f14177g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function1 function1, List list) {
            super(1);
            this.f14176f = function1;
            this.f14177g = list;
        }

        public final Object a(int i10) {
            return this.f14176f.invoke(this.f14177g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: Im.k$k, reason: collision with other inner class name */
    public static final class C0223k extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f14178f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14179g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f14180h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f14181i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0223k(List list, LocalThemeScope localThemeScope, Modifier modifier, Function1 function1) {
            super(4);
            this.f14178f = list;
            this.f14179g = localThemeScope;
            this.f14180h = modifier;
            this.f14181i = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            Category category = (Category) this.f14178f.get(i10);
            composer.startReplaceGroup(-1891409165);
            LocalThemeScope localThemeScope = this.f14179g;
            Modifier modifier = this.f14180h;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f14181i);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new h(this.f14181i);
                composer.t(objB);
            }
            composer.P();
            k.m(localThemeScope, modifier, category, (Function2) objB, composer, LocalThemeScope.f15770g, 0);
            C17917Z.a(null, this.f14179g.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f14182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14184c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14185d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f14186e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f14187f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f14189b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f14190c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f14191d;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, boolean z10, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super Boolean, Unit> function1) {
                this.f14188a = localThemeScope;
                this.f14189b = z10;
                this.f14190c = interfaceC5730l0;
                this.f14191d = function1;
            }

            public final void b(InterfaceC14932e0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(468322422, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.OptionToggleButton.<anonymous>.<anonymous>.<anonymous> (CouponFilterScreen.kt:186)");
                }
                LocalThemeScope localThemeScope = this.f14188a;
                q1.s.Switch trailingToggleButton = Assemble.getToggleButtons().getTrailingToggleButton();
                boolean z10 = this.f14189b;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f14190c) | composer.V(this.f14191d);
                final Function1<Boolean, Unit> function1 = this.f14191d;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f14190c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Im.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k.l.a.c(function1, interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                s.b(localThemeScope, trailingToggleButton, z10, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.Switch.f140183e << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
                b(interfaceC14932e0, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                k.B(interfaceC5730l0, !k.A(interfaceC5730l0));
                function1.invoke(Boolean.valueOf(k.A(interfaceC5730l0)));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(Modifier modifier, LocalThemeScope localThemeScope, String str, boolean z10, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super Boolean, Unit> function1) {
            this.f14182a = modifier;
            this.f14183b = localThemeScope;
            this.f14184c = str;
            this.f14185d = z10;
            this.f14186e = interfaceC5730l0;
            this.f14187f = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-969158489, i10, -1, "com.meijer.mobile.meijer.activity.coupons.compose.OptionToggleButton.<anonymous> (CouponFilterScreen.kt:175)");
            }
            float f10 = 16;
            Modifier modifierI = D.i(this.f14182a, H1.h.p(f10));
            LocalThemeScope localThemeScope = this.f14183b;
            String str = this.f14184c;
            boolean z10 = this.f14185d;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f14186e;
            Function1<Boolean, Unit> function1 = this.f14187f;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            I one = localThemeScope.getAdsTypography().getBody().getOne();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            q1.Label label = new q1.Label(D.k(companion2, H1.h.p(f10), 0.0f, 2, null), null, null, null, 0, false, 0, one, null, 382, null);
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope, label, str, null, composer, (q1.Label.f140080j << 3) | i11, 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion2, 1.0f, false, 2, null), composer, 0);
            Q.e(localThemeScope, s1.i.f140227a, ComposableLambdaKt.c(468322422, true, new a(localThemeScope, z10, interfaceC5730l0, function1), composer, 54), composer, i11 | 384 | (s1.i.f140228b << 3));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final boolean r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.k.k(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final com.meijer.mobile.coupons.api.models.Category r18, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.coupons.api.models.Category, ? super java.lang.Boolean, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.k.m(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.coupons.api.models.Category, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Category category, Function2 function2, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, category, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, Category category, Function2 function2, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, category, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final Km.l.ViewState r21, final kotlin.jvm.functions.Function1<? super Km.k, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.k.t(Ji.M, androidx.compose.ui.Modifier, Km.l$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(l.ViewState bVar, LocalThemeScope localThemeScope, Function1 function1, Modifier modifier, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-109973738, true, new c(localThemeScope)), 3, null);
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1298652979, true, new d(function1, bVar, localThemeScope)), 3, null);
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1175749042, true, new e(localThemeScope, bVar, function1)), 3, null);
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1052845105, true, new f(localThemeScope)), 3, null);
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-929941168, true, new g(localThemeScope, bVar, function1)), 3, null);
        List<Category> listD = bVar.d();
        LazyColumn.i(listD.size(), null, new j(i.f14175f, listD), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C0223k(listD, localThemeScope, modifier, function1)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, l.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, bVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final java.lang.String r25, final boolean r26, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.k.w(Ji.M, androidx.compose.ui.Modifier, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, String str, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, str, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5730l0 o(Category category) {
        return t1.e(Boolean.valueOf(category.getIsSelected()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function2 function2, Category category, InterfaceC5730l0 interfaceC5730l0) {
        q(interfaceC5730l0, !p(interfaceC5730l0));
        function2.invoke(category, Boolean.valueOf(p(interfaceC5730l0)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
        B(interfaceC5730l0, !A(interfaceC5730l0));
        function1.invoke(Boolean.valueOf(A(interfaceC5730l0)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5730l0 z(boolean z10) {
        return t1.e(Boolean.valueOf(z10), null, 2, null);
    }
}
