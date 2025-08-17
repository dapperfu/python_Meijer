package Pi;

import Ji.C;
import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.C4876p7;
import V0.C5347r0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13457y;
import j0.C14801J;
import j0.C14815g;
import ji.q1;
import kotlin.C17983x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import l.C15338a;
import l0.C15342b;
import l0.InterfaceC15343c;
import m0.C15521g;
import m0.InterfaceC15506C;
import m0.InterfaceC15516b;
import m0.InterfaceC15528n;
import p1.C16190d;
import pi.C16307b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LPi/p7;", "LNi/c;", "LNi/l$r;", "state", "<init>", "(LNi/l$r;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$r;", "o", "()LNi/l$r;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.p7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4876p7 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.ProgressIndicator state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.p7$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27746b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$a$a, reason: collision with other inner class name */
        static final class C0566a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27747a;

            C0566a(LocalThemeScope localThemeScope) {
                this.f27747a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-59744194, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:51)");
                }
                C5658d c5658d = C5658d.f48555a;
                C5658d.f fVarB = c5658d.b();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.layout.J.d(companion, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f27747a;
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(fVarB, companion2.k(), composer, 6);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                C5658d.f fVarE = c5658d.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion2.l(), composer, 6);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                C.b.c.j jVar = C.b.c.j.f15406e;
                Di.i.g(localThemeScope, null, 0.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Di.i.g(localThemeScope, null, 25.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Di.i.g(localThemeScope, null, 50.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                composer.v();
                C5658d.f fVarE2 = c5658d.e();
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(fVarE2, companion2.l(), composer, 6);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
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
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                Di.i.g(localThemeScope, null, 75.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Di.i.g(localThemeScope, null, 90.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Di.i.g(localThemeScope, null, 100.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                composer.v();
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

        a(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27745a = localThemeScope;
            this.f27746b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(649600555, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:47)");
            }
            Ri.b.b(this.f27745a, null, this.f27746b.d("Static Presets"), "1.0", null, ComposableLambdaKt.c(-59744194, true, new C0566a(this.f27745a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27749b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27750a;

            a(LocalThemeScope localThemeScope) {
                this.f27750a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-620221273, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:115)");
                }
                C5658d.f fVarE = C5658d.f48555a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f27750a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C.b.f.e eVar = C.b.f.e.f15445e;
                Di.i.h(localThemeScope, null, 3, 6, eVar, "to go", false, null, composer, 224640, 97);
                Di.i.h(localThemeScope, null, 10, 30, eVar, "to go", false, null, composer, 224640, 97);
                Di.i.h(localThemeScope, null, 25, 100, eVar, "to go", false, null, composer, 224640, 97);
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

        b(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27748a = localThemeScope;
            this.f27749b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1839717548, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:111)");
            }
            Ri.b.b(this.f27748a, null, this.f27749b.d("Quantity count"), "1.0", null, ComposableLambdaKt.c(-620221273, true, new a(this.f27748a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$c */
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27752b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27753a;

            a(LocalThemeScope localThemeScope) {
                this.f27753a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1105166522, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:146)");
                }
                C5658d.f fVarE = C5658d.f48555a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f27753a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                C.b.f.e eVar = C.b.f.e.f15445e;
                Di.i.h(localThemeScope, null, 3, 6, eVar, "to go", false, null, composer, 1797504, 65);
                Di.i.h(localThemeScope, null, 10, 30, eVar, "to go", false, null, composer, 1797504, 65);
                Di.i.h(localThemeScope, null, 25, 100, eVar, "to go", false, null, composer, 1797504, 65);
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

        c(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27751a = localThemeScope;
            this.f27752b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1970304499, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:142)");
            }
            Ri.b.b(this.f27751a, null, this.f27752b.d("Single quantity"), "1.0", null, ComposableLambdaKt.c(-1105166522, true, new a(this.f27751a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$d */
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27755b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27756a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.p7$d$a$a, reason: collision with other inner class name */
            static final class C0567a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27757a;

                C0567a(LocalThemeScope localThemeScope) {
                    this.f27757a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(441778222, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:189)");
                    }
                    C13457y.a(C16190d.c(C15338a.f148150a, composer, 0), "", null, null, null, 0.0f, C5347r0.Companion.c(C5347r0.INSTANCE, this.f27757a.getAdsColors().getAdsColorSupportError().getColor(), 0, 2, null), composer, 48, 60);
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
            /* renamed from: Pi.p7$d$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27758a;

                b(LocalThemeScope localThemeScope) {
                    this.f27758a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-184841691, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:200)");
                    }
                    C16307b.b(this.f27758a, new q1.h.DrawableIcon(C.b.f.e.f15445e, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES)), 62, null), null, null, composer, 0, 6);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1590111771, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:180)");
                }
                C5658d.f fVarE = C5658d.f48555a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f27756a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                Di.i.h(localThemeScope, null, 3, 6, null, "to go", false, ComposableLambdaKt.c(441778222, true, new C0567a(localThemeScope), composer, 54), composer, 12782976, 41);
                Di.i.h(localThemeScope, null, 10, 30, null, "to go", false, ComposableLambdaKt.c(-184841691, true, new b(localThemeScope), composer, 54), composer, 12782976, 41);
                Di.i.h(localThemeScope, null, 25, 100, null, "to go", false, B5.f25671a.b(), composer, 12782976, 41);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27756a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27754a = localThemeScope;
            this.f27755b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1485359250, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:176)");
            }
            Ri.b.b(this.f27754a, null, this.f27755b.d("Open image"), "1.0", null, ComposableLambdaKt.c(-1590111771, true, new a(this.f27754a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$e */
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27760b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4876p7 f27761a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27762b;

            a(C4876p7 c4876p7, LocalThemeScope localThemeScope) {
                this.f27761a = c4876p7;
                this.f27762b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2075057020, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:227)");
                }
                C5658d.f fVarE = C5658d.f48555a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                C4876p7 c4876p7 = this.f27761a;
                LocalThemeScope localThemeScope = this.f27762b;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                Di.i.g(localThemeScope, null, c4876p7.getState().d().getValue().doubleValue(), c4876p7.getState().b().getValue().doubleValue(), C.b.c.j.f15406e, "to go", false, null, composer, 221184, 97);
                Di.i.h(localThemeScope, null, c4876p7.getState().e().getValue().intValue(), c4876p7.getState().c().getValue().intValue(), C.b.f.e.f15445e, "to go", false, null, composer, 221184, 97);
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

        e(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27759a = localThemeScope;
            this.f27760b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1000414001, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:223)");
            }
            Ri.b.b(this.f27759a, null, this.f27760b.d("Randomized"), "1.0", null, ComposableLambdaKt.c(-2075057020, true, new a(this.f27760b, this.f27759a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$f */
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4876p7 f27764b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.p7$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27765a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4876p7 f27766b;

            a(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
                this.f27765a = localThemeScope;
                this.f27766b = c4876p7;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1734965027, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:252)");
                }
                LocalThemeScope localThemeScope = this.f27765a;
                C4876p7 c4876p7 = this.f27766b;
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "8.dp thickness (Default)", null, composer, 384, 4);
                Di.i.k(localThemeScope, androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), (float) c4876p7.getState().d().getValue().doubleValue(), (float) c4876p7.getState().b().getValue().doubleValue(), 0.0f, null, null, composer, 48, 56);
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "16.dp thickness with 90% progress", null, composer, 384, 4);
                Di.i.k(localThemeScope, null, 90.0f, 100.0f, H1.h.p(16), null, null, composer, 28032, 49);
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

        f(LocalThemeScope localThemeScope, C4876p7 c4876p7) {
            this.f27763a = localThemeScope;
            this.f27764b = c4876p7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(515468752, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:248)");
            }
            Ri.b.b(this.f27763a, null, this.f27764b.d("Linear"), "1.0", null, ComposableLambdaKt.c(1734965027, true, new a(this.f27763a, this.f27764b), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.p7$g */
    static final class g implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2077861315, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:287)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(C4876p7.this);
            final C4876p7 c4876p7 = C4876p7.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.q7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4876p7.g.c(c4876p7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, B5.f25671a.a(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4876p7 c4876p7) {
            Random.Companion companion = Random.INSTANCE;
            double dE = companion.e(2.0d, 100.0d);
            c4876p7.getState().b().setValue(Double.valueOf(dE));
            c4876p7.getState().d().setValue(Double.valueOf(companion.e(1.0d, dE)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.p7$h */
    static final class h implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        public final void b(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-986237780, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:298)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(C4876p7.this);
            final C4876p7 c4876p7 = C4876p7.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.r7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4876p7.h.c(c4876p7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, B5.f25671a.c(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4876p7 c4876p7) {
            Random.Companion companion = Random.INSTANCE;
            int iH = companion.h(2, 100);
            c4876p7.getState().c().setValue(Integer.valueOf(iH));
            c4876p7.getState().e().setValue(Integer.valueOf(companion.h(1, iH)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            b(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public C4876p7(l.ProgressIndicator state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, C4876p7 c4876p7, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(649600555, true, new a(localThemeScope, c4876p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1839717548, true, new b(localThemeScope, c4876p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1970304499, true, new c(localThemeScope, c4876p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1485359250, true, new d(localThemeScope, c4876p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1000414001, true, new e(localThemeScope, c4876p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(515468752, true, new f(localThemeScope, c4876p7)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4876p7 c4876p7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4876p7.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C4876p7 c4876p7, InterfaceC15506C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(2077861315, true, c4876p7.new g()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-986237780, true, c4876p7.new h()), 7, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(C4876p7 c4876p7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4876p7.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2104916704);
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
                ComposerKt.U(2104916704, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content (ProgressIndicatorShowcase.kt:43)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.n7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4876p7.k(localThemeScope, this, (l0.w) obj);
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
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.o7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4876p7.l(this.f27725a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1505927433);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.V(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1505927433, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Controls (ProgressIndicatorShowcase.kt:283)");
            }
            int i12 = i11;
            InterfaceC15516b.a aVar = new InterfaceC15516b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.l7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4876p7.m(this.f27671a, (InterfaceC15506C) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15521g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 0, 1022);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.m7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4876p7.n(this.f27685a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Progress Indicator";
    }

    @Override // Ni.c
    /* renamed from: o, reason: from getter */
    public l.ProgressIndicator getState() {
        return this.state;
    }
}
