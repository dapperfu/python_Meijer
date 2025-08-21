package Cq;

import Bq.a;
import Bq.b;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.n;
import L1.x;
import P0.e;
import Pj.a;
import Pq.h;
import V0.C5489q0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14896Q;
import j0.C14903g;
import j0.InterfaceC14894O;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import yr.C18365u;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0015\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LKi/M;", "LPq/h$h;", "state", "Landroidx/compose/runtime/l0;", "", "isSearchFocused", "isInEditMode", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFq/c;", "", "onItemSearchIconClicked", "LPq/h$e;", "onAction", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LKi/M;LPq/h$h;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class W {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f5574f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f5574f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f5574f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5575f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f5576g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f5577h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f5578i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f5579j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f5580k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f5581l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5582m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f5583n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f5584o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f5585p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1 f5586q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f5587r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, h.ShoppingListState shoppingListState, Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, LocalThemeScope localThemeScope, Function1 function12, boolean z10, boolean z11, Function1 function13, Function1 function14) {
            super(2);
            this.f5576g = nVar;
            this.f5577h = function0;
            this.f5578i = shoppingListState;
            this.f5579j = function1;
            this.f5580k = interfaceC5872l0;
            this.f5581l = interfaceC5872l02;
            this.f5582m = localThemeScope;
            this.f5583n = function12;
            this.f5584o = z10;
            this.f5585p = z11;
            this.f5586q = function13;
            this.f5587r = function14;
            this.f5575f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            Modifier.Companion companion;
            InterfaceC5914o interfaceC5914o;
            Composer composer2;
            int i12;
            Modifier.Companion companion2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f5576g.getHelpersHashCode();
            this.f5576g.i();
            L1.n nVar = this.f5576g;
            composer.startReplaceGroup(-2132169164);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            InterfaceC5914o interfaceC5914o2 = (InterfaceC5914o) composer.o(C6034t0.h());
            androidx.compose.ui.focus.y yVar = new androidx.compose.ui.focus.y();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = c.f5588a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion3, hVarA, (Function1) objB);
            e.Companion companion5 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion5.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5953g.Companion companion6 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion6.a();
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
            D1.c(composerA, measurePolicyG, companion6.e());
            D1.c(composerA, interfaceC5884sR, companion6.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion6.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion6.f());
            C5806j c5806j = C5806j.f48836a;
            String searchTerm = this.f5578i.getSearchTerm();
            Modifier modifierA = androidx.compose.ui.focus.A.a(companion3, yVar);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f5579j) | composer.V(this.f5580k) | composer.V(this.f5581l);
            Object objB2 = composer.B();
            if (zV || objB2 == companion4.a()) {
                objB2 = new d(this.f5579j, this.f5580k, this.f5581l);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA2 = C5903d.a(modifierA, (Function1) objB2);
            LocalThemeScope localThemeScope = this.f5582m;
            Function1 function1 = this.f5583n;
            Function1 function12 = this.f5579j;
            int i13 = LocalThemeScope.f17314g;
            C3097x.g(localThemeScope, modifierA2, searchTerm, function1, function12, composer, i13, 0);
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
            MeasurePolicy measurePolicyG2 = C5804h.g(companion5.o(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
            Function0<InterfaceC5953g> function0A2 = companion6.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyG2, companion6.e());
            D1.c(composerA2, interfaceC5884sR2, companion6.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion6.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion6.f());
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion5.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion3);
            Function0<InterfaceC5953g> function0A3 = companion6.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA, companion6.e());
            D1.c(composerA3, interfaceC5884sR3, companion6.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion6.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion6.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, this.f5582m.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            if (this.f5578i.getLoadingState() instanceof a.Loading) {
                composer.startReplaceGroup(-47928569);
                LocalThemeScope localThemeScope2 = this.f5582m;
                Ki.Q.e(localThemeScope2, Q0.b.f141966a, ComposableLambdaKt.c(1345343038, true, new f(this.f5578i, localThemeScope2), composer, 54), composer, i13 | 384 | (Q0.b.f141967b << 3));
                composer.P();
                i11 = helpersHashCode;
                i12 = i13;
                composer2 = composer;
                interfaceC5914o = interfaceC5914o2;
                companion = companion3;
            } else {
                if (this.f5578i.getLoadingState() instanceof a.Failed) {
                    composer.startReplaceGroup(-47019122);
                    String strC = C16338g.c(Aq.b.f2000x, composer, 0);
                    String strC2 = C16338g.c(Aq.b.f1999w, composer, 0);
                    String strC3 = C16338g.c(Aq.b.f2001y, composer, 0);
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, 0.0f, C14896Q.e(j0.W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null);
                    companion2 = companion3;
                    LocalThemeScope localThemeScope3 = this.f5582m;
                    composer.startReplaceGroup(5004770);
                    boolean zV3 = composer.V(this.f5583n);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion4.a()) {
                        objB4 = new g(this.f5583n);
                        composer.t(objB4);
                    }
                    composer.P();
                    C18365u.c(localThemeScope3, strC, strC2, strC3, modifierM, (Function0) objB4, composer, i13, 0);
                    composer.P();
                    i11 = helpersHashCode;
                    composer2 = composer;
                    i12 = i13;
                } else if (this.f5578i.h()) {
                    composer.startReplaceGroup(-46268767);
                    String strC4 = C16338g.c(Aq.b.f1989m, composer, 0);
                    String strC5 = C16338g.c(Aq.b.f1968P, composer, 0);
                    String strC6 = C16338g.c(Aq.b.f1973U, composer, 0);
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion3, 0.0f, 0.0f, 0.0f, C14896Q.e(j0.W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null);
                    LocalThemeScope localThemeScope4 = this.f5582m;
                    composer.startReplaceGroup(5004770);
                    boolean zV4 = composer.V(yVar);
                    Object objB5 = composer.B();
                    if (zV4 || objB5 == companion4.a()) {
                        objB5 = new h(yVar);
                        composer.t(objB5);
                    }
                    composer.P();
                    companion2 = companion3;
                    C18365u.c(localThemeScope4, strC4, strC5, strC6, modifierM2, (Function0) objB5, composer, i13, 0);
                    composer2 = composer;
                    i12 = i13;
                    composer2.P();
                    i11 = helpersHashCode;
                } else {
                    composer.startReplaceGroup(-45573561);
                    i11 = helpersHashCode;
                    companion = companion3;
                    interfaceC5914o = interfaceC5914o2;
                    Dq.q.g(this.f5582m, null, this.f5578i.d(), this.f5578i.c(), this.f5578i.getIsListMoving(), this.f5580k, this.f5584o, this.f5585p, this.f5586q, this.f5587r, this.f5583n, composer, i13, 0, 1);
                    composer2 = composer;
                    i12 = i13;
                    composer2.P();
                }
                interfaceC5914o = interfaceC5914o2;
                companion = companion2;
            }
            composer2.v();
            composer2.startReplaceGroup(474718493);
            if (((Boolean) this.f5581l.getValue()).booleanValue()) {
                Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), C5489q0.q(C5489q0.INSTANCE.a(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceGroup(5004770);
                InterfaceC5914o interfaceC5914o3 = interfaceC5914o;
                boolean zD = composer2.D(interfaceC5914o3);
                Object objB6 = composer2.B();
                if (zD || objB6 == companion4.a()) {
                    objB6 = new i(interfaceC5914o3);
                    composer2.t(objB6);
                }
                composer2.P();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(ClickableKt.d(modifierD, false, null, null, (Function0) objB6, 7, null), 0.0f, 0.0f, 0.0f, C14896Q.e(j0.W.c(InterfaceC14894O.INSTANCE, composer2, 6), composer2, 0).getBottom(), 7, null);
                MeasurePolicy measurePolicyG3 = C5804h.g(companion5.o(), false);
                int iA4 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierM3);
                Function0<InterfaceC5953g> function0A4 = companion6.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = D1.a(composer2);
                D1.c(composerA4, measurePolicyG3, companion6.e());
                D1.c(composerA4, interfaceC5884sR4, companion6.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion6.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion6.f());
                C3097x.d(this.f5582m, null, this.f5578i.getSearchSuggestions(), this.f5583n, this.f5579j, composer2, i12, 1);
                composer.v();
            }
            composer.P();
            composer.v();
            composer.P();
            if (this.f5576g.getHelpersHashCode() != i11) {
                this.f5577h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5588a = new c();

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
    static final class d implements Function1<androidx.compose.ui.focus.E, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f5589a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5590b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5591c;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Bq.b, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
            this.f5589a = function1;
            this.f5590b = interfaceC5872l0;
            this.f5591c = interfaceC5872l02;
        }

        public final void a(androidx.compose.ui.focus.E it) {
            Intrinsics.j(it, "it");
            if (it.b()) {
                this.f5590b.setValue(Boolean.FALSE);
            } else {
                this.f5589a.invoke(b.a.f3631a);
            }
            this.f5591c.setValue(Boolean.valueOf(it.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
            a(e10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f5592a;

        e(L1.h hVar) {
            this.f5592a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f5592a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f5593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5594b;

        f(h.ShoppingListState shoppingListState, LocalThemeScope localThemeScope) {
            this.f5593a = shoppingListState;
            this.f5594b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1345343038, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingList.kt:93)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f5594b, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C14896Q.e(j0.W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null), largeLoading, oVar, C16338g.c(Aq.b.f2002z, composer, 0), C13698b.a(((a.Loading) this.f5593a.getLoadingState()).getMessage(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 32);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5595a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super Bq.a, Unit> function1) {
            this.f5595a = function1;
        }

        public final void a() {
            this.f5595a.invoke(a.d.f3627a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f5596a;

        h(androidx.compose.ui.focus.y yVar) {
            this.f5596a = yVar;
        }

        public final void a() {
            androidx.compose.ui.focus.y.h(this.f5596a, 0, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f5597a;

        i(InterfaceC5914o interfaceC5914o) {
            this.f5597a = interfaceC5914o;
        }

        public final void a() {
            InterfaceC5914o.l(this.f5597a, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r22, final Pq.h.ShoppingListState r23, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r24, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r25, final boolean r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r29, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r30, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r31, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.W.b(Ki.M, Pq.h$h, androidx.compose.runtime.l0, androidx.compose.runtime.l0, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, boolean z10, boolean z11, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, shoppingListState, interfaceC5872l0, interfaceC5872l02, z10, z11, modifier, function1, function12, function13, function14, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }
}
