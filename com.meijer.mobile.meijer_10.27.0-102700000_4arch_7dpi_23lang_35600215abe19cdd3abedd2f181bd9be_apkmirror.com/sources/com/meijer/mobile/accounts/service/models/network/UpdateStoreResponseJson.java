package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;", "", "", "accountId", "", PreferencesHelper.PREF_ID, "", "success", "<init>", "(JIZ)V", "copy", "(JIZ)Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "I", "c", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateStoreResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    public UpdateStoreResponseJson() {
        this(0L, 0, false, 7, null);
    }

    public final UpdateStoreResponseJson copy(@g(name = "accountId") long accountId, @g(name = PreferencesHelper.PREF_ID) int id2, @g(name = "success") boolean success) {
        return new UpdateStoreResponseJson(accountId, id2, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateStoreResponseJson)) {
            return false;
        }
        UpdateStoreResponseJson updateStoreResponseJson = (UpdateStoreResponseJson) other;
        return this.accountId == updateStoreResponseJson.accountId && this.id == updateStoreResponseJson.id && this.success == updateStoreResponseJson.success;
    }

    public int hashCode() {
        return (((Long.hashCode(this.accountId) * 31) + Integer.hashCode(this.id)) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "UpdateStoreResponseJson(accountId=" + this.accountId + ", id=" + this.id + ", success=" + this.success + ')';
    }

    public UpdateStoreResponseJson(@g(name = "accountId") long j10, @g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "success") boolean z10) {
        this.accountId = j10;
        this.id = i10;
        this.success = z10;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ UpdateStoreResponseJson(long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
