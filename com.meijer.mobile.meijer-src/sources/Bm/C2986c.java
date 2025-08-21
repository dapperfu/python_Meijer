package Bm;

import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
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
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "cardMainText", "subText", "Lkotlin/Function0;", "", "onCardClicked", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Bm.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2986c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bm.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3364b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3365c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.c$a$a, reason: collision with other inner class name */
        static final class C0072a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f3366a;

            C0072a(L1.h hVar) {
                this.f3366a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f3366a.getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.c$a$b */
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f3367a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f3368b;

            b(L1.h hVar, L1.h hVar2) {
                this.f3367a = hVar;
                this.f3368b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f3367a.getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f3368b.getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.c$a$c, reason: collision with other inner class name */
        static final class C0073c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f3369a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3370b;

            C0073c(L1.h hVar, String str) {
                this.f3369a = hVar;
                this.f3370b = str;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f3369a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f3369a.getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.q(this.f3370b.length() > 0 ? L1.G.INSTANCE.c() : L1.G.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.c$a$d */
        public static final class d extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f3371f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(L1.A a10) {
                super(1);
                this.f3371f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f3371f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bm.c$a$e */
        public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f3372f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f3373g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f3374h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3375i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f3376j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f3377k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, String str, String str2) {
                super(2);
                this.f3373g = nVar;
                this.f3374h = function0;
                this.f3375i = localThemeScope;
                this.f3376j = str;
                this.f3377k = str2;
                this.f3372f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f3373g.getHelpersHashCode();
                this.f3373g.i();
                L1.n nVar = this.f3373g;
                composer.startReplaceGroup(1778483991);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                LocalThemeScope localThemeScope = this.f3375i;
                C.a.C0287a c0287a = C.a.C0287a.f16877e;
                Ki.T adsColorBrandPrimary = localThemeScope.getAdsColors().getAdsColorBrandPrimary();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(32), 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C0072a(hVarC);
                    composer.t(objB);
                }
                composer.P();
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(c0287a, null, null, null, 0.0f, adsColorBrandPrimary, nVar.k(modifierM, hVarA, (Function1) objB), 30, null);
                int i11 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                LocalThemeScope localThemeScope2 = this.f3375i;
                Ki.I seven = localThemeScope2.getAdsTypography().getHeadings().getSeven();
                Ki.T adsColorBrandPrimary2 = this.f3375i.getAdsColors().getAdsColorBrandPrimary();
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
                String str = this.f3376j;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope2, label, str, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope3 = this.f3375i;
                Ki.I two = localThemeScope3.getAdsTypography().getBodyCompact().getTwo();
                Ki.T adsColorText02 = this.f3375i.getAdsColors().getAdsColorText02();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV3 = composer.V(hVarC) | composer.V(this.f3377k);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new C0073c(hVarC, this.f3377k);
                    composer.t(objB3);
                }
                composer.P();
                si.j.h(localThemeScope3, new q1.Label(nVar.k(modifierM3, hVarD, (Function1) objB3), adsColorText02, null, null, 0, false, 0, two, null, 380, null), this.f3377k, null, composer, i11 | (i12 << 3), 4);
                composer.P();
                if (this.f3373g.getHelpersHashCode() != helpersHashCode) {
                    this.f3374h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
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
            LocalThemeScope localThemeScope = this.f3363a;
            String str = this.f3364b;
            String str2 = this.f3365c;
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
            androidx.compose.ui.layout.A.a(C16819m.d(modifierM, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new e(nVar, 6, pairH.b(), localThemeScope, str, str2)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, String str, String str2) {
            this.f3363a = localThemeScope;
            this.f3364b = str;
            this.f3365c = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void c(final Ki.LocalThemeScope r27, androidx.compose.ui.Modifier r28, java.lang.String r29, java.lang.String r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.C2986c.c(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, str, str2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
