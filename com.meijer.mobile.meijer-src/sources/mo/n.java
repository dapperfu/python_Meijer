package mo;

import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import com.meijer.mobile.mperks.ux.g0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aI\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "balance", "", "animatePoints", "isDashboardSimplifiedUIEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "onCalculateTruncatedBannerHeight", "d", "(LKi/M;IZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isDashboardSimplifiedUI", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151247a;

        a(LocalThemeScope localThemeScope) {
            this.f151247a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f151247a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f151248a;

        b(L1.h hVar) {
            this.f151248a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f151248a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151249a;

        c(LocalThemeScope localThemeScope) {
            this.f151249a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f151249a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f151250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(A a10) {
            super(1);
            this.f151250f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f151250f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f151251f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f151252g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f151253h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f151254i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151255j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f151256k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.n nVar, int i10, Function0 function0, boolean z10, LocalThemeScope localThemeScope, int i11) {
            super(2);
            this.f151252g = nVar;
            this.f151253h = function0;
            this.f151254i = z10;
            this.f151255j = localThemeScope;
            this.f151256k = i11;
            this.f151251f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f151252g.getHelpersHashCode();
            this.f151252g.i();
            L1.n nVar = this.f151252g;
            composer.startReplaceGroup(-678667472);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            if (this.f151254i) {
                composer.startReplaceGroup(-678625933);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f151255j);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(this.f151255j);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarD, (Function1) objB), 0.0f, this.f151255j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objB2 = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB2 == companion2.a()) {
                    objB2 = new A();
                    composer.t(objB2);
                }
                composer.U();
                A a10 = (A) objB2;
                composer.startReplaceableGroup(-3687241);
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new L1.n();
                    composer.t(objB3);
                }
                composer.U();
                L1.n nVar2 = (L1.n) objB3;
                composer.startReplaceableGroup(-3687241);
                Object objB4 = composer.B();
                if (objB4 == companion2.a()) {
                    objB4 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB4);
                }
                composer.U();
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar2, (InterfaceC5872l0) objB4, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16819m.d(modifierM, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar2, 0, pairH.b(), this.f151255j)), pairH.a(), composer, 48, 0);
                composer.U();
                composer.P();
            } else {
                composer.startReplaceGroup(-678172558);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB5 = composer.B();
                if (zV || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new b(hVarC);
                    composer.t(objB5);
                }
                composer.P();
                C13590y.a(C16335d.c(g0.f114995D, composer, 0), null, androidx.compose.foundation.layout.A.c(nVar.k(companion3, hVarA, (Function1) objB5), H1.h.p(4), 0.0f, 2, null), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
                LocalThemeScope localThemeScope = this.f151255j;
                I four = localThemeScope.getAdsTypography().getHeadings().getFour();
                T adsColorInverse = this.f151255j.getAdsColors().getAdsColorInverse();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f151255j);
                Object objB6 = composer.B();
                if (zD2 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new c(this.f151255j);
                    composer.t(objB6);
                }
                composer.P();
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion3, hVarC, (Function1) objB6), 0.0f, this.f151255j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), adsColorInverse, null, null, 0, false, 0, four, null, 380, null), C16338g.d(ns.u.f153202w, new Object[]{Integer.valueOf(this.f151256k)}, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer.P();
            }
            composer.P();
            if (this.f151252g.getHelpersHashCode() != helpersHashCode) {
                this.f151253h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f151257f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(A a10) {
            super(1);
            this.f151257f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f151257f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f151258f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f151259g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f151260h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151261i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope) {
            super(2);
            this.f151259g = nVar;
            this.f151260h = function0;
            this.f151261i = localThemeScope;
            this.f151258f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f151259g.getHelpersHashCode();
            this.f151259g.i();
            composer.startReplaceGroup(1853489272);
            ro.e.c(this.f151261i, composer, LocalThemeScope.f17314g);
            composer.P();
            if (this.f151259g.getHelpersHashCode() != helpersHashCode) {
                this.f151260h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r33, final int r34, final boolean r35, final boolean r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.n.d(Ki.M, int, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        function1.invoke(Float.valueOf((int) (coordinates.c() & 4294967295L)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, int i10, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, i10, z10, z11, modifier, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        function1.invoke(Float.valueOf((int) (coordinates.c() & 4294967295L)));
        return Unit.f143329a;
    }
}
