package com.meijer.mobile.greenville.model.request.item.add;

import com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequest;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "", "", "type", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "header", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;", "eventData", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;)Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "()Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;", "()Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequestEventData;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AddItemRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionHeaderRequest header;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddItemRequestEventData eventData;

    public final AddItemRequest copy(@g(name = "type") String type, @g(name = "header") TransactionHeaderRequest header, @g(name = "eventData") AddItemRequestEventData eventData) {
        Intrinsics.j(type, "type");
        Intrinsics.j(header, "header");
        Intrinsics.j(eventData, "eventData");
        return new AddItemRequest(type, header, eventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddItemRequest)) {
            return false;
        }
        AddItemRequest addItemRequest = (AddItemRequest) other;
        return Intrinsics.e(this.type, addItemRequest.type) && Intrinsics.e(this.header, addItemRequest.header) && Intrinsics.e(this.eventData, addItemRequest.eventData);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.header.hashCode()) * 31) + this.eventData.hashCode();
    }

    public String toString() {
        return "AddItemRequest(type=" + this.type + ", header=" + this.header + ", eventData=" + this.eventData + ')';
    }

    public AddItemRequest(@g(name = "type") String type, @g(name = "header") TransactionHeaderRequest header, @g(name = "eventData") AddItemRequestEventData eventData) {
        Intrinsics.j(type, "type");
        Intrinsics.j(header, "header");
        Intrinsics.j(eventData, "eventData");
        this.type = type;
        this.header = header;
        this.eventData = eventData;
    }

    /* renamed from: a, reason: from getter */
    public final AddItemRequestEventData getEventData() {
        return this.eventData;
    }

    /* renamed from: b, reason: from getter */
    public final TransactionHeaderRequest getHeader() {
        return this.header;
    }

    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
