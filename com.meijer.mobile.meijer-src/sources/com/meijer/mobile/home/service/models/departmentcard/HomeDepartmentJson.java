package com.meijer.mobile.home.service.models.departmentcard;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/home/service/models/departmentcard/HomeDepartmentJson;", "", "", "deeplink", "name", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/departmentcard/HomeDepartmentJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HomeDepartmentJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deeplink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    public final HomeDepartmentJson copy(@g(name = "deeplink") String deeplink, @g(name = "name") String name, @g(name = "imageUrl") String imageUrl) {
        Intrinsics.j(deeplink, "deeplink");
        Intrinsics.j(name, "name");
        Intrinsics.j(imageUrl, "imageUrl");
        return new HomeDepartmentJson(deeplink, name, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeDepartmentJson)) {
            return false;
        }
        HomeDepartmentJson homeDepartmentJson = (HomeDepartmentJson) other;
        return Intrinsics.e(this.deeplink, homeDepartmentJson.deeplink) && Intrinsics.e(this.name, homeDepartmentJson.name) && Intrinsics.e(this.imageUrl, homeDepartmentJson.imageUrl);
    }

    public int hashCode() {
        return (((this.deeplink.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "HomeDepartmentJson(deeplink=" + this.deeplink + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ')';
    }

    public HomeDepartmentJson(@g(name = "deeplink") String deeplink, @g(name = "name") String name, @g(name = "imageUrl") String imageUrl) {
        Intrinsics.j(deeplink, "deeplink");
        Intrinsics.j(name, "name");
        Intrinsics.j(imageUrl, "imageUrl");
        this.deeplink = deeplink;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    /* renamed from: a, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
