package com.google.maps.android.compose;

import Md.C4110c;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aH\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\f\u001a\\\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\u000e\u001aV\u0010\t\u001a\u00020\u00062\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u000f\"\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lmv/O;", "LMd/c;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "MapEffect", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapEffectKt {
    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(final Object obj, final Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object> block, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(block, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-357282938);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(block) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-357282938, i11, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:22)");
            }
            Applier<?> applierK = composerStartRestartGroup.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            C4110c map = ((MapApplier) applierK).getMap();
            boolean zD = composerStartRestartGroup.D(block) | composerStartRestartGroup.D(map);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new MapEffectKt$MapEffect$1$1(block, map, null);
                composerStartRestartGroup.t(objB);
            }
            androidx.compose.runtime.J.g(obj, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.D0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MapEffectKt.MapEffect$lambda$1(obj, block, i10, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$1(Object obj, Function3 function3, int i10, Composer composer, int i11) {
        MapEffect(obj, (Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object>) function3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$3(Object obj, Object obj2, Function3 function3, int i10, Composer composer, int i11) {
        MapEffect(obj, obj2, function3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$5(Object obj, Object obj2, Object obj3, Function3 function3, int i10, Composer composer, int i11) {
        MapEffect(obj, obj2, obj3, function3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$7(Object[] objArr, Function3 function3, int i10, Composer composer, int i11) {
        MapEffect(objArr, (Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object>) function3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(final Object obj, final Object obj2, final Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object> block, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(block, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-834763738);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(obj2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(block) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-834763738, i11, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:42)");
            }
            Applier<?> applierK = composerStartRestartGroup.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            C4110c map = ((MapApplier) applierK).getMap();
            boolean zD = composerStartRestartGroup.D(block) | composerStartRestartGroup.D(map);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new MapEffectKt$MapEffect$3$1(block, map, null);
                composerStartRestartGroup.t(objB);
            }
            androidx.compose.runtime.J.f(obj, obj2, (Function2) objB, composerStartRestartGroup, i11 & 126);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.C0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return MapEffectKt.MapEffect$lambda$3(obj, obj2, block, i10, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(Object obj, Object obj2, Object obj3, final Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object> block, Composer composer, final int i10) {
        int i11;
        Object obj4;
        final Object obj5;
        final Object obj6;
        Intrinsics.j(block, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-88380218);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(obj2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(obj3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(block) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            obj4 = obj3;
            obj6 = obj2;
            obj5 = obj;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-88380218, i11, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:67)");
            }
            Applier<?> applierK = composerStartRestartGroup.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            C4110c map = ((MapApplier) applierK).getMap();
            boolean zD = composerStartRestartGroup.D(block) | composerStartRestartGroup.D(map);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new MapEffectKt$MapEffect$5$1(block, map, null);
                composerStartRestartGroup.t(objB);
            }
            obj4 = obj3;
            androidx.compose.runtime.J.e(obj, obj2, obj4, (Function2) objB, composerStartRestartGroup, i11 & 1022);
            obj5 = obj;
            obj6 = obj2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final Object obj7 = obj4;
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.E0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    return MapEffectKt.MapEffect$lambda$5(obj5, obj6, obj7, block, i10, (Composer) obj8, ((Integer) obj9).intValue());
                }
            });
        }
    }

    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(final Object[] keys, final Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object> block, Composer composer, final int i10) {
        Intrinsics.j(keys, "keys");
        Intrinsics.j(block, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-276920653);
        int i11 = (i10 & 48) == 0 ? (composerStartRestartGroup.D(block) ? 32 : 16) | i10 : i10;
        composerStartRestartGroup.startMovableGroup(167227620, Integer.valueOf(keys.length));
        int i12 = i11 | (composerStartRestartGroup.d(keys.length) ? 4 : 0);
        for (Object obj : keys) {
            i12 |= composerStartRestartGroup.D(obj) ? 4 : 0;
        }
        composerStartRestartGroup.T();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-276920653, i12, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:90)");
            }
            Applier<?> applierK = composerStartRestartGroup.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            C4110c map = ((MapApplier) applierK).getMap();
            Object[] objArrCopyOf = Arrays.copyOf(keys, keys.length);
            boolean zD = composerStartRestartGroup.D(block) | composerStartRestartGroup.D(map);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new MapEffectKt$MapEffect$7$1(block, map, null);
                composerStartRestartGroup.t(objB);
            }
            androidx.compose.runtime.J.h(objArrCopyOf, (Function2) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.B0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MapEffectKt.MapEffect$lambda$7(keys, block, i10, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
