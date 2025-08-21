package Ba;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"LBa/n;", "", "", "smallIconResourceId", "colorResourceId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ba.n, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class NotificationResourceIds {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int smallIconResourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int colorResourceId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationResourceIds)) {
            return false;
        }
        NotificationResourceIds notificationResourceIds = (NotificationResourceIds) other;
        return this.smallIconResourceId == notificationResourceIds.smallIconResourceId && this.colorResourceId == notificationResourceIds.colorResourceId;
    }

    /* renamed from: a, reason: from getter */
    public final int getColorResourceId() {
        return this.colorResourceId;
    }

    /* renamed from: b, reason: from getter */
    public final int getSmallIconResourceId() {
        return this.smallIconResourceId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.smallIconResourceId) * 31) + Integer.hashCode(this.colorResourceId);
    }

    public String toString() {
        return "NotificationResourceIds(smallIconResourceId=" + this.smallIconResourceId + ", colorResourceId=" + this.colorResourceId + ")";
    }

    public NotificationResourceIds(int i10, int i11) {
        this.smallIconResourceId = i10;
        this.colorResourceId = i11;
    }
}
