package os;

import F1.j;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import bo.g;
import d0.C13457y;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0010\u001a\u00020\f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a[\u0010\u0013\u001a\u00020\f*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "Lbo/b;", "claimableRewards", "", "userName", "", "pointBalance", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lbo/g;", "", "onNavigationRequest", "Lbo/h;", "onResourceAction", "k", "(LJi/M;Ljava/util/List;Ljava/lang/String;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rewards", "e", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "nameHeightDp", "pointsHeightDp", "selectedItem", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: os.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16154e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f155134f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f155134f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f155134f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155135f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155136g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155137h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155138i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ H1.d f155139j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextLayoutResult f155140k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f155141l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f155142m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f155143n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f155144o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1 f155145p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f155146q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f155147r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, H1.d dVar, TextLayoutResult textLayoutResult, String str, int i11, List list, Function1 function1, Function1 function12, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02) {
            super(2);
            this.f155136g = nVar;
            this.f155137h = function0;
            this.f155138i = localThemeScope;
            this.f155139j = dVar;
            this.f155140k = textLayoutResult;
            this.f155141l = str;
            this.f155142m = i11;
            this.f155143n = list;
            this.f155144o = function1;
            this.f155145p = function12;
            this.f155146q = interfaceC5730l0;
            this.f155147r = interfaceC5730l02;
            this.f155135f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            String strD;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155136g.getHelpersHashCode();
            this.f155136g.i();
            L1.n nVar = this.f155136g;
            composer.startReplaceGroup(-1674793694);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            float fP = H1.h.p(H1.h.p(C16154e.m(this.f155146q) + C16154e.o(this.f155147r)) * 0.75f);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.b.d(companion, this.f155138i.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), 0.0f, fP, 0.0f, this.f155138i.getAdsSpacing().getSeven().getDp(), 5, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f155148a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierH = androidx.compose.foundation.layout.J.h(nVar.k(modifierM, hVarA, (Function1) objB), 0.0f, 1, null);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C13457y.a(C16190d.c(ns.s.f152682n, composer, 0), null, androidx.compose.foundation.layout.J.F(C5664j.f48612a.g(companion, companion3.c()), null, false, 3, null), null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            composer.v();
            LocalThemeScope localThemeScope = this.f155138i;
            Ji.I three = localThemeScope.getAdsTypography().getValues().getThree();
            Ji.T adsColorUIBackground01 = this.f155138i.getAdsColors().getAdsColorUIBackground01();
            j.Companion companion5 = F1.j.INSTANCE;
            int iF = companion5.f();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, this.f155138i.getAdsSpacing().getSeven().getDp(), this.f155138i.getAdsSpacing().getFive().getDp(), this.f155138i.getAdsSpacing().getSeven().getDp(), 0.0f, 8, null);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = d.f155149a;
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM2, hVarC, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155139j);
            Object objB3 = composer.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new C2407e(this.f155139j, this.f155146q);
                composer.t(objB3);
            }
            composer.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.h(androidx.compose.ui.layout.T.a(modifierK, (Function1) objB3), 0.0f, 1, null), adsColorUIBackground01, null, F1.j.h(iF), 0, false, 0, three, null, 372, null);
            if (this.f155140k.n() > 2) {
                composer.startReplaceGroup(-1672812268);
                strD = C16193g.d(ns.u.f152742p0, new Object[]{this.f155141l}, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1672515908);
                strD = C16193g.d(ns.u.f152736m0, new Object[]{this.f155141l}, composer, 0);
                composer.P();
            }
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strD, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f155138i;
            Ji.I two = localThemeScope2.getAdsTypography().getValues().getTwo();
            Ji.T adsColorTextHighlight = this.f155138i.getAdsColors().getAdsColorTextHighlight();
            int iF2 = companion5.f();
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(hVarC) | composer.D(this.f155138i);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new f(hVarC, this.f155138i);
                composer.t(objB4);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB4);
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(this.f155139j);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new g(this.f155139j, this.f155147r);
                composer.t(objB5);
            }
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.J.h(androidx.compose.ui.layout.T.a(modifierK2, (Function1) objB5), 0.0f, 1, null), adsColorTextHighlight, null, F1.j.h(iF2), 0, false, 0, two, null, 372, null), C16193g.d(ns.u.f152751x, new Object[]{Integer.valueOf(this.f155142m)}, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.startReplaceGroup(-1633490746);
            boolean zV4 = composer.V(hVarD) | composer.D(this.f155138i);
            Object objB6 = composer.B();
            if (zV4 || objB6 == companion2.a()) {
                objB6 = new h(hVarD, this.f155138i);
                composer.t(objB6);
            }
            composer.P();
            C16154e.e(this.f155138i, this.f155143n, nVar.k(companion, hVarE, (Function1) objB6), this.f155142m, this.f155144o, this.f155145p, composer, i11, 0);
            composer.P();
            if (this.f155136g.getHelpersHashCode() != helpersHashCode) {
                this.f155137h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155148a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$d */
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f155149a = new d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$e, reason: collision with other inner class name */
    static final class C2407e implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.d f155150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<H1.h> f155151b;

        C2407e(H1.d dVar, InterfaceC5730l0<H1.h> interfaceC5730l0) {
            this.f155150a = dVar;
            this.f155151b = interfaceC5730l0;
        }

        public final void a(LayoutCoordinates coordinates) {
            Intrinsics.j(coordinates, "coordinates");
            C16154e.n(this.f155151b, this.f155150a.K((int) (coordinates.c() & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$f */
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155153b;

        f(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f155152a = hVar;
            this.f155153b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155152a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f155153b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), H1.h.p(128), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$g */
    static final class g implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.d f155154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<H1.h> f155155b;

        g(H1.d dVar, InterfaceC5730l0<H1.h> interfaceC5730l0) {
            this.f155154a = dVar;
            this.f155155b = interfaceC5730l0;
        }

        public final void a(LayoutCoordinates coordinates) {
            Intrinsics.j(coordinates, "coordinates");
            C16154e.p(this.f155155b, this.f155154a.K((int) (coordinates.c() & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$h */
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155157b;

        h(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f155156a = hVar;
            this.f155157b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155156a.getBottom(), this.f155157b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ji.LocalThemeScope r32, final java.util.List<bo.ClaimReward> r33, androidx.compose.ui.Modifier r34, final int r35, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super bo.h, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16154e.e(Ji.M, java.util.List, androidx.compose.ui.Modifier, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(g.h.f60551a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, Function1 function1, Function1 function12, int i11, int i12, Composer composer, int i13) {
        e(localThemeScope, list, modifier, i10, function1, function12, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r30, final java.util.List<bo.ClaimReward> r31, final java.lang.String r32, final int r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super bo.h, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16154e.k(Ji.M, java.util.List, java.lang.String, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, List list, String str, int i10, Modifier modifier, Function1 function1, Function1 function12, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, list, str, i10, modifier, function1, function12, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    private static final int f(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    private static final void g(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC5726j0 interfaceC5726j0, int i10) {
        g(interfaceC5726j0, i10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(InterfaceC5730l0<H1.h> interfaceC5730l0) {
        return interfaceC5730l0.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5730l0<H1.h> interfaceC5730l0, float f10) {
        interfaceC5730l0.setValue(H1.h.l(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(InterfaceC5730l0<H1.h> interfaceC5730l0) {
        return interfaceC5730l0.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5730l0<H1.h> interfaceC5730l0, float f10) {
        interfaceC5730l0.setValue(H1.h.l(f10));
    }
}
