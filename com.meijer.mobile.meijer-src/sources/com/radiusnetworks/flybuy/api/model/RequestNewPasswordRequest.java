package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequest;", "", "data", "Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;", "(Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;)V", "getData", "()Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequestNewPasswordRequest {
    private final RequestNewPasswordRequestData data;

    public static /* synthetic */ RequestNewPasswordRequest copy$default(RequestNewPasswordRequest requestNewPasswordRequest, RequestNewPasswordRequestData requestNewPasswordRequestData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            requestNewPasswordRequestData = requestNewPasswordRequest.data;
        }
        return requestNewPasswordRequest.copy(requestNewPasswordRequestData);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestNewPasswordRequestData getData() {
        return this.data;
    }

    public final RequestNewPasswordRequest copy(RequestNewPasswordRequestData data) {
        Intrinsics.j(data, "data");
        return new RequestNewPasswordRequest(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestNewPasswordRequest) && Intrinsics.e(this.data, ((RequestNewPasswordRequest) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "RequestNewPasswordRequest(data=" + this.data + ')';
    }

    public RequestNewPasswordRequest(RequestNewPasswordRequestData data) {
        Intrinsics.j(data, "data");
        this.data = data;
    }

    public final RequestNewPasswordRequestData getData() {
        return this.data;
    }
}
