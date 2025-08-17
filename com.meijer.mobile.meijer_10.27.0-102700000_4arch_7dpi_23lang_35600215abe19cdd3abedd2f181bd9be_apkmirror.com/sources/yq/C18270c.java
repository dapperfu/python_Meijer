package yq;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j4.i;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kq.h;
import xq.C18085d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li4/s;", "LJi/M;", "localThemeScope", "", "a", "(Li4/s;LJi/M;)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yq.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18270c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yq.c$a */
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170855a;

        a(LocalThemeScope localThemeScope) {
            this.f170855a = localThemeScope;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(1953275884, i10, -1, "com.meijer.mobile.shopandscan.utils.navigation.graph.landingNavGraph.<anonymous>.<anonymous> (LandingNavGraph.kt:25)");
            }
            h.c(this.f170855a, null, composer, LocalThemeScope.f15770g, 1);
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

    public static final void a(C14675s c14675s, LocalThemeScope localThemeScope) {
        Intrinsics.j(c14675s, "<this>");
        Intrinsics.j(localThemeScope, "localThemeScope");
        C18085d.a.f fVar = C18085d.a.f.f169855b;
        C14675s c14675s2 = new C14675s(c14675s.getProvider(), fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "landing");
        i.c(c14675s2, fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1953275884, true, new a(localThemeScope)), 126, null);
        c14675s.e(c14675s2);
    }
}
