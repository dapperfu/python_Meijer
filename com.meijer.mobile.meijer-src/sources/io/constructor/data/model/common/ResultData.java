package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0018\b\u0001\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÆ\u0003Jw\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0018\b\u0003\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lio/constructor/data/model/common/ResultData;", "Ljava/io/Serializable;", "description", "", PreferencesHelper.PREF_ID, "url", "imageUrl", "groups", "", "Lio/constructor/data/model/common/ResultGroup;", "facets", "Lio/constructor/data/model/common/ResultFacet;", "metadata", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getDescription", "()Ljava/lang/String;", "getFacets", "()Ljava/util/List;", "getGroups", "getId", "getImageUrl", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResultData implements Serializable {
    private final String description;
    private final List<ResultFacet> facets;
    private final List<ResultGroup> groups;
    private final String id;
    private final String imageUrl;
    private Map<String, ? extends Object> metadata;
    private final String url;

    public static /* synthetic */ ResultData copy$default(ResultData resultData, String str, String str2, String str3, String str4, List list, List list2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resultData.description;
        }
        if ((i10 & 2) != 0) {
            str2 = resultData.id;
        }
        if ((i10 & 4) != 0) {
            str3 = resultData.url;
        }
        if ((i10 & 8) != 0) {
            str4 = resultData.imageUrl;
        }
        if ((i10 & 16) != 0) {
            list = resultData.groups;
        }
        if ((i10 & 32) != 0) {
            list2 = resultData.facets;
        }
        if ((i10 & 64) != 0) {
            map = resultData.metadata;
        }
        List list3 = list2;
        Map map2 = map;
        List list4 = list;
        String str5 = str3;
        return resultData.copy(str, str2, str5, str4, list4, list3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<ResultGroup> component5() {
        return this.groups;
    }

    public final List<ResultFacet> component6() {
        return this.facets;
    }

    public final Map<String, Object> component7() {
        return this.metadata;
    }

    public final ResultData copy(@g(name = "description") String description, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "url") String url, @g(name = "image_url") String imageUrl, @g(name = "groups") List<ResultGroup> groups, @g(name = "facets") List<ResultFacet> facets, @g(name = "metadata") Map<String, ? extends Object> metadata) {
        return new ResultData(description, id2, url, imageUrl, groups, facets, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultData)) {
            return false;
        }
        ResultData resultData = (ResultData) other;
        return Intrinsics.e(this.description, resultData.description) && Intrinsics.e(this.id, resultData.id) && Intrinsics.e(this.url, resultData.url) && Intrinsics.e(this.imageUrl, resultData.imageUrl) && Intrinsics.e(this.groups, resultData.groups) && Intrinsics.e(this.facets, resultData.facets) && Intrinsics.e(this.metadata, resultData.metadata);
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ResultGroup> list = this.groups;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<ResultFacet> list2 = this.facets;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, ? extends Object> map = this.metadata;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ResultData(description=" + this.description + ", id=" + this.id + ", url=" + this.url + ", imageUrl=" + this.imageUrl + ", groups=" + this.groups + ", facets=" + this.facets + ", metadata=" + this.metadata + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<ResultFacet> getFacets() {
        return this.facets;
    }

    public final List<ResultGroup> getGroups() {
        return this.groups;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setMetadata(Map<String, ? extends Object> map) {
        this.metadata = map;
    }

    public ResultData(@g(name = "description") String str, @g(name = PreferencesHelper.PREF_ID) String str2, @g(name = "url") String str3, @g(name = "image_url") String str4, @g(name = "groups") List<ResultGroup> list, @g(name = "facets") List<ResultFacet> list2, @g(name = "metadata") Map<String, ? extends Object> map) {
        this.description = str;
        this.id = str2;
        this.url = str3;
        this.imageUrl = str4;
        this.groups = list;
        this.facets = list2;
        this.metadata = map;
    }
}
