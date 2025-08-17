package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010¨\u0006!"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;", "", "", PreferencesHelper.PREF_ID, "", "accountId", "", "errorMessage", "", "isSuccess", "errorType", "<init>", "(IJLjava/lang/String;ZLjava/lang/String;)V", "copy", "(IJLjava/lang/String;ZLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "J", "()J", "c", "Ljava/lang/String;", "Z", "e", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateConfirmationResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorType;

    public UpdateConfirmationResponseJson() {
        this(0, 0L, null, false, null, 31, null);
    }

    public final UpdateConfirmationResponseJson copy(@g(name = PreferencesHelper.PREF_ID) int id2, @g(name = "accountId") long accountId, @g(name = "message") String errorMessage, @g(name = "success") boolean isSuccess, @g(name = "errorMessage") String errorType) {
        return new UpdateConfirmationResponseJson(id2, accountId, errorMessage, isSuccess, errorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateConfirmationResponseJson)) {
            return false;
        }
        UpdateConfirmationResponseJson updateConfirmationResponseJson = (UpdateConfirmationResponseJson) other;
        return this.id == updateConfirmationResponseJson.id && this.accountId == updateConfirmationResponseJson.accountId && Intrinsics.e(this.errorMessage, updateConfirmationResponseJson.errorMessage) && this.isSuccess == updateConfirmationResponseJson.isSuccess && Intrinsics.e(this.errorType, updateConfirmationResponseJson.errorType);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + Long.hashCode(this.accountId)) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSuccess)) * 31;
        String str2 = this.errorType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UpdateConfirmationResponseJson(id=" + this.id + ", accountId=" + this.accountId + ", errorMessage=" + this.errorMessage + ", isSuccess=" + this.isSuccess + ", errorType=" + this.errorType + ')';
    }

    public UpdateConfirmationResponseJson(@g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "accountId") long j10, @g(name = "message") String str, @g(name = "success") boolean z10, @g(name = "errorMessage") String str2) {
        this.id = i10;
        this.accountId = j10;
        this.errorMessage = str;
        this.isSuccess = z10;
        this.errorType = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: c, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public /* synthetic */ UpdateConfirmationResponseJson(int i10, long j10, String str, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : str2);
    }
}
