package Vl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LVl/g;", "", "", "deeplink", "name", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.g, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class HomeDepartment {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deeplink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeDepartment)) {
            return false;
        }
        HomeDepartment homeDepartment = (HomeDepartment) other;
        return Intrinsics.e(this.deeplink, homeDepartment.deeplink) && Intrinsics.e(this.name, homeDepartment.name) && Intrinsics.e(this.imageUrl, homeDepartment.imageUrl);
    }

    public HomeDepartment(String deeplink, String name, String imageUrl) {
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

    public int hashCode() {
        return (((this.deeplink.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "HomeDepartment(deeplink=" + this.deeplink + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ')';
    }
}
