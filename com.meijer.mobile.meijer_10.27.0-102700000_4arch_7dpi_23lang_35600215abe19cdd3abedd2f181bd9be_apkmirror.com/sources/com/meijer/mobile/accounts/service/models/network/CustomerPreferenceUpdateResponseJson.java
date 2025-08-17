package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;", "", "", "isSuccess", "", "preferenceId", "", "message", "<init>", "(ZILjava/lang/String;)V", "copy", "(ZILjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "I", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerPreferenceUpdateResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int preferenceId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public CustomerPreferenceUpdateResponseJson() {
        this(false, 0, null, 7, null);
    }

    public final CustomerPreferenceUpdateResponseJson copy(@g(name = "isSuccess") boolean isSuccess, @g(name = "preferenceId") int preferenceId, @g(name = "message") String message) {
        return new CustomerPreferenceUpdateResponseJson(isSuccess, preferenceId, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPreferenceUpdateResponseJson)) {
            return false;
        }
        CustomerPreferenceUpdateResponseJson customerPreferenceUpdateResponseJson = (CustomerPreferenceUpdateResponseJson) other;
        return this.isSuccess == customerPreferenceUpdateResponseJson.isSuccess && this.preferenceId == customerPreferenceUpdateResponseJson.preferenceId && Intrinsics.e(this.message, customerPreferenceUpdateResponseJson.message);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isSuccess) * 31) + Integer.hashCode(this.preferenceId)) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomerPreferenceUpdateResponseJson(isSuccess=" + this.isSuccess + ", preferenceId=" + this.preferenceId + ", message=" + this.message + ')';
    }

    public CustomerPreferenceUpdateResponseJson(@g(name = "isSuccess") boolean z10, @g(name = "preferenceId") int i10, @g(name = "message") String str) {
        this.isSuccess = z10;
        this.preferenceId = i10;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final int getPreferenceId() {
        return this.preferenceId;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public /* synthetic */ CustomerPreferenceUpdateResponseJson(boolean z10, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str);
    }
}
