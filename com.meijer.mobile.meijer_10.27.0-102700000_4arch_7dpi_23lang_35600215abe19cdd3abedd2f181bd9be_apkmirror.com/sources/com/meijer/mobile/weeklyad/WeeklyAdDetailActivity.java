package com.meijer.mobile.weeklyad;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import Js.WeeklyAdItem;
import Js.WeeklyAdPublication;
import Pk.a;
import Ps.e;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import com.meijer.mobile.weeklyad.WeeklyAdDetailActivity;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import j0.C14801J;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.io.Serializable;
import java.util.List;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17921a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import ni.C15874z0;
import ni.P0;
import p1.C16193g;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import yl.AbstractC18227f;
import yr.C18286l;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X²\u0006\f\u0010W\u001a\u00020V8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/weeklyad/WeeklyAdDetailActivity;", "Landroidx/activity/ComponentActivity;", "", "LPj/g;", "<init>", "()V", "", "z1", "y1", "", "isYouTube", "", "url", "A1", "(ZLjava/lang/String;)V", "LJs/b;", "weeklyAdItem", "B1", "(LJs/b;)V", "", "messageResourceId", "x1", "(I)V", "LOk/c;", "coupon", "C1", "(LOk/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "onCreateAccount", "onSignIn", "LPk/a;", "action", "w1", "(LPk/a;)V", "Lyl/k;", "v", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "LCl/e;", "w", "LCl/e;", "u1", "()LCl/e;", "setMeijerIntent$ux_release", "(LCl/e;)V", "meijerIntent", "Lgi/a;", "x", "Lgi/a;", "t1", "()Lgi/a;", "setAnalyticsEngine$ux_release", "(Lgi/a;)V", "analyticsEngine", "LLs/b;", "y", "LLs/b;", "getGetFlippWeeklyAdProductDetailsCall", "()LLs/b;", "setGetFlippWeeklyAdProductDetailsCall", "(LLs/b;)V", "getFlippWeeklyAdProductDetailsCall", "LPs/e;", "z", "Lkotlin/Lazy;", "v1", "()LPs/e;", "viewModel", "LJs/e;", "A", "LJs/e;", "weeklyAdPublication", "B", "Z", "isFromShoppingList", "C", "I", "weeklyAdItemId", "LPs/e$j;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class WeeklyAdDetailActivity extends Hilt_WeeklyAdDetailActivity implements Pj.g {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private WeeklyAdPublication weeklyAdPublication;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean isFromShoppingList;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int weeklyAdItemId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Ls.b getFlippWeeklyAdProductDetailsCall;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Ps.e.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a, reason: collision with other inner class name */
        static final class C1936a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WeeklyAdDetailActivity f119157a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$a, reason: collision with other inner class name */
            static final class C1937a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119158a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f119159b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1938a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119160a;

                    C1938a(LocalThemeScope localThemeScope) {
                        this.f119160a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1864847393, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:143)");
                        }
                        Dr.g.g(this.f119160a, C16193g.c(Bs.a.f3259g, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(-1538950303, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:140)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f119277b, new Object[0]);
                    C.f.d dVar = C.f.d.f15507e;
                    LocalThemeScope localThemeScope = this.f119158a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1864847393, true, new C1938a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f119159b);
                    final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f119159b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.weeklyad.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdDetailActivity.a.C1936a.C1937a.c(weeklyAdDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1937a(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    this.f119158a = localThemeScope;
                    this.f119159b = weeklyAdDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    if (!weeklyAdDetailActivity.onNavigateUp()) {
                        weeklyAdDetailActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119161a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f119162b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f119163c;

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1369698718, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:150)");
                    }
                    if (C1936a.c(this.f119162b).getShowBottomBar()) {
                        C17917Z.a(null, this.f119161a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierI = D.i(companion, H1.h.p(4));
                        LocalThemeScope localThemeScope = this.f119161a;
                        final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f119163c;
                        final z1<e.ViewState> z1Var = this.f119162b;
                        MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                        D1.c(composerA, measurePolicyB, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C5662h.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                        C15874z0 c15874z0 = C15874z0.f151826a;
                        String strC = C16193g.c(C1936a.c(z1Var).d(), composer, 0);
                        String strC2 = C16193g.c(C1936a.c(z1Var).d(), composer, 0);
                        boolean actionButtonEnabled = C1936a.c(z1Var).getActionButtonEnabled();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(weeklyAdDetailActivity) | composer.V(z1Var);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.weeklyad.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WeeklyAdDetailActivity.a.C1936a.b.c(weeklyAdDetailActivity, z1Var);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        P0.k(localThemeScope, c15874z0, strC, (Function0) objB, null, strC2, false, 0L, actionButtonEnabled, composer, LocalThemeScope.f15770g | (C15874z0.f151827b << 3), 104);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                b(LocalThemeScope localThemeScope, z1<e.ViewState> z1Var, WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    this.f119161a = localThemeScope;
                    this.f119162b = z1Var;
                    this.f119163c = weeklyAdDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity, z1 z1Var) {
                    weeklyAdDetailActivity.v1().X(new e.i.Add(C1936a.c(z1Var).getWeeklyAdItem()));
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c */
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119164a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f119165b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f119166c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$a, reason: collision with other inner class name */
                static final class C1939a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119167a;

                    C1939a(LocalThemeScope localThemeScope) {
                        this.f119167a = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1753352860, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:171)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f119167a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, C16193g.c(com.meijer.mobile.weeklyad.c.f119279d, composer, 0), null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 48);
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
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<e.AbstractC0675e, Unit> {
                    b(Object obj) {
                        super(1, obj, Ps.e.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdDetailViewModel$Action;)V", 0);
                    }

                    public final void a(e.AbstractC0675e p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.e) this.receiver).W(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(e.AbstractC0675e abstractC0675e) {
                        a(abstractC0675e);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$c, reason: collision with other inner class name */
                /* synthetic */ class C1940c extends FunctionReferenceImpl implements Function1<Pk.a, Unit> {
                    C1940c(Object obj) {
                        super(1, obj, WeeklyAdDetailActivity.class, "onAction", "onAction(Lcom/meijer/mobile/coupon/model/common/action/CouponAction;)V", 0);
                    }

                    public final void a(Pk.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((WeeklyAdDetailActivity) this.receiver).w1(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Pk.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$d */
                /* synthetic */ class d extends FunctionReferenceImpl implements Function1<e.i, Unit> {
                    d(Object obj) {
                        super(1, obj, Ps.e.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdDetailViewModel$ShoppingListWeeklyAdAction;)V", 0);
                    }

                    public final void a(e.i p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.e) this.receiver).X(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(e.i iVar) {
                        a(iVar);
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$onCreate$1$1$3$4$1", f = "WeeklyAdDetailActivity.kt", l = {208}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$e */
                static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f119168a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ WeeklyAdDetailActivity f119169b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119170c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<e.ViewState> f119171d;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/e$g;", "effect", "", "<anonymous>", "(LPs/e$g;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$onCreate$1$1$3$4$1$1", f = "WeeklyAdDetailActivity.kt", l = {211, 211, 238, 238, 247, 247, 262, 262}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$e$a, reason: collision with other inner class name */
                    static final class C1941a extends SuspendLambda implements Function2<e.g, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f119172a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f119173b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f119174c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ WeeklyAdDetailActivity f119175d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ z1<e.ViewState> f119176e;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1941a c1941a = new C1941a(this.f119174c, this.f119175d, this.f119176e, continuation);
                            c1941a.f119173b = obj;
                            return c1941a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1941a(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity, z1<e.ViewState> z1Var, Continuation<? super C1941a> continuation) {
                            super(2, continuation);
                            this.f119174c = localThemeScope;
                            this.f119175d = weeklyAdDetailActivity;
                            this.f119176e = z1Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean l(WeeklyAdDetailActivity weeklyAdDetailActivity, e.g gVar) {
                            weeklyAdDetailActivity.w1(new a.ViewCouponDetails(((e.g.ShowCouponClippedSnackBar) gVar).getCoupon(), null, 2, null));
                            return true;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean o(WeeklyAdDetailActivity weeklyAdDetailActivity, z1 z1Var) {
                            weeklyAdDetailActivity.v1().X(new e.i.Remove(C1936a.c(z1Var).getWeeklyAdItem()));
                            return true;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
                        
                            if (Gi.i.i((Gi.i) r2, r3, r1, null, false, r5, r6, null, null, r13, 196, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x010d, code lost:
                        
                            if (Gi.i.i((Gi.i) r2, r3, null, null, true, r5, null, null, null, r13, 230, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0162, code lost:
                        
                            if (Gi.i.i((Gi.i) r2, r3, r1, null, false, r5, r7, null, null, r13, 196, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:47:0x01a0, code lost:
                        
                            if (Gi.i.i((Gi.i) r2, r3, null, null, true, r5, null, null, null, r13, 230, null) != r12) goto L55;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                            /*
                                Method dump skipped, instructions count: 490
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.a.C1936a.c.e.C1941a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: k, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(e.g gVar, Continuation<? super Unit> continuation) {
                            return ((C1941a) create(gVar, continuation)).invokeSuspend(Unit.f142422a);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new e(this.f119169b, this.f119170c, this.f119171d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    e(WeeklyAdDetailActivity weeklyAdDetailActivity, LocalThemeScope localThemeScope, z1<e.ViewState> z1Var, Continuation<? super e> continuation) {
                        super(2, continuation);
                        this.f119169b = weeklyAdDetailActivity;
                        this.f119170c = localThemeScope;
                        this.f119171d = z1Var;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f119168a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17144F<e.g> interfaceC17144FT = this.f119169b.v1().T();
                            C1941a c1941a = new C1941a(this.f119170c, this.f119169b, this.f119171d, null);
                            this.f119168a = 1;
                            if (C17154h.k(interfaceC17144FT, c1941a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity, z1<e.ViewState> z1Var) {
                    this.f119164a = localThemeScope;
                    this.f119165b = weeklyAdDetailActivity;
                    this.f119166c = z1Var;
                }

                public final void b(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    int i11;
                    Composer composer2 = composer;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer2.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer2.j()) {
                        composer2.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1483049562, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:169)");
                    }
                    if (C1936a.c(this.f119166c).m()) {
                        composer2.startReplaceGroup(-798983810);
                        LocalThemeScope localThemeScope = this.f119164a;
                        Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1753352860, true, new C1939a(localThemeScope), composer2, 54), composer2, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                        composer2.P();
                    } else if (C1936a.c(this.f119166c).l()) {
                        composer2.startReplaceGroup(-798470884);
                        LocalThemeScope localThemeScope2 = this.f119164a;
                        String strC = C16193g.c(com.meijer.mobile.weeklyad.c.f119288m, composer2, 0);
                        String strC2 = C16193g.c(com.meijer.mobile.weeklyad.c.f119281f, composer2, 0);
                        composer2.startReplaceGroup(5004770);
                        boolean zD = composer2.D(this.f119165b);
                        final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f119165b;
                        Object objB = composer2.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.weeklyad.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WeeklyAdDetailActivity.a.C1936a.c.c(weeklyAdDetailActivity);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        C18286l.b(localThemeScope2, strC, strC2, null, (Function0) objB, composer2, LocalThemeScope.f15770g, 4);
                        composer2.P();
                    } else {
                        composer2.startReplaceGroup(-798084686);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.b.d(D.h(J.f(companion, 0.0f, 1, null), contentPadding), this.f119164a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                        LocalThemeScope localThemeScope3 = this.f119164a;
                        WeeklyAdDetailActivity weeklyAdDetailActivity2 = this.f119165b;
                        z1<e.ViewState> z1Var = this.f119166c;
                        MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                        int iA = C5717f.a(composer2, 0);
                        InterfaceC5742s interfaceC5742sR = composer2.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                        InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion2.a();
                        if (composer2.k() == null) {
                            C5717f.c();
                        }
                        composer2.F();
                        if (composer2.h()) {
                            composer2.I(function0A);
                        } else {
                            composer2.s();
                        }
                        Composer composerA = D1.a(composer2);
                        D1.c(composerA, measurePolicyG, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C5664j c5664j = C5664j.f48612a;
                        C5662h.a(androidx.compose.foundation.b.d(J.h(J.i(companion, H1.h.p(60)), 0.0f, 1, null), localThemeScope3.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), composer2, 0);
                        e.ViewState viewStateC = C1936a.c(z1Var);
                        Ps.e eVarV1 = weeklyAdDetailActivity2.v1();
                        composer2.startReplaceGroup(5004770);
                        boolean zD2 = composer2.D(eVarV1);
                        Object objB2 = composer2.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new b(eVarV1);
                            composer2.t(objB2);
                        }
                        KFunction kFunction = (KFunction) objB2;
                        composer2.P();
                        composer2.startReplaceGroup(5004770);
                        boolean zD3 = composer2.D(weeklyAdDetailActivity2);
                        Object objB3 = composer2.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new C1940c(weeklyAdDetailActivity2);
                            composer2.t(objB3);
                        }
                        KFunction kFunction2 = (KFunction) objB3;
                        composer2.P();
                        Ps.e eVarV12 = weeklyAdDetailActivity2.v1();
                        composer2.startReplaceGroup(5004770);
                        boolean zD4 = composer2.D(eVarV12);
                        Object objB4 = composer2.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new d(eVarV12);
                            composer2.t(objB4);
                        }
                        composer2.P();
                        Gs.l.f(localThemeScope3, null, viewStateC, (Function1) kFunction2, (Function1) kFunction, (Function1) ((KFunction) objB4), composer2, LocalThemeScope.f15770g, 1);
                        composer2 = composer2;
                        composer2.v();
                        composer2.P();
                    }
                    composer2.startReplaceGroup(-1746271574);
                    boolean zD5 = composer2.D(this.f119165b) | composer2.D(this.f119164a) | composer2.V(this.f119166c);
                    WeeklyAdDetailActivity weeklyAdDetailActivity3 = this.f119165b;
                    LocalThemeScope localThemeScope4 = this.f119164a;
                    z1<e.ViewState> z1Var2 = this.f119166c;
                    Object objB5 = composer2.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new e(weeklyAdDetailActivity3, localThemeScope4, z1Var2, null);
                        composer2.t(objB5);
                    }
                    composer2.P();
                    androidx.compose.runtime.J.g("WeeklyAdDetailActivity", (Function2) objB5, composer2, 6);
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
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    weeklyAdDetailActivity.v1().W(e.AbstractC0675e.b.f29072a);
                    return Unit.f142422a;
                }
            }

            C1936a(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                this.f119157a = weeklyAdDetailActivity;
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
                    ComposerKt.U(1382924188, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:134)");
                }
                z1 z1VarB = o1.b(this.f119157a.v1().U(), null, composer, 0, 1);
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), null, ComposableLambdaKt.c(-1538950303, true, new C1937a(AdsTheme, this.f119157a), composer, 54), ComposableLambdaKt.c(-1369698718, true, new b(AdsTheme, z1VarB, this.f119157a), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1483049562, true, new c(AdsTheme, this.f119157a, z1VarB), composer, 54), composer, 3456, 12582912, 131058);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1217186573, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous> (WeeklyAdDetailActivity.kt:133)");
            }
            K.b(null, ComposableLambdaKt.c(1382924188, true, new C1936a(WeeklyAdDetailActivity.this), composer, 54), composer, 48, 1);
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
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f119177f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119177f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119178f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f119178f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119178f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119179f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119179f = function0;
            this.f119180g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119179f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119180g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(WeeklyAdDetailActivity weeklyAdDetailActivity, Ok.c cVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        WeeklyAdItem weeklyAdItem = weeklyAdDetailActivity.v1().U().getValue().getWeeklyAdItem();
        track.h("promoCodeBlock", weeklyAdItem != null ? Long.valueOf(weeklyAdItem.getAdBlockId()).toString() : null);
        Qk.b bVar = Qk.b.f30831a;
        track.c(bVar.i(cVar.getOfferId()));
        track.c(bVar.h("weeklyad"));
        WeeklyAdPublication weeklyAdPublication = weeklyAdDetailActivity.weeklyAdPublication;
        if (weeklyAdPublication != null) {
            track.h("flyerTypeName", weeklyAdPublication.getTitle());
            track.h("flyerInternalRunName", String.valueOf(weeklyAdPublication.getFlyerRunId()));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ps.e v1() {
        return (Ps.e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(int messageResourceId) {
        new Pj.f(this, messageResourceId, this).g();
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    @Override // Pj.g
    public void onCreateAccount() {
        startActivity(Al.f.f666a.a(this, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    public final InterfaceC14261a t1() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Cl.e u1() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public void w1(Pk.a action) {
        Intrinsics.j(action, "action");
        if ((action instanceof a.NotInterested) || (action instanceof a.Unclip)) {
            v1().onAction(action);
            return;
        }
        if (action instanceof a.Clip) {
            v1().onAction(action);
            C1(((a.Clip) action).getCoupon());
        } else if (action instanceof a.ViewCouponDetails) {
            startActivity(u1().f(((a.ViewCouponDetails) action).getCoupon(), true, true, false, null));
        } else {
            if (!(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(Cl.e.l(u1(), this, null, null, getFeatureManager().e(AbstractC18227f.M.f170552h), 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(boolean isYouTube, String url) {
        t1().b(C14476c.a("event: weekly ad: video start"), C14476c.c("weekly ad"), C14476c.g("weekly ad"));
        if (isYouTube) {
            startActivity(u1().r(url));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(WeeklyAdItem weeklyAdItem) {
        t1().b(C14476c.a("event: weekly ad: view shopping list"), C14476c.c("weekly ad"), C14476c.g("weekly ad"));
        startActivity(u1().E(this, weeklyAdItem, getFeatureManager().e(AbstractC18227f.O.f170554h)));
    }

    private final void C1(final Ok.c coupon) {
        t1().h(C14476c.a("WeeklyAd Clip Coupon"), new Function1() { // from class: com.meijer.mobile.weeklyad.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeeklyAdDetailActivity.D1(this.f119295a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1() {
        t1().b(C14476c.a("event: weekly ad: add item to list"), C14476c.c("weekly ad"), C14476c.g("weekly ad"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1() {
        t1().b(C14476c.a("event: weekly ad: add item to list"), C14476c.c("weekly ad"), C14476c.g("weekly ad"));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.isFromShoppingList) {
            bk.c.b(this, 1, Bj.d.f2592a, Bj.d.f2595d, 0, 8, null);
        }
    }

    @Override // com.meijer.mobile.weeklyad.Hilt_WeeklyAdDetailActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Serializable serializableExtra;
        List<Long> listM;
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        getLifecycle().a(v1());
        boolean z10 = false;
        this.weeklyAdItemId = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.weeklyad.product", 0);
        int intExtra = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id", 0);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.weeklyad.related.coupons", Object.class);
        } else {
            serializableExtra = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.weeklyad.related.coupons");
            if (serializableExtra == null) {
                serializableExtra = null;
            }
        }
        if (serializableExtra != null) {
            listM = (List) serializableExtra;
        } else {
            listM = CollectionsKt.m();
        }
        if (intExtra == 0) {
            z10 = true;
        }
        this.isFromShoppingList = z10;
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            parcelable = (Parcelable) intent2.getParcelableExtra("com.meijer.mobile.meijer.activity.weeklyad.publication", WeeklyAdPublication.class);
        } else {
            Parcelable parcelableExtra = intent2.getParcelableExtra("com.meijer.mobile.meijer.activity.weeklyad.publication");
            if (!(parcelableExtra instanceof WeeklyAdPublication)) {
                parcelableExtra = null;
            }
            parcelable = (WeeklyAdPublication) parcelableExtra;
        }
        this.weeklyAdPublication = (WeeklyAdPublication) parcelable;
        v1().V(this.weeklyAdItemId, intExtra, this.isFromShoppingList, listM);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1217186573, true, new a()), 1, null);
    }

    @Override // Pj.g
    public void onSignIn() {
        startActivity(Al.k.b(this, false, null, 536871412, null, null, null, 118, null).putExtra("com.meijer.mobile.meijer.activity.weeklyad.product", this.weeklyAdItemId));
    }
}
