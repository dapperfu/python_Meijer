package Km;

import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.Category;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LKm/k;", "", "<init>", "()V", "f", "c", "d", "e", "a", "b", "LKm/k$a;", "LKm/k$b;", "LKm/k$c;", "LKm/k$d;", "LKm/k$e;", "LKm/k$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class k {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LKm/k$a;", "LKm/k;", "Lcom/meijer/mobile/coupons/api/models/Category;", "category", "<init>", "(Lcom/meijer/mobile/coupons/api/models/Category;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/coupons/api/models/Category;", "()Lcom/meijer/mobile/coupons/api/models/Category;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Km.k$a, reason: from toString */
    public static final /* data */ class CategorySelection extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Category category;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CategorySelection) && Intrinsics.e(this.category, ((CategorySelection) other).category);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategorySelection(Category category) {
            super(null);
            Intrinsics.j(category, "category");
            this.category = category;
        }

        /* renamed from: a, reason: from getter */
        public final Category getCategory() {
            return this.category;
        }

        public int hashCode() {
            return this.category.hashCode();
        }

        public String toString() {
            return "CategorySelection(category=" + this.category + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKm/k$b;", "LKm/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17380a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public String toString() {
            return "ClearAllClicked";
        }

        public int hashCode() {
            return 1331840428;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LKm/k$c;", "LKm/k;", "", "selectedSortTypeIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Km.k$c, reason: from toString */
    public static final /* data */ class SelectSortOption extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedSortTypeIndex;

        public SelectSortOption(int i10) {
            super(null);
            this.selectedSortTypeIndex = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectSortOption) && this.selectedSortTypeIndex == ((SelectSortOption) other).selectedSortTypeIndex;
        }

        /* renamed from: a, reason: from getter */
        public final int getSelectedSortTypeIndex() {
            return this.selectedSortTypeIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedSortTypeIndex);
        }

        public String toString() {
            return "SelectSortOption(selectedSortTypeIndex=" + this.selectedSortTypeIndex + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LKm/k$d;", "LKm/k;", "", "checked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Km.k$d, reason: from toString */
    public static final /* data */ class ShowCategoryHeaders extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checked;

        public ShowCategoryHeaders(boolean z10) {
            super(null);
            this.checked = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCategoryHeaders) && this.checked == ((ShowCategoryHeaders) other).checked;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return "ShowCategoryHeaders(checked=" + this.checked + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LKm/k$e;", "LKm/k;", "", "checked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Km.k$e, reason: from toString */
    public static final /* data */ class ShowClippedCoupons extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checked;

        public ShowClippedCoupons(boolean z10) {
            super(null);
            this.checked = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowClippedCoupons) && this.checked == ((ShowClippedCoupons) other).checked;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return "ShowClippedCoupons(checked=" + this.checked + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LKm/k$f;", "LKm/k;", "", "", "sortByOptions", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "sortType", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/coupon/model/search/CouponsSortType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "()Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Km.k$f, reason: from toString */
    public static final /* data */ class ShowSortOptions extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> sortByOptions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponsSortType sortType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSortOptions)) {
                return false;
            }
            ShowSortOptions showSortOptions = (ShowSortOptions) other;
            return Intrinsics.e(this.sortByOptions, showSortOptions.sortByOptions) && this.sortType == showSortOptions.sortType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSortOptions(List<String> sortByOptions, CouponsSortType sortType) {
            super(null);
            Intrinsics.j(sortByOptions, "sortByOptions");
            Intrinsics.j(sortType, "sortType");
            this.sortByOptions = sortByOptions;
            this.sortType = sortType;
        }

        public final List<String> a() {
            return this.sortByOptions;
        }

        /* renamed from: b, reason: from getter */
        public final CouponsSortType getSortType() {
            return this.sortType;
        }

        public int hashCode() {
            return (this.sortByOptions.hashCode() * 31) + this.sortType.hashCode();
        }

        public String toString() {
            return "ShowSortOptions(sortByOptions=" + this.sortByOptions + ", sortType=" + this.sortType + ')';
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
