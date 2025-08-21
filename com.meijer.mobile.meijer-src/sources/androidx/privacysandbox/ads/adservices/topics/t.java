package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/t;", "", "", "taxonomyVersion", "modelVersion", "", "topicId", "<init>", "(JJI)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "J", "b", "()J", "c", "I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long TaxonomyVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ModelVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int TopicCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return this.TaxonomyVersion == tVar.TaxonomyVersion && this.ModelVersion == tVar.ModelVersion && this.TopicCode == tVar.TopicCode;
    }

    /* renamed from: a, reason: from getter */
    public final long getModelVersion() {
        return this.ModelVersion;
    }

    /* renamed from: b, reason: from getter */
    public final long getTaxonomyVersion() {
        return this.TaxonomyVersion;
    }

    /* renamed from: c, reason: from getter */
    public final int getTopicCode() {
        return this.TopicCode;
    }

    public int hashCode() {
        return (((Long.hashCode(this.TaxonomyVersion) * 31) + Long.hashCode(this.ModelVersion)) * 31) + Integer.hashCode(this.TopicCode);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.TaxonomyVersion + ", ModelVersion=" + this.ModelVersion + ", TopicCode=" + this.TopicCode + " }");
    }

    public t(long j10, long j11, int i10) {
        this.TaxonomyVersion = j10;
        this.ModelVersion = j11;
        this.TopicCode = i10;
    }
}
