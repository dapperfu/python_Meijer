package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010 R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'\"\u0004\b(\u0010)R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b%\u0010\u0010\"\u0004\b*\u0010 ¨\u0006+"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPhoneRequest;", "", "", "accountId", "", "currentPhone", "newPhone", "pin", "", "activateViaText", "newPin", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPhoneRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "setAccountId", "(J)V", "b", "Ljava/lang/String;", "c", "setCurrentPhone", "(Ljava/lang/String;)V", "d", "setNewPhone", "f", "setPin", "e", "Z", "()Z", "setActivateViaText", "(Z)V", "setNewPin", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateMperksPhoneRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String currentPhone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String newPhone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String pin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean activateViaText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String newPin;

    public UpdateMperksPhoneRequest(@g(name = "accountId") long j10, @g(name = "currentPhone") String currentPhone, @g(name = "Phone") String newPhone, @g(name = "Pin") String pin, @g(name = "activateViaText") boolean z10, @g(name = "newPin") String newPin) {
        Intrinsics.j(currentPhone, "currentPhone");
        Intrinsics.j(newPhone, "newPhone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(newPin, "newPin");
        this.accountId = j10;
        this.currentPhone = currentPhone;
        this.newPhone = newPhone;
        this.pin = pin;
        this.activateViaText = z10;
        this.newPin = newPin;
    }

    public final UpdateMperksPhoneRequest copy(@g(name = "accountId") long accountId, @g(name = "currentPhone") String currentPhone, @g(name = "Phone") String newPhone, @g(name = "Pin") String pin, @g(name = "activateViaText") boolean activateViaText, @g(name = "newPin") String newPin) {
        Intrinsics.j(currentPhone, "currentPhone");
        Intrinsics.j(newPhone, "newPhone");
        Intrinsics.j(pin, "pin");
        Intrinsics.j(newPin, "newPin");
        return new UpdateMperksPhoneRequest(accountId, currentPhone, newPhone, pin, activateViaText, newPin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMperksPhoneRequest)) {
            return false;
        }
        UpdateMperksPhoneRequest updateMperksPhoneRequest = (UpdateMperksPhoneRequest) other;
        return this.accountId == updateMperksPhoneRequest.accountId && Intrinsics.e(this.currentPhone, updateMperksPhoneRequest.currentPhone) && Intrinsics.e(this.newPhone, updateMperksPhoneRequest.newPhone) && Intrinsics.e(this.pin, updateMperksPhoneRequest.pin) && this.activateViaText == updateMperksPhoneRequest.activateViaText && Intrinsics.e(this.newPin, updateMperksPhoneRequest.newPin);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.accountId) * 31) + this.currentPhone.hashCode()) * 31) + this.newPhone.hashCode()) * 31) + this.pin.hashCode()) * 31) + Boolean.hashCode(this.activateViaText)) * 31) + this.newPin.hashCode();
    }

    public String toString() {
        return "UpdateMperksPhoneRequest(accountId=" + this.accountId + ", currentPhone=" + this.currentPhone + ", newPhone=" + this.newPhone + ", pin=" + this.pin + ", activateViaText=" + this.activateViaText + ", newPin=" + this.newPin + ')';
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
    public final String getNewPhone() {
        return this.newPhone;
    }

    /* renamed from: e, reason: from getter */
    public final String getNewPin() {
        return this.newPin;
    }

    /* renamed from: f, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    public /* synthetic */ UpdateMperksPhoneRequest(long j10, String str, String str2, String str3, boolean z10, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3, z10, (i10 & 32) != 0 ? str3 : str4);
    }
}
