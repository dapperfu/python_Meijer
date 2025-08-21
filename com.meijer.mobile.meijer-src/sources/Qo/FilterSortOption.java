package Qo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"LQo/g;", "Landroid/os/Parcelable;", "", "displayName", "sortBy", "sortOrder", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LQo/g;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "e", "getStatus", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class FilterSortOption implements Parcelable {
    public static final Parcelable.Creator<FilterSortOption> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sortBy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sortOrder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qo.g$a */
    public static final class a implements Parcelable.Creator<FilterSortOption> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterSortOption createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FilterSortOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FilterSortOption[] newArray(int i10) {
            return new FilterSortOption[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterSortOption)) {
            return false;
        }
        FilterSortOption filterSortOption = (FilterSortOption) other;
        return Intrinsics.e(this.displayName, filterSortOption.displayName) && Intrinsics.e(this.sortBy, filterSortOption.sortBy) && Intrinsics.e(this.sortOrder, filterSortOption.sortOrder) && Intrinsics.e(this.status, filterSortOption.status);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.displayName);
        dest.writeString(this.sortBy);
        dest.writeString(this.sortOrder);
        dest.writeString(this.status);
    }

    public FilterSortOption(String displayName, String sortBy, String sortOrder, String status) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(sortBy, "sortBy");
        Intrinsics.j(sortOrder, "sortOrder");
        Intrinsics.j(status, "status");
        this.displayName = displayName;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.status = status;
    }

    public static /* synthetic */ FilterSortOption b(FilterSortOption filterSortOption, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterSortOption.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = filterSortOption.sortBy;
        }
        if ((i10 & 4) != 0) {
            str3 = filterSortOption.sortOrder;
        }
        if ((i10 & 8) != 0) {
            str4 = filterSortOption.status;
        }
        return filterSortOption.a(str, str2, str3, str4);
    }

    public final FilterSortOption a(String displayName, String sortBy, String sortOrder, String status) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(sortBy, "sortBy");
        Intrinsics.j(sortOrder, "sortOrder");
        Intrinsics.j(status, "status");
        return new FilterSortOption(displayName, sortBy, sortOrder, status);
    }

    /* renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: d, reason: from getter */
    public final String getSortBy() {
        return this.sortBy;
    }

    /* renamed from: e, reason: from getter */
    public final String getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        return (((((this.displayName.hashCode() * 31) + this.sortBy.hashCode()) * 31) + this.sortOrder.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "FilterSortOption(displayName=" + this.displayName + ", sortBy=" + this.sortBy + ", sortOrder=" + this.sortOrder + ", status=" + this.status + ')';
    }
}
