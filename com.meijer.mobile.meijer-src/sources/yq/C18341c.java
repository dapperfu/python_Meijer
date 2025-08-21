package yq;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j4.i;
import kotlin.C14667h;
import kotlin.C14678s;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kq.h;
import xq.C18213d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li4/s;", "LKi/M;", "localThemeScope", "", "a", "(Li4/s;LKi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18341c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yq.c$a */
    static final class a implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171630a;

        a(LocalThemeScope localThemeScope) {
            this.f171630a = localThemeScope;
        }

        public final void a(InterfaceC6302b composable, C14667h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1953275884, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.landingNavGraph.<anonymous>.<anonymous> (LandingNavGraph.kt:25)");
            }
            h.c(this.f171630a, null, composer, LocalThemeScope.f17314g, 1);
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

    public static final void a(C14678s c14678s, LocalThemeScope localThemeScope) {
        Intrinsics.j(c14678s, "<this>");
        Intrinsics.j(localThemeScope, "localThemeScope");
        C18213d.a.f fVar = C18213d.a.f.f170947b;
        C14678s c14678s2 = new C14678s(c14678s.getProvider(), fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "landing");
        i.c(c14678s2, fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1953275884, true, new a(localThemeScope)), 126, null);
        c14678s.e(c14678s2);
    }
}
