package com.meijer.mobile.greenville.model.request.transferstatus;

import com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequest;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "header", "Lcom/meijer/mobile/greenville/model/request/transferstatus/EventData;", "eventData", "<init>", "(Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;Lcom/meijer/mobile/greenville/model/request/transferstatus/EventData;)V", "copy", "(Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;Lcom/meijer/mobile/greenville/model/request/transferstatus/EventData;)Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "b", "()Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/EventData;", "()Lcom/meijer/mobile/greenville/model/request/transferstatus/EventData;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferStatusRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionHeaderRequest header;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EventData eventData;

    public final TransferStatusRequest copy(@g(name = "header") TransactionHeaderRequest header, @g(name = "eventData") EventData eventData) {
        Intrinsics.j(header, "header");
        Intrinsics.j(eventData, "eventData");
        return new TransferStatusRequest(header, eventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferStatusRequest)) {
            return false;
        }
        TransferStatusRequest transferStatusRequest = (TransferStatusRequest) other;
        return Intrinsics.e(this.header, transferStatusRequest.header) && Intrinsics.e(this.eventData, transferStatusRequest.eventData);
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.eventData.hashCode();
    }

    public String toString() {
        return "TransferStatusRequest(header=" + this.header + ", eventData=" + this.eventData + ')';
    }

    public TransferStatusRequest(@g(name = "header") TransactionHeaderRequest header, @g(name = "eventData") EventData eventData) {
        Intrinsics.j(header, "header");
        Intrinsics.j(eventData, "eventData");
        this.header = header;
        this.eventData = eventData;
    }

    /* renamed from: a, reason: from getter */
    public final EventData getEventData() {
        return this.eventData;
    }

    /* renamed from: b, reason: from getter */
    public final TransactionHeaderRequest getHeader() {
        return this.header;
    }
}
