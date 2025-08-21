package com.meijer.mobile.accounts.payments.api.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/UpdateConfirmationDTO;", "", "", PreferencesHelper.PREF_ID, "digitalAccountId", "", "success", "", "errorMessage", "<init>", "(JJZLjava/lang/String;)V", "copy", "(JJZLjava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/UpdateConfirmationDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Z", "d", "()Z", "Ljava/lang/String;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateConfirmationDTO {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    public UpdateConfirmationDTO() {
        this(0L, 0L, false, null, 15, null);
    }

    public final UpdateConfirmationDTO copy(@g(name = PreferencesHelper.PREF_ID) long id2, @g(name = "accountId") long digitalAccountId, @g(name = "success") boolean success, @g(name = "errorMessage") String errorMessage) {
        return new UpdateConfirmationDTO(id2, digitalAccountId, success, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateConfirmationDTO)) {
            return false;
        }
        UpdateConfirmationDTO updateConfirmationDTO = (UpdateConfirmationDTO) other;
        return this.id == updateConfirmationDTO.id && this.digitalAccountId == updateConfirmationDTO.digitalAccountId && this.success == updateConfirmationDTO.success && Intrinsics.e(this.errorMessage, updateConfirmationDTO.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + Long.hashCode(this.digitalAccountId)) * 31) + Boolean.hashCode(this.success)) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "UpdateConfirmationDTO(id=" + this.id + ", digitalAccountId=" + this.digitalAccountId + ", success=" + this.success + ", errorMessage=" + this.errorMessage + ')';
    }

    public UpdateConfirmationDTO(@g(name = PreferencesHelper.PREF_ID) long j10, @g(name = "accountId") long j11, @g(name = "success") boolean z10, @g(name = "errorMessage") String str) {
        this.id = j10;
        this.digitalAccountId = j11;
        this.success = z10;
        this.errorMessage = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ UpdateConfirmationDTO(long j10, long j11, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str);
    }
}
