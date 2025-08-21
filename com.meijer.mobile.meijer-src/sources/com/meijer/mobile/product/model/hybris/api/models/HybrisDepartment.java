package com.meijer.mobile.product.model.hybris.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\b\u0003\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisDepartment;", "", "", "type", "Lcom/meijer/mobile/product/model/fulldetails/DepartmentCode;", PreferencesHelper.PREF_ID, "name", "url", "", "hide", "collectionId", "", "subcategories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisDepartment;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "g", "e", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisDepartment {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hide;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collectionId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisDepartment> subcategories;

    public HybrisDepartment(@g(name = "type") String str, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "name") String name, @g(name = "url") String url, @g(name = "hide") boolean z10, @g(name = "collectionId") String collectionId, @g(name = "subcategories") List<HybrisDepartment> subcategories) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        Intrinsics.j(url, "url");
        Intrinsics.j(collectionId, "collectionId");
        Intrinsics.j(subcategories, "subcategories");
        this.type = str;
        this.id = id2;
        this.name = name;
        this.url = url;
        this.hide = z10;
        this.collectionId = collectionId;
        this.subcategories = subcategories;
    }

    public final HybrisDepartment copy(@g(name = "type") String type, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "name") String name, @g(name = "url") String url, @g(name = "hide") boolean hide, @g(name = "collectionId") String collectionId, @g(name = "subcategories") List<HybrisDepartment> subcategories) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        Intrinsics.j(url, "url");
        Intrinsics.j(collectionId, "collectionId");
        Intrinsics.j(subcategories, "subcategories");
        return new HybrisDepartment(type, id2, name, url, hide, collectionId, subcategories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisDepartment)) {
            return false;
        }
        HybrisDepartment hybrisDepartment = (HybrisDepartment) other;
        return Intrinsics.e(this.type, hybrisDepartment.type) && Intrinsics.e(this.id, hybrisDepartment.id) && Intrinsics.e(this.name, hybrisDepartment.name) && Intrinsics.e(this.url, hybrisDepartment.url) && this.hide == hybrisDepartment.hide && Intrinsics.e(this.collectionId, hybrisDepartment.collectionId) && Intrinsics.e(this.subcategories, hybrisDepartment.subcategories);
    }

    public int hashCode() {
        String str = this.type;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.hide)) * 31) + this.collectionId.hashCode()) * 31) + this.subcategories.hashCode();
    }

    public String toString() {
        return "HybrisDepartment(type=" + this.type + ", id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", hide=" + this.hide + ", collectionId=" + this.collectionId + ", subcategories=" + this.subcategories + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHide() {
        return this.hide;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<HybrisDepartment> e() {
        return this.subcategories;
    }

    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ HybrisDepartment(String str, String str2, String str3, String str4, boolean z10, String str5, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, str3, str4, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? CollectionsKt.m() : list);
    }
}
