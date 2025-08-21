package gq;

import Ki.LocalThemeScope;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import e.C13735c;
import e.C13738f;
import e.C13741i;
import eq.p0;
import g.C14274a;
import h.C14433g;
import hq.AbstractC14566a;
import hq.AbstractC14567b;
import java.util.Map;
import ki.R0;
import ki.q1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kq.s;
import p1.C16338g;
import r1.C16819m;
import r1.u;
import ti.C17265b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/h;", "decorator", "Lkotlin/Function1;", "Lkq/s$a;", "", "sendAction", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhq/a;", "Lkotlin/Function0;", "positiveAction", "negativeAction", "onDismiss", "o", "(LKi/M;Lhq/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Intent;", "appSettingsIntent", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f134403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14566a f134405c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134406d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134407e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: gq.o$a$a, reason: collision with other inner class name */
        static final class C2126a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f134408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC14566a f134409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f134410c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f134411d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: gq.o$a$a$a, reason: collision with other inner class name */
            static final class C2127a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2127a f134412a = new C2127a();

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), H1.h.p(8), 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }

                C2127a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: gq.o$a$a$b */
            static final class b implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f134413a;

                b(L1.h hVar) {
                    this.f134413a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f134413a.getBottom(), H1.h.p(16), 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: gq.o$a$a$c */
            static final class c implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f134414a;

                c(L1.h hVar) {
                    this.f134414a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f134414a.getBottom(), H1.h.p(32), 0.0f, 4, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), H1.h.p(8), 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: gq.o$a$a$d */
            static final class d implements Function0<Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f134415a;

                d(Function0<Unit> function0) {
                    this.f134415a = function0;
                }

                public final void a() {
                    Function0<Unit> function0 = this.f134415a;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: gq.o$a$a$e */
            static final class e implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f134416a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L1.h f134417b;

                e(L1.h hVar, L1.h hVar2) {
                    this.f134416a = hVar;
                    this.f134417b = hVar2;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), this.f134416a.getBottom(), H1.h.p(32), 0.0f, 4, null);
                    D.a.a(constrainAs.getEnd(), this.f134417b.getStart(), H1.h.p(20), 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: gq.o$a$a$f */
            public static final class f extends Lambda implements Function1<u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ A f134418f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(A a10) {
                    super(1);
                    this.f134418f = a10;
                }

                public final void a(u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    C.a(semantics, this.f134418f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                    a(uVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: gq.o$a$a$g */
            public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f134419f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f134420g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f134421h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f134422i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ AbstractC14566a f134423j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ Function0 f134424k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function0 f134425l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AbstractC14566a abstractC14566a, Function0 function02, Function0 function03) {
                    super(2);
                    this.f134420g = nVar;
                    this.f134421h = function0;
                    this.f134422i = localThemeScope;
                    this.f134423j = abstractC14566a;
                    this.f134424k = function02;
                    this.f134425l = function03;
                    this.f134419f = i10;
                }

                public final void a(Composer composer, int i10) {
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f134420g.getHelpersHashCode();
                    this.f134420g.i();
                    L1.n nVar = this.f134420g;
                    composer.startReplaceGroup(-421789060);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    L1.h hVarD = bVarM.d();
                    L1.h hVarE = bVarM.e();
                    LocalThemeScope localThemeScope = this.f134422i;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C2127a.f134412a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(nVar.k(companion, hVarA, (Function1) objB), null, null, null, 0, false, 0, this.f134422i.getAdsTypography().getHeadings().getSix(), null, 382, null);
                    String strC = C16338g.c(this.f134423j.getTitle(), composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f134422i;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion2.a()) {
                        objB2 = new b(hVarA);
                        composer.t(objB2);
                    }
                    composer.P();
                    si.j.h(localThemeScope2, new q1.Label(nVar.k(companion, hVarC, (Function1) objB2), null, null, null, 0, false, 0, this.f134422i.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C16338g.c(this.f134423j.getDescription(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope3 = this.f134422i;
                    Modifier modifierD = ClickableKt.d(companion, false, null, null, this.f134424k, 7, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarC);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion2.a()) {
                        objB3 = new c(hVarC);
                        composer.t(objB3);
                    }
                    composer.P();
                    si.j.h(localThemeScope3, new q1.Label(nVar.k(modifierD, hVarD, (Function1) objB3), this.f134422i.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f134422i.getAdsTypography().getHeadings().getSeven(), null, 380, null), C16338g.c(this.f134423j.getPositiveButtonText(), composer, 0), null, composer, i11 | (i12 << 3), 4);
                    Integer negativeButtonText = this.f134423j.getNegativeButtonText();
                    composer.startReplaceGroup(1926107143);
                    if (negativeButtonText != null) {
                        int iIntValue = negativeButtonText.intValue();
                        LocalThemeScope localThemeScope4 = this.f134422i;
                        composer.startReplaceGroup(5004770);
                        boolean zV3 = composer.V(this.f134425l);
                        Object objB4 = composer.B();
                        if (zV3 || objB4 == companion2.a()) {
                            objB4 = new d(this.f134425l);
                            composer.t(objB4);
                        }
                        composer.P();
                        Modifier modifierD2 = ClickableKt.d(companion, false, null, null, (Function0) objB4, 7, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zV4 = composer.V(hVarC) | composer.V(hVarD);
                        Object objB5 = composer.B();
                        if (zV4 || objB5 == companion2.a()) {
                            objB5 = new e(hVarC, hVarD);
                            composer.t(objB5);
                        }
                        composer.P();
                        si.j.h(localThemeScope4, new q1.Label(nVar.k(modifierD2, hVarE, (Function1) objB5), this.f134422i.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f134422i.getAdsTypography().getHeadings().getSeven(), null, 380, null), C16338g.c(iIntValue, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    }
                    composer.P();
                    composer.P();
                    if (this.f134420g.getHelpersHashCode() != helpersHashCode) {
                        this.f134421h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C2126a(LocalThemeScope localThemeScope, AbstractC14566a abstractC14566a, Function0<Unit> function0, Function0<Unit> function02) {
                this.f134408a = localThemeScope;
                this.f134409b = abstractC14566a;
                this.f134410c = function0;
                this.f134411d = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1468452392, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.modal.ShopAndScanErrorModal.<anonymous>.<anonymous> (ShopAndScanModalComponent.kt:150)");
                }
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, H1.h.p(24), H1.h.p(16));
                LocalThemeScope localThemeScope = this.f134408a;
                AbstractC14566a abstractC14566a = this.f134409b;
                Function0<Unit> function0 = this.f134410c;
                Function0<Unit> function02 = this.f134411d;
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
                androidx.compose.ui.layout.A.a(C16819m.d(modifierJ, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 0, pairH.b(), localThemeScope, abstractC14566a, function0, function02)), pairH.a(), composer, 48, 0);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC14566a abstractC14566a, Function0<Unit> function02, Function0<Unit> function03) {
            this.f134403a = localThemeScope;
            this.f134404b = function0;
            this.f134405c = abstractC14566a;
            this.f134406d = function02;
            this.f134407e = function03;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-807489045, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.modal.ShopAndScanErrorModal.<anonymous> (ShopAndScanModalComponent.kt:144)");
            }
            C17265b.b(this.f134403a, q1.ModalTemplate.y(Assemble.getModalTemplate(), androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(16), 0.0f, 2, null), null, 0.0f, 6, null), this.f134404b, null, ComposableLambdaKt.c(-1468452392, true, new C2126a(this.f134403a, this.f134405c, this.f134406d, this.f134407e), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, hq.h hVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, hVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(s.a.C2282a.f148589a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1, Map map) {
        Intrinsics.j(map, "<unused var>");
        function1.invoke(s.a.b.f148590a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(C13741i c13741i) {
        c13741i.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(final Ki.LocalThemeScope r14, final hq.AbstractC14566a r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.o.o(Ki.M, hq.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, AbstractC14566a abstractC14566a, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, abstractC14566a, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void s(final LocalThemeScope localThemeScope, Modifier modifier, final hq.h hVar, final Function1<? super s.a, Unit> sendAction, Composer composer, final int i10, final int i11) {
        int i12;
        boolean z10;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sendAction, "sendAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-140300178);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(hVar) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(sendAction) ? 2048 : 1024;
        }
        if ((i12 & 1155) == 1154 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-140300178, i12, -1, "com.meijer.mobile.shopandscan.presentation.component.modal.ShopAndScanModal (ShopAndScanModalComponent.kt:43)");
            }
            final Activity activity = (Activity) composerStartRestartGroup.o(C13738f.a());
            if (Intrinsics.e(hVar, AbstractC14566a.C2154a.f136069e) || Intrinsics.e(hVar, AbstractC14566a.b.f136070e) || Intrinsics.e(hVar, AbstractC14566a.c.f136071e) || Intrinsics.e(hVar, AbstractC14566a.d.f136072e) || Intrinsics.e(hVar, AbstractC14566a.e.f136073e) || Intrinsics.e(hVar, AbstractC14566a.f.f136074e) || Intrinsics.e(hVar, AbstractC14566a.g.f136075e) || Intrinsics.e(hVar, AbstractC14566a.h.f136076e)) {
                composerStartRestartGroup.startReplaceGroup(-678715686);
                Intrinsics.h(hVar, "null cannot be cast to non-null type com.meijer.mobile.shopandscan.presentation.decorator.ErrorModalDecorator");
                AbstractC14566a abstractC14566a = (AbstractC14566a) hVar;
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i13 = i12 & 7168;
                boolean z11 = i13 == 2048;
                Object objB = composerStartRestartGroup.B();
                if (z11 || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: gq.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.t(sendAction);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z10 = i13 == 2048;
                Object objB2 = composerStartRestartGroup.B();
                if (z10 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: gq.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.B(sendAction);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                o(localThemeScope, abstractC14566a, function0, (Function0) objB2, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 8);
                composerStartRestartGroup.P();
            } else if (Intrinsics.e(hVar, AbstractC14566a.i.f136077e)) {
                composerStartRestartGroup.startReplaceGroup(-678358101);
                Intrinsics.h(hVar, "null cannot be cast to non-null type com.meijer.mobile.shopandscan.presentation.decorator.ErrorModalDecorator");
                AbstractC14566a abstractC14566a2 = (AbstractC14566a) hVar;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD = composerStartRestartGroup.D(activity);
                Object objB3 = composerStartRestartGroup.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: gq.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.C(activity);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                composerStartRestartGroup.P();
                o(localThemeScope, abstractC14566a2, null, (Function0) objB3, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 10);
                composerStartRestartGroup.P();
            } else if (Intrinsics.e(hVar, AbstractC14567b.a.f136083f)) {
                composerStartRestartGroup.startReplaceGroup(-678073862);
                C14433g c14433g = new C14433g();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i14 = i12 & 7168;
                boolean z12 = i14 == 2048;
                Object objB4 = composerStartRestartGroup.B();
                if (z12 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function1() { // from class: gq.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return o.D(sendAction, (Map) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB4);
                }
                composerStartRestartGroup.P();
                final C13741i c13741iA = C13735c.a(c14433g, (Function1) objB4, composerStartRestartGroup, 0);
                Intrinsics.h(hVar, "null cannot be cast to non-null type com.meijer.mobile.shopandscan.presentation.decorator.PermissionModalDecorator");
                AbstractC14567b abstractC14567b = (AbstractC14567b) hVar;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD2 = composerStartRestartGroup.D(c13741iA);
                Object objB5 = composerStartRestartGroup.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function0() { // from class: gq.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.E(c13741iA);
                        }
                    };
                    composerStartRestartGroup.t(objB5);
                }
                Function0 function02 = (Function0) objB5;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z10 = i14 == 2048;
                Object objB6 = composerStartRestartGroup.B();
                if (z10 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: gq.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.u(sendAction);
                        }
                    };
                    composerStartRestartGroup.t(objB6);
                }
                composerStartRestartGroup.P();
                p0.e(localThemeScope, abstractC14567b, function02, (Function0) objB6, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 8);
                composerStartRestartGroup.P();
            } else if (Intrinsics.e(hVar, AbstractC14567b.C2155b.f136084f)) {
                composerStartRestartGroup.startReplaceGroup(-677168817);
                final Activity activity2 = (Activity) composerStartRestartGroup.o(C13738f.a());
                h.i iVar = new h.i();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i15 = i12 & 7168;
                boolean z13 = i15 == 2048;
                Object objB7 = composerStartRestartGroup.B();
                if (z13 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: gq.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return o.v(sendAction, (C14274a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB7);
                }
                composerStartRestartGroup.P();
                final C13741i c13741iA2 = C13735c.a(iVar, (Function1) objB7, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD3 = composerStartRestartGroup.D(activity2);
                Object objB8 = composerStartRestartGroup.B();
                if (zD3 || objB8 == Composer.INSTANCE.a()) {
                    objB8 = new Function0() { // from class: gq.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.w(activity2);
                        }
                    };
                    composerStartRestartGroup.t(objB8);
                }
                composerStartRestartGroup.P();
                final Lazy lazyB = LazyKt.b((Function0) objB8);
                Intrinsics.h(hVar, "null cannot be cast to non-null type com.meijer.mobile.shopandscan.presentation.decorator.PermissionModalDecorator");
                AbstractC14567b abstractC14567b2 = (AbstractC14567b) hVar;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD4 = composerStartRestartGroup.D(c13741iA2) | composerStartRestartGroup.D(lazyB);
                Object objB9 = composerStartRestartGroup.B();
                if (zD4 || objB9 == Composer.INSTANCE.a()) {
                    objB9 = new Function0() { // from class: gq.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.y(c13741iA2, lazyB);
                        }
                    };
                    composerStartRestartGroup.t(objB9);
                }
                Function0 function03 = (Function0) objB9;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z10 = i15 == 2048;
                Object objB10 = composerStartRestartGroup.B();
                if (z10 || objB10 == Composer.INSTANCE.a()) {
                    objB10 = new Function0() { // from class: gq.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.z(sendAction);
                        }
                    };
                    composerStartRestartGroup.t(objB10);
                }
                composerStartRestartGroup.P();
                p0.e(localThemeScope, abstractC14567b2, function03, (Function0) objB10, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 8);
                composerStartRestartGroup.P();
            } else {
                if (hVar != null) {
                    composerStartRestartGroup.startReplaceGroup(-1684472822);
                    composerStartRestartGroup.P();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-675975875);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: gq.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.A(localThemeScope, modifier2, hVar, sendAction, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1) {
        function1.invoke(s.a.b.f148590a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(s.a.C2282a.f148589a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, C14274a it) {
        Intrinsics.j(it, "it");
        function1.invoke(s.a.b.f148590a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent w(Activity activity) {
        Intent intent = new Intent();
        intent.setData(Uri.fromParts("package", activity != null ? activity.getPackageName() : null, null));
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(270532608);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(s.a.C2282a.f148589a);
        return Unit.f143329a;
    }

    private static final Intent x(Lazy<? extends Intent> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(C13741i c13741i, Lazy lazy) {
        c13741i.a(x(lazy));
        return Unit.f143329a;
    }
}
