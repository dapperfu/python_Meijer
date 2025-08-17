package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CreateOrUpdateVehicleInformationRequest;", "", "", "vehicleId", "", "accountId", "", "vehicleDescription", "<init>", "(IJLjava/lang/String;)V", "copy", "(IJLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/CreateOrUpdateVehicleInformationRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "J", "()J", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CreateOrUpdateVehicleInformationRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vehicleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleDescription;

    public final CreateOrUpdateVehicleInformationRequest copy(@g(name = "vehicleId") int vehicleId, @g(name = "accountId") long accountId, @g(name = "vehicleDescription") String vehicleDescription) {
        Intrinsics.j(vehicleDescription, "vehicleDescription");
        return new CreateOrUpdateVehicleInformationRequest(vehicleId, accountId, vehicleDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrUpdateVehicleInformationRequest)) {
            return false;
        }
        CreateOrUpdateVehicleInformationRequest createOrUpdateVehicleInformationRequest = (CreateOrUpdateVehicleInformationRequest) other;
        return this.vehicleId == createOrUpdateVehicleInformationRequest.vehicleId && this.accountId == createOrUpdateVehicleInformationRequest.accountId && Intrinsics.e(this.vehicleDescription, createOrUpdateVehicleInformationRequest.vehicleDescription);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.vehicleId) * 31) + Long.hashCode(this.accountId)) * 31) + this.vehicleDescription.hashCode();
    }

    public String toString() {
        return "CreateOrUpdateVehicleInformationRequest(vehicleId=" + this.vehicleId + ", accountId=" + this.accountId + ", vehicleDescription=" + this.vehicleDescription + ')';
    }

    public CreateOrUpdateVehicleInformationRequest(@g(name = "vehicleId") int i10, @g(name = "accountId") long j10, @g(name = "vehicleDescription") String vehicleDescription) {
        Intrinsics.j(vehicleDescription, "vehicleDescription");
        this.vehicleId = i10;
        this.accountId = j10;
        this.vehicleDescription = vehicleDescription;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getVehicleDescription() {
        return this.vehicleDescription;
    }

    /* renamed from: c, reason: from getter */
    public final int getVehicleId() {
        return this.vehicleId;
    }
}
