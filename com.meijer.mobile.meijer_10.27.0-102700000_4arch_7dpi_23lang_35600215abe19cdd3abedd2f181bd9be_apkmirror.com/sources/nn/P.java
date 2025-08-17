package nn;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nn.P;
import ok.StoreDetails;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Li4/u;", "navController", "", "startDestination", "toolbarTitle", "Lok/h;", "storeDetails", "Lkotlin/Function0;", "", "exitFlyBuy", "c", "(LJi/M;Li4/u;Ljava/lang/String;Ljava/lang/String;Lok/h;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f151993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ StoreDetails f151994c;

        a(LocalThemeScope localThemeScope, String str, StoreDetails storeDetails) {
            this.f151992a = localThemeScope;
            this.f151993b = str;
            this.f151994c = storeDetails;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(93782991, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyNavigationComponent.<anonymous>.<anonymous>.<anonymous> (FlyBuyNavigationComponent.kt:43)");
            }
            G.i(this.f151992a, this.f151993b, this.f151994c, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            a(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f151996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f151997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14677u f151998d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f151999e;

        b(LocalThemeScope localThemeScope, String str, String str2, C14677u c14677u, Function0<Unit> function0) {
            this.f151995a = localThemeScope;
            this.f151996b = str;
            this.f151997c = str2;
            this.f151998d = c14677u;
            this.f151999e = function0;
        }

        public final void b(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(519150840, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyNavigationComponent.<anonymous>.<anonymous>.<anonymous> (FlyBuyNavigationComponent.kt:50)");
            }
            LocalThemeScope localThemeScope = this.f151995a;
            String str = this.f151996b;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f151997c) | composer.D(this.f151998d) | composer.V(this.f151999e);
            final String str2 = this.f151997c;
            final C14677u c14677u = this.f151998d;
            final Function0<Unit> function0 = this.f151999e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P.b.c(str2, c14677u, function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            r.z(localThemeScope, str, modifierFsUnmask, (Function0) objB, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            b(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, C14677u c14677u, Function0 function0) {
            P.d(str, c14677u, function0);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f152001b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152002c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14677u f152003d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152004e;

        c(LocalThemeScope localThemeScope, String str, String str2, C14677u c14677u, Function0<Unit> function0) {
            this.f152000a = localThemeScope;
            this.f152001b = str;
            this.f152002c = str2;
            this.f152003d = c14677u;
            this.f152004e = function0;
        }

        public final void b(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1177533719, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyNavigationComponent.<anonymous>.<anonymous>.<anonymous> (FlyBuyNavigationComponent.kt:57)");
            }
            LocalThemeScope localThemeScope = this.f152000a;
            String str = this.f152001b;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f152002c) | composer.D(this.f152003d) | composer.V(this.f152004e);
            final String str2 = this.f152002c;
            final C14677u c14677u = this.f152003d;
            final Function0<Unit> function0 = this.f152004e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P.c.c(str2, c14677u, function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15911x.g(localThemeScope, str, modifierFsUnmask, (Function0) objB, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            b(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, C14677u c14677u, Function0 function0) {
            P.d(str, c14677u, function0);
            return Unit.f142422a;
        }
    }

    public static final void c(final LocalThemeScope localThemeScope, final C14677u navController, final String startDestination, final String toolbarTitle, final StoreDetails storeDetails, final Function0<Unit> exitFlyBuy, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(startDestination, "startDestination");
        Intrinsics.j(toolbarTitle, "toolbarTitle");
        Intrinsics.j(exitFlyBuy, "exitFlyBuy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035337585);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(navController) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(startDestination) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(toolbarTitle) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(storeDetails) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(exitFlyBuy) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1035337585, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyNavigationComponent (FlyBuyNavigationComponent.kt:29)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 7168) == 2048) | composerStartRestartGroup.D(storeDetails) | ((i11 & 896) == 256) | composerStartRestartGroup.D(navController) | ((458752 & i11) == 131072);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: nn.N
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P.e(localThemeScope, toolbarTitle, storeDetails, startDestination, navController, exitFlyBuy, (C14675s) obj);
                    }
                };
                composerStartRestartGroup.t(function1);
                objB = function1;
            }
            composerStartRestartGroup.P();
            j4.k.b(navController, startDestination, null, null, null, null, null, null, null, (Function1) objB, composerStartRestartGroup, (i11 >> 3) & 126, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.O
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return P.f(localThemeScope, navController, startDestination, toolbarTitle, storeDetails, exitFlyBuy, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, C14677u c14677u, Function0<Unit> function0) {
        if (Intrinsics.e(str, "im_here")) {
            c14677u.X();
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, StoreDetails storeDetails, String str2, C14677u c14677u, Function0 function0, C14675s NavHost) {
        Intrinsics.j(NavHost, "$this$NavHost");
        j4.i.c(NavHost, "im_here", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(93782991, true, new a(localThemeScope, str, storeDetails)), 126, null);
        j4.i.c(NavHost, "check_in", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(519150840, true, new b(localThemeScope, str, str2, c14677u, function0)), 126, null);
        j4.i.c(NavHost, "confirmation", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1177533719, true, new c(localThemeScope, str, str2, c14677u, function0)), 126, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, C14677u c14677u, String str, String str2, StoreDetails storeDetails, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, c14677u, str, str2, storeDetails, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
