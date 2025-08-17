package Cq;

import Bq.a;
import Bq.b;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.n;
import L1.x;
import Oj.a;
import P0.e;
import Pq.h;
import V0.C5346q0;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import ck.C6408b;
import j0.C14808Q;
import j0.C14815g;
import j0.InterfaceC14806O;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import yr.C18294u;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0015\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LJi/M;", "LPq/h$h;", "state", "Landroidx/compose/runtime/l0;", "", "isSearchFocused", "isInEditMode", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFq/c;", "", "onItemSearchIconClicked", "LPq/h$e;", "onAction", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LJi/M;LPq/h$h;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class W {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f4614f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f4614f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f4614f);
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
        final /* synthetic */ int f4615f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f4616g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f4617h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f4618i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f4619j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f4620k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f4621l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4622m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f4623n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f4624o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f4625p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1 f4626q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f4627r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, h.ShoppingListState shoppingListState, Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, Function1 function12, boolean z10, boolean z11, Function1 function13, Function1 function14) {
            super(2);
            this.f4616g = nVar;
            this.f4617h = function0;
            this.f4618i = shoppingListState;
            this.f4619j = function1;
            this.f4620k = interfaceC5730l0;
            this.f4621l = interfaceC5730l02;
            this.f4622m = localThemeScope;
            this.f4623n = function12;
            this.f4624o = z10;
            this.f4625p = z11;
            this.f4626q = function13;
            this.f4627r = function14;
            this.f4615f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            Modifier.Companion companion;
            InterfaceC5772o interfaceC5772o;
            Composer composer2;
            int i12;
            Modifier.Companion companion2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f4616g.getHelpersHashCode();
            this.f4616g.i();
            L1.n nVar = this.f4616g;
            composer.startReplaceGroup(-2132169164);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            InterfaceC5772o interfaceC5772o2 = (InterfaceC5772o) composer.o(C5892t0.h());
            androidx.compose.ui.focus.y yVar = new androidx.compose.ui.focus.y();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = c.f4628a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion3, hVarA, (Function1) objB);
            e.Companion companion5 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion5.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5811g.Companion companion6 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion6.a();
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
            D1.c(composerA, measurePolicyG, companion6.e());
            D1.c(composerA, interfaceC5742sR, companion6.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion6.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion6.f());
            C5664j c5664j = C5664j.f48612a;
            String searchTerm = this.f4618i.getSearchTerm();
            Modifier modifierA = androidx.compose.ui.focus.A.a(companion3, yVar);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f4619j) | composer.V(this.f4620k) | composer.V(this.f4621l);
            Object objB2 = composer.B();
            if (zV || objB2 == companion4.a()) {
                objB2 = new d(this.f4619j, this.f4620k, this.f4621l);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA2 = C5761d.a(modifierA, (Function1) objB2);
            LocalThemeScope localThemeScope = this.f4622m;
            Function1 function1 = this.f4623n;
            Function1 function12 = this.f4619j;
            int i13 = LocalThemeScope.f15770g;
            C3066x.g(localThemeScope, modifierA2, searchTerm, function1, function12, composer, i13, 0);
            composer.v();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion4.a()) {
                objB3 = new e(hVarA);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion3, hVarC, (Function1) objB3);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion5.o(), false);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
            Function0<InterfaceC5811g> function0A2 = companion6.a();
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
            D1.c(composerA2, measurePolicyG2, companion6.e());
            D1.c(composerA2, interfaceC5742sR2, companion6.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion6.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion6.f());
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), companion5.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion3);
            Function0<InterfaceC5811g> function0A3 = companion6.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA, companion6.e());
            D1.c(composerA3, interfaceC5742sR3, companion6.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion6.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion6.f());
            C14815g c14815g = C14815g.f139108a;
            C17917Z.a(null, this.f4622m.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            if (this.f4618i.getLoadingState() instanceof a.Loading) {
                composer.startReplaceGroup(-47928569);
                LocalThemeScope localThemeScope2 = this.f4622m;
                Ji.Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(1345343038, true, new f(this.f4618i, localThemeScope2), composer, 54), composer, i13 | 384 | (Q0.b.f139712b << 3));
                composer.P();
                i11 = helpersHashCode;
                i12 = i13;
                composer2 = composer;
                interfaceC5772o = interfaceC5772o2;
                companion = companion3;
            } else {
                if (this.f4618i.getLoadingState() instanceof a.Failed) {
                    composer.startReplaceGroup(-47019122);
                    String strC = C16193g.c(Aq.b.f1503x, composer, 0);
                    String strC2 = C16193g.c(Aq.b.f1502w, composer, 0);
                    String strC3 = C16193g.c(Aq.b.f1504y, composer, 0);
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, 0.0f, C14808Q.e(j0.W.c(InterfaceC14806O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null);
                    companion2 = companion3;
                    LocalThemeScope localThemeScope3 = this.f4622m;
                    composer.startReplaceGroup(5004770);
                    boolean zV3 = composer.V(this.f4623n);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion4.a()) {
                        objB4 = new g(this.f4623n);
                        composer.t(objB4);
                    }
                    composer.P();
                    C18294u.c(localThemeScope3, strC, strC2, strC3, modifierM, (Function0) objB4, composer, i13, 0);
                    composer.P();
                    i11 = helpersHashCode;
                    composer2 = composer;
                    i12 = i13;
                } else if (this.f4618i.h()) {
                    composer.startReplaceGroup(-46268767);
                    String strC4 = C16193g.c(Aq.b.f1492m, composer, 0);
                    String strC5 = C16193g.c(Aq.b.f1471P, composer, 0);
                    String strC6 = C16193g.c(Aq.b.f1476U, composer, 0);
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, 0.0f, C14808Q.e(j0.W.c(InterfaceC14806O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null);
                    LocalThemeScope localThemeScope4 = this.f4622m;
                    composer.startReplaceGroup(5004770);
                    boolean zV4 = composer.V(yVar);
                    Object objB5 = composer.B();
                    if (zV4 || objB5 == companion4.a()) {
                        objB5 = new h(yVar);
                        composer.t(objB5);
                    }
                    composer.P();
                    companion2 = companion3;
                    C18294u.c(localThemeScope4, strC4, strC5, strC6, modifierM2, (Function0) objB5, composer, i13, 0);
                    composer2 = composer;
                    i12 = i13;
                    composer2.P();
                    i11 = helpersHashCode;
                } else {
                    composer.startReplaceGroup(-45573561);
                    i11 = helpersHashCode;
                    companion = companion3;
                    interfaceC5772o = interfaceC5772o2;
                    Dq.q.g(this.f4622m, null, this.f4618i.d(), this.f4618i.c(), this.f4618i.getIsListMoving(), this.f4620k, this.f4624o, this.f4625p, this.f4626q, this.f4627r, this.f4623n, composer, i13, 0, 1);
                    composer2 = composer;
                    i12 = i13;
                    composer2.P();
                }
                interfaceC5772o = interfaceC5772o2;
                companion = companion2;
            }
            composer2.v();
            composer2.startReplaceGroup(474718493);
            if (((Boolean) this.f4621l.getValue()).booleanValue()) {
                Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), C5346q0.q(C5346q0.INSTANCE.a(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceGroup(5004770);
                InterfaceC5772o interfaceC5772o3 = interfaceC5772o;
                boolean zD = composer2.D(interfaceC5772o3);
                Object objB6 = composer2.B();
                if (zD || objB6 == companion4.a()) {
                    objB6 = new i(interfaceC5772o3);
                    composer2.t(objB6);
                }
                composer2.P();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(ClickableKt.d(modifierD, false, null, null, (Function0) objB6, 7, null), 0.0f, 0.0f, 0.0f, C14808Q.e(j0.W.c(InterfaceC14806O.INSTANCE, composer2, 6), composer2, 0).getBottom(), 7, null);
                MeasurePolicy measurePolicyG3 = C5662h.g(companion5.o(), false);
                int iA4 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierM3);
                Function0<InterfaceC5811g> function0A4 = companion6.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = D1.a(composer2);
                D1.c(composerA4, measurePolicyG3, companion6.e());
                D1.c(composerA4, interfaceC5742sR4, companion6.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion6.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion6.f());
                C3066x.d(this.f4622m, null, this.f4618i.getSearchSuggestions(), this.f4623n, this.f4619j, composer2, i12, 1);
                composer.v();
            }
            composer.P();
            composer.v();
            composer.P();
            if (this.f4616g.getHelpersHashCode() != i11) {
                this.f4617h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4628a = new c();

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
    static final class d implements Function1<androidx.compose.ui.focus.E, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4631c;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Bq.b, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02) {
            this.f4629a = function1;
            this.f4630b = interfaceC5730l0;
            this.f4631c = interfaceC5730l02;
        }

        public final void a(androidx.compose.ui.focus.E it) {
            Intrinsics.j(it, "it");
            if (it.b()) {
                this.f4630b.setValue(Boolean.FALSE);
            } else {
                this.f4629a.invoke(b.a.f3225a);
            }
            this.f4631c.setValue(Boolean.valueOf(it.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
            a(e10);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f4632a;

        e(L1.h hVar) {
            this.f4632a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f4632a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f4633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4634b;

        f(h.ShoppingListState shoppingListState, LocalThemeScope localThemeScope) {
            this.f4633a = shoppingListState;
            this.f4634b = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1345343038, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingList.kt:93)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f4634b, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C14808Q.e(j0.W.c(InterfaceC14806O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null), largeLoading, oVar, C16193g.c(Aq.b.f1505z, composer, 0), C6408b.a(((a.Loading) this.f4633a.getLoadingState()).getMessage(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 32);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4635a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super Bq.a, Unit> function1) {
            this.f4635a = function1;
        }

        public final void a() {
            this.f4635a.invoke(a.d.f3221a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f4636a;

        h(androidx.compose.ui.focus.y yVar) {
            this.f4636a = yVar;
        }

        public final void a() {
            androidx.compose.ui.focus.y.h(this.f4636a, 0, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f4637a;

        i(InterfaceC5772o interfaceC5772o) {
            this.f4637a = interfaceC5772o;
        }

        public final void a() {
            InterfaceC5772o.l(this.f4637a, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r22, final Pq.h.ShoppingListState r23, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r24, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r25, final boolean r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r29, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r30, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r31, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.W.b(Ji.M, Pq.h$h, androidx.compose.runtime.l0, androidx.compose.runtime.l0, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, boolean z10, boolean z11, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, shoppingListState, interfaceC5730l0, interfaceC5730l02, z10, z11, modifier, function1, function12, function13, function14, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }
}
