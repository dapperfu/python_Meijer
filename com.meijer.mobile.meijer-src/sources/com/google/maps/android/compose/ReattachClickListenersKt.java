package com.google.maps.android.compose;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"rememberReattachClickListenersHandle", "Lkotlin/Function0;", "", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ReattachClickListenersKt {
    public static final Function0<Unit> rememberReattachClickListenersHandle(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1516905133, i10, -1, "com.google.maps.android.compose.rememberReattachClickListenersHandle (ReattachClickListeners.kt:16)");
        }
        Applier<?> applierK = composer.k();
        Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        final MapApplier mapApplier = (MapApplier) applierK;
        boolean zV = composer.V(mapApplier);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new Function0() { // from class: com.google.maps.android.compose.a3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReattachClickListenersKt.rememberReattachClickListenersHandle$lambda$1$lambda$0(mapApplier);
                }
            };
            composer.t(objB);
        }
        Function0<Unit> function0 = (Function0) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberReattachClickListenersHandle$lambda$1$lambda$0(MapApplier mapApplier) {
        mapApplier.attachClickListeners$maps_compose_release();
        return Unit.f143329a;
    }
}
