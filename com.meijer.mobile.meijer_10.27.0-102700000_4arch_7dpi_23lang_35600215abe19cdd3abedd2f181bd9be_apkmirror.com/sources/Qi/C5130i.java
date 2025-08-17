package Qi;

import Ji.LocalThemeScope;
import V0.C5346q0;
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
import j0.C14815g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LQi/i;", "LNi/c;", "LNi/l;", "state", "<init>", "(LNi/l;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "LNi/l;", "getState", "()LNi/l;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5130i implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ni.l state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.i$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30701b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$a$a, reason: collision with other inner class name */
        static final class C0695a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30702a;

            C0695a(LocalThemeScope localThemeScope) {
                this.f30702a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1536138562, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:42)");
                }
                LocalThemeScope localThemeScope = this.f30702a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().u(), "adsColors.palette.gray100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().v(), "adsColors.palette.gray200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().w(), "adsColors.palette.gray300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().x(), "adsColors.palette.gray400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().y(), "adsColors.palette.gray500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().z(), "adsColors.palette.gray600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().A(), "adsColors.palette.gray700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().B(), "adsColors.palette.gray800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().C(), "adsColors.palette.gray900", 0L, composer, 384, 4);
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

        a(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30700a = localThemeScope;
            this.f30701b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-901937169, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:38)");
            }
            Ri.b.b(this.f30700a, null, this.f30701b.d("Gray"), "1.0", null, ComposableLambdaKt.c(1536138562, true, new C0695a(this.f30700a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30704b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30705a;

            a(LocalThemeScope localThemeScope) {
                this.f30705a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-280963221, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:88)");
                }
                LocalThemeScope localThemeScope = this.f30705a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().b(), "adsColors.palette.blue100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().c(), "adsColors.palette.blue200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().d(), "adsColors.palette.blue300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().e(), "adsColors.palette.blue400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().f(), "adsColors.palette.blue500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().h(), "adsColors.palette.blue600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().i(), "adsColors.palette.blue700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().j(), "adsColors.palette.blue800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().k(), "adsColors.palette.blue900", 0L, composer, 384, 4);
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

        b(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30703a = localThemeScope;
            this.f30704b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1780402904, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:84)");
            }
            Ri.b.b(this.f30703a, null, this.f30704b.d("Blue"), "1.0", null, ComposableLambdaKt.c(-280963221, true, new a(this.f30703a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$c */
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30707b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30708a;

            a(LocalThemeScope localThemeScope) {
                this.f30708a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(480918090, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:134)");
                }
                LocalThemeScope localThemeScope = this.f30708a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().M(), "adsColors.palette.red100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().N(), "adsColors.palette.red200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().O(), "adsColors.palette.red300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().P(), "adsColors.palette.red400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().Q(), "adsColors.palette.red500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().R(), "adsColors.palette.red600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().S(), "adsColors.palette.red700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().T(), "adsColors.palette.red800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().U(), "adsColors.palette.red900", 0L, composer, 384, 4);
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

        c(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30706a = localThemeScope;
            this.f30707b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1752683081, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:130)");
            }
            Ri.b.b(this.f30706a, null, this.f30707b.d("Red"), "1.0", null, ComposableLambdaKt.c(480918090, true, new a(this.f30706a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$d */
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30709a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30710b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30711a;

            a(LocalThemeScope localThemeScope) {
                this.f30711a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1242799401, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:180)");
                }
                LocalThemeScope localThemeScope = this.f30711a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().D(), "adsColors.palette.green100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().E(), "adsColors.palette.green200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().F(), "adsColors.palette.green300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().G(), "adsColors.palette.green400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().H(), "adsColors.palette.green500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().I(), "adsColors.palette.green600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().J(), "adsColors.palette.green700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().K(), "adsColors.palette.green800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().L(), "adsColors.palette.green900", 0L, composer, 384, 4);
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

        d(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30709a = localThemeScope;
            this.f30710b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-990801770, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:176)");
            }
            Ri.b.b(this.f30709a, null, this.f30710b.d("Green"), "1.0", null, ComposableLambdaKt.c(1242799401, true, new a(this.f30709a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$e */
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30713b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30714a;

            a(LocalThemeScope localThemeScope) {
                this.f30714a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2004680712, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:226)");
                }
                LocalThemeScope localThemeScope = this.f30714a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().p0(), "adsColors.palette.yellow100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().q0(), "adsColors.palette.yellow200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().r0(), "adsColors.palette.yellow300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().s0(), "adsColors.palette.yellow400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().t0(), "adsColors.palette.yellow500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().u0(), "adsColors.palette.yellow600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().v0(), "adsColors.palette.yellow700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().w0(), "adsColors.palette.yellow800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().x0(), "adsColors.palette.yellow900", 0L, composer, 384, 4);
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

        e(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30712a = localThemeScope;
            this.f30713b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-228920459, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:222)");
            }
            Ri.b.b(this.f30712a, null, this.f30713b.d("Yellow"), "1.0", null, ComposableLambdaKt.c(2004680712, true, new a(this.f30712a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$f */
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30716b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30717a;

            a(LocalThemeScope localThemeScope) {
                this.f30717a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1528405273, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:272)");
                }
                LocalThemeScope localThemeScope = this.f30717a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().l(), "adsColors.palette.cyan100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().m(), "adsColors.palette.cyan200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().n(), "adsColors.palette.cyan300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().o(), "adsColors.palette.cyan400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().p(), "adsColors.palette.cyan500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().q(), "adsColors.palette.cyan600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().r(), "adsColors.palette.cyan700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().s(), "adsColors.palette.cyan800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().t(), "adsColors.palette.cyan900", 0L, composer, 384, 4);
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

        f(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30715a = localThemeScope;
            this.f30716b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(532960852, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:268)");
            }
            Ri.b.b(this.f30715a, null, this.f30716b.d("Cyan"), "1.0", null, ComposableLambdaKt.c(-1528405273, true, new a(this.f30715a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$g */
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30719b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$g$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30720a;

            a(LocalThemeScope localThemeScope) {
                this.f30720a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-766523962, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:318)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                C5346q0.Companion companion2 = C5346q0.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(companion, companion2.a(), null, 2, null);
                LocalThemeScope localThemeScope = this.f30720a;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().e0(), "adsColors.palette.tWhite100", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().f0(), "adsColors.palette.tWhite200", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().g0(), "adsColors.palette.tWhite300", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().h0(), "adsColors.palette.tWhite400", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().i0(), "adsColors.palette.tWhite500", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().j0(), "adsColors.palette.tWhite600", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().k0(), "adsColors.palette.tWhite700", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().l0(), "adsColors.palette.tWhite800", companion2.k(), composer, 3456, 0);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().m0(), "adsColors.palette.tWhite900", companion2.k(), composer, 3456, 0);
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

        g(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30718a = localThemeScope;
            this.f30719b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1294842163, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:314)");
            }
            Ri.b.b(this.f30718a, null, this.f30719b.d("White"), "1.0", null, ComposableLambdaKt.c(-766523962, true, new a(this.f30718a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$h */
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30722b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$h$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30723a;

            a(LocalThemeScope localThemeScope) {
                this.f30723a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-4642651, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:373)");
                }
                LocalThemeScope localThemeScope = this.f30723a;
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
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().V(), "adsColors.palette.tBlack100", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().W(), "adsColors.palette.tBlack200", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().X(), "adsColors.palette.tBlack300", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().Y(), "adsColors.palette.tBlack400", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().Z(), "adsColors.palette.tBlack500", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().a0(), "adsColors.palette.tBlack600", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().b0(), "adsColors.palette.tBlack700", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().c0(), "adsColors.palette.tBlack800", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().d0(), "adsColors.palette.tBlack900", 0L, composer, 384, 4);
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

        h(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30721a = localThemeScope;
            this.f30722b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2056723474, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:369)");
            }
            Ri.b.b(this.f30721a, null, this.f30722b.d("Black"), "1.0", null, ComposableLambdaKt.c(-4642651, true, new a(this.f30721a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.i$i, reason: collision with other inner class name */
    static final class C0696i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5130i f30725b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.i$i$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30726a;

            a(LocalThemeScope localThemeScope) {
                this.f30726a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(757238660, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:419)");
                }
                Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, C5346q0.INSTANCE.d(), null, 2, null);
                LocalThemeScope localThemeScope = this.f30726a;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().a(), "adsColors.palette.black", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().o0(), "adsColors.palette.white", 0L, composer, 384, 4);
                C5132k.b(localThemeScope, localThemeScope.getAdsColors().l().n0(), "adsColors.palette.transparent", 0L, composer, 384, 4);
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

        C0696i(LocalThemeScope localThemeScope, C5130i c5130i) {
            this.f30724a = localThemeScope;
            this.f30725b = c5130i;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1476362511, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:415)");
            }
            Ri.b.b(this.f30724a, null, this.f30725b.d("Font"), "1.0", null, ComposableLambdaKt.c(757238660, true, new a(this.f30724a), composer, 54), composer, 199680, 9);
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

    public C5130i(Ni.l state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, C5130i c5130i, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-901937169, true, new a(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1780402904, true, new b(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1752683081, true, new c(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-990801770, true, new d(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-228920459, true, new e(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(532960852, true, new f(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1294842163, true, new g(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2056723474, true, new h(localThemeScope, c5130i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1476362511, true, new C0696i(localThemeScope, c5130i)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C5130i c5130i, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5130i.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(962240356);
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
                ComposerKt.U(962240356, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content (Colors.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5130i.i(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5130i.j(this.f30696a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Base Colors";
    }

    @Override // Ni.c
    public Ni.l getState() {
        return this.state;
    }
}
