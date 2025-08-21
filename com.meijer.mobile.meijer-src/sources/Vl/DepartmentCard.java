package Vl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"LVl/c;", "", "", "cardTitle", "seeAllTitle", "seeAllDeepLink", "", "LVl/g;", "departments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.c, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class DepartmentCard {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllDeepLink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HomeDepartment> departments;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentCard)) {
            return false;
        }
        DepartmentCard departmentCard = (DepartmentCard) other;
        return Intrinsics.e(this.cardTitle, departmentCard.cardTitle) && Intrinsics.e(this.seeAllTitle, departmentCard.seeAllTitle) && Intrinsics.e(this.seeAllDeepLink, departmentCard.seeAllDeepLink) && Intrinsics.e(this.departments, departmentCard.departments);
    }

    public DepartmentCard(String cardTitle, String seeAllTitle, String seeAllDeepLink, List<HomeDepartment> departments) {
        Intrinsics.j(cardTitle, "cardTitle");
        Intrinsics.j(seeAllTitle, "seeAllTitle");
        Intrinsics.j(seeAllDeepLink, "seeAllDeepLink");
        Intrinsics.j(departments, "departments");
        this.cardTitle = cardTitle;
        this.seeAllTitle = seeAllTitle;
        this.seeAllDeepLink = seeAllDeepLink;
        this.departments = departments;
    }

    /* renamed from: a, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<HomeDepartment> b() {
        return this.departments;
    }

    /* renamed from: c, reason: from getter */
    public final String getSeeAllDeepLink() {
        return this.seeAllDeepLink;
    }

    /* renamed from: d, reason: from getter */
    public final String getSeeAllTitle() {
        return this.seeAllTitle;
    }

    public int hashCode() {
        return (((((this.cardTitle.hashCode() * 31) + this.seeAllTitle.hashCode()) * 31) + this.seeAllDeepLink.hashCode()) * 31) + this.departments.hashCode();
    }

    public String toString() {
        return "DepartmentCard(cardTitle=" + this.cardTitle + ", seeAllTitle=" + this.seeAllTitle + ", seeAllDeepLink=" + this.seeAllDeepLink + ", departments=" + this.departments + ')';
    }
}
