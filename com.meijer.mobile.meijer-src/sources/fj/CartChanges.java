package fj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Lfj/e;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lfj/j;", "entryChanges", "totalUnitCount", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lfj/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class CartChanges implements Parcelable {
    public static final Parcelable.Creator<CartChanges> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryChange> entryChanges;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer totalUnitCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.e$a */
    public static final class a implements Parcelable.Creator<CartChanges> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CartChanges createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(EntryChange.CREATOR.createFromParcel(parcel));
            }
            return new CartChanges(numValueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CartChanges[] newArray(int i10) {
            return new CartChanges[i10];
        }
    }

    public CartChanges() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartChanges)) {
            return false;
        }
        CartChanges cartChanges = (CartChanges) other;
        return Intrinsics.e(this.storeId, cartChanges.storeId) && Intrinsics.e(this.entryChanges, cartChanges.entryChanges) && Intrinsics.e(this.totalUnitCount, cartChanges.totalUnitCount);
    }

    public CartChanges(Integer num, List<EntryChange> entryChanges, Integer num2) {
        Intrinsics.j(entryChanges, "entryChanges");
        this.storeId = num;
        this.entryChanges = entryChanges;
        this.totalUnitCount = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartChanges b(CartChanges cartChanges, Integer num, List list, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = cartChanges.storeId;
        }
        if ((i10 & 2) != 0) {
            list = cartChanges.entryChanges;
        }
        if ((i10 & 4) != 0) {
            num2 = cartChanges.totalUnitCount;
        }
        return cartChanges.a(num, list, num2);
    }

    public final CartChanges a(Integer storeId, List<EntryChange> entryChanges, Integer totalUnitCount) {
        Intrinsics.j(entryChanges, "entryChanges");
        return new CartChanges(storeId, entryChanges, totalUnitCount);
    }

    public final List<EntryChange> c() {
        return this.entryChanges;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getTotalUnitCount() {
        return this.totalUnitCount;
    }

    public int hashCode() {
        Integer num = this.storeId;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.entryChanges.hashCode()) * 31;
        Integer num2 = this.totalUnitCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "CartChanges(storeId=" + this.storeId + ", entryChanges=" + this.entryChanges + ", totalUnitCount=" + this.totalUnitCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.storeId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List<EntryChange> list = this.entryChanges;
        dest.writeInt(list.size());
        Iterator<EntryChange> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Integer num2 = this.totalUnitCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ CartChanges(Integer num, List list, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? null : num2);
    }
}
