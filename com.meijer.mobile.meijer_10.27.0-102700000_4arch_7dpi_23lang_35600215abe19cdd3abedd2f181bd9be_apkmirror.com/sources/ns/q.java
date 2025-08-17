package ns;

import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.T;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Uj.WalkthroughPage;
import ak.AbstractC5607a;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import kotlin.AbstractC15962C;
import kotlin.C15977m;
import kotlin.InterfaceC15985u;
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
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15860s0;
import ni.P0;
import ns.q;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "dismissAction", "Lkotlin/Function1;", "", "analyticsTrackState", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LUj/e;", "walkthroughPage", "o", "(LJi/M;LUj/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lo0/C;", "pagerState", "j", "(LJi/M;Lo0/C;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "totalDots", "selectedIndex", "swipeAction", "g", "(LJi/M;IILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "a", "Ljava/util/List;", "walkThruPagesList", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final List<WalkthroughPage> f152640a = CollectionsKt.p(new WalkthroughPage(s.f152681m, u.f152734l0, u.f152732k0, null, 0, false, Integer.valueOf(u.f152730j0), 56, null), new WalkthroughPage(s.f152680l, u.f152693I, u.f152692H, null, 0, false, Integer.valueOf(u.f152691G), 56, null), new WalkthroughPage(s.f152677i, u.f152717d, u.f152715c, null, 0, false, Integer.valueOf(u.f152713b), 56, null), new WalkthroughPage(s.f152679k, u.f152688D, u.f152687C, null, 0, false, Integer.valueOf(u.f152686B), 56, null), new WalkthroughPage(s.f152678j, u.f152737n, u.f152735m, null, 0, false, Integer.valueOf(u.f152733l), 56, null));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f152641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152642b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f152643c;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1) {
            this.f152641a = i10;
            this.f152642b = localThemeScope;
            this.f152643c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void c(InterfaceC15343c items, final int i10, Composer composer, int i11) throws Resources.NotFoundException {
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
            final String strD = C16193g.d(u.f152720e0, new Object[]{Integer.valueOf(i10 + 1)}, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(J.v(companion, H1.h.p(8)), C16692i.f()), i10 == this.f152641a ? this.f152642b.getAdsColors().getAdsColorBrandPrimary().getColor() : this.f152642b.getAdsColors().getAdsColorSupportInformationalBg().getColor(), null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = ((i12 & 112) == 32) | composer.V(this.f152643c);
            final Function1<Integer, Unit> function1 = this.f152643c;
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
            C5662h.a(C16705m.d(modifierD2, false, (Function1) objB2, 1, null), composer, 0);
            C14802K.a(D.k(companion, this.f152642b.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
            c(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i10) {
            function1.invoke(Integer.valueOf(i10));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f152644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f152644f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f152644f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f152645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f152646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f152647h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152648i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152649j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f152650k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f152651l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O, Function0 function02) {
            super(2);
            this.f152646g = nVar;
            this.f152647h = function0;
            this.f152648i = localThemeScope;
            this.f152649j = abstractC15962C;
            this.f152650k = interfaceC16622O;
            this.f152651l = function02;
            this.f152645f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f152646g.getHelpersHashCode();
            this.f152646g.i();
            L1.n nVar = this.f152646g;
            composer.startReplaceGroup(356180570);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f152648i;
            int size = q.f152640a.size();
            int iV = this.f152649j.v();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = d.f152652a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f152650k) | composer.V(this.f152649j);
            Object objB2 = composer.B();
            if (zD || objB2 == companion2.a()) {
                objB2 = new e(this.f152650k, this.f152649j);
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            int i11 = LocalThemeScope.f15770g;
            q.g(localThemeScope, size, iV, modifierK, function1, composer, i11);
            if (this.f152649j.v() == q.f152640a.size() - 1) {
                composer.startReplaceGroup(356763245);
                LocalThemeScope localThemeScope2 = this.f152648i;
                C15860s0 c15860s0 = C15860s0.f151792a;
                String strC = C16193g.c(u.f152718d0, composer, 0);
                Function0 function0 = this.f152651l;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f152648i);
                Object objB3 = composer.B();
                if (zD2 || objB3 == companion2.a()) {
                    objB3 = new f(this.f152648i);
                    composer.t(objB3);
                }
                composer.P();
                P0.k(localThemeScope2, c15860s0, strC, function0, D.k(J.h(nVar.k(companion, hVarC, (Function1) objB3), 0.0f, 1, null), this.f152648i.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, false, 0L, false, composer, i11 | (C15860s0.f151793b << 3), 240);
                composer.P();
            } else {
                composer.startReplaceGroup(357396234);
                LocalThemeScope localThemeScope3 = this.f152648i;
                I seven = localThemeScope3.getAdsTypography().getHeadings().getSeven();
                T adsColorText01 = this.f152648i.getAdsColors().getAdsColorText01();
                int iA = F1.j.INSTANCE.a();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f152648i);
                Object objB4 = composer.B();
                if (zD3 || objB4 == companion2.a()) {
                    objB4 = new g(this.f152648i);
                    composer.t(objB4);
                }
                composer.P();
                ri.j.h(localThemeScope3, new q1.Label(nVar.k(companion, hVarD, (Function1) objB4), adsColorText01, null, F1.j.h(iA), 0, false, 0, seven, null, 372, null), C16193g.c(u.f152722f0, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                composer.P();
            }
            composer.P();
            if (this.f152646g.getHelpersHashCode() != helpersHashCode) {
                this.f152647h.invoke();
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
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f152652a = new d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), H1.h.p(96), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f152653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152654b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.mperks.Mperks4WalkThruComposableKt$DotsIndicatorSection$1$2$1$1", f = "Mperks4WalkThruComposable.kt", l = {189}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f152655a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f152656b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f152657c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC15962C abstractC15962C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f152656b = abstractC15962C;
                this.f152657c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f152656b, this.f152657c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f152655a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AbstractC15962C abstractC15962C = this.f152656b;
                    int i11 = this.f152657c;
                    this.f152655a = 1;
                    if (AbstractC15962C.d0(abstractC15962C, i11, 0.0f, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        e(InterfaceC16622O interfaceC16622O, AbstractC15962C abstractC15962C) {
            this.f152653a = interfaceC16622O;
            this.f152654b = abstractC15962C;
        }

        public final void a(int i10) {
            C16648k.d(this.f152653a, null, null, new a(this.f152654b, i10, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152658a;

        f(LocalThemeScope localThemeScope) {
            this.f152658a = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.f152658a.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152659a;

        g(LocalThemeScope localThemeScope) {
            this.f152659a = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), this.f152659a.getAdsSpacing().getTen().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152661b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152662a;

            a(LocalThemeScope localThemeScope) {
                this.f152662a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1072385041, i10, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous>.<anonymous> (Mperks4WalkThruComposable.kt:80)");
                }
                Dr.g.g(this.f152662a, C16193g.c(u.f152749v, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-428619951, i10, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous> (Mperks4WalkThruComposable.kt:78)");
            }
            LocalThemeScope localThemeScope = this.f152660a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1072385041, true, new a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f152661b);
            final Function0<Unit> function0 = this.f152661b;
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
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.o.f15522e, 0.0f, false, AbstractC5607a.INSTANCE.d(Bj.o.f3043t, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (C.f.o.f15523f << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        h(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f152660a = localThemeScope;
            this.f152661b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152664b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152665c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f152666d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152667a;

            a(LocalThemeScope localThemeScope) {
                this.f152667a = localThemeScope;
            }

            public final void a(InterfaceC15985u HorizontalPager, int i10, Composer composer, int i11) {
                Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1827969343, i11, -1, "com.meijer.mobile.ui.mperks.Mperks4WalkThru.<anonymous>.<anonymous>.<anonymous> (Mperks4WalkThruComposable.kt:99)");
                }
                q.o(this.f152667a, (WalkthroughPage) q.f152640a.get(i10), null, composer, LocalThemeScope.f15770g | (WalkthroughPage.f36092h << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15985u interfaceC15985u, Integer num, Composer composer, Integer num2) {
                a(interfaceC15985u, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(AbstractC15962C abstractC15962C, LocalThemeScope localThemeScope, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
            this.f152663a = abstractC15962C;
            this.f152664b = localThemeScope;
            this.f152665c = function0;
            this.f152666d = function1;
        }

        public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
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
            C5658d.f fVarE = C5658d.f48555a.e();
            AbstractC15962C abstractC15962C = this.f152663a;
            LocalThemeScope localThemeScope = this.f152664b;
            Function0<Unit> function0 = this.f152665c;
            MeasurePolicy measurePolicyA = C5665k.a(fVarE, P0.e.INSTANCE.k(), composer, 6);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C15977m.a(abstractC15962C, androidx.compose.foundation.layout.D.h(InterfaceC14814f.b(C14815g.f139108a, J.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), contentPadding), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.c(-1827969343, true, new a(localThemeScope), composer, 54), composer, 0, 24576, 16380);
            q.j(localThemeScope, abstractC15962C, function0, null, composer, LocalThemeScope.f15770g, 4);
            composer.v();
            if (this.f152663a.H() != 0 && (analyticsState = ((WalkthroughPage) q.f152640a.get(this.f152663a.v())).getAnalyticsState()) != null) {
                this.f152666d.invoke(Integer.valueOf(analyticsState.intValue()));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
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
            C15342b.c(modifier, null, null, false, null, null, null, false, null, (Function1) objB, composer2, (i13 >> 9) & 14, 510);
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, int i10, int i11, Modifier modifier, Function1 function1, int i12, Composer composer, int i13) {
        g(localThemeScope, i10, i11, modifier, function1, composer, J0.a(i12 | 1));
        return Unit.f142422a;
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
    public static final void j(final Ji.LocalThemeScope r16, final kotlin.AbstractC15962C r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.j(Ji.M, o0.C, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, abstractC15962C, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void l(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.l(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m() {
        return f152640a.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void o(final Ji.LocalThemeScope r35, final Uj.WalkthroughPage r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.q.o(Ji.M, Uj.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, WalkthroughPage walkthroughPage, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, walkthroughPage, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
