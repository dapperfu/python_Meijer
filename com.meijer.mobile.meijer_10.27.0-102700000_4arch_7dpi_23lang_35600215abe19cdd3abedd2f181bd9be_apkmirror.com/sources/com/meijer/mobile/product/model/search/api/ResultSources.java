package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/ResultSources;", "", "Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "tokenMatch", "embeddingsMatch", "", "totalCount", "<init>", "(Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;I)V", "copy", "(Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;I)Lcom/meijer/mobile/product/model/search/api/ResultSources;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "b", "()Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "c", "I", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ResultSources {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultSourcesData tokenMatch;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultSourcesData embeddingsMatch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalCount;

    public ResultSources(@g(name = "token_match") ResultSourcesData resultSourcesData, @g(name = "embeddings_match") ResultSourcesData resultSourcesData2, int i10) {
        this.tokenMatch = resultSourcesData;
        this.embeddingsMatch = resultSourcesData2;
        this.totalCount = i10;
    }

    public final ResultSources copy(@g(name = "token_match") ResultSourcesData tokenMatch, @g(name = "embeddings_match") ResultSourcesData embeddingsMatch, int totalCount) {
        return new ResultSources(tokenMatch, embeddingsMatch, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultSources)) {
            return false;
        }
        ResultSources resultSources = (ResultSources) other;
        return Intrinsics.e(this.tokenMatch, resultSources.tokenMatch) && Intrinsics.e(this.embeddingsMatch, resultSources.embeddingsMatch) && this.totalCount == resultSources.totalCount;
    }

    public int hashCode() {
        ResultSourcesData resultSourcesData = this.tokenMatch;
        int iHashCode = (resultSourcesData == null ? 0 : resultSourcesData.hashCode()) * 31;
        ResultSourcesData resultSourcesData2 = this.embeddingsMatch;
        return ((iHashCode + (resultSourcesData2 != null ? resultSourcesData2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalCount);
    }

    public String toString() {
        return "ResultSources(tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ", totalCount=" + this.totalCount + ')';
    }

    /* renamed from: a, reason: from getter */
    public final ResultSourcesData getEmbeddingsMatch() {
        return this.embeddingsMatch;
    }

    /* renamed from: b, reason: from getter */
    public final ResultSourcesData getTokenMatch() {
        return this.tokenMatch;
    }

    /* renamed from: c, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public /* synthetic */ ResultSources(ResultSourcesData resultSourcesData, ResultSourcesData resultSourcesData2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultSourcesData, resultSourcesData2, (i11 & 4) != 0 ? 0 : i10);
    }
}
