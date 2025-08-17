package com.meijer.mobile.product.model.constructor;

import android.annotation.SuppressLint;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.FilterFacet;
import io.constructor.data.model.common.FilterGroup;
import io.constructor.data.model.common.Result;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJd\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b!\u0010\u0012¨\u0006$"}, d2 = {"Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "Ljava/io/Serializable;", "", "Lio/constructor/data/model/common/FilterFacet;", "facets", "Lio/constructor/data/model/common/FilterGroup;", "groups", "Lio/constructor/data/model/common/Result;", "results", "", "onClickBeacon", "onViewBeacon", "onLoadBeacon", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "f", "d", "Ljava/lang/String;", "e", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SerializableUsage"})
/* loaded from: classes11.dex */
public final /* data */ class SponsoredProductsResponseInner implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterFacet> facets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterGroup> groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Result> results;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onClickBeacon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onViewBeacon;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onLoadBeacon;

    public SponsoredProductsResponseInner() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final SponsoredProductsResponseInner copy(@g(name = "facets") List<FilterFacet> facets, @g(name = "groups") List<FilterGroup> groups, @g(name = "results") List<Result> results, @g(name = "onClickBeacon") String onClickBeacon, @g(name = "onViewBeacon") String onViewBeacon, @g(name = "onLoadBeacon") String onLoadBeacon) {
        Intrinsics.j(facets, "facets");
        Intrinsics.j(groups, "groups");
        Intrinsics.j(results, "results");
        return new SponsoredProductsResponseInner(facets, groups, results, onClickBeacon, onViewBeacon, onLoadBeacon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SponsoredProductsResponseInner)) {
            return false;
        }
        SponsoredProductsResponseInner sponsoredProductsResponseInner = (SponsoredProductsResponseInner) other;
        return Intrinsics.e(this.facets, sponsoredProductsResponseInner.facets) && Intrinsics.e(this.groups, sponsoredProductsResponseInner.groups) && Intrinsics.e(this.results, sponsoredProductsResponseInner.results) && Intrinsics.e(this.onClickBeacon, sponsoredProductsResponseInner.onClickBeacon) && Intrinsics.e(this.onViewBeacon, sponsoredProductsResponseInner.onViewBeacon) && Intrinsics.e(this.onLoadBeacon, sponsoredProductsResponseInner.onLoadBeacon);
    }

    public int hashCode() {
        int iHashCode = ((((this.facets.hashCode() * 31) + this.groups.hashCode()) * 31) + this.results.hashCode()) * 31;
        String str = this.onClickBeacon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onViewBeacon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onLoadBeacon;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SponsoredProductsResponseInner(facets=" + this.facets + ", groups=" + this.groups + ", results=" + this.results + ", onClickBeacon=" + this.onClickBeacon + ", onViewBeacon=" + this.onViewBeacon + ", onLoadBeacon=" + this.onLoadBeacon + ')';
    }

    public SponsoredProductsResponseInner(@g(name = "facets") List<FilterFacet> facets, @g(name = "groups") List<FilterGroup> groups, @g(name = "results") List<Result> results, @g(name = "onClickBeacon") String str, @g(name = "onViewBeacon") String str2, @g(name = "onLoadBeacon") String str3) {
        Intrinsics.j(facets, "facets");
        Intrinsics.j(groups, "groups");
        Intrinsics.j(results, "results");
        this.facets = facets;
        this.groups = groups;
        this.results = results;
        this.onClickBeacon = str;
        this.onViewBeacon = str2;
        this.onLoadBeacon = str3;
    }

    public final List<FilterFacet> a() {
        return this.facets;
    }

    public final List<FilterGroup> b() {
        return this.groups;
    }

    /* renamed from: c, reason: from getter */
    public final String getOnClickBeacon() {
        return this.onClickBeacon;
    }

    /* renamed from: d, reason: from getter */
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    /* renamed from: e, reason: from getter */
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    public final List<Result> f() {
        return this.results;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SponsoredProductsResponseInner(java.util.List r2, java.util.List r3, java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.m()
        L18:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L1e
            r5 = r0
        L1e:
            r9 = r8 & 16
            if (r9 == 0) goto L23
            r6 = r0
        L23:
            r8 = r8 & 32
            if (r8 == 0) goto L2f
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L36
        L2f:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.product.model.constructor.SponsoredProductsResponseInner.<init>(java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
