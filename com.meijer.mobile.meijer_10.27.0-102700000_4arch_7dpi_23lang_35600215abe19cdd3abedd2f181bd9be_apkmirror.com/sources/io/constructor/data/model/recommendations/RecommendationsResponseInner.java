package io.constructor.data.model.recommendations;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.Result;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/constructor/data/model/recommendations/RecommendationsResponseInner;", "Ljava/io/Serializable;", "pod", "Lio/constructor/data/model/recommendations/Pod;", "results", "", "Lio/constructor/data/model/common/Result;", "resultCount", "", "(Lio/constructor/data/model/recommendations/Pod;Ljava/util/List;I)V", "getPod", "()Lio/constructor/data/model/recommendations/Pod;", "getResultCount", "()I", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RecommendationsResponseInner implements Serializable {
    private final Pod pod;
    private final int resultCount;
    private final List<Result> results;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationsResponseInner copy$default(RecommendationsResponseInner recommendationsResponseInner, Pod pod, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pod = recommendationsResponseInner.pod;
        }
        if ((i11 & 2) != 0) {
            list = recommendationsResponseInner.results;
        }
        if ((i11 & 4) != 0) {
            i10 = recommendationsResponseInner.resultCount;
        }
        return recommendationsResponseInner.copy(pod, list, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final Pod getPod() {
        return this.pod;
    }

    public final List<Result> component2() {
        return this.results;
    }

    /* renamed from: component3, reason: from getter */
    public final int getResultCount() {
        return this.resultCount;
    }

    public final RecommendationsResponseInner copy(@g(name = "pod") Pod pod, @g(name = "results") List<Result> results, @g(name = "total_num_results") int resultCount) {
        return new RecommendationsResponseInner(pod, results, resultCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsResponseInner)) {
            return false;
        }
        RecommendationsResponseInner recommendationsResponseInner = (RecommendationsResponseInner) other;
        return Intrinsics.e(this.pod, recommendationsResponseInner.pod) && Intrinsics.e(this.results, recommendationsResponseInner.results) && this.resultCount == recommendationsResponseInner.resultCount;
    }

    public int hashCode() {
        Pod pod = this.pod;
        int iHashCode = (pod == null ? 0 : pod.hashCode()) * 31;
        List<Result> list = this.results;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.resultCount);
    }

    public String toString() {
        return "RecommendationsResponseInner(pod=" + this.pod + ", results=" + this.results + ", resultCount=" + this.resultCount + ")";
    }

    public final Pod getPod() {
        return this.pod;
    }

    public final int getResultCount() {
        return this.resultCount;
    }

    public final List<Result> getResults() {
        return this.results;
    }

    public RecommendationsResponseInner(@g(name = "pod") Pod pod, @g(name = "results") List<Result> list, @g(name = "total_num_results") int i10) {
        this.pod = pod;
        this.results = list;
        this.resultCount = i10;
    }
}
