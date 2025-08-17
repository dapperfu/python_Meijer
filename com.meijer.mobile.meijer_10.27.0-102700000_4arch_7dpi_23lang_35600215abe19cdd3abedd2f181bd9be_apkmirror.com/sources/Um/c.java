package Um;

import L1.A;
import L1.C;
import L1.C4039g;
import L1.h;
import L1.l;
import L1.n;
import L1.v;
import L1.x;
import P0.e;
import Vm.e;
import Wm.i;
import Ym.f;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
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
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.find.filter.k;
import com.meijer.mobile.meijer.activity.find.filter.o;
import j0.C14815g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16705m;
import r1.u;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "state", "", "darkTheme", "Landroidx/compose/ui/Modifier;", "modifier", "", "c", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/k;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "bodyContent", "bottomContent", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f36179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f36180b;

        a(o oVar, k kVar) {
            this.f36179a = oVar;
            this.f36180b = kVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(986057117, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.FilterLayout.<anonymous> (FilterLayout.kt:35)");
            }
            f.e(this.f36179a, this.f36180b, composer, 0);
            k kVar = this.f36180b;
            if (kVar instanceof k.SortAndFilterPageState) {
                i.i(this.f36179a, (k.SortAndFilterPageState) kVar, composer, 0);
            } else if (!(kVar instanceof k.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f36181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f36182b;

        b(o oVar, k kVar) {
            this.f36181a = oVar;
            this.f36182b = kVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(570730300, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.FilterLayout.<anonymous> (FilterLayout.kt:51)");
            }
            e.d(this.f36181a, this.f36182b, composer, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Um.c$c, reason: collision with other inner class name */
    static final class C0794c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f36183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f36184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f36185c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Um.c$c$a */
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f36186a;

            a(h hVar) {
                this.f36186a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f36186a.getTop(), 0.0f, 0.0f, 6, null);
                constrainAs.p(v.INSTANCE.c());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Um.c$c$b */
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f36187a;

            b(h hVar) {
                this.f36187a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f36187a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Um.c$c$c, reason: collision with other inner class name */
        public static final class C0795c extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A f36188f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0795c(A a10) {
                super(1);
                this.f36188f = a10;
            }

            public final void a(u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                C.a(semantics, this.f36188f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Um.c$c$d */
        public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f36189f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f36190g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f36191h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function2 f36192i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function2 f36193j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n nVar, int i10, Function0 function0, Function2 function2, Function2 function22) {
                super(2);
                this.f36190g = nVar;
                this.f36191h = function0;
                this.f36192i = function2;
                this.f36193j = function22;
                this.f36189f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f36190g.getHelpersHashCode();
                this.f36190g.i();
                n nVar = this.f36190g;
                composer.startReplaceGroup(712459857);
                n.b bVarM = nVar.m();
                h hVarA = bVarM.a();
                h hVarC = bVarM.c();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarA);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(hVarA);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(J.d(nVar.k(companion, hVarC, (Function1) objB), 0.0f, 1, null));
                C5658d.m mVarH = C5658d.f48555a.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierFsUnmask);
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
                this.f36192i.invoke(composer, 0);
                composer.v();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(hVarC);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(hVarC);
                    composer.t(objB2);
                }
                composer.P();
                Modifier modifierFsUnmask2 = FullStoryAnnotationsKt.fsUnmask(nVar.k(companion, hVarA, (Function1) objB2));
                MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierFsUnmask2);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyG, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C5664j c5664j = C5664j.f48612a;
                this.f36193j.invoke(composer, 0);
                composer.v();
                composer.P();
                if (this.f36190g.getHelpersHashCode() != helpersHashCode) {
                    this.f36191h.invoke();
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
                ComposerKt.U(-971453854, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.StatelessFilterLayout.<anonymous> (FilterLayout.kt:66)");
            }
            Modifier modifier = this.f36183a;
            Function2<Composer, Integer, Unit> function2 = this.f36184b;
            Function2<Composer, Integer, Unit> function22 = this.f36185c;
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
            androidx.compose.ui.layout.A.a(C16705m.d(modifier, false, new C0795c(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new d(nVar, 0, pairH.b(), function2, function22)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C0794c(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            this.f36183a = modifier;
            this.f36184b = function2;
            this.f36185c = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.meijer.mobile.meijer.activity.find.filter.o r13, final com.meijer.mobile.meijer.activity.find.filter.k r14, final boolean r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Um.c.c(com.meijer.mobile.meijer.activity.find.filter.o, com.meijer.mobile.meijer.activity.find.filter.k, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(o oVar, k kVar, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c(oVar, kVar, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void e(final Function2<? super Composer, ? super Integer, Unit> bodyContent, final Function2<? super Composer, ? super Integer, Unit> bottomContent, final boolean z10, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(bodyContent, "bodyContent");
        Intrinsics.j(bottomContent, "bottomContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-477190275);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.D(bodyContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(bottomContent) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-477190275, i12, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.StatelessFilterLayout (FilterLayout.kt:64)");
            }
            Ej.b.INSTANCE.b(z10, ComposableLambdaKt.c(-971453854, true, new C0794c(modifier, bodyContent, bottomContent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 6) & 14) | 432, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Um.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.f(bodyContent, bottomContent, z10, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, Function2 function22, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(function2, function22, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
