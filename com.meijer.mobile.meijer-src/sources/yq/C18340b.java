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
import jq.g;
import jq.h;
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
import xq.C18213d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/s;", "Li4/k;", "navController", "LKi/M;", "localThemeScope", "", "b", "(Li4/s;Li4/k;LKi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18340b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yq.b$a */
    static final class a implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14670k f171628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171629b;

        a(C14670k c14670k, LocalThemeScope localThemeScope) {
            this.f171628a = c14670k;
            this.f171629b = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h screen, Composer composer, int i10) {
            Composer composer2;
            c0 c0VarB;
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(screen, "screen");
            if (ComposerKt.M()) {
                ComposerKt.U(21635379, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.checkoutNavGraph.<anonymous>.<anonymous> (CheckoutNavGraph.kt:30)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            C14670k c14670k = this.f171628a;
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
                c0VarB = W2.d.b(h.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
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
                c0VarB = W2.d.b(h.class, c14667h, null, cVarA2, c14667h != null ? c14667h.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer2, 36936, 0);
                composer2.U();
                composer2.U();
                composer2.P();
            }
            g.r(this.f171629b, (h) c0VarB, modifierFsUnmask, composer2, LocalThemeScope.f17314g, 0);
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
        i.f(c14678s, C18213d.a.b.f170943b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "checkout", null, null, null, null, null, null, new Function1() { // from class: yq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18340b.c(navController, localThemeScope, (C14678s) obj);
            }
        }, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(C14670k c14670k, LocalThemeScope localThemeScope, C14678s navigation) {
        Intrinsics.j(navigation, "$this$navigation");
        i.c(navigation, C18213d.a.b.f170943b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(21635379, true, new a(c14670k, localThemeScope)), 126, null);
        return Unit.f143329a;
    }
}
