package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR \u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001a\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u000f¨\u0006%"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPinRequest;", "", "", "accountId", "", "currentPhone", "pin", "newPin", "", "activateViaText", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPinRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "e", "d", "Z", "()Z", "f", "getPhone", "getPhone$annotations", "()V", "phone", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateMperksPinRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentPhone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String newPin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activateViaText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String phone;

    @g(name = "phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    public final UpdateMperksPinRequest copy(@g(name = "accountId") long accountId, @g(name = "currentPhone") String currentPhone, @g(name = "pin") String pin, @g(name = "newPin") String newPin, @g(name = "activateViaText") boolean activateViaText) {
        Intrinsics.j(currentPhone, "currentPhone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(newPin, "newPin");
        return new UpdateMperksPinRequest(accountId, currentPhone, pin, newPin, activateViaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMperksPinRequest)) {
            return false;
        }
        UpdateMperksPinRequest updateMperksPinRequest = (UpdateMperksPinRequest) other;
        return this.accountId == updateMperksPinRequest.accountId && Intrinsics.e(this.currentPhone, updateMperksPinRequest.currentPhone) && Intrinsics.e(this.pin, updateMperksPinRequest.pin) && Intrinsics.e(this.newPin, updateMperksPinRequest.newPin) && this.activateViaText == updateMperksPinRequest.activateViaText;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.accountId) * 31) + this.currentPhone.hashCode()) * 31) + this.pin.hashCode()) * 31) + this.newPin.hashCode()) * 31) + Boolean.hashCode(this.activateViaText);
    }

    public String toString() {
        return "UpdateMperksPinRequest(accountId=" + this.accountId + ", currentPhone=" + this.currentPhone + ", pin=" + this.pin + ", newPin=" + this.newPin + ", activateViaText=" + this.activateViaText + ')';
    }

    public UpdateMperksPinRequest(@g(name = "accountId") long j10, @g(name = "currentPhone") String currentPhone, @g(name = "pin") String pin, @g(name = "newPin") String newPin, @g(name = "activateViaText") boolean z10) {
        Intrinsics.j(currentPhone, "currentPhone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(newPin, "newPin");
        this.accountId = j10;
        this.currentPhone = currentPhone;
        this.pin = pin;
        this.newPin = newPin;
        this.activateViaText = z10;
        this.phone = currentPhone;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getActivateViaText() {
        return this.activateViaText;
    }

    /* renamed from: c, reason: from getter */
    public final String getCurrentPhone() {
        return this.currentPhone;
    }

    /* renamed from: d, reason: from getter */
    public final String getNewPin() {
        return this.newPin;
    }

    /* renamed from: e, reason: from getter */
    public final String getPin() {
        return this.pin;
    }
}
