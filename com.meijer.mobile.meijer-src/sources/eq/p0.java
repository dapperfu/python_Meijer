package eq;

import F1.j;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import hq.AbstractC14567b;
import j0.InterfaceC14888I;
import ki.InterfaceC15205y;
import ki.R0;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aK\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKi/M;", "Lhq/b;", "decorator", "Lkotlin/Function0;", "", "positiveAction", "negativeAction", "onDismiss", "e", "(LKi/M;Lhq/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f130512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14567b f130513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f130514d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f130515e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: eq.p0$a$a, reason: collision with other inner class name */
        static final class C2056a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC14567b f130516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130517b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f130518c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f130519d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.p0$a$a$a, reason: collision with other inner class name */
            static final class C2057a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2057a f130520a = new C2057a();

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }

                C2057a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$b */
            static final class b implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f130521a;

                b(L1.h hVar) {
                    this.f130521a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f130521a.getBottom(), H1.h.p(24), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$c */
            static final class c implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f130522a;

                c(L1.h hVar) {
                    this.f130522a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f130522a.getBottom(), H1.h.p(8), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$d */
            static final class d implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f130523a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L1.n f130524b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ L1.h f130525c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ L1.h f130526d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f130527e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AbstractC14567b f130528f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: eq.p0$a$a$d$a, reason: collision with other inner class name */
                static final class C2058a implements Function1<C4010g, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ L1.h f130529a;

                    C2058a(L1.h hVar) {
                        this.f130529a = hVar;
                    }

                    public final void a(C4010g constrainAs) {
                        Intrinsics.j(constrainAs, "$this$constrainAs");
                        x.a.a(constrainAs.getTop(), this.f130529a.getBottom(), H1.h.p(40), 0.0f, 4, null);
                        D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                        D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                        a(c4010g);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: eq.p0$a$a$d$b */
                static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f130530a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AbstractC14567b f130531b;

                    b(LocalThemeScope localThemeScope, AbstractC14567b abstractC14567b) {
                        this.f130530a = localThemeScope;
                        this.f130531b = abstractC14567b;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2099353075, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanPermissionModal.kt:95)");
                        }
                        LocalThemeScope localThemeScope = this.f130530a;
                        si.j.h(localThemeScope, new q1.Label(null, this.f130530a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(this.f130531b.getPositiveButtonText(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, Function0<Unit> function0, AbstractC14567b abstractC14567b) {
                    this.f130523a = localThemeScope;
                    this.f130524b = nVar;
                    this.f130525c = hVar;
                    this.f130526d = hVar2;
                    this.f130527e = function0;
                    this.f130528f = abstractC14567b;
                }

                public final void a(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2121660902, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanPermissionModal.kt:83)");
                    }
                    LocalThemeScope localThemeScope = this.f130523a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    L1.n nVar = this.f130524b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    L1.h hVar = this.f130525c;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f130526d);
                    L1.h hVar2 = this.f130526d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C2058a(hVar2);
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(nVar.k(companion, hVar, (Function1) objB), 0.0f, 1, null), false, null, 895, null), this.f130527e, ComposableLambdaKt.c(-2099353075, true, new b(this.f130523a, this.f130528f), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
            /* renamed from: eq.p0$a$a$e */
            static final class e implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f130532a;

                e(L1.h hVar) {
                    this.f130532a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f130532a.getBottom(), H1.h.p(24), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.p0$a$a$f */
            public static final class f extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f130533f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(L1.A a10) {
                    super(1);
                    this.f130533f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f130533f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$g */
            public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f130534f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f130535g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f130536h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ AbstractC14567b f130537i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f130538j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ Function0 f130539k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f130540l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(L1.n nVar, int i10, Function0 function0, AbstractC14567b abstractC14567b, LocalThemeScope localThemeScope, Function0 function02, Function0 function03) {
                    super(2);
                    this.f130535g = nVar;
                    this.f130536h = function0;
                    this.f130537i = abstractC14567b;
                    this.f130538j = localThemeScope;
                    this.f130539k = function02;
                    this.f130540l = function03;
                    this.f130534f = i10;
                }

                public final void a(Composer composer, int i10) {
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f130535g.getHelpersHashCode();
                    this.f130535g.i();
                    L1.n nVar = this.f130535g;
                    composer.startReplaceGroup(-1039978144);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    L1.h hVarD = bVarM.d();
                    L1.h hVarE = bVarM.e();
                    L1.h hVarF = bVarM.f();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C2057a.f130520a;
                        composer.t(objB);
                    }
                    composer.P();
                    C13590y.a(C16335d.c(this.f130537i.getImage(), composer, 0), null, nVar.k(companion, hVarA, (Function1) objB), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                    LocalThemeScope localThemeScope = this.f130538j;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion2.a()) {
                        objB2 = new b(hVarA);
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierK = nVar.k(companion, hVarC, (Function1) objB2);
                    Ki.I six = this.f130538j.getAdsTypography().getHeadings().getSix();
                    j.Companion companion3 = F1.j.INSTANCE;
                    q1.Label label = new q1.Label(modifierK, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
                    String strC = C16338g.c(this.f130537i.getTitle(), composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f130538j;
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarC);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion2.a()) {
                        objB3 = new c(hVarC);
                        composer.t(objB3);
                    }
                    composer.P();
                    si.j.h(localThemeScope2, new q1.Label(nVar.k(companion, hVarD, (Function1) objB3), null, null, F1.j.h(companion3.a()), 0, false, 0, this.f130538j.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16338g.c(this.f130537i.getDescription(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope3 = this.f130538j;
                    Ki.Q.e(localThemeScope3, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-2121660902, true, new d(localThemeScope3, nVar, hVarE, hVarD, this.f130540l, this.f130537i), composer, 54), composer, i11 | 384 | (InterfaceC15205y.a.d.f142548b << 3));
                    LocalThemeScope localThemeScope4 = this.f130538j;
                    composer.startReplaceGroup(5004770);
                    boolean zV3 = composer.V(hVarE);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion2.a()) {
                        objB4 = new e(hVarE);
                        composer.t(objB4);
                    }
                    composer.P();
                    si.j.h(localThemeScope4, new q1.Label(ClickableKt.d(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB4), 0.0f, 0.0f, 0.0f, H1.h.p(16), 7, null), false, null, null, this.f130539k, 7, null), this.f130538j.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(companion3.a()), 0, false, 0, this.f130538j.getAdsTypography().getHeadings().getSeven(), null, 372, null), C16338g.c(this.f130537i.getNegativeButtonText(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                    if (this.f130535g.getHelpersHashCode() != helpersHashCode) {
                        this.f130536h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C2056a(AbstractC14567b abstractC14567b, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02) {
                this.f130516a = abstractC14567b;
                this.f130517b = localThemeScope;
                this.f130518c = function0;
                this.f130519d = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-380182989, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous>.<anonymous> (ShopAndScanPermissionModal.kt:47)");
                }
                Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16));
                AbstractC14567b abstractC14567b = this.f130516a;
                LocalThemeScope localThemeScope = this.f130517b;
                Function0<Unit> function0 = this.f130518c;
                Function0<Unit> function02 = this.f130519d;
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new L1.A();
                    composer.t(objB);
                }
                composer.U();
                L1.A a10 = (L1.A) objB;
                composer.startReplaceableGroup(-3687241);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new L1.n();
                    composer.t(objB2);
                }
                composer.U();
                L1.n nVar = (L1.n) objB2;
                composer.startReplaceableGroup(-3687241);
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                composer.U();
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16819m.d(modifierI, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 6, pairH.b(), abstractC14567b, localThemeScope, function0, function02)), pairH.a(), composer, 48, 0);
                composer.U();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC14567b abstractC14567b, Function0<Unit> function02, Function0<Unit> function03) {
            this.f130511a = localThemeScope;
            this.f130512b = function0;
            this.f130513c = abstractC14567b;
            this.f130514d = function02;
            this.f130515e = function03;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(634221056, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous> (ShopAndScanPermissionModal.kt:41)");
            }
            C17265b.b(this.f130511a, q1.ModalTemplate.y(Assemble.getModalTemplate(), androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(16), 0.0f, 2, null), null, 0.0f, 6, null), this.f130512b, null, ComposableLambdaKt.c(-380182989, true, new C2056a(this.f130513c, this.f130511a, this.f130514d, this.f130515e), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r14, final hq.AbstractC14567b r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.p0.e(Ki.M, hq.b, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, AbstractC14567b abstractC14567b, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, abstractC14567b, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
