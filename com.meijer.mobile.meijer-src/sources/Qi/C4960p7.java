package Qi;

import Ki.C;
import Ki.LocalThemeScope;
import Oi.l;
import P0.e;
import Qi.C4960p7;
import V0.C5490r0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13590y;
import j0.C14889J;
import j0.C14903g;
import ki.q1;
import kotlin.C18049x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import l.C15428a;
import l0.C15432b;
import l0.InterfaceC15433c;
import m0.C15632g;
import m0.InterfaceC15617C;
import m0.InterfaceC15627b;
import m0.InterfaceC15639n;
import p1.C16335d;
import qi.C16671b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LQi/p7;", "LOi/c;", "LOi/l$r;", "state", "<init>", "(LOi/l$r;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$r;", "o", "()LOi/l$r;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.p7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4960p7 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.ProgressIndicator state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.p7$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30457a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30458b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$a$a, reason: collision with other inner class name */
        static final class C0630a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30459a;

            C0630a(LocalThemeScope localThemeScope) {
                this.f30459a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-59744194, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:51)");
                }
                C5800d c5800d = C5800d.f48779a;
                C5800d.f fVarB = c5800d.b();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.layout.J.d(companion, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f30459a;
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(fVarB, companion2.k(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                C5800d.f fVarE = c5800d.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion2.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                C.b.c.j jVar = C.b.c.j.f16950e;
                Ei.i.g(localThemeScope, null, 0.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Ei.i.g(localThemeScope, null, 25.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Ei.i.g(localThemeScope, null, 50.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                composer.v();
                C5800d.f fVarE2 = c5800d.e();
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(fVarE2, companion2.l(), composer, 6);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
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
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                Ei.i.g(localThemeScope, null, 75.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Ei.i.g(localThemeScope, null, 90.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                Ei.i.g(localThemeScope, null, 100.0d, 100.0d, jVar, "to go", false, null, composer, 224640, 97);
                composer.v();
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

        a(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30457a = localThemeScope;
            this.f30458b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(649600555, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:47)");
            }
            Si.b.b(this.f30457a, null, this.f30458b.c("Static Presets"), "1.0", null, ComposableLambdaKt.c(-59744194, true, new C0630a(this.f30457a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.p7$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30460a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30461b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30462a;

            a(LocalThemeScope localThemeScope) {
                this.f30462a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-620221273, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:115)");
                }
                C5800d.f fVarE = C5800d.f48779a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f30462a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C.b.f.e eVar = C.b.f.e.f16989e;
                Ei.i.h(localThemeScope, null, 3, 6, eVar, "to go", false, null, composer, 224640, 97);
                Ei.i.h(localThemeScope, null, 10, 30, eVar, "to go", false, null, composer, 224640, 97);
                Ei.i.h(localThemeScope, null, 25, 100, eVar, "to go", false, null, composer, 224640, 97);
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

        b(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30460a = localThemeScope;
            this.f30461b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1839717548, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:111)");
            }
            Si.b.b(this.f30460a, null, this.f30461b.c("Quantity count"), "1.0", null, ComposableLambdaKt.c(-620221273, true, new a(this.f30460a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.p7$c */
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30463a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30464b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30465a;

            a(LocalThemeScope localThemeScope) {
                this.f30465a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1105166522, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:146)");
                }
                C5800d.f fVarE = C5800d.f48779a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f30465a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                C.b.f.e eVar = C.b.f.e.f16989e;
                Ei.i.h(localThemeScope, null, 3, 6, eVar, "to go", false, null, composer, 1797504, 65);
                Ei.i.h(localThemeScope, null, 10, 30, eVar, "to go", false, null, composer, 1797504, 65);
                Ei.i.h(localThemeScope, null, 25, 100, eVar, "to go", false, null, composer, 1797504, 65);
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

        c(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30463a = localThemeScope;
            this.f30464b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1970304499, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:142)");
            }
            Si.b.b(this.f30463a, null, this.f30464b.c("Single quantity"), "1.0", null, ComposableLambdaKt.c(-1105166522, true, new a(this.f30463a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.p7$d */
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30467b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30468a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.p7$d$a$a, reason: collision with other inner class name */
            static final class C0631a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30469a;

                C0631a(LocalThemeScope localThemeScope) {
                    this.f30469a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(441778222, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:189)");
                    }
                    C13590y.a(C16335d.c(C15428a.f148937a, composer, 0), "", null, null, null, 0.0f, C5490r0.Companion.c(C5490r0.INSTANCE, this.f30469a.getAdsColors().getAdsColorSupportError().getColor(), 0, 2, null), composer, 48, 60);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.p7$d$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30470a;

                b(LocalThemeScope localThemeScope) {
                    this.f30470a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-184841691, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:200)");
                    }
                    C16671b.b(this.f30470a, new q1.h.DrawableIcon(C.b.f.e.f16989e, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES)), 62, null), null, null, composer, 0, 6);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1590111771, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:180)");
                }
                C5800d.f fVarE = C5800d.f48779a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f30468a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                Ei.i.h(localThemeScope, null, 3, 6, null, "to go", false, ComposableLambdaKt.c(441778222, true, new C0631a(localThemeScope), composer, 54), composer, 12782976, 41);
                Ei.i.h(localThemeScope, null, 10, 30, null, "to go", false, ComposableLambdaKt.c(-184841691, true, new b(localThemeScope), composer, 54), composer, 12782976, 41);
                Ei.i.h(localThemeScope, null, 25, 100, null, "to go", false, B5.f28383a.b(), composer, 12782976, 41);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30468a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        d(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30466a = localThemeScope;
            this.f30467b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1485359250, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:176)");
            }
            Si.b.b(this.f30466a, null, this.f30467b.c("Open image"), "1.0", null, ComposableLambdaKt.c(-1590111771, true, new a(this.f30466a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.p7$e */
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30472b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4960p7 f30473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30474b;

            a(C4960p7 c4960p7, LocalThemeScope localThemeScope) {
                this.f30473a = c4960p7;
                this.f30474b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2075057020, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:227)");
                }
                C5800d.f fVarE = C5800d.f48779a.e();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                C4960p7 c4960p7 = this.f30473a;
                LocalThemeScope localThemeScope = this.f30474b;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                Ei.i.g(localThemeScope, null, c4960p7.getState().d().getValue().doubleValue(), c4960p7.getState().b().getValue().doubleValue(), C.b.c.j.f16950e, "to go", false, null, composer, 221184, 97);
                Ei.i.h(localThemeScope, null, c4960p7.getState().e().getValue().intValue(), c4960p7.getState().c().getValue().intValue(), C.b.f.e.f16989e, "to go", false, null, composer, 221184, 97);
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

        e(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30471a = localThemeScope;
            this.f30472b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1000414001, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:223)");
            }
            Si.b.b(this.f30471a, null, this.f30472b.c("Randomized"), "1.0", null, ComposableLambdaKt.c(-2075057020, true, new a(this.f30472b, this.f30471a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.p7$f */
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4960p7 f30476b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.p7$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30477a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4960p7 f30478b;

            a(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
                this.f30477a = localThemeScope;
                this.f30478b = c4960p7;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1734965027, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:252)");
                }
                LocalThemeScope localThemeScope = this.f30477a;
                C4960p7 c4960p7 = this.f30478b;
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "8.dp thickness (Default)", null, composer, 384, 4);
                Ei.i.k(localThemeScope, androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), (float) c4960p7.getState().d().getValue().doubleValue(), (float) c4960p7.getState().b().getValue().doubleValue(), 0.0f, null, null, composer, 48, 56);
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "16.dp thickness with 90% progress", null, composer, 384, 4);
                Ei.i.k(localThemeScope, null, 90.0f, 100.0f, H1.h.p(16), null, null, composer, 28032, 49);
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

        f(LocalThemeScope localThemeScope, C4960p7 c4960p7) {
            this.f30475a = localThemeScope;
            this.f30476b = c4960p7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(515468752, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:248)");
            }
            Si.b.b(this.f30475a, null, this.f30476b.c("Linear"), "1.0", null, ComposableLambdaKt.c(1734965027, true, new a(this.f30475a, this.f30476b), composer, 54), composer, 199680, 9);
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
    @SourceDebugExtension
    /* renamed from: Qi.p7$g */
    static final class g implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        public final void b(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2077861315, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:287)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(C4960p7.this);
            final C4960p7 c4960p7 = C4960p7.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qi.q7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4960p7.g.c(c4960p7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, B5.f28383a.a(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4960p7 c4960p7) {
            Random.Companion companion = Random.INSTANCE;
            double dE = companion.e(2.0d, 100.0d);
            c4960p7.getState().b().setValue(Double.valueOf(dE));
            c4960p7.getState().d().setValue(Double.valueOf(companion.e(1.0d, dE)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            b(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.p7$h */
    static final class h implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        public final void b(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-986237780, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ProgressIndicatorShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (ProgressIndicatorShowcase.kt:298)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(C4960p7.this);
            final C4960p7 c4960p7 = C4960p7.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qi.r7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4960p7.h.c(c4960p7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, B5.f28383a.c(), composer, 805306368, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C4960p7 c4960p7) {
            Random.Companion companion = Random.INSTANCE;
            int iH = companion.h(2, 100);
            c4960p7.getState().c().setValue(Integer.valueOf(iH));
            c4960p7.getState().e().setValue(Integer.valueOf(companion.h(1, iH)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            b(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public C4960p7(l.ProgressIndicator state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, C4960p7 c4960p7, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(649600555, true, new a(localThemeScope, c4960p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1839717548, true, new b(localThemeScope, c4960p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1970304499, true, new c(localThemeScope, c4960p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1485359250, true, new d(localThemeScope, c4960p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1000414001, true, new e(localThemeScope, c4960p7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(515468752, true, new f(localThemeScope, c4960p7)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4960p7 c4960p7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4960p7.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C4960p7 c4960p7, InterfaceC15617C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(2077861315, true, c4960p7.new g()), 7, null);
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-986237780, true, c4960p7.new h()), 7, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(C4960p7 c4960p7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4960p7.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            InterfaceC15627b.a aVar = new InterfaceC15627b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.l7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4960p7.m(this.f30383a, (InterfaceC15617C) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15632g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 0, 1022);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.m7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4960p7.n(this.f30397a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Qi.n7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4960p7.k(localThemeScope, this, (l0.w) obj);
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
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.o7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4960p7.l(this.f30437a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Progress Indicator";
    }

    @Override // Oi.c
    /* renamed from: o, reason: from getter */
    public l.ProgressIndicator getState() {
        return this.state;
    }
}
