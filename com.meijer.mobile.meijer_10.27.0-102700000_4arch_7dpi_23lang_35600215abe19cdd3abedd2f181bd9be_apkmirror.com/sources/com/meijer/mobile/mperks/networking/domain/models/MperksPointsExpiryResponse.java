package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksPointsExpiryResponse;", "", "success", "", "payload", "", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPointsResponse;", "<init>", "(ZLjava/util/List;)V", "getSuccess", "()Z", "getPayload", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksPointsExpiryResponse {
    private final List<ExpiringPointsResponse> payload;
    private final boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksPointsExpiryResponse copy$default(MperksPointsExpiryResponse mperksPointsExpiryResponse, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mperksPointsExpiryResponse.success;
        }
        if ((i10 & 2) != 0) {
            list = mperksPointsExpiryResponse.payload;
        }
        return mperksPointsExpiryResponse.copy(z10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final List<ExpiringPointsResponse> component2() {
        return this.payload;
    }

    public final MperksPointsExpiryResponse copy(@g(name = "success") boolean success, @g(name = "payload") List<ExpiringPointsResponse> payload) {
        Intrinsics.j(payload, "payload");
        return new MperksPointsExpiryResponse(success, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksPointsExpiryResponse)) {
            return false;
        }
        MperksPointsExpiryResponse mperksPointsExpiryResponse = (MperksPointsExpiryResponse) other;
        return this.success == mperksPointsExpiryResponse.success && Intrinsics.e(this.payload, mperksPointsExpiryResponse.payload);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "MperksPointsExpiryResponse(success=" + this.success + ", payload=" + this.payload + ')';
    }

    public MperksPointsExpiryResponse(@g(name = "success") boolean z10, @g(name = "payload") List<ExpiringPointsResponse> payload) {
        Intrinsics.j(payload, "payload");
        this.success = z10;
        this.payload = payload;
    }

    public final List<ExpiringPointsResponse> getPayload() {
        return this.payload;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
