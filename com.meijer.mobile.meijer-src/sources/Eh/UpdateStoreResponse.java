package Eh;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"LEh/F;", "", "", "accountId", "", "success", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getAccountId", "()J", "b", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.F, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class UpdateStoreResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateStoreResponse)) {
            return false;
        }
        UpdateStoreResponse updateStoreResponse = (UpdateStoreResponse) other;
        return this.accountId == updateStoreResponse.accountId && this.success == updateStoreResponse.success;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Long.hashCode(this.accountId) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "UpdateStoreResponse(accountId=" + this.accountId + ", success=" + this.success + ')';
    }

    public UpdateStoreResponse(long j10, boolean z10) {
        this.accountId = j10;
        this.success = z10;
    }
}
