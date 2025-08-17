package E7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"LE7/a;", "", "", "count", "", "reason", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: E7.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class RetryInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryInfo)) {
            return false;
        }
        RetryInfo retryInfo = (RetryInfo) other;
        return this.count == retryInfo.count && Intrinsics.e(this.reason, retryInfo.reason);
    }

    /* renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: b, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.reason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RetryInfo(count=" + this.count + ", reason=" + this.reason + ')';
    }

    public RetryInfo(int i10, String str) {
        this.count = i10;
        this.reason = str;
    }
}
