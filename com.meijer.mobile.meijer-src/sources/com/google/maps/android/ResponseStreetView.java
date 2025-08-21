package com.google.maps.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/ResponseStreetView;", "", "status", "Lcom/google/maps/android/Status;", "<init>", "(Lcom/google/maps/android/Status;)V", "getStatus", "()Lcom/google/maps/android/Status;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResponseStreetView {
    private final Status status;

    public static /* synthetic */ ResponseStreetView copy$default(ResponseStreetView responseStreetView, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = responseStreetView.status;
        }
        return responseStreetView.copy(status);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final ResponseStreetView copy(Status status) {
        Intrinsics.j(status, "status");
        return new ResponseStreetView(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResponseStreetView) && this.status == ((ResponseStreetView) other).status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "ResponseStreetView(status=" + this.status + ")";
    }

    public ResponseStreetView(Status status) {
        Intrinsics.j(status, "status");
        this.status = status;
    }

    public final Status getStatus() {
        return this.status;
    }
}
