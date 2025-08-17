package Qo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"LQo/c;", "Landroid/os/Parcelable;", "", "count", "", "displayName", "status", "value", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)LQo/c;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Ljava/lang/String;", "d", "getStatus", "e", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class FilterFacetOption implements Parcelable {
    public static final Parcelable.Creator<FilterFacetOption> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qo.c$a */
    public static final class a implements Parcelable.Creator<FilterFacetOption> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterFacetOption createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FilterFacetOption(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FilterFacetOption[] newArray(int i10) {
            return new FilterFacetOption[i10];
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
        if (!(other instanceof FilterFacetOption)) {
            return false;
        }
        FilterFacetOption filterFacetOption = (FilterFacetOption) other;
        return this.count == filterFacetOption.count && Intrinsics.e(this.displayName, filterFacetOption.displayName) && Intrinsics.e(this.status, filterFacetOption.status) && Intrinsics.e(this.value, filterFacetOption.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.count);
        dest.writeString(this.displayName);
        dest.writeString(this.status);
        dest.writeString(this.value);
    }

    public static /* synthetic */ FilterFacetOption b(FilterFacetOption filterFacetOption, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = filterFacetOption.count;
        }
        if ((i11 & 2) != 0) {
            str = filterFacetOption.displayName;
        }
        if ((i11 & 4) != 0) {
            str2 = filterFacetOption.status;
        }
        if ((i11 & 8) != 0) {
            str3 = filterFacetOption.value;
        }
        return filterFacetOption.a(i10, str, str2, str3);
    }

    public final FilterFacetOption a(int count, String displayName, String status, String value) {
        return new FilterFacetOption(count, displayName, status, value);
    }

    /* renamed from: c, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: d, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "FilterFacetOption(count=" + this.count + ", displayName=" + this.displayName + ", status=" + this.status + ", value=" + this.value + ')';
    }

    public FilterFacetOption(int i10, String str, String str2, String str3) {
        this.count = i10;
        this.displayName = str;
        this.status = str2;
        this.value = str3;
    }
}
