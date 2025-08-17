package eq;

import F1.j;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import hq.AbstractC14561b;
import j0.InterfaceC14800I;
import ji.InterfaceC14971y;
import ji.R0;
import ji.j1;
import ji.q1;
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
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;
import si.C16977b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aK\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJi/M;", "Lhq/b;", "decorator", "Lkotlin/Function0;", "", "positiveAction", "negativeAction", "onDismiss", "e", "(LJi/M;Lhq/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129671b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14561b f129672c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129673d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129674e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: eq.p0$a$a, reason: collision with other inner class name */
        static final class C2048a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC14561b f129675a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129676b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f129677c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f129678d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.p0$a$a$a, reason: collision with other inner class name */
            static final class C2049a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2049a f129679a = new C2049a();

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }

                C2049a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$b */
            static final class b implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f129680a;

                b(L1.h hVar) {
                    this.f129680a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f129680a.getBottom(), H1.h.p(24), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$c */
            static final class c implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f129681a;

                c(L1.h hVar) {
                    this.f129681a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f129681a.getBottom(), H1.h.p(8), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$d */
            static final class d implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129682a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L1.n f129683b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ L1.h f129684c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ L1.h f129685d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f129686e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AbstractC14561b f129687f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: eq.p0$a$a$d$a, reason: collision with other inner class name */
                static final class C2050a implements Function1<C4039g, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ L1.h f129688a;

                    C2050a(L1.h hVar) {
                        this.f129688a = hVar;
                    }

                    public final void a(C4039g constrainAs) {
                        Intrinsics.j(constrainAs, "$this$constrainAs");
                        x.a.a(constrainAs.getTop(), this.f129688a.getBottom(), H1.h.p(40), 0.0f, 4, null);
                        D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                        D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                        a(c4039g);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: eq.p0$a$a$d$b */
                static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f129689a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AbstractC14561b f129690b;

                    b(LocalThemeScope localThemeScope, AbstractC14561b abstractC14561b) {
                        this.f129689a = localThemeScope;
                        this.f129690b = abstractC14561b;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2099353075, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanPermissionModal.kt:95)");
                        }
                        LocalThemeScope localThemeScope = this.f129689a;
                        ri.j.h(localThemeScope, new q1.Label(null, this.f129689a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(this.f129690b.getPositiveButtonText(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, Function0<Unit> function0, AbstractC14561b abstractC14561b) {
                    this.f129682a = localThemeScope;
                    this.f129683b = nVar;
                    this.f129684c = hVar;
                    this.f129685d = hVar2;
                    this.f129686e = function0;
                    this.f129687f = abstractC14561b;
                }

                public final void a(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2121660902, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanPermissionModal.kt:83)");
                    }
                    LocalThemeScope localThemeScope = this.f129682a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    L1.n nVar = this.f129683b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    L1.h hVar = this.f129684c;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f129685d);
                    L1.h hVar2 = this.f129685d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C2050a(hVar2);
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(nVar.k(companion, hVar, (Function1) objB), 0.0f, 1, null), false, null, 895, null), this.f129686e, ComposableLambdaKt.c(-2099353075, true, new b(this.f129682a, this.f129687f), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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
            /* renamed from: eq.p0$a$a$e */
            static final class e implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f129691a;

                e(L1.h hVar) {
                    this.f129691a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f129691a.getBottom(), H1.h.p(24), 0.0f, 4, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.p0$a$a$f */
            public static final class f extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f129692f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(L1.A a10) {
                    super(1);
                    this.f129692f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f129692f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.p0$a$a$g */
            public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f129693f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f129694g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f129695h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ AbstractC14561b f129696i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129697j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ Function0 f129698k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f129699l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(L1.n nVar, int i10, Function0 function0, AbstractC14561b abstractC14561b, LocalThemeScope localThemeScope, Function0 function02, Function0 function03) {
                    super(2);
                    this.f129694g = nVar;
                    this.f129695h = function0;
                    this.f129696i = abstractC14561b;
                    this.f129697j = localThemeScope;
                    this.f129698k = function02;
                    this.f129699l = function03;
                    this.f129693f = i10;
                }

                public final void a(Composer composer, int i10) {
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f129694g.getHelpersHashCode();
                    this.f129694g.i();
                    L1.n nVar = this.f129694g;
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
                        objB = C2049a.f129679a;
                        composer.t(objB);
                    }
                    composer.P();
                    C13457y.a(C16190d.c(this.f129696i.getImage(), composer, 0), null, nVar.k(companion, hVarA, (Function1) objB), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                    LocalThemeScope localThemeScope = this.f129697j;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion2.a()) {
                        objB2 = new b(hVarA);
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierK = nVar.k(companion, hVarC, (Function1) objB2);
                    Ji.I six = this.f129697j.getAdsTypography().getHeadings().getSix();
                    j.Companion companion3 = F1.j.INSTANCE;
                    q1.Label label = new q1.Label(modifierK, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
                    String strC = C16193g.c(this.f129696i.getTitle(), composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f129697j;
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarC);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion2.a()) {
                        objB3 = new c(hVarC);
                        composer.t(objB3);
                    }
                    composer.P();
                    ri.j.h(localThemeScope2, new q1.Label(nVar.k(companion, hVarD, (Function1) objB3), null, null, F1.j.h(companion3.a()), 0, false, 0, this.f129697j.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16193g.c(this.f129696i.getDescription(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope3 = this.f129697j;
                    Ji.Q.e(localThemeScope3, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-2121660902, true, new d(localThemeScope3, nVar, hVarE, hVarD, this.f129699l, this.f129696i), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.d.f140293b << 3));
                    LocalThemeScope localThemeScope4 = this.f129697j;
                    composer.startReplaceGroup(5004770);
                    boolean zV3 = composer.V(hVarE);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion2.a()) {
                        objB4 = new e(hVarE);
                        composer.t(objB4);
                    }
                    composer.P();
                    ri.j.h(localThemeScope4, new q1.Label(ClickableKt.d(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB4), 0.0f, 0.0f, 0.0f, H1.h.p(16), 7, null), false, null, null, this.f129698k, 7, null), this.f129697j.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(companion3.a()), 0, false, 0, this.f129697j.getAdsTypography().getHeadings().getSeven(), null, 372, null), C16193g.c(this.f129696i.getNegativeButtonText(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    composer.P();
                    if (this.f129694g.getHelpersHashCode() != helpersHashCode) {
                        this.f129695h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C2048a(AbstractC14561b abstractC14561b, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02) {
                this.f129675a = abstractC14561b;
                this.f129676b = localThemeScope;
                this.f129677c = function0;
                this.f129678d = function02;
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
                AbstractC14561b abstractC14561b = this.f129675a;
                LocalThemeScope localThemeScope = this.f129676b;
                Function0<Unit> function0 = this.f129677c;
                Function0<Unit> function02 = this.f129678d;
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
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16705m.d(modifierI, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 6, pairH.b(), abstractC14561b, localThemeScope, function0, function02)), pairH.a(), composer, 48, 0);
                composer.U();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC14561b abstractC14561b, Function0<Unit> function02, Function0<Unit> function03) {
            this.f129670a = localThemeScope;
            this.f129671b = function0;
            this.f129672c = abstractC14561b;
            this.f129673d = function02;
            this.f129674e = function03;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(634221056, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ShopAndScanPermissionModal.<anonymous> (ShopAndScanPermissionModal.kt:41)");
            }
            C16977b.b(this.f129670a, q1.ModalTemplate.y(Assemble.getModalTemplate(), androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(16), 0.0f, 2, null), null, 0.0f, 6, null), this.f129671b, null, ComposableLambdaKt.c(-380182989, true, new C2048a(this.f129672c, this.f129670a, this.f129673d, this.f129674e), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void e(final Ji.LocalThemeScope r14, final hq.AbstractC14561b r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.p0.e(Ji.M, hq.b, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, AbstractC14561b abstractC14561b, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, abstractC14561b, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
