package com.radiusnetworks.flybuy.sdk.data.site;

import com.radiusnetworks.flybuy.sdk.data.common.Pagination;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "", "sites", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "pagination", "Lcom/radiusnetworks/flybuy/sdk/data/common/Pagination;", "(Ljava/util/List;Lcom/radiusnetworks/flybuy/sdk/data/common/Pagination;)V", "getPagination", "()Lcom/radiusnetworks/flybuy/sdk/data/common/Pagination;", "getSites", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaginatedSites {
    private final Pagination pagination;
    private final List<Site> sites;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedSites copy$default(PaginatedSites paginatedSites, List list, Pagination pagination, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paginatedSites.sites;
        }
        if ((i10 & 2) != 0) {
            pagination = paginatedSites.pagination;
        }
        return paginatedSites.copy(list, pagination);
    }

    public final List<Site> component1() {
        return this.sites;
    }

    /* renamed from: component2, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final PaginatedSites copy(List<Site> sites, Pagination pagination) {
        Intrinsics.j(sites, "sites");
        Intrinsics.j(pagination, "pagination");
        return new PaginatedSites(sites, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedSites)) {
            return false;
        }
        PaginatedSites paginatedSites = (PaginatedSites) other;
        return Intrinsics.e(this.sites, paginatedSites.sites) && Intrinsics.e(this.pagination, paginatedSites.pagination);
    }

    public int hashCode() {
        return this.pagination.hashCode() + (this.sites.hashCode() * 31);
    }

    public String toString() {
        return "PaginatedSites(sites=" + this.sites + ", pagination=" + this.pagination + ')';
    }

    public PaginatedSites(List<Site> sites, Pagination pagination) {
        Intrinsics.j(sites, "sites");
        Intrinsics.j(pagination, "pagination");
        this.sites = sites;
        this.pagination = pagination;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public final List<Site> getSites() {
        return this.sites;
    }
}
