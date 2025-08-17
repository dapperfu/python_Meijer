package kq;

import Ji.LocalThemeScope;
import Ji.Q;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import android.app.Activity;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eq.Asset;
import eq.C13729d;
import g1.J;
import g1.U;
import j0.InterfaceC14794C;
import java.util.List;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.AbstractC15962C;
import kotlin.C15963D;
import kotlin.C15977m;
import kotlin.C6292E;
import kotlin.C6327j;
import kotlin.InterfaceC15985u;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.n0;
import kq.o;
import kq.s;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aW\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010!\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006&²\u0006\f\u0010#\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkq/s$b;", "uiState", "Lkotlin/Function1;", "Lkq/s$a;", "", "sendAction", "p", "(LJi/M;Landroidx/compose/ui/Modifier;Lkq/s$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isLoading", "Lak/a;", "headerText", "actionButtonText", "Lkotlin/Function0;", "onClickActionButton", "m", "(LJi/M;Landroidx/compose/ui/Modifier;ZLak/a;Lak/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lo0/C;", "pagerState", "LV0/q0;", "activeColor", "inactiveColor", "LH1/h;", "unselectedIndicatorSize", "selectedIndicatorSize", "indicatorPadding", "g", "(LJi/M;Lo0/C;Landroidx/compose/ui/Modifier;JJFFFLandroidx/compose/runtime/Composer;II)V", "isVisible", "text", "k", "(LJi/M;Landroidx/compose/ui/Modifier;ZLak/a;Landroidx/compose/runtime/Composer;II)V", "size", "", "lastAction", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingScreenKt$HorizontalPagerIndicator$1$1$1$1$1", f = "ShopAndScanLandingScreen.kt", l = {273}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f147629b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f147630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC15962C abstractC15962C, int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f147629b = abstractC15962C;
            this.f147630c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f147629b, this.f147630c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147628a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = this.f147629b;
                int i11 = this.f147630c;
                float fW = abstractC15962C.w();
                n0 n0VarL = C6327j.l(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, 0, C6292E.e(), 2, null);
                this.f147628a = 1;
                if (abstractC15962C.m(i11, fW, n0VarL, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f147632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f147633c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final a f147634a = new a();

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return Unit.f142422a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kq.o$b$b, reason: collision with other inner class name */
        static final class C2272b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f147635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f147636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f147637c;

            C2272b(AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope, Modifier modifier) {
                this.f147635a = abstractC5607a;
                this.f147636b = localThemeScope;
                this.f147637c = modifier;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1686679656, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.LoadingSpinner.<anonymous>.<anonymous>.<anonymous> (ShopAndScanLandingScreen.kt:308)");
                }
                Bi.m.d(this.f147636b, this.f147637c, Assemble.getLoading().getLargeLoading(), Bi.o.f2584a, C6408b.a(this.f147635a, composer, AbstractC5607a.f45514b), null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 48);
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

        b(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier) {
            this.f147631a = localThemeScope;
            this.f147632b = abstractC5607a;
            this.f147633c = modifier;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1005081315, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.LoadingSpinner.<anonymous> (ShopAndScanLandingScreen.kt:298)");
            }
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.b.d(T0.a.a(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.97f), this.f147631a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true, null, 2, null);
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f147634a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = U.c(modifierB, unit, (PointerInputEventHandler) objB);
            P0.e eVarE = P0.e.INSTANCE.e();
            LocalThemeScope localThemeScope = this.f147631a;
            AbstractC5607a abstractC5607a = this.f147632b;
            Modifier modifier = this.f147633c;
            MeasurePolicy measurePolicyG = C5662h.g(eVarE, false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1686679656, true, new C2272b(abstractC5607a, localThemeScope, modifier), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f147638a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), H1.h.p(8), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
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
    @SourceDebugExtension
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f147639a = new d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), H1.h.p(80), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
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
    @SourceDebugExtension
    static final class e implements Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<AnimatedLandingPageData> f147640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f147642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f147643d;

        e(List<AnimatedLandingPageData> list, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, boolean z10) {
            this.f147640a = list;
            this.f147641b = localThemeScope;
            this.f147642c = abstractC15962C;
            this.f147643d = z10;
        }

        public final void a(InterfaceC15985u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(-1744479259, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingContent.<anonymous>.<anonymous>.<anonymous> (ShopAndScanLandingScreen.kt:189)");
            }
            AnimatedLandingPageData animatedLandingPageData = this.f147640a.get(i10);
            C15303e.d(this.f147641b, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, H1.h.p(160), 7, null), C16193g.c(animatedLandingPageData.getTitle(), composer, 0), C16193g.c(animatedLandingPageData.getDescription(), composer, 0), this.f147642c.v() == i10 && !this.f147643d, animatedLandingPageData.getResource(), composer, LocalThemeScope.f15770g | 48, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f147644a = new f();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), H1.h.p(72), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f147645a = new g();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            float f10 = 16;
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), H1.h.p(f10), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), H1.h.p(f10), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        g() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147646a;

        h(Function0<Unit> function0) {
            this.f147646a = function0;
        }

        public final void a() {
            this.f147646a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f147647f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(L1.A a10) {
            super(1);
            this.f147647f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f147647f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f147648f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f147649g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f147650h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147651i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f147652j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f147653k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f147654l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f147655m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f147656n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f147657o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC15962C abstractC15962C, AbstractC5607a abstractC5607a2, Function0 function02, List list, boolean z10) {
            super(2);
            this.f147649g = nVar;
            this.f147650h = function0;
            this.f147651i = localThemeScope;
            this.f147652j = abstractC5607a;
            this.f147653k = abstractC15962C;
            this.f147654l = abstractC5607a2;
            this.f147655m = function02;
            this.f147656n = list;
            this.f147657o = z10;
            this.f147648f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f147649g.getHelpersHashCode();
            this.f147649g.i();
            L1.n nVar = this.f147649g;
            composer.startReplaceGroup(973800094);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            LocalThemeScope localThemeScope = this.f147651i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f147638a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            AbstractC5607a abstractC5607a = this.f147652j;
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            C15303e.j(localThemeScope, modifierK, abstractC5607a, composer, i11 | (i12 << 6), 0);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = d.f147639a;
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarC, (Function1) objB2);
            AbstractC15962C abstractC15962C = this.f147653k;
            C15977m.a(abstractC15962C, modifierK2, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.c(-1744479259, true, new e(this.f147656n, this.f147651i, abstractC15962C, this.f147657o), composer, 54), composer, 0, 24576, 16380);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = f.f147644a;
                composer.t(objB3);
            }
            composer.P();
            o.g(this.f147651i, this.f147653k, nVar.k(companion, hVarD, (Function1) objB3), 0L, 0L, 0.0f, 0.0f, 0.0f, composer, i11, 124);
            LocalThemeScope localThemeScope2 = this.f147651i;
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = g.f147645a;
                composer.t(objB4);
            }
            composer.P();
            Modifier modifierK3 = nVar.k(companion, hVarE, (Function1) objB4);
            AbstractC5607a abstractC5607a2 = this.f147654l;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f147655m);
            Object objB5 = composer.B();
            if (zV || objB5 == companion2.a()) {
                objB5 = new h(this.f147655m);
                composer.t(objB5);
            }
            composer.P();
            C15303e.h(localThemeScope2, modifierK3, abstractC5607a2, abstractC5607a2, (Function0) objB5, composer, (i12 << 9) | (i12 << 6) | i11, 0);
            composer.P();
            if (this.f147649g.getHelpersHashCode() != helpersHashCode) {
                this.f147650h.invoke();
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
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f147659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<s.a, Unit> f147660c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f147661a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<s.a, Unit> f147662b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super s.a, Unit> function1) {
                this.f147661a = localThemeScope;
                this.f147662b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(s.a.d.f147684a);
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1710199835, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingScreen.<anonymous>.<anonymous> (ShopAndScanLandingScreen.kt:95)");
                }
                LocalThemeScope localThemeScope = this.f147661a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f147662b);
                final Function1<s.a, Unit> function1 = this.f147662b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: kq.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.k.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13729d.f(localThemeScope, (Function0) objB, composer, LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        k(LocalThemeScope localThemeScope, Activity activity, Function1<? super s.a, Unit> function1) {
            this.f147658a = localThemeScope;
            this.f147659b = activity;
            this.f147660c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Activity activity) {
            if (activity != null) {
                activity.finish();
            }
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2103441000, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingScreen.<anonymous> (ShopAndScanLandingScreen.kt:85)");
            }
            LocalThemeScope localThemeScope = this.f147658a;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116945V0, new Object[0]);
            Asset asset = new Asset(Bj.i.f2765n0, com.meijer.mobile.shopandscan.e.f116992m1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f147659b);
            final Activity activity = this.f147659b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: kq.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.k.c(activity);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13729d.d(localThemeScope, abstractC5607aD, asset, null, (Function0) objB, ComposableLambdaKt.c(1710199835, true, new a(this.f147658a, this.f147660c), composer, 54), composer, 196608 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.ViewState f147664b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<s.a, Unit> f147665c;

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, s.ViewState bVar, Function1<? super s.a, Unit> function1) {
            this.f147663a = localThemeScope;
            this.f147664b = bVar;
            this.f147665c = function1;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
                ComposerKt.U(801371217, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingScreen.<anonymous> (ShopAndScanLandingScreen.kt:102)");
            }
            LocalThemeScope localThemeScope = this.f147663a;
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
            boolean zN = this.f147664b.getIsLoading();
            AbstractC5607a abstractC5607aJ = this.f147664b.getHeaderText();
            AbstractC5607a abstractC5607aB = this.f147664b.getActionButton().getText();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f147665c) | composer.D(this.f147664b);
            final Function1<s.a, Unit> function1 = this.f147665c;
            final s.ViewState bVar = this.f147664b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: kq.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.l.c(function1, bVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            int i12 = LocalThemeScope.f15770g;
            int i13 = AbstractC5607a.f45514b;
            o.m(localThemeScope, modifierH, zN, abstractC5607aJ, abstractC5607aB, (Function0) objB, composer, (i13 << 12) | (i13 << 9) | i12);
            o.k(this.f147663a, null, this.f147664b.getIsLoading(), this.f147664b.getLoadingSpinnerMessage(), composer, i12 | (i13 << 9), 1);
            gq.o.s(this.f147663a, null, this.f147664b.getModal(), this.f147665c, composer, i12, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, s.ViewState bVar) {
            function1.invoke(bVar.getActionButton().getAction());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r25, final kotlin.AbstractC15962C r26, androidx.compose.ui.Modifier r27, long r28, long r30, float r32, float r33, float r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.o.g(Ji.M, o0.C, androidx.compose.ui.Modifier, long, long, float, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(InterfaceC16622O interfaceC16622O, AbstractC15962C abstractC15962C, int i10) {
        C16648k.d(interfaceC16622O, null, null, new a(abstractC15962C, i10, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Modifier modifier, long j10, long j11, float f10, float f11, float f12, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, abstractC15962C, modifier, j10, j11, f10, f11, f12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void k(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final boolean r17, ak.AbstractC5607a r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.o.k(Ji.M, androidx.compose.ui.Modifier, boolean, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC5607a abstractC5607a, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, z10, abstractC5607a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void m(final LocalThemeScope localThemeScope, final Modifier modifier, final boolean z10, final AbstractC5607a headerText, final AbstractC5607a actionButtonText, final Function0<Unit> onClickActionButton, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(headerText, "headerText");
        Intrinsics.j(actionButtonText, "actionButtonText");
        Intrinsics.j(onClickActionButton, "onClickActionButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2137040127);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(headerText) : composerStartRestartGroup.D(headerText) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? composerStartRestartGroup.V(actionButtonText) : composerStartRestartGroup.D(actionButtonText) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onClickActionButton) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2137040127, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingContent (ShopAndScanLandingScreen.kt:128)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = CollectionsKt.p(new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f117030z0, com.meijer.mobile.shopandscan.e.f117027y0, com.meijer.mobile.shopandscan.d.f116782g), new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f117018v0, com.meijer.mobile.shopandscan.e.f117015u0, com.meijer.mobile.shopandscan.d.f116779d), new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f117006r0, com.meijer.mobile.shopandscan.e.f117003q0, com.meijer.mobile.shopandscan.d.f116776a), new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f117024x0, com.meijer.mobile.shopandscan.e.f117021w0, com.meijer.mobile.shopandscan.d.f116778c), new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f116896B0, com.meijer.mobile.shopandscan.e.f116893A0, com.meijer.mobile.shopandscan.d.f116781f), new AnimatedLandingPageData(com.meijer.mobile.shopandscan.e.f117012t0, com.meijer.mobile.shopandscan.e.f117009s0, com.meijer.mobile.shopandscan.d.f116777b));
                composerStartRestartGroup.t(objB);
            }
            final List list = (List) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(list);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: kq.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(o.o(list));
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            AbstractC15962C abstractC15962CK = C15963D.k(0, 0.0f, (Function0) objB2, composerStartRestartGroup, 0, 3);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null), H1.h.p(16));
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new L1.A();
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB3;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = new L1.n();
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB4;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB5 = composerStartRestartGroup.B();
            if (objB5 == companion.a()) {
                objB5 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB5, a10, composerStartRestartGroup, 4544);
            composer2 = composerStartRestartGroup;
            androidx.compose.ui.layout.A.a(C16705m.d(companion3, false, new i(a10), 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new j(nVar, 0, pairH.b(), localThemeScope, headerText, abstractC15962CK, actionButtonText, onClickActionButton, list, z10)), pairH.a(), composer2, 48, 0);
            composer2.U();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: kq.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.n(localThemeScope, modifier, z10, headerText, actionButtonText, onClickActionButton, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Function0 function0, int i10, Composer composer, int i11) {
        m(localThemeScope, modifier, z10, abstractC5607a, abstractC5607a2, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kq.s.ViewState r35, final kotlin.jvm.functions.Function1<? super kq.s.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.o.p(Ji.M, androidx.compose.ui.Modifier, kq.s$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, s.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, bVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final float h(z1<H1.h> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(List list) {
        return list.size();
    }
}
