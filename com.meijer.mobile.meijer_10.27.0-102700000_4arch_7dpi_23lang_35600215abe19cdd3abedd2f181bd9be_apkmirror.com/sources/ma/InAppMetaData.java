package ma;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lma/b;", "Ljava/io/Serializable;", "", "campaignId", "sid", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ma.b, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class InAppMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String campaignId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppMetaData)) {
            return false;
        }
        InAppMetaData inAppMetaData = (InAppMetaData) other;
        return Intrinsics.e(this.campaignId, inAppMetaData.campaignId) && Intrinsics.e(this.sid, inAppMetaData.sid) && Intrinsics.e(this.url, inAppMetaData.url);
    }

    public InAppMetaData(String campaignId, String str, String str2) {
        Intrinsics.j(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.sid = str;
        this.url = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: b, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.campaignId.hashCode() * 31;
        String str = this.sid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InAppMetaData(campaignId=" + this.campaignId + ", sid=" + this.sid + ", url=" + this.url + ")";
    }
}
