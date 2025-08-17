package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreRequest;", "", "", "accountId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(JI)V", "copy", "(JI)Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "setAccountId", "(J)V", "b", "I", "setStoreId", "(I)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateStoreRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int storeId;

    public UpdateStoreRequest() {
        this(0L, 0, 3, null);
    }

    public final UpdateStoreRequest copy(@g(name = "accountId") long accountId, @g(name = "storeId") int storeId) {
        return new UpdateStoreRequest(accountId, storeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateStoreRequest)) {
            return false;
        }
        UpdateStoreRequest updateStoreRequest = (UpdateStoreRequest) other;
        return this.accountId == updateStoreRequest.accountId && this.storeId == updateStoreRequest.storeId;
    }

    public int hashCode() {
        return (Long.hashCode(this.accountId) * 31) + Integer.hashCode(this.storeId);
    }

    public String toString() {
        return "UpdateStoreRequest(accountId=" + this.accountId + ", storeId=" + this.storeId + ')';
    }

    public UpdateStoreRequest(@g(name = "accountId") long j10, @g(name = "storeId") int i10) {
        this.accountId = j10;
        this.storeId = i10;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ UpdateStoreRequest(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10);
    }
}
