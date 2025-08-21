package in;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
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
import androidx.recyclerview.widget.RecyclerView;
import d0.C13590y;
import hn.OrderSubstitutionsListDecorator;
import hn.ReadOnlyProductListDecorator;
import in.m0;
import j0.C14889J;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import ki.C15132A;
import ki.j1;
import ki.q1;
import kotlin.C17993c1;
import kotlin.C18026n1;
import kotlin.C18029o1;
import kotlin.C18032p1;
import kotlin.InterfaceC18017k1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import sn.U;
import tr.C17284b;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0085\u0001\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010\u001c\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b!\u0010\"\u001aC\u0010%\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b%\u0010&\u001a9\u0010)\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b)\u0010*\u001aG\u0010,\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010$\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0001¢\u0006\u0004\b,\u0010-\u001a3\u0010.\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"LKi/M;", "Lsn/U$f;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lx0/c1;", "scaffoldState", "", "toolbarTitle", "Lkotlin/Function0;", "", "onBackPressed", "onCartPressed", "onReorderAllItemsPressed", "", "isPostOrderComplexPromoEnabled", "", "countItem", "Lkotlin/Function1;", "Lsn/U$d;", "onAction", "T", "(LKi/M;Lsn/U$f;Landroidx/compose/ui/Modifier;Lx0/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lx0/o1;", "hostState", "isError", "N", "(LKi/M;Lx0/o1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "R", "(LKi/M;Lsn/U$f;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isLoading", "t", "(LKi/M;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "y", "(LKi/M;Lsn/U$f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhn/r;", "decorator", "E", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/r;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhn/q;", "substitutionItem", "K", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onAddCartButton", "P", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "v", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138621b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.m0$a$a, reason: collision with other inner class name */
        static final class C2196a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f138623b;

            C2196a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f138622a = localThemeScope;
                this.f138623b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(531144504, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.MainActionContent.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:548)");
                }
                si.j.h(this.f138622a, this.f138623b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f100365Cd, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138620a = localThemeScope;
            this.f138621b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(381528075, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.MainActionContent.<anonymous>.<anonymous> (SummaryScreenView.kt:540)");
            }
            E0.b(this.f138620a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null), false, null, 895, null), this.f138621b, ComposableLambdaKt.c(531144504, true, new C2196a(this.f138620a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC18017k1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f138625b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f138626a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138627b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC18017k1 f138628c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: in.m0$b$a$a, reason: collision with other inner class name */
            static final class C2197a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138629a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC18017k1 f138630b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: in.m0$b$a$a$a, reason: collision with other inner class name */
                static final class C2198a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f138631a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC18017k1 f138632b;

                    C2198a(LocalThemeScope localThemeScope, InterfaceC18017k1 interfaceC18017k1) {
                        this.f138631a = localThemeScope;
                        this.f138632b = interfaceC18017k1;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1858599027, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:161)");
                        }
                        LocalThemeScope localThemeScope = this.f138631a;
                        q1.Label label = new q1.Label(null, this.f138631a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                        String actionLabel = this.f138632b.getActionLabel();
                        if (actionLabel == null) {
                            actionLabel = "";
                        }
                        si.j.h(localThemeScope, label, actionLabel, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        a(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                C2197a(LocalThemeScope localThemeScope, InterfaceC18017k1 interfaceC18017k1) {
                    this.f138629a = localThemeScope;
                    this.f138630b = interfaceC18017k1;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1161166746, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:157)");
                    }
                    LocalThemeScope localThemeScope = this.f138629a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f138630b);
                    final InterfaceC18017k1 interfaceC18017k1 = this.f138630b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: in.n0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return m0.b.a.C2197a.c(interfaceC18017k1);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1858599027, true, new C2198a(this.f138629a, this.f138630b), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC18017k1 interfaceC18017k1) {
                    interfaceC18017k1.b();
                    return Unit.f143329a;
                }
            }

            a(boolean z10, LocalThemeScope localThemeScope, InterfaceC18017k1 interfaceC18017k1) {
                this.f138626a = z10;
                this.f138627b = localThemeScope;
                this.f138628c = interfaceC18017k1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1286905721, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous> (SummaryScreenView.kt:155)");
                }
                if (!this.f138626a) {
                    LocalThemeScope localThemeScope = this.f138627b;
                    Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(1161166746, true, new C2197a(localThemeScope, this.f138628c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15132A.f141852b << 3));
                }
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
        /* renamed from: in.m0$b$b, reason: collision with other inner class name */
        static final class C2199b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f138633a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC18017k1 f138634b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138635c;

            C2199b(boolean z10, InterfaceC18017k1 interfaceC18017k1, LocalThemeScope localThemeScope) {
                this.f138633a = z10;
                this.f138634b = interfaceC18017k1;
                this.f138635c = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(581085107, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous>.<anonymous> (SummaryScreenView.kt:128)");
                }
                if (this.f138633a) {
                    composer.startReplaceGroup(-1906337686);
                    InterfaceC18017k1 interfaceC18017k1 = this.f138634b;
                    LocalThemeScope localThemeScope = this.f138635c;
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
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyB, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14889J c14889j = C14889J.f139620a;
                    C13590y.a(C16335d.c(Cj.i.f4742U, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                    si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(18), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorUIOverlay(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 372, null), interfaceC18017k1.getMessage(), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    composer.v();
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1906701099);
                    String message = this.f138634b.getMessage();
                    si.j.h(this.f138635c, new q1.Label(null, this.f138635c.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, this.f138635c.getAdsTypography().getBody().getOne(), null, 381, null), message, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                    composer.P();
                }
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

        public final void a(InterfaceC18017k1 data, Composer composer, int i10) {
            Intrinsics.j(data, "data");
            if (ComposerKt.M()) {
                ComposerKt.U(1979347308, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ShowSnackBar.<anonymous> (SummaryScreenView.kt:125)");
            }
            C18032p1.c(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(12)), ComposableLambdaKt.c(1286905721, true, new a(this.f138625b, this.f138624a, data), composer, 54), false, null, !this.f138625b ? this.f138624a.getAdsColors().getAdsColorUIBorder02().getColor() : this.f138624a.getAdsColors().getAdsColorSupportErrorBg().getColor(), this.f138624a.getAdsColors().getAdsColorSupportSuccessBg().getColor(), 0.0f, ComposableLambdaKt.c(581085107, true, new C2199b(this.f138625b, data, this.f138624a), composer, 54), composer, 12582966, 76);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b(LocalThemeScope localThemeScope, boolean z10) {
            this.f138624a = localThemeScope;
            this.f138625b = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18017k1 interfaceC18017k1, Composer composer, Integer num) {
            a(interfaceC18017k1, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138637b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138638a;

            a(LocalThemeScope localThemeScope) {
                this.f138638a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1110393328, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:438)");
                }
                si.j.h(this.f138638a, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), this.f138638a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138638a.getAdsTypography().getBody().getOne(), null, 380, null), C16338g.c(C17284b.f163315d, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138636a = localThemeScope;
            this.f138637b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1152691139, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:432)");
            }
            E0.b(this.f138636a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null), this.f138637b, ComposableLambdaKt.c(1110393328, true, new a(this.f138636a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<U.d, Unit> f138640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsListDecorator f138641c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderSubstitutionsListDecorator f138643b;

            a(LocalThemeScope localThemeScope, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
                this.f138642a = localThemeScope;
                this.f138643b = orderSubstitutionsListDecorator;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-839038954, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:496)");
                }
                si.j.h(this.f138642a, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(0)), this.f138642a.getAdsColors().getAdsColorBrandPrimary(), F1.k.INSTANCE.d(), null, 0, false, 0, this.f138642a.getAdsTypography().getBody().getOne(), null, 376, null), this.f138643b.getTitle(), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super U.d, Unit> function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
            this.f138639a = localThemeScope;
            this.f138640b = function1;
            this.f138641c = orderSubstitutionsListDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
            function1.invoke(new U.d.NavigateToProductDetail(orderSubstitutionsListDecorator.getProduct()));
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1980210979, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SubstitutionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SummaryScreenView.kt:490)");
            }
            LocalThemeScope localThemeScope = this.f138639a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f138640b) | composer.D(this.f138641c);
            final Function1<U.d, Unit> function1 = this.f138640b;
            final OrderSubstitutionsListDecorator orderSubstitutionsListDecorator = this.f138641c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: in.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.d.c(function1, orderSubstitutionsListDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-839038954, true, new a(this.f138639a, this.f138641c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f138645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138647d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f138648e;

        e(LocalThemeScope localThemeScope, String str, Function0<Unit> function0, Function0<Unit> function02, int i10) {
            this.f138644a = localThemeScope;
            this.f138645b = str;
            this.f138646c = function0;
            this.f138647d = function02;
            this.f138648e = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-788176505, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:86)");
            }
            C14814g.b(this.f138644a, null, this.f138645b, false, this.f138646c, this.f138647d, this.f138648e, composer, LocalThemeScope.f17314g, 5);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f138650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138651c;

        f(LocalThemeScope localThemeScope, U.ViewState fVar, Function0<Unit> function0) {
            this.f138649a = localThemeScope;
            this.f138650b = fVar;
            this.f138651c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(383032166, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.SummaryScreenView.<anonymous> (SummaryScreenView.kt:94)");
            }
            m0.v(this.f138649a, this.f138650b.getProgressIsVisible(), null, this.f138651c, composer, LocalThemeScope.f17314g, 2);
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
    static final class g implements Function3<C18029o1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f138653b;

        g(LocalThemeScope localThemeScope, U.ViewState fVar) {
            this.f138652a = localThemeScope;
            this.f138653b = fVar;
        }

        public final void a(C18029o1 hostState, Composer composer, int i10) {
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
            m0.N(this.f138652a, hostState, this.f138653b.getIsErrorSnackBar(), null, composer, LocalThemeScope.f17314g | ((i10 << 3) & 112), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C18029o1 c18029o1, Composer composer, Integer num) {
            a(c18029o1, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.ViewState f138655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<U.d, Unit> f138657d;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, U.ViewState fVar, boolean z10, Function1<? super U.d, Unit> function1) {
            this.f138654a = localThemeScope;
            this.f138655b = fVar;
            this.f138656c = z10;
            this.f138657d = function1;
        }

        public final void a(InterfaceC14882C padding, Composer composer, int i10) {
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
            m0.R(this.f138654a, this.f138655b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, padding), this.f138656c, this.f138657d, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void T(Ki.LocalThemeScope r34, final sn.U.ViewState r35, androidx.compose.ui.Modifier r36, final kotlin.C17993c1 r37, final java.lang.String r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, boolean r42, final int r43, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.T(Ki.M, sn.U$f, androidx.compose.ui.Modifier, x0.c1, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1) {
        function1.invoke(U.d.j.f161153a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(U.d.h.f161151a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(U.d.g.f161150a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, U.ViewState fVar, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, fVar, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void E(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final hn.ReadOnlyProductListDecorator r24, boolean r25, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.E(Ki.M, androidx.compose.ui.Modifier, hn.r, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.NavigateToProductDetail(readOnlyProductListDecorator.getProduct()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.AddToCartAction(readOnlyProductListDecorator.getProduct()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(Function1 function1, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
        function1.invoke(new U.d.GoToSavingsLink(readOnlyProductListDecorator));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1) {
        function1.invoke(new U.d.ViewAppliedOffer(true));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, ReadOnlyProductListDecorator readOnlyProductListDecorator, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, readOnlyProductListDecorator, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void K(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final hn.OrderSubstitutionsListDecorator r19, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.K(Ki.M, androidx.compose.ui.Modifier, hn.q, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(Function1 function1, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator) {
        function1.invoke(new U.d.AddToCartAction(orderSubstitutionsListDecorator.getProductSubstituted()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, modifier, orderSubstitutionsListDecorator, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(final LocalThemeScope localThemeScope, final C18029o1 c18029o1, final boolean z10, Modifier modifier, Composer composer, final int i10, final int i11) {
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
            i12 |= composerStartRestartGroup.V(c18029o1) ? 32 : 16;
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
            C18026n1.b(c18029o1, androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(modifier3, 0.0f, 1, null), P0.e.INSTANCE.a(), false, 2, null), ComposableLambdaKt.c(1979347308, true, new b(localThemeScope, z10), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m0.O(localThemeScope, c18029o1, z10, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, C18029o1 c18029o1, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, c18029o1, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void P(final Ki.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final hn.OrderSubstitutionsListDecorator r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.P(Ki.M, androidx.compose.ui.Modifier, hn.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, Modifier modifier, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, orderSubstitutionsListDecorator, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void R(final Ki.LocalThemeScope r14, final sn.U.ViewState r15, androidx.compose.ui.Modifier r16, boolean r17, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.R(Ki.M, sn.U$f, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, U.ViewState fVar, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, fVar, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, U.ViewState fVar, Modifier modifier, C17993c1 c17993c1, String str, Function0 function0, Function0 function02, Function0 function03, boolean z10, int i10, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        T(localThemeScope, fVar, modifier, c17993c1, str, function0, function02, function03, z10, i10, function1, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f143329a;
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
    private static final void t(final Ki.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.t(Ki.M, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void v(final Ki.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.v(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void y(final Ki.LocalThemeScope r30, final sn.U.ViewState r31, boolean r32, final kotlin.jvm.functions.Function1<? super sn.U.d, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.m0.y(Ki.M, sn.U$f, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(U.d.i.f161152a);
        return Unit.f143329a;
    }
}
