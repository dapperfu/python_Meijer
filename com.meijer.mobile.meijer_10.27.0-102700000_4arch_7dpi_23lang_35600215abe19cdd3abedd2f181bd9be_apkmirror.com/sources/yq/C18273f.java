package yq;

import Ji.LocalThemeScope;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lq.C15482t;
import lq.M;
import lq.P;
import nq.t;
import nq.v;
import xq.C18085d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/s;", "Li4/k;", "navController", "LJi/M;", "localThemeScope", "", "a", "(Li4/s;Li4/k;LJi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yq.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18273f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yq.f$a */
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170865a;

        a(LocalThemeScope localThemeScope) {
            this.f170865a = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(2087025257, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:36)");
            }
            iq.f.d(this.f170865a, null, composer, LocalThemeScope.f15770g, 1);
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
    /* renamed from: yq.f$b */
    static final class b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170866a;

        b(LocalThemeScope localThemeScope) {
            this.f170866a = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1296997600, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:39)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            composer.startReplaceableGroup(1890788296);
            h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            f0.c cVarA = O2.a.a(h0VarC, composer, 0);
            composer.startReplaceableGroup(1729797275);
            c0 c0VarB = W2.d.b(v.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer, 36936, 0);
            composer.U();
            composer.U();
            t.Q(this.f170866a, (v) c0VarB, modifierFsUnmask, composer, LocalThemeScope.f15770g, 0);
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
    /* renamed from: yq.f$c */
    static final class c implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14667k f170867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170868b;

        c(C14667k c14667k, LocalThemeScope localThemeScope) {
            this.f170867a = c14667k;
            this.f170868b = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(-851403231, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:45)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            C14667k c14667k = this.f170867a;
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
                c0VarB = W2.d.b(P.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
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
                c0VarB = W2.d.b(P.class, c14664h, null, cVarA2, c14664h != null ? c14664h.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            M.t(this.f170868b, (P) c0VarB, modifierFsUnmask, composer2, LocalThemeScope.f15770g, 0);
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
    /* renamed from: yq.f$d */
    static final class d implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14667k f170869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170870b;

        d(C14667k c14667k, LocalThemeScope localThemeScope) {
            this.f170869a = c14667k;
            this.f170870b = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(1295163234, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.shoppingNavGraph.<anonymous>.<anonymous> (ShoppingNavGraph.kt:51)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            C14667k c14667k = this.f170869a;
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
                c0VarB = W2.d.b(P.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
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
                c0VarB = W2.d.b(P.class, c14664h, null, cVarA2, c14664h != null ? c14664h.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            C15482t.F(this.f170870b, (P) c0VarB, modifierFsUnmask, composer2, LocalThemeScope.f15770g, 0);
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

    public static final void a(C14675s c14675s, C14667k navController, LocalThemeScope localThemeScope) {
        Intrinsics.j(c14675s, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(localThemeScope, "localThemeScope");
        C18085d.a.C2730a c2730a = C18085d.a.C2730a.f169850b;
        C14675s c14675s2 = new C14675s(c14675s.getProvider(), c2730a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "cart");
        i.c(c14675s2, c2730a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2087025257, true, new a(localThemeScope)), 126, null);
        i.c(c14675s2, C18085d.a.j.f169859b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1296997600, true, new b(localThemeScope)), 126, null);
        i.c(c14675s2, C18085d.a.g.f169856b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-851403231, true, new c(navController, localThemeScope)), 126, null);
        i.c(c14675s2, C18085d.a.e.f169854b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1295163234, true, new d(navController, localThemeScope)), 126, null);
        c14675s.e(c14675s2);
    }
}
