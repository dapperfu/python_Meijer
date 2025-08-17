package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdateRequest;", "", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;", "pickUpOrderStatusUpdate", "<init>", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;)V", "copy", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdateRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;", "()Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PickUpOrderStatusUpdateRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickUpOrderStatusUpdate pickUpOrderStatusUpdate;

    /* JADX WARN: Multi-variable type inference failed */
    public PickUpOrderStatusUpdateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final PickUpOrderStatusUpdateRequest copy(@g(name = "data") PickUpOrderStatusUpdate pickUpOrderStatusUpdate) {
        return new PickUpOrderStatusUpdateRequest(pickUpOrderStatusUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PickUpOrderStatusUpdateRequest) && Intrinsics.e(this.pickUpOrderStatusUpdate, ((PickUpOrderStatusUpdateRequest) other).pickUpOrderStatusUpdate);
    }

    public int hashCode() {
        PickUpOrderStatusUpdate pickUpOrderStatusUpdate = this.pickUpOrderStatusUpdate;
        if (pickUpOrderStatusUpdate == null) {
            return 0;
        }
        return pickUpOrderStatusUpdate.hashCode();
    }

    public String toString() {
        return "PickUpOrderStatusUpdateRequest(pickUpOrderStatusUpdate=" + this.pickUpOrderStatusUpdate + ')';
    }

    public PickUpOrderStatusUpdateRequest(@g(name = "data") PickUpOrderStatusUpdate pickUpOrderStatusUpdate) {
        this.pickUpOrderStatusUpdate = pickUpOrderStatusUpdate;
    }

    /* renamed from: a, reason: from getter */
    public final PickUpOrderStatusUpdate getPickUpOrderStatusUpdate() {
        return this.pickUpOrderStatusUpdate;
    }

    public /* synthetic */ PickUpOrderStatusUpdateRequest(PickUpOrderStatusUpdate pickUpOrderStatusUpdate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : pickUpOrderStatusUpdate);
    }
}
