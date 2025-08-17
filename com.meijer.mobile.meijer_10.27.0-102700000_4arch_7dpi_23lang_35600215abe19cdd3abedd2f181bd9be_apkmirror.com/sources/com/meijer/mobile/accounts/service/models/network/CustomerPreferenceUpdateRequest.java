package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateRequest;", "", "", "owningProgramName", "preferenceTypeName", "preferenceValue", "", "digitalAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "J", "()J", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerPreferenceUpdateRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String owningProgramName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceTypeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    public final CustomerPreferenceUpdateRequest copy(@g(name = "owningProgramName") String owningProgramName, @g(name = "preferenceTypeName") String preferenceTypeName, @g(name = "preferenceValue") String preferenceValue, @g(name = "digitalAccountId") long digitalAccountId) {
        Intrinsics.j(owningProgramName, "owningProgramName");
        Intrinsics.j(preferenceTypeName, "preferenceTypeName");
        return new CustomerPreferenceUpdateRequest(owningProgramName, preferenceTypeName, preferenceValue, digitalAccountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPreferenceUpdateRequest)) {
            return false;
        }
        CustomerPreferenceUpdateRequest customerPreferenceUpdateRequest = (CustomerPreferenceUpdateRequest) other;
        return Intrinsics.e(this.owningProgramName, customerPreferenceUpdateRequest.owningProgramName) && Intrinsics.e(this.preferenceTypeName, customerPreferenceUpdateRequest.preferenceTypeName) && Intrinsics.e(this.preferenceValue, customerPreferenceUpdateRequest.preferenceValue) && this.digitalAccountId == customerPreferenceUpdateRequest.digitalAccountId;
    }

    public int hashCode() {
        int iHashCode = ((this.owningProgramName.hashCode() * 31) + this.preferenceTypeName.hashCode()) * 31;
        String str = this.preferenceValue;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.digitalAccountId);
    }

    public String toString() {
        return "CustomerPreferenceUpdateRequest(owningProgramName=" + this.owningProgramName + ", preferenceTypeName=" + this.preferenceTypeName + ", preferenceValue=" + this.preferenceValue + ", digitalAccountId=" + this.digitalAccountId + ')';
    }

    public CustomerPreferenceUpdateRequest(@g(name = "owningProgramName") String owningProgramName, @g(name = "preferenceTypeName") String preferenceTypeName, @g(name = "preferenceValue") String str, @g(name = "digitalAccountId") long j10) {
        Intrinsics.j(owningProgramName, "owningProgramName");
        Intrinsics.j(preferenceTypeName, "preferenceTypeName");
        this.owningProgramName = owningProgramName;
        this.preferenceTypeName = preferenceTypeName;
        this.preferenceValue = str;
        this.digitalAccountId = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getOwningProgramName() {
        return this.owningProgramName;
    }

    /* renamed from: c, reason: from getter */
    public final String getPreferenceTypeName() {
        return this.preferenceTypeName;
    }

    /* renamed from: d, reason: from getter */
    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
