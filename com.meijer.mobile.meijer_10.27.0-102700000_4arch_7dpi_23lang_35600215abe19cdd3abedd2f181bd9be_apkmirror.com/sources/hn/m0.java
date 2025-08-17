package hn;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
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
import androidx.recyclerview.widget.RecyclerView;
import d0.C13457y;
import gn.OrderSubstitutionsListDecorator;
import gn.ReadOnlyProductListDecorator;
import hn.m0;
import j0.C14801J;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import ji.C14898A;
import ji.j1;
import ji.q1;
import kotlin.C17927c1;
import kotlin.C17960n1;
import kotlin.C17963o1;
import kotlin.C17966p1;
import kotlin.InterfaceC17951k1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import rn.U;
import tr.C17135b;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0085\u0001\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010\u001c\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b!\u0010\"\u001aC\u0010%\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b%\u0010&\u001a9\u0010)\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b)\u0010*\u001aG\u0010,\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010$\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0001¢\u0006\u0004\b,\u0010-\u001a3\u0010.\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"LJi/M;", "Lrn/U$f;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lx0/c1;", "scaffoldState", "", "toolbarTitle", "Lkotlin/Function0;", "", "onBackPressed", "onCartPressed", "onReorderAllItemsPressed", "", "isPostOrderComplexPromoEnabled", "", "countItem", "Lkotlin/Function1;", "Lrn/U$d;", "onAction", "T", "(LJi/M;Lrn/U$f;Landroidx/compose/ui/Modifier;Lx0/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lx0/o1;", "hostState", "isError", "N", "(LJi/M;Lx0/o1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "R", "(LJi/M;Lrn/U$f;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isLoading", "t", "(LJi/M;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "y", "(LJi/M;Lrn/U$f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgn/r;", "decorator", "E", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/r;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgn/q;", "substitutionItem", "K", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onAddCartButton", "P", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "v", "(LJi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135981b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.m0$a$a, reason: collision with other inner class name */
        static final class C2153a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135982a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f135983b;

            C2153a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f135982a = localThemeScope;
                this.f135983b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(531144504, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.MainActionContent.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:548)");
                }
                ri.j.h(this.f135982a, this.f135983b.getLabels().getEnabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f100461zd, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f135980a = localThemeScope;
            this.f135981b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(381528075, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.MainActionContent.<anonymous>.<anonymous> (SummaryScreenView.kt:540)");
            }
            E0.b(this.f135980a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null), false, null, 895, null), this.f135981b, ComposableLambdaKt.c(531144504, true, new C2153a(this.f135980a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC17951k1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f135985b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f135986a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135987b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC17951k1 f135988c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: hn.m0$b$a$a, reason: collision with other inner class name */
            static final class C2154a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f135989a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC17951k1 f135990b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: hn.m0$b$a$a$a, reason: collision with other inner class name */
                static final class C2155a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f135991a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC17951k1 f135992b;

                    C2155a(LocalThemeScope localThemeScope, InterfaceC17951k1 interfaceC17951k1) {
                        this.f135991a = localThemeScope;
                        this.f135992b = interfaceC17951k1;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1858599027, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:161)");
                        }
                        LocalThemeScope localThemeScope = this.f135991a;
                        q1.Label label = new q1.Label(null, this.f135991a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                        String actionLabel = this.f135992b.getActionLabel();
                        if (actionLabel == null) {
                            actionLabel = "";
                        }
                        ri.j.h(localThemeScope, label, actionLabel, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        a(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C2154a(LocalThemeScope localThemeScope, InterfaceC17951k1 interfaceC17951k1) {
                    this.f135989a = localThemeScope;
                    this.f135990b = interfaceC17951k1;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1161166746, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:157)");
                    }
                    LocalThemeScope localThemeScope = this.f135989a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f135990b);
                    final InterfaceC17951k1 interfaceC17951k1 = this.f135990b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: hn.n0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return m0.b.a.C2154a.c(interfaceC17951k1);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1858599027, true, new C2155a(this.f135989a, this.f135990b), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC17951k1 interfaceC17951k1) {
                    interfaceC17951k1.b();
                    return Unit.f142422a;
                }
            }

            a(boolean z10, LocalThemeScope localThemeScope, InterfaceC17951k1 interfaceC17951k1) {
                this.f135986a = z10;
                this.f135987b = localThemeScope;
                this.f135988c = interfaceC17951k1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1286905721, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous> (SummaryScreenView.kt:155)");
                }
                if (!this.f135986a) {
                    LocalThemeScope localThemeScope = this.f135987b;
                    Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(1161166746, true, new C2154a(localThemeScope, this.f135988c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14898A.f139597b << 3));
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
        @SourceDebugExtension
        /* renamed from: hn.m0$b$b, reason: collision with other inner class name */
        static final class C2156b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f135993a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC17951k1 f135994b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135995c;

            C2156b(boolean z10, InterfaceC17951k1 interfaceC17951k1, LocalThemeScope localThemeScope) {
                this.f135993a = z10;
                this.f135994b = interfaceC17951k1;
                this.f135995c = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(581085107, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous> (SummaryScreenView.kt:128)");
                }
                if (this.f135993a) {
                    composer.startReplaceGroup(-1906337686);
                    InterfaceC17951k1 interfaceC17951k1 = this.f135994b;
                    LocalThemeScope localThemeScope = this.f135995c;
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
                    C13457y.a(C16190d.c(Bj.i.f2697U, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                    ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(18), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorUIOverlay(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 372, null), interfaceC17951k1.getMessage(), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    composer.v();
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1906701099);
                    String message = this.f135994b.getMessage();
                    ri.j.h(this.f135995c, new q1.Label(null, this.f135995c.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, this.f135995c.getAdsTypography().getBody().getOne(), null, 381, null), message, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                    composer.P();
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

        public final void a(InterfaceC17951k1 data, Composer composer, int i10) {
            Intrinsics.j(data, "data");
            if (ComposerKt.M()) {
                ComposerKt.U(1979347308, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous> (SummaryScreenView.kt:125)");
            }
            C17966p1.c(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(12)), ComposableLambdaKt.c(1286905721, true, new a(this.f135985b, this.f135984a, data), composer, 54), false, null, !this.f135985b ? this.f135984a.getAdsColors().getAdsColorUIBorder02().getColor() : this.f135984a.getAdsColors().getAdsColorSupportErrorBg().getColor(), this.f135984a.getAdsColors().getAdsColorSupportSuccessBg().getColor(), 0.0f, ComposableLambdaKt.c(581085107, true, new C2156b(this.f135985b, data, this.f135984a), composer, 54), composer, 12582966, 76);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b(LocalThemeScope localThemeScope, boolean z10) {
            this.f135984a = localThemeScope;
            this.f135985b = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC17951k1 interfaceC17951k1, Composer composer, Integer num) {
            a(interfaceC17951k1, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135997b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135998a;

            a(LocalThemeScope localThemeScope) {
                this.f135998a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1110393328, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:438)");
                }
                ri.j.h(this.f135998a, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), this.f135998a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f135998a.getAdsTypography().getBody().getOne(), null, 380, null), C16193g.c(C17135b.f162015d, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f135996a = localThemeScope;
            this.f135997b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1152691139, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:432)");
            }
            E0.b(this.f135996a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null), this.f135997b, ComposableLambdaKt.c(1110393328, true, new a(this.f135996a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<U.d, Unit> f136000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsListDecorator f136001c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136002a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderSubstitutionsListDecorator f136003b;

            a(LocalThemeScope localThemeScope, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
                this.f136002a = localThemeScope;
                this.f136003b = orderSubstitutionsListDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-839038954, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:496)");
                }
                ri.j.h(this.f136002a, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(0)), this.f136002a.getAdsColors().getAdsColorBrandPrimary(), F1.k.INSTANCE.d(), null, 0, false, 0, this.f136002a.getAdsTypography().getBody().getOne(), null, 376, null), this.f136003b.getTitle(), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super U.d, Unit> function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
            this.f135999a = localThemeScope;
            this.f136000b = function1;
            this.f136001c = orderSubstitutionsListDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
            function1.invoke(new U.d.NavigateToProductDetail(orderSubstitutionsListDecorator.getProduct()));
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1980210979, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:490)");
            }
            LocalThemeScope localThemeScope = this.f135999a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f136000b) | composer.D(this.f136001c);
            final Function1<U.d, Unit> function1 = this.f136000b;
            final OrderSubstitutionsListDecorator orderSubstitutionsListDecorator = this.f136001c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: hn.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.d.c(function1, orderSubstitutionsListDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-839038954, true, new a(this.f135999a, this.f136001c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136004a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f136005b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136006c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136007d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f136008e;

        e(LocalThemeScope localThemeScope, String str, Function0<Unit> function0, Function0<Unit> function02, int i10) {
            this.f136004a = localThemeScope;
            this.f136005b = str;
            this.f136006c = function0;
            this.f136007d = function02;
            this.f136008e = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-788176505, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:86)");
            }
            C14534g.b(this.f136004a, null, this.f136005b, false, this.f136006c, this.f136007d, this.f136008e, composer, LocalThemeScope.f15770g, 5);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136009a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f136010b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136011c;

        f(LocalThemeScope localThemeScope, U.ViewState fVar, Function0<Unit> function0) {
            this.f136009a = localThemeScope;
            this.f136010b = fVar;
            this.f136011c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(383032166, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:94)");
            }
            m0.v(this.f136009a, this.f136010b.getProgressIsVisible(), null, this.f136011c, composer, LocalThemeScope.f15770g, 2);
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
    static final class g implements Function3<C17963o1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f136013b;

        g(LocalThemeScope localThemeScope, U.ViewState fVar) {
            this.f136012a = localThemeScope;
            this.f136013b = fVar;
        }

        public final void a(C17963o1 hostState, Composer composer, int i10) {
            Intrinsics.j(hostState, "hostState");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(hostState) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1849074707, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:108)");
            }
            m0.N(this.f136012a, hostState, this.f136013b.getIsErrorSnackBar(), null, composer, LocalThemeScope.f15770g | ((i10 << 3) & 112), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C17963o1 c17963o1, Composer composer, Integer num) {
            a(c17963o1, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f136015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f136016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<U.d, Unit> f136017d;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, U.ViewState fVar, boolean z10, Function1<? super U.d, Unit> function1) {
            this.f136014a = localThemeScope;
            this.f136015b = fVar;
            this.f136016c = z10;
            this.f136017d = function1;
        }

        public final void a(InterfaceC14794C padding, Composer composer, int i10) {
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(padding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1822541714, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:100)");
            }
            m0.R(this.f136014a, this.f136015b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, padding), this.f136016c, this.f136017d, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T(Ji.LocalThemeScope r34, final rn.U.ViewState r35, androidx.compose.ui.Modifier r36, final kotlin.C17927c1 r37, final java.lang.String r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, boolean r42, final int r43, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.T(Ji.M, rn.U$f, androidx.compose.ui.Modifier, x0.c1, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1) {
        function1.invoke(U.d.j.f159377a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(U.d.h.f159375a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(U.d.g.f159374a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, U.ViewState fVar, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, fVar, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void E(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final gn.ReadOnlyProductListDecorator r24, boolean r25, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.E(Ji.M, androidx.compose.ui.Modifier, gn.r, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.NavigateToProductDetail(readOnlyProductListDecorator.getProduct()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.AddToCartAction(readOnlyProductListDecorator.getProduct()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.GoToSavingsLink(readOnlyProductListDecorator));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1) {
        function1.invoke(new U.d.ViewAppliedOffer(true));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, ReadOnlyProductListDecorator readOnlyProductListDecorator, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, readOnlyProductListDecorator, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void K(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final gn.OrderSubstitutionsListDecorator r19, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.K(Ji.M, androidx.compose.ui.Modifier, gn.q, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(Function1 function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
        function1.invoke(new U.d.AddToCartAction(orderSubstitutionsListDecorator.getProductSubstituted()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, modifier, orderSubstitutionsListDecorator, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(final LocalThemeScope localThemeScope, final C17963o1 c17963o1, final boolean z10, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-878425511);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(c17963o1) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-878425511, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar (SummaryScreenView.kt:121)");
            }
            C17960n1.b(c17963o1, androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(modifier3, 0.0f, 1, null), P0.e.INSTANCE.a(), false, 2, null), ComposableLambdaKt.c(1979347308, true, new b(localThemeScope, z10), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m0.O(localThemeScope, c17963o1, z10, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, C17963o1 c17963o1, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, c17963o1, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ji.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final gn.OrderSubstitutionsListDecorator r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.P(Ji.M, androidx.compose.ui.Modifier, gn.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, Modifier modifier, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, orderSubstitutionsListDecorator, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(final Ji.LocalThemeScope r14, final rn.U.ViewState r15, androidx.compose.ui.Modifier r16, boolean r17, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.R(Ji.M, rn.U$f, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, U.ViewState fVar, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, fVar, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, U.ViewState fVar, Modifier modifier, C17927c1 c17927c1, String str, Function0 function0, Function0 function02, Function0 function03, boolean z10, int i10, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        T(localThemeScope, fVar, modifier, c17927c1, str, function0, function02, function03, z10, i10, function1, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ji.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.t(Ji.M, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ji.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.v(Ji.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(final Ji.LocalThemeScope r30, final rn.U.ViewState r31, boolean r32, final kotlin.jvm.functions.Function1<? super rn.U.d, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m0.y(Ji.M, rn.U$f, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(U.d.i.f159376a);
        return Unit.f142422a;
    }
}
