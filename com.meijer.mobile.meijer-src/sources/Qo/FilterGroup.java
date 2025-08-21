package Qo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b$\u0010\u0015R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b%\u0010\u001e¨\u0006&"}, d2 = {"LQo/e;", "Landroid/os/Parcelable;", "", "children", "", "count", "", "displayName", "groupId", "parents", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "d", "e", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class FilterGroup implements Parcelable {
    public static final Parcelable.Creator<FilterGroup> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterGroup> children;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer count;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterGroup> parents;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qo.e$a */
    public static final class a implements Parcelable.Creator<FilterGroup> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterGroup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList3.add(FilterGroup.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(FilterGroup.CREATOR.createFromParcel(parcel));
                }
            }
            return new FilterGroup(arrayList, numValueOf, string, string2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FilterGroup[] newArray(int i10) {
            return new FilterGroup[i10];
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
        if (!(other instanceof FilterGroup)) {
            return false;
        }
        FilterGroup filterGroup = (FilterGroup) other;
        return Intrinsics.e(this.children, filterGroup.children) && Intrinsics.e(this.count, filterGroup.count) && Intrinsics.e(this.displayName, filterGroup.displayName) && Intrinsics.e(this.groupId, filterGroup.groupId) && Intrinsics.e(this.parents, filterGroup.parents);
    }

    public FilterGroup(List<FilterGroup> list, Integer num, String displayName, String groupId, List<FilterGroup> list2) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(groupId, "groupId");
        this.children = list;
        this.count = num;
        this.displayName = displayName;
        this.groupId = groupId;
        this.parents = list2;
    }

    public final List<FilterGroup> a() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: d, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    public final List<FilterGroup> e() {
        return this.parents;
    }

    public int hashCode() {
        List<FilterGroup> list = this.children;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.displayName.hashCode()) * 31) + this.groupId.hashCode()) * 31;
        List<FilterGroup> list2 = this.parents;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FilterGroup(children=" + this.children + ", count=" + this.count + ", displayName=" + this.displayName + ", groupId=" + this.groupId + ", parents=" + this.parents + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        List<FilterGroup> list = this.children;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FilterGroup> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.displayName);
        dest.writeString(this.groupId);
        List<FilterGroup> list2 = this.parents;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<FilterGroup> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }
}
