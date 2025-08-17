package Kq;

import Co.ProductFullDetails;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.AvailableItemsResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.UnavailableItemsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0018BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u0010¨\u0006#"}, d2 = {"LKq/c;", "", "", "classroomName", "schoolYear", "schoolName", "gradeLevel", "", "LKq/d;", "availableItems", "LKq/e;", "unavailableItems", "updatedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", "h", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kq.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Supplies {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classroomName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolYear;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gradeLevel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TLProduct> availableItems;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<UnavailableItem> unavailableItems;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedTimestamp;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKq/c$a;", "", "<init>", "()V", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;", "LKq/e;", "b", "(Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;)LKq/e;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "response", "LKq/c;", "a", "(Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;)LKq/c;", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kq.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final UnavailableItem b(UnavailableItemsResponse unavailableItemsResponse) {
            return new UnavailableItem(unavailableItemsResponse.getItemName(), unavailableItemsResponse.getQuantityRequested());
        }

        public final Supplies a(SuppliesListResponse response) {
            Intrinsics.j(response, "response");
            String classroomName = response.getClassroomName();
            String schoolYear = response.getSchoolYear();
            String schoolName = response.getSchoolName();
            String gradeLevel = response.getGradeLevel();
            String updatedTimestamp = response.getUpdatedTimestamp();
            List<AvailableItemsResponse> listA = response.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
            for (AvailableItemsResponse availableItemsResponse : listA) {
                arrayList.add(new TLProduct(ProductFullDetails.b(Bo.c.d(availableItemsResponse.getProduct().getData(), 0, null, 3, null), null, availableItemsResponse.getProduct().getProductName(), 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), availableItemsResponse.getQuantityRequested()));
            }
            List<UnavailableItemsResponse> listF = response.f();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listF, 10));
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                arrayList2.add(Supplies.INSTANCE.b((UnavailableItemsResponse) it.next()));
            }
            return new Supplies(classroomName, schoolYear, schoolName, gradeLevel, arrayList, arrayList2, updatedTimestamp);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Supplies)) {
            return false;
        }
        Supplies supplies = (Supplies) other;
        return Intrinsics.e(this.classroomName, supplies.classroomName) && Intrinsics.e(this.schoolYear, supplies.schoolYear) && Intrinsics.e(this.schoolName, supplies.schoolName) && Intrinsics.e(this.gradeLevel, supplies.gradeLevel) && Intrinsics.e(this.availableItems, supplies.availableItems) && Intrinsics.e(this.unavailableItems, supplies.unavailableItems) && Intrinsics.e(this.updatedTimestamp, supplies.updatedTimestamp);
    }

    public Supplies(String classroomName, String schoolYear, String schoolName, String gradeLevel, List<TLProduct> availableItems, List<UnavailableItem> unavailableItems, String updatedTimestamp) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(schoolYear, "schoolYear");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(gradeLevel, "gradeLevel");
        Intrinsics.j(availableItems, "availableItems");
        Intrinsics.j(unavailableItems, "unavailableItems");
        Intrinsics.j(updatedTimestamp, "updatedTimestamp");
        this.classroomName = classroomName;
        this.schoolYear = schoolYear;
        this.schoolName = schoolName;
        this.gradeLevel = gradeLevel;
        this.availableItems = availableItems;
        this.unavailableItems = unavailableItems;
        this.updatedTimestamp = updatedTimestamp;
    }

    public final List<TLProduct> a() {
        return this.availableItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getClassroomName() {
        return this.classroomName;
    }

    /* renamed from: c, reason: from getter */
    public final String getGradeLevel() {
        return this.gradeLevel;
    }

    /* renamed from: d, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: e, reason: from getter */
    public final String getSchoolYear() {
        return this.schoolYear;
    }

    public final List<UnavailableItem> f() {
        return this.unavailableItems;
    }

    /* renamed from: g, reason: from getter */
    public final String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public int hashCode() {
        return (((((((((((this.classroomName.hashCode() * 31) + this.schoolYear.hashCode()) * 31) + this.schoolName.hashCode()) * 31) + this.gradeLevel.hashCode()) * 31) + this.availableItems.hashCode()) * 31) + this.unavailableItems.hashCode()) * 31) + this.updatedTimestamp.hashCode();
    }

    public String toString() {
        return "Supplies(classroomName=" + this.classroomName + ", schoolYear=" + this.schoolYear + ", schoolName=" + this.schoolName + ", gradeLevel=" + this.gradeLevel + ", availableItems=" + this.availableItems + ", unavailableItems=" + this.unavailableItems + ", updatedTimestamp=" + this.updatedTimestamp + ')';
    }
}
