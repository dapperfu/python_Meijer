package Qi;

import Ki.LocalThemeScope;
import P0.e;
import Qi.C5067xb;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14903g;
import java.util.List;
import ki.C15170g0;
import ki.InterfaceC15168f0;
import ki.q1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import qc.C16628i;
import qc.PagerState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0002¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"", "o", "(Landroidx/compose/runtime/Composer;I)V", "k", "i", "e", "", "selectedTabIndex", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.xb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5067xb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.xb$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f30828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f30829b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.xb$a$a, reason: collision with other inner class name */
        static final class C0708a implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30830a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f30831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f30832c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.xb$a$a$a, reason: collision with other inner class name */
            static final class C0709a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f30833a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30834b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15168f0 f30835c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f30836d;

                C0709a(List<String> list, LocalThemeScope localThemeScope, InterfaceC15168f0 interfaceC15168f0, InterfaceC5868j0 interfaceC5868j0) {
                    this.f30833a = list;
                    this.f30834b = localThemeScope;
                    this.f30835c = interfaceC15168f0;
                    this.f30836d = interfaceC5868j0;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1060147631, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndNonSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:280)");
                    }
                    List<String> list = this.f30833a;
                    LocalThemeScope localThemeScope = this.f30834b;
                    InterfaceC15168f0 interfaceC15168f0 = this.f30835c;
                    final InterfaceC5868j0 interfaceC5868j0 = this.f30836d;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC15168f0.getTabTemplate();
                        boolean z10 = C5067xb.f(interfaceC5868j0) == i13;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Qi.wb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C5067xb.a.C0708a.C0709a.c(i13, interfaceC5868j0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        vi.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, InterfaceC5868j0 interfaceC5868j0) {
                    C5067xb.g(interfaceC5868j0, i10);
                    return Unit.f143329a;
                }
            }

            C0708a(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, List<String> list) {
                this.f30830a = localThemeScope;
                this.f30831b = interfaceC5868j0;
                this.f30832c = list;
            }

            public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f30830a;
                InterfaceC5868j0 interfaceC5868j0 = this.f30831b;
                List<String> list = this.f30832c;
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
                vi.g.k(localThemeScope, Assemble.getTabRowTemplate(), C5067xb.f(interfaceC5868j0), null, null, ComposableLambdaKt.c(-1060147631, true, new C0709a(list, localThemeScope, Assemble, interfaceC5868j0), composer, 54), composer, 199680, 8);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.b(), companion2.g(), composer, 54);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                int iF = C5067xb.f(interfaceC5868j0);
                if (iF == 0) {
                    composer.startReplaceGroup(-768500886);
                    kotlin.N1.b("Here is the content on Tab 1", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF == 1) {
                    composer.startReplaceGroup(-768495541);
                    kotlin.N1.b("Here is more content on Tab 2", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF == 2) {
                    composer.startReplaceGroup(-768490170);
                    kotlin.N1.b("Awesome content on Tab 3", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iF != 3) {
                    composer.startReplaceGroup(1946910913);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-768484963);
                    kotlin.N1.b("You're on Tab 4", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                }
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
                a(interfaceC15168f0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(InterfaceC5868j0 interfaceC5868j0, List<String> list) {
            this.f30828a = interfaceC5868j0;
            this.f30829b = list;
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
            Ki.Q.e(AdsTheme, C15170g0.f142068a, ComposableLambdaKt.c(-708014099, true, new C0708a(AdsTheme, this.f30828a, this.f30829b), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.xb$b */
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f30837a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f30838b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f30839c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.xb$b$a */
        static final class a implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30840a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f30841b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f30842c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30843d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.xb$b$a$a, reason: collision with other inner class name */
            static final class C0710a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f30844a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30845b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15168f0 f30846c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PagerState f30847d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f30848e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.TabShowcaseKt$AcresTabsNonScrollableAndSwipeable$1$1$1$1$1$1$1$1", f = "TabShowcase.kt", l = {225}, m = "invokeSuspend")
                /* renamed from: Qi.xb$b$a$a$a, reason: collision with other inner class name */
                static final class C0711a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f30849a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f30850b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f30851c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0711a(PagerState pagerState, int i10, Continuation<? super C0711a> continuation) {
                        super(2, continuation);
                        this.f30850b = pagerState;
                        this.f30851c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0711a(this.f30850b, this.f30851c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C0711a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f30849a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            PagerState pagerState = this.f30850b;
                            int i11 = this.f30851c;
                            this.f30849a = 1;
                            if (PagerState.w(pagerState, i11, 0.0f, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                C0710a(List<String> list, LocalThemeScope localThemeScope, InterfaceC15168f0 interfaceC15168f0, PagerState pagerState, InterfaceC15783O interfaceC15783O) {
                    this.f30844a = list;
                    this.f30845b = localThemeScope;
                    this.f30846c = interfaceC15168f0;
                    this.f30847d = pagerState;
                    this.f30848e = interfaceC15783O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC15783O interfaceC15783O, PagerState pagerState, int i10) {
                    C15809k.d(interfaceC15783O, null, null, new C0711a(pagerState, i10, null), 3, null);
                    return Unit.f143329a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1715052694, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsNonScrollableAndSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:220)");
                    }
                    List<String> list = this.f30844a;
                    LocalThemeScope localThemeScope = this.f30845b;
                    InterfaceC15168f0 interfaceC15168f0 = this.f30846c;
                    final PagerState pagerState = this.f30847d;
                    final InterfaceC15783O interfaceC15783O = this.f30848e;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC15168f0.getTabTemplate();
                        boolean z10 = pagerState.k() == i13;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(interfaceC15783O) | composer.V(pagerState) | composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Qi.yb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C5067xb.b.a.C0710a.c(interfaceC15783O, pagerState, i13);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        vi.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f30840a;
                PagerState pagerState = this.f30841b;
                List<String> list = this.f30842c;
                InterfaceC15783O interfaceC15783O = this.f30843d;
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
                vi.g.k(localThemeScope, Assemble.getTabRowTemplate(), pagerState.k(), pagerState, null, ComposableLambdaKt.c(-1715052694, true, new C0710a(list, localThemeScope, Assemble, pagerState, interfaceC15783O), composer, 54), composer, 196608, 8);
                vi.g.e(localThemeScope, androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), Assemble.getHorizontalPagerTemplate(), list.size(), pagerState, D5.f28444a.f(), composer, 196608);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O) {
                this.f30840a = localThemeScope;
                this.f30841b = pagerState;
                this.f30842c = list;
                this.f30843d = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
                a(interfaceC15168f0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O) {
            this.f30837a = pagerState;
            this.f30838b = list;
            this.f30839c = interfaceC15783O;
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
            Ki.Q.e(AdsTheme, C15170g0.f142068a, ComposableLambdaKt.c(678036302, true, new a(AdsTheme, this.f30837a, this.f30838b, this.f30839c), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.xb$c */
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f30852a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f30853b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.xb$c$a */
        static final class a implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30854a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f30855b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f30856c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.xb$c$a$a, reason: collision with other inner class name */
            static final class C0712a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f30857a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30858b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15168f0 f30859c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f30860d;

                C0712a(List<String> list, LocalThemeScope localThemeScope, InterfaceC15168f0 interfaceC15168f0, InterfaceC5868j0 interfaceC5868j0) {
                    this.f30857a = list;
                    this.f30858b = localThemeScope;
                    this.f30859c = interfaceC15168f0;
                    this.f30860d = interfaceC5868j0;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-163967733, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndNonSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:163)");
                    }
                    List<String> list = this.f30857a;
                    LocalThemeScope localThemeScope = this.f30858b;
                    InterfaceC15168f0 interfaceC15168f0 = this.f30859c;
                    final InterfaceC5868j0 interfaceC5868j0 = this.f30860d;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC15168f0.getTabTemplate();
                        boolean z10 = C5067xb.l(interfaceC5868j0) == i13;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Qi.zb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C5067xb.c.a.C0712a.c(i13, interfaceC5868j0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        vi.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, InterfaceC5868j0 interfaceC5868j0) {
                    C5067xb.m(interfaceC5868j0, i10);
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, List<String> list) {
                this.f30854a = localThemeScope;
                this.f30855b = interfaceC5868j0;
                this.f30856c = list;
            }

            public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f30854a;
                InterfaceC5868j0 interfaceC5868j0 = this.f30855b;
                List<String> list = this.f30856c;
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
                vi.g.g(localThemeScope, Assemble.getScrollableTabRowTemplate(), C5067xb.l(interfaceC5868j0), null, null, ComposableLambdaKt.c(-163967733, true, new C0712a(list, localThemeScope, Assemble, interfaceC5868j0), composer, 54), composer, 199680, 8);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.b(), companion2.g(), composer, 54);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                int iL = C5067xb.l(interfaceC5868j0);
                if (iL == 0) {
                    composer.startReplaceGroup(1654993917);
                    kotlin.N1.b("Here is the content on Tab 1", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iL == 1) {
                    composer.startReplaceGroup(1654999262);
                    kotlin.N1.b("Here is more content on Tab 2", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                } else if (iL != 2) {
                    composer.startReplaceGroup(-234314290);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1655004633);
                    kotlin.N1.b("Awesome content on Tab 3", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                    composer.P();
                }
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
                a(interfaceC15168f0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(InterfaceC5868j0 interfaceC5868j0, List<String> list) {
            this.f30852a = interfaceC5868j0;
            this.f30853b = list;
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
            Ki.Q.e(AdsTheme, C15170g0.f142068a, ComposableLambdaKt.c(-2054888472, true, new a(AdsTheme, this.f30852a, this.f30853b), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.xb$d */
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f30861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f30862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f30863c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.xb$d$a */
        static final class a implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30864a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f30865b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f30866c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30867d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.xb$d$a$a, reason: collision with other inner class name */
            static final class C0713a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f30868a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30869b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15168f0 f30870c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PagerState f30871d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f30872e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.TabShowcaseKt$AcresTabsScrollableAndSwipeable$1$1$1$1$1$1$1$1", f = "TabShowcase.kt", l = {111}, m = "invokeSuspend")
                /* renamed from: Qi.xb$d$a$a$a, reason: collision with other inner class name */
                static final class C0714a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f30873a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f30874b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f30875c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0714a(PagerState pagerState, int i10, Continuation<? super C0714a> continuation) {
                        super(2, continuation);
                        this.f30874b = pagerState;
                        this.f30875c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0714a(this.f30874b, this.f30875c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C0714a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f30873a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            PagerState pagerState = this.f30874b;
                            int i11 = this.f30875c;
                            this.f30873a = 1;
                            if (PagerState.w(pagerState, i11, 0.0f, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                C0713a(List<String> list, LocalThemeScope localThemeScope, InterfaceC15168f0 interfaceC15168f0, PagerState pagerState, InterfaceC15783O interfaceC15783O) {
                    this.f30868a = list;
                    this.f30869b = localThemeScope;
                    this.f30870c = interfaceC15168f0;
                    this.f30871d = pagerState;
                    this.f30872e = interfaceC15783O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC15783O interfaceC15783O, PagerState pagerState, int i10) {
                    C15809k.d(interfaceC15783O, null, null, new C0714a(pagerState, i10, null), 3, null);
                    return Unit.f143329a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-243479824, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AcresTabsScrollableAndSwipeable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabShowcase.kt:106)");
                    }
                    List<String> list = this.f30868a;
                    LocalThemeScope localThemeScope = this.f30869b;
                    InterfaceC15168f0 interfaceC15168f0 = this.f30870c;
                    final PagerState pagerState = this.f30871d;
                    final InterfaceC15783O interfaceC15783O = this.f30872e;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        String str = (String) obj;
                        final int i13 = i11;
                        q1.TabTemplate tabTemplate = interfaceC15168f0.getTabTemplate();
                        boolean z10 = pagerState.k() == i13;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(interfaceC15783O) | composer.V(pagerState) | composer.d(i13);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Qi.Ab
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C5067xb.d.a.C0713a.c(interfaceC15783O, pagerState, i13);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        vi.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer, 24576);
                        i11 = i12;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f30864a;
                PagerState pagerState = this.f30865b;
                List<String> list = this.f30866c;
                InterfaceC15783O interfaceC15783O = this.f30867d;
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
                vi.g.g(localThemeScope, Assemble.getScrollableTabRowTemplate(), pagerState.k(), pagerState, null, ComposableLambdaKt.c(-243479824, true, new C0713a(list, localThemeScope, Assemble, pagerState, interfaceC15783O), composer, 54), composer, 196608, 8);
                vi.g.e(localThemeScope, androidx.compose.foundation.layout.J.b(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), Assemble.getHorizontalPagerTemplate(), list.size(), pagerState, D5.f28444a.a(), composer, 196608);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O) {
                this.f30864a = localThemeScope;
                this.f30865b = pagerState;
                this.f30866c = list;
                this.f30867d = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
                a(interfaceC15168f0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        d(PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O) {
            this.f30861a = pagerState;
            this.f30862b = list;
            this.f30863c = interfaceC15783O;
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
            Ki.Q.e(AdsTheme, C15170g0.f142068a, ComposableLambdaKt.c(-1099192013, true, new a(AdsTheme, this.f30861a, this.f30862b, this.f30863c), composer, 54), composer, (i10 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(int i10, Composer composer, int i11) {
        e(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(int i10, Composer composer, int i11) {
        i(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(int i10, Composer composer, int i11) {
        k(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(int i10, Composer composer, int i11) {
        o(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ki.K.b(null, ComposableLambdaKt.c(259107652, true, new a((InterfaceC5868j0) objB, listP), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.vb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5067xb.h(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
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
            PagerState pagerStateA = C16628i.a(0, composerStartRestartGroup, 0, 1);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            Ki.K.b(null, ComposableLambdaKt.c(1711767383, true, new b(pagerStateA, listP, (InterfaceC15783O) objB), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.sb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5067xb.j(i10, (Composer) obj, ((Integer) obj2).intValue());
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
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ki.K.b(null, ComposableLambdaKt.c(-1021157391, true, new c((InterfaceC5868j0) objB, listP), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.tb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5067xb.n(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
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
            PagerState pagerStateA = C16628i.a(0, composerStartRestartGroup, 0, 1);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            Ki.K.b(null, ComposableLambdaKt.c(1938936266, true, new d(pagerStateA, listP, (InterfaceC15783O) objB), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.ub
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5067xb.p(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
