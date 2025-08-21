package com.meijer.mobile.meijer.activity.orders;

import Ki.C;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import V2.CreationExtras;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.orders.OrdersActivity;
import e.C13737e;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
import kotlin.Deprecated;
import kotlin.EnumC18001f0;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import le.C15485b;
import mv.InterfaceC15783O;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.EnumC16503G;
import ps.HeaderDecorator;
import pv.C16563h;
import qn.c0;
import sn.h0;
import tp.Builder;
import tp.C17278c;
import tp.EnumC17276a;
import wo.C17905b;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrdersActivity;", "Landroidx/activity/ComponentActivity;", "Ltp/c$a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onDestroy", "onResume", "Ltp/b;", "builder", "Ltp/a;", "flowType", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "LBl/g;", "v", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lzl/k;", "w", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "Ltp/c;", "x", "Ltp/c;", "w1", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "rateAndTipUpdater", "LKk/a;", "y", "LKk/a;", "r1", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "Lps/L;", "z", "Lkotlin/Lazy;", "t1", "()Lps/L;", "navigationDrawerViewModel", "Lsn/h0;", "A", "v1", "()Lsn/h0;", "ordersViewModel", "Lps/g;", "B", "u1", "()Lps/g;", "navigationHelper", "", "C", "Z", "rateAndTip", "Lqn/c0;", "s1", "()Lqn/c0;", "initialTab", "D", "a", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrdersActivity extends Hilt_OrdersActivity implements C17278c.a {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    public static final int f111265E = 8;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean rateAndTip;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public C17278c rateAndTipUpdater;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16508L.class), new e(this), new d(this), new f(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy ordersViewModel = new androidx.view.e0(Reflection.b(sn.h0.class), new h(this), new g(this), new i(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.s0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrdersActivity.x1(this.f111419a);
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrdersActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", "RATE_AND_TIP_UPDATER_KEY", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) OrdersActivity.class);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C17993c1> f111275a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrdersActivity f111276b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<h0.OrdersViewState> f111277c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f111278d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f111279e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$a, reason: collision with other inner class name */
            static final class C1704a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111280a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrdersActivity f111281b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<h0.OrdersViewState> f111282c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1705a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111283a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<h0.OrdersViewState> f111284b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrdersActivity f111285c;

                    C1705a(LocalThemeScope localThemeScope, z1<h0.OrdersViewState> z1Var, OrdersActivity ordersActivity) {
                        this.f111283a = localThemeScope;
                        this.f111284b = z1Var;
                        this.f111285c = ordersActivity;
                    }

                    public final void b(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1180683459, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrdersActivity.kt:132)");
                        }
                        LocalThemeScope localThemeScope = this.f111283a;
                        Integer numValueOf = Integer.valueOf(this.f111284b.getValue().getCartDecorator().getItemCount());
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f111285c);
                        final OrdersActivity ordersActivity = this.f111285c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.u0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrdersActivity.b.a.C1704a.C1705a.c(ordersActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.k(localThemeScope, numValueOf, null, (Function0) objB, composer, LocalThemeScope.f17314g, 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        b(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(OrdersActivity ordersActivity) {
                        ordersActivity.startActivity(ordersActivity.getFeatureEntryPoint().d());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$a$b, reason: collision with other inner class name */
                static final class C1706b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111286a;

                    C1706b(LocalThemeScope localThemeScope) {
                        this.f111286a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(513886121, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrdersActivity.kt:129)");
                        }
                        Dr.g.g(this.f111286a, C16338g.c(C17905b.f167329t, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(-539933975, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrdersActivity.kt:124)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100572N8, new Object[0]);
                    C.f.d dVar = C.f.d.f17051e;
                    LocalThemeScope localThemeScope = this.f111280a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1180683459, true, new C1705a(localThemeScope, this.f111282c, this.f111281b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(513886121, true, new C1706b(this.f111280a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111281b);
                    final OrdersActivity ordersActivity = this.f111281b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.t0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrdersActivity.b.a.C1704a.c(ordersActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24960 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1704a(LocalThemeScope localThemeScope, OrdersActivity ordersActivity, z1<h0.OrdersViewState> z1Var) {
                    this.f111280a = localThemeScope;
                    this.f111281b = ordersActivity;
                    this.f111282c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrdersActivity ordersActivity) {
                    if (!ordersActivity.onNavigateUp()) {
                        ordersActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$b, reason: collision with other inner class name */
            static final class C1707b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f111287a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f111288b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrdersActivity f111289c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111290d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1708a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                    C1708a(Object obj) {
                        super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16499C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16521g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                        a(abstractC16499C);
                        return Unit.f143329a;
                    }
                }

                C1707b(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, OrdersActivity ordersActivity, LocalThemeScope localThemeScope) {
                    this.f111287a = z1Var;
                    this.f111288b = z1Var2;
                    this.f111289c = ordersActivity;
                    this.f111290d = localThemeScope;
                }

                public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1887686145, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrdersActivity.kt:116)");
                    }
                    HeaderDecorator value = this.f111287a.getValue();
                    DrawerLayoutDecorator value2 = this.f111288b.getValue();
                    C16521g c16521gU1 = this.f111289c.u1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16521gU1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1708a(c16521gU1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionR1 = this.f111289c.r1();
                    C16498B.h(this.f111290d, value, value2, appVersionR1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<h0.OrdersViewState> f111291a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrdersActivity f111292b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111293c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrdersActivity$b$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1709a extends FunctionReferenceImpl implements Function1<h0.c, Unit> {
                    C1709a(Object obj) {
                        super(1, obj, sn.h0.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/orders/viewmodel/OrdersViewModel$OrdersAction;)V", 0);
                    }

                    public final void a(h0.c p02) {
                        Intrinsics.j(p02, "p0");
                        ((sn.h0) this.receiver).N(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(h0.c cVar) {
                        a(cVar);
                        return Unit.f143329a;
                    }
                }

                c(z1<h0.OrdersViewState> z1Var, OrdersActivity ordersActivity, LocalThemeScope localThemeScope) {
                    this.f111291a = z1Var;
                    this.f111292b = ordersActivity;
                    this.f111293c = localThemeScope;
                }

                public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1416281122, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrdersActivity.kt:139)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                    h0.OrdersViewState value = this.f111291a.getValue();
                    qn.c0 c0VarS1 = this.f111292b.s1();
                    sn.h0 h0VarV1 = this.f111292b.v1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(h0VarV1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1709a(h0VarV1);
                        composer.t(objB);
                    }
                    composer.P();
                    qn.Y.N(this.f111293c, c0VarS1, modifierH, value, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 0);
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

            a(InterfaceC5872l0<C17993c1> interfaceC5872l0, OrdersActivity ordersActivity, z1<h0.OrdersViewState> z1Var, z1<HeaderDecorator> z1Var2, z1<DrawerLayoutDecorator> z1Var3) {
                this.f111275a = interfaceC5872l0;
                this.f111276b = ordersActivity;
                this.f111277c = z1Var;
                this.f111278d = z1Var2;
                this.f111279e = z1Var3;
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
                    ComposerKt.U(-635217436, i11, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous>.<anonymous> (OrdersActivity.kt:112)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), b.c(this.f111275a), ComposableLambdaKt.c(-539933975, true, new C1704a(AdsTheme, this.f111276b, this.f111277c), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-1887686145, true, new C1707b(this.f111278d, this.f111279e, this.f111276b, AdsTheme), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1416281122, true, new c(this.f111277c, this.f111276b, AdsTheme), composer, 54), composer, 100663680, 12582912, 130808);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2101310059, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrdersActivity.onCreate.<anonymous> (OrdersActivity.kt:98)");
            }
            z1 z1VarB = o1.b(OrdersActivity.this.t1().u(), null, composer, 0, 1);
            z1 z1VarB2 = o1.b(OrdersActivity.this.t1().v(), null, composer, 0, 1);
            z1 z1VarB3 = o1.b(OrdersActivity.this.v1().M(), null, composer, 0, 1);
            C17998e0 c17998e0J = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            C18029o1 c18029o1 = (C18029o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17993c1(c17998e0J, c18029o1), null, 2, null);
                composer.t(objB3);
            }
            composer.P();
            C16507K.b(OrdersActivity.this.u1(), c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
            Ki.K.b(null, ComposableLambdaKt.c(-635217436, true, new a((InterfaceC5872l0) objB3, OrdersActivity.this, z1VarB3, z1VarB, z1VarB2), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17993c1 c(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111297f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111297f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111297f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f111298f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111298f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111299f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111300g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111299f = function0;
            this.f111300g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111299f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111300g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f111301f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111301f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111302f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f111302f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111302f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111303f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111304g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111303f = function0;
            this.f111304g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111303f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111304g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsn/h0$e;", "viewState", "", "<anonymous>", "(Lsn/h0$e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrdersActivity$onCreate$2", f = "OrdersActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<h0.OrdersViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111294a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111295b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = OrdersActivity.this.new c(continuation);
            cVar.f111295b = obj;
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h0.OrdersViewState ordersViewState, Continuation<? super Unit> continuation) {
            return ((c) create(ordersViewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111294a == 0) {
                ResultKt.b(obj);
                h0.d dVarA = ((h0.OrdersViewState) this.f111295b).g().a();
                if (dVarA instanceof h0.d.RateShopperEvent) {
                    OrdersActivity ordersActivity = OrdersActivity.this;
                    h0.d.RateShopperEvent rateShopperEvent = (h0.d.RateShopperEvent) dVarA;
                    ordersActivity.startActivity(ordersActivity.getFeatureEntryPoint().v(rateShopperEvent.getBuilder(), rateShopperEvent.getFlowType()));
                } else if (dVarA instanceof h0.d.Show503Error) {
                    h0.d.Show503Error show503Error = (h0.d.Show503Error) dVarA;
                    new C15485b(OrdersActivity.this).setCancelable(false).setTitle(show503Error.getTitle().toString()).setMessage(show503Error.getMessage().toString()).setPositiveButton(show503Error.getPositiveButtonText().toString(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.v0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            OrdersActivity.c.k(dialogInterface, i10);
                        }
                    }).show();
                } else if (dVarA instanceof h0.d.GoToReceiptDetailEvent) {
                    OrdersActivity ordersActivity2 = OrdersActivity.this;
                    ordersActivity2.startActivity(Bl.d.f3122a.f(ordersActivity2, ((h0.d.GoToReceiptDetailEvent) dVarA).getReceipt()));
                } else if (dVarA instanceof h0.d.GoToUpdatePaymentMethodEvent) {
                    OrdersActivity ordersActivity3 = OrdersActivity.this;
                    ordersActivity3.startActivity(Bl.l.b(Bl.l.f3131a, ordersActivity3, ((h0.d.GoToUpdatePaymentMethodEvent) dVarA).getOrderId(), null, null, 12, null));
                } else if (dVarA instanceof h0.d.ViewOrderEvent) {
                    OrdersActivity ordersActivity4 = OrdersActivity.this;
                    ordersActivity4.startActivity(Bl.l.b(Bl.l.f3131a, ordersActivity4, String.valueOf(((h0.d.ViewOrderEvent) dVarA).getOrderId()), null, null, 12, null));
                } else if (dVarA != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L t1() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g u1() {
        return (C16521g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sn.h0 v1() {
        return (sn.h0) this.ordersViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g x1(OrdersActivity ordersActivity) {
        return new C16521g(ordersActivity);
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    @Override // tp.C17278c.a
    public void onUpdateRateAndTip(Builder builder, EnumC17276a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        v1().updateRatedAndTippedOrder(builder, flowType);
    }

    public final AppVersion r1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final C17278c w1() {
        C17278c c17278c = this.rateAndTipUpdater;
        if (c17278c != null) {
            return c17278c;
        }
        Intrinsics.x("rateAndTipUpdater");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qn.c0 s1() {
        if (getIntent().getBooleanExtra("action.com.meijer.mobile.orders.start_in_store_receipts", false)) {
            return c0.b.f158685e;
        }
        return c0.c.f158686e;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        if (getIntent().getBooleanExtra("arrivedFlag", false)) {
            Intent intentM = Bl.g.m(getFeatureEntryPoint(), false, 1, null);
            intentM.setFlags(268468224);
            startActivity(intentM);
            return;
        }
        getOnBackPressedDispatcher().l();
    }

    @Override // com.meijer.mobile.meijer.activity.orders.Hilt_OrdersActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t1().w(Integer.valueOf(EnumC16503G.f157144u.getIntentCode()));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-2101310059, true, new b()), 1, null);
        getLifecycle().a(v1());
        v1().N(h0.c.b.f161339a);
        v1().N(h0.c.a.f161338a);
        C16563h.J(C16563h.O(v1().M(), new c(null)), C6173t.a(this));
    }

    @Override // com.meijer.mobile.meijer.activity.orders.Hilt_OrdersActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w1().c("OrdersActivity");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("My Orders and Receipts").start();
        w1().a("OrdersActivity", this);
        if (this.rateAndTip) {
            this.rateAndTip = false;
            v1().N(h0.c.g.f161346a);
        }
    }
}
