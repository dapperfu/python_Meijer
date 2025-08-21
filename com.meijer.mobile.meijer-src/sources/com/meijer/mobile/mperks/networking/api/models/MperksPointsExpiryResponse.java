package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksPointsExpiryResponse;", "", "", "success", "", "Lcom/meijer/mobile/mperks/networking/api/models/ExpiringPointsResponse;", "payload", "<init>", "(ZLjava/util/List;)V", "copy", "(ZLjava/util/List;)Lcom/meijer/mobile/mperks/networking/api/models/MperksPointsExpiryResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksPointsExpiryResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ExpiringPointsResponse> payload;

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

    public final List<ExpiringPointsResponse> a() {
        return this.payload;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }
}
