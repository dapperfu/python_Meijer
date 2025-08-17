package na;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lna/a;", "", "", "campaignId", "buttonId", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "J", "()J", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: na.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class ButtonClicked {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String campaignId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonClicked)) {
            return false;
        }
        ButtonClicked buttonClicked = (ButtonClicked) other;
        return Intrinsics.e(this.campaignId, buttonClicked.campaignId) && Intrinsics.e(this.buttonId, buttonClicked.buttonId) && this.timestamp == buttonClicked.timestamp;
    }

    public ButtonClicked(String campaignId, String buttonId, long j10) {
        Intrinsics.j(campaignId, "campaignId");
        Intrinsics.j(buttonId, "buttonId");
        this.campaignId = campaignId;
        this.buttonId = buttonId;
        this.timestamp = j10;
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonId() {
        return this.buttonId;
    }

    /* renamed from: b, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.campaignId.hashCode() * 31) + this.buttonId.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "ButtonClicked(campaignId=" + this.campaignId + ", buttonId=" + this.buttonId + ", timestamp=" + this.timestamp + ")";
    }
}
