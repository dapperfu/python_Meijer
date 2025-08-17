package Lj;

import Ji.LocalThemeScope;
import Ji.Q;
import Lj.g;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.ProductCardTags;
import ji.m1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÑ\u0001\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a;\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0001¢\u0006\u0004\b#\u0010$\u001a,\u0010(\u001a\u00020\u0017*\u00020\u00002\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00170%¢\u0006\u0002\b'H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "showOOSTag", "showLowStockTag", "showBuyAgainTag", "showAgeRestrictedTag", "showMperksTag", "showPickupOnlyTag", "showInStoreOnlyTag", "showSaleTag", "showSponsoredProductTag", "", "oosTagText", "lowStockTagText", "buyAgainTagText", "inStoreOnlyText", "ageRestrictedTagText", "mPerksTagText", "pickupOnlyTagText", "saleTagText", "sponsoredProductTagText", "", "l", "(LJi/M;Landroidx/compose/ui/Modifier;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "tagText", "h", "(LJi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "n", "LH1/h;", "horizontalPaddingBetweenItems", "verticalPaddingBetweenItems", "Lkotlin/Function0;", "content", "f", "(Landroidx/compose/ui/Modifier;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Lji/m1$b;", "Lkotlin/ExtensionFunctionType;", "j", "(LJi/M;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f18485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f18486b;

        a(float f10, float f11) {
            this.f18485a = f10;
            this.f18486b = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, List list2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                f0.a.l(layout, (f0) obj, ((Number) ((Pair) list2.get(i10)).c()).intValue(), ((Number) ((Pair) list2.get(i10)).d()).intValue(), 0.0f, 4, null);
                i10 = i11;
            }
            return Unit.f142422a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            List<? extends I> list = measurables;
            final ArrayList<f0> arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((I) it.next()).k0(j10));
            }
            int iI1 = (int) Layout.I1(this.f18485a);
            final ArrayList arrayList2 = new ArrayList();
            float f10 = this.f18485a;
            float f11 = this.f18486b;
            int iMax = 0;
            int iI12 = 0;
            for (f0 f0Var : arrayList) {
                if (f0Var.M0() + iI1 >= H1.b.l(j10)) {
                    iI1 = (int) Layout.I1(f10);
                    iI12 += iMax + ((int) Layout.I1(f11));
                    iMax = 0;
                }
                arrayList2.add(new Pair(Integer.valueOf(iI1), Integer.valueOf(iI12)));
                iI1 += f0Var.M0() + ((int) Layout.I1(f10));
                iMax = Math.max(iMax, f0Var.J0());
            }
            if (iI12 > 0) {
                iMax += iI12;
            }
            return K.G0(Layout, H1.b.l(j10), iMax, null, new Function1() { // from class: Lj.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.b(arrayList, arrayList2, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

        /* renamed from: h, reason: collision with root package name */
        public static final b f18487h = new b();

        b() {
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
    static final class c implements Function3<ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18489b;

        c(LocalThemeScope localThemeScope, String str) {
            this.f18488a = localThemeScope;
            this.f18489b = str;
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
                ComposerKt.U(-862592224, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.MPerksTag.<anonymous> (ProductCardTags.kt:138)");
            }
            Hi.h.h(this.f18488a, q1.Tag.y(Assemble.getTags().getLowStock(), this.f18488a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getLowStock().getLabel(), Assemble.getTags().getLowStock().getLabel().getModifier().then(D.k(Modifier.INSTANCE, this.f18488a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), this.f18488a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), this.f18489b, null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
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
    /* synthetic */ class d extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

        /* renamed from: h, reason: collision with root package name */
        public static final d f18490h = new d();

        d() {
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
    static final class e implements Function3<ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18491a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3<m1.ProductCardTags, Composer, Integer, Unit> f18492b;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function3<? super m1.ProductCardTags, ? super Composer, ? super Integer, Unit> function3) {
            this.f18491a = localThemeScope;
            this.f18492b = function3;
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
                ComposerKt.U(-1438559793, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.ModifiedProductCardTag.<anonymous> (ProductCardTags.kt:228)");
            }
            m1.ProductCardTags tags = Assemble.getTags();
            q1.Tag lowStock = Assemble.getTags().getLowStock();
            q1.Label label = Assemble.getTags().getLowStock().getLabel();
            Modifier modifier = Assemble.getTags().getLowStock().getLabel().getModifier();
            Modifier.Companion companion = Modifier.INSTANCE;
            this.f18492b.invoke(m1.ProductCardTags.e(tags, q1.Tag.y(lowStock, null, q1.Label.y(label, modifier.then(D.k(companion, this.f18491a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), q1.Tag.y(Assemble.getTags().getPickupOnly(), null, q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(D.k(companion, this.f18491a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), q1.Tag.y(Assemble.getTags().getOutOfStock(), null, q1.Label.y(Assemble.getTags().getOutOfStock().getLabel(), Assemble.getTags().getOutOfStock().getLabel().getModifier().then(D.k(companion, this.f18491a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), null, q1.Tag.y(Assemble.getTags().getSponsored(), null, q1.Label.y(Assemble.getTags().getSponsored().getLabel(), Assemble.getTags().getSponsored().getLabel().getModifier().then(D.k(companion, this.f18491a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), q1.Tag.y(Assemble.getTags().getMperks(), null, q1.Label.y(Assemble.getTags().getMperks().getLabel(), Assemble.getTags().getMperks().getLabel().getModifier().then(D.k(companion, this.f18491a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 13, null), 8, null), composer, Integer.valueOf(m1.ProductCardTags.f139903g));
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18496d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f18497e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f18498f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f18499g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f18500h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f18501i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f18502j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f18503k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f18504l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f18505m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f18506n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f18507o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18508p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f18509q;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18511b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f18510a = localThemeScope;
                this.f18511b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1395599514, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:60)");
                }
                Hi.h.h(this.f18510a, ModifiedProductCardTag.getLowStock(), this.f18511b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18512a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18513b;

            b(LocalThemeScope localThemeScope, String str) {
                this.f18512a = localThemeScope;
                this.f18513b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(55935517, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:67)");
                }
                Hi.h.h(this.f18512a, ModifiedProductCardTag.getOutOfStock(), this.f18513b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18514a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18515b;

            c(LocalThemeScope localThemeScope, String str) {
                this.f18514a = localThemeScope;
                this.f18515b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(825925519, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:76)");
                }
                Hi.h.h(this.f18514a, ModifiedProductCardTag.getPickupOnly(), this.f18515b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18517b;

            d(LocalThemeScope localThemeScope, String str) {
                this.f18516a = localThemeScope;
                this.f18517b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(529882734, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:85)");
                }
                Hi.h.h(this.f18516a, ModifiedProductCardTag.getPickupOnly(), this.f18517b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18518a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18519b;

            e(LocalThemeScope localThemeScope, String str) {
                this.f18518a = localThemeScope;
                this.f18519b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-62202836, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:98)");
                }
                Hi.h.h(this.f18518a, ModifiedProductCardTag.getPickupOnly(), this.f18519b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lj.g$f$f, reason: collision with other inner class name */
        static final class C0310f implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18520a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f18521b;

            C0310f(LocalThemeScope localThemeScope, String str) {
                this.f18520a = localThemeScope;
                this.f18521b = str;
            }

            public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
                Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-358245621, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:108)");
                }
                Hi.h.h(this.f18520a, ModifiedProductCardTag.getPickupOnly(), this.f18521b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        f(boolean z10, LocalThemeScope localThemeScope, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15, boolean z16, boolean z17, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f18493a = z10;
            this.f18494b = localThemeScope;
            this.f18495c = z11;
            this.f18496d = z12;
            this.f18497e = z13;
            this.f18498f = z14;
            this.f18499g = str;
            this.f18500h = z15;
            this.f18501i = z16;
            this.f18502j = z17;
            this.f18503k = str2;
            this.f18504l = str3;
            this.f18505m = str4;
            this.f18506n = str5;
            this.f18507o = str6;
            this.f18508p = str7;
            this.f18509q = str8;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-301596804, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:58)");
            }
            if (this.f18493a) {
                composer.startReplaceGroup(201241708);
                LocalThemeScope localThemeScope = this.f18494b;
                g.j(localThemeScope, ComposableLambdaKt.c(-1395599514, true, new a(localThemeScope, this.f18504l), composer, 54), composer, LocalThemeScope.f15770g | 48);
                composer.P();
            } else if (this.f18495c) {
                composer.startReplaceGroup(201511439);
                LocalThemeScope localThemeScope2 = this.f18494b;
                g.j(localThemeScope2, ComposableLambdaKt.c(55935517, true, new b(localThemeScope2, this.f18505m), composer, 54), composer, LocalThemeScope.f15770g | 48);
                composer.P();
            } else {
                composer.startReplaceGroup(201748806);
                composer.P();
            }
            composer.startReplaceGroup(-2071701097);
            if (this.f18496d) {
                LocalThemeScope localThemeScope3 = this.f18494b;
                g.j(localThemeScope3, ComposableLambdaKt.c(825925519, true, new c(localThemeScope3, this.f18506n), composer, 54), composer, LocalThemeScope.f15770g | 48);
            }
            composer.P();
            composer.startReplaceGroup(-2071691475);
            if (this.f18497e) {
                LocalThemeScope localThemeScope4 = this.f18494b;
                g.j(localThemeScope4, ComposableLambdaKt.c(529882734, true, new d(localThemeScope4, this.f18507o), composer, 54), composer, LocalThemeScope.f15770g | 48);
            }
            composer.P();
            composer.startReplaceGroup(-2071682353);
            if (this.f18498f) {
                g.h(this.f18494b, this.f18499g, composer, LocalThemeScope.f15770g);
            }
            composer.P();
            composer.startReplaceGroup(-2071678828);
            if (this.f18500h) {
                LocalThemeScope localThemeScope5 = this.f18494b;
                g.j(localThemeScope5, ComposableLambdaKt.c(-62202836, true, new e(localThemeScope5, this.f18508p), composer, 54), composer, LocalThemeScope.f15770g | 48);
            }
            composer.P();
            composer.startReplaceGroup(-2071666221);
            if (this.f18501i) {
                LocalThemeScope localThemeScope6 = this.f18494b;
                g.j(localThemeScope6, ComposableLambdaKt.c(-358245621, true, new C0310f(localThemeScope6, this.f18509q), composer, 54), composer, LocalThemeScope.f15770g | 48);
            }
            composer.P();
            if (this.f18502j) {
                g.n(this.f18494b, this.f18503k, composer, LocalThemeScope.f15770g);
            }
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
    /* renamed from: Lj.g$g, reason: collision with other inner class name */
    static final class C0311g implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18523b;

        C0311g(LocalThemeScope localThemeScope, String str) {
            this.f18522a = localThemeScope;
            this.f18523b = str;
        }

        public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
            Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1737334239, i10, -1, "com.meijer.mobile.core.design.compose.widget.tags.ProductTags.<anonymous>.<anonymous>.<anonymous> (ProductCardTags.kt:125)");
            }
            Hi.h.h(this.f18522a, ModifiedProductCardTag.getSponsored(), this.f18523b, null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
            a(productCardTags, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

        /* renamed from: h, reason: collision with root package name */
        public static final h f18524h = new h();

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
        final /* synthetic */ LocalThemeScope f18525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18526b;

        i(LocalThemeScope localThemeScope, String str) {
            this.f18525a = localThemeScope;
            this.f18526b = str;
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
                ComposerKt.U(1293483281, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.SaleTag.<anonymous> (ProductCardTags.kt:159)");
            }
            Hi.h.h(this.f18525a, q1.Tag.y(Assemble.getTags().getLowStock(), this.f18525a.getAdsColors().getAdsColorSupportErrorBg(), q1.Label.y(Assemble.getTags().getLowStock().getLabel(), Assemble.getTags().getLowStock().getLabel().getModifier().then(D.k(Modifier.INSTANCE, this.f18525a.getAdsSpacing().getOne().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), null, null, 12, null), this.f18526b, null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(Ji.LocalThemeScope r51, androidx.compose.ui.Modifier r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, androidx.compose.runtime.Composer r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.g.l(Ji.M, androidx.compose.ui.Modifier, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, int i11, int i12, Composer composer, int i13) {
        l(localThemeScope, modifier, z10, z11, z12, z13, z14, z15, z16, z17, z18, str, str2, str3, str4, str5, str6, str7, str8, str9, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(androidx.compose.ui.Modifier r16, float r17, float r18, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.g.f(androidx.compose.ui.Modifier, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Modifier modifier, float f10, float f11, Function2 function2, int i10, int i11, Composer composer, int i12) {
        f(modifier, f10, f11, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void h(final LocalThemeScope localThemeScope, final String tagText, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(tagText, "tagText");
        Composer composerStartRestartGroup = composer.startRestartGroup(78076342);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(tagText) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(78076342, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.MPerksTag (ProductCardTags.kt:136)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = b.f18487h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-862592224, true, new c(localThemeScope, tagText), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lj.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.i(localThemeScope, tagText, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        h(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void j(final LocalThemeScope localThemeScope, final Function3<? super m1.ProductCardTags, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-229959451);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-229959451, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.ModifiedProductCardTag (ProductCardTags.kt:226)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = d.f18490h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-1438559793, true, new e(localThemeScope, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lj.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.k(localThemeScope, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Function3 function3, int i10, Composer composer, int i11) {
        j(localThemeScope, function3, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void n(final LocalThemeScope localThemeScope, final String tagText, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(tagText, "tagText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-551345881);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(tagText) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-551345881, i11, -1, "com.meijer.mobile.core.design.compose.widget.tags.SaleTag (ProductCardTags.kt:157)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = h.f18524h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1293483281, true, new i(localThemeScope, tagText), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lj.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.o(localThemeScope, tagText, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        n(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
