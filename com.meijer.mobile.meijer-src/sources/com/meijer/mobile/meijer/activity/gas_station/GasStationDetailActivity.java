package com.meijer.mobile.meijer.activity.gas_station;

import Bl.s;
import Ci.m;
import Cj.o;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import Ld.C4022l;
import Ld.InterfaceC4013c;
import V2.CreationExtras;
import Vd.AbstractC5516j;
import Vd.InterfaceC5513g;
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
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.M;
import com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity;
import com.meijer.mobile.meijer.activity.gas_station.f;
import e.C13737e;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import g2.C14322b;
import h.C14433g;
import j0.InterfaceC14882C;
import java.util.Map;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17987a1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16553F;
import yk.C18326b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/GasStationDetailActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "", "", "permissions", "", "M1", "(Ljava/util/Map;)V", "I1", "Q1", "N1", "()Z", "O1", "", "storeId", "P1", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/gas_station/f;", "s", "Lkotlin/Lazy;", "L1", "()Lcom/meijer/mobile/meijer/activity/gas_station/f;", "gasStationDetailViewModel", "LLd/c;", "t", "LLd/c;", "fusedLocationProviderClient", "Landroid/location/LocationManager;", "u", "Landroid/location/LocationManager;", "locationManager", "Lg/c;", "", "v", "Lg/c;", "permissionsResultLauncher", "Lcom/meijer/mobile/meijer/activity/gas_station/f$d;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GasStationDetailActivity extends Hilt_GasStationDetailActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4013c fusedLocationProviderClient;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy gasStationDetailViewModel = new e0(Reflection.b(com.meijer.mobile.meijer.activity.gas_station.f.class), new e(this), new d(this), new f(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new c());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a, reason: collision with other inner class name */
        static final class C1659a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GasStationDetailActivity f109942a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<f.GasStationViewState> f109943b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$a, reason: collision with other inner class name */
            static final class C1660a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109944a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ GasStationDetailActivity f109945b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<f.GasStationViewState> f109946c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1661a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ z1<f.GasStationViewState> f109947a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109948b;

                    C1661a(z1<f.GasStationViewState> z1Var, LocalThemeScope localThemeScope) {
                        this.f109947a = z1Var;
                        this.f109948b = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-544983848, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:99)");
                        }
                        String title = a.c(this.f109947a).getTitle();
                        if (title != null) {
                            Dr.g.g(this.f109948b, title, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
                        }
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
                        ComposerKt.U(201941400, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:98)");
                    }
                    LocalThemeScope localThemeScope = this.f109944a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-544983848, true, new C1661a(this.f109946c, localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f109945b);
                    final GasStationDetailActivity gasStationDetailActivity = this.f109945b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.gas_station.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GasStationDetailActivity.a.C1659a.C1660a.c(gasStationDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(o.f5080p, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1660a(LocalThemeScope localThemeScope, GasStationDetailActivity gasStationDetailActivity, z1<f.GasStationViewState> z1Var) {
                    this.f109944a = localThemeScope;
                    this.f109945b = gasStationDetailActivity;
                    this.f109946c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(GasStationDetailActivity gasStationDetailActivity) {
                    if (!gasStationDetailActivity.onNavigateUp()) {
                        gasStationDetailActivity.finish();
                    }
                    ck.c.b(gasStationDetailActivity, 0, M.f99457a, M.f99459c, 0, 8, null);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109949a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<f.GasStationViewState> f109950b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$a$a$b$a, reason: collision with other inner class name */
                static final class C1662a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14882C f109951a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109952b;

                    C1662a(InterfaceC14882C interfaceC14882C, LocalThemeScope localThemeScope) {
                        this.f109951a = interfaceC14882C;
                        this.f109952b = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1410575307, i10, -1, "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GasStationDetailActivity.kt:116)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        m.d(this.f109952b, androidx.compose.foundation.b.d(D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), this.f109951a), this.f109952b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
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

                b(LocalThemeScope localThemeScope, z1<f.GasStationViewState> z1Var) {
                    this.f109949a = localThemeScope;
                    this.f109950b = z1Var;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    if (a.c(this.f109950b).getIsLoading()) {
                        LocalThemeScope localThemeScope = this.f109949a;
                        Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1410575307, true, new C1662a(contentPadding, localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                    }
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

            C1659a(GasStationDetailActivity gasStationDetailActivity, z1<f.GasStationViewState> z1Var) {
                this.f109942a = gasStationDetailActivity;
                this.f109943b = z1Var;
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
                C17987a1.a(J.f(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 1, null), null, ComposableLambdaKt.c(201941400, true, new C1660a(AdsTheme, this.f109942a, this.f109943b), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-415397249, true, new b(AdsTheme, this.f109943b), composer, 54), composer, 384, 12582912, 131066);
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
            K.b(null, ComposableLambdaKt.c(1865452285, true, new C1659a(GasStationDetailActivity.this, o1.b(GasStationDetailActivity.this.L1().t(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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
        public static final f.GasStationViewState c(z1<f.GasStationViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2", f = "GasStationDetailActivity.kt", l = {132}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109953a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2$1", f = "GasStationDetailActivity.kt", l = {133}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GasStationDetailActivity f109956b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GasStationDetailActivity gasStationDetailActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109956b = gasStationDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109956b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/gas_station/f$c;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$onCreate$2$1$1", f = "GasStationDetailActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1663a extends SuspendLambda implements Function2<f.c, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109957a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f109958b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ GasStationDetailActivity f109959c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1663a(GasStationDetailActivity gasStationDetailActivity, Continuation<? super C1663a> continuation) {
                    super(2, continuation);
                    this.f109959c = gasStationDetailActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1663a c1663a = new C1663a(this.f109959c, continuation);
                    c1663a.f109958b = obj;
                    return c1663a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f.c cVar, Continuation<? super Unit> continuation) {
                    return ((C1663a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f109957a == 0) {
                        ResultKt.b(obj);
                        f.c cVar = (f.c) this.f109958b;
                        if (cVar instanceof f.c.NavigateToGasStationDetails) {
                            this.f109959c.P1(((f.c.NavigateToGasStationDetails) cVar).getStoreId());
                        } else if (cVar instanceof f.c.NavigateToFindAGasStation) {
                            this.f109959c.O1();
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
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109955a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<f.c> events = this.f109956b.L1().getEvents();
                    C1663a c1663a = new C1663a(this.f109956b, null);
                    this.f109955a = 1;
                    if (C16563h.k(events, c1663a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109953a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                GasStationDetailActivity gasStationDetailActivity = GasStationDetailActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                a aVar = new a(gasStationDetailActivity, null);
                this.f109953a = 1;
                if (C6136J.b(gasStationDetailActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14275b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            GasStationDetailActivity.this.M1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109961f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f109961f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f109961f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109962f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f109962f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f109962f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f109963f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109964g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f109963f = function0;
            this.f109964g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f109963f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f109964g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void I1() {
        InterfaceC4013c interfaceC4013c = this.fusedLocationProviderClient;
        if (interfaceC4013c == null) {
            Intrinsics.x("fusedLocationProviderClient");
            interfaceC4013c = null;
        }
        AbstractC5516j<Location> abstractC5516jM = interfaceC4013c.m();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.gas_station.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GasStationDetailActivity.J1(this.f109967a, (Location) obj);
            }
        };
        abstractC5516jM.g(new InterfaceC5513g() { // from class: com.meijer.mobile.meijer.activity.gas_station.b
            @Override // Vd.InterfaceC5513g
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
            gasStationDetailActivity.L1().u(f.a.C1664a.f109978a);
        }
        return Unit.f143329a;
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
            L1().u(f.a.C1664a.f109978a);
        }
    }

    private final boolean N1() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return C14322b.a(locationManager);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        startActivity(s.f(this, pk.i.f156743a, getString(Vq.c.f40167f), false, true, 0, null, false, 224, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(int storeId) {
        startActivity(s.f3151a.b(this, storeId, pk.i.f156743a, true));
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
        ck.c.b(this, 0, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
        if (getIntent().getExtras() == null) {
            this.fusedLocationProviderClient = C4022l.a(this);
            if (N1() && C18326b.a(this, "android.permission.ACCESS_FINE_LOCATION")) {
                I1();
            } else {
                Q1();
            }
        } else {
            int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_GASSTATION_STORE_ID", 0);
            L1().y(getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_GASSTATION_STORE_NAME"));
            P1(intExtra);
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1409626220, true, new a()), 1, null);
        C15809k.d(C6173t.a(this), null, null, new b(null), 3, null);
    }
}
