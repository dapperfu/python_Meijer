package com.meijer.mobile.meijer.activity.gas_station;

import Al.s;
import Bi.m;
import Bj.o;
import Jd.C3778l;
import Jd.InterfaceC3769c;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import Td.AbstractC5232j;
import Td.InterfaceC5229g;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.R;
import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.M;
import com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity;
import com.meijer.mobile.meijer.activity.gas_station.f;
import e.C13589e;
import g.AbstractC14147c;
import g.InterfaceC14146b;
import g2.C14193b;
import h.C14320g;
import j0.InterfaceC14794C;
import java.util.Map;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
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
import kotlin.jvm.JvmField;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import xk.C18064b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/GasStationDetailActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "", "", "permissions", "", "M1", "(Ljava/util/Map;)V", "I1", "Q1", "N1", "()Z", "O1", "", "storeId", "P1", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/gas_station/f;", "s", "Lkotlin/Lazy;", "L1", "()Lcom/meijer/mobile/meijer/activity/gas_station/f;", "gasStationDetailViewModel", "LJd/c;", "t", "LJd/c;", "fusedLocationProviderClient", "Landroid/location/LocationManager;", "u", "Landroid/location/LocationManager;", "locationManager", "Lg/c;", "", "v", "Lg/c;", "permissionsResultLauncher", "Lcom/meijer/mobile/meijer/activity/gas_station/f$d;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class GasStationDetailActivity extends Hilt_GasStationDetailActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3769c fusedLocationProviderClient;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy gasStationDetailViewModel = new e0(Reflection.b(com.meijer.mobile.meijer.activity.gas_station.f.class), new e(this), new d(this), new f(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> permissionsResultLauncher = registerForActivityResult(new C14320g(), new c());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a, reason: collision with other inner class name */
        static final class C1650a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GasStationDetailActivity f109081a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<f.GasStationViewState> f109082b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$a, reason: collision with other inner class name */
            static final class C1651a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109083a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ GasStationDetailActivity f109084b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<f.GasStationViewState> f109085c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1652a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ z1<f.GasStationViewState> f109086a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109087b;

                    C1652a(z1<f.GasStationViewState> z1Var, LocalThemeScope localThemeScope) {
                        this.f109086a = z1Var;
                        this.f109087b = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-544983848, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:99)");
                        }
                        String title = a.c(this.f109086a).getTitle();
                        if (title != null) {
                            Dr.g.g(this.f109087b, title, null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
                        }
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
                        ComposerKt.U(201941400, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:98)");
                    }
                    LocalThemeScope localThemeScope = this.f109083a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-544983848, true, new C1652a(this.f109085c, localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f109084b);
                    final GasStationDetailActivity gasStationDetailActivity = this.f109084b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.gas_station.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GasStationDetailActivity.a.C1650a.C1651a.c(gasStationDetailActivity);
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

                C1651a(LocalThemeScope localThemeScope, GasStationDetailActivity gasStationDetailActivity, z1<f.GasStationViewState> z1Var) {
                    this.f109083a = localThemeScope;
                    this.f109084b = gasStationDetailActivity;
                    this.f109085c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(GasStationDetailActivity gasStationDetailActivity) {
                    if (!gasStationDetailActivity.onNavigateUp()) {
                        gasStationDetailActivity.finish();
                    }
                    bk.c.b(gasStationDetailActivity, 0, M.f98599a, M.f98601c, 0, 8, null);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$b */
            static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109088a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<f.GasStationViewState> f109089b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$b$a, reason: collision with other inner class name */
                static final class C1653a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14794C f109090a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109091b;

                    C1653a(InterfaceC14794C interfaceC14794C, LocalThemeScope localThemeScope) {
                        this.f109090a = interfaceC14794C;
                        this.f109091b = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1410575307, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:116)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        m.d(this.f109091b, androidx.compose.foundation.b.d(D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), this.f109090a), this.f109091b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
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

                b(LocalThemeScope localThemeScope, z1<f.GasStationViewState> z1Var) {
                    this.f109088a = localThemeScope;
                    this.f109089b = z1Var;
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
                        ComposerKt.U(-415397249, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:114)");
                    }
                    if (a.c(this.f109089b).getIsLoading()) {
                        LocalThemeScope localThemeScope = this.f109088a;
                        Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1410575307, true, new C1653a(contentPadding, localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
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

            C1650a(GasStationDetailActivity gasStationDetailActivity, z1<f.GasStationViewState> z1Var) {
                this.f109081a = gasStationDetailActivity;
                this.f109082b = z1Var;
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
                    ComposerKt.U(1865452285, i11, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous> (GasStationDetailActivity.kt:93)");
                }
                C17921a1.a(J.f(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 1, null), null, ComposableLambdaKt.c(201941400, true, new C1651a(AdsTheme, this.f109081a, this.f109082b), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-415397249, true, new b(AdsTheme, this.f109082b), composer, 54), composer, 384, 12582912, 131066);
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

        a() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1409626220, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous> (GasStationDetailActivity.kt:91)");
            }
            K.b(null, ComposableLambdaKt.c(1865452285, true, new C1650a(GasStationDetailActivity.this, o1.b(GasStationDetailActivity.this.L1().t(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f.GasStationViewState c(z1<f.GasStationViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2", f = "GasStationDetailActivity.kt", l = {132}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109092a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2$1", f = "GasStationDetailActivity.kt", l = {133}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GasStationDetailActivity f109095b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GasStationDetailActivity gasStationDetailActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109095b = gasStationDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109095b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/gas_station/f$c;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2$1$1", f = "GasStationDetailActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1654a extends SuspendLambda implements Function2<f.c, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109096a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f109097b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ GasStationDetailActivity f109098c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1654a(GasStationDetailActivity gasStationDetailActivity, Continuation<? super C1654a> continuation) {
                    super(2, continuation);
                    this.f109098c = gasStationDetailActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1654a c1654a = new C1654a(this.f109098c, continuation);
                    c1654a.f109097b = obj;
                    return c1654a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f.c cVar, Continuation<? super Unit> continuation) {
                    return ((C1654a) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f109096a == 0) {
                        ResultKt.b(obj);
                        f.c cVar = (f.c) this.f109097b;
                        if (cVar instanceof f.c.NavigateToGasStationDetails) {
                            this.f109098c.P1(((f.c.NavigateToGasStationDetails) cVar).getStoreId());
                        } else if (cVar instanceof f.c.NavigateToFindAGasStation) {
                            this.f109098c.O1();
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
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109094a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<f.c> events = this.f109095b.L1().getEvents();
                    C1654a c1654a = new C1654a(this.f109095b, null);
                    this.f109094a = 1;
                    if (C17154h.k(events, c1654a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GasStationDetailActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109092a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                GasStationDetailActivity gasStationDetailActivity = GasStationDetailActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                a aVar = new a(gasStationDetailActivity, null);
                this.f109092a = 1;
                if (C5994J.b(gasStationDetailActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, GasStationDetailActivity.this, GasStationDetailActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            GasStationDetailActivity.this.M1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109100f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f109100f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f109100f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109101f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f109101f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f109101f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f109102f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109103g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f109102f = function0;
            this.f109103g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f109102f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f109103g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void I1() {
        InterfaceC3769c interfaceC3769c = this.fusedLocationProviderClient;
        if (interfaceC3769c == null) {
            Intrinsics.y("fusedLocationProviderClient");
            interfaceC3769c = null;
        }
        AbstractC5232j<Location> abstractC5232jL = interfaceC3769c.l();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.gas_station.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GasStationDetailActivity.J1(this.f109106a, (Location) obj);
            }
        };
        abstractC5232jL.g(new InterfaceC5229g() { // from class: com.meijer.mobile.meijer.activity.gas_station.b
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                GasStationDetailActivity.K1(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(GasStationDetailActivity gasStationDetailActivity, Location location) {
        if (location != null) {
            gasStationDetailActivity.L1().u(new f.a.SearchNearbyGasStation(location.getLatitude(), location.getLongitude()));
        } else {
            gasStationDetailActivity.L1().u(f.a.C1655a.f109117a);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.gas_station.f L1() {
        return (com.meijer.mobile.meijer.activity.gas_station.f) this.gasStationDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(Map<String, Boolean> permissions) {
        if (Intrinsics.e(permissions.get("android.permission.ACCESS_FINE_LOCATION"), Boolean.TRUE) && N1()) {
            I1();
        } else {
            L1().u(f.a.C1655a.f109117a);
        }
    }

    private final boolean N1() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return C14193b.a(locationManager);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        startActivity(s.f(this, ok.i.f153983a, getString(Vq.c.f37740f), false, true, 0, null, false, 224, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(int storeId) {
        startActivity(s.f693a.b(this, storeId, ok.i.f153983a, true));
        finish();
    }

    private final void Q1() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bk.c.b(this, 0, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
        if (getIntent().getExtras() == null) {
            this.fusedLocationProviderClient = C3778l.a(this);
            if (N1() && C18064b.a(this, "android.permission.ACCESS_FINE_LOCATION")) {
                I1();
            } else {
                Q1();
            }
        } else {
            int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_GASSTATION_STORE_ID", 0);
            L1().y(getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_GASSTATION_STORE_NAME"));
            P1(intExtra);
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1409626220, true, new a()), 1, null);
        C16648k.d(C6031t.a(this), null, null, new b(null), 3, null);
    }
}
