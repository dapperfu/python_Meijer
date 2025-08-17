package Pi;

import Ji.LocalThemeScope;
import P0.e;
import Pi.C4983xb;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14815g;
import java.util.List;
import ji.C14936g0;
import ji.InterfaceC14934f0;
import ji.q1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oc.C16020i;
import oc.PagerState;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0002¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"", "o", "(Landroidx/compose/runtime/Composer;I)V", "k", "i", "e", "", "selectedTabIndex", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.xb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4983xb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.xb$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f28116a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f28117b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.xb$a$a, reason: collision with other inner class name */
        static final class C0644a implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f28119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f28120c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.xb$a$a$a, reason: collision with other inner class name */
            static final class C0645a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f28121a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28122b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC14934f0 f28123c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f28124d;

                C0645a(List<String> list, LocalThemeScope localThemeScope, InterfaceC14934f0 interfaceC14934f0, InterfaceC5726j0 interfaceC5726j0) {
                    this.f28121a = list;
                    this.f28122b = localThemeScope;
                    this.f28123c = interfaceC14934f0;
                    this.f28124d = interfaceC5726j0;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1060147631, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndNonSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:280)");
                    }
                    List<String> list = this.f28121a;
                    LocalThemeScope localThemeScope = this.f28122b;
                    InterfaceC14934f0 interfaceC14934f0 = this.f28123c;
                    final InterfaceC5726j0 interfaceC5726j0 = this.f28124d;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC14934f0.getTabTemplate();
                        boolean z10 = C4983xb.f(interfaceC5726j0) == i13;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Pi.wb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C4983xb.a.C0644a.C0645a.c(i13, interfaceC5726j0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        ui.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, InterfaceC5726j0 interfaceC5726j0) {
                    C4983xb.g(interfaceC5726j0, i10);
                    return Unit.f142422a;
                }
            }

            C0644a(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0, List<String> list) {
                this.f28118a = localThemeScope;
                this.f28119b = interfaceC5726j0;
                this.f28120c = list;
            }

            public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
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
                    ComposerKt.U(-708014099, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndNonSwipeable.<anonymous>.<anonymous> (TabShowcase.kt:274)");
                }
                LocalThemeScope localThemeScope = this.f28118a;
                InterfaceC5726j0 interfaceC5726j0 = this.f28119b;
                List<String> list = this.f28120c;
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
                ui.g.k(localThemeScope, Assemble.getTabRowTemplate(), C4983xb.f(interfaceC5726j0), null, null, ComposableLambdaKt.c(-1060147631, true, new C0645a(list, localThemeScope, Assemble, interfaceC5726j0), composer, 54), composer, 199680, 8);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.b(), companion2.g(), composer, 54);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                int iF = C4983xb.f(interfaceC5726j0);
                if (iF == 0) {
                    composer.startReplaceGroup(-768500886);
                    kotlin.N1.b("Here is the content on Tab 1", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF == 1) {
                    composer.startReplaceGroup(-768495541);
                    kotlin.N1.b("Here is more content on Tab 2", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF == 2) {
                    composer.startReplaceGroup(-768490170);
                    kotlin.N1.b("Awesome content on Tab 3", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF != 3) {
                    composer.startReplaceGroup(1946910913);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-768484963);
                    kotlin.N1.b("You're on Tab 4", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                }
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
                a(interfaceC14934f0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(InterfaceC5726j0 interfaceC5726j0, List<String> list) {
            this.f28116a = interfaceC5726j0;
            this.f28117b = list;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(259107652, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndNonSwipeable.<anonymous> (TabShowcase.kt:273)");
            }
            Ji.Q.e(AdsTheme, C14936g0.f139813a, ComposableLambdaKt.c(-708014099, true, new C0644a(AdsTheme, this.f28116a, this.f28117b), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.xb$b */
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f28125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f28126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f28127c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.xb$b$a */
        static final class a implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28128a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f28129b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f28130c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f28131d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.xb$b$a$a, reason: collision with other inner class name */
            static final class C0646a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f28132a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28133b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC14934f0 f28134c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PagerState f28135d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f28136e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.TabShowcaseKt$AcresTabsNonScrollableAndSwipeable$1$1$1$1$1$1$1$1", f = "TabShowcase.kt", l = {225}, m = "invokeSuspend")
                /* renamed from: Pi.xb$b$a$a$a, reason: collision with other inner class name */
                static final class C0647a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f28137a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f28138b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f28139c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0647a(PagerState pagerState, int i10, Continuation<? super C0647a> continuation) {
                        super(2, continuation);
                        this.f28138b = pagerState;
                        this.f28139c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0647a(this.f28138b, this.f28139c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C0647a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f28137a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            PagerState pagerState = this.f28138b;
                            int i11 = this.f28139c;
                            this.f28137a = 1;
                            if (PagerState.w(pagerState, i11, 0.0f, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                C0646a(List<String> list, LocalThemeScope localThemeScope, InterfaceC14934f0 interfaceC14934f0, PagerState pagerState, InterfaceC16622O interfaceC16622O) {
                    this.f28132a = list;
                    this.f28133b = localThemeScope;
                    this.f28134c = interfaceC14934f0;
                    this.f28135d = pagerState;
                    this.f28136e = interfaceC16622O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC16622O interfaceC16622O, PagerState pagerState, int i10) {
                    C16648k.d(interfaceC16622O, null, null, new C0647a(pagerState, i10, null), 3, null);
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1715052694, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:220)");
                    }
                    List<String> list = this.f28132a;
                    LocalThemeScope localThemeScope = this.f28133b;
                    InterfaceC14934f0 interfaceC14934f0 = this.f28134c;
                    final PagerState pagerState = this.f28135d;
                    final InterfaceC16622O interfaceC16622O = this.f28136e;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC14934f0.getTabTemplate();
                        boolean z10 = pagerState.k() == i13;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(interfaceC16622O) | composer.V(pagerState) | composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Pi.yb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C4983xb.b.a.C0646a.c(interfaceC16622O, pagerState, i13);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        ui.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
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
                    ComposerKt.U(678036302, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndSwipeable.<anonymous>.<anonymous> (TabShowcase.kt:214)");
                }
                LocalThemeScope localThemeScope = this.f28128a;
                PagerState pagerState = this.f28129b;
                List<String> list = this.f28130c;
                InterfaceC16622O interfaceC16622O = this.f28131d;
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
                ui.g.k(localThemeScope, Assemble.getTabRowTemplate(), pagerState.k(), pagerState, null, ComposableLambdaKt.c(-1715052694, true, new C0646a(list, localThemeScope, Assemble, pagerState, interfaceC16622O), composer, 54), composer, 196608, 8);
                ui.g.e(localThemeScope, androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), Assemble.getHorizontalPagerTemplate(), list.size(), pagerState, D5.f25732a.f(), composer, 196608);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O) {
                this.f28128a = localThemeScope;
                this.f28129b = pagerState;
                this.f28130c = list;
                this.f28131d = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
                a(interfaceC14934f0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O) {
            this.f28125a = pagerState;
            this.f28126b = list;
            this.f28127c = interfaceC16622O;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1711767383, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndSwipeable.<anonymous> (TabShowcase.kt:213)");
            }
            Ji.Q.e(AdsTheme, C14936g0.f139813a, ComposableLambdaKt.c(678036302, true, new a(AdsTheme, this.f28125a, this.f28126b, this.f28127c), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.xb$c */
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f28140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f28141b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.xb$c$a */
        static final class a implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28142a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f28143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f28144c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.xb$c$a$a, reason: collision with other inner class name */
            static final class C0648a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f28145a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28146b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC14934f0 f28147c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f28148d;

                C0648a(List<String> list, LocalThemeScope localThemeScope, InterfaceC14934f0 interfaceC14934f0, InterfaceC5726j0 interfaceC5726j0) {
                    this.f28145a = list;
                    this.f28146b = localThemeScope;
                    this.f28147c = interfaceC14934f0;
                    this.f28148d = interfaceC5726j0;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-163967733, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndNonSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:163)");
                    }
                    List<String> list = this.f28145a;
                    LocalThemeScope localThemeScope = this.f28146b;
                    InterfaceC14934f0 interfaceC14934f0 = this.f28147c;
                    final InterfaceC5726j0 interfaceC5726j0 = this.f28148d;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC14934f0.getTabTemplate();
                        boolean z10 = C4983xb.l(interfaceC5726j0) == i13;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Pi.zb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C4983xb.c.a.C0648a.c(i13, interfaceC5726j0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        ui.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, InterfaceC5726j0 interfaceC5726j0) {
                    C4983xb.m(interfaceC5726j0, i10);
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0, List<String> list) {
                this.f28142a = localThemeScope;
                this.f28143b = interfaceC5726j0;
                this.f28144c = list;
            }

            public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
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
                    ComposerKt.U(-2054888472, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndNonSwipeable.<anonymous>.<anonymous> (TabShowcase.kt:157)");
                }
                LocalThemeScope localThemeScope = this.f28142a;
                InterfaceC5726j0 interfaceC5726j0 = this.f28143b;
                List<String> list = this.f28144c;
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
                ui.g.g(localThemeScope, Assemble.getScrollableTabRowTemplate(), C4983xb.l(interfaceC5726j0), null, null, ComposableLambdaKt.c(-163967733, true, new C0648a(list, localThemeScope, Assemble, interfaceC5726j0), composer, 54), composer, 199680, 8);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.b(), companion2.g(), composer, 54);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                int iL = C4983xb.l(interfaceC5726j0);
                if (iL == 0) {
                    composer.startReplaceGroup(1654993917);
                    kotlin.N1.b("Here is the content on Tab 1", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iL == 1) {
                    composer.startReplaceGroup(1654999262);
                    kotlin.N1.b("Here is more content on Tab 2", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iL != 2) {
                    composer.startReplaceGroup(-234314290);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1655004633);
                    kotlin.N1.b("Awesome content on Tab 3", null, C5346q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                }
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
                a(interfaceC14934f0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(InterfaceC5726j0 interfaceC5726j0, List<String> list) {
            this.f28140a = interfaceC5726j0;
            this.f28141b = list;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1021157391, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndNonSwipeable.<anonymous> (TabShowcase.kt:156)");
            }
            Ji.Q.e(AdsTheme, C14936g0.f139813a, ComposableLambdaKt.c(-2054888472, true, new a(AdsTheme, this.f28140a, this.f28141b), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.xb$d */
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f28149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f28150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f28151c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.xb$d$a */
        static final class a implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28152a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f28153b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f28154c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f28155d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.xb$d$a$a, reason: collision with other inner class name */
            static final class C0649a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f28156a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28157b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC14934f0 f28158c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PagerState f28159d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f28160e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.TabShowcaseKt$AcresTabsScrollableAndSwipeable$1$1$1$1$1$1$1$1", f = "TabShowcase.kt", l = {111}, m = "invokeSuspend")
                /* renamed from: Pi.xb$d$a$a$a, reason: collision with other inner class name */
                static final class C0650a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f28161a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f28162b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f28163c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0650a(PagerState pagerState, int i10, Continuation<? super C0650a> continuation) {
                        super(2, continuation);
                        this.f28162b = pagerState;
                        this.f28163c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0650a(this.f28162b, this.f28163c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C0650a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f28161a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            PagerState pagerState = this.f28162b;
                            int i11 = this.f28163c;
                            this.f28161a = 1;
                            if (PagerState.w(pagerState, i11, 0.0f, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                C0649a(List<String> list, LocalThemeScope localThemeScope, InterfaceC14934f0 interfaceC14934f0, PagerState pagerState, InterfaceC16622O interfaceC16622O) {
                    this.f28156a = list;
                    this.f28157b = localThemeScope;
                    this.f28158c = interfaceC14934f0;
                    this.f28159d = pagerState;
                    this.f28160e = interfaceC16622O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC16622O interfaceC16622O, PagerState pagerState, int i10) {
                    C16648k.d(interfaceC16622O, null, null, new C0650a(pagerState, i10, null), 3, null);
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-243479824, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:106)");
                    }
                    List<String> list = this.f28156a;
                    LocalThemeScope localThemeScope = this.f28157b;
                    InterfaceC14934f0 interfaceC14934f0 = this.f28158c;
                    final PagerState pagerState = this.f28159d;
                    final InterfaceC16622O interfaceC16622O = this.f28160e;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC14934f0.getTabTemplate();
                        boolean z10 = pagerState.k() == i13;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(interfaceC16622O) | composer.V(pagerState) | composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Pi.Ab
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C4983xb.d.a.C0649a.c(interfaceC16622O, pagerState, i13);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        ui.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
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
                    ComposerKt.U(-1099192013, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndSwipeable.<anonymous>.<anonymous> (TabShowcase.kt:100)");
                }
                LocalThemeScope localThemeScope = this.f28152a;
                PagerState pagerState = this.f28153b;
                List<String> list = this.f28154c;
                InterfaceC16622O interfaceC16622O = this.f28155d;
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
                ui.g.g(localThemeScope, Assemble.getScrollableTabRowTemplate(), pagerState.k(), pagerState, null, ComposableLambdaKt.c(-243479824, true, new C0649a(list, localThemeScope, Assemble, pagerState, interfaceC16622O), composer, 54), composer, 196608, 8);
                ui.g.e(localThemeScope, androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), Assemble.getHorizontalPagerTemplate(), list.size(), pagerState, D5.f25732a.a(), composer, 196608);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O) {
                this.f28152a = localThemeScope;
                this.f28153b = pagerState;
                this.f28154c = list;
                this.f28155d = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
                a(interfaceC14934f0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O) {
            this.f28149a = pagerState;
            this.f28150b = list;
            this.f28151c = interfaceC16622O;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1938936266, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndSwipeable.<anonymous> (TabShowcase.kt:99)");
            }
            Ji.Q.e(AdsTheme, C14936g0.f139813a, ComposableLambdaKt.c(-1099192013, true, new a(AdsTheme, this.f28149a, this.f28150b, this.f28151c), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(int i10, Composer composer, int i11) {
        e(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(int i10, Composer composer, int i11) {
        i(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(int i10, Composer composer, int i11) {
        k(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(int i10, Composer composer, int i11) {
        o(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void e(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062274765);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1062274765, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndNonSwipeable (TabShowcase.kt:269)");
            }
            List listP = CollectionsKt.p("Tab 1", "Tab 2", "Tab 3", "Tab 4");
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ji.K.b(null, ComposableLambdaKt.c(259107652, true, new a((InterfaceC5726j0) objB, listP), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.vb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4983xb.h(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    public static final void i(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1295806520);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1295806520, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndSwipeable (TabShowcase.kt:208)");
            }
            List listP = CollectionsKt.p("Tab 1", "Tab 2", "Tab 3", "Tab 4");
            PagerState pagerStateA = C16020i.a(0, composerStartRestartGroup, 0, 1);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            Ji.K.b(null, ComposableLambdaKt.c(1711767383, true, new b(pagerStateA, listP, (InterfaceC16622O) objB), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.sb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4983xb.j(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void k(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(266236002);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(266236002, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndNonSwipeable (TabShowcase.kt:151)");
            }
            List listP = CollectionsKt.p("Tab 1 Long Title", "Tab 2 Long Title", "Tab 3 Longer Title");
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ji.K.b(null, ComposableLambdaKt.c(-1021157391, true, new c((InterfaceC5726j0) objB, listP), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.tb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4983xb.n(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    public static final void o(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2023751417);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2023751417, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndSwipeable (TabShowcase.kt:93)");
            }
            List listP = CollectionsKt.p("Tab 1 Long Title", "Tab 2 Long Title", "Tab 3 Longer Title");
            PagerState pagerStateA = C16020i.a(0, composerStartRestartGroup, 0, 1);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            Ji.K.b(null, ComposableLambdaKt.c(1938936266, true, new d(pagerStateA, listP, (InterfaceC16622O) objB), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.ub
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4983xb.p(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
