package com.meijer.mobile.meijer.activity.rewards;

import Al.p;
import Bj.o;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.C14476c;
import j0.InterfaceC14794C;
import kotlin.C17921a1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import nk.MccProgram;
import p1.C16193g;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import un.C17281B;
import un.C17283D;
import xn.e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/InProgressMccDetailActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lg/a;", "result", "", "t1", "(Lg/a;)V", "p1", "u1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LCl/e;", "v", "LCl/e;", "q1", "()LCl/e;", "setDeeplinkParser", "(LCl/e;)V", "deeplinkParser", "Lgi/a;", "w", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lxn/e;", "x", "Lkotlin/Lazy;", "s1", "()Lxn/e;", "viewModel", "Lg/c;", "Landroid/content/Intent;", "y", "Lg/c;", "mccOptOutResultLauncher", "Lnk/b;", "r1", "()Lnk/b;", "mccProgram", "Lxn/e$c;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InProgressMccDetailActivity extends Hilt_InProgressMccDetailActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cl.e deeplinkParser;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(xn.e.class), new d(this), new c(this), new e(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> mccOptOutResultLauncher = registerForActivityResult(new h.i(), new a());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14146b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, InProgressMccDetailActivity.this, InProgressMccDetailActivity.class, "handleMccOptOutResult", "handleMccOptOutResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            InProgressMccDetailActivity.this.t1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InProgressMccDetailActivity f111617a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1726a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111618a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f111619b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1727a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111620a;

                    C1727a(LocalThemeScope localThemeScope) {
                        this.f111620a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-66555276, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:91)");
                        }
                        Dr.g.g(this.f111620a, C16193g.c(Y.f100176l8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(469069620, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:90)");
                    }
                    LocalThemeScope localThemeScope = this.f111618a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-66555276, true, new C1727a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111619b);
                    final InProgressMccDetailActivity inProgressMccDetailActivity = this.f111619b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InProgressMccDetailActivity.b.a.C1726a.c(inProgressMccDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f15507e, 0.0f, false, AbstractC5607a.INSTANCE.d(o.f3035p, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1726a(LocalThemeScope localThemeScope, InProgressMccDetailActivity inProgressMccDetailActivity) {
                    this.f111618a = localThemeScope;
                    this.f111619b = inProgressMccDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InProgressMccDetailActivity inProgressMccDetailActivity) {
                    if (!inProgressMccDetailActivity.onNavigateUp()) {
                        inProgressMccDetailActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$b, reason: collision with other inner class name */
            static final class C1728b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111621a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f111622b;

                C1728b(LocalThemeScope localThemeScope, z1<e.ViewState> z1Var) {
                    this.f111621a = localThemeScope;
                    this.f111622b = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1127452499, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:98)");
                    }
                    C17281B.b(this.f111621a, null, a.c(this.f111622b), composer, LocalThemeScope.f15770g, 1);
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
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111623a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f111624b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f111625c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1729a extends FunctionReferenceImpl implements Function1<e.a, Unit> {
                    C1729a(Object obj) {
                        super(1, obj, xn.e.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/viewmodel/meijercreditcard/InProgressMccDetailViewModel$Action;)V", 0);
                    }

                    public final void a(e.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((xn.e) this.receiver).q(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(e.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, InProgressMccDetailActivity inProgressMccDetailActivity, z1<e.ViewState> z1Var) {
                    this.f111623a = localThemeScope;
                    this.f111624b = inProgressMccDetailActivity;
                    this.f111625c = z1Var;
                }

                public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-87885221, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:101)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(companion, contentPadding);
                    LocalThemeScope localThemeScope = this.f111623a;
                    InProgressMccDetailActivity inProgressMccDetailActivity = this.f111624b;
                    z1<e.ViewState> z1Var = this.f111625c;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5664j c5664j = C5664j.f48612a;
                    C5662h.a(androidx.compose.foundation.b.d(J.i(J.h(companion, 0.0f, 1, null), H1.h.p(HttpResponseStatus.SUCCESS_OK)), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), composer, 0);
                    e.ViewState viewStateC = a.c(z1Var);
                    xn.e eVarS1 = inProgressMccDetailActivity.s1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(eVarS1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1729a(eVarS1);
                        composer.t(objB);
                    }
                    composer.P();
                    C17283D.b(localThemeScope, null, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 1);
                    composer.v();
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

            a(InProgressMccDetailActivity inProgressMccDetailActivity) {
                this.f111617a = inProgressMccDetailActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1375195993, i11, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:82)");
                }
                z1 z1VarB = o1.b(this.f111617a.s1().o(), null, composer, 0, 1);
                C17921a1.a(androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), null, ComposableLambdaKt.c(469069620, true, new C1726a(AdsTheme, this.f111617a), composer, 54), ComposableLambdaKt.c(1127452499, true, new C1728b(AdsTheme, z1VarB), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-87885221, true, new c(AdsTheme, this.f111617a, z1VarB), composer, 54), composer, 3456, 12582912, 131058);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final e.ViewState c(z1<e.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$onCreate$1$2$1", f = "InProgressMccDetailActivity.kt", l = {119}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$b, reason: collision with other inner class name */
        static final class C1730b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111626a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InProgressMccDetailActivity f111627b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1730b(InProgressMccDetailActivity inProgressMccDetailActivity, Continuation<? super C1730b> continuation) {
                super(2, continuation);
                this.f111627b = inProgressMccDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1730b(this.f111627b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxn/e$b;", "effect", "", "<anonymous>", "(Lxn/e$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$onCreate$1$2$1$1", f = "InProgressMccDetailActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<e.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111628a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111629b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f111630c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InProgressMccDetailActivity inProgressMccDetailActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f111630c = inProgressMccDetailActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f111630c, continuation);
                    aVar.f111629b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e.b bVar, Continuation<? super Unit> continuation) {
                    return ((a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f111628a == 0) {
                        ResultKt.b(obj);
                        e.b bVar = (e.b) this.f111629b;
                        if (Intrinsics.e(bVar, e.b.a.f169759a)) {
                            this.f111630c.p1();
                        } else if (Intrinsics.e(bVar, e.b.C2724b.f169760a)) {
                            this.f111630c.u1();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1730b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111626a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<e.b> interfaceC17144FN = this.f111627b.s1().n();
                    a aVar = new a(this.f111627b, null);
                    this.f111626a = 1;
                    if (C17154h.k(interfaceC17144FN, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1413011720, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous> (InProgressMccDetailActivity.kt:81)");
            }
            K.b(null, ComposableLambdaKt.c(1375195993, true, new a(InProgressMccDetailActivity.this), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(InProgressMccDetailActivity.this);
            InProgressMccDetailActivity inProgressMccDetailActivity = InProgressMccDetailActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1730b(inProgressMccDetailActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("InProgressMccDetailActivity", (Function2) objB, composer, 6);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111631f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111631f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111631f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111632f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111632f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111632f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111633f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111633f = function0;
            this.f111634g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111633f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111634g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Cl.e q1() {
        Cl.e eVar = this.deeplinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("deeplinkParser");
        return null;
    }

    public final xn.e s1() {
        return (xn.e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1() {
        q1().v(this);
    }

    private final MccProgram r1() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_MCC_PROGRAM", MccProgram.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_MCC_PROGRAM");
            if (!(parcelableExtra instanceof MccProgram)) {
                parcelableExtra = null;
            }
            parcelable = (MccProgram) parcelableExtra;
        }
        MccProgram mccProgram = (MccProgram) parcelable;
        if (mccProgram == null) {
            return new MccProgram(null, 0.0f, 0.0f, 7, null);
        }
        return mccProgram;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(C14145a result) {
        if (result.getResultCode() == 3301) {
            setResult(3301);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1() {
        getAnalyticsEngine().b(C14476c.a("event: mperks: rewards: mcard: DR opt out"), C14476c.c("mperks: rewards: mcard"), C14476c.g("mperks"));
        this.mccOptOutResultLauncher.a(p.f690a.b(this));
    }

    @Override // com.meijer.mobile.meijer.activity.rewards.Hilt_InProgressMccDetailActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s1().p(r1());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1413011720, true, new b()), 1, null);
    }
}
