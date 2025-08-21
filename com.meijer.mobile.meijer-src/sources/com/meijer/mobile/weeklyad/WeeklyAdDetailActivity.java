package com.meijer.mobile.weeklyad;

import Js.WeeklyAdItem;
import Js.WeeklyAdPublication;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import Ps.e;
import Qk.a;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.weeklyad.WeeklyAdDetailActivity;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j0.C14889J;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.io.Serializable;
import java.util.List;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C17987a1;
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
import mv.InterfaceC15783O;
import oi.C16208z0;
import oi.P0;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import yr.C18357l;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X²\u0006\f\u0010W\u001a\u00020V8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/weeklyad/WeeklyAdDetailActivity;", "Landroidx/activity/ComponentActivity;", "", "LQj/g;", "<init>", "()V", "", "z1", "y1", "", "isYouTube", "", "url", "A1", "(ZLjava/lang/String;)V", "LJs/b;", "weeklyAdItem", "B1", "(LJs/b;)V", "", "messageResourceId", "x1", "(I)V", "LPk/c;", "coupon", "C1", "(LPk/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "onCreateAccount", "onSignIn", "LQk/a;", "action", "w1", "(LQk/a;)V", "Lzl/k;", "v", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "LDl/e;", "w", "LDl/e;", "u1", "()LDl/e;", "setMeijerIntent$ux_release", "(LDl/e;)V", "meijerIntent", "Lhi/a;", "x", "Lhi/a;", "t1", "()Lhi/a;", "setAnalyticsEngine$ux_release", "(Lhi/a;)V", "analyticsEngine", "LLs/b;", "y", "LLs/b;", "getGetFlippWeeklyAdProductDetailsCall", "()LLs/b;", "setGetFlippWeeklyAdProductDetailsCall", "(LLs/b;)V", "getFlippWeeklyAdProductDetailsCall", "LPs/e;", "z", "Lkotlin/Lazy;", "v1", "()LPs/e;", "viewModel", "LJs/e;", "A", "LJs/e;", "weeklyAdPublication", "B", "Z", "isFromShoppingList", "C", "I", "weeklyAdItemId", "LPs/e$j;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WeeklyAdDetailActivity extends Hilt_WeeklyAdDetailActivity implements Qj.g {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private WeeklyAdPublication weeklyAdPublication;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean isFromShoppingList;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int weeklyAdItemId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Ls.b getFlippWeeklyAdProductDetailsCall;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Ps.e.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a, reason: collision with other inner class name */
        static final class C1943a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WeeklyAdDetailActivity f120130a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$a, reason: collision with other inner class name */
            static final class C1944a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120131a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f120132b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1945a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f120133a;

                    C1945a(LocalThemeScope localThemeScope) {
                        this.f120133a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1864847393, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:143)");
                        }
                        Dr.g.g(this.f120133a, C16338g.c(Bs.a.f3665g, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(-1538950303, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:140)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f120250b, new Object[0]);
                    C.f.d dVar = C.f.d.f17051e;
                    LocalThemeScope localThemeScope = this.f120131a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1864847393, true, new C1945a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f120132b);
                    final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f120132b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.weeklyad.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdDetailActivity.a.C1943a.C1944a.c(weeklyAdDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1944a(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    this.f120131a = localThemeScope;
                    this.f120132b = weeklyAdDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    if (!weeklyAdDetailActivity.onNavigateUp()) {
                        weeklyAdDetailActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120134a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f120135b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f120136c;

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1369698718, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:150)");
                    }
                    if (C1943a.c(this.f120135b).getShowBottomBar()) {
                        C17983Z.a(null, this.f120134a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierI = D.i(companion, H1.h.p(4));
                        LocalThemeScope localThemeScope = this.f120134a;
                        final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f120136c;
                        final z1<e.ViewState> z1Var = this.f120135b;
                        MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                        InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion2.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyB, companion2.e());
                        D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C5804h.a(InterfaceC14888I.b(C14889J.f139620a, companion, 1.0f, false, 2, null), composer, 0);
                        C16208z0 c16208z0 = C16208z0.f154285a;
                        String strC = C16338g.c(C1943a.c(z1Var).d(), composer, 0);
                        String strC2 = C16338g.c(C1943a.c(z1Var).d(), composer, 0);
                        boolean actionButtonEnabled = C1943a.c(z1Var).getActionButtonEnabled();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(weeklyAdDetailActivity) | composer.V(z1Var);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.weeklyad.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WeeklyAdDetailActivity.a.C1943a.b.c(weeklyAdDetailActivity, z1Var);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        P0.k(localThemeScope, c16208z0, strC, (Function0) objB, null, strC2, false, 0L, actionButtonEnabled, composer, LocalThemeScope.f17314g | (C16208z0.f154286b << 3), 104);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                b(LocalThemeScope localThemeScope, z1<e.ViewState> z1Var, WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    this.f120134a = localThemeScope;
                    this.f120135b = z1Var;
                    this.f120136c = weeklyAdDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity, z1 z1Var) {
                    weeklyAdDetailActivity.v1().X(new e.i.Add(C1943a.c(z1Var).getWeeklyAdItem()));
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c */
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120137a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdDetailActivity f120138b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f120139c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$a, reason: collision with other inner class name */
                static final class C1946a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f120140a;

                    C1946a(LocalThemeScope localThemeScope) {
                        this.f120140a = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1753352860, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdDetailActivity.kt:171)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f120140a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, C16338g.c(com.meijer.mobile.weeklyad.c.f120252d, composer, 0), null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 48);
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
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<e.AbstractC0495e, Unit> {
                    b(Object obj) {
                        super(1, obj, Ps.e.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdDetailViewModel$Action;)V", 0);
                    }

                    public final void a(e.AbstractC0495e p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.e) this.receiver).W(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(e.AbstractC0495e abstractC0495e) {
                        a(abstractC0495e);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$c, reason: collision with other inner class name */
                /* synthetic */ class C1947c extends FunctionReferenceImpl implements Function1<Qk.a, Unit> {
                    C1947c(Object obj) {
                        super(1, obj, WeeklyAdDetailActivity.class, "onAction", "onAction(Lcom/meijer/mobile/coupon/model/common/action/CouponAction;)V", 0);
                    }

                    public final void a(Qk.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((WeeklyAdDetailActivity) this.receiver).w1(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Qk.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
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
                        return Unit.f143329a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$onCreate$1$1$3$4$1", f = "WeeklyAdDetailActivity.kt", l = {208}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$e */
                static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f120141a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ WeeklyAdDetailActivity f120142b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f120143c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<e.ViewState> f120144d;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/e$g;", "effect", "", "<anonymous>", "(LPs/e$g;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$onCreate$1$1$3$4$1$1", f = "WeeklyAdDetailActivity.kt", l = {211, 211, 238, 238, 247, 247, 262, 262}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity$a$a$c$e$a, reason: collision with other inner class name */
                    static final class C1948a extends SuspendLambda implements Function2<e.g, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f120145a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f120146b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f120147c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ WeeklyAdDetailActivity f120148d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ z1<e.ViewState> f120149e;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1948a c1948a = new C1948a(this.f120147c, this.f120148d, this.f120149e, continuation);
                            c1948a.f120146b = obj;
                            return c1948a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1948a(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity, z1<e.ViewState> z1Var, Continuation<? super C1948a> continuation) {
                            super(2, continuation);
                            this.f120147c = localThemeScope;
                            this.f120148d = weeklyAdDetailActivity;
                            this.f120149e = z1Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean l(WeeklyAdDetailActivity weeklyAdDetailActivity, e.g gVar) {
                            weeklyAdDetailActivity.w1(new a.ViewCouponDetails(((e.g.ShowCouponClippedSnackBar) gVar).getCoupon(), null, 2, null));
                            return true;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean o(WeeklyAdDetailActivity weeklyAdDetailActivity, z1 z1Var) {
                            weeklyAdDetailActivity.v1().X(new e.i.Remove(C1943a.c(z1Var).getWeeklyAdItem()));
                            return true;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
                        
                            if (Hi.i.i((Hi.i) r2, r3, r1, null, false, r5, r6, null, null, r13, 196, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x010d, code lost:
                        
                            if (Hi.i.i((Hi.i) r2, r3, null, null, true, r5, null, null, null, r13, 230, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0162, code lost:
                        
                            if (Hi.i.i((Hi.i) r2, r3, r1, null, false, r5, r7, null, null, r13, 196, null) != r12) goto L55;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:47:0x01a0, code lost:
                        
                            if (Hi.i.i((Hi.i) r2, r3, null, null, true, r5, null, null, null, r13, 230, null) != r12) goto L55;
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
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.weeklyad.WeeklyAdDetailActivity.a.C1943a.c.e.C1948a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: k, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(e.g gVar, Continuation<? super Unit> continuation) {
                            return ((C1948a) create(gVar, continuation)).invokeSuspend(Unit.f143329a);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new e(this.f120142b, this.f120143c, this.f120144d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    e(WeeklyAdDetailActivity weeklyAdDetailActivity, LocalThemeScope localThemeScope, z1<e.ViewState> z1Var, Continuation<? super e> continuation) {
                        super(2, continuation);
                        this.f120142b = weeklyAdDetailActivity;
                        this.f120143c = localThemeScope;
                        this.f120144d = z1Var;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f120141a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC16553F<e.g> interfaceC16553FT = this.f120142b.v1().T();
                            C1948a c1948a = new C1948a(this.f120143c, this.f120142b, this.f120144d, null);
                            this.f120141a = 1;
                            if (C16563h.k(interfaceC16553FT, c1948a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, WeeklyAdDetailActivity weeklyAdDetailActivity, z1<e.ViewState> z1Var) {
                    this.f120137a = localThemeScope;
                    this.f120138b = weeklyAdDetailActivity;
                    this.f120139c = z1Var;
                }

                public final void b(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    if (C1943a.c(this.f120139c).m()) {
                        composer2.startReplaceGroup(-798983810);
                        LocalThemeScope localThemeScope = this.f120137a;
                        Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1753352860, true, new C1946a(localThemeScope), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                        composer2.P();
                    } else if (C1943a.c(this.f120139c).l()) {
                        composer2.startReplaceGroup(-798470884);
                        LocalThemeScope localThemeScope2 = this.f120137a;
                        String strC = C16338g.c(com.meijer.mobile.weeklyad.c.f120261m, composer2, 0);
                        String strC2 = C16338g.c(com.meijer.mobile.weeklyad.c.f120254f, composer2, 0);
                        composer2.startReplaceGroup(5004770);
                        boolean zD = composer2.D(this.f120138b);
                        final WeeklyAdDetailActivity weeklyAdDetailActivity = this.f120138b;
                        Object objB = composer2.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.weeklyad.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WeeklyAdDetailActivity.a.C1943a.c.c(weeklyAdDetailActivity);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        C18357l.b(localThemeScope2, strC, strC2, null, (Function0) objB, composer2, LocalThemeScope.f17314g, 4);
                        composer2.P();
                    } else {
                        composer2.startReplaceGroup(-798084686);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.b.d(D.h(J.f(companion, 0.0f, 1, null), contentPadding), this.f120137a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                        LocalThemeScope localThemeScope3 = this.f120137a;
                        WeeklyAdDetailActivity weeklyAdDetailActivity2 = this.f120138b;
                        z1<e.ViewState> z1Var = this.f120139c;
                        MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                        int iA = C5859f.a(composer2, 0);
                        InterfaceC5884s interfaceC5884sR = composer2.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                        InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion2.a();
                        if (composer2.k() == null) {
                            C5859f.c();
                        }
                        composer2.F();
                        if (composer2.h()) {
                            composer2.I(function0A);
                        } else {
                            composer2.s();
                        }
                        Composer composerA = D1.a(composer2);
                        D1.c(composerA, measurePolicyG, companion2.e());
                        D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C5806j c5806j = C5806j.f48836a;
                        C5804h.a(androidx.compose.foundation.b.d(J.h(J.i(companion, H1.h.p(60)), 0.0f, 1, null), localThemeScope3.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), composer2, 0);
                        e.ViewState viewStateC = C1943a.c(z1Var);
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
                            objB3 = new C1947c(weeklyAdDetailActivity2);
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
                        Gs.l.f(localThemeScope3, null, viewStateC, (Function1) kFunction2, (Function1) kFunction, (Function1) ((KFunction) objB4), composer2, LocalThemeScope.f17314g, 1);
                        composer2 = composer2;
                        composer2.v();
                        composer2.P();
                    }
                    composer2.startReplaceGroup(-1746271574);
                    boolean zD5 = composer2.D(this.f120138b) | composer2.D(this.f120137a) | composer2.V(this.f120139c);
                    WeeklyAdDetailActivity weeklyAdDetailActivity3 = this.f120138b;
                    LocalThemeScope localThemeScope4 = this.f120137a;
                    z1<e.ViewState> z1Var2 = this.f120139c;
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
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                    weeklyAdDetailActivity.v1().W(e.AbstractC0495e.b.f26954a);
                    return Unit.f143329a;
                }
            }

            C1943a(WeeklyAdDetailActivity weeklyAdDetailActivity) {
                this.f120130a = weeklyAdDetailActivity;
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
                z1 z1VarB = o1.b(this.f120130a.v1().U(), null, composer, 0, 1);
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), null, ComposableLambdaKt.c(-1538950303, true, new C1944a(AdsTheme, this.f120130a), composer, 54), ComposableLambdaKt.c(-1369698718, true, new b(AdsTheme, z1VarB, this.f120130a), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1483049562, true, new c(AdsTheme, this.f120130a, z1VarB), composer, 54), composer, 3456, 12582912, 131058);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
            K.b(null, ComposableLambdaKt.c(1382924188, true, new C1943a(WeeklyAdDetailActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120150f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f120150f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f120150f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120151f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f120151f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f120151f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f120152f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120153g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f120152f = function0;
            this.f120153g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f120152f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f120153g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(WeeklyAdDetailActivity weeklyAdDetailActivity, Pk.c cVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        WeeklyAdItem weeklyAdItem = weeklyAdDetailActivity.v1().U().getValue().getWeeklyAdItem();
        track.h("promoCodeBlock", weeklyAdItem != null ? Long.valueOf(weeklyAdItem.getAdBlockId()).toString() : null);
        Rk.b bVar = Rk.b.f33418a;
        track.c(bVar.i(cVar.getOfferId()));
        track.c(bVar.h("weeklyad"));
        WeeklyAdPublication weeklyAdPublication = weeklyAdDetailActivity.weeklyAdPublication;
        if (weeklyAdPublication != null) {
            track.h("flyerTypeName", weeklyAdPublication.getTitle());
            track.h("flyerInternalRunName", String.valueOf(weeklyAdPublication.getFlyerRunId()));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ps.e v1() {
        return (Ps.e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(int messageResourceId) {
        new Qj.f(this, messageResourceId, this).g();
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    public final InterfaceC14523a t1() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Dl.e u1() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public void w1(Qk.a action) {
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
            startActivity(Dl.e.l(u1(), this, null, null, getFeatureManager().e(AbstractC18503f.M.f172852h), 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(boolean isYouTube, String url) {
        t1().h(C14756c.a("event: weekly ad: video start"), C14756c.c("weekly ad"), C14756c.g("weekly ad"));
        if (isYouTube) {
            startActivity(u1().r(url));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(WeeklyAdItem weeklyAdItem) {
        t1().h(C14756c.a("event: weekly ad: view shopping list"), C14756c.c("weekly ad"), C14756c.g("weekly ad"));
        startActivity(u1().E(this, weeklyAdItem, getFeatureManager().e(AbstractC18503f.O.f172854h)));
    }

    private final void C1(final Pk.c coupon) {
        t1().b(C14756c.a("WeeklyAd Clip Coupon"), new Function1() { // from class: com.meijer.mobile.weeklyad.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeeklyAdDetailActivity.D1(this.f120268a, coupon, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1() {
        t1().h(C14756c.a("event: weekly ad: add item to list"), C14756c.c("weekly ad"), C14756c.g("weekly ad"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1() {
        t1().h(C14756c.a("event: weekly ad: add item to list"), C14756c.c("weekly ad"), C14756c.g("weekly ad"));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.isFromShoppingList) {
            ck.c.b(this, 1, Cj.d.f4637a, Cj.d.f4640d, 0, 8, null);
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
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1217186573, true, new a()), 1, null);
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, 536871412, null, null, null, 118, null).putExtra("com.meijer.mobile.meijer.activity.weeklyad.product", this.weeklyAdItemId));
    }
}
