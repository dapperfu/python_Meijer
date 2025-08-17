package com.google.maps.android.compose;

import Kd.C3943a;
import Kd.C3944b;
import Kd.C3945c;
import Kd.C3952j;
import androidx.compose.runtime.InterfaceC5730l0;
import com.google.android.gms.common.api.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002HGB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0087@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020$8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104\"\u0004\b\u0017\u0010\u0016R/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR/\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010-\"\u0004\bF\u0010\u0005¨\u0006I"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "callback", "", "doOnMapChangedLocked", "(Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;)V", "LKd/c;", "map", "LKd/a;", "update", "", "durationMs", "Lqv/n;", "continuation", "performAnimateCameraLocked", "(LKd/c;LKd/a;ILqv/n;)V", "setMap$maps_compose_release", "(LKd/c;)V", "setMap", "animate", "(LKd/a;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "(LKd/a;)V", "", "<set-?>", "isMoving$delegate", "Landroidx/compose/runtime/l0;", "isMoving", "()Z", "setMoving$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "cameraMoveStartedReason$delegate", "getCameraMoveStartedReason", "()Lcom/google/maps/android/compose/CameraMoveStartedReason;", "setCameraMoveStartedReason$maps_compose_release", "(Lcom/google/maps/android/compose/CameraMoveStartedReason;)V", "cameraMoveStartedReason", "rawPosition$delegate", "getRawPosition$maps_compose_release", "()Lcom/google/android/gms/maps/model/CameraPosition;", "setRawPosition$maps_compose_release", "rawPosition", "lock", "Lkotlin/Unit;", "map$delegate", "getMap", "()LKd/c;", "onMapChanged$delegate", "getOnMapChanged", "()Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "setOnMapChanged", "onMapChanged", "movementOwner$delegate", "getMovementOwner", "()Ljava/lang/Object;", "setMovementOwner", "(Ljava/lang/Object;)V", "movementOwner", "LKd/j;", "getProjection", "()LKd/j;", "projection", "value", "getPosition", "setPosition", "Companion", "OnMapChangedCallback", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CameraPositionState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final L0.k<CameraPositionState, CameraPosition> Saver = L0.l.a(new Function2() { // from class: com.google.maps.android.compose.b
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return CameraPositionState.Saver$lambda$10((L0.m) obj, (CameraPositionState) obj2);
        }
    }, new Function1() { // from class: com.google.maps.android.compose.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CameraPositionState.Saver$lambda$11((CameraPosition) obj);
        }
    });

    /* renamed from: cameraMoveStartedReason$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 cameraMoveStartedReason;

    /* renamed from: isMoving$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 isMoving;
    private final Unit lock;

    /* renamed from: map$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 map;

    /* renamed from: movementOwner$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 movementOwner;

    /* renamed from: onMapChanged$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onMapChanged;

    /* renamed from: rawPosition$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 rawPosition;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "Lcom/google/maps/android/compose/CameraPositionState;", "invoke", "(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/maps/android/compose/CameraPositionState;", "LL0/k;", "Saver", "LL0/k;", "getSaver", "()LL0/k;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CameraPositionState invoke$default(Companion companion, CameraPosition cameraPosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cameraPosition = new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f);
            }
            return companion.invoke(cameraPosition);
        }

        public final CameraPositionState invoke(CameraPosition position) {
            Intrinsics.j(position, "position");
            return new CameraPositionState(position, null);
        }

        public final L0.k<CameraPositionState, CameraPosition> getSaver() {
            return CameraPositionState.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "", "LKd/c;", "newMap", "", "onMapChangedLocked", "(LKd/c;)V", "onCancelLocked", "()V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    interface OnMapChangedCallback {
        default void onCancelLocked() {
        }

        void onMapChangedLocked(C3945c newMap);

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onCancelLocked(OnMapChangedCallback onMapChangedCallback) {
                OnMapChangedCallback.super.onCancelLocked();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.google.maps.android.compose.CameraPositionState", f = "CameraPositionState.kt", l = {335}, m = "animate")
    /* renamed from: com.google.maps.android.compose.CameraPositionState$animate$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraPositionState.this.animate(null, 0, this);
        }
    }

    public /* synthetic */ CameraPositionState(CameraPosition cameraPosition, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraPosition);
    }

    private CameraPositionState(CameraPosition cameraPosition) {
        this.isMoving = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
        this.cameraMoveStartedReason = androidx.compose.runtime.t1.e(CameraMoveStartedReason.NO_MOVEMENT_YET, null, 2, null);
        this.rawPosition = androidx.compose.runtime.t1.e(cameraPosition, null, 2, null);
        this.lock = Unit.f142422a;
        this.map = androidx.compose.runtime.t1.e(null, null, 2, null);
        this.onMapChanged = androidx.compose.runtime.t1.e(null, null, 2, null);
        this.movementOwner = androidx.compose.runtime.t1.e(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPosition Saver$lambda$10(L0.m Saver2, CameraPositionState it) {
        Intrinsics.j(Saver2, "$this$Saver");
        Intrinsics.j(it, "it");
        return it.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState Saver$lambda$11(CameraPosition it) {
        Intrinsics.j(it, "it");
        return new CameraPositionState(it);
    }

    public static /* synthetic */ Object animate$default(CameraPositionState cameraPositionState, C3943a c3943a, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return cameraPositionState.animate(c3943a, i10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final C3945c getMap() {
        return (C3945c) this.map.getValue();
    }

    private final Object getMovementOwner() {
        return this.movementOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnMapChangedCallback getOnMapChanged() {
        return (OnMapChangedCallback) this.onMapChanged.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void move$lambda$9$lambda$8(C3943a c3943a, C3945c c3945c) {
        if (c3945c != null) {
            c3945c.m(c3943a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performAnimateCameraLocked(final C3945c map, C3943a update, int durationMs, final InterfaceC16654n<? super Unit> continuation) {
        C3945c.a aVar = new C3945c.a() { // from class: com.google.maps.android.compose.CameraPositionState$performAnimateCameraLocked$cancelableCallback$1
            @Override // Kd.C3945c.a
            public void onCancel() {
                InterfaceC16654n<Unit> interfaceC16654n = continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(ResultKt.a(new CancellationException("Animation cancelled"))));
            }

            @Override // Kd.C3945c.a
            public void onFinish() {
                InterfaceC16654n<Unit> interfaceC16654n = continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
            }
        };
        if (durationMs == Integer.MAX_VALUE) {
            map.h(update, aVar);
        } else {
            map.g(update, durationMs, aVar);
        }
        doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.d
            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public final void onMapChangedLocked(C3945c c3945c) {
                CameraPositionState.performAnimateCameraLocked$lambda$7(map, c3945c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAnimateCameraLocked$lambda$7(C3945c c3945c, C3945c c3945c2) {
        if (c3945c2 != null) {
            throw new IllegalStateException("New GoogleMap unexpectedly set while an animation was still running");
        }
        c3945c.W();
    }

    private final void setMap(C3945c c3945c) {
        this.map.setValue(c3945c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMovementOwner(Object obj) {
        this.movementOwner.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnMapChanged(OnMapChangedCallback onMapChangedCallback) {
        this.onMapChanged.setValue(onMapChangedCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.maps.android.compose.CameraPositionState$OnMapChangedCallback, com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(final Kd.C3943a r7, final int r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.CameraPositionState.animate(Kd.a, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraMoveStartedReason getCameraMoveStartedReason() {
        return (CameraMoveStartedReason) this.cameraMoveStartedReason.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraPosition getRawPosition$maps_compose_release() {
        return (CameraPosition) this.rawPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isMoving() {
        return ((Boolean) this.isMoving.getValue()).booleanValue();
    }

    public final void move(final C3943a update) {
        Intrinsics.j(update, "update");
        synchronized (this.lock) {
            try {
                C3945c map = getMap();
                setMovementOwner(null);
                if (map == null) {
                    doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.a
                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                        public final void onMapChangedLocked(C3945c c3945c) {
                            CameraPositionState.move$lambda$9$lambda$8(update, c3945c);
                        }
                    });
                } else {
                    map.m(update);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason cameraMoveStartedReason) {
        Intrinsics.j(cameraMoveStartedReason, "<set-?>");
        this.cameraMoveStartedReason.setValue(cameraMoveStartedReason);
    }

    public final void setMap$maps_compose_release(C3945c map) {
        synchronized (this.lock) {
            try {
                if (getMap() == null && map == null) {
                    return;
                }
                if (getMap() != null && map != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                setMap(map);
                if (map == null) {
                    setMoving$maps_compose_release(false);
                } else {
                    map.m(C3944b.a(getPosition()));
                }
                OnMapChangedCallback onMapChanged = getOnMapChanged();
                if (onMapChanged != null) {
                    setOnMapChanged(null);
                    onMapChanged.onMapChangedLocked(map);
                    Unit unit = Unit.f142422a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setMoving$maps_compose_release(boolean z10) {
        this.isMoving.setValue(Boolean.valueOf(z10));
    }

    public final void setPosition(CameraPosition value) {
        Intrinsics.j(value, "value");
        synchronized (this.lock) {
            try {
                C3945c map = getMap();
                if (map == null) {
                    setRawPosition$maps_compose_release(value);
                } else {
                    map.m(C3944b.a(value));
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setRawPosition$maps_compose_release(CameraPosition cameraPosition) {
        Intrinsics.j(cameraPosition, "<set-?>");
        this.rawPosition.setValue(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnMapChangedLocked(OnMapChangedCallback callback) {
        OnMapChangedCallback onMapChanged = getOnMapChanged();
        if (onMapChanged != null) {
            onMapChanged.onCancelLocked();
        }
        setOnMapChanged(callback);
    }

    public final CameraPosition getPosition() {
        return getRawPosition$maps_compose_release();
    }

    public final C3952j getProjection() {
        C3945c map = getMap();
        if (map != null) {
            return map.k();
        }
        return null;
    }

    /* synthetic */ CameraPositionState(CameraPosition cameraPosition, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f) : cameraPosition);
    }
}
