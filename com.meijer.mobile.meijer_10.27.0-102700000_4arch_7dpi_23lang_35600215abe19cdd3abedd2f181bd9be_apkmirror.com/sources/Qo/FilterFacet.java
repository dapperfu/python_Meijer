package Qo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"LQo/a;", "Landroid/os/Parcelable;", "", "name", "displayName", "", "min", "max", "", "LQo/c;", "options", "type", "", "hidden", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "c", "Ljava/lang/Double;", "getMin", "()Ljava/lang/Double;", "d", "getMax", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "getType", "g", "Ljava/lang/Boolean;", "getHidden", "()Ljava/lang/Boolean;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class FilterFacet implements Parcelable {
    public static final Parcelable.Creator<FilterFacet> CREATOR = new C0702a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double min;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double max;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterFacetOption> options;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hidden;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qo.a$a, reason: collision with other inner class name */
    public static final class C0702a implements Parcelable.Creator<FilterFacet> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterFacet createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(FilterFacetOption.CREATOR.createFromParcel(parcel));
                }
            }
            return new FilterFacet(string, string2, dValueOf, dValueOf2, arrayList, parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FilterFacet[] newArray(int i10) {
            return new FilterFacet[i10];
        }
    }

    public FilterFacet(String name, String str, Double d10, Double d11, List<FilterFacetOption> list, String str2, Boolean bool) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.displayName = str;
        this.min = d10;
        this.max = d11;
        this.options = list;
        this.type = str2;
        this.hidden = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterFacet)) {
            return false;
        }
        FilterFacet filterFacet = (FilterFacet) other;
        return Intrinsics.e(this.name, filterFacet.name) && Intrinsics.e(this.displayName, filterFacet.displayName) && Intrinsics.e(this.min, filterFacet.min) && Intrinsics.e(this.max, filterFacet.max) && Intrinsics.e(this.options, filterFacet.options) && Intrinsics.e(this.type, filterFacet.type) && Intrinsics.e(this.hidden, filterFacet.hidden);
    }

    /* renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<FilterFacetOption> b() {
        return this.options;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.min;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.max;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<FilterFacetOption> list = this.options;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hidden;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "FilterFacet(name=" + this.name + ", displayName=" + this.displayName + ", min=" + this.min + ", max=" + this.max + ", options=" + this.options + ", type=" + this.type + ", hidden=" + this.hidden + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.displayName);
        Double d10 = this.min;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.max;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        List<FilterFacetOption> list = this.options;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FilterFacetOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.type);
        Boolean bool = this.hidden;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ FilterFacet(String str, String str2, Double d10, Double d11, List list, String str3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : d11, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : bool);
    }
}
