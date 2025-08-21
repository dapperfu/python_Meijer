package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ki.C;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import Mm.a;
import P0.e;
import Pj.a;
import Sm.g;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity;
import dk.C13698b;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.TrackingData;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
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
import oi.C16191q0;
import oi.C16196t0;
import oi.P0;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import ps.j0;
import pv.C16563h;
import pv.InterfaceC16553F;
import yr.C18357l;
import yr.C18370z;
import zl.AbstractC18503f;
import zp.CustomerSavings;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0003R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010L¨\u0006V²\u0006\f\u0010O\u001a\u00020N8\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010S\u001a\u00020R8\nX\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u00020T8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/ReceiptsAndSavingsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lii/f;", "trackingData", "", "F1", "(Lii/f;)V", "Lzp/b;", "receipt", "G1", "(Lzp/b;Lii/f;)V", "Lzp/a;", "savingsDetail", "J1", "(Lzp/a;Lii/f;)V", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "H1", "(Ljava/lang/Long;Lii/f;)V", "K1", "onSignIn", "onCreateAccount", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LCs/b;", "v", "LCs/b;", "D1", "()LCs/b;", "setUserProvider", "(LCs/b;)V", "userProvider", "Lhi/a;", "w", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "LKk/a;", "x", "LKk/a;", "y1", "()LKk/a;", "setAppVersion$Meijer_playstoreRelease", "(LKk/a;)V", "appVersion", "Lzl/k;", "y", "Lzl/k;", "A1", "()Lzl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lzl/k;)V", "featureManager", "LSm/g;", "z", "Lkotlin/Lazy;", "z1", "()LSm/g;", "digitalReceiptsViewModel", "Lps/L;", "A", "B1", "()Lps/L;", "navigationDrawerViewModel", "Lps/g;", "B", "C1", "()Lps/g;", "navigationHelper", "LSm/g$d;", "viewState", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ReceiptsAndSavingsActivity extends Hilt_ReceiptsAndSavingsActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cs.b userProvider;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy digitalReceiptsViewModel = new e0(Reflection.b(Sm.g.class), new c(this), new b(this), new d(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16508L.class), new f(this), new e(this), new g(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReceiptsAndSavingsActivity.E1(this.f106709a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a, reason: collision with other inner class name */
        static final class C1559a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C17993c1> f106365a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsActivity f106366b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f106367c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f106368d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<g.ViewState> f106369e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1560a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106370a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f106371b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1561a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106372a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ReceiptsAndSavingsActivity f106373b;

                    C1561a(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                        this.f106372a = localThemeScope;
                        this.f106373b = receiptsAndSavingsActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                        receiptsAndSavingsActivity.startActivity(Bl.d.f3122a.g(receiptsAndSavingsActivity, Vj.a.f39951e));
                        return Unit.f143329a;
                    }

                    public final void b(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1778583625, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:146)");
                        }
                        LocalThemeScope localThemeScope = this.f106372a;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f106373b);
                        final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f106373b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1559a.C1560a.C1561a.c(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.o(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        b(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106374a;

                    b(LocalThemeScope localThemeScope) {
                        this.f106374a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1747127919, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:142)");
                        }
                        Dr.g.g(this.f106374a, C16338g.c(com.meijer.mobile.meijer.Y.f100804Zc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(1707695697, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:141)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(j0.f157327d, new Object[0]);
                    C.a.s sVar = C.a.s.f16902e;
                    LocalThemeScope localThemeScope = this.f106370a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1778583625, true, new C1561a(localThemeScope, this.f106371b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-1747127919, true, new b(this.f106370a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f106371b);
                    final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f106371b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiptsAndSavingsActivity.a.C1559a.C1560a.c(receiptsAndSavingsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, sVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24960 | (C.a.s.f16903f << 18) | (AbstractC6392a.f60445b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1560a(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    this.f106370a = localThemeScope;
                    this.f106371b = receiptsAndSavingsActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.C1().j();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f106375a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106376b;

                b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, LocalThemeScope localThemeScope) {
                    this.f106375a = receiptsAndSavingsActivity;
                    this.f106376b = localThemeScope;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-707744976, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:159)");
                    }
                    if (!this.f106375a.D1().b()) {
                        LocalThemeScope localThemeScope = this.f106376b;
                        final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f106375a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        C5800d c5800d = C5800d.f48779a;
                        C5800d.m mVarH = c5800d.h();
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion3.a();
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
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5884sR, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14903g c14903g = C14903g.f139698a;
                        C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                        int iA2 = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR2 = composer.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
                        Function0<InterfaceC5953g> function0A2 = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A2);
                        } else {
                            composer.s();
                        }
                        Composer composerA2 = D1.a(composer);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5884sR2, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14889J c14889j = C14889J.f139620a;
                        Modifier modifierK2 = androidx.compose.foundation.layout.D.k(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                        int iA3 = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR3 = composer.r();
                        Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK2);
                        Function0<InterfaceC5953g> function0A3 = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A3);
                        } else {
                            composer.s();
                        }
                        Composer composerA3 = D1.a(composer);
                        D1.c(composerA3, measurePolicyG, companion3.e());
                        D1.c(composerA3, interfaceC5884sR3, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                        if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                            composerA3.t(Integer.valueOf(iA3));
                            composerA3.n(Integer.valueOf(iA3), function2B3);
                        }
                        D1.c(composerA3, modifierE3, companion3.f());
                        C5806j c5806j = C5806j.f48836a;
                        C16196t0 c16196t0 = C16196t0.f154256a;
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100457H7, composer, 0);
                        Locale locale = Locale.ROOT;
                        String upperCase = strC.toUpperCase(locale);
                        Intrinsics.i(upperCase, "toUpperCase(...)");
                        Modifier modifierF = C18370z.f(companion, "bottom_bar_sign_in_button", null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(receiptsAndSavingsActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.l
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1559a.b.d(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        int i11 = LocalThemeScope.f17314g;
                        P0.k(localThemeScope, c16196t0, upperCase, (Function0) objB, modifierF, null, true, 0L, false, composer, i11 | 1572864 | (C16196t0.f154257b << 3), 208);
                        composer.v();
                        Modifier modifierK3 = androidx.compose.foundation.layout.D.k(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
                        int iA4 = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR4 = composer.r();
                        Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierK3);
                        Function0<InterfaceC5953g> function0A4 = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A4);
                        } else {
                            composer.s();
                        }
                        Composer composerA4 = D1.a(composer);
                        D1.c(composerA4, measurePolicyG2, companion3.e());
                        D1.c(composerA4, interfaceC5884sR4, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                        if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                            composerA4.t(Integer.valueOf(iA4));
                            composerA4.n(Integer.valueOf(iA4), function2B4);
                        }
                        D1.c(composerA4, modifierE4, companion3.f());
                        C16191q0 c16191q0 = C16191q0.f154224a;
                        String upperCase2 = C16338g.c(com.meijer.mobile.meijer.Y.f100698U1, composer, 0).toUpperCase(locale);
                        Intrinsics.i(upperCase2, "toUpperCase(...)");
                        Modifier modifierF2 = C18370z.f(companion, "bottom_bar_create_account_button", null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(receiptsAndSavingsActivity);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReceiptsAndSavingsActivity.a.C1559a.b.e(receiptsAndSavingsActivity);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        P0.k(localThemeScope, c16191q0, upperCase2, (Function0) objB2, modifierF2, null, true, 0L, false, composer, i11 | 1572864 | (C16191q0.f154225b << 3), 208);
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
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.onSignIn();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.onCreateAccount();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$c */
            static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106377a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f106378b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f106379c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f106380d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1562a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                    C1562a(Object obj) {
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

                c(LocalThemeScope localThemeScope, ReceiptsAndSavingsActivity receiptsAndSavingsActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2) {
                    this.f106377a = localThemeScope;
                    this.f106378b = receiptsAndSavingsActivity;
                    this.f106379c = z1Var;
                    this.f106380d = z1Var2;
                }

                public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1137497605, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:202)");
                    }
                    LocalThemeScope localThemeScope = this.f106377a;
                    HeaderDecorator headerDecoratorG = a.g(this.f106379c);
                    DrawerLayoutDecorator drawerLayoutDecoratorK = a.k(this.f106380d);
                    AppVersion appVersionY1 = this.f106378b.y1();
                    C16521g c16521gC1 = this.f106378b.C1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16521gC1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1562a(c16521gC1);
                        composer.t(objB);
                    }
                    composer.P();
                    C16498B.h(localThemeScope, headerDecoratorG, drawerLayoutDecoratorK, appVersionY1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
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
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d */
            static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f106381a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106382b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<g.ViewState> f106383c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d$a, reason: collision with other inner class name */
                static final class C1563a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106384a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<g.ViewState> f106385b;

                    C1563a(LocalThemeScope localThemeScope, z1<g.ViewState> z1Var) {
                        this.f106384a = localThemeScope;
                        this.f106385b = z1Var;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-820200828, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsActivity.kt:228)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f106384a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, C13698b.a(a.f(this.f106385b).getLoadingState().getMessage(), composer, AbstractC6392a.f60445b), null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 48);
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
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$a$d$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Mm.a, Unit> {
                    b(Object obj) {
                        super(1, obj, Sm.g.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/digitalreceipts/action/DigitalReceiptsAction;)V", 0);
                    }

                    public final void a(Mm.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((Sm.g) this.receiver).E(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Mm.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, LocalThemeScope localThemeScope, z1<g.ViewState> z1Var) {
                    this.f106381a = receiptsAndSavingsActivity;
                    this.f106382b = localThemeScope;
                    this.f106383c = z1Var;
                }

                public final void b(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    if (this.f106381a.D1().b()) {
                        composer.startReplaceGroup(-1813407942);
                        Pj.a loadingState = a.f(this.f106383c).getLoadingState();
                        if (loadingState instanceof a.Failed) {
                            composer.startReplaceGroup(-1813335092);
                            LocalThemeScope localThemeScope = this.f106382b;
                            String strA = C13698b.a(a.f(this.f106383c).getLoadingState().getMessage(), composer, AbstractC6392a.f60445b);
                            String strC = C16338g.c(yr.Q.f171755W, composer, 0);
                            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(this.f106381a);
                            final ReceiptsAndSavingsActivity receiptsAndSavingsActivity = this.f106381a;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.n
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReceiptsAndSavingsActivity.a.C1559a.d.c(receiptsAndSavingsActivity);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            C18357l.b(localThemeScope, strA, strC, modifierF, (Function0) objB, composer, LocalThemeScope.f17314g | 3072, 0);
                            composer.P();
                        } else if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                            composer.startReplaceGroup(-1812658021);
                            LocalThemeScope localThemeScope2 = this.f106382b;
                            Ki.Q.e(localThemeScope2, Q0.b.f141966a, ComposableLambdaKt.c(-820200828, true, new C1563a(localThemeScope2, this.f106383c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                            composer.P();
                        } else {
                            if (!(loadingState instanceof a.NotLoading)) {
                                composer.startReplaceGroup(-1721064232);
                                composer.P();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1812050576);
                            LocalThemeScope localThemeScope3 = this.f106382b;
                            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding);
                            g.ViewState viewStateF = a.f(this.f106383c);
                            Sm.g gVarZ1 = this.f106381a.z1();
                            composer.startReplaceGroup(5004770);
                            boolean zD2 = composer.D(gVarZ1);
                            Object objB2 = composer.B();
                            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new b(gVarZ1);
                                composer.t(objB2);
                            }
                            composer.P();
                            Nm.f.f(localThemeScope3, modifierH, viewStateF, (Function1) ((KFunction) objB2), composer, LocalThemeScope.f17314g, 0);
                            composer.P();
                        }
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1813585262);
                        Nm.h.b(this.f106382b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), composer, LocalThemeScope.f17314g, 0);
                        composer.P();
                    }
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
                public static final Unit c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
                    receiptsAndSavingsActivity.z1().E(a.e.f20360a);
                    return Unit.f143329a;
                }
            }

            C1559a(InterfaceC5872l0<C17993c1> interfaceC5872l0, ReceiptsAndSavingsActivity receiptsAndSavingsActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, z1<g.ViewState> z1Var3) {
                this.f106365a = interfaceC5872l0;
                this.f106366b = receiptsAndSavingsActivity;
                this.f106367c = z1Var;
                this.f106368d = z1Var2;
                this.f106369e = z1Var3;
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
                C17987a1.a(C18370z.c(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null), a.l(this.f106365a), ComposableLambdaKt.c(1707695697, true, new C1560a(AdsTheme, this.f106366b), composer, 54), ComposableLambdaKt.c(-707744976, true, new b(this.f106366b, AdsTheme), composer, 54), null, null, 0, false, ComposableLambdaKt.c(-1137497605, true, new c(AdsTheme, this.f106366b, this.f106367c, this.f106368d), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1209380920, true, new d(this.f106366b, AdsTheme, this.f106369e), composer, 54), composer, 100666752, 12582912, 130800);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$onCreate$1$2$1", f = "ReceiptsAndSavingsActivity.kt", l = {252}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106386a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsActivity f106387b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f106387b = receiptsAndSavingsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f106387b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSm/g$a;", "effect", "", "<anonymous>", "(LSm/g$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$onCreate$1$2$1$1", f = "ReceiptsAndSavingsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity$a$b$a, reason: collision with other inner class name */
            static final class C1564a extends SuspendLambda implements Function2<g.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f106388a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f106389b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ReceiptsAndSavingsActivity f106390c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1564a(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Continuation<? super C1564a> continuation) {
                    super(2, continuation);
                    this.f106390c = receiptsAndSavingsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1564a c1564a = new C1564a(this.f106390c, continuation);
                    c1564a.f106389b = obj;
                    return c1564a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1564a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f106388a == 0) {
                        ResultKt.b(obj);
                        g.a aVar = (g.a) this.f106389b;
                        if (aVar instanceof g.a.StartCustomerResubmitDetailActivity) {
                            this.f106390c.F1(((g.a.StartCustomerResubmitDetailActivity) aVar).getTrackingData());
                        } else if (aVar instanceof g.a.StartDigitalReceiptsActivity) {
                            g.a.StartDigitalReceiptsActivity startDigitalReceiptsActivity = (g.a.StartDigitalReceiptsActivity) aVar;
                            this.f106390c.G1(startDigitalReceiptsActivity.getReceipt(), startDigitalReceiptsActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartOrderDetailsActivity) {
                            g.a.StartOrderDetailsActivity startOrderDetailsActivity = (g.a.StartOrderDetailsActivity) aVar;
                            this.f106390c.H1(startOrderDetailsActivity.getOrderId(), startOrderDetailsActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartSavingsDetailActivity) {
                            g.a.StartSavingsDetailActivity startSavingsDetailActivity = (g.a.StartSavingsDetailActivity) aVar;
                            this.f106390c.J1(startSavingsDetailActivity.getSavingsDetails(), startSavingsDetailActivity.getTrackingData());
                        } else if (aVar instanceof g.a.StartSelfRemediationActivity) {
                            this.f106390c.K1(((g.a.StartSelfRemediationActivity) aVar).getTrackingData());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106386a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<g.a> interfaceC16553FA = this.f106387b.z1().A();
                    C1564a c1564a = new C1564a(this.f106387b, null);
                    this.f106386a = 1;
                    if (C16563h.k(interfaceC16553FA, c1564a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
            C16507K.b(ReceiptsAndSavingsActivity.this.C1(), c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
            Ki.K.b(null, ComposableLambdaKt.c(649548470, true, new C1559a((InterfaceC5872l0) objB3, ReceiptsAndSavingsActivity.this, z1VarB2, z1VarB3, z1VarB), composer, 54), composer, 48, 1);
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
            return Unit.f143329a;
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
        public static final C17993c1 l(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106391f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f106391f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106391f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106392f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f106392f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106392f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106393f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106394g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106393f = function0;
            this.f106394g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106393f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106394g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106395f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f106395f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106395f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f106396f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106396f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106397f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106398g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106397f = function0;
            this.f106398g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106397f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106398g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(TrackingData trackingData) {
        startActivity(Bl.d.b(this, false, 0, 6, null));
        getAnalyticsEngine().k(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L B1() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g C1() {
        return (C16521g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g E1(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
        return new C16521g(receiptsAndSavingsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(TrackingData trackingData) {
        startActivity(Bl.d.f3122a.c(this));
        getAnalyticsEngine().k(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(DigitalReceipt receipt, TrackingData trackingData) {
        startActivity(Bl.d.f3122a.f(this, receipt));
        getAnalyticsEngine().k(trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(Long orderId, TrackingData trackingData) {
        if (orderId == null) {
            new Qj.j(this, com.meijer.mobile.meijer.Y.f101219u9, new Object[0]).r(com.meijer.mobile.meijer.Y.f101199t9, new Object[0]).o(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ReceiptsAndSavingsActivity.I1(dialogInterface, i10);
                }
            }).f(Cj.p.f5106e).g();
        } else {
            startActivity(Bl.l.f3131a.a(this, orderId.toString(), "", ""));
            getAnalyticsEngine().k(trackingData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(CustomerSavings savingsDetail, TrackingData trackingData) {
        startActivity(Bl.d.f3122a.h(this, savingsDetail));
        if (savingsDetail != null) {
            getAnalyticsEngine().k(trackingData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, A1().e(AbstractC18503f.h0.f172881h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSignIn() {
        startActivity(Bl.k.b(this, false, null, 1000, null, null, null, 118, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sm.g z1() {
        return (Sm.g) this.digitalReceiptsViewModel.getValue();
    }

    public final zl.k A1() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Cs.b D1() {
        Cs.b bVar = this.userProvider;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("userProvider");
        return null;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final AppVersion y1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.digitalreceipts.Hilt_ReceiptsAndSavingsActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1556289829, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("mPerks | Receipts Savings").start();
    }
}
