package com.google.maps.android.compose;

import Md.C4181g;
import Md.C4184j;
import Md.C4188n;
import Md.C4192s;
import Md.C4194u;
import androidx.compose.runtime.InterfaceC5730l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b/\b\u0001\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/google/maps/android/compose/InputHandlerNode;", "Lcom/google/maps/android/compose/MapNode;", "Lkotlin/Function1;", "LMd/g;", "", "onCircleClick", "LMd/j;", "onGroundOverlayClick", "LMd/s;", "onPolygonClick", "LMd/u;", "onPolylineClick", "LMd/n;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "onCircleClick$delegate", "Landroidx/compose/runtime/l0;", "getOnCircleClick", "()Lkotlin/jvm/functions/Function1;", "setOnCircleClick", "(Lkotlin/jvm/functions/Function1;)V", "onGroundOverlayClick$delegate", "getOnGroundOverlayClick", "setOnGroundOverlayClick", "onPolygonClick$delegate", "getOnPolygonClick", "setOnPolygonClick", "onPolylineClick$delegate", "getOnPolylineClick", "setOnPolylineClick", "onMarkerClick$delegate", "getOnMarkerClick", "setOnMarkerClick", "onInfoWindowClick$delegate", "getOnInfoWindowClick", "setOnInfoWindowClick", "onInfoWindowClose$delegate", "getOnInfoWindowClose", "setOnInfoWindowClose", "onInfoWindowLongClick$delegate", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "onMarkerDrag$delegate", "getOnMarkerDrag", "setOnMarkerDrag", "onMarkerDragEnd$delegate", "getOnMarkerDragEnd", "setOnMarkerDragEnd", "onMarkerDragStart$delegate", "getOnMarkerDragStart", "setOnMarkerDragStart", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InputHandlerNode implements MapNode {
    public static final int $stable = 0;

    /* renamed from: onCircleClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onCircleClick;

    /* renamed from: onGroundOverlayClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onGroundOverlayClick;

    /* renamed from: onInfoWindowClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onInfoWindowClick;

    /* renamed from: onInfoWindowClose$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onInfoWindowClose;

    /* renamed from: onInfoWindowLongClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onInfoWindowLongClick;

    /* renamed from: onMarkerClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onMarkerClick;

    /* renamed from: onMarkerDrag$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onMarkerDrag;

    /* renamed from: onMarkerDragEnd$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onMarkerDragEnd;

    /* renamed from: onMarkerDragStart$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onMarkerDragStart;

    /* renamed from: onPolygonClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onPolygonClick;

    /* renamed from: onPolylineClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5730l0 onPolylineClick;

    public InputHandlerNode() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public InputHandlerNode(Function1<? super C4181g, Unit> function1, Function1<? super C4184j, Unit> function12, Function1<? super C4192s, Unit> function13, Function1<? super C4194u, Unit> function14, Function1<? super C4188n, Boolean> function15, Function1<? super C4188n, Unit> function16, Function1<? super C4188n, Unit> function17, Function1<? super C4188n, Unit> function18, Function1<? super C4188n, Unit> function19, Function1<? super C4188n, Unit> function110, Function1<? super C4188n, Unit> function111) {
        this.onCircleClick = androidx.compose.runtime.t1.e(function1, null, 2, null);
        this.onGroundOverlayClick = androidx.compose.runtime.t1.e(function12, null, 2, null);
        this.onPolygonClick = androidx.compose.runtime.t1.e(function13, null, 2, null);
        this.onPolylineClick = androidx.compose.runtime.t1.e(function14, null, 2, null);
        this.onMarkerClick = androidx.compose.runtime.t1.e(function15, null, 2, null);
        this.onInfoWindowClick = androidx.compose.runtime.t1.e(function16, null, 2, null);
        this.onInfoWindowClose = androidx.compose.runtime.t1.e(function17, null, 2, null);
        this.onInfoWindowLongClick = androidx.compose.runtime.t1.e(function18, null, 2, null);
        this.onMarkerDrag = androidx.compose.runtime.t1.e(function19, null, 2, null);
        this.onMarkerDragEnd = androidx.compose.runtime.t1.e(function110, null, 2, null);
        this.onMarkerDragStart = androidx.compose.runtime.t1.e(function111, null, 2, null);
    }

    public final Function1<C4181g, Unit> getOnCircleClick() {
        return (Function1) this.onCircleClick.getValue();
    }

    public final Function1<C4184j, Unit> getOnGroundOverlayClick() {
        return (Function1) this.onGroundOverlayClick.getValue();
    }

    public final Function1<C4188n, Unit> getOnInfoWindowClick() {
        return (Function1) this.onInfoWindowClick.getValue();
    }

    public final Function1<C4188n, Unit> getOnInfoWindowClose() {
        return (Function1) this.onInfoWindowClose.getValue();
    }

    public final Function1<C4188n, Unit> getOnInfoWindowLongClick() {
        return (Function1) this.onInfoWindowLongClick.getValue();
    }

    public final Function1<C4188n, Boolean> getOnMarkerClick() {
        return (Function1) this.onMarkerClick.getValue();
    }

    public final Function1<C4188n, Unit> getOnMarkerDrag() {
        return (Function1) this.onMarkerDrag.getValue();
    }

    public final Function1<C4188n, Unit> getOnMarkerDragEnd() {
        return (Function1) this.onMarkerDragEnd.getValue();
    }

    public final Function1<C4188n, Unit> getOnMarkerDragStart() {
        return (Function1) this.onMarkerDragStart.getValue();
    }

    public final Function1<C4192s, Unit> getOnPolygonClick() {
        return (Function1) this.onPolygonClick.getValue();
    }

    public final Function1<C4194u, Unit> getOnPolylineClick() {
        return (Function1) this.onPolylineClick.getValue();
    }

    public final void setOnCircleClick(Function1<? super C4181g, Unit> function1) {
        this.onCircleClick.setValue(function1);
    }

    public final void setOnGroundOverlayClick(Function1<? super C4184j, Unit> function1) {
        this.onGroundOverlayClick.setValue(function1);
    }

    public final void setOnInfoWindowClick(Function1<? super C4188n, Unit> function1) {
        this.onInfoWindowClick.setValue(function1);
    }

    public final void setOnInfoWindowClose(Function1<? super C4188n, Unit> function1) {
        this.onInfoWindowClose.setValue(function1);
    }

    public final void setOnInfoWindowLongClick(Function1<? super C4188n, Unit> function1) {
        this.onInfoWindowLongClick.setValue(function1);
    }

    public final void setOnMarkerClick(Function1<? super C4188n, Boolean> function1) {
        this.onMarkerClick.setValue(function1);
    }

    public final void setOnMarkerDrag(Function1<? super C4188n, Unit> function1) {
        this.onMarkerDrag.setValue(function1);
    }

    public final void setOnMarkerDragEnd(Function1<? super C4188n, Unit> function1) {
        this.onMarkerDragEnd.setValue(function1);
    }

    public final void setOnMarkerDragStart(Function1<? super C4188n, Unit> function1) {
        this.onMarkerDragStart.setValue(function1);
    }

    public final void setOnPolygonClick(Function1<? super C4192s, Unit> function1) {
        this.onPolygonClick.setValue(function1);
    }

    public final void setOnPolylineClick(Function1<? super C4194u, Unit> function1) {
        this.onPolylineClick.setValue(function1);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        super.onCleared();
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        super.onRemoved();
    }

    public /* synthetic */ InputHandlerNode(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function12, (i10 & 4) != 0 ? null : function13, (i10 & 8) != 0 ? null : function14, (i10 & 16) != 0 ? null : function15, (i10 & 32) != 0 ? null : function16, (i10 & 64) != 0 ? null : function17, (i10 & 128) != 0 ? null : function18, (i10 & 256) != 0 ? null : function19, (i10 & 512) != 0 ? null : function110, (i10 & 1024) != 0 ? null : function111);
    }
}
