package Ri;

import Ki.LocalThemeScope;
import Ki.Q;
import Oi.l;
import P0.e;
import Ri.A;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14903g;
import ki.ProductCardTags;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import si.InterfaceC17076b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LRi/A;", "LOi/c;", "LOi/l$z;", "state", "<init>", "(LOi/l$z;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$z;", "m", "()LOi/l$z;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class A implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.TagState state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f33197b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.A$a$a, reason: collision with other inner class name */
        static final class C0739a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33198a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ri.A$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0740a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0740a f33199h = new C0740a();

                C0740a() {
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
            /* renamed from: Ri.A$a$a$b */
            static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33200a;

                b(LocalThemeScope localThemeScope) {
                    this.f33200a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ProductCardTags productCardTags, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC17076b.Q(AdsTag, productCardTags.getTags().getComplexPromo().getLabel(), "Buy 1, \nGet 1 Free", null, 4, null);
                    return Unit.f143329a;
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
                    LocalThemeScope localThemeScope = this.f33200a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C5800d c5800d = C5800d.f48779a;
                    C5800d.m mVarH = c5800d.h();
                    e.Companion companion2 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                    InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion3.a();
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
                    D1.c(composerA, measurePolicyA, companion3.e());
                    D1.c(composerA, interfaceC5884sR, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion3.f());
                    C14903g c14903g = C14903g.f139698a;
                    float f10 = 4;
                    Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA2 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
                    Function0<InterfaceC5953g> function0A2 = companion3.a();
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
                    D1.c(composerA2, measurePolicyB, companion3.e());
                    D1.c(composerA2, interfaceC5884sR2, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion3.f());
                    C14889J c14889j = C14889J.f139620a;
                    int i12 = i11;
                    Ii.h.i(localThemeScope, Assemble.getTags().getComplexPromo(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA3 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK2);
                    Function0<InterfaceC5953g> function0A3 = companion3.a();
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
                    D1.c(composerA3, measurePolicyB2, companion3.e());
                    D1.c(composerA3, interfaceC5884sR3, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion3.f());
                    composer.startReplaceGroup(5004770);
                    boolean z10 = (i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble));
                    Object objB = composer.B();
                    if (z10 || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Ri.B
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.a.C0739a.b.c(Assemble, (Ii.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    composer.v();
                    Modifier modifierK3 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA4 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR4 = composer.r();
                    Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierK3);
                    Function0<InterfaceC5953g> function0A4 = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A4);
                    } else {
                        composer.s();
                    }
                    Composer composerA4 = D1.a(composer);
                    D1.c(composerA4, measurePolicyB3, companion3.e());
                    D1.c(composerA4, interfaceC5884sR4, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                    if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                        composerA4.t(Integer.valueOf(iA4));
                        composerA4.n(Integer.valueOf(iA4), function2B4);
                    }
                    D1.c(composerA4, modifierE4, companion3.f());
                    Ii.h.i(localThemeScope, Assemble.getTags().getLowStock(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK4 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA5 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR5 = composer.r();
                    Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierK4);
                    Function0<InterfaceC5953g> function0A5 = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A5);
                    } else {
                        composer.s();
                    }
                    Composer composerA5 = D1.a(composer);
                    D1.c(composerA5, measurePolicyB4, companion3.e());
                    D1.c(composerA5, interfaceC5884sR5, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
                    if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                        composerA5.t(Integer.valueOf(iA5));
                        composerA5.n(Integer.valueOf(iA5), function2B5);
                    }
                    D1.c(composerA5, modifierE5, companion3.f());
                    Ii.h.i(localThemeScope, Assemble.getTags().getMperks(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK5 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA6 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR6 = composer.r();
                    Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierK5);
                    Function0<InterfaceC5953g> function0A6 = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A6);
                    } else {
                        composer.s();
                    }
                    Composer composerA6 = D1.a(composer);
                    D1.c(composerA6, measurePolicyB5, companion3.e());
                    D1.c(composerA6, interfaceC5884sR6, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
                    if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                        composerA6.t(Integer.valueOf(iA6));
                        composerA6.n(Integer.valueOf(iA6), function2B6);
                    }
                    D1.c(composerA6, modifierE6, companion3.f());
                    Ii.h.i(localThemeScope, Assemble.getTags().getOutOfStock(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK6 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA7 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR7 = composer.r();
                    Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierK6);
                    Function0<InterfaceC5953g> function0A7 = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A7);
                    } else {
                        composer.s();
                    }
                    Composer composerA7 = D1.a(composer);
                    D1.c(composerA7, measurePolicyB6, companion3.e());
                    D1.c(composerA7, interfaceC5884sR7, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion3.b();
                    if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                        composerA7.t(Integer.valueOf(iA7));
                        composerA7.n(Integer.valueOf(iA7), function2B7);
                    }
                    D1.c(composerA7, modifierE7, companion3.f());
                    Ii.h.i(localThemeScope, Assemble.getTags().getPickupOnly(), null, null, composer, 0, 6);
                    composer.v();
                    Modifier modifierK7 = androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null);
                    MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA8 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR8 = composer.r();
                    Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierK7);
                    Function0<InterfaceC5953g> function0A8 = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A8);
                    } else {
                        composer.s();
                    }
                    Composer composerA8 = D1.a(composer);
                    D1.c(composerA8, measurePolicyB7, companion3.e());
                    D1.c(composerA8, interfaceC5884sR8, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B8 = companion3.b();
                    if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                        composerA8.t(Integer.valueOf(iA8));
                        composerA8.n(Integer.valueOf(iA8), function2B8);
                    }
                    D1.c(composerA8, modifierE8, companion3.f());
                    Ii.h.i(localThemeScope, Assemble.getTags().getSponsored(), null, null, composer, 0, 6);
                    composer.v();
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    b(productCardTags, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0739a(LocalThemeScope localThemeScope) {
                this.f33198a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-123429191, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:38)");
                }
                LocalThemeScope localThemeScope = this.f33198a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0740a.f33199h;
                    composer.t(objB);
                }
                composer.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1653828879, true, new b(this.f33198a), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, A a10) {
            this.f33196a = localThemeScope;
            this.f33197b = a10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1903166484, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:33)");
            }
            Si.b.b(this.f33196a, null, this.f33197b.c("Template Tags"), "1.0", null, ComposableLambdaKt.c(-123429191, true, new C0739a(this.f33196a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f33202b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33203a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ri.A$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0741a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0741a f33204h = new C0741a();

                C0741a() {
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
            /* renamed from: Ri.A$b$a$b, reason: collision with other inner class name */
            static final class C0742b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33205a;

                C0742b(LocalThemeScope localThemeScope) {
                    this.f33205a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(ProductCardTags productCardTags, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC17076b.Q(AdsTag, productCardTags.getTags().getComplexPromo().getLabel(), "This is an extremely long tag. Muffin chocolate bar jelly carrot cake jelly gingerbread marshmallow gummies candy. Sugar plum cookie cheesecake cotton candy candy canes chocolate lemon drops cake ice cream. Pudding shortbread gummies sugar plum chocolate bar chupa chups caramels. Tart marshmallow jelly toffee dessert sweet roll.", null, 4, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(ProductCardTags productCardTags, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC17076b.Q(AdsTag, productCardTags.getTags().getMperks().getLabel(), "This is an extremely long tag. Muffin chocolate bar jelly carrot cake jelly gingerbread marshmallow gummies candy. Sugar plum cookie cheesecake cotton candy candy canes chocolate lemon drops cake ice cream. Pudding shortbread gummies sugar plum chocolate bar chupa chups caramels. Tart marshmallow jelly toffee dessert sweet roll.", null, 4, null);
                    return Unit.f143329a;
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
                    LocalThemeScope localThemeScope = this.f33205a;
                    composer.startReplaceGroup(5004770);
                    int i12 = i11 & 14;
                    boolean z10 = true;
                    boolean z11 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                    Object objB = composer.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Ri.C
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.b.a.C0742b.d(Assemble, (Ii.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    LocalThemeScope localThemeScope2 = this.f33205a;
                    composer.startReplaceGroup(5004770);
                    if (i12 != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                        z10 = false;
                    }
                    Object objB2 = composer.B();
                    if (z10 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Ri.D
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.b.a.C0742b.e(Assemble, (Ii.i) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope2, null, null, null, (Function1) objB2, composer, 0, 7);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    c(productCardTags, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f33203a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1017123088, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:80)");
                }
                LocalThemeScope localThemeScope = this.f33203a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0741a.f33204h;
                    composer.t(objB);
                }
                composer.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-897946736, true, new C0742b(localThemeScope), composer, 54), composer, 432);
                composer.v();
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

        b(LocalThemeScope localThemeScope, A a10) {
            this.f33201a = localThemeScope;
            this.f33202b = a10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1947677853, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:75)");
            }
            Si.b.b(this.f33201a, null, this.f33202b.c("Multiline"), "1.0", null, ComposableLambdaKt.c(-1017123088, true, new a(this.f33201a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f33207b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33208a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ri.A$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0743a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                /* renamed from: h, reason: collision with root package name */
                public static final C0743a f33209h = new C0743a();

                C0743a() {
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
                final /* synthetic */ LocalThemeScope f33210a;

                b(LocalThemeScope localThemeScope) {
                    this.f33210a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getComplexPromo().getIcon());
                    InterfaceC17076b.Q(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), "Jujubes powder tootsie roll muffin oat cake. Chocolate jelly beans gummi bears sesame snaps topping.", null, 4, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC17076b.Q(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFive(), null, 383, null), "Muffin dragée muffin caramels liquorice.", null, 4, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC17076b.Q(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getThree(), null, 383, null), "Topping cheesecake pastry jujubes.", null, 4, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(ProductCardTags productCardTags, LocalThemeScope localThemeScope, Ii.i AdsTag) {
                    Intrinsics.j(AdsTag, "$this$AdsTag");
                    AdsTag.A(productCardTags.getTags().getMperks().getIcon());
                    InterfaceC17076b.Q(AdsTag, q1.Label.y(productCardTags.getTags().getComplexPromo().getLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getOne(), null, 383, null), "Chupa chups icing.", null, 4, null);
                    return Unit.f143329a;
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
                    LocalThemeScope localThemeScope = this.f33210a;
                    composer.startReplaceGroup(-1633490746);
                    int i12 = i11 & 14;
                    boolean z10 = true;
                    boolean zD = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f33210a);
                    final LocalThemeScope localThemeScope2 = this.f33210a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Ri.E
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.f(Assemble, localThemeScope2, (Ii.i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope, null, null, null, (Function1) objB, composer, 0, 7);
                    LocalThemeScope localThemeScope3 = this.f33210a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f33210a);
                    final LocalThemeScope localThemeScope4 = this.f33210a;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Ri.F
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.g(Assemble, localThemeScope4, (Ii.i) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope3, null, null, null, (Function1) objB2, composer, 0, 7);
                    LocalThemeScope localThemeScope5 = this.f33210a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD3 = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f33210a);
                    final LocalThemeScope localThemeScope6 = this.f33210a;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: Ri.G
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.k(Assemble, localThemeScope6, (Ii.i) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope5, null, null, null, (Function1) objB3, composer, 0, 7);
                    LocalThemeScope localThemeScope7 = this.f33210a;
                    composer.startReplaceGroup(-1633490746);
                    if (i12 != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                        z10 = false;
                    }
                    boolean zD4 = composer.D(this.f33210a) | z10;
                    final LocalThemeScope localThemeScope8 = this.f33210a;
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: Ri.H
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return A.c.a.b.l(Assemble, localThemeScope8, (Ii.i) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    Ii.h.g(localThemeScope7, null, null, null, (Function1) objB4, composer, 0, 7);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                    e(productCardTags, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f33208a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1425146703, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Tag.kt:113)");
                }
                LocalThemeScope localThemeScope = this.f33208a;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0743a.f33209h;
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
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, A a10) {
            this.f33206a = localThemeScope;
            this.f33207b = a10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1939265828, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TagShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Tag.kt:108)");
            }
            Si.b.b(this.f33206a, null, this.f33207b.c("Multiline Font Variant Icon Invariant"), "1.0", null, ComposableLambdaKt.c(-1425146703, true, new a(this.f33206a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(A a10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        a10.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(A a10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        a10.b(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            t0L.a(new Function2() { // from class: Ri.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.l(this.f33402a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Ri.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return A.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.k(this.f33407a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return this.name;
    }

    @Override // Oi.c
    /* renamed from: m, reason: from getter */
    public l.TagState getState() {
        return this.state;
    }
}
