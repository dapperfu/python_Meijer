package os;

import F1.j;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import co.AbstractC6536h;
import d0.C13590y;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0010\u001a\u00020\f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a[\u0010\u0013\u001a\u00020\f*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "Lco/c;", "claimableRewards", "", "userName", "", "pointBalance", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lco/h;", "", "onNavigationRequest", "Lco/i;", "onResourceAction", "k", "(LKi/M;Ljava/util/List;Ljava/lang/String;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rewards", "e", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "nameHeightDp", "pointsHeightDp", "selectedItem", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: os.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16296e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f155707f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f155707f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f155707f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155708f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155709g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155710h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155711i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ H1.d f155712j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextLayoutResult f155713k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f155714l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f155715m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f155716n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f155717o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1 f155718p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f155719q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f155720r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, H1.d dVar, TextLayoutResult textLayoutResult, String str, int i11, List list, Function1 function1, Function1 function12, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
            super(2);
            this.f155709g = nVar;
            this.f155710h = function0;
            this.f155711i = localThemeScope;
            this.f155712j = dVar;
            this.f155713k = textLayoutResult;
            this.f155714l = str;
            this.f155715m = i11;
            this.f155716n = list;
            this.f155717o = function1;
            this.f155718p = function12;
            this.f155719q = interfaceC5872l0;
            this.f155720r = interfaceC5872l02;
            this.f155708f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            String strD;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155709g.getHelpersHashCode();
            this.f155709g.i();
            L1.n nVar = this.f155709g;
            composer.startReplaceGroup(-1674793694);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            float fP = H1.h.p(H1.h.p(C16296e.m(this.f155719q) + C16296e.o(this.f155720r)) * 0.75f);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.b.d(companion, this.f155711i.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), 0.0f, fP, 0.0f, this.f155711i.getAdsSpacing().getSeven().getDp(), 5, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f155721a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierH = androidx.compose.foundation.layout.J.h(nVar.k(modifierM, hVarA, (Function1) objB), 0.0f, 1, null);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C13590y.a(C16335d.c(ns.s.f153134n, composer, 0), null, androidx.compose.foundation.layout.J.F(C5806j.f48836a.g(companion, companion3.c()), null, false, 3, null), null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            composer.v();
            LocalThemeScope localThemeScope = this.f155711i;
            Ki.I three = localThemeScope.getAdsTypography().getValues().getThree();
            Ki.T adsColorUIBackground01 = this.f155711i.getAdsColors().getAdsColorUIBackground01();
            j.Companion companion5 = F1.j.INSTANCE;
            int iF = companion5.f();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, this.f155711i.getAdsSpacing().getSeven().getDp(), this.f155711i.getAdsSpacing().getFive().getDp(), this.f155711i.getAdsSpacing().getSeven().getDp(), 0.0f, 8, null);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = d.f155722a;
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM2, hVarC, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155712j);
            Object objB3 = composer.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new C2410e(this.f155712j, this.f155719q);
                composer.t(objB3);
            }
            composer.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.h(androidx.compose.ui.layout.T.a(modifierK, (Function1) objB3), 0.0f, 1, null), adsColorUIBackground01, null, F1.j.h(iF), 0, false, 0, three, null, 372, null);
            if (this.f155713k.n() > 2) {
                composer.startReplaceGroup(-1672812268);
                strD = C16338g.d(ns.u.f153194p0, new Object[]{this.f155714l}, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1672515908);
                strD = C16338g.d(ns.u.f153188m0, new Object[]{this.f155714l}, composer, 0);
                composer.P();
            }
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strD, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f155711i;
            Ki.I two = localThemeScope2.getAdsTypography().getValues().getTwo();
            Ki.T adsColorTextHighlight = this.f155711i.getAdsColors().getAdsColorTextHighlight();
            int iF2 = companion5.f();
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(hVarC) | composer.D(this.f155711i);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new f(hVarC, this.f155711i);
                composer.t(objB4);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB4);
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(this.f155712j);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new g(this.f155712j, this.f155720r);
                composer.t(objB5);
            }
            composer.P();
            si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.J.h(androidx.compose.ui.layout.T.a(modifierK2, (Function1) objB5), 0.0f, 1, null), adsColorTextHighlight, null, F1.j.h(iF2), 0, false, 0, two, null, 372, null), C16338g.d(ns.u.f153203x, new Object[]{Integer.valueOf(this.f155715m)}, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.startReplaceGroup(-1633490746);
            boolean zV4 = composer.V(hVarD) | composer.D(this.f155711i);
            Object objB6 = composer.B();
            if (zV4 || objB6 == companion2.a()) {
                objB6 = new h(hVarD, this.f155711i);
                composer.t(objB6);
            }
            composer.P();
            C16296e.e(this.f155711i, this.f155716n, nVar.k(companion, hVarE, (Function1) objB6), this.f155715m, this.f155717o, this.f155718p, composer, i11, 0);
            composer.P();
            if (this.f155709g.getHelpersHashCode() != helpersHashCode) {
                this.f155710h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155721a = new c();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$d */
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f155722a = new d();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$e, reason: collision with other inner class name */
    static final class C2410e implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.d f155723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<H1.h> f155724b;

        C2410e(H1.d dVar, InterfaceC5872l0<H1.h> interfaceC5872l0) {
            this.f155723a = dVar;
            this.f155724b = interfaceC5872l0;
        }

        public final void a(LayoutCoordinates coordinates) {
            Intrinsics.j(coordinates, "coordinates");
            C16296e.n(this.f155724b, this.f155723a.K((int) (coordinates.c() & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$f */
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155726b;

        f(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f155725a = hVar;
            this.f155726b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155725a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f155726b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), H1.h.p(128), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: os.e$g */
    static final class g implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.d f155727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<H1.h> f155728b;

        g(H1.d dVar, InterfaceC5872l0<H1.h> interfaceC5872l0) {
            this.f155727a = dVar;
            this.f155728b = interfaceC5872l0;
        }

        public final void a(LayoutCoordinates coordinates) {
            Intrinsics.j(coordinates, "coordinates");
            C16296e.p(this.f155728b, this.f155727a.K((int) (coordinates.c() & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: os.e$h */
    static final class h implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155730b;

        h(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f155729a = hVar;
            this.f155730b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155729a.getBottom(), this.f155730b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
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
    public static final void e(final Ki.LocalThemeScope r32, final java.util.List<co.ClaimReward> r33, androidx.compose.ui.Modifier r34, final int r35, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16296e.e(Ki.M, java.util.List, androidx.compose.ui.Modifier, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(AbstractC6536h.C1234h.f62748a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, Function1 function1, Function1 function12, int i11, int i12, Composer composer, int i13) {
        e(localThemeScope, list, modifier, i10, function1, function12, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    public static final void k(final Ki.LocalThemeScope r30, final java.util.List<co.ClaimReward> r31, final java.lang.String r32, final int r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r35, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16296e.k(Ki.M, java.util.List, java.lang.String, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, List list, String str, int i10, Modifier modifier, Function1 function1, Function1 function12, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, list, str, i10, modifier, function1, function12, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    private static final int f(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    private static final void g(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC5868j0 interfaceC5868j0, int i10) {
        g(interfaceC5868j0, i10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(InterfaceC5872l0<H1.h> interfaceC5872l0) {
        return interfaceC5872l0.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5872l0<H1.h> interfaceC5872l0, float f10) {
        interfaceC5872l0.setValue(H1.h.l(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(InterfaceC5872l0<H1.h> interfaceC5872l0) {
        return interfaceC5872l0.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5872l0<H1.h> interfaceC5872l0, float f10) {
        interfaceC5872l0.setValue(H1.h.l(f10));
    }
}
