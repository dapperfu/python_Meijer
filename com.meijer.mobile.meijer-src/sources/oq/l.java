package oq;

import F1.j;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.n;
import L1.x;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import dk.C13698b;
import eq.Asset;
import eq.C13838d;
import g1.J;
import g1.U;
import hq.ShopAndScanStoreDecorator;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.List;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18054z0;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.C15430B;
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import oi.E0;
import oq.l;
import oq.p;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;
import r1.C16819m;
import r1.u;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0013\u001a1\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u001c\u0010\u0015\u001a1\u0010!\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006%²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Loq/p;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "B", "(LKi/M;Loq/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Loq/p$b;", "viewState", "Lkotlin/Function1;", "Loq/p$a;", "onAction", "w", "(LKi/M;Landroidx/compose/ui/Modifier;Loq/p$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lhq/j;", "stores", "r", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "y", "decorator", "Lkotlin/Function0;", "onClick", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/j;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p", "", "isVisible", "Lbk/a;", "text", "n", "(LKi/M;Landroidx/compose/ui/Modifier;ZLbk/a;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f155348b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f155349c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oq.l$a$a, reason: collision with other inner class name */
        static final class C2405a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final C2405a f155350a = new C2405a();

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return Unit.f143329a;
            }

            C2405a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f155351a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155352b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f155353c;

            b(AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, Modifier modifier) {
                this.f155351a = abstractC6392a;
                this.f155352b = localThemeScope;
                this.f155353c = modifier;
            }

            public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(486716878, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.LoadingSpinner.<anonymous>.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:314)");
                }
                Ci.m.d(this.f155352b, this.f155353c, Assemble.getLoading().getLargeLoading(), Ci.o.f4629a, C13698b.a(this.f155351a, composer, AbstractC6392a.f60445b), null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 48);
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

        a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier) {
            this.f155347a = localThemeScope;
            this.f155348b = abstractC6392a;
            this.f155349c = modifier;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1992648231, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.LoadingSpinner.<anonymous> (ShopAndScanStoreSelectionScreen.kt:304)");
            }
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.b.d(T0.a.a(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.97f), this.f155347a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true, null, 2, null);
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C2405a.f155350a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = U.c(modifierB, unit, (PointerInputEventHandler) objB);
            P0.e eVarE = P0.e.INSTANCE.e();
            LocalThemeScope localThemeScope = this.f155347a;
            AbstractC6392a abstractC6392a = this.f155348b;
            Modifier modifier = this.f155349c;
            MeasurePolicy measurePolicyG = C5804h.g(eVarE, false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(486716878, true, new b(abstractC6392a, localThemeScope, modifier), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f155355b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f155356c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155357a;

            a(LocalThemeScope localThemeScope) {
                this.f155357a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1045747470, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent.<anonymous>.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:281)");
                }
                LocalThemeScope localThemeScope = this.f155357a;
                si.j.h(localThemeScope, new q1.Label(null, this.f155357a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117911e, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super p.a, Unit> function1) {
            this.f155354a = localThemeScope;
            this.f155355b = modifier;
            this.f155356c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(p.a.b.f155405a);
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(995438497, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:270)");
            }
            LocalThemeScope localThemeScope = this.f155354a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, T0.l.b(D.i(this.f155355b, H1.h.p(16)), H1.h.p(2), C16806i.c(H1.h.p(5)), false, 0L, 0L, 28, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f155356c);
            final Function1<p.a, Unit> function1 = this.f155356c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1045747470, true, new a(this.f155354a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f155358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A a10) {
            super(1);
            this.f155358f = a10;
        }

        public final void a(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f155358f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155359f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155360g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155361h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f155362i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155363j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Modifier f155364k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f155365l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, List list, LocalThemeScope localThemeScope, Modifier modifier, Function1 function1) {
            super(2);
            this.f155360g = nVar;
            this.f155361h = function0;
            this.f155362i = list;
            this.f155363j = localThemeScope;
            this.f155364k = modifier;
            this.f155365l = function1;
            this.f155359f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155360g.getHelpersHashCode();
            this.f155360g.i();
            L1.n nVar = this.f155360g;
            composer.startReplaceGroup(-1473868352);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            if (this.f155362i.isEmpty()) {
                composer.startReplaceGroup(-1473812646);
                LocalThemeScope localThemeScope = this.f155363j;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(this.f155364k, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = e.f155366a;
                    composer.t(objB);
                }
                composer.P();
                l.l(localThemeScope, nVar.k(modifierF, hVarC, (Function1) objB), this.f155365l, composer, LocalThemeScope.f17314g);
                composer.P();
            } else {
                composer.startReplaceGroup(-1473572365);
                LocalThemeScope localThemeScope2 = this.f155363j;
                Modifier modifierF2 = androidx.compose.foundation.layout.J.f(this.f155364k, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = f.f155367a;
                    composer.t(objB2);
                }
                composer.P();
                l.y(localThemeScope2, nVar.k(modifierF2, hVarA, (Function1) objB2), this.f155362i, this.f155365l, composer, LocalThemeScope.f17314g);
                composer.P();
            }
            composer.P();
            if (this.f155360g.getHelpersHashCode() != helpersHashCode) {
                this.f155361h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f155366a = new e();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f155367a = new f();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f155368f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(A a10) {
            super(1);
            this.f155368f = a10;
        }

        public final void a(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f155368f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f155369f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f155370g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f155371h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155372i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f155373j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStoreDecorator f155374k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            super(2);
            this.f155370g = nVar;
            this.f155371h = function0;
            this.f155372i = localThemeScope;
            this.f155373j = modifier;
            this.f155374k = shopAndScanStoreDecorator;
            this.f155369f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f155370g.getHelpersHashCode();
            this.f155370g.i();
            L1.n nVar = this.f155370g;
            composer.startReplaceGroup(-150102216);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f155372i;
            Modifier modifier = this.f155373j;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = i.f155375a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(modifier, hVarA, (Function1) objB), this.f155374k.getIsGreenville() ? this.f155372i.getAdsColors().getAdsColorSupportSuccess() : this.f155372i.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f155372i.getAdsTypography().getHeadings().getSeven(), null, 380, null);
            String strA = C13698b.a(this.f155374k.getName(), composer, AbstractC6392a.f60445b);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f155372i;
            Modifier modifier2 = this.f155373j;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new j(hVarA);
                composer.t(objB2);
            }
            composer.P();
            si.j.h(localThemeScope2, new q1.Label(nVar.k(modifier2, hVarC, (Function1) objB2), this.f155372i.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f155372i.getAdsTypography().getBody().getTwo(), null, 380, null), this.f155374k.getAddress().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f155372i;
            Modifier modifier3 = this.f155373j;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new k(hVarC);
                composer.t(objB3);
            }
            composer.P();
            si.j.h(localThemeScope3, new q1.Label(nVar.k(modifier3, hVarD, (Function1) objB3), this.f155372i.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f155372i.getAdsTypography().getBody().getTwo(), null, 380, null), this.f155374k.getCityStateZip().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i11 | (i12 << 3), 4);
            composer.P();
            if (this.f155370g.getHelpersHashCode() != helpersHashCode) {
                this.f155371h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f155375a = new i();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155376a;

        j(L1.h hVar) {
            this.f155376a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155376a.getBottom(), H1.h.p(4), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f155377a;

        k(L1.h hVar) {
            this.f155377a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f155377a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: oq.l$l, reason: collision with other inner class name */
    static final class C2406l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f155379b;

        /* JADX WARN: Multi-variable type inference failed */
        C2406l(LocalThemeScope localThemeScope, Function1<? super p.a, Unit> function1) {
            this.f155378a = localThemeScope;
            this.f155379b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(p.a.C2407a.f155404a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-751786626, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionLayout.<anonymous> (ShopAndScanStoreSelectionScreen.kt:91)");
            }
            LocalThemeScope localThemeScope = this.f155378a;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117902b, new Object[0]);
            Asset asset = new Asset(Cj.i.f4810n0, com.meijer.mobile.shopandscan.e.f117937m1);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f155379b);
            final Function1<p.a, Unit> function1 = this.f155379b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.C2406l.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13838d.d(localThemeScope, abstractC6392aD, asset, null, (Function0) objB, null, composer, 196608 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f155381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p.ViewState f155382c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f155383d;

        /* JADX WARN: Multi-variable type inference failed */
        m(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState viewState, Function1<? super p.a, Unit> function1) {
            this.f155380a = localThemeScope;
            this.f155381b = modifier;
            this.f155382c = viewState;
            this.f155383d = function1;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1430076663, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionLayout.<anonymous> (ShopAndScanStoreSelectionScreen.kt:102)");
            }
            LocalThemeScope localThemeScope = this.f155380a;
            Modifier modifierH = D.h(this.f155381b, paddingValues);
            List<ShopAndScanStoreDecorator> listC = this.f155382c.c();
            Function1<p.a, Unit> function1 = this.f155383d;
            int i12 = LocalThemeScope.f17314g;
            l.r(localThemeScope, modifierH, listC, function1, composer, i12);
            l.n(this.f155380a, null, this.f155382c.getLoadingSpinner() != null, this.f155382c.getLoadingSpinner(), composer, i12 | (AbstractC6392a.f60445b << 9), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f155384a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStoreDecorator f155385b;

        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super p.a, Unit> function1, ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            this.f155384a = function1;
            this.f155385b = shopAndScanStoreDecorator;
        }

        public final void a() {
            this.f155384a.invoke(new p.a.StoreSelected(this.f155385b.getId()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final o f155386f = new o();

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f155387f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f155388g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function1 function1, List list) {
            super(1);
            this.f155387f = function1;
            this.f155388g = list;
        }

        public final Object a(int i10) {
            return this.f155387f.invoke(this.f155388g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class q extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f155389f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155390g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f155391h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f155389f = list;
            this.f155390g = localThemeScope;
            this.f155391h = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ShopAndScanStoreDecorator shopAndScanStoreDecorator = (ShopAndScanStoreDecorator) this.f155389f.get(i10);
            composer.startReplaceGroup(-198758927);
            LocalThemeScope localThemeScope = this.f155390g;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155391h) | composer.D(shopAndScanStoreDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new n(this.f155391h, shopAndScanStoreDecorator);
                composer.t(objB);
            }
            composer.P();
            l.t(localThemeScope, modifierH, shopAndScanStoreDecorator, (Function0) objB, composer, LocalThemeScope.f17314g | 48 | (AbstractC6392a.f60445b << 6));
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, Composer composer, int i11) {
        y(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final Ki.LocalThemeScope r16, final oq.p r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.B(Ki.M, oq.p, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(oq.p pVar, p.a action) {
        Intrinsics.j(action, "action");
        pVar.N(action);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, oq.p pVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, pVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void l(LocalThemeScope localThemeScope, final Modifier modifier, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011846833);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2011846833, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.EmptyStoreListComponent (ShopAndScanStoreSelectionScreen.kt:150)");
            }
            Modifier modifierI = D.i(modifier, H1.h.p(40));
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            C18054z0.a(C16335d.c(Cj.i.f4717L1, composerStartRestartGroup, 0), null, null, 0L, composerStartRestartGroup, 48, 12);
            I six = localThemeScope2.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 4;
            Modifier modifierM = D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
            String strC = C16338g.c(com.meijer.mobile.shopandscan.e.f117905c, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 374, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117908d, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            p(localThemeScope2, androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), onAction, composerStartRestartGroup, i12 | 48 | i13 | (i11 & 896));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.m(localThemeScope2, modifier, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, Composer composer, int i11) {
        l(localThemeScope, modifier, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final boolean r17, bk.AbstractC6392a r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.n(Ki.M, androidx.compose.ui.Modifier, boolean, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, z10, abstractC6392a, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void p(final LocalThemeScope localThemeScope, final Modifier modifier, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-715564345);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-715564345, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent (ShopAndScanStoreSelectionScreen.kt:267)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(995438497, true, new b(localThemeScope, modifier, onAction), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.q(localThemeScope, modifier, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, Composer composer, int i11) {
        p(localThemeScope, modifier, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void r(final LocalThemeScope localThemeScope, final Modifier modifier, final List<ShopAndScanStoreDecorator> stores, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(stores, "stores");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1167583944);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(stores) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1167583944, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionContent (ShopAndScanStoreSelectionScreen.kt:119)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            A a10 = (A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new c(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new d(nVar, 0, pairH.b(), stores, localThemeScope, modifier, onAction)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.s(localThemeScope, modifier, stores, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, Composer composer, int i11) {
        r(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final Modifier modifier, final ShopAndScanStoreDecorator decorator, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1315539238);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1315539238, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionItemComponent (ShopAndScanStoreSelectionScreen.kt:219)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 7168) == 2048;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.u(onClick);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierI = D.i(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), H1.h.p(16));
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new A();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            A a10 = (A) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion2.a()) {
                objB3 = new L1.n();
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB3;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion2.a()) {
                objB4 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB4, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierI, false, new g(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new h(nVar, 0, pairH.b(), localThemeScope, modifier, decorator)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.v(localThemeScope, modifier, decorator, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanStoreDecorator shopAndScanStoreDecorator, Function0 function0, int i10, Composer composer, int i11) {
        t(localThemeScope, modifier, shopAndScanStoreDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final oq.p.ViewState r35, final kotlin.jvm.functions.Function1<? super oq.p.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.w(Ki.M, androidx.compose.ui.Modifier, oq.p$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void y(final LocalThemeScope localThemeScope, final Modifier modifier, final List<ShopAndScanStoreDecorator> stores, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(stores, "stores");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(480759566);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(stores) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(480759566, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionListComponent (ShopAndScanStoreSelectionScreen.kt:195)");
            }
            C15429A c15429aB = C15430B.b(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 7168) == 2048) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(stores);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: oq.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return l.z(stores, localThemeScope, onAction, (w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(modifier, c15429aB, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, (i11 >> 3) & 14, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.A(localThemeScope, modifier, stores, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(List list, LocalThemeScope localThemeScope, Function1 function1, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new p(o.f155386f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new q(list, localThemeScope, function1)));
        return Unit.f143329a;
    }

    private static final p.ViewState C(z1<p.ViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
