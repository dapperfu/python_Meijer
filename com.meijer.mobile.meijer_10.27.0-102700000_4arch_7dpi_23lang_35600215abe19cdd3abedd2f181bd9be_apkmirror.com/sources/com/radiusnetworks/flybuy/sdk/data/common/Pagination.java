package com.radiusnetworks.flybuy.sdk.data.common;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/common/Pagination;", "", "currentPage", "", "totalPages", "(II)V", "getCurrentPage", "()I", "getTotalPages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Pagination {
    private final int currentPage;
    private final int totalPages;

    public static /* synthetic */ Pagination copy$default(Pagination pagination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = pagination.currentPage;
        }
        if ((i12 & 2) != 0) {
            i11 = pagination.totalPages;
        }
        return pagination.copy(i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public final Pagination copy(int currentPage, int totalPages) {
        return new Pagination(currentPage, totalPages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pagination)) {
            return false;
        }
        Pagination pagination = (Pagination) other;
        return this.currentPage == pagination.currentPage && this.totalPages == pagination.totalPages;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPages) + (Integer.hashCode(this.currentPage) * 31);
    }

    public String toString() {
        return "Pagination(currentPage=" + this.currentPage + ", totalPages=" + this.totalPages + ')';
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public Pagination(int i10, int i11) {
        this.currentPage = i10;
        this.totalPages = i11;
    }
}
