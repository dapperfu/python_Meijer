package com.google.maps.android.compose;

import Kd.C3945c;
import Kd.C3947e;
import Kd.InterfaceC3946d;
import Kd.InterfaceC3949g;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.C5735o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5725j;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C5892t0;
import androidx.view.AbstractC6023l;
import androidx.view.C6019i0;
import androidx.view.InterfaceC6030s;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.CameraPositionStateKt;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.meta.AttributionId;
import j0.InterfaceC14794C;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a¢\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0013\b\u0002\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b\"H\u0007¢\u0006\u0004\b$\u0010%\u001aF\u00100\u001a\u00020/*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b\"H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00103\u001a\f\u0012\u0004\u0012\u00020\u00150\bj\u0002`22\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007¢\u0006\u0004\b3\u00104\"\u0018\u00108\u001a\u000205*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107*\u0016\u00109\"\b\u0012\u0004\u0012\u00020\u00150\b2\b\u0012\u0004\u0012\u00020\u00150\b¨\u0006>²\u0006\u0017\u0010:\u001a\r\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b\"8\nX\u008a\u0084\u0002²\u0006\u0010\u0010;\u001a\u0004\u0018\u00010/8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "mergeDescendants", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "googleMapOptionsFactory", "Lcom/google/maps/android/compose/MapProperties;", "properties", "LKd/d;", "locationSource", "Lcom/google/maps/android/compose/MapUiSettings;", "uiSettings", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick", "onMapLongClick", "onMapLoaded", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "LMd/r;", "onPOIClick", "Lj0/C;", "contentPadding", "Lcom/google/maps/android/compose/ComposeMapColorScheme;", "mapColorScheme", "Lcom/google/maps/android/compose/GoogleMapComposable;", "content", "GoogleMap", "(Landroidx/compose/ui/Modifier;ZLcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/google/maps/android/compose/MapProperties;LKd/d;Lcom/google/maps/android/compose/MapUiSettings;Lcom/google/maps/android/compose/IndoorStateChangeListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lj0/C;Lcom/google/maps/android/compose/ComposeMapColorScheme;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Lqv/O;", "Lcom/google/maps/android/compose/MapUpdaterState;", "mapUpdaterState", "Landroidx/compose/runtime/k;", "parentComposition", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/maps/android/compose/MapClickListeners;", "mapClickListeners", "Lqv/C0;", "launchSubcomposition", "(Lqv/O;Lcom/google/maps/android/compose/MapUpdaterState;Landroidx/compose/runtime/k;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/MapClickListeners;Lkotlin/jvm/functions/Function2;)Lqv/C0;", "Lcom/google/maps/android/compose/GoogleMapFactory;", "googleMapFactory", "(Landroidx/compose/ui/Modifier;Lcom/google/maps/android/compose/CameraPositionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "Lcom/google/maps/android/compose/MapTagData;", "getTagData", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/MapTagData;", "tagData", "GoogleMapFactory", "currentContent", "subcompositionJob", "mapProperties", "mapVisible", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GoogleMapKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1", f = "GoogleMap.kt", l = {390, 239}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ MapClickListeners $mapClickListeners;
        final /* synthetic */ MapUpdaterState $mapUpdaterState;
        final /* synthetic */ MapView $mapView;
        final /* synthetic */ AbstractC5727k $parentComposition;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MapView mapView, MapClickListeners mapClickListeners, AbstractC5727k abstractC5727k, MapUpdaterState mapUpdaterState, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mapView = mapView;
            this.$mapClickListeners = mapClickListeners;
            this.$parentComposition = abstractC5727k;
            this.$mapUpdaterState = mapUpdaterState;
            this.$content = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mapView, this.$mapClickListeners, this.$parentComposition, this.$mapUpdaterState, this.$content, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MapUpdaterState mapUpdaterState, Function2 function2, Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
            } else {
                if (ComposerKt.M()) {
                    ComposerKt.U(704030801, i10, -1, "com.google.maps.android.compose.launchSubcomposition.<anonymous>.<anonymous> (GoogleMap.kt:229)");
                }
                composer.startReplaceGroup(-1929095045);
                Applier<?> applierK = composer.k();
                Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                C3945c map = ((MapApplier) applierK).getMap();
                Applier<?> applierK2 = composer.k();
                Intrinsics.h(applierK2, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                MapView mapView = ((MapApplier) applierK2).getMapView();
                if (mapUpdaterState.getMergeDescendants()) {
                    mapView.setImportantForAccessibility(4);
                }
                H1.d dVar = (H1.d) composer.o(C5892t0.g());
                H1.t tVar = (H1.t) composer.o(C5892t0.m());
                boolean zV = composer.V(mapUpdaterState) | composer.D(map) | composer.V(dVar) | composer.d(tVar.ordinal());
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, dVar, tVar);
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                if (!(composer.k() instanceof MapApplier)) {
                    C5717f.c();
                }
                composer.m();
                if (composer.getInserting()) {
                    composer.I(function0);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.d(composerA, dVar, MapUpdaterKt$MapUpdater$1$2$1.INSTANCE);
                androidx.compose.runtime.D1.d(composerA, tVar, MapUpdaterKt$MapUpdater$1$2$2.INSTANCE);
                androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getContentDescription(), MapUpdaterKt$MapUpdater$1$2$3.INSTANCE);
                androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getContentPadding(), new MapUpdaterKt$MapUpdater$1$2$4(map));
                androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getLocationSource(), new MapUpdaterKt$MapUpdater$1$2$5(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsBuildingEnabled()), new MapUpdaterKt$MapUpdater$1$2$6(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsIndoorEnabled()), new MapUpdaterKt$MapUpdater$1$2$7(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsMyLocationEnabled()), new MapUpdaterKt$MapUpdater$1$2$8(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsTrafficEnabled()), new MapUpdaterKt$MapUpdater$1$2$9(map));
                androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getLatLngBoundsForCameraTarget(), new MapUpdaterKt$MapUpdater$1$2$10(map));
                androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getMapStyleOptions(), new MapUpdaterKt$MapUpdater$1$2$11(map));
                androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getMapType(), new MapUpdaterKt$MapUpdater$1$2$12(map));
                androidx.compose.runtime.D1.c(composerA, Float.valueOf(mapUpdaterState.getMapProperties().getMaxZoomPreference()), new MapUpdaterKt$MapUpdater$1$2$13(map));
                androidx.compose.runtime.D1.c(composerA, Float.valueOf(mapUpdaterState.getMapProperties().getMinZoomPreference()), new MapUpdaterKt$MapUpdater$1$2$14(map));
                androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapColorScheme(), new MapUpdaterKt$MapUpdater$1$2$15(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getCompassEnabled()), new MapUpdaterKt$MapUpdater$1$2$16(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getIndoorLevelPickerEnabled()), new MapUpdaterKt$MapUpdater$1$2$17(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMapToolbarEnabled()), new MapUpdaterKt$MapUpdater$1$2$18(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMyLocationButtonEnabled()), new MapUpdaterKt$MapUpdater$1$2$19(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getRotationGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$20(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$21(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabledDuringRotateOrZoom()), new MapUpdaterKt$MapUpdater$1$2$22(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getTiltGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$23(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomControlsEnabled()), new MapUpdaterKt$MapUpdater$1$2$24(map));
                androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$25(map));
                androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getCameraPositionState(), MapUpdaterKt$MapUpdater$1$2$26.INSTANCE);
                composer.v();
                composer.P();
                MapClickListenersKt.MapClickListenerUpdater(composer, 0);
                androidx.compose.runtime.r.a(CameraPositionStateKt.getLocalCameraPositionState().d(mapUpdaterState.getCameraPositionState()), function2, composer, androidx.compose.runtime.G0.f49976i);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C3945c c3945c;
            InterfaceC5725j interfaceC5725jA;
            InterfaceC5725j interfaceC5725j;
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC5725j = (InterfaceC5725j) this.L$1;
                        try {
                            ResultKt.b(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC5725j.dispose();
                            throw th;
                        }
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    MapView mapView = this.$mapView;
                    this.L$0 = mapView;
                    this.I$0 = 0;
                    this.label = 1;
                    final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(this));
                    mapView.a(new InterfaceC3949g() { // from class: com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1
                        @Override // Kd.InterfaceC3949g
                        public final void onMapReady(C3945c it) {
                            Intrinsics.j(it, "it");
                            safeContinuation.resumeWith(Result.b(it));
                        }
                    });
                    obj = safeContinuation.b();
                    if (obj == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (obj != objF) {
                    }
                    return objF;
                }
                final MapUpdaterState mapUpdaterState = this.$mapUpdaterState;
                final Function2<Composer, Integer, Unit> function2 = this.$content;
                interfaceC5725jA.d(ComposableLambdaKt.composableLambdaInstance(704030801, true, new Function2() { // from class: com.google.maps.android.compose.E
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$0(mapUpdaterState, function2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }));
                this.L$0 = SpillingKt.a(c3945c);
                this.L$1 = interfaceC5725jA;
                this.label = 2;
                if (qv.Z.a(this) != objF) {
                    interfaceC5725j = interfaceC5725jA;
                    throw new KotlinNothingValueException();
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                interfaceC5725j = interfaceC5725jA;
                interfaceC5725j.dispose();
                throw th;
            }
            c3945c = (C3945c) obj;
            interfaceC5725jA = C5735o.a(new MapApplier(c3945c, this.$mapView, this.$mapClickListeners), this.$parentComposition);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f A[PHI: r34
      0x010f: PHI (r34v14 int) = (r34v4 int), (r34v10 int), (r34v11 int) binds: [B:89:0x010d, B:99:0x012a, B:98:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v22, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v22, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v15, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r15v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v5, types: [com.google.maps.android.compose.ComposeMapColorScheme] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.maps.android.compose.MapClickListeners, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r48v0, types: [Kd.d] */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r54v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r55v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r56v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super Md.r, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r58v0, types: [com.google.maps.android.compose.ComposeMapColorScheme, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v29, types: [Kd.d] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37, types: [Kd.d] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.Composer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoogleMap(androidx.compose.ui.Modifier r42, boolean r43, com.google.maps.android.compose.CameraPositionState r44, java.lang.String r45, kotlin.jvm.functions.Function0<com.google.android.gms.maps.GoogleMapOptions> r46, com.google.maps.android.compose.MapProperties r47, Kd.InterfaceC3946d r48, com.google.maps.android.compose.MapUiSettings r49, com.google.maps.android.compose.IndoorStateChangeListener r50, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> r51, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function0<java.lang.Boolean> r54, kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> r55, kotlin.jvm.functions.Function1<? super Md.r, kotlin.Unit> r56, j0.InterfaceC14794C r57, com.google.maps.android.compose.ComposeMapColorScheme r58, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.GoogleMapKt.GoogleMap(androidx.compose.ui.Modifier, boolean, com.google.maps.android.compose.CameraPositionState, java.lang.String, kotlin.jvm.functions.Function0, com.google.maps.android.compose.MapProperties, Kd.d, com.google.maps.android.compose.MapUiSettings, com.google.maps.android.compose.IndoorStateChangeListener, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, j0.C, com.google.maps.android.compose.ComposeMapColorScheme, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final qv.C0 launchSubcomposition(InterfaceC16622O interfaceC16622O, MapUpdaterState mapUpdaterState, AbstractC5727k abstractC5727k, MapView mapView, MapClickListeners mapClickListeners, Function2<? super Composer, ? super Integer, Unit> function2) {
        return C16648k.d(interfaceC16622O, null, EnumC16624Q.f157614d, new AnonymousClass1(mapView, mapClickListeners, abstractC5727k, mapUpdaterState, function2, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoogleMapOptions GoogleMap$lambda$1$lambda$0() {
        return new GoogleMapOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView GoogleMap$lambda$13$lambda$12(Function0 function0, Context context) {
        Intrinsics.j(context, "context");
        final MapView mapView = new MapView(context, (GoogleMapOptions) function0.invoke());
        C3947e.a(context, AttributionId.VALUE);
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2() { // from class: com.google.maps.android.compose.GoogleMapKt$GoogleMap$3$1$1$componentCallbacks$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                Intrinsics.j(newConfig, "newConfig");
            }

            @Override // android.content.ComponentCallbacks
            @Deprecated
            public void onLowMemory() {
                mapView.d();
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                mapView.d();
            }
        };
        context.registerComponentCallbacks(componentCallbacks2);
        final MapLifecycleEventObserver mapLifecycleEventObserver = new MapLifecycleEventObserver(mapView);
        mapView.setTag(new MapTagData(componentCallbacks2, mapLifecycleEventObserver));
        mapView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.maps.android.compose.GoogleMapKt$GoogleMap$3$1$1$onAttachStateListener$1
            private AbstractC6023l lifecycle;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View mapView2) {
                Intrinsics.j(mapView2, "mapView");
                InterfaceC6030s interfaceC6030sA = C6019i0.a(mapView2);
                Intrinsics.g(interfaceC6030sA);
                AbstractC6023l lifecycle = interfaceC6030sA.getLifecycle();
                lifecycle.a(mapLifecycleEventObserver);
                this.lifecycle = lifecycle;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                Intrinsics.j(v10, "v");
                AbstractC6023l abstractC6023l = this.lifecycle;
                if (abstractC6023l != null) {
                    abstractC6023l.d(mapLifecycleEventObserver);
                }
                this.lifecycle = null;
                mapLifecycleEventObserver.moveToBaseState();
            }
        });
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoogleMap$lambda$15$lambda$14(MapView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoogleMap$lambda$17$lambda$16(MapView mapView) {
        Intrinsics.j(mapView, "mapView");
        MapTagData tagData = getTagData(mapView);
        ComponentCallbacks componentCallbacks = tagData.getComponentCallbacks();
        MapLifecycleEventObserver lifecycleObserver = tagData.getLifecycleObserver();
        mapView.getContext().unregisterComponentCallbacks(componentCallbacks);
        lifecycleObserver.moveToDestroyedState();
        mapView.setTag(null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoogleMap$lambda$19$lambda$18(InterfaceC16622O interfaceC16622O, MapUpdaterState mapUpdaterState, AbstractC5727k abstractC5727k, MapClickListeners mapClickListeners, InterfaceC5730l0 interfaceC5730l0, androidx.compose.runtime.z1 z1Var, MapView mapView) {
        Intrinsics.j(mapView, "mapView");
        if (GoogleMap$lambda$9(interfaceC5730l0) == null) {
            interfaceC5730l0.setValue(launchSubcomposition(interfaceC16622O, mapUpdaterState, abstractC5727k, mapView, mapClickListeners, GoogleMap$lambda$7(z1Var)));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoogleMap$lambda$2(Modifier modifier, boolean z10, CameraPositionState cameraPositionState, String str, Function0 function0, MapProperties mapProperties, InterfaceC3946d interfaceC3946d, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function1 function13, Function1 function14, InterfaceC14794C interfaceC14794C, ComposeMapColorScheme composeMapColorScheme, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        GoogleMap(modifier, z10, cameraPositionState, str, function0, mapProperties, interfaceC3946d, mapUiSettings, indoorStateChangeListener, function1, function12, function02, function03, function13, function14, interfaceC14794C, composeMapColorScheme, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoogleMap$lambda$20(Modifier modifier, boolean z10, CameraPositionState cameraPositionState, String str, Function0 function0, MapProperties mapProperties, InterfaceC3946d interfaceC3946d, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function1 function13, Function1 function14, InterfaceC14794C interfaceC14794C, ComposeMapColorScheme composeMapColorScheme, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        GoogleMap(modifier, z10, cameraPositionState, str, function0, mapProperties, interfaceC3946d, mapUiSettings, indoorStateChangeListener, function1, function12, function02, function03, function13, function14, interfaceC14794C, composeMapColorScheme, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    public static final Function2<Composer, Integer, Unit> googleMapFactory(final Modifier modifier, final CameraPositionState cameraPositionState, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        Composer composer2;
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            Object[] objArr = new Object[0];
            composer2 = composer;
            cameraPositionState = (CameraPositionState) L0.c.c(objArr, CameraPositionState.INSTANCE.getSaver(), null, new CameraPositionStateKt.AnonymousClass2(CameraPositionStateKt.AnonymousClass1.INSTANCE), composer2, 0, 0);
        } else {
            composer2 = composer;
        }
        if ((i11 & 4) != 0) {
            Object objB = composer2.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.google.maps.android.compose.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f142422a;
                    }
                };
                composer2.t(objB);
            }
            function0 = (Function0) objB;
        }
        if ((i11 & 8) != 0) {
            function2 = ComposableSingletons$GoogleMapKt.INSTANCE.m45getLambda$400333435$maps_compose_release();
        }
        if (ComposerKt.M()) {
            ComposerKt.U(2117450840, i10, -1, "com.google.maps.android.compose.googleMapFactory (GoogleMap.kt:292)");
        }
        ComposableLambda composableLambdaC = ComposableLambdaKt.c(893077019, true, new Function2() { // from class: com.google.maps.android.compose.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GoogleMapKt.googleMapFactory$lambda$29(modifier, cameraPositionState, function0, function2, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer2, 54);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return composableLambdaC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit googleMapFactory$lambda$29(Modifier modifier, CameraPositionState cameraPositionState, Function0 function0, Function2 function2, Composer composer, int i10) {
        Composer composer2 = composer;
        if ((i10 & 3) == 2 && composer2.j()) {
            composer2.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(893077019, i10, -1, "com.google.maps.android.compose.googleMapFactory.<anonymous> (GoogleMap.kt:294)");
            }
            Object objB = composer2.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e(new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 1022, null), null, 2, null);
                composer2.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            Object objB2 = composer2.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(new MapProperties(false, false, false, false, null, null, MapType.NORMAL, 0.0f, 0.0f, 447, null), null, 2, null);
                composer2.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            Object objB3 = composer2.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                composer2.t(objB3);
            }
            if (googleMapFactory$lambda$29$lambda$28((InterfaceC5730l0) objB3)) {
                composer2.startReplaceGroup(-1664619595);
                GoogleMap(modifier, false, cameraPositionState, null, null, googleMapFactory$lambda$29$lambda$26(interfaceC5730l02), null, googleMapFactory$lambda$29$lambda$24(interfaceC5730l0), null, null, null, function0, null, null, null, null, null, function2, composer2, 0, 0, 128858);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-1677016185);
            }
            composer2.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f142422a;
    }

    private static final Function2<Composer, Integer, Unit> GoogleMap$lambda$7(androidx.compose.runtime.z1<? extends Function2<? super Composer, ? super Integer, Unit>> z1Var) {
        return (Function2) z1Var.getValue();
    }

    private static final qv.C0 GoogleMap$lambda$9(InterfaceC5730l0<qv.C0> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final MapTagData getTagData(MapView mapView) {
        Object tag = mapView.getTag();
        Intrinsics.h(tag, "null cannot be cast to non-null type com.google.maps.android.compose.MapTagData");
        return (MapTagData) tag;
    }

    private static final MapUiSettings googleMapFactory$lambda$29$lambda$24(InterfaceC5730l0<MapUiSettings> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final MapProperties googleMapFactory$lambda$29$lambda$26(InterfaceC5730l0<MapProperties> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final boolean googleMapFactory$lambda$29$lambda$28(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }
}
