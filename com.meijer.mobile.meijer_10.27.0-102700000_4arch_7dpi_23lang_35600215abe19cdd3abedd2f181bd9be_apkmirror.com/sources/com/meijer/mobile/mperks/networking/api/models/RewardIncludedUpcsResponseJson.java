package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponseJson;", "", "", "count", "", "continuationToken", "", "", "results", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "copy", "(ILjava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RewardIncludedUpcsResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String continuationToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> results;

    public final RewardIncludedUpcsResponseJson copy(@g(name = "count") int count, @g(name = "continuationToken") String continuationToken, @g(name = "results") List<Long> results) {
        Intrinsics.j(results, "results");
        return new RewardIncludedUpcsResponseJson(count, continuationToken, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardIncludedUpcsResponseJson)) {
            return false;
        }
        RewardIncludedUpcsResponseJson rewardIncludedUpcsResponseJson = (RewardIncludedUpcsResponseJson) other;
        return this.count == rewardIncludedUpcsResponseJson.count && Intrinsics.e(this.continuationToken, rewardIncludedUpcsResponseJson.continuationToken) && Intrinsics.e(this.results, rewardIncludedUpcsResponseJson.results);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.continuationToken;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "RewardIncludedUpcsResponseJson(count=" + this.count + ", continuationToken=" + this.continuationToken + ", results=" + this.results + ')';
    }

    public RewardIncludedUpcsResponseJson(@g(name = "count") int i10, @g(name = "continuationToken") String str, @g(name = "results") List<Long> results) {
        Intrinsics.j(results, "results");
        this.count = i10;
        this.continuationToken = str;
        this.results = results;
    }

    /* renamed from: a, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    /* renamed from: b, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<Long> c() {
        return this.results;
    }
}
