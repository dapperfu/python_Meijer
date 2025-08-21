package com.google.maps.android.compose;

import Md.C4110c;
import Od.C4464l;
import android.location.Location;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aR\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001f\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\f\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0005H\u0003¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "MapClickListenerUpdater", "(Landroidx/compose/runtime/Composer;I)V", "", "L", "Lkotlin/Function0;", "callback", "Lkotlin/Function2;", "LMd/c;", "Lkotlin/ExtensionFunctionType;", "setter", "listener", "MapClickListenerComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "Lcom/google/maps/android/compose/MapClickListenerNode;", "factory", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapClickListenersKt {
    private static final <L> void MapClickListenerComposeNode(Function0<? extends Object> function0, final Function2<? super C4110c, ? super L, Unit> function2, final L l10, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-649632125, i10, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:176)");
        }
        Applier<?> applierK = composer.k();
        Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        final MapApplier mapApplier = (MapApplier) applierK;
        boolean zD = composer.D(mapApplier) | ((((i10 & 112) ^ 48) > 32 && composer.V(function2)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.D(l10)) || (i10 & 384) == 256);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new Function0() { // from class: com.google.maps.android.compose.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MapClickListenersKt.MapClickListenerComposeNode$lambda$29$lambda$28(mapApplier, function2, l10);
                }
            };
            composer.t(objB);
        }
        MapClickListenerComposeNode(function0, (Function0) objB, composer, i10 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapClickListenerComposeNode$lambda$31(Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        MapClickListenerComposeNode(function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapClickListenerUpdater$lambda$27(int i10, Composer composer, int i11) {
        MapClickListenerUpdater(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapClickListenerNode MapClickListenerComposeNode$lambda$29$lambda$28(MapApplier mapApplier, Function2 function2, Object obj) {
        return new MapClickListenerNode(mapApplier.getMap(), function2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$21$lambda$20$lambda$19(KMutableProperty0 kMutableProperty0, Location it) {
        Intrinsics.j(it, "it");
        Function1 function1 = (Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$25$lambda$24$lambda$23(KMutableProperty0 kMutableProperty0, Od.r it) {
        Intrinsics.j(it, "it");
        Function1 function1 = (Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$5$lambda$4$lambda$3(KMutableProperty0 kMutableProperty0, LatLng it) {
        Intrinsics.j(it, "it");
        Function1 function1 = (Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$9$lambda$8$lambda$7(KMutableProperty0 kMutableProperty0, LatLng it) {
        Intrinsics.j(it, "it");
        Function1 function1 = (Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    public static final void MapClickListenerUpdater(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1792062778);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1792062778, i10, -1, "com.google.maps.android.compose.MapClickListenerUpdater (MapClickListeners.kt:88)");
            }
            Applier<?> applierK = composerStartRestartGroup.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            final MapClickListeners mapClickListeners = ((MapApplier) applierK).getMapClickListeners();
            composerStartRestartGroup.startReplaceGroup(-109545443);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getIndoorStateChangeListener();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setIndoorStateChangeListener((IndoorStateChangeListener) obj);
                }
            };
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = MapClickListenersKt$MapClickListenerUpdater$1$2$1$1.INSTANCE;
                composerStartRestartGroup.t(objB);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl, (Function2) ((KFunction) objB), new C4110c.i() { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2
                @Override // Md.C4110c.i
                public void onIndoorBuildingFocused() {
                    mutablePropertyReference0Impl.invoke().onIndoorBuildingFocused();
                }

                @Override // Md.C4110c.i
                public void onIndoorLevelActivated(C4464l building) {
                    Intrinsics.j(building, "building");
                    mutablePropertyReference0Impl.invoke().onIndoorLevelActivated(building);
                }
            }, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109528522);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl2 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$3
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapClick((Function1) obj);
                }
            };
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = MapClickListenersKt$MapClickListenerUpdater$1$4$1$1.INSTANCE;
                composerStartRestartGroup.t(objB2);
            }
            Function2 function2 = (Function2) ((KFunction) objB2);
            boolean zD = composerStartRestartGroup.D(mutablePropertyReference0Impl2);
            Object objB3 = composerStartRestartGroup.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C4110c.m() { // from class: com.google.maps.android.compose.s0
                    @Override // Md.C4110c.m
                    public final void a(LatLng latLng) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$5$lambda$4$lambda$3(mutablePropertyReference0Impl2, latLng);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl2, function2, (C4110c.m) objB3, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109520610);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl3 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$5
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLongClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLongClick((Function1) obj);
                }
            };
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = MapClickListenersKt$MapClickListenerUpdater$1$6$1$1.INSTANCE;
                composerStartRestartGroup.t(objB4);
            }
            Function2 function22 = (Function2) ((KFunction) objB4);
            boolean zD2 = composerStartRestartGroup.D(mutablePropertyReference0Impl3);
            Object objB5 = composerStartRestartGroup.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new C4110c.o() { // from class: com.google.maps.android.compose.t0
                    @Override // Md.C4110c.o
                    public final void a(LatLng latLng) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$9$lambda$8$lambda$7(mutablePropertyReference0Impl3, latLng);
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl3, function22, (C4110c.o) objB5, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109512554);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl4 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$7
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLoaded();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLoaded((Function0) obj);
                }
            };
            Object objB6 = composerStartRestartGroup.B();
            if (objB6 == companion.a()) {
                objB6 = MapClickListenersKt$MapClickListenerUpdater$1$8$1$1.INSTANCE;
                composerStartRestartGroup.t(objB6);
            }
            Function2 function23 = (Function2) ((KFunction) objB6);
            boolean zD3 = composerStartRestartGroup.D(mutablePropertyReference0Impl4);
            Object objB7 = composerStartRestartGroup.B();
            if (zD3 || objB7 == companion.a()) {
                objB7 = new C4110c.n() { // from class: com.google.maps.android.compose.u0
                    @Override // Md.C4110c.n
                    public final void onMapLoaded() {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$13$lambda$12$lambda$11(mutablePropertyReference0Impl4);
                    }
                };
                composerStartRestartGroup.t(objB7);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl4, function23, (C4110c.n) objB7, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109504329);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl5 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$9
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationButtonClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationButtonClick((Function0) obj);
                }
            };
            Object objB8 = composerStartRestartGroup.B();
            if (objB8 == companion.a()) {
                objB8 = MapClickListenersKt$MapClickListenerUpdater$1$10$1$1.INSTANCE;
                composerStartRestartGroup.t(objB8);
            }
            Function2 function24 = (Function2) ((KFunction) objB8);
            boolean zD4 = composerStartRestartGroup.D(mutablePropertyReference0Impl5);
            Object objB9 = composerStartRestartGroup.B();
            if (zD4 || objB9 == companion.a()) {
                objB9 = new C4110c.r() { // from class: com.google.maps.android.compose.v0
                    @Override // Md.C4110c.r
                    public final boolean a() {
                        return MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$17$lambda$16$lambda$15(mutablePropertyReference0Impl5);
                    }
                };
                composerStartRestartGroup.t(objB9);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl5, function24, (C4110c.r) objB9, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109495292);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl6 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$11
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationClick((Function1) obj);
                }
            };
            Object objB10 = composerStartRestartGroup.B();
            if (objB10 == companion.a()) {
                objB10 = MapClickListenersKt$MapClickListenerUpdater$1$12$1$1.INSTANCE;
                composerStartRestartGroup.t(objB10);
            }
            Function2 function25 = (Function2) ((KFunction) objB10);
            boolean zD5 = composerStartRestartGroup.D(mutablePropertyReference0Impl6);
            Object objB11 = composerStartRestartGroup.B();
            if (zD5 || objB11 == companion.a()) {
                objB11 = new C4110c.s() { // from class: com.google.maps.android.compose.w0
                    @Override // Md.C4110c.s
                    public final void a(Location location) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$21$lambda$20$lambda$19(mutablePropertyReference0Impl6, location);
                    }
                };
                composerStartRestartGroup.t(objB11);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl6, function25, (C4110c.s) objB11, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-109487082);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl7 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$13
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnPOIClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnPOIClick((Function1) obj);
                }
            };
            Object objB12 = composerStartRestartGroup.B();
            if (objB12 == companion.a()) {
                objB12 = MapClickListenersKt$MapClickListenerUpdater$1$14$1$1.INSTANCE;
                composerStartRestartGroup.t(objB12);
            }
            Function2 function26 = (Function2) ((KFunction) objB12);
            boolean zD6 = composerStartRestartGroup.D(mutablePropertyReference0Impl7);
            Object objB13 = composerStartRestartGroup.B();
            if (zD6 || objB13 == companion.a()) {
                objB13 = new C4110c.t() { // from class: com.google.maps.android.compose.x0
                    @Override // Md.C4110c.t
                    public final void a(Od.r rVar) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$25$lambda$24$lambda$23(mutablePropertyReference0Impl7, rVar);
                    }
                };
                composerStartRestartGroup.t(objB13);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl7, function26, (C4110c.t) objB13, composerStartRestartGroup, 48);
            composerStartRestartGroup.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MapClickListenersKt.MapClickListenerUpdater$lambda$27(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$13$lambda$12$lambda$11(KMutableProperty0 kMutableProperty0) {
        Function0 function0 = (Function0) kMutableProperty0.invoke();
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapClickListenerUpdater$lambda$26$lambda$17$lambda$16$lambda$15(KMutableProperty0 kMutableProperty0) {
        Function0 function0 = (Function0) kMutableProperty0.invoke();
        if (function0 != null) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        return false;
    }

    @GoogleMapComposable
    private static final void MapClickListenerComposeNode(final Function0<? extends Object> function0, final Function0<? extends MapClickListenerNode<?>> function02, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1042600347);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function02) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1042600347, i11, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:187)");
            }
            if (function0.invoke() != null) {
                composerStartRestartGroup.startReplaceGroup(-1211532319);
                if (!(composerStartRestartGroup.k() instanceof MapApplier)) {
                    C5859f.c();
                }
                composerStartRestartGroup.m();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function02);
                } else {
                    composerStartRestartGroup.s();
                }
                androidx.compose.runtime.D1.a(composerStartRestartGroup);
                composerStartRestartGroup.v();
            } else {
                composerStartRestartGroup.startReplaceGroup(1089867069);
            }
            composerStartRestartGroup.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MapClickListenersKt.MapClickListenerComposeNode$lambda$31(function0, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
