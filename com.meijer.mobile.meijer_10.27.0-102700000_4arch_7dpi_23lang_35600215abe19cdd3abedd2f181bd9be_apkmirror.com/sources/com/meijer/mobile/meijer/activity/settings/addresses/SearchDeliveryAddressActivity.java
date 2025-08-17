package com.meijer.mobile.meijer.activity.settings.addresses;

import Dh.AccountAddress;
import Dn.AddressPrediction;
import Dn.I;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity;
import e.C13589e;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import ji.C14949n;
import ji.j1;
import ji.q1;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17988z0;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import ys.C18301b;
import zn.V;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/SearchDeliveryAddressActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "LDh/a;", "selectedAddress", "", "F1", "(LDh/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDn/I;", "r", "Lkotlin/Lazy;", "E1", "()LDn/I;", "viewModel", "s", "a", "LDn/I$d;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SearchDeliveryAddressActivity extends MeijerActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f111799t = 8;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(I.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/SearchDeliveryAddressActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fromOrderOptions", "", "accountAddressSize", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZI)Landroid/content/Intent;", "", "EXTRA_FROM_ORDER_OPTIONS", "Ljava/lang/String;", "EXTRA_ACCOUNT_ADDRESS_SIZE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, boolean fromOrderOptions, int accountAddressSize) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) SearchDeliveryAddressActivity.class).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.EXTRA_FROM_ORDER_OPTIONS", fromOrderOptions).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", accountAddressSize);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17927c1 f111802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchDeliveryAddressActivity f111803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<I.SearchAddressViewState> f111804c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$a, reason: collision with other inner class name */
            static final class C1749a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111805a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchDeliveryAddressActivity f111806b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1750a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111807a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SearchDeliveryAddressActivity f111808b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$a$a$a, reason: collision with other inner class name */
                    static final class C1751a implements Function3<j1, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111809a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SearchDeliveryAddressActivity f111810b;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$a$a$a$a, reason: collision with other inner class name */
                        static final class C1752a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f111811a;

                            C1752a(LocalThemeScope localThemeScope) {
                                this.f111811a = localThemeScope;
                            }

                            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                                Intrinsics.j(AdsButton, "$this$AdsButton");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(945365690, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:77)");
                                }
                                C17988z0.a(C16190d.c(C.f.o.f15522e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C6408b.a(AbstractC5607a.INSTANCE.d(Y.f99653K8, new Object[0]), composer, AbstractC5607a.f45514b), null, this.f111811a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                                a(interfaceC14800I, composer, num.intValue());
                                return Unit.f142422a;
                            }
                        }

                        C1751a(LocalThemeScope localThemeScope, SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                            this.f111809a = localThemeScope;
                            this.f111810b = searchDeliveryAddressActivity;
                        }

                        public final void b(j1 Assemble, Composer composer, int i10) {
                            Intrinsics.j(Assemble, "$this$Assemble");
                            if (ComposerKt.M()) {
                                ComposerKt.U(-555237939, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:73)");
                            }
                            LocalThemeScope localThemeScope = this.f111809a;
                            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(this.f111810b);
                            final SearchDeliveryAddressActivity searchDeliveryAddressActivity = this.f111810b;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.w
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SearchDeliveryAddressActivity.b.a.C1749a.C1750a.C1751a.c(searchDeliveryAddressActivity);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(945365690, true, new C1752a(this.f111809a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                            b(j1Var, composer, num.intValue());
                            return Unit.f142422a;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit c(SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                            searchDeliveryAddressActivity.finish();
                            return Unit.f142422a;
                        }
                    }

                    C1750a(LocalThemeScope localThemeScope, SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                        this.f111807a = localThemeScope;
                        this.f111808b = searchDeliveryAddressActivity;
                    }

                    public final void a(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(207063557, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:71)");
                        }
                        LocalThemeScope localThemeScope = this.f111807a;
                        SearchDeliveryAddressActivity searchDeliveryAddressActivity = this.f111808b;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion2.a();
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
                        D1.c(composerA, measurePolicyB, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C14801J c14801j = C14801J.f139030a;
                        Q.e(localThemeScope, C14949n.f139910a, ComposableLambdaKt.c(-555237939, true, new C1751a(localThemeScope, searchDeliveryAddressActivity), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14949n.f139911b << 3));
                        composer.v();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        a(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$a$b, reason: collision with other inner class name */
                static final class C1753b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111812a;

                    C1753b(LocalThemeScope localThemeScope) {
                        this.f111812a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(719979883, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:66)");
                        }
                        Dr.g.g(this.f111812a, C16193g.c(C18301b.f171289o, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(2035019947, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:61)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f99653K8, new Object[0]);
                    C.f.d dVar = C.f.d.f15507e;
                    LocalThemeScope localThemeScope = this.f111805a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(207063557, true, new C1750a(localThemeScope, this.f111806b), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(719979883, true, new C1753b(this.f111805a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111806b);
                    final SearchDeliveryAddressActivity searchDeliveryAddressActivity = this.f111806b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchDeliveryAddressActivity.b.a.C1749a.c(searchDeliveryAddressActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24960 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1749a(LocalThemeScope localThemeScope, SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                    this.f111805a = localThemeScope;
                    this.f111806b = searchDeliveryAddressActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                    if (!searchDeliveryAddressActivity.onNavigateUp()) {
                        searchDeliveryAddressActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$b$a$b, reason: collision with other inner class name */
            static final class C1754b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111813a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchDeliveryAddressActivity f111814b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<I.SearchAddressViewState> f111815c;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                    searchDeliveryAddressActivity.F1(null);
                    return Unit.f142422a;
                }

                public final void e(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(395301540, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:95)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(companion, paddingValues);
                    LocalThemeScope localThemeScope = this.f111813a;
                    final SearchDeliveryAddressActivity searchDeliveryAddressActivity = this.f111814b;
                    z1<I.SearchAddressViewState> z1Var = this.f111815c;
                    MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
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
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14815g c14815g = C14815g.f139108a;
                    I.SearchAddressViewState dVarC = b.c(z1Var);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(searchDeliveryAddressActivity);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SearchDeliveryAddressActivity.b.a.C1754b.f(searchDeliveryAddressActivity, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function1 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(searchDeliveryAddressActivity);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchDeliveryAddressActivity.b.a.C1754b.g(searchDeliveryAddressActivity);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function0 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(searchDeliveryAddressActivity);
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchDeliveryAddressActivity.b.a.C1754b.k(searchDeliveryAddressActivity);
                            }
                        };
                        composer.t(objB3);
                    }
                    Function0 function02 = (Function0) objB3;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(searchDeliveryAddressActivity);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.A
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SearchDeliveryAddressActivity.b.a.C1754b.l(searchDeliveryAddressActivity, (AddressPrediction) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    V.i(localThemeScope, companion, dVarC, function1, function0, function02, (Function1) objB4, composer, LocalThemeScope.f15770g | 48, 0);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1754b(LocalThemeScope localThemeScope, SearchDeliveryAddressActivity searchDeliveryAddressActivity, z1<I.SearchAddressViewState> z1Var) {
                    this.f111813a = localThemeScope;
                    this.f111814b = searchDeliveryAddressActivity;
                    this.f111815c = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(SearchDeliveryAddressActivity searchDeliveryAddressActivity, String query) {
                    Intrinsics.j(query, "query");
                    searchDeliveryAddressActivity.E1().y(new I.b.SetSearchQuery(query));
                    searchDeliveryAddressActivity.E1().y(I.b.C0104b.f6818a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(SearchDeliveryAddressActivity searchDeliveryAddressActivity, AddressPrediction selectedAddress) {
                    Intrinsics.j(selectedAddress, "selectedAddress");
                    searchDeliveryAddressActivity.E1().y(new I.b.CompleteAddressItemClickAction(selectedAddress));
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    e(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                    searchDeliveryAddressActivity.E1().y(I.b.C0104b.f6818a);
                    return Unit.f142422a;
                }
            }

            a(C17927c1 c17927c1, SearchDeliveryAddressActivity searchDeliveryAddressActivity, z1<I.SearchAddressViewState> z1Var) {
                this.f111802a = c17927c1;
                this.f111803b = searchDeliveryAddressActivity;
                this.f111804c = z1Var;
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
                    ComposerKt.U(-741728794, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous>.<anonymous> (SearchDeliveryAddressActivity.kt:57)");
                }
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f111802a, ComposableLambdaKt.c(2035019947, true, new C1749a(AdsTheme, this.f111803b), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(395301540, true, new C1754b(AdsTheme, this.f111803b, this.f111804c), composer, 54), composer, 384, 12582912, 131064);
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

        b() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-210426793, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.onCreate.<anonymous> (SearchDeliveryAddressActivity.kt:53)");
            }
            K.b(null, ComposableLambdaKt.c(-741728794, true, new a(C17921a1.g(null, null, composer, 0, 3), SearchDeliveryAddressActivity.this, o1.b(SearchDeliveryAddressActivity.this.E1().x(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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
        public static final I.SearchAddressViewState c(z1<I.SearchAddressViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity$onCreate$2", f = "SearchDeliveryAddressActivity.kt", l = {125}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111816a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchDeliveryAddressActivity f111818a;

            a(SearchDeliveryAddressActivity searchDeliveryAddressActivity) {
                this.f111818a = searchDeliveryAddressActivity;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(I.c cVar, Continuation<? super Unit> continuation) {
                if (!(cVar instanceof I.c.CompleteSearchEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f111818a.F1(((I.c.CompleteSearchEvent) cVar).getPredictedAddressSelection());
                return Unit.f142422a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchDeliveryAddressActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111816a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17144F<I.c> interfaceC17144FW = SearchDeliveryAddressActivity.this.E1().w();
                a aVar = new a(SearchDeliveryAddressActivity.this);
                this.f111816a = 1;
                if (interfaceC17144FW.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111819f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111819f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111819f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111820f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f111820f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111820f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111821f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111822g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111821f = function0;
            this.f111822g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111821f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111822g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I E1() {
        return (I) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(AccountAddress selectedAddress) {
        Intent intentA = AddressDetailsActivity.INSTANCE.a(this, selectedAddress, getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.EXTRA_FROM_ORDER_OPTIONS", false), Integer.valueOf(getIntent().getIntExtra("com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", 0)));
        if (getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity.EXTRA_FROM_ORDER_OPTIONS", false)) {
            intentA = intentA.addFlags(33554432);
        }
        startActivity(intentA);
        finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-210426793, true, new b()), 1, null);
        C16648k.d(C6031t.a(this), null, null, new c(null), 3, null);
    }
}
