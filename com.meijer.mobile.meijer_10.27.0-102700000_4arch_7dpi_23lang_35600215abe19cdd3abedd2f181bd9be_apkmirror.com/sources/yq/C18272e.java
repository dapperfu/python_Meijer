package yq;

import Ji.LocalThemeScope;
import Qp.g;
import V2.CreationExtras;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6020j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j4.i;
import kotlin.C14664h;
import kotlin.C14667k;
import kotlin.C14674r;
import kotlin.C14675s;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mq.J;
import mq.p;
import mq.y;
import oq.l;
import xq.C18085d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/s;", "Li4/k;", "navController", "LJi/M;", "localThemeScope", "", "b", "(Li4/s;Li4/k;LJi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yq.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18272e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.e$a */
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14667k f170859b;

        a(LocalThemeScope localThemeScope, C14667k c14667k) {
            this.f170858a = localThemeScope;
            this.f170859b = c14667k;
        }

        public final void a(InterfaceC6163b composable, C14664h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1633178309, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:37)");
            }
            LocalThemeScope localThemeScope = this.f170858a;
            C14667k c14667k = this.f170859b;
            composer.startReplaceGroup(-482755990);
            C14674r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                composer2 = composer;
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
                composer2.P();
            } else {
                composer2 = composer;
                composer2.P();
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(screen);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = c14667k.A(str);
                    composer2.t(objB);
                }
                C14664h c14664h = (C14664h) objB;
                composer2.P();
                composer2.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14664h, composer2, 0);
                composer2.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14664h, null, cVarA2, c14664h != null ? c14664h.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            p.F(localThemeScope, (y) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer2, LocalThemeScope.f15770g, 0);
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
    /* renamed from: yq.e$b */
    static final class b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14667k f170861b;

        b(LocalThemeScope localThemeScope, C14667k c14667k) {
            this.f170860a = localThemeScope;
            this.f170861b = c14667k;
        }

        public final void a(InterfaceC6163b composable, C14664h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1248165884, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:43)");
            }
            LocalThemeScope localThemeScope = this.f170860a;
            C14667k c14667k = this.f170861b;
            composer.startReplaceGroup(-482755990);
            C14674r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                composer2 = composer;
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
                composer2.P();
            } else {
                composer2 = composer;
                composer2.P();
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(screen);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = c14667k.A(str);
                    composer2.t(objB);
                }
                C14664h c14664h = (C14664h) objB;
                composer2.P();
                composer2.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14664h, composer2, 0);
                composer2.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14664h, null, cVarA2, c14664h != null ? c14664h.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            g.n(localThemeScope, (y) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer2, LocalThemeScope.f15770g, 0);
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
    /* renamed from: yq.e$c */
    static final class c implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14667k f170862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170863b;

        c(C14667k c14667k, LocalThemeScope localThemeScope) {
            this.f170862a = c14667k;
            this.f170863b = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h screen, Composer composer, int i10) {
            c0 c0VarB;
            Composer composer2;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(-511193987, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:49)");
            }
            C14667k c14667k = this.f170862a;
            composer.startReplaceGroup(-482755990);
            C14674r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer, 36936, 0);
                composer2 = composer;
                composer2.U();
                composer2.U();
                composer2.P();
                composer2.P();
            } else {
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(screen);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = c14667k.A(str);
                    composer.t(objB);
                }
                C14664h c14664h = (C14664h) objB;
                composer.P();
                composer.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14664h, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14664h, null, cVarA2, c14664h != null ? c14664h.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer, 36936, 0);
                composer2 = composer;
                composer2.U();
                composer2.U();
                composer2.P();
            }
            J.g(this.f170863b, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), (y) c0VarB, composer2, LocalThemeScope.f15770g, 0);
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
    /* renamed from: yq.e$d */
    static final class d implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170864a;

        d(LocalThemeScope localThemeScope) {
            this.f170864a = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(2024413438, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f170864a;
            composer.startReplaceableGroup(1890788296);
            h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            f0.c cVarA = O2.a.a(h0VarC, composer, 0);
            composer.startReplaceableGroup(1729797275);
            c0 c0VarB = W2.d.b(oq.p.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer, 36936, 0);
            composer.U();
            composer.U();
            l.B(localThemeScope, (oq.p) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, LocalThemeScope.f15770g, 0);
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

    public static final void b(C14675s c14675s, final C14667k navController, final LocalThemeScope localThemeScope) {
        Intrinsics.j(c14675s, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(localThemeScope, "localThemeScope");
        i.f(c14675s, C18085d.a.h.f169857b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "options_menu", null, null, null, null, null, null, new Function1() { // from class: yq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18272e.c(localThemeScope, navController, (C14675s) obj);
            }
        }, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, C14667k c14667k, C14675s navigation) {
        Intrinsics.j(navigation, "$this$navigation");
        i.c(navigation, C18085d.a.h.f169857b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1633178309, true, new a(localThemeScope, c14667k)), 126, null);
        i.c(navigation, C18085d.a.C2731d.f169853b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1248165884, true, new b(localThemeScope, c14667k)), 126, null);
        i.c(navigation, C18085d.a.l.f169861b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-511193987, true, new c(c14667k, localThemeScope)), 126, null);
        i.c(navigation, C18085d.a.k.f169860b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2024413438, true, new d(localThemeScope)), 126, null);
        return Unit.f142422a;
    }
}
