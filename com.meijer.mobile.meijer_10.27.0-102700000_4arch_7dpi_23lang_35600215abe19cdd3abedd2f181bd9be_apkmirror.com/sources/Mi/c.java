package Mi;

import F1.j;
import Ji.K;
import Ji.LocalThemeScope;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.h;
import L1.l;
import L1.n;
import L1.x;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14815g;
import kotlin.C17986y0;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import r0.C16692i;
import r1.C16705m;
import r1.u;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "count", "", "contentDescription", "", "enabled", "Lkotlin/Function0;", "", "onClick", "iconResource", "LV0/q0;", "iconTint", "badgeBackgroundColor", "c", "(ILjava/lang/String;ZLkotlin/jvm/functions/Function0;IJJLandroidx/compose/runtime/Composer;II)V", "e", "(ILjava/lang/String;IJJLandroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19636c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19637d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19638e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f19639f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f19640g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mi.c$a$a, reason: collision with other inner class name */
        static final class C0327a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f19641a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19642b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f19643c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f19644d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f19645e;

            C0327a(int i10, String str, int i11, long j10, long j11) {
                this.f19641a = i10;
                this.f19642b = str;
                this.f19643c = i11;
                this.f19644d = j10;
                this.f19645e = j11;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2067135302, i10, -1, "com.meijer.mobile.android_acres_library.util.IconBadgeButton.<anonymous>.<anonymous> (ComposeUtils.kt:66)");
                }
                c.e(this.f19641a, this.f19642b, this.f19643c, this.f19644d, this.f19645e, composer, 0);
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

        a(Function0<Unit> function0, boolean z10, int i10, String str, int i11, long j10, long j11) {
            this.f19634a = function0;
            this.f19635b = z10;
            this.f19636c = i10;
            this.f19637d = str;
            this.f19638e = i11;
            this.f19639f = j10;
            this.f19640g = j11;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1892519254, i11, -1, "com.meijer.mobile.android_acres_library.util.IconBadgeButton.<anonymous> (ComposeUtils.kt:60)");
            }
            C17986y0.a(this.f19634a, androidx.compose.foundation.b.d(Modifier.INSTANCE, AdsTheme.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), this.f19635b, null, ComposableLambdaKt.c(2067135302, true, new C0327a(this.f19636c, this.f19637d, this.f19638e, this.f19639f, this.f19640g), composer, 54), composer, 24576, 8);
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
    @SourceDebugExtension
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19646a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19647b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f19648c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19649d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f19650e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f19651a = new a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mi.c$b$b, reason: collision with other inner class name */
        static final class C0328b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f19652a;

            C0328b(h hVar) {
                this.f19652a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), this.f19652a.getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f19652a.getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f19652a.getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f19652a.getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mi.c$b$c, reason: collision with other inner class name */
        static final class C0329c implements Function1<u, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0329c f19653a = new C0329c();

            public final void a(u clearAndSetSemantics) {
                Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }

            C0329c() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class d extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A f19654f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(A a10) {
                super(1);
                this.f19654f = a10;
            }

            public final void a(u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                C.a(semantics, this.f19654f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f19655f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f19656g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f19657h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f19658i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f19659j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f19660k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f19661l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f19662m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19663n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(n nVar, int i10, Function0 function0, int i11, String str, long j10, int i12, long j11, LocalThemeScope localThemeScope) {
                super(2);
                this.f19656g = nVar;
                this.f19657h = function0;
                this.f19658i = i11;
                this.f19659j = str;
                this.f19660k = j10;
                this.f19661l = i12;
                this.f19662m = j11;
                this.f19663n = localThemeScope;
                this.f19655f = i10;
            }

            public final void a(Composer composer, int i10) {
                int i11;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f19656g.getHelpersHashCode();
                this.f19656g.i();
                n nVar = this.f19656g;
                composer.startReplaceGroup(1805406219);
                n.b bVarM = nVar.m();
                h hVarA = bVarM.a();
                h hVarC = bVarM.c();
                Z0.c cVarC = C16190d.c(this.f19658i, composer, 0);
                String str = this.f19659j;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = a.f19651a;
                    composer.t(objB);
                }
                composer.P();
                float f10 = 24;
                C17988z0.a(cVarC, str, J.z(J.i(nVar.k(companion, hVarA, (Function1) objB), H1.h.p(f10)), H1.h.p(f10)), this.f19660k, composer, 0, 0);
                composer.startReplaceGroup(1997922206);
                if (this.f19661l >= 1) {
                    e.b bVarG = P0.e.INSTANCE.g();
                    C5658d.f fVarB = C5658d.f48555a.b();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion2.a()) {
                        objB2 = new C0328b(hVarA);
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierK = nVar.k(companion, hVarC, (Function1) objB2);
                    float f11 = 18;
                    Modifier modifierK2 = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.b.c(J.a(modifierK, H1.h.p(f11), H1.h.p(f11)), this.f19662m, C16692i.f()), H1.h.p((float) 3.5d), 0.0f, 2, null);
                    MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
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
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion3.e());
                    D1.c(composerA, interfaceC5742sR, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion3.f());
                    C14815g c14815g = C14815g.f139108a;
                    int i12 = this.f19661l;
                    String string = (i12 >= 100 ? "99+" : Integer.valueOf(i12)).toString();
                    int iA2 = j.INSTANCE.a();
                    TextStyle style = this.f19663n.getAdsTypography().getDetail().getOne().d(this.f19663n.getAdsColors().getAdsColorUIBackground01()).getStyle();
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion2.a()) {
                        objB3 = C0329c.f19653a;
                        composer.t(objB3);
                    }
                    composer.P();
                    i11 = helpersHashCode;
                    N1.b(string, C16705m.a(companion, (Function1) objB3), 0L, 0L, null, null, null, 0L, null, j.h(iA2), 0L, 0, false, 0, 0, null, style, composer, 0, 0, 65020);
                    composer.v();
                } else {
                    i11 = helpersHashCode;
                }
                composer.P();
                composer.P();
                if (this.f19656g.getHelpersHashCode() != i11) {
                    this.f19657h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(int i10, String str, long j10, int i11, long j11) {
            this.f19646a = i10;
            this.f19647b = str;
            this.f19648c = j10;
            this.f19649d = i11;
            this.f19650e = j11;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1907718426, i11, -1, "com.meijer.mobile.android_acres_library.util.IconWithBadge.<anonymous> (ComposeUtils.kt:130)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, AdsTheme.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null);
            int i12 = this.f19646a;
            String str = this.f19647b;
            long j10 = this.f19648c;
            int i13 = this.f19649d;
            long j11 = this.f19650e;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new A();
                composer.t(objB);
            }
            composer.U();
            A a10 = (A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new n();
                composer.t(objB2);
            }
            composer.U();
            n nVar = (n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierD, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 0, pairH.b(), i12, str, j10, i13, j11, AdsTheme)), pairH.a(), composer, 48, 0);
            composer.U();
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"UnsafeExperimentalUsageError"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r16, final java.lang.String r17, boolean r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final int r20, final long r21, final long r23, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mi.c.c(int, java.lang.String, boolean, kotlin.jvm.functions.Function0, int, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, String str, boolean z10, Function0 function0, int i11, long j10, long j11, int i12, int i13, Composer composer, int i14) {
        c(i10, str, z10, function0, i11, j10, j11, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    public static final void e(final int i10, final String str, final int i11, final long j10, final long j11, Composer composer, final int i12) {
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1099855477);
        if ((i12 & 6) == 0) {
            i13 = (composerStartRestartGroup.d(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= composerStartRestartGroup.d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= composerStartRestartGroup.e(j10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= composerStartRestartGroup.e(j11) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1099855477, i13, -1, "com.meijer.mobile.android_acres_library.util.IconWithBadge (ComposeUtils.kt:128)");
            }
            K.b(null, ComposableLambdaKt.c(1907718426, true, new b(i11, str, j10, i10, j11), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mi.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.f(i10, str, i11, j10, j11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10, String str, int i11, long j10, long j11, int i12, Composer composer, int i13) {
        e(i10, str, i11, j10, j11, composer, J0.a(i12 | 1));
        return Unit.f142422a;
    }
}
