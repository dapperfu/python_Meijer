package Qi;

import Ji.LocalThemeScope;
import Ji.Q;
import Ni.l;
import P0.e;
import Qi.A;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14815g;
import ji.ProductCardTags;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import ri.InterfaceC16791b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LQi/A;", "LNi/c;", "LNi/l$z;", "state", "<init>", "(LNi/l$z;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$z;", "m", "()LNi/l$z;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class A implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.TagState state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f30610b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.A$a$a, reason: collision with other inner class name */
        static final class C0688a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30611a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.A$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0689a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0689a f30612h = new C0689a();

                C0689a() {
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
            /* renamed from: Qi.A$a$a$b */
            static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30613a;

                b(LocalThemeScope localThemeScope) {
                    this.f30613a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductCardTags productCardTags, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC16791b.o(AdsTag, productCardTags.getTags().getComplexPromo().getLabel(), "Buy 1, \nGet 1 Free", null, 4, null);
                    return Unit.f142422a;
                }

                public final void b(final ProductCardTags Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(1653828879, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:39)");
                    }
                    LocalThemeScope localThemeScope = this.f30613a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C5658d c5658d = C5658d.f48555a;
                    C5658d.m mVarH = c5658d.h();
                    e.Companion companion2 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                    float f10 = 4;
                    Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA2 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
                    Function0<InterfaceC5811g> function0A2 = companion3.a();
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
                    D1.c(composerA2, measurePolicyB, companion3.e());
                    D1.c(composerA2, interfaceC5742sR2, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion3.f());
                    C14801J c14801j = C14801J.f139030a;
                    int i12 = i11;
                    Hi.h.i(localThemeScope, Assemble.getTags().getComplexPromo(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA3 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK2);
                    Function0<InterfaceC5811g> function0A3 = companion3.a();
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
                    D1.c(composerA3, measurePolicyB2, companion3.e());
                    D1.c(composerA3, interfaceC5742sR3, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion3.f());
                    composer.startReplaceGroup(5004770);
                    boolean z10 = (i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble));
                    Object objB = composer.B();
                    if (z10 || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Qi.B
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.a.C0688a.b.c(Assemble, (Hi.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    composer.v();
                    Modifier modifierK3 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA4 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR4 = composer.r();
                    Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierK3);
                    Function0<InterfaceC5811g> function0A4 = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A4);
                    } else {
                        composer.s();
                    }
                    Composer composerA4 = D1.a(composer);
                    D1.c(composerA4, measurePolicyB3, companion3.e());
                    D1.c(composerA4, interfaceC5742sR4, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                    if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                        composerA4.t(Integer.valueOf(iA4));
                        composerA4.n(Integer.valueOf(iA4), function2B4);
                    }
                    D1.c(composerA4, modifierE4, companion3.f());
                    Hi.h.i(localThemeScope, Assemble.getTags().getLowStock(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK4 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA5 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR5 = composer.r();
                    Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierK4);
                    Function0<InterfaceC5811g> function0A5 = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A5);
                    } else {
                        composer.s();
                    }
                    Composer composerA5 = D1.a(composer);
                    D1.c(composerA5, measurePolicyB4, companion3.e());
                    D1.c(composerA5, interfaceC5742sR5, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
                    if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                        composerA5.t(Integer.valueOf(iA5));
                        composerA5.n(Integer.valueOf(iA5), function2B5);
                    }
                    D1.c(composerA5, modifierE5, companion3.f());
                    Hi.h.i(localThemeScope, Assemble.getTags().getMperks(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK5 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA6 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR6 = composer.r();
                    Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierK5);
                    Function0<InterfaceC5811g> function0A6 = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A6);
                    } else {
                        composer.s();
                    }
                    Composer composerA6 = D1.a(composer);
                    D1.c(composerA6, measurePolicyB5, companion3.e());
                    D1.c(composerA6, interfaceC5742sR6, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
                    if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                        composerA6.t(Integer.valueOf(iA6));
                        composerA6.n(Integer.valueOf(iA6), function2B6);
                    }
                    D1.c(composerA6, modifierE6, companion3.f());
                    Hi.h.i(localThemeScope, Assemble.getTags().getOutOfStock(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK6 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA7 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR7 = composer.r();
                    Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierK6);
                    Function0<InterfaceC5811g> function0A7 = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A7);
                    } else {
                        composer.s();
                    }
                    Composer composerA7 = D1.a(composer);
                    D1.c(composerA7, measurePolicyB6, companion3.e());
                    D1.c(composerA7, interfaceC5742sR7, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B7 = companion3.b();
                    if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                        composerA7.t(Integer.valueOf(iA7));
                        composerA7.n(Integer.valueOf(iA7), function2B7);
                    }
                    D1.c(composerA7, modifierE7, companion3.f());
                    Hi.h.i(localThemeScope, Assemble.getTags().getPickupOnly(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK7 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                    int iA8 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR8 = composer.r();
                    Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierK7);
                    Function0<InterfaceC5811g> function0A8 = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A8);
                    } else {
                        composer.s();
                    }
                    Composer composerA8 = D1.a(composer);
                    D1.c(composerA8, measurePolicyB7, companion3.e());
                    D1.c(composerA8, interfaceC5742sR8, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B8 = companion3.b();
                    if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                        composerA8.t(Integer.valueOf(iA8));
                        composerA8.n(Integer.valueOf(iA8), function2B8);
                    }
                    D1.c(composerA8, modifierE8, companion3.f());
                    Hi.h.i(localThemeScope, Assemble.getTags().getSponsored(), null, null, composer, 0, 6);
                    composer.v();
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    b(productCardTags, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0688a(LocalThemeScope localThemeScope) {
                this.f30611a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-123429191, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:38)");
                }
                LocalThemeScope localThemeScope = this.f30611a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0689a.f30612h;
                    composer.t(objB);
                }
                composer.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1653828879, true, new b(this.f30611a), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, A a10) {
            this.f30609a = localThemeScope;
            this.f30610b = a10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1903166484, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:33)");
            }
            Ri.b.b(this.f30609a, null, this.f30610b.d("Template Tags"), "1.0", null, ComposableLambdaKt.c(-123429191, true, new C0688a(this.f30609a), composer, 54), composer, 199680, 9);
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
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f30615b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30616a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.A$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0690a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0690a f30617h = new C0690a();

                C0690a() {
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
            /* renamed from: Qi.A$b$a$b, reason: collision with other inner class name */
            static final class C0691b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30618a;

                C0691b(LocalThemeScope localThemeScope) {
                    this.f30618a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(ProductCardTags productCardTags, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC16791b.o(AdsTag, productCardTags.getTags().getComplexPromo().getLabel(), "This is an extremely long tag. Muffin chocolate bar jelly carrot cake jelly gingerbread marshmallow gummies candy. Sugar plum cookie cheesecake cotton candy candy canes chocolate lemon drops cake ice cream. Pudding shortbread gummies sugar plum chocolate bar chupa chups caramels. Tart marshmallow jelly toffee dessert sweet roll.", null, 4, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(ProductCardTags productCardTags, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC16791b.o(AdsTag, productCardTags.getTags().getMperks().getLabel(), "This is an extremely long tag. Muffin chocolate bar jelly carrot cake jelly gingerbread marshmallow gummies candy. Sugar plum cookie cheesecake cotton candy candy canes chocolate lemon drops cake ice cream. Pudding shortbread gummies sugar plum chocolate bar chupa chups caramels. Tart marshmallow jelly toffee dessert sweet roll.", null, 4, null);
                    return Unit.f142422a;
                }

                public final void c(final ProductCardTags Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(-897946736, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:82)");
                    }
                    LocalThemeScope localThemeScope = this.f30618a;
                    composer.startReplaceGroup(5004770);
                    int i12 = i11 & 14;
                    boolean z10 = true;
                    boolean z11 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                    Object objB = composer.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Qi.C
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.b.a.C0691b.d(Assemble, (Hi.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    LocalThemeScope localThemeScope2 = this.f30618a;
                    composer.startReplaceGroup(5004770);
                    if (i12 != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                        z10 = false;
                    }
                    Object objB2 = composer.B();
                    if (z10 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Qi.D
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.b.a.C0691b.e(Assemble, (Hi.i) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope2, null, null, null, (Function1) objB2, composer, 0, 7);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    c(productCardTags, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30616a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1017123088, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:80)");
                }
                LocalThemeScope localThemeScope = this.f30616a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0690a.f30617h;
                    composer.t(objB);
                }
                composer.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-897946736, true, new C0691b(localThemeScope), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, A a10) {
            this.f30614a = localThemeScope;
            this.f30615b = a10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1947677853, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:75)");
            }
            Ri.b.b(this.f30614a, null, this.f30615b.d("Multiline"), "1.0", null, ComposableLambdaKt.c(-1017123088, true, new a(this.f30614a), composer, 54), composer, 199680, 9);
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
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f30620b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30621a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.A$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0692a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0692a f30622h = new C0692a();

                C0692a() {
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
            static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30623a;

                b(LocalThemeScope localThemeScope) {
                    this.f30623a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC16791b.o(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), "Jujubes powder tootsie roll muffin oat cake. Chocolate jelly beans gummi bears sesame snaps topping.", null, 4, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC16791b.o(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFive(), null, 383, null), "Muffin dragée muffin caramels liquorice.", null, 4, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC16791b.o(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getThree(), null, 383, null), "Topping cheesecake pastry jujubes.", null, 4, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Hi.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.X(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC16791b.o(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getOne(), null, 383, null), "Chupa chups icing.", null, 4, null);
                    return Unit.f142422a;
                }

                public final void e(final ProductCardTags Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(-1305970351, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:115)");
                    }
                    LocalThemeScope localThemeScope = this.f30623a;
                    composer.startReplaceGroup(-1633490746);
                    int i12 = i11 & 14;
                    boolean z10 = true;
                    boolean zD = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f30623a);
                    final LocalThemeScope localThemeScope2 = this.f30623a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Qi.E
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.f(Assemble, localThemeScope2, (Hi.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    LocalThemeScope localThemeScope3 = this.f30623a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f30623a);
                    final LocalThemeScope localThemeScope4 = this.f30623a;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Qi.F
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.g(Assemble, localThemeScope4, (Hi.i) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope3, null, null, null, (Function1) objB2, composer, 0, 7);
                    LocalThemeScope localThemeScope5 = this.f30623a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD3 = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f30623a);
                    final LocalThemeScope localThemeScope6 = this.f30623a;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: Qi.G
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.k(Assemble, localThemeScope6, (Hi.i) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope5, null, null, null, (Function1) objB3, composer, 0, 7);
                    LocalThemeScope localThemeScope7 = this.f30623a;
                    composer.startReplaceGroup(-1633490746);
                    if (i12 != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                        z10 = false;
                    }
                    boolean zD4 = composer.D(this.f30623a) | z10;
                    final LocalThemeScope localThemeScope8 = this.f30623a;
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: Qi.H
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.l(Assemble, localThemeScope8, (Hi.i) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    Hi.h.g(localThemeScope7, null, null, null, (Function1) objB4, composer, 0, 7);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    e(productCardTags, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30621a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1425146703, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:113)");
                }
                LocalThemeScope localThemeScope = this.f30621a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0692a.f30622h;
                    composer.t(objB);
                }
                composer.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-1305970351, true, new b(localThemeScope), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, A a10) {
            this.f30619a = localThemeScope;
            this.f30620b = a10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1939265828, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:108)");
            }
            Ri.b.b(this.f30619a, null, this.f30620b.d("Multiline Font Variant Icon Invariant"), "1.0", null, ComposableLambdaKt.c(-1425146703, true, new a(this.f30619a), composer, 54), composer, 199680, 9);
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

    public A(l.TagState state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Tag";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, A a10, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1903166484, true, new a(localThemeScope, a10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1947677853, true, new b(localThemeScope, a10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1939265828, true, new c(localThemeScope, a10)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(A a10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        a10.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(A a10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        a10.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1969573719);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1969573719, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content (Tag.kt:28)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return A.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.k(this.f30820a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(219881120);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(219881120, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Controls (Tag.kt:170)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.l(this.f30815a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return this.name;
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.TagState getState() {
        return this.state;
    }
}
