package yq;

import Ki.LocalThemeScope;
import Qp.g;
import V2.CreationExtras;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j4.i;
import kotlin.C14667h;
import kotlin.C14670k;
import kotlin.C14677r;
import kotlin.C14678s;
import kotlin.InterfaceC6302b;
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
import xq.C18213d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/s;", "Li4/k;", "navController", "LKi/M;", "localThemeScope", "", "b", "(Li4/s;Li4/k;LKi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yq.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18343e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.e$a */
    static final class a implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14670k f171634b;

        a(LocalThemeScope localThemeScope, C14670k c14670k) {
            this.f171633a = localThemeScope;
            this.f171634b = c14670k;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1633178309, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:37)");
            }
            LocalThemeScope localThemeScope = this.f171633a;
            C14670k c14670k = this.f171634b;
            composer.startReplaceGroup(-482755990);
            C14677r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                composer2 = composer;
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
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
                    objB = c14670k.A(str);
                    composer2.t(objB);
                }
                C14667h c14667h = (C14667h) objB;
                composer2.P();
                composer2.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14667h, composer2, 0);
                composer2.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            p.F(localThemeScope, (y) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer2, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.e$b */
    static final class b implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14670k f171636b;

        b(LocalThemeScope localThemeScope, C14670k c14670k) {
            this.f171635a = localThemeScope;
            this.f171636b = c14670k;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1248165884, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:43)");
            }
            LocalThemeScope localThemeScope = this.f171635a;
            C14670k c14670k = this.f171636b;
            composer.startReplaceGroup(-482755990);
            C14677r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                composer2 = composer;
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
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
                    objB = c14670k.A(str);
                    composer2.t(objB);
                }
                C14667h c14667h = (C14667h) objB;
                composer2.P();
                composer2.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14667h, composer2, 0);
                composer2.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            g.n(localThemeScope, (y) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer2, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.e$c */
    static final class c implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14670k f171637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171638b;

        c(C14670k c14670k, LocalThemeScope localThemeScope) {
            this.f171637a = c14670k;
            this.f171638b = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            c0 c0VarB;
            Composer composer2;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(-511193987, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:49)");
            }
            C14670k c14670k = this.f171637a;
            composer.startReplaceGroup(-482755990);
            C14677r parent = screen.getDestination().getParent();
            String str = parent != null ? parent.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() : null;
            composer.startReplaceGroup(-72033891);
            if (str == null) {
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer, 36936, 0);
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
                    objB = c14670k.A(str);
                    composer.t(objB);
                }
                C14667h c14667h = (C14667h) objB;
                composer.P();
                composer.startReplaceableGroup(1890788296);
                f0.c cVarA2 = O2.a.a(c14667h, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0VarB = W2.d.b(y.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer, 36936, 0);
                composer2 = composer;
                composer2.U();
                composer2.U();
                composer2.P();
            }
            J.g(this.f171638b, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), (y) c0VarB, composer2, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.e$d */
    static final class d implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171639a;

        d(LocalThemeScope localThemeScope) {
            this.f171639a = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(2024413438, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.optionsMenuNavGraph.<anonymous>.<anonymous> (OptionsMenuNavGraph.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f171639a;
            composer.startReplaceableGroup(1890788296);
            h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            f0.c cVarA = O2.a.a(h0VarC, composer, 0);
            composer.startReplaceableGroup(1729797275);
            c0 c0VarB = W2.d.b(oq.p.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer, 36936, 0);
            composer.U();
            composer.U();
            l.B(localThemeScope, (oq.p) c0VarB, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(C14678s c14678s, final C14670k navController, final LocalThemeScope localThemeScope) {
        Intrinsics.j(c14678s, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(localThemeScope, "localThemeScope");
        i.f(c14678s, C18213d.a.h.f170949b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "options_menu", null, null, null, null, null, null, new Function1() { // from class: yq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18343e.c(localThemeScope, navController, (C14678s) obj);
            }
        }, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, C14670k c14670k, C14678s navigation) {
        Intrinsics.j(navigation, "$this$navigation");
        i.c(navigation, C18213d.a.h.f170949b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1633178309, true, new a(localThemeScope, c14670k)), 126, null);
        i.c(navigation, C18213d.a.C2749d.f170945b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1248165884, true, new b(localThemeScope, c14670k)), 126, null);
        i.c(navigation, C18213d.a.l.f170953b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-511193987, true, new c(c14670k, localThemeScope)), 126, null);
        i.c(navigation, C18213d.a.k.f170952b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2024413438, true, new d(localThemeScope)), 126, null);
        return Unit.f143329a;
    }
}
