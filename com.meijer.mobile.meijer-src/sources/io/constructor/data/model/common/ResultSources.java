package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lio/constructor/data/model/common/ResultSources;", "Ljava/io/Serializable;", "tokenMatch", "Lio/constructor/data/model/common/ResultSourcesData;", "embeddingsMatch", "(Lio/constructor/data/model/common/ResultSourcesData;Lio/constructor/data/model/common/ResultSourcesData;)V", "getEmbeddingsMatch", "()Lio/constructor/data/model/common/ResultSourcesData;", "getTokenMatch", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResultSources implements Serializable {
    private final ResultSourcesData embeddingsMatch;
    private final ResultSourcesData tokenMatch;

    public static /* synthetic */ ResultSources copy$default(ResultSources resultSources, ResultSourcesData resultSourcesData, ResultSourcesData resultSourcesData2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resultSourcesData = resultSources.tokenMatch;
        }
        if ((i10 & 2) != 0) {
            resultSourcesData2 = resultSources.embeddingsMatch;
        }
        return resultSources.copy(resultSourcesData, resultSourcesData2);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultSourcesData getTokenMatch() {
        return this.tokenMatch;
    }

    /* renamed from: component2, reason: from getter */
    public final ResultSourcesData getEmbeddingsMatch() {
        return this.embeddingsMatch;
    }

    public final ResultSources copy(@g(name = "token_match") ResultSourcesData tokenMatch, @g(name = "embeddings_match") ResultSourcesData embeddingsMatch) {
        return new ResultSources(tokenMatch, embeddingsMatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultSources)) {
            return false;
        }
        ResultSources resultSources = (ResultSources) other;
        return Intrinsics.e(this.tokenMatch, resultSources.tokenMatch) && Intrinsics.e(this.embeddingsMatch, resultSources.embeddingsMatch);
    }

    public int hashCode() {
        ResultSourcesData resultSourcesData = this.tokenMatch;
        int iHashCode = (resultSourcesData == null ? 0 : resultSourcesData.hashCode()) * 31;
        ResultSourcesData resultSourcesData2 = this.embeddingsMatch;
        return iHashCode + (resultSourcesData2 != null ? resultSourcesData2.hashCode() : 0);
    }

    public String toString() {
        return "ResultSources(tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ")";
    }

    public final ResultSourcesData getEmbeddingsMatch() {
        return this.embeddingsMatch;
    }

    public final ResultSourcesData getTokenMatch() {
        return this.tokenMatch;
    }

    public ResultSources(@g(name = "token_match") ResultSourcesData resultSourcesData, @g(name = "embeddings_match") ResultSourcesData resultSourcesData2) {
        this.tokenMatch = resultSourcesData;
        this.embeddingsMatch = resultSourcesData2;
    }
}
