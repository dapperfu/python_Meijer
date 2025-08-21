package com.meijer.mobile.mperks.networking.domain.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "T", "", "count", "", "continuationToken", "", "results", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getCount", "()I", "getContinuationToken", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PaginatedResult<T> {
    private final String continuationToken;
    private final int count;
    private final List<T> results;

    public PaginatedResult() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedResult copy$default(PaginatedResult paginatedResult, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = paginatedResult.count;
        }
        if ((i11 & 2) != 0) {
            str = paginatedResult.continuationToken;
        }
        if ((i11 & 4) != 0) {
            list = paginatedResult.results;
        }
        return paginatedResult.copy(i10, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<T> component3() {
        return this.results;
    }

    public final PaginatedResult<T> copy(int count, String continuationToken, List<? extends T> results) {
        Intrinsics.j(results, "results");
        return new PaginatedResult<>(count, continuationToken, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedResult)) {
            return false;
        }
        PaginatedResult paginatedResult = (PaginatedResult) other;
        return this.count == paginatedResult.count && Intrinsics.e(this.continuationToken, paginatedResult.continuationToken) && Intrinsics.e(this.results, paginatedResult.results);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.continuationToken;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "PaginatedResult(count=" + this.count + ", continuationToken=" + this.continuationToken + ", results=" + this.results + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaginatedResult(int i10, String str, List<? extends T> results) {
        Intrinsics.j(results, "results");
        this.count = i10;
        this.continuationToken = str;
        this.results = results;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<T> getResults() {
        return this.results;
    }

    public /* synthetic */ PaginatedResult(int i10, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? list.size() : i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
