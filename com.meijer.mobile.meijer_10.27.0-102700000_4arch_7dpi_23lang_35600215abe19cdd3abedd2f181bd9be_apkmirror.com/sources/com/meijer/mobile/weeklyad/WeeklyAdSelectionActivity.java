package com.meijer.mobile.weeklyad;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import Jk.AppVersion;
import Js.WeeklyAdPublication;
import Oj.a;
import P0.e;
import Ps.i;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13588d;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17929d0;
import kotlin.C17932e0;
import kotlin.C17963o1;
import kotlin.EnumC17935f0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16381K;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import yl.AbstractC18227f;
import yr.C18286l;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010I¨\u0006W²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\f\u0010T\u001a\u00020S8\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u00020U8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/weeklyad/WeeklyAdSelectionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LJs/e;", "weeklyAdPublication", "", "C1", "(LJs/e;)V", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LJk/a;", "v", "LJk/a;", "u1", "()LJk/a;", "setAppVersion$ux_release", "(LJk/a;)V", "appVersion", "Lgi/a;", "w", "Lgi/a;", "t1", "()Lgi/a;", "setAnalyticsEngine$ux_release", "(Lgi/a;)V", "analyticsEngine", "LAl/g;", "x", "LAl/g;", "v1", "()LAl/g;", "setFeatureEntryPoint$ux_release", "(LAl/g;)V", "featureEntryPoint", "Lyo/k;", "y", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lyl/k;", "z", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "Lps/L;", "A", "Lkotlin/Lazy;", "w1", "()Lps/L;", "navigationDrawerViewModel", "LPs/i;", "B", "y1", "()LPs/i;", "weeklyAdSelectionViewModel", "Lps/g;", "C", "x1", "()Lps/g;", "navigationHelper", "", "D", "I", "flyerId", "E", "productId", "F", "a", "LPs/i$c;", "viewState", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lx0/c1;", "scaffoldState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class WeeklyAdSelectionActivity extends Hilt_WeeklyAdSelectionActivity {

    /* renamed from: G, reason: collision with root package name */
    public static final int f119182G = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16382L.class), new d(this), new c(this), new e(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy weeklyAdSelectionViewModel = new e0(Reflection.b(Ps.i.class), new g(this), new f(this), new h(null, this));

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.weeklyad.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeeklyAdSelectionActivity.z1(this.f119306a);
        }
    });

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int flyerId;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int productId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C17927c1> f119194a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdSelectionActivity f119195b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f119196c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f119197d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<i.ViewState> f119198e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$a, reason: collision with other inner class name */
            static final class C1942a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119199a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdSelectionActivity f119200b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1943a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119201a;

                    C1943a(LocalThemeScope localThemeScope) {
                        this.f119201a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2024967583, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:134)");
                        }
                        Dr.g.g(this.f119201a, C16193g.c(Bs.a.f3259g, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(-747754079, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:133)");
                    }
                    LocalThemeScope localThemeScope = this.f119199a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-2024967583, true, new C1943a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f119200b);
                    final WeeklyAdSelectionActivity weeklyAdSelectionActivity = this.f119200b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.weeklyad.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdSelectionActivity.b.a.C1942a.c(weeklyAdSelectionActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.a.s.f15358e, 0.0f, false, AbstractC5607a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f119280e, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (C.a.s.f15359f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1942a(LocalThemeScope localThemeScope, WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
                    this.f119199a = localThemeScope;
                    this.f119200b = weeklyAdSelectionActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
                    weeklyAdSelectionActivity.x1().j();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$b, reason: collision with other inner class name */
            static final class C1944b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119202a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdSelectionActivity f119203b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f119204c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f119205d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1945a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                    C1945a(Object obj) {
                        super(1, obj, C16395g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16373C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16395g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16373C abstractC16373C) {
                        a(abstractC16373C);
                        return Unit.f142422a;
                    }
                }

                C1944b(LocalThemeScope localThemeScope, WeeklyAdSelectionActivity weeklyAdSelectionActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2) {
                    this.f119202a = localThemeScope;
                    this.f119203b = weeklyAdSelectionActivity;
                    this.f119204c = z1Var;
                    this.f119205d = z1Var2;
                }

                public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-627333449, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:142)");
                    }
                    LocalThemeScope localThemeScope = this.f119202a;
                    HeaderDecorator headerDecoratorK = b.k(this.f119204c);
                    DrawerLayoutDecorator drawerLayoutDecoratorL = b.l(this.f119205d);
                    AppVersion appVersionU1 = this.f119203b.u1();
                    C16395g c16395gX1 = this.f119203b.x1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16395gX1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1945a(c16395gX1);
                        composer.t(objB);
                    }
                    composer.P();
                    C16372B.h(localThemeScope, headerDecoratorK, drawerLayoutDecoratorL, appVersionU1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119206a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdSelectionActivity f119207b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<i.ViewState> f119208c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1946a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119209a;

                    C1946a(LocalThemeScope localThemeScope) {
                        this.f119209a = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1690420630, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:174)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f119209a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
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
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$a$c$b, reason: collision with other inner class name */
                /* synthetic */ class C1947b extends FunctionReferenceImpl implements Function1<i.a, Unit> {
                    C1947b(Object obj) {
                        super(1, obj, Ps.i.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdSelectionViewModel$Action;)V", 0);
                    }

                    public final void a(i.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.i) this.receiver).u(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(i.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
                    }
                }

                public final void b(InterfaceC14794C innerPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(innerPadding, "innerPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(innerPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-88384038, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:150)");
                    }
                    Oj.a loadingState = b.g(this.f119208c).getLoadingState();
                    if (loadingState instanceof a.Failed) {
                        composer.startReplaceGroup(-233772359);
                        Modifier modifierH = D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                        C5658d.f fVarB = C5658d.f48555a.b();
                        e.b bVarG = P0.e.INSTANCE.g();
                        LocalThemeScope localThemeScope = this.f119206a;
                        final WeeklyAdSelectionActivity weeklyAdSelectionActivity = this.f119207b;
                        MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion.a();
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
                        D1.c(composerA, measurePolicyA, companion.e());
                        D1.c(composerA, interfaceC5742sR, companion.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion.f());
                        C14815g c14815g = C14815g.f139108a;
                        String strC = C16193g.c(com.meijer.mobile.weeklyad.c.f119288m, composer, 0);
                        String strC2 = C16193g.c(com.meijer.mobile.weeklyad.c.f119281f, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(weeklyAdSelectionActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.weeklyad.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WeeklyAdSelectionActivity.b.a.c.c(weeklyAdSelectionActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C18286l.b(localThemeScope, strC, strC2, null, (Function0) objB, composer, LocalThemeScope.f15770g, 4);
                        composer.v();
                        composer.P();
                    } else if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                        composer.startReplaceGroup(-232660358);
                        LocalThemeScope localThemeScope2 = this.f119206a;
                        Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(-1690420630, true, new C1946a(localThemeScope2), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                        composer.P();
                    } else {
                        if (!(loadingState instanceof a.NotLoading)) {
                            composer.startReplaceGroup(962288862);
                            composer.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-232175642);
                        LocalThemeScope localThemeScope3 = this.f119206a;
                        Modifier modifierH2 = D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                        i.ViewState viewStateG = b.g(this.f119208c);
                        Object objY1 = this.f119207b.y1();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(objY1);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new C1947b(objY1);
                            composer.t(objB2);
                        }
                        composer.P();
                        Is.g.l(localThemeScope3, modifierH2, viewStateG, (Function1) ((KFunction) objB2), this.f119207b.getFeatureManager().e(AbstractC18227f.C.f170544h), composer, LocalThemeScope.f15770g, 0);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                c(LocalThemeScope localThemeScope, WeeklyAdSelectionActivity weeklyAdSelectionActivity, z1<i.ViewState> z1Var) {
                    this.f119206a = localThemeScope;
                    this.f119207b = weeklyAdSelectionActivity;
                    this.f119208c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    b(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
                    weeklyAdSelectionActivity.y1().u(i.a.c.f29193a);
                    return Unit.f142422a;
                }
            }

            a(InterfaceC5730l0<C17927c1> interfaceC5730l0, WeeklyAdSelectionActivity weeklyAdSelectionActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, z1<i.ViewState> z1Var3) {
                this.f119194a = interfaceC5730l0;
                this.f119195b = weeklyAdSelectionActivity;
                this.f119196c = z1Var;
                this.f119197d = z1Var2;
                this.f119198e = z1Var3;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-1671226980, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous>.<anonymous> (WeeklyAdSelectionActivity.kt:130)");
                }
                C17921a1.a(J.f(Modifier.INSTANCE, 0.0f, 1, null), b.o(this.f119194a), ComposableLambdaKt.c(-747754079, true, new C1942a(AdsTheme, this.f119195b), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-627333449, true, new C1944b(AdsTheme, this.f119195b, this.f119196c, this.f119197d), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-88384038, true, new c(AdsTheme, this.f119195b, this.f119198e), composer, 54), composer, 100663686, 12582912, 130808);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$onCreate$1$3$1", f = "WeeklyAdSelectionActivity.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$b, reason: collision with other inner class name */
        static final class C1948b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119210a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdSelectionActivity f119211b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1948b(WeeklyAdSelectionActivity weeklyAdSelectionActivity, Continuation<? super C1948b> continuation) {
                super(2, continuation);
                this.f119211b = weeklyAdSelectionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1948b(this.f119211b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/i$b;", "effect", "", "<anonymous>", "(LPs/i$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$onCreate$1$3$1$1", f = "WeeklyAdSelectionActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<i.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119212a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f119213b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WeeklyAdSelectionActivity f119214c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(WeeklyAdSelectionActivity weeklyAdSelectionActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f119214c = weeklyAdSelectionActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f119214c, continuation);
                    aVar.f119213b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(i.b bVar, Continuation<? super Unit> continuation) {
                    return ((a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f119212a == 0) {
                        ResultKt.b(obj);
                        i.b bVar = (i.b) this.f119213b;
                        if (bVar instanceof i.b.WeeklyAdSelected) {
                            this.f119214c.C1(((i.b.WeeklyAdSelected) bVar).getWeeklyAdPublication());
                        } else if (bVar instanceof i.b.StoreChanged) {
                            this.f119214c.B1();
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
                return ((C1948b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119210a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<i.b> interfaceC17144FS = this.f119211b.y1().s();
                    a aVar = new a(this.f119211b, null);
                    this.f119210a = 1;
                    if (C17154h.k(interfaceC17144FS, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b() {
        }

        public final void f(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2104364109, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity.onCreate.<anonymous> (WeeklyAdSelectionActivity.kt:106)");
            }
            z1 z1VarB = o1.b(WeeklyAdSelectionActivity.this.y1().t(), null, composer, 0, 1);
            z1 z1VarB2 = o1.b(WeeklyAdSelectionActivity.this.w1().u(), null, composer, 0, 1);
            z1 z1VarB3 = o1.b(WeeklyAdSelectionActivity.this.w1().v(), null, composer, 0, 1);
            WeeklyAdSelectionActivity.this.x1().k(536871412);
            C17932e0 c17932e0J = C17929d0.j(EnumC17935f0.f167889a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            C17963o1 c17963o1 = (C17963o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17927c1(c17932e0J, c17963o1), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB3;
            composer.P();
            C16381K.b(WeeklyAdSelectionActivity.this.x1(), c17932e0J, interfaceC16622O, composer, C16395g.f156492l);
            K.b(null, ComposableLambdaKt.c(-1671226980, true, new a(interfaceC5730l0, WeeklyAdSelectionActivity.this, z1VarB2, z1VarB3, z1VarB), composer, 54), composer, 48, 1);
            boolean zE = o(interfaceC5730l0).getDrawerState().e();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(WeeklyAdSelectionActivity.this);
            final WeeklyAdSelectionActivity weeklyAdSelectionActivity = WeeklyAdSelectionActivity.this;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.weeklyad.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WeeklyAdSelectionActivity.b.p(weeklyAdSelectionActivity);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C13588d.a(zE, (Function0) objB4, composer, 0, 0);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(WeeklyAdSelectionActivity.this);
            WeeklyAdSelectionActivity weeklyAdSelectionActivity2 = WeeklyAdSelectionActivity.this;
            Object objB5 = composer.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new C1948b(weeklyAdSelectionActivity2, null);
                composer.t(objB5);
            }
            composer.P();
            androidx.compose.runtime.J.g("WeeklyAdSelectionActivity", (Function2) objB5, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            f(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.ViewState g(z1<i.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HeaderDecorator k(z1<HeaderDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerLayoutDecorator l(z1<DrawerLayoutDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17927c1 o(InterfaceC5730l0<C17927c1> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
            weeklyAdSelectionActivity.x1().c();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119215f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f119215f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119215f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119216f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f119216f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119216f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119217f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119218g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119217f = function0;
            this.f119218g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119217f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119218g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f119219f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119219f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f119220f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119220f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119221f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119222g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119221f = function0;
            this.f119222g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119221f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119222g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("menu");
        track.o(str);
        track.n("menu");
        track.h("hier1", str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1() {
        startActivity(Al.s.f(this, ok.i.f153984b, getString(Bs.a.f3259g), false, true, 0, null, false, 224, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(WeeklyAdPublication weeklyAdPublication) {
        if (weeklyAdPublication != null) {
            startActivity(v1().E(weeklyAdPublication));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16382L w1() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g x1() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ps.i y1() {
        return (Ps.i) this.weeklyAdSelectionViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g z1(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
        return new C16395g(weeklyAdSelectionActivity);
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final InterfaceC14261a t1() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final AppVersion u1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    public final Al.g v1() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    @Override // com.meijer.mobile.weeklyad.Hilt_WeeklyAdSelectionActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(y1());
        w1().w(536871412);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(2104364109, true, new b()), 1, null);
        if (getIntent().hasExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id")) {
            this.flyerId = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id", 0);
            getIntent().removeExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id");
        }
        if (getIntent().hasExtra("com.meijer.mobile.meijer.activity.weeklyad.product")) {
            this.productId = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.weeklyad.product", 0);
            getIntent().removeExtra("com.meijer.mobile.meijer.activity.weeklyad.product");
        }
        final String str = "weeklyad";
        t1().h(C14476c.h("weeklyad"), new Function1() { // from class: com.meijer.mobile.weeklyad.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeeklyAdSelectionActivity.A1(str, (TrackingData) obj);
            }
        });
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("WeeklyAd").start();
    }
}
