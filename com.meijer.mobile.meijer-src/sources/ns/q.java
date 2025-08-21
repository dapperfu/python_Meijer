package ns;

import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import Vj.WalkthroughPage;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.List;
import ki.q1;
import kotlin.AbstractC16037C;
import kotlin.C16052m;
import kotlin.InterfaceC16060u;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import mv.C15809k;
import mv.InterfaceC15783O;
import ns.q;
import oi.C16194s0;
import oi.P0;
import p1.C16338g;
import r0.C16806i;
import r1.C16819m;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "dismissAction", "Lkotlin/Function1;", "", "analyticsTrackState", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LVj/e;", "walkthroughPage", "o", "(LKi/M;LVj/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lo0/C;", "pagerState", "j", "(LKi/M;Lo0/C;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "totalDots", "selectedIndex", "swipeAction", "g", "(LKi/M;IILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "a", "Ljava/util/List;", "walkThruPagesList", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final List<WalkthroughPage> f153092a = CollectionsKt.p(new WalkthroughPage(s.f153133m, u.f153186l0, u.f153184k0, null, 0, false, Integer.valueOf(u.f153182j0), 56, null), new WalkthroughPage(s.f153132l, u.f153145I, u.f153144H, null, 0, false, Integer.valueOf(u.f153143G), 56, null), new WalkthroughPage(s.f153129i, u.f153169d, u.f153167c, null, 0, false, Integer.valueOf(u.f153165b), 56, null), new WalkthroughPage(s.f153131k, u.f153140D, u.f153139C, null, 0, false, Integer.valueOf(u.f153138B), 56, null), new WalkthroughPage(s.f153130j, u.f153189n, u.f153187m, null, 0, false, Integer.valueOf(u.f153185l), 56, null));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f153093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153094b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f153095c;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1) {
            this.f153093a = i10;
            this.f153094b = localThemeScope;
            this.f153095c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void c(InterfaceC15433c items, final int i10, Composer composer, int i11) throws Resources.NotFoundException {
            int i12;
            Intrinsics.j(items, "$this$items");
            if ((i11 & 48) == 0) {
                i12 = i11 | (composer.d(i10) ? 32 : 16);
            } else {
                i12 = i11;
            }
            if ((i12 & 145) == 144 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1419758373, i12, -1, "com.meijer.mobile.ui.mperks.DotsIndicator.<anonymous>.<anonymous>.<anonymous> (Mperks4WalkThruComposable.kt:235)");
            }
            final String strD = C16338g.d(u.f153172e0, new Object[]{Integer.valueOf(i10 + 1)}, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(J.v(companion, H1.h.p(8)), C16806i.f()), i10 == this.f153093a ? this.f153094b.getAdsColors().getAdsColorBrandPrimary().getColor() : this.f153094b.getAdsColors().getAdsColorSupportInformationalBg().getColor(), null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i12 & 112) == 32) | composer.V(this.f153095c);
            final Function1<Integer, Unit> function1 = this.f153095c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ns.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.a.d(function1, i10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD2 = ClickableKt.d(modifierD, true, null, null, (Function0) objB, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(strD);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: ns.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.a.e(strD, (r1.u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C5804h.a(C16819m.d(modifierD2, false, (Function1) objB2, 1, null), composer, 0);
            C14890K.a(D.k(companion, this.f153094b.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
            c(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i10) {
            function1.invoke(Integer.valueOf(i10));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f153096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f153096f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f153096f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f153097f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f153098g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f153099h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153100i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153101j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f153102k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f153103l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O, Function0 function02) {
            super(2);
            this.f153098g = nVar;
            this.f153099h = function0;
            this.f153100i = localThemeScope;
            this.f153101j = abstractC16037C;
            this.f153102k = interfaceC15783O;
            this.f153103l = function02;
            this.f153097f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f153098g.getHelpersHashCode();
            this.f153098g.i();
            L1.n nVar = this.f153098g;
            composer.startReplaceGroup(356180570);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f153100i;
            int size = q.f153092a.size();
            int iV = this.f153101j.v();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = d.f153104a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f153102k) | composer.V(this.f153101j);
            Object objB2 = composer.B();
            if (zD || objB2 == companion2.a()) {
                objB2 = new e(this.f153102k, this.f153101j);
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            int i11 = LocalThemeScope.f17314g;
            q.g(localThemeScope, size, iV, modifierK, function1, composer, i11);
            if (this.f153101j.v() == q.f153092a.size() - 1) {
                composer.startReplaceGroup(356763245);
                LocalThemeScope localThemeScope2 = this.f153100i;
                C16194s0 c16194s0 = C16194s0.f154251a;
                String strC = C16338g.c(u.f153170d0, composer, 0);
                Function0 function0 = this.f153103l;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f153100i);
                Object objB3 = composer.B();
                if (zD2 || objB3 == companion2.a()) {
                    objB3 = new f(this.f153100i);
                    composer.t(objB3);
                }
                composer.P();
                P0.k(localThemeScope2, c16194s0, strC, function0, D.k(J.h(nVar.k(companion, hVarC, (Function1) objB3), 0.0f, 1, null), this.f153100i.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, false, 0L, false, composer, i11 | (C16194s0.f154252b << 3), 240);
                composer.P();
            } else {
                composer.startReplaceGroup(357396234);
                LocalThemeScope localThemeScope3 = this.f153100i;
                I seven = localThemeScope3.getAdsTypography().getHeadings().getSeven();
                T adsColorText01 = this.f153100i.getAdsColors().getAdsColorText01();
                int iA = F1.j.INSTANCE.a();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f153100i);
                Object objB4 = composer.B();
                if (zD3 || objB4 == companion2.a()) {
                    objB4 = new g(this.f153100i);
                    composer.t(objB4);
                }
                composer.P();
                si.j.h(localThemeScope3, new q1.Label(nVar.k(companion, hVarD, (Function1) objB4), adsColorText01, null, F1.j.h(iA), 0, false, 0, seven, null, 372, null), C16338g.c(u.f153174f0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                composer.P();
            }
            composer.P();
            if (this.f153098g.getHelpersHashCode() != helpersHashCode) {
                this.f153099h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f153104a = new d();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), H1.h.p(96), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f153105a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153106b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.mperks.Mperks4WalkThruComposableKt$DotsIndicatorSection$1$2$1$1", f = "Mperks4WalkThruComposable.kt", l = {189}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f153107a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153108b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f153109c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC16037C abstractC16037C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f153108b = abstractC16037C;
                this.f153109c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f153108b, this.f153109c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f153107a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AbstractC16037C abstractC16037C = this.f153108b;
                    int i11 = this.f153109c;
                    this.f153107a = 1;
                    if (AbstractC16037C.d0(abstractC16037C, i11, 0.0f, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        e(InterfaceC15783O interfaceC15783O, AbstractC16037C abstractC16037C) {
            this.f153105a = interfaceC15783O;
            this.f153106b = abstractC16037C;
        }

        public final void a(int i10) {
            C15809k.d(this.f153105a, null, null, new a(this.f153106b, i10, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153110a;

        f(LocalThemeScope localThemeScope) {
            this.f153110a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.f153110a.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153111a;

        g(LocalThemeScope localThemeScope) {
            this.f153111a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.f153111a.getAdsSpacing().getTen().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f153113b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f153114a;

            a(LocalThemeScope localThemeScope) {
                this.f153114a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1072385041, i10, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous>.<anonymous> (Mperks4WalkThruComposable.kt:80)");
                }
                Dr.g.g(this.f153114a, C16338g.c(u.f153201v, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-428619951, i10, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous> (Mperks4WalkThruComposable.kt:78)");
            }
            LocalThemeScope localThemeScope = this.f153112a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1072385041, true, new a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f153113b);
            final Function0<Unit> function0 = this.f153113b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ns.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.h.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.o.f17066e, 0.0f, false, AbstractC6392a.INSTANCE.d(Cj.o.f5088t, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        h(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f153112a = localThemeScope;
            this.f153113b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f153117c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f153118d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f153119a;

            a(LocalThemeScope localThemeScope) {
                this.f153119a = localThemeScope;
            }

            public final void a(InterfaceC16060u HorizontalPager, int i10, Composer composer, int i11) {
                Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1827969343, i11, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous>.<anonymous>.<anonymous> (Mperks4WalkThruComposable.kt:99)");
                }
                q.o(this.f153119a, (WalkthroughPage) q.f153092a.get(i10), null, composer, LocalThemeScope.f17314g | (WalkthroughPage.f39973h << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16060u interfaceC16060u, Integer num, Composer composer, Integer num2) {
                a(interfaceC16060u, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
            this.f153115a = abstractC16037C;
            this.f153116b = localThemeScope;
            this.f153117c = function0;
            this.f153118d = function1;
        }

        public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
            int i11;
            Integer analyticsState;
            Intrinsics.j(contentPadding, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-416867702, i11, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous> (Mperks4WalkThruComposable.kt:88)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            C5800d.f fVarE = C5800d.f48779a.e();
            AbstractC16037C abstractC16037C = this.f153115a;
            LocalThemeScope localThemeScope = this.f153116b;
            Function0<Unit> function0 = this.f153117c;
            MeasurePolicy measurePolicyA = C5807k.a(fVarE, P0.e.INSTANCE.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C16052m.a(abstractC16037C, androidx.compose.foundation.layout.D.h(InterfaceC14902f.b(C14903g.f139698a, J.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), contentPadding), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.c(-1827969343, true, new a(localThemeScope), composer, 54), composer, 0, 24576, 16380);
            q.j(localThemeScope, abstractC16037C, function0, null, composer, LocalThemeScope.f17314g, 4);
            composer.v();
            if (this.f153115a.H() != 0 && (analyticsState = ((WalkthroughPage) q.f153092a.get(this.f153115a.v())).getAnalyticsState()) != null) {
                this.f153118d.invoke(Integer.valueOf(analyticsState.intValue()));
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final LocalThemeScope localThemeScope, final int i10, final int i11, final Modifier modifier, final Function1<? super Integer, Unit> function1, Composer composer, final int i12) {
        int i13;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1897291015);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= composerStartRestartGroup.d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= composerStartRestartGroup.D(function1) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1897291015, i13, -1, "com.meijer.mobile.ui.mperks.DotsIndicator (Mperks4WalkThruComposable.kt:230)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z10 = ((i13 & 112) == 32) | ((i13 & 896) == 256) | ((i13 & 14) == 4 || ((i13 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((57344 & i13) == 16384);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ns.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.h(i10, i11, localThemeScope, function1, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15432b.c(modifier, null, null, false, null, null, null, false, null, (Function1) objB, composer2, (i13 >> 9) & 14, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ns.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.i(localThemeScope, i10, i11, modifier, function1, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(int i10, int i11, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        l0.w.b(LazyRow, i10, null, null, ComposableLambdaKt.composableLambdaInstance(-1419758373, true, new a(i11, localThemeScope, function1)), 6, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, int i10, int i11, Modifier modifier, Function1 function1, int i12, Composer composer, int i13) {
        g(localThemeScope, i10, i11, modifier, function1, composer, J0.a(i12 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r16, final kotlin.AbstractC16037C r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.j(Ki.M, o0.C, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, abstractC16037C, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.l(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m() {
        return f153092a.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r35, final Vj.WalkthroughPage r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.o(Ki.M, Vj.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, WalkthroughPage walkthroughPage, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, walkthroughPage, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
