package os;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import d0.C13457y;
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
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class f0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f155167f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f155167f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f155167f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155168f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155169g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155170h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155171i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope) {
            super(2);
            this.f155169g = nVar;
            this.f155170h = function0;
            this.f155171i = localThemeScope;
            this.f155168f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155169g.getHelpersHashCode();
            this.f155169g.i();
            L1.n nVar = this.f155169g;
            composer.startReplaceGroup(-446715590);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f155171i.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(hVarC);
                composer.t(objB);
            }
            composer.P();
            C5662h.a(nVar.k(modifierD, hVarD, (Function1) objB), composer, 0);
            Modifier modifierV = androidx.compose.foundation.layout.J.v(androidx.compose.foundation.b.d(T0.e.a(companion, C16692i.f()), this.f155171i.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), H1.h.p(70));
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new d(hVarA);
                composer.t(objB2);
            }
            composer.P();
            C5662h.a(nVar.k(modifierV, hVarC, (Function1) objB2), composer, 0);
            Z0.c cVarC = C16190d.c(ns.s.f152683o, composer, 0);
            String strC = C16193g.c(ns.u.f152696L, composer, 0);
            InterfaceC5784k interfaceC5784kC = InterfaceC5784k.INSTANCE.c();
            Modifier modifierI = androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.D.m(companion, this.f155171i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, this.f155171i.getAdsSpacing().getFour().getDp(), 6, null), H1.h.p(75));
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB3 == companion2.a()) {
                objB3 = e.f155174a;
                composer.t(objB3);
            }
            composer.P();
            C13457y.a(cVarC, strC, nVar.k(modifierI, hVarA, (Function1) objB3), null, interfaceC5784kC, 0.0f, null, composer, 24576, 104);
            LocalThemeScope localThemeScope = this.f155171i;
            Ji.I two = localThemeScope.getAdsTypography().getValues().getTwo();
            int iA = F1.j.INSTANCE.a();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = f.f155175a;
                composer.t(objB4);
            }
            composer.P();
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(C16705m.d(companion, false, (Function1) objB4, 1, null), this.f155171i.getAdsSpacing().getTen().getDp(), this.f155171i.getAdsSpacing().getTwo().getDp());
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(hVarC);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new g(hVarC);
                composer.t(objB5);
            }
            composer.P();
            ri.j.h(localThemeScope, new q1.Label(nVar.k(modifierJ, hVarE, (Function1) objB5), null, null, F1.j.h(iA), 0, false, 0, two, null, 374, null), C16193g.c(ns.u.f152695K, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            composer.P();
            if (this.f155169g.getHelpersHashCode() != helpersHashCode) {
                this.f155170h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155172a;

        c(L1.h hVar) {
            this.f155172a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f155172a.getBottom(), H1.h.p(35), 0.0f, 4, null);
            v.Companion companion = L1.v.INSTANCE;
            constrainAs.p(companion.a());
            constrainAs.r(companion.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155173a;

        d(L1.h hVar) {
            this.f155173a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f155173a.getBottom(), 0.0f, 0.0f, 6, null);
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f155174a = new e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<r1.u, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f155175a = new f();

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155176a;

        g(L1.h hVar) {
            this.f155176a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155176a.getBottom(), 0.0f, 0.0f, 6, null);
            C4039g.c(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.f0.b(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
