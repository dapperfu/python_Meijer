package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/Pagination;", "", "", "currentPage", "pageSize", "totalPages", "totalResults", "<init>", "(IIII)V", "copy", "(IIII)Lcom/meijer/mobile/product/model/search/api/Pagination;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Pagination {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalPages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalResults;

    public Pagination() {
        this(0, 0, 0, 0, 15, null);
    }

    public final Pagination copy(@g(name = "currentPage") int currentPage, @g(name = "pageSize") int pageSize, @g(name = "totalPages") int totalPages, @g(name = "totalResults") int totalResults) {
        return new Pagination(currentPage, pageSize, totalPages, totalResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pagination)) {
            return false;
        }
        Pagination pagination = (Pagination) other;
        return this.currentPage == pagination.currentPage && this.pageSize == pagination.pageSize && this.totalPages == pagination.totalPages && this.totalResults == pagination.totalResults;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.totalResults);
    }

    public String toString() {
        return "Pagination(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalPages=" + this.totalPages + ", totalResults=" + this.totalResults + ')';
    }

    public Pagination(@g(name = "currentPage") int i10, @g(name = "pageSize") int i11, @g(name = "totalPages") int i12, @g(name = "totalResults") int i13) {
        this.currentPage = i10;
        this.pageSize = i11;
        this.totalPages = i12;
        this.totalResults = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: b, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: c, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: d, reason: from getter */
    public final int getTotalResults() {
        return this.totalResults;
    }

    public /* synthetic */ Pagination(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
