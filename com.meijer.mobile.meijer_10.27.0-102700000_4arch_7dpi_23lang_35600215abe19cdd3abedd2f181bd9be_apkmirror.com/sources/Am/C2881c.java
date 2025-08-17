package Am;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "cardMainText", "subText", "Lkotlin/Function0;", "", "onCardClicked", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Am.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2881c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Am.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f907c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Am.c$a$a, reason: collision with other inner class name */
        static final class C0021a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f908a;

            C0021a(L1.h hVar) {
                this.f908a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f908a.getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Am.c$a$b */
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f909a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f910b;

            b(L1.h hVar, L1.h hVar2) {
                this.f909a = hVar;
                this.f910b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f909a.getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f910b.getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Am.c$a$c, reason: collision with other inner class name */
        static final class C0022c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f912b;

            C0022c(L1.h hVar, String str) {
                this.f911a = hVar;
                this.f912b = str;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f911a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f911a.getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.q(this.f912b.length() > 0 ? L1.G.INSTANCE.c() : L1.G.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Am.c$a$d */
        public static final class d extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f913f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(L1.A a10) {
                super(1);
                this.f913f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f913f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Am.c$a$e */
        public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f914f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f915g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f916h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f917i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f918j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f919k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, String str, String str2) {
                super(2);
                this.f915g = nVar;
                this.f916h = function0;
                this.f917i = localThemeScope;
                this.f918j = str;
                this.f919k = str2;
                this.f914f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f915g.getHelpersHashCode();
                this.f915g.i();
                L1.n nVar = this.f915g;
                composer.startReplaceGroup(1778483991);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                LocalThemeScope localThemeScope = this.f917i;
                C.a.C0245a c0245a = C.a.C0245a.f15333e;
                Ji.T adsColorBrandPrimary = localThemeScope.getAdsColors().getAdsColorBrandPrimary();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(32), 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C0021a(hVarC);
                    composer.t(objB);
                }
                composer.P();
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(c0245a, null, null, null, 0.0f, adsColorBrandPrimary, nVar.k(modifierM, hVarA, (Function1) objB), 30, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                LocalThemeScope localThemeScope2 = this.f917i;
                Ji.I seven = localThemeScope2.getAdsTypography().getHeadings().getSeven();
                Ji.T adsColorBrandPrimary2 = this.f917i.getAdsColors().getAdsColorBrandPrimary();
                float f10 = 8;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarD) | composer.V(hVarA);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(hVarD, hVarA);
                    composer.t(objB2);
                }
                composer.P();
                q1.Label label = new q1.Label(nVar.k(modifierM2, hVarC, (Function1) objB2), adsColorBrandPrimary2, null, null, 0, false, 0, seven, null, 380, null);
                String str = this.f918j;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope2, label, str, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope3 = this.f917i;
                Ji.I two = localThemeScope3.getAdsTypography().getBodyCompact().getTwo();
                Ji.T adsColorText02 = this.f917i.getAdsColors().getAdsColorText02();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV3 = composer.V(hVarC) | composer.V(this.f919k);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new C0022c(hVarC, this.f919k);
                    composer.t(objB3);
                }
                composer.P();
                ri.j.h(localThemeScope3, new q1.Label(nVar.k(modifierM3, hVarD, (Function1) objB3), adsColorText02, null, null, 0, false, 0, two, null, 380, null), this.f919k, null, composer, i11 | (i12 << 3), 4);
                composer.P();
                if (this.f915g.getHelpersHashCode() != helpersHashCode) {
                    this.f916h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-187627164, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.AddCardSection.<anonymous> (AddCardSection.kt:45)");
            }
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
            LocalThemeScope localThemeScope = this.f905a;
            String str = this.f906b;
            String str2 = this.f907c;
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
            androidx.compose.ui.layout.A.a(C16705m.d(modifierM, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 6, pairH.b(), localThemeScope, str, str2)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, String str, String str2) {
            this.f905a = localThemeScope;
            this.f906b = str;
            this.f907c = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, java.lang.String r29, java.lang.String r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.C2881c.c(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, str, str2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
