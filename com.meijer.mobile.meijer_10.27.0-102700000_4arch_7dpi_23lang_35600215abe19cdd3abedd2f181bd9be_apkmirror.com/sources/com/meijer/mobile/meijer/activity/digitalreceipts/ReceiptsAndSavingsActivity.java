package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ji.C;
import Ji.LocalThemeScope;
import Jk.AppVersion;
import Lm.a;
import Oj.a;
import P0.e;
import Rm.g;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
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
import ck.C6408b;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.TrackingData;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Locale;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
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
import ni.C15857q0;
import ni.C15862t0;
import ni.P0;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16381K;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import ps.j0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import yl.AbstractC18227f;
import yr.C18286l;
import yr.C18299z;
import zp.CustomerSavings;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0003R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010L¨\u0006V²\u0006\f\u0010O\u001a\u00020N8\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010S\u001a\u00020R8\nX\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u00020T8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/ReceiptsAndSavingsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lhi/f;", "trackingData", "", "F1", "(Lhi/f;)V", "Lzp/b;", "receipt", "G1", "(Lzp/b;Lhi/f;)V", "Lzp/a;", "savingsDetail", "J1", "(Lzp/a;Lhi/f;)V", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "H1", "(Ljava/lang/Long;Lhi/f;)V", "K1", "onSignIn", "onCreateAccount", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LCs/b;", "v", "LCs/b;", "D1", "()LCs/b;", "setUserProvider", "(LCs/b;)V", "userProvider", "Lgi/a;", "w", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "LJk/a;", "x", "LJk/a;", "y1", "()LJk/a;", "setAppVersion$Meijer_playstoreRelease", "(LJk/a;)V", "appVersion", "Lyl/k;", "y", "Lyl/k;", "A1", "()Lyl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lyl/k;)V", "featureManager", "LRm/g;", "z", "Lkotlin/Lazy;", "z1", "()LRm/g;", "digitalReceiptsViewModel", "Lps/L;", "A", "B1", "()Lps/L;", "navigationDrawerViewModel", "Lps/g;", "B", "C1", "()Lps/g;", "navigationHelper", "LRm/g$d;", "viewState", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReceiptsAndSavingsActivity extends Hilt_ReceiptsAndSavingsActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cs.b userProvider;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy digitalReceiptsViewModel = new e0(Reflection.b(Rm.g.class), new c(this), new b(this), new d(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16382L.class), new f(this), new e(this), new g(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReceiptsAndSavingsActivity.E1(this.f105854a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a, reason: collision with other inner class name */
        static final class C1550a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C17927c1> f105510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsActivity f105511b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f105512c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f105513d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<g.ViewState> f105514e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1551a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105515a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f105516b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1552a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105517a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ReceiptsAndSavingsActivity f105518b;

                    C1552a(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                        this.f105517a = localThemeScope;
                        this.f105518b = receiptsAndSavingsActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                        receiptsAndSavingsActivity.startActivity(Al.d.f664a.g(receiptsAndSavingsActivity, Uj.a.f36070e));
                        return Unit.f142422a;
                    }

                    public final void b(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1778583625, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:146)");
                        }
                        LocalThemeScope localThemeScope = this.f105517a;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f105518b);
                        final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f105518b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1550a.C1551a.C1552a.c(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.o(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        b(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105519a;

                    b(LocalThemeScope localThemeScope) {
                        this.f105519a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1747127919, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:142)");
                        }
                        Dr.g.g(this.f105519a, C16193g.c(com.meijer.mobile.meijer.Y.f99885Wc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(1707695697, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:141)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(j0.f156554d, new Object[0]);
                    C.a.s sVar = C.a.s.f15358e;
                    LocalThemeScope localThemeScope = this.f105515a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1778583625, true, new C1552a(localThemeScope, this.f105516b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-1747127919, true, new b(this.f105515a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105516b);
                    final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f105516b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiptsAndSavingsActivity.a.C1550a.C1551a.c(receiptsAndSavingsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, sVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24960 | (C.a.s.f15359f << 18) | (AbstractC5607a.f45514b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1551a(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    this.f105515a = localThemeScope;
                    this.f105516b = receiptsAndSavingsActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.C1().j();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f105520a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105521b;

                b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, LocalThemeScope localThemeScope) {
                    this.f105520a = receiptsAndSavingsActivity;
                    this.f105521b = localThemeScope;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-707744976, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:159)");
                    }
                    if (!this.f105520a.D1().b()) {
                        LocalThemeScope localThemeScope = this.f105521b;
                        final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f105520a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        C5658d c5658d = C5658d.f48555a;
                        C5658d.m mVarH = c5658d.h();
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
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
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14815g c14815g = C14815g.f139108a;
                        C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                        int iA2 = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR2 = composer.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
                        Function0<InterfaceC5811g> function0A2 = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A2);
                        } else {
                            composer.s();
                        }
                        Composer composerA2 = D1.a(composer);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5742sR2, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14801J c14801j = C14801J.f139030a;
                        Modifier modifierK2 = androidx.compose.foundation.layout.D.k(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                        int iA3 = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR3 = composer.r();
                        Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK2);
                        Function0<InterfaceC5811g> function0A3 = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A3);
                        } else {
                            composer.s();
                        }
                        Composer composerA3 = D1.a(composer);
                        D1.c(composerA3, measurePolicyG, companion3.e());
                        D1.c(composerA3, interfaceC5742sR3, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                        if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                            composerA3.t(Integer.valueOf(iA3));
                            composerA3.n(Integer.valueOf(iA3), function2B3);
                        }
                        D1.c(composerA3, modifierE3, companion3.f());
                        C5664j c5664j = C5664j.f48612a;
                        C15862t0 c15862t0 = C15862t0.f151797a;
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99538E7, composer, 0);
                        Locale locale = Locale.ROOT;
                        String upperCase = strC.toUpperCase(locale);
                        Intrinsics.i(upperCase, "toUpperCase(...)");
                        Modifier modifierF = C18299z.f(companion, "bottom_bar_sign_in_button", null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(receiptsAndSavingsActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.l
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1550a.b.d(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        int i11 = LocalThemeScope.f15770g;
                        P0.k(localThemeScope, c15862t0, upperCase, (Function0) objB, modifierF, null, true, 0L, false, composer, i11 | 1572864 | (C15862t0.f151798b << 3), 208);
                        composer.v();
                        Modifier modifierK3 = androidx.compose.foundation.layout.D.k(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
                        int iA4 = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR4 = composer.r();
                        Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierK3);
                        Function0<InterfaceC5811g> function0A4 = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A4);
                        } else {
                            composer.s();
                        }
                        Composer composerA4 = D1.a(composer);
                        D1.c(composerA4, measurePolicyG2, companion3.e());
                        D1.c(composerA4, interfaceC5742sR4, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                        if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                            composerA4.t(Integer.valueOf(iA4));
                            composerA4.n(Integer.valueOf(iA4), function2B4);
                        }
                        D1.c(composerA4, modifierE4, companion3.f());
                        C15857q0 c15857q0 = C15857q0.f151765a;
                        String upperCase2 = C16193g.c(com.meijer.mobile.meijer.Y.f99836U1, composer, 0).toUpperCase(locale);
                        Intrinsics.i(upperCase2, "toUpperCase(...)");
                        Modifier modifierF2 = C18299z.f(companion, "bottom_bar_create_account_button", null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(receiptsAndSavingsActivity);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1550a.b.e(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        P0.k(localThemeScope, c15857q0, upperCase2, (Function0) objB2, modifierF2, null, true, 0L, false, composer, i11 | 1572864 | (C15857q0.f151766b << 3), 208);
                        composer.v();
                        composer.v();
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.onSignIn();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.onCreateAccount();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$c */
            static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105522a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f105523b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f105524c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f105525d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1553a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                    C1553a(Object obj) {
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

                c(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2) {
                    this.f105522a = localThemeScope;
                    this.f105523b = receiptsAndSavingsActivity;
                    this.f105524c = z1Var;
                    this.f105525d = z1Var2;
                }

                public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1137497605, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:202)");
                    }
                    LocalThemeScope localThemeScope = this.f105522a;
                    HeaderDecorator headerDecoratorG = a.g(this.f105524c);
                    DrawerLayoutDecorator drawerLayoutDecoratorK = a.k(this.f105525d);
                    AppVersion appVersionY1 = this.f105523b.y1();
                    C16395g c16395gC1 = this.f105523b.C1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16395gC1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1553a(c16395gC1);
                        composer.t(objB);
                    }
                    composer.P();
                    C16372B.h(localThemeScope, headerDecoratorG, drawerLayoutDecoratorK, appVersionY1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
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
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d */
            static final class d implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f105526a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105527b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<g.ViewState> f105528c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d$a, reason: collision with other inner class name */
                static final class C1554a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105529a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<g.ViewState> f105530b;

                    C1554a(LocalThemeScope localThemeScope, z1<g.ViewState> z1Var) {
                        this.f105529a = localThemeScope;
                        this.f105530b = z1Var;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-820200828, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:228)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f105529a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, C6408b.a(a.f(this.f105530b).getLoadingState().getMessage(), composer, AbstractC5607a.f45514b), null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 48);
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
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Lm.a, Unit> {
                    b(Object obj) {
                        super(1, obj, Rm.g.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/digitalreceipts/action/DigitalReceiptsAction;)V", 0);
                    }

                    public final void a(Lm.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((Rm.g) this.receiver).E(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Lm.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
                    }
                }

                d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, LocalThemeScope localThemeScope, z1<g.ViewState> z1Var) {
                    this.f105526a = receiptsAndSavingsActivity;
                    this.f105527b = localThemeScope;
                    this.f105528c = z1Var;
                }

                public final void b(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = (composer.V(contentPadding) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1209380920, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:210)");
                    }
                    if (this.f105526a.D1().b()) {
                        composer.startReplaceGroup(-1813407942);
                        Oj.a loadingState = a.f(this.f105528c).getLoadingState();
                        if (loadingState instanceof a.Failed) {
                            composer.startReplaceGroup(-1813335092);
                            LocalThemeScope localThemeScope = this.f105527b;
                            String strA = C6408b.a(a.f(this.f105528c).getLoadingState().getMessage(), composer, AbstractC5607a.f45514b);
                            String strC = C16193g.c(yr.Q.f170980W, composer, 0);
                            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(this.f105526a);
                            final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f105526a;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.n
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReceiptsAndSavingsActivity.a.C1550a.d.c(receiptsAndSavingsActivity);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            C18286l.b(localThemeScope, strA, strC, modifierF, (Function0) objB, composer, LocalThemeScope.f15770g | 3072, 0);
                            composer.P();
                        } else if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                            composer.startReplaceGroup(-1812658021);
                            LocalThemeScope localThemeScope2 = this.f105527b;
                            Ji.Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(-820200828, true, new C1554a(localThemeScope2, this.f105528c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                            composer.P();
                        } else {
                            if (!(loadingState instanceof a.NotLoading)) {
                                composer.startReplaceGroup(-1721064232);
                                composer.P();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1812050576);
                            LocalThemeScope localThemeScope3 = this.f105527b;
                            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding);
                            g.ViewState viewStateF = a.f(this.f105528c);
                            Rm.g gVarZ1 = this.f105526a.z1();
                            composer.startReplaceGroup(5004770);
                            boolean zD2 = composer.D(gVarZ1);
                            Object objB2 = composer.B();
                            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new b(gVarZ1);
                                composer.t(objB2);
                            }
                            composer.P();
                            Mm.f.f(localThemeScope3, modifierH, viewStateF, (Function1) ((KFunction) objB2), composer, LocalThemeScope.f15770g, 0);
                            composer.P();
                        }
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1813585262);
                        Mm.h.b(this.f105527b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), composer, LocalThemeScope.f15770g, 0);
                        composer.P();
                    }
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
                public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.z1().E(a.e.f18551a);
                    return Unit.f142422a;
                }
            }

            C1550a(InterfaceC5730l0<C17927c1> interfaceC5730l0, ReceiptsAndSavingsActivity receiptsAndSavingsActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, z1<g.ViewState> z1Var3) {
                this.f105510a = interfaceC5730l0;
                this.f105511b = receiptsAndSavingsActivity;
                this.f105512c = z1Var;
                this.f105513d = z1Var2;
                this.f105514e = z1Var3;
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
                    ComposerKt.U(649548470, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:134)");
                }
                C17921a1.a(C18299z.c(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null), a.l(this.f105510a), ComposableLambdaKt.c(1707695697, true, new C1551a(AdsTheme, this.f105511b), composer, 54), ComposableLambdaKt.c(-707744976, true, new b(this.f105511b, AdsTheme), composer, 54), null, null, 0, false, ComposableLambdaKt.c(-1137497605, true, new c(AdsTheme, this.f105511b, this.f105512c, this.f105513d), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1209380920, true, new d(this.f105511b, AdsTheme, this.f105514e), composer, 54), composer, 100666752, 12582912, 130800);
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$onCreate$1$2$1", f = "ReceiptsAndSavingsActivity.kt", l = {252}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f105531a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsActivity f105532b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f105532b = receiptsAndSavingsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f105532b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRm/g$a;", "effect", "", "<anonymous>", "(LRm/g$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$onCreate$1$2$1$1", f = "ReceiptsAndSavingsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$b$a, reason: collision with other inner class name */
            static final class C1555a extends SuspendLambda implements Function2<g.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105533a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f105534b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f105535c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1555a(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Continuation<? super C1555a> continuation) {
                    super(2, continuation);
                    this.f105535c = receiptsAndSavingsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1555a c1555a = new C1555a(this.f105535c, continuation);
                    c1555a.f105534b = obj;
                    return c1555a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1555a) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f105533a == 0) {
                        ResultKt.b(obj);
                        g.a aVar = (g.a) this.f105534b;
                        if (aVar instanceof g.a.StartCustomerResubmitDetailActivity) {
                            this.f105535c.F1(((g.a.StartCustomerResubmitDetailActivity) aVar).getTrackingData());
                        } else if (aVar instanceof g.a.StartDigitalReceiptsActivity) {
                            g.a.StartDigitalReceiptsActivity startDigitalReceiptsActivity = (g.a.StartDigitalReceiptsActivity) aVar;
                            this.f105535c.G1(startDigitalReceiptsActivity.getReceipt(), startDigitalReceiptsActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartOrderDetailsActivity) {
                            g.a.StartOrderDetailsActivity startOrderDetailsActivity = (g.a.StartOrderDetailsActivity) aVar;
                            this.f105535c.H1(startOrderDetailsActivity.getOrderId(), startOrderDetailsActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartSavingsDetailActivity) {
                            g.a.StartSavingsDetailActivity startSavingsDetailActivity = (g.a.StartSavingsDetailActivity) aVar;
                            this.f105535c.J1(startSavingsDetailActivity.getSavingsDetails(), startSavingsDetailActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartSelfRemediationActivity) {
                            this.f105535c.K1(((g.a.StartSelfRemediationActivity) aVar).getTrackingData());
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
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f105531a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<g.a> interfaceC17144FA = this.f105532b.z1().A();
                    C1555a c1555a = new C1555a(this.f105532b, null);
                    this.f105531a = 1;
                    if (C17154h.k(interfaceC17144FA, c1555a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        a() {
        }

        public final void e(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1556289829, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous> (ReceiptsAndSavingsActivity.kt:111)");
            }
            z1 z1VarB = o1.b(ReceiptsAndSavingsActivity.this.z1().B(), null, composer, 0, 1);
            z1 z1VarB2 = o1.b(ReceiptsAndSavingsActivity.this.B1().u(), null, composer, 0, 1);
            z1 z1VarB3 = o1.b(ReceiptsAndSavingsActivity.this.B1().v(), null, composer, 0, 1);
            ReceiptsAndSavingsActivity.this.C1().k(1000);
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
            composer.P();
            C16381K.b(ReceiptsAndSavingsActivity.this.C1(), c17932e0J, interfaceC16622O, composer, C16395g.f156492l);
            Ji.K.b(null, ComposableLambdaKt.c(649548470, true, new C1550a((InterfaceC5730l0) objB3, ReceiptsAndSavingsActivity.this, z1VarB2, z1VarB3, z1VarB), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(ReceiptsAndSavingsActivity.this);
            ReceiptsAndSavingsActivity receiptsAndSavingsActivity = ReceiptsAndSavingsActivity.this;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new b(receiptsAndSavingsActivity, null);
                composer.t(objB4);
            }
            composer.P();
            androidx.compose.runtime.J.g("ReceiptsAndSavingsActivity", (Function2) objB4, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.ViewState f(z1<g.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HeaderDecorator g(z1<HeaderDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerLayoutDecorator k(z1<DrawerLayoutDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17927c1 l(InterfaceC5730l0<C17927c1> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105536f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f105536f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105536f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105537f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f105537f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105537f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105538f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105539g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105538f = function0;
            this.f105539g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105538f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105539g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105540f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f105540f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105540f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105541f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f105541f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105541f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105542f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105543g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105542f = function0;
            this.f105543g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105542f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105543g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(TrackingData trackingData) {
        startActivity(Al.d.b(this, false, 0, 6, null));
        getAnalyticsEngine().e(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16382L B1() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g C1() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g E1(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
        return new C16395g(receiptsAndSavingsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(TrackingData trackingData) {
        startActivity(Al.d.f664a.c(this));
        getAnalyticsEngine().e(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(DigitalReceipt receipt, TrackingData trackingData) {
        startActivity(Al.d.f664a.f(this, receipt));
        getAnalyticsEngine().e(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(Long orderId, TrackingData trackingData) {
        if (orderId == null) {
            new Pj.j(this, com.meijer.mobile.meijer.Y.f100297r9, new Object[0]).r(com.meijer.mobile.meijer.Y.f100277q9, new Object[0]).o(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReceiptsAndSavingsActivity.I1(dialogInterface, i10);
                }
            }).f(Bj.p.f3061e).g();
        } else {
            startActivity(Al.l.f673a.a(this, orderId.toString(), "", ""));
            getAnalyticsEngine().e(trackingData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(CustomerSavings savingsDetail, TrackingData trackingData) {
        startActivity(Al.d.f664a.h(this, savingsDetail));
        if (savingsDetail != null) {
            getAnalyticsEngine().e(trackingData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateAccount() {
        startActivity(Al.f.f666a.a(this, A1().e(AbstractC18227f.h0.f170581h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSignIn() {
        startActivity(Al.k.b(this, false, null, 1000, null, null, null, 118, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rm.g z1() {
        return (Rm.g) this.digitalReceiptsViewModel.getValue();
    }

    public final yl.k A1() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Cs.b D1() {
        Cs.b bVar = this.userProvider;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("userProvider");
        return null;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final AppVersion y1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.digitalreceipts.Hilt_ReceiptsAndSavingsActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1556289829, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("mPerks | Receipts Savings").start();
    }
}
