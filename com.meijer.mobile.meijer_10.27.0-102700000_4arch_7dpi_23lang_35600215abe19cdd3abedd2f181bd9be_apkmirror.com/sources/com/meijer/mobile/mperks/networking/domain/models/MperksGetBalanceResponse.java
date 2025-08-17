package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksGetBalanceResponse;", "", "success", "", "payload", "Lcom/meijer/mobile/mperks/networking/domain/models/GetBalancePayload;", "<init>", "(ZLcom/meijer/mobile/mperks/networking/domain/models/GetBalancePayload;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getPayload", "()Lcom/meijer/mobile/mperks/networking/domain/models/GetBalancePayload;", "setPayload", "(Lcom/meijer/mobile/mperks/networking/domain/models/GetBalancePayload;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksGetBalanceResponse {
    private GetBalancePayload payload;
    private boolean success;

    public static /* synthetic */ MperksGetBalanceResponse copy$default(MperksGetBalanceResponse mperksGetBalanceResponse, boolean z10, GetBalancePayload getBalancePayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mperksGetBalanceResponse.success;
        }
        if ((i10 & 2) != 0) {
            getBalancePayload = mperksGetBalanceResponse.payload;
        }
        return mperksGetBalanceResponse.copy(z10, getBalancePayload);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final GetBalancePayload getPayload() {
        return this.payload;
    }

    public final MperksGetBalanceResponse copy(@g(name = "success") boolean success, @g(name = "payload") GetBalancePayload payload) {
        return new MperksGetBalanceResponse(success, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksGetBalanceResponse)) {
            return false;
        }
        MperksGetBalanceResponse mperksGetBalanceResponse = (MperksGetBalanceResponse) other;
        return this.success == mperksGetBalanceResponse.success && Intrinsics.e(this.payload, mperksGetBalanceResponse.payload);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        GetBalancePayload getBalancePayload = this.payload;
        return iHashCode + (getBalancePayload == null ? 0 : getBalancePayload.hashCode());
    }

    public String toString() {
        return "MperksGetBalanceResponse(success=" + this.success + ", payload=" + this.payload + ')';
    }

    public final GetBalancePayload getPayload() {
        return this.payload;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setPayload(GetBalancePayload getBalancePayload) {
        this.payload = getBalancePayload;
    }

    public final void setSuccess(boolean z10) {
        this.success = z10;
    }

    public MperksGetBalanceResponse(@g(name = "success") boolean z10, @g(name = "payload") GetBalancePayload getBalancePayload) {
        this.success = z10;
        this.payload = getBalancePayload;
    }
}
