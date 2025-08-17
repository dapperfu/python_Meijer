package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$GoogleMapKt {
    public static final ComposableSingletons$GoogleMapKt INSTANCE = new ComposableSingletons$GoogleMapKt();

    /* renamed from: lambda$-1472298986, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f0lambda$1472298986 = ComposableLambdaKt.composableLambdaInstance(-1472298986, false, new Function2() { // from class: com.google.maps.android.compose.r
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GoogleMapKt.lambda__1472298986$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-400333435, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1lambda$400333435 = ComposableLambdaKt.composableLambdaInstance(-400333435, false, new Function2() { // from class: com.google.maps.android.compose.s
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GoogleMapKt.lambda__400333435$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1472298986$maps_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m44getLambda$1472298986$maps_compose_release() {
        return f0lambda$1472298986;
    }

    /* renamed from: getLambda$-400333435$maps_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m45getLambda$400333435$maps_compose_release() {
        return f1lambda$400333435;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1472298986$lambda$0(Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1472298986, i10, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-1472298986.<anonymous> (GoogleMap.kt:103)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__400333435$lambda$1(Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-400333435, i10, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-400333435.<anonymous> (GoogleMap.kt:291)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f142422a;
    }
}
