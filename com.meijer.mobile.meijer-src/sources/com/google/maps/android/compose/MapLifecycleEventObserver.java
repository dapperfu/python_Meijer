package com.google.maps.android.compose;

import android.os.Bundle;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "Landroidx/lifecycle/p;", "Lcom/google/android/gms/maps/MapView;", "mapView", "<init>", "(Lcom/google/android/gms/maps/MapView;)V", "Landroidx/lifecycle/l$b;", "targetState", "", "moveToLifecycleState", "(Landroidx/lifecycle/l$b;)V", "moveDown", "()V", "moveUp", "Landroidx/lifecycle/l$a;", "event", "invokeEvent", "(Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/s;", "source", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "moveToBaseState", "moveToDestroyedState", "Lcom/google/android/gms/maps/MapView;", "currentLifecycleState", "Landroidx/lifecycle/l$b;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MapLifecycleEventObserver implements InterfaceC6169p {
    private AbstractC6165l.b currentLifecycleState;
    private final MapView mapView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC6165l.a.values().length];
            try {
                iArr[AbstractC6165l.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC6165l.a.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC6165l.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC6165l.a.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC6165l.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC6165l.a.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapLifecycleEventObserver(MapView mapView) {
        Intrinsics.j(mapView, "mapView");
        this.mapView = mapView;
        this.currentLifecycleState = AbstractC6165l.b.f55500b;
    }

    private final void invokeEvent(AbstractC6165l.a event) {
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.mapView.c();
                break;
            case 2:
                this.mapView.b(new Bundle());
                break;
            case 3:
                this.mapView.g();
                break;
            case 4:
                this.mapView.f();
                break;
            case 5:
                this.mapView.e();
                break;
            case 6:
                this.mapView.h();
                break;
            default:
                throw new IllegalStateException(("Unsupported lifecycle event: " + event).toString());
        }
        this.currentLifecycleState = event.e();
    }

    private final void moveDown() {
        AbstractC6165l.a aVarA = AbstractC6165l.a.INSTANCE.a(this.currentLifecycleState);
        if (aVarA != null) {
            invokeEvent(aVarA);
            return;
        }
        throw new IllegalStateException(("no event down from " + this.currentLifecycleState).toString());
    }

    private final void moveToLifecycleState(AbstractC6165l.b targetState) {
        while (true) {
            AbstractC6165l.b bVar = this.currentLifecycleState;
            if (bVar == targetState) {
                return;
            }
            if (bVar.compareTo(targetState) < 0) {
                moveUp();
            } else if (this.currentLifecycleState.compareTo(targetState) > 0) {
                moveDown();
            }
        }
    }

    private final void moveUp() {
        AbstractC6165l.a aVarB = AbstractC6165l.a.INSTANCE.b(this.currentLifecycleState);
        if (aVarB != null) {
            invokeEvent(aVarB);
            return;
        }
        throw new IllegalStateException(("no event up from " + this.currentLifecycleState).toString());
    }

    public final void moveToBaseState() {
        AbstractC6165l.b bVar = this.currentLifecycleState;
        AbstractC6165l.b bVar2 = AbstractC6165l.b.f55501c;
        if (bVar.compareTo(bVar2) > 0) {
            moveToLifecycleState(bVar2);
        }
    }

    public final void moveToDestroyedState() {
        if (this.currentLifecycleState.compareTo(AbstractC6165l.b.f55500b) > 0) {
            moveToLifecycleState(AbstractC6165l.b.f55499a);
        }
    }

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            moveToBaseState();
        } else {
            moveToLifecycleState(event.e());
        }
    }
}
