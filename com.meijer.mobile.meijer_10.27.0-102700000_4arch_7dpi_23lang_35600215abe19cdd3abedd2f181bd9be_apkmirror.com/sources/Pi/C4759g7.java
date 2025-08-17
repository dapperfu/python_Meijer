package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import Pi.C4759g7;
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
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17983x;
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
import m0.C15521g;
import m0.InterfaceC15506C;
import m0.InterfaceC15516b;
import m0.InterfaceC15528n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LPi/g7;", "LNi/c;", "LNi/l$n;", "state", "<init>", "(LNi/l$n;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$n;", "o", "()LNi/l$n;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.g7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4759g7 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.LoadingState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.g7$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27500b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$a$a, reason: collision with other inner class name */
        static final class C0539a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27501a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4759g7 f27502b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.g7$a$a$a, reason: collision with other inner class name */
            static final class C0540a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4759g7 f27503a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27504b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$a$a$a$a, reason: collision with other inner class name */
                static final class C0541a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27505a;

                    C0541a(LocalThemeScope localThemeScope) {
                        this.f27505a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1330592975, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:56)");
                        }
                        LocalThemeScope localThemeScope = this.f27505a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$a$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27506a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27506a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1291953062, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:70)");
                        }
                        LocalThemeScope localThemeScope = this.f27506a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$a$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27507a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27507a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1722299335, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:85)");
                        }
                        LocalThemeScope localThemeScope = this.f27507a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0540a(C4759g7 c4759g7, LocalThemeScope localThemeScope) {
                    this.f27503a = c4759g7;
                    this.f27504b = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o value = this.f27503a.getState().b().getValue();
                    LocalThemeScope localThemeScope = this.f27504b;
                    Bi.m.d(localThemeScope, modifierF, largeLoading, value, null, null, ComposableLambdaKt.c(-1330592975, true, new C0541a(localThemeScope), composer, 54), composer, 1572912, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Bi.o oVar = Bi.o.f2584a;
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27504b;
                    Bi.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1291953062, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27504b;
                    Bi.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1722299335, true, new c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0539a(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
                this.f27501a = localThemeScope;
                this.f27502b = c4759g7;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1294929654, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:49)");
                }
                LocalThemeScope localThemeScope = this.f27501a;
                C4759g7 c4759g7 = this.f27502b;
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
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(2088007663, true, new C0540a(c4759g7, localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27499a = localThemeScope;
            this.f27500b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(388966263, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:45)");
            }
            Ri.b.b(this.f27499a, null, this.f27500b.d("Large Loading"), "1.0", null, ComposableLambdaKt.c(-1294929654, true, new C0539a(this.f27499a, this.f27500b), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27509b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.g7$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27510a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.g7$b$a$a, reason: collision with other inner class name */
            static final class C0542a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27511a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$b$a$a$a, reason: collision with other inner class name */
                static final class C0543a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27512a;

                    C0543a(LocalThemeScope localThemeScope) {
                        this.f27512a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1103349586, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:111)");
                        }
                        LocalThemeScope localThemeScope = this.f27512a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$b$a$a$b, reason: collision with other inner class name */
                static final class C0544b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27513a;

                    C0544b(LocalThemeScope localThemeScope) {
                        this.f27513a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1669868439, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:128)");
                        }
                        LocalThemeScope localThemeScope = this.f27513a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$b$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27514a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27514a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(423960502, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:144)");
                        }
                        LocalThemeScope localThemeScope = this.f27514a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0542a(LocalThemeScope localThemeScope) {
                    this.f27511a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f27511a;
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
                    q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
                    Bi.o oVar = Bi.o.f2584a;
                    float f10 = 20;
                    Bi.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), smallLoading, oVar, null, false, ComposableLambdaKt.c(-1103349586, true, new C0543a(localThemeScope), composer, 54), composer, 1575984, 24);
                    Bi.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), Assemble.getLoading().getSmallLoading(), oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1669868439, true, new C0544b(localThemeScope), composer, 54), composer, 1797168, 0);
                    Bi.m.f(localThemeScope, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null), Assemble.getLoading().getSmallLoading(), oVar, "Lorem ipsum", false, ComposableLambdaKt.c(423960502, true, new c(localThemeScope), composer, 54), composer, 1600560, 16);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27510a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-966636557, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:102)");
                }
                LocalThemeScope localThemeScope = this.f27510a;
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(1158565666, true, new C0542a(localThemeScope), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27508a = localThemeScope;
            this.f27509b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1945330912, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:98)");
            }
            Ri.b.b(this.f27508a, null, this.f27509b.d("Small Loading"), "1.0", null, ComposableLambdaKt.c(-966636557, true, new a(this.f27508a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$c */
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27516b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27517a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.g7$c$a$a, reason: collision with other inner class name */
            static final class C0545a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27518a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$c$a$a$a, reason: collision with other inner class name */
                static final class C0546a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27519a;

                    C0546a(LocalThemeScope localThemeScope) {
                        this.f27519a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1231341689, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:168)");
                        }
                        LocalThemeScope localThemeScope = this.f27519a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$c$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27520a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27520a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-290407582, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:182)");
                        }
                        LocalThemeScope localThemeScope = this.f27520a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$c$a$a$c, reason: collision with other inner class name */
                static final class C0547c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27521a;

                    C0547c(LocalThemeScope localThemeScope) {
                        this.f27521a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1536315519, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:197)");
                        }
                        LocalThemeScope localThemeScope = this.f27521a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0545a(LocalThemeScope localThemeScope) {
                    this.f27518a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o oVar = Bi.o.f2585b;
                    LocalThemeScope localThemeScope = this.f27518a;
                    Bi.m.d(localThemeScope, modifierF, largeLoading, oVar, null, null, ComposableLambdaKt.c(1231341689, true, new C0546a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27518a;
                    Bi.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-290407582, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27518a;
                    Bi.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1536315519, true, new C0547c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27517a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1144054802, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:161)");
                }
                LocalThemeScope localThemeScope = this.f27517a;
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
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(856573367, true, new C0545a(localThemeScope), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27515a = localThemeScope;
            this.f27516b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(165360447, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:157)");
            }
            Ri.b.b(this.f27515a, null, this.f27516b.d("Large Loading Error"), "1.0", null, ComposableLambdaKt.c(1144054802, true, new a(this.f27515a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$d */
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27523b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27524a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.g7$d$a$a, reason: collision with other inner class name */
            static final class C0548a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27525a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$d$a$a$a, reason: collision with other inner class name */
                static final class C0549a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27526a;

                    C0549a(LocalThemeScope localThemeScope) {
                        this.f27526a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-952934248, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:223)");
                        }
                        LocalThemeScope localThemeScope = this.f27526a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$d$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27527a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27527a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1820283777, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:240)");
                        }
                        LocalThemeScope localThemeScope = this.f27527a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$d$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27528a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27528a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(574375840, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:256)");
                        }
                        LocalThemeScope localThemeScope = this.f27528a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0548a(LocalThemeScope localThemeScope) {
                    this.f27525a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o oVar = Bi.o.f2585b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 20;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f27525a;
                    Bi.m.f(localThemeScope, modifierH, smallLoading, oVar, null, false, ComposableLambdaKt.c(-952934248, true, new C0549a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Small smallLoading2 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27525a;
                    Bi.m.f(localThemeScope2, modifierH2, smallLoading2, oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1820283777, true, new b(localThemeScope2), composer, 54), composer, 1797168, 0);
                    q1.k.Small smallLoading3 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27525a;
                    Bi.m.f(localThemeScope3, modifierH3, smallLoading3, oVar, "Lorem ipsum", false, ComposableLambdaKt.c(574375840, true, new c(localThemeScope3), composer, 54), composer, 1600560, 16);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27524a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1040221135, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:214)");
                }
                LocalThemeScope localThemeScope = this.f27524a;
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
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1327702570, true, new C0548a(localThemeScope), composer, 54), composer, 432);
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

        d(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27522a = localThemeScope;
            this.f27523b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2018915490, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:210)");
            }
            Ri.b.b(this.f27522a, null, this.f27523b.d("Small Loading Error"), "1.0", null, ComposableLambdaKt.c(-1040221135, true, new a(this.f27522a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$e */
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27530b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27531a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.g7$e$a$a, reason: collision with other inner class name */
            static final class C0550a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27532a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$e$a$a$a, reason: collision with other inner class name */
                static final class C0551a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27533a;

                    C0551a(LocalThemeScope localThemeScope) {
                        this.f27533a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1157757111, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:280)");
                        }
                        LocalThemeScope localThemeScope = this.f27533a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$e$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27534a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27534a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-363992160, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:294)");
                        }
                        LocalThemeScope localThemeScope = this.f27534a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$e$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27535a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27535a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1609900097, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:309)");
                        }
                        LocalThemeScope localThemeScope = this.f27535a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0550a(LocalThemeScope localThemeScope) {
                    this.f27532a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o oVar = Bi.o.f2586c;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f27532a;
                    Bi.m.d(localThemeScope, modifierF, largeLoading, oVar, null, null, ComposableLambdaKt.c(1157757111, true, new C0551a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27532a;
                    Bi.m.d(localThemeScope2, modifierF2, largeLoading2, oVar, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-363992160, true, new b(localThemeScope2), composer, 54), composer, 1772592, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27532a;
                    Bi.m.d(localThemeScope3, modifierF3, largeLoading3, oVar, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1609900097, true, new c(localThemeScope3), composer, 54), composer, 1797168, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27531a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1070470224, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:273)");
                }
                LocalThemeScope localThemeScope = this.f27531a;
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
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(782988789, true, new C0550a(localThemeScope), composer, 54), composer, 432);
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

        e(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27529a = localThemeScope;
            this.f27530b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(91775869, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:269)");
            }
            Ri.b.b(this.f27529a, null, this.f27530b.d("Large Loading Success"), "1.0", null, ComposableLambdaKt.c(1070470224, true, new a(this.f27529a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$f */
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27537b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27538a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.g7$f$a$a, reason: collision with other inner class name */
            static final class C0552a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27539a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$f$a$a$a, reason: collision with other inner class name */
                static final class C0553a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27540a;

                    C0553a(LocalThemeScope localThemeScope) {
                        this.f27540a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1026518826, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:335)");
                        }
                        LocalThemeScope localThemeScope = this.f27540a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple small loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$f$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27541a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27541a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1746699199, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:352)");
                        }
                        LocalThemeScope localThemeScope = this.f27541a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$f$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27542a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27542a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(500791262, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:368)");
                        }
                        LocalThemeScope localThemeScope = this.f27542a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, small loader with title and description", null, composer, 384, 4);
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

                C0552a(LocalThemeScope localThemeScope) {
                    this.f27539a = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o oVar = Bi.o.f2586c;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 20;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f27539a;
                    Bi.m.f(localThemeScope, modifierH, smallLoading, oVar, null, false, ComposableLambdaKt.c(-1026518826, true, new C0553a(localThemeScope), composer, 54), composer, 1575984, 24);
                    q1.k.Small smallLoading2 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27539a;
                    Bi.m.f(localThemeScope2, modifierH2, smallLoading2, oVar, "Lorem ipsum", true, ComposableLambdaKt.c(1746699199, true, new b(localThemeScope2), composer, 54), composer, 1797168, 0);
                    q1.k.Small smallLoading3 = Assemble.getLoading().getSmallLoading();
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27539a;
                    Bi.m.f(localThemeScope3, modifierH3, smallLoading3, oVar, "Lorem ipsum", false, ComposableLambdaKt.c(500791262, true, new c(localThemeScope3), composer, 54), composer, 1600560, 16);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27538a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1113805713, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:326)");
                }
                LocalThemeScope localThemeScope = this.f27538a;
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
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1401287148, true, new C0552a(localThemeScope), composer, 54), composer, 432);
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

        f(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27536a = localThemeScope;
            this.f27537b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2092500068, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:322)");
            }
            Ri.b.b(this.f27536a, null, this.f27537b.d("Small Loading Success"), "1.0", null, ComposableLambdaKt.c(-1113805713, true, new a(this.f27536a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$g */
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4759g7 f27544b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.g7$g$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27545a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4759g7 f27546b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.g7$g$a$a, reason: collision with other inner class name */
            static final class C0554a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4759g7 f27547a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27548b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.g7$g$a$a$a, reason: collision with other inner class name */
                static final class C0555a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27549a;

                    C0555a(LocalThemeScope localThemeScope) {
                        this.f27549a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1084172533, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:392)");
                        }
                        LocalThemeScope localThemeScope = this.f27549a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content for simple large loader", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$g$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27550a;

                    b(LocalThemeScope localThemeScope) {
                        this.f27550a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-437576738, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:406)");
                        }
                        LocalThemeScope localThemeScope = this.f27550a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$g$a$a$c */
                static final class c implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27551a;

                    c(LocalThemeScope localThemeScope) {
                        this.f27551a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1683484675, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:421)");
                        }
                        LocalThemeScope localThemeScope = this.f27551a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$g$a$a$d */
                static final class d implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27552a;

                    d(LocalThemeScope localThemeScope) {
                        this.f27552a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1365574684, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:439)");
                        }
                        LocalThemeScope localThemeScope = this.f27552a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$g$a$a$e */
                static final class e implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27553a;

                    e(LocalThemeScope localThemeScope) {
                        this.f27553a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(119666747, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:458)");
                        }
                        LocalThemeScope localThemeScope = this.f27553a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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
                /* renamed from: Pi.g7$g$a$a$f */
                static final class f implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27554a;

                    f(LocalThemeScope localThemeScope) {
                        this.f27554a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1126241190, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:478)");
                        }
                        LocalThemeScope localThemeScope = this.f27554a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
                        androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                        androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 383, null), "Example of content, large loader with title and description", null, composer, 384, 4);
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

                C0554a(C4759g7 c4759g7, LocalThemeScope localThemeScope) {
                    this.f27547a = c4759g7;
                    this.f27548b = localThemeScope;
                }

                public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
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
                    Bi.o value = this.f27547a.getState().b().getValue();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f27548b;
                    Bi.m.d(localThemeScope, modifierF, largeLoading, value, null, null, ComposableLambdaKt.c(1084172533, true, new C0555a(localThemeScope), composer, 54), composer, 1572912, 24);
                    q1.k.Large largeLoading2 = Assemble.getLoading().getLargeLoading();
                    Bi.o value2 = this.f27547a.getState().b().getValue();
                    Modifier modifierF2 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope2 = this.f27548b;
                    Bi.m.d(localThemeScope2, modifierF2, largeLoading2, value2, null, "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-437576738, true, new b(localThemeScope2), composer, 54), composer, 1769520, 8);
                    q1.k.Large largeLoading3 = Assemble.getLoading().getLargeLoading();
                    Bi.o value3 = this.f27547a.getState().b().getValue();
                    Modifier modifierF3 = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
                    LocalThemeScope localThemeScope3 = this.f27548b;
                    Bi.m.d(localThemeScope3, modifierF3, largeLoading3, value3, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1683484675, true, new c(localThemeScope3), composer, 54), composer, 1794096, 0);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
                    Bi.o value4 = this.f27547a.getState().b().getValue();
                    Modifier modifierF4 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f27548b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope4 = this.f27548b;
                    Bi.m.e(localThemeScope4, modifierF4, largeLoadingV2, value4, null, null, ComposableLambdaKt.c(1365574684, true, new d(localThemeScope4), composer, 54), composer, 1572864, 24);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV22 = Assemble.getLoading().getLargeLoadingV2();
                    Bi.o value5 = this.f27547a.getState().b().getValue();
                    Modifier modifierF5 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f27548b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope5 = this.f27548b;
                    Bi.m.e(localThemeScope5, modifierF5, largeLoadingV22, value5, "Lorem Ipsum", null, ComposableLambdaKt.c(119666747, true, new e(localThemeScope5), composer, 54), composer, 1597440, 16);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, this.f27548b.getAdsSpacing().getThree().getDp()), composer, 0);
                    q1.k.LargeV2 largeLoadingV23 = Assemble.getLoading().getLargeLoadingV2();
                    Bi.o value6 = this.f27547a.getState().b().getValue();
                    Modifier modifierF6 = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(companion, this.f27548b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                    LocalThemeScope localThemeScope6 = this.f27548b;
                    Bi.m.e(localThemeScope6, modifierF6, largeLoadingV23, value6, "Lorem Ipsum", "Lorem ipsum dolor sit amet,\n consectetur adipiscing elit, sed", ComposableLambdaKt.c(-1126241190, true, new f(localThemeScope6), composer, 54), composer, 1794048, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                    a(interfaceC14920X, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
                this.f27545a = localThemeScope;
                this.f27546b = c4759g7;
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
                LocalThemeScope localThemeScope = this.f27545a;
                C4759g7 c4759g7 = this.f27546b;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierY);
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
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(709404211, true, new C0554a(c4759g7, localThemeScope), composer, 54), composer, 432);
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

        g(LocalThemeScope localThemeScope, C4759g7 c4759g7) {
            this.f27543a = localThemeScope;
            this.f27544b = c4759g7;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(18191291, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Content.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:381)");
            }
            Ri.b.b(this.f27543a, null, this.f27544b.d("Random Status Loading"), "1.0", null, ComposableLambdaKt.c(996885646, true, new a(this.f27543a, this.f27544b), composer, 54), composer, 199680, 9);
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
    /* renamed from: Pi.g7$h */
    static final class h implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        h() {
        }

        public final void c(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1186884367, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:496)");
            }
            final C4759g7 c4759g7 = C4759g7.this;
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
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c4759g7);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.h7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4759g7.h.d(c4759g7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            A5 a52 = A5.f25640a;
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, a52.d(), composer, 805306368, 510);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(c4759g7);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Pi.i7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4759g7.h.e(c4759g7);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C17983x.a((Function0) objB2, null, false, null, null, null, null, null, null, a52.b(), composer, 805306368, 510);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            c(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(C4759g7 c4759g7) {
            c4759g7.getState().b().setValue(Bi.o.f2584a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(C4759g7 c4759g7) {
            c4759g7.getState().b().setValue(Bi.o.f2586c);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.g7$i */
    static final class i implements Function3<InterfaceC15528n, Composer, Integer, Unit> {
        i() {
        }

        public final void c(InterfaceC15528n item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(917489784, i10, -1, "com.meijer.mobile.androidacres.showcase.components.LoadingShowcase.Controls.<anonymous>.<anonymous>.<anonymous> (LoadingShowcase.kt:514)");
            }
            final C4759g7 c4759g7 = C4759g7.this;
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
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c4759g7);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pi.j7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4759g7.i.d(c4759g7);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            A5 a52 = A5.f25640a;
            C17983x.a((Function0) objB, null, false, null, null, null, null, null, null, a52.a(), composer, 805306368, 510);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(c4759g7);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Pi.k7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4759g7.i.e(c4759g7);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C17983x.a((Function0) objB2, null, false, null, null, null, null, null, null, a52.c(), composer, 805306368, 510);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
            c(interfaceC15528n, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(C4759g7 c4759g7) {
            c4759g7.getState().b().setValue(Bi.o.f2585b);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(C4759g7 c4759g7) {
            c4759g7.getState().b().setValue(Bi.o.f2587d);
            return Unit.f142422a;
        }
    }

    public C4759g7(l.LoadingState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, C4759g7 c4759g7, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(388966263, true, new a(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1945330912, true, new b(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(165360447, true, new c(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2018915490, true, new d(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(91775869, true, new e(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2092500068, true, new f(localThemeScope, c4759g7)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(18191291, true, new g(localThemeScope, c4759g7)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4759g7 c4759g7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4759g7.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C4759g7 c4759g7, InterfaceC15506C LazyVerticalGrid) {
        Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1186884367, true, c4759g7.new h()), 7, null);
        InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(917489784, true, c4759g7.new i()), 7, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(C4759g7 c4759g7, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4759g7.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Pi.c7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4759g7.k(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Pi.d7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4759g7.l(this.f27442a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            InterfaceC15516b.a aVar = new InterfaceC15516b.a(2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.e7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4759g7.m(this.f27466a, (InterfaceC15506C) obj);
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
            t0L.a(new Function2() { // from class: Pi.f7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4759g7.n(this.f27481a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Loading";
    }

    @Override // Ni.c
    /* renamed from: o, reason: from getter */
    public l.LoadingState getState() {
        return this.state;
    }
}
