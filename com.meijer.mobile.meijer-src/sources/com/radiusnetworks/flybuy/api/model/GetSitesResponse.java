package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "", "data", "", "Lcom/radiusnetworks/flybuy/api/model/Site;", "pages", "Lcom/radiusnetworks/flybuy/api/model/Pages;", "included", "Lcom/radiusnetworks/flybuy/api/model/SitesIncluded;", "(Ljava/util/List;Lcom/radiusnetworks/flybuy/api/model/Pages;Lcom/radiusnetworks/flybuy/api/model/SitesIncluded;)V", "getData", "()Ljava/util/List;", "getIncluded", "()Lcom/radiusnetworks/flybuy/api/model/SitesIncluded;", "getPages", "()Lcom/radiusnetworks/flybuy/api/model/Pages;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetSitesResponse {
    private final List<Site> data;
    private final SitesIncluded included;
    private final Pages pages;

    public GetSitesResponse(List<Site> list, Pages pages, SitesIncluded sitesIncluded) {
        Intrinsics.j(pages, "pages");
        this.data = list;
        this.pages = pages;
        this.included = sitesIncluded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSitesResponse copy$default(GetSitesResponse getSitesResponse, List list, Pages pages, SitesIncluded sitesIncluded, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getSitesResponse.data;
        }
        if ((i10 & 2) != 0) {
            pages = getSitesResponse.pages;
        }
        if ((i10 & 4) != 0) {
            sitesIncluded = getSitesResponse.included;
        }
        return getSitesResponse.copy(list, pages, sitesIncluded);
    }

    public final List<Site> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final Pages getPages() {
        return this.pages;
    }

    /* renamed from: component3, reason: from getter */
    public final SitesIncluded getIncluded() {
        return this.included;
    }

    public final GetSitesResponse copy(List<Site> data, Pages pages, SitesIncluded included) {
        Intrinsics.j(pages, "pages");
        return new GetSitesResponse(data, pages, included);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSitesResponse)) {
            return false;
        }
        GetSitesResponse getSitesResponse = (GetSitesResponse) other;
        return Intrinsics.e(this.data, getSitesResponse.data) && Intrinsics.e(this.pages, getSitesResponse.pages) && Intrinsics.e(this.included, getSitesResponse.included);
    }

    public int hashCode() {
        List<Site> list = this.data;
        int iHashCode = (this.pages.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
        SitesIncluded sitesIncluded = this.included;
        return iHashCode + (sitesIncluded != null ? sitesIncluded.hashCode() : 0);
    }

    public String toString() {
        return "GetSitesResponse(data=" + this.data + ", pages=" + this.pages + ", included=" + this.included + ')';
    }

    public final List<Site> getData() {
        return this.data;
    }

    public final SitesIncluded getIncluded() {
        return this.included;
    }

    public final Pages getPages() {
        return this.pages;
    }

    public /* synthetic */ GetSitesResponse(List list, Pages pages, SitesIncluded sitesIncluded, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, pages, (i10 & 4) != 0 ? null : sitesIncluded);
    }
}
