package com.google.maps.android.compose.streetview;

import Kd.C3954l;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.C5735o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5725j;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import com.fullstory.FS;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.StreetViewPanoramaView;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.Z;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0082H¢\u0006\u0004\b\u0019\u0010\u001a\u001a,\u0010\u001e\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\b\b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0082H¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010$\u001a\u00020#*\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\u00020&*\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(¨\u00060²\u0006\f\u0010)\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "cameraPositionState", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/StreetViewPanoramaOptions;", "streetViewPanoramaOptionsFactory", "", "isPanningGesturesEnabled", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/a;", "", "onClick", "onLongClick", "StreetView", "(Landroidx/compose/ui/Modifier;Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;Lkotlin/jvm/functions/Function0;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/google/android/gms/maps/StreetViewPanoramaView;", "streetView", "StreetViewLifecycle", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/j;", "factory", "disposingComposition", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/k;", "parent", "content", "newComposition", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/l0;", "Landroidx/lifecycle/l$a;", "previousState", "Landroidx/lifecycle/p;", "lifecycleObserver", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/l0;)Landroidx/lifecycle/p;", "Landroid/content/ComponentCallbacks2;", "componentCallbacks2", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;)Landroid/content/ComponentCallbacks2;", "currentCameraPositionState", "currentIsPanningGestureEnabled", "currentIsStreetNamesEnabled", "currentIsUserNavigationEnabled", "currentIsZoomGesturesEnabled", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "clickListeners", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StreetViewKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC6023l.a.values().length];
            try {
                iArr[AbstractC6023l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC6023l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC6023l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC6023l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC6023l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC6023l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StreetView$lambda$19(Modifier modifier, StreetViewCameraPositionState streetViewCameraPositionState, Function0 function0, boolean z10, boolean z11, boolean z12, boolean z13, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        StreetView(modifier, streetViewCameraPositionState, function0, z10, z11, z12, z13, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreetViewPanoramaView StreetView$lambda$8$lambda$7(StreetViewPanoramaView streetViewPanoramaView, Context it) {
        Intrinsics.j(it, "it");
        return streetViewPanoramaView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StreetViewLifecycle$lambda$24(StreetViewPanoramaView streetViewPanoramaView, int i10, Composer composer, int i11) {
        StreetViewLifecycle(streetViewPanoramaView, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final Object newComposition(StreetViewPanoramaView streetViewPanoramaView, AbstractC5727k abstractC5727k, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super InterfaceC5725j> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        streetViewPanoramaView.a(new StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(safeContinuation));
        Unit unit = Unit.f142422a;
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        C3954l c3954l = (C3954l) objB;
        FS.log_d("StreetView", "Location is " + c3954l.b());
        InterfaceC5725j interfaceC5725jA = C5735o.a(new StreetViewPanoramaApplier(c3954l), abstractC5727k);
        interfaceC5725jA.d(function2);
        return interfaceC5725jA;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    @com.google.maps.android.ktx.MapsExperimentalFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StreetView(androidx.compose.ui.Modifier r24, com.google.maps.android.compose.streetview.StreetViewCameraPositionState r25, kotlin.jvm.functions.Function0<com.google.android.gms.maps.StreetViewPanoramaOptions> r26, boolean r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.a, kotlin.Unit> r31, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.a, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.streetview.StreetViewKt.StreetView(androidx.compose.ui.Modifier, com.google.maps.android.compose.streetview.StreetViewCameraPositionState, kotlin.jvm.functions.Function0, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreetViewPanoramaOptions StreetView$lambda$1$lambda$0() {
        return new StreetViewPanoramaOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StreetView$lambda$10$lambda$9(StreetViewPanoramaView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StreetView$lambda$3$lambda$2(com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StreetView$lambda$5$lambda$4(com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E StreetViewLifecycle$lambda$23$lambda$22(final StreetViewPanoramaView streetViewPanoramaView, InterfaceC5730l0 interfaceC5730l0, final AbstractC6023l abstractC6023l, final Context context, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        final InterfaceC6027p interfaceC6027pLifecycleObserver = lifecycleObserver(streetViewPanoramaView, interfaceC5730l0);
        final ComponentCallbacks2 componentCallbacks2 = componentCallbacks2(streetViewPanoramaView);
        abstractC6023l.a(interfaceC6027pLifecycleObserver);
        context.registerComponentCallbacks(componentCallbacks2);
        return new E() { // from class: com.google.maps.android.compose.streetview.StreetViewKt$StreetViewLifecycle$lambda$23$lambda$22$$inlined$onDispose$1
            @Override // androidx.compose.runtime.E
            public void dispose() {
                abstractC6023l.d(interfaceC6027pLifecycleObserver);
                context.unregisterComponentCallbacks(componentCallbacks2);
                streetViewPanoramaView.c();
            }
        };
    }

    private static final ComponentCallbacks2 componentCallbacks2(final StreetViewPanoramaView streetViewPanoramaView) {
        return new ComponentCallbacks2() { // from class: com.google.maps.android.compose.streetview.StreetViewKt.componentCallbacks2.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration config) {
                Intrinsics.j(config, "config");
            }

            @Override // android.content.ComponentCallbacks
            @Deprecated
            public void onLowMemory() {
                streetViewPanoramaView.d();
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                streetViewPanoramaView.d();
            }
        };
    }

    private static final InterfaceC6027p lifecycleObserver(final StreetViewPanoramaView streetViewPanoramaView, final InterfaceC5730l0<AbstractC6023l.a> interfaceC5730l0) {
        return new InterfaceC6027p() { // from class: com.google.maps.android.compose.streetview.i
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                StreetViewKt.lifecycleObserver$lambda$26(interfaceC5730l0, streetViewPanoramaView, interfaceC6030s, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$26(InterfaceC5730l0 interfaceC5730l0, StreetViewPanoramaView streetViewPanoramaView, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
        Intrinsics.j(interfaceC6030s, "<unused var>");
        Intrinsics.j(event, "event");
        event.e();
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                if (interfaceC5730l0.getValue() != AbstractC6023l.a.ON_STOP) {
                    streetViewPanoramaView.b(new Bundle());
                    break;
                }
                break;
            case 2:
                streetViewPanoramaView.g();
                break;
            case 3:
                streetViewPanoramaView.f();
                break;
            case 4:
                streetViewPanoramaView.e();
                break;
            case 5:
                streetViewPanoramaView.h();
                break;
            case 6:
                break;
            default:
                throw new IllegalStateException();
        }
        interfaceC5730l0.setValue(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreetViewCameraPositionState StreetView$lambda$11(z1<StreetViewCameraPositionState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StreetView$lambda$12(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StreetView$lambda$13(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StreetView$lambda$14(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StreetView$lambda$15(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreetViewPanoramaEventListeners StreetView$lambda$17(z1<StreetViewPanoramaEventListeners> z1Var) {
        return z1Var.getValue();
    }

    private static final void StreetViewLifecycle(final StreetViewPanoramaView streetViewPanoramaView, Composer composer, final int i10) {
        int i11;
        final StreetViewPanoramaView streetViewPanoramaView2;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1614301890);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(streetViewPanoramaView)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            streetViewPanoramaView2 = streetViewPanoramaView;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1614301890, i11, -1, "com.google.maps.android.compose.streetview.StreetViewLifecycle (StreetView.kt:115)");
            }
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            final AbstractC6023l lifecycle = ((InterfaceC6030s) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(AbstractC6023l.a.ON_CREATE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            boolean zD = composerStartRestartGroup.D(streetViewPanoramaView) | composerStartRestartGroup.D(lifecycle) | composerStartRestartGroup.D(context);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.google.maps.android.compose.streetview.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StreetViewKt.StreetViewLifecycle$lambda$23$lambda$22(streetViewPanoramaView, interfaceC5730l0, lifecycle, context, (F) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            streetViewPanoramaView2 = streetViewPanoramaView;
            J.a(context, lifecycle, streetViewPanoramaView2, (Function1) objB2, composerStartRestartGroup, (i11 << 6) & 896);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.google.maps.android.compose.streetview.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StreetViewKt.StreetViewLifecycle$lambda$24(streetViewPanoramaView2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Object disposingComposition(Function0<? extends InterfaceC5725j> function0, Continuation<? super Unit> continuation) {
        InterfaceC5725j interfaceC5725jInvoke = function0.invoke();
        try {
            InlineMarker.c(0);
            Z.a(continuation);
            InlineMarker.c(1);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            InlineMarker.b(1);
            interfaceC5725jInvoke.dispose();
            InlineMarker.a(1);
            throw th2;
        }
    }
}
