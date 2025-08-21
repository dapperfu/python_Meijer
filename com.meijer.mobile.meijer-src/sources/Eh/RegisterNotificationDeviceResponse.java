package Eh;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"LEh/w;", "", "", PreferencesHelper.PREF_ID, "accountId", "", "success", "<init>", "(JJZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "getAccountId", "c", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.w, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class RegisterNotificationDeviceResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterNotificationDeviceResponse)) {
            return false;
        }
        RegisterNotificationDeviceResponse registerNotificationDeviceResponse = (RegisterNotificationDeviceResponse) other;
        return this.id == registerNotificationDeviceResponse.id && this.accountId == registerNotificationDeviceResponse.accountId && this.success == registerNotificationDeviceResponse.success;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + Long.hashCode(this.accountId)) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "RegisterNotificationDeviceResponse(id=" + this.id + ", accountId=" + this.accountId + ", success=" + this.success + ')';
    }

    public RegisterNotificationDeviceResponse(long j10, long j11, boolean z10) {
        this.id = j10;
        this.accountId = j11;
        this.success = z10;
    }
}
