package yq;

import Ki.LocalThemeScope;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lq.C15593t;
import lq.M;
import lq.P;
import nq.t;
import nq.v;
import xq.C18213d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/s;", "Li4/k;", "navController", "LKi/M;", "localThemeScope", "", "a", "(Li4/s;Li4/k;LKi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yq.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18344f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yq.f$a */
    static final class a implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171640a;

        a(LocalThemeScope localThemeScope) {
            this.f171640a = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(2087025257, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:36)");
            }
            iq.f.d(this.f171640a, null, composer, LocalThemeScope.f17314g, 1);
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
    /* renamed from: yq.f$b */
    static final class b implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171641a;

        b(LocalThemeScope localThemeScope) {
            this.f171641a = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1296997600, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:39)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            composer.startReplaceableGroup(1890788296);
            h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            f0.c cVarA = O2.a.a(h0VarC, composer, 0);
            composer.startReplaceableGroup(1729797275);
            c0 c0VarB = W2.d.b(v.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer, 36936, 0);
            composer.U();
            composer.U();
            t.Q(this.f171641a, (v) c0VarB, modifierFsUnmask, composer, LocalThemeScope.f17314g, 0);
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
    /* renamed from: yq.f$c */
    static final class c implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14670k f171642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171643b;

        c(C14670k c14670k, LocalThemeScope localThemeScope) {
            this.f171642a = c14670k;
            this.f171643b = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(-851403231, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:45)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            C14670k c14670k = this.f171642a;
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
                c0VarB = W2.d.b(P.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
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
                c0VarB = W2.d.b(P.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            M.t(this.f171643b, (P) c0VarB, modifierFsUnmask, composer2, LocalThemeScope.f17314g, 0);
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
    /* renamed from: yq.f$d */
    static final class d implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14670k f171644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171645b;

        d(C14670k c14670k, LocalThemeScope localThemeScope) {
            this.f171644a = c14670k;
            this.f171645b = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1295163234, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:51)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            C14670k c14670k = this.f171644a;
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
                c0VarB = W2.d.b(P.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
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
                c0VarB = W2.d.b(P.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            C15593t.F(this.f171645b, (P) c0VarB, modifierFsUnmask, composer2, LocalThemeScope.f17314g, 0);
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

    public static final void a(C14678s c14678s, C14670k navController, LocalThemeScope localThemeScope) {
        Intrinsics.j(c14678s, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(localThemeScope, "localThemeScope");
        C18213d.a.C2748a c2748a = C18213d.a.C2748a.f170942b;
        C14678s c14678s2 = new C14678s(c14678s.getProvider(), c2748a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "cart");
        i.c(c14678s2, c2748a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2087025257, true, new a(localThemeScope)), 126, null);
        i.c(c14678s2, C18213d.a.j.f170951b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1296997600, true, new b(localThemeScope)), 126, null);
        i.c(c14678s2, C18213d.a.g.f170948b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-851403231, true, new c(navController, localThemeScope)), 126, null);
        i.c(c14678s2, C18213d.a.e.f170946b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1295163234, true, new d(navController, localThemeScope)), 126, null);
        c14678s.e(c14678s2);
    }
}
