package com.meijer.mobile.home.service.models.departmentcard;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "", "", "title", "seeAllTitle", "seeAllDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DepartmentCardInfoJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllDeeplink;

    public DepartmentCardInfoJson() {
        this(null, null, null, 7, null);
    }

    public final DepartmentCardInfoJson copy(@g(name = "title") String title, @g(name = "seeAllTitle") String seeAllTitle, @g(name = "seeAllDeeplink") String seeAllDeeplink) {
        return new DepartmentCardInfoJson(title, seeAllTitle, seeAllDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentCardInfoJson)) {
            return false;
        }
        DepartmentCardInfoJson departmentCardInfoJson = (DepartmentCardInfoJson) other;
        return Intrinsics.e(this.title, departmentCardInfoJson.title) && Intrinsics.e(this.seeAllTitle, departmentCardInfoJson.seeAllTitle) && Intrinsics.e(this.seeAllDeeplink, departmentCardInfoJson.seeAllDeeplink);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.seeAllTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.seeAllDeeplink;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DepartmentCardInfoJson(title=" + this.title + ", seeAllTitle=" + this.seeAllTitle + ", seeAllDeeplink=" + this.seeAllDeeplink + ')';
    }

    public DepartmentCardInfoJson(@g(name = "title") String str, @g(name = "seeAllTitle") String str2, @g(name = "seeAllDeeplink") String str3) {
        this.title = str;
        this.seeAllTitle = str2;
        this.seeAllDeeplink = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getSeeAllDeeplink() {
        return this.seeAllDeeplink;
    }

    /* renamed from: b, reason: from getter */
    public final String getSeeAllTitle() {
        return this.seeAllTitle;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ DepartmentCardInfoJson(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
