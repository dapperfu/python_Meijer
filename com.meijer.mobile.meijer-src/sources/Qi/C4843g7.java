package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import Qi.C4843g7;
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
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18049x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import m0.C15632g;
import m0.InterfaceC15617C;
import m0.InterfaceC15627b;
import m0.InterfaceC15639n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LQi/g7;", "LOi/c;", "LOi/l$n;", "state", "<init>", "(LOi/l$n;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$n;", "o", "()LOi/l$n;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.g7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4843g7 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.LoadingState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.g7$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30212b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$a$a, reason: collision with other inner class name */
        static final class C0603a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30213a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4843g7 f30214b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.g7$a$a$a, reason: collision with other inner class name */
            static final class C0604a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4843g7 f30215a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30216b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$a$a$a$a, reason: collision with other inner class name */
                static final class C0605a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30217a;

                    C0605a(LocalThemeScope localThemeScope) {
                        this.f30217a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1330592975, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:56)");
                        }
                        LocalThemeScope localThemeScope = this.f30217a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$a$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30218a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30218a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1291953062, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:70)");
                        }
                        LocalThemeScope localThemeScope = this.f30218a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$a$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30219a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30219a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1722299335, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:85)");
                        }
                        LocalThemeScope localThemeScope = this.f30219a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0604a(C4843g7 c4843g7, LocalThemeScope localThemeScope) {
                    this.f30215a = c4843g7;
                    this.f30216b = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(2088007663, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:51)");
                    }
                    q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    Ci.o value = this.f30215a.getState().b().getValue();
                    LocalThemeScope localThemeScope = this.f30216b;
                    Ci.m.d(localThemeScope, modifierF, largeLoading, value, null, null, ComposableLambdaKt.c(-1330592975, true, new C0605a(localThemeScope), composer, 54), composer, 1572912, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Ci.o oVar = Ci.o.f4629a;
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30216b;
                    Ci.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1291953062, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30216b;
                    Ci.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1722299335, true, new c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0603a(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
                this.f30213a = localThemeScope;
                this.f30214b = c4843g7;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1294929654, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:49)");
                }
                LocalThemeScope localThemeScope = this.f30213a;
                C4843g7 c4843g7 = this.f30214b;
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
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(2088007663, true, new C0604a(c4843g7, localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30211a = localThemeScope;
            this.f30212b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(388966263, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:45)");
            }
            Si.b.b(this.f30211a, null, this.f30212b.c("Large Loading"), "1.0", null, ComposableLambdaKt.c(-1294929654, true, new C0603a(this.f30211a, this.f30212b), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30220a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30221b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.g7$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30222a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.g7$b$a$a, reason: collision with other inner class name */
            static final class C0606a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30223a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$b$a$a$a, reason: collision with other inner class name */
                static final class C0607a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30224a;

                    C0607a(LocalThemeScope localThemeScope) {
                        this.f30224a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1103349586, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:111)");
                        }
                        LocalThemeScope localThemeScope = this.f30224a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$b$a$a$b, reason: collision with other inner class name */
                static final class C0608b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30225a;

                    C0608b(LocalThemeScope localThemeScope) {
                        this.f30225a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1669868439, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:128)");
                        }
                        LocalThemeScope localThemeScope = this.f30225a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$b$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30226a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30226a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(423960502, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:144)");
                        }
                        LocalThemeScope localThemeScope = this.f30226a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0606a(LocalThemeScope localThemeScope) {
                    this.f30223a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(1158565666, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:103)");
                    }
                    LocalThemeScope localThemeScope = this.f30223a;
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
                    q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
                    Ci.o oVar = Ci.o.f4629a;
                    float f10 = 20;
                    Ci.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), smallLoading, oVar, null, false, ComposableLambdaKt.c(-1103349586, true, new C0607a(localThemeScope), composer, 54), composer, 1575984, 24);
                    Ci.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), Assemble.getLoading().getSmallLoading(), oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1669868439, true, new C0608b(localThemeScope), composer, 54), composer, 1797168, 0);
                    Ci.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), Assemble.getLoading().getSmallLoading(), oVar, "Lorem ipsum", false, ComposableLambdaKt.c(423960502, true, new c(localThemeScope), composer, 54), composer, 1600560, 16);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30222a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-966636557, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:102)");
                }
                LocalThemeScope localThemeScope = this.f30222a;
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(1158565666, true, new C0606a(localThemeScope), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30220a = localThemeScope;
            this.f30221b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1945330912, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:98)");
            }
            Si.b.b(this.f30220a, null, this.f30221b.c("Small Loading"), "1.0", null, ComposableLambdaKt.c(-966636557, true, new a(this.f30220a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$c */
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30228b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30229a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.g7$c$a$a, reason: collision with other inner class name */
            static final class C0609a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30230a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$c$a$a$a, reason: collision with other inner class name */
                static final class C0610a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30231a;

                    C0610a(LocalThemeScope localThemeScope) {
                        this.f30231a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1231341689, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:168)");
                        }
                        LocalThemeScope localThemeScope = this.f30231a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$c$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30232a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30232a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-290407582, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:182)");
                        }
                        LocalThemeScope localThemeScope = this.f30232a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$c$a$a$c, reason: collision with other inner class name */
                static final class C0611c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30233a;

                    C0611c(LocalThemeScope localThemeScope) {
                        this.f30233a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1536315519, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:197)");
                        }
                        LocalThemeScope localThemeScope = this.f30233a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0609a(LocalThemeScope localThemeScope) {
                    this.f30230a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(856573367, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:163)");
                    }
                    q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    Ci.o oVar = Ci.o.f4630b;
                    LocalThemeScope localThemeScope = this.f30230a;
                    Ci.m.d(localThemeScope, modifierF, largeLoading, oVar, null, null, ComposableLambdaKt.c(1231341689, true, new C0610a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30230a;
                    Ci.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-290407582, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30230a;
                    Ci.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1536315519, true, new C0611c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30229a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1144054802, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:161)");
                }
                LocalThemeScope localThemeScope = this.f30229a;
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
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(856573367, true, new C0609a(localThemeScope), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30227a = localThemeScope;
            this.f30228b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(165360447, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:157)");
            }
            Si.b.b(this.f30227a, null, this.f30228b.c("Large Loading Error"), "1.0", null, ComposableLambdaKt.c(1144054802, true, new a(this.f30227a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$d */
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30235b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30236a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.g7$d$a$a, reason: collision with other inner class name */
            static final class C0612a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30237a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$d$a$a$a, reason: collision with other inner class name */
                static final class C0613a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30238a;

                    C0613a(LocalThemeScope localThemeScope) {
                        this.f30238a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-952934248, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:223)");
                        }
                        LocalThemeScope localThemeScope = this.f30238a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$d$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30239a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30239a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1820283777, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:240)");
                        }
                        LocalThemeScope localThemeScope = this.f30239a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$d$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30240a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30240a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(574375840, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:256)");
                        }
                        LocalThemeScope localThemeScope = this.f30240a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0612a(LocalThemeScope localThemeScope) {
                    this.f30237a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(-1327702570, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:216)");
                    }
                    q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
                    Ci.o oVar = Ci.o.f4630b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 20;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f30237a;
                    Ci.m.f(localThemeScope, modifierH, smallLoading, oVar, null, false, ComposableLambdaKt.c(-952934248, true, new C0613a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Small smallLoading2 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30237a;
                    Ci.m.f(localThemeScope2, modifierH2, smallLoading2, oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1820283777, true, new b(localThemeScope2), composer, 54), composer, 1797168, 0);
                    q1.k.Small smallLoading3 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30237a;
                    Ci.m.f(localThemeScope3, modifierH3, smallLoading3, oVar, "Lorem ipsum", false, ComposableLambdaKt.c(574375840, true, new c(localThemeScope3), composer, 54), composer, 1600560, 16);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30236a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1040221135, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:214)");
                }
                LocalThemeScope localThemeScope = this.f30236a;
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
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1327702570, true, new C0612a(localThemeScope), composer, 54), composer, 432);
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

        d(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30234a = localThemeScope;
            this.f30235b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2018915490, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:210)");
            }
            Si.b.b(this.f30234a, null, this.f30235b.c("Small Loading Error"), "1.0", null, ComposableLambdaKt.c(-1040221135, true, new a(this.f30234a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$e */
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30242b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30243a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.g7$e$a$a, reason: collision with other inner class name */
            static final class C0614a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30244a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$e$a$a$a, reason: collision with other inner class name */
                static final class C0615a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30245a;

                    C0615a(LocalThemeScope localThemeScope) {
                        this.f30245a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1157757111, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:280)");
                        }
                        LocalThemeScope localThemeScope = this.f30245a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$e$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30246a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30246a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-363992160, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:294)");
                        }
                        LocalThemeScope localThemeScope = this.f30246a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$e$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30247a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30247a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1609900097, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:309)");
                        }
                        LocalThemeScope localThemeScope = this.f30247a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0614a(LocalThemeScope localThemeScope) {
                    this.f30244a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(782988789, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:275)");
                    }
                    q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                    Ci.o oVar = Ci.o.f4631c;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f30244a;
                    Ci.m.d(localThemeScope, modifierF, largeLoading, oVar, null, null, ComposableLambdaKt.c(1157757111, true, new C0615a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30244a;
                    Ci.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-363992160, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30244a;
                    Ci.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1609900097, true, new c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30243a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1070470224, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:273)");
                }
                LocalThemeScope localThemeScope = this.f30243a;
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
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(782988789, true, new C0614a(localThemeScope), composer, 54), composer, 432);
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

        e(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30241a = localThemeScope;
            this.f30242b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(91775869, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:269)");
            }
            Si.b.b(this.f30241a, null, this.f30242b.c("Large Loading Success"), "1.0", null, ComposableLambdaKt.c(1070470224, true, new a(this.f30241a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$f */
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30249b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30250a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.g7$f$a$a, reason: collision with other inner class name */
            static final class C0616a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30251a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$f$a$a$a, reason: collision with other inner class name */
                static final class C0617a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30252a;

                    C0617a(LocalThemeScope localThemeScope) {
                        this.f30252a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1026518826, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:335)");
                        }
                        LocalThemeScope localThemeScope = this.f30252a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$f$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30253a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30253a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1746699199, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:352)");
                        }
                        LocalThemeScope localThemeScope = this.f30253a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$f$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30254a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30254a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(500791262, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:368)");
                        }
                        LocalThemeScope localThemeScope = this.f30254a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0616a(LocalThemeScope localThemeScope) {
                    this.f30251a = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(-1401287148, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:328)");
                    }
                    q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
                    Ci.o oVar = Ci.o.f4631c;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 20;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f30251a;
                    Ci.m.f(localThemeScope, modifierH, smallLoading, oVar, null, false, ComposableLambdaKt.c(-1026518826, true, new C0617a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Small smallLoading2 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30251a;
                    Ci.m.f(localThemeScope2, modifierH2, smallLoading2, oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1746699199, true, new b(localThemeScope2), composer, 54), composer, 1797168, 0);
                    q1.k.Small smallLoading3 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30251a;
                    Ci.m.f(localThemeScope3, modifierH3, smallLoading3, oVar, "Lorem ipsum", false, ComposableLambdaKt.c(500791262, true, new c(localThemeScope3), composer, 54), composer, 1600560, 16);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30250a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1113805713, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:326)");
                }
                LocalThemeScope localThemeScope = this.f30250a;
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
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1401287148, true, new C0616a(localThemeScope), composer, 54), composer, 432);
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

        f(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30248a = localThemeScope;
            this.f30249b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2092500068, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:322)");
            }
            Si.b.b(this.f30248a, null, this.f30249b.c("Small Loading Success"), "1.0", null, ComposableLambdaKt.c(-1113805713, true, new a(this.f30248a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$g */
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4843g7 f30256b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.g7$g$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30257a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4843g7 f30258b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.g7$g$a$a, reason: collision with other inner class name */
            static final class C0618a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4843g7 f30259a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30260b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$a, reason: collision with other inner class name */
                static final class C0619a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30261a;

                    C0619a(LocalThemeScope localThemeScope) {
                        this.f30261a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1084172533, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:392)");
                        }
                        LocalThemeScope localThemeScope = this.f30261a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30262a;

                    b(LocalThemeScope localThemeScope) {
                        this.f30262a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-437576738, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:406)");
                        }
                        LocalThemeScope localThemeScope = this.f30262a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30263a;

                    c(LocalThemeScope localThemeScope) {
                        this.f30263a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1683484675, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:421)");
                        }
                        LocalThemeScope localThemeScope = this.f30263a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$d */
                static final class d implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30264a;

                    d(LocalThemeScope localThemeScope) {
                        this.f30264a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1365574684, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:439)");
                        }
                        LocalThemeScope localThemeScope = this.f30264a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$e */
                static final class e implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30265a;

                    e(LocalThemeScope localThemeScope) {
                        this.f30265a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(119666747, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:458)");
                        }
                        LocalThemeScope localThemeScope = this.f30265a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.g7$g$a$a$f */
                static final class f implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30266a;

                    f(LocalThemeScope localThemeScope) {
                        this.f30266a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1126241190, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:478)");
                        }
                        LocalThemeScope localThemeScope = this.f30266a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14889J c14889j = C14889J.f139620a;
                        si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0618a(C4843g7 c4843g7, LocalThemeScope localThemeScope) {
                    this.f30259a = c4843g7;
                    this.f30260b = localThemeScope;
                }

                public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(709404211, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:387)");
                    }
                    q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                    Ci.o value = this.f30259a.getState().b().getValue();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f30260b;
                    Ci.m.d(localThemeScope, modifierF, largeLoading, value, null, null, ComposableLambdaKt.c(1084172533, true, new C0619a(localThemeScope), composer, 54), composer, 1572912, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Ci.o value2 = this.f30259a.getState().b().getValue();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f30260b;
                    Ci.m.d(localThemeScope2, modifierF2, largeLoading2, value2, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-437576738, true, new b(localThemeScope2), composer, 54), composer, 1769520, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Ci.o value3 = this.f30259a.getState().b().getValue();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f30260b;
                    Ci.m.d(localThemeScope3, modifierF3, largeLoading3, value3, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1683484675, true, new c(localThemeScope3), composer, 54), composer, 1794096, 0);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
                    Ci.o value4 = this.f30259a.getState().b().getValue();
                    Modifier modifierF4 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f30260b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope4 = this.f30260b;
                    Ci.m.e(localThemeScope4, modifierF4, largeLoadingV2, value4, null, null, ComposableLambdaKt.c(1365574684, true, new d(localThemeScope4), composer, 54), composer, 1572864, 24);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV22 = Assemble.getLoading().getLargeLoadingV2();
                    Ci.o value5 = this.f30259a.getState().b().getValue();
                    Modifier modifierF5 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f30260b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope5 = this.f30260b;
                    Ci.m.e(localThemeScope5, modifierF5, largeLoadingV22, value5, "Lorem Ipsum", null, ComposableLambdaKt.c(119666747, true, new e(localThemeScope5), composer, 54), composer, 1597440, 16);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion, this.f30260b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV23 = Assemble.getLoading().getLargeLoadingV2();
                    Ci.o value6 = this.f30259a.getState().b().getValue();
                    Modifier modifierF6 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f30260b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope6 = this.f30260b;
                    Ci.m.e(localThemeScope6, modifierF6, largeLoadingV23, value6, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1126241190, true, new f(localThemeScope6), composer, 54), composer, 1794048, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                    a(interfaceC15154X, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
                this.f30257a = localThemeScope;
                this.f30258b = c4843g7;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(996885646, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:385)");
                }
                Modifier modifierY = androidx.compose.foundation.layout.J.y(Modifier.INSTANCE, H1.h.p(100), H1.h.p(HttpResponseStatus.SUCCESS_OK), 0.0f, 0.0f, 12, null);
                LocalThemeScope localThemeScope = this.f30257a;
                C4843g7 c4843g7 = this.f30258b;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierY);
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(709404211, true, new C0618a(c4843g7, localThemeScope), composer, 54), composer, 432);
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

        g(LocalThemeScope localThemeScope, C4843g7 c4843g7) {
            this.f30255a = localThemeScope;
            this.f30256b = c4843g7;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(18191291, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:381)");
            }
            Si.b.b(this.f30255a, null, this.f30256b.c("Random Status Loading"), "1.0", null, ComposableLambdaKt.c(996885646, true, new a(this.f30255a, this.f30256b), composer, 54), composer, 199680, 9);
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
    /* renamed from: Qi.g7$h */
    static final class h implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        h() {
        }

        public final void c(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1186884367, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:496)");
            }
            final C4843g7 c4843g7 = C4843g7.this;
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
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c4843g7);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qi.h7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4843g7.h.d(c4843g7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            A5 a52 = A5.f28352a;
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, a52.d(), composer, 805306368, 510);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(c4843g7);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Qi.i7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4843g7.h.e(c4843g7);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C18049x.a((Function0) objB2, null, false, null, null, null, null, null, null, a52.b(), composer, 805306368, 510);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            c(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(C4843g7 c4843g7) {
            c4843g7.getState().b().setValue(Ci.o.f4629a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(C4843g7 c4843g7) {
            c4843g7.getState().b().setValue(Ci.o.f4631c);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.g7$i */
    static final class i implements Function3<InterfaceC15639n, Composer, Integer, Unit> {
        i() {
        }

        public final void c(InterfaceC15639n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(917489784, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:514)");
            }
            final C4843g7 c4843g7 = C4843g7.this;
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
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c4843g7);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qi.j7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4843g7.i.d(c4843g7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            A5 a52 = A5.f28352a;
            C18049x.a((Function0) objB, null, false, null, null, null, null, null, null, a52.a(), composer, 805306368, 510);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(c4843g7);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Qi.k7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4843g7.i.e(c4843g7);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C18049x.a((Function0) objB2, null, false, null, null, null, null, null, null, a52.c(), composer, 805306368, 510);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
            c(interfaceC15639n, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(C4843g7 c4843g7) {
            c4843g7.getState().b().setValue(Ci.o.f4630b);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(C4843g7 c4843g7) {
            c4843g7.getState().b().setValue(Ci.o.f4632d);
            return Unit.f143329a;
        }
    }

    public C4843g7(l.LoadingState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, C4843g7 c4843g7, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(388966263, true, new a(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1945330912, true, new b(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(165360447, true, new c(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2018915490, true, new d(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(91775869, true, new e(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2092500068, true, new f(localThemeScope, c4843g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(18191291, true, new g(localThemeScope, c4843g7)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4843g7 c4843g7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4843g7.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C4843g7 c4843g7, InterfaceC15617C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1186884367, true, c4843g7.new h()), 7, null);
        InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(917489784, true, c4843g7.new i()), 7, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(C4843g7 c4843g7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4843g7.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1263257155);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.V(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1263257155, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Controls (LoadingShowcase.kt:493)");
            }
            int i12 = i11;
            InterfaceC15627b.a aVar = new InterfaceC15627b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.e7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4843g7.m(this.f30178a, (InterfaceC15617C) obj);
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
            t0L.a(new Function2() { // from class: Qi.f7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4843g7.n(this.f30193a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1633603412);
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
                ComposerKt.U(-1633603412, i11, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content (LoadingShowcase.kt:40)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.c7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4843g7.k(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.d7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4843g7.l(this.f30154a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Loading";
    }

    @Override // Oi.c
    /* renamed from: o, reason: from getter */
    public l.LoadingState getState() {
        return this.state;
    }
}
