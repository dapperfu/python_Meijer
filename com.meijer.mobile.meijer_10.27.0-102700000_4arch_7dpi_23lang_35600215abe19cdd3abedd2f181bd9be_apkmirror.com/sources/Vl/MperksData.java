package Vl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"LVl/e;", "Landroid/os/Parcelable;", "", "LVl/a;", "availableRewards", "LVl/c;", "clippedRewards", "", "pointBalance", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/util/List;Ljava/util/List;I)LVl/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "I", "e", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.e, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class MperksData implements Parcelable {
    public static final Parcelable.Creator<MperksData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableReward> availableRewards;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HomeMperksClippedReward> clippedRewards;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointBalance;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vl.e$a */
    public static final class a implements Parcelable.Creator<MperksData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MperksData createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(AvailableReward.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(HomeMperksClippedReward.CREATOR.createFromParcel(parcel));
            }
            return new MperksData(arrayList, arrayList2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MperksData[] newArray(int i10) {
            return new MperksData[i10];
        }
    }

    public MperksData() {
        this(null, null, 0, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksData)) {
            return false;
        }
        MperksData mperksData = (MperksData) other;
        return Intrinsics.e(this.availableRewards, mperksData.availableRewards) && Intrinsics.e(this.clippedRewards, mperksData.clippedRewards) && this.pointBalance == mperksData.pointBalance;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        List<AvailableReward> list = this.availableRewards;
        dest.writeInt(list.size());
        Iterator<AvailableReward> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<HomeMperksClippedReward> list2 = this.clippedRewards;
        dest.writeInt(list2.size());
        Iterator<HomeMperksClippedReward> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.pointBalance);
    }

    public MperksData(List<AvailableReward> availableRewards, List<HomeMperksClippedReward> clippedRewards, int i10) {
        Intrinsics.j(availableRewards, "availableRewards");
        Intrinsics.j(clippedRewards, "clippedRewards");
        this.availableRewards = availableRewards;
        this.clippedRewards = clippedRewards;
        this.pointBalance = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksData b(MperksData mperksData, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mperksData.availableRewards;
        }
        if ((i11 & 2) != 0) {
            list2 = mperksData.clippedRewards;
        }
        if ((i11 & 4) != 0) {
            i10 = mperksData.pointBalance;
        }
        return mperksData.a(list, list2, i10);
    }

    public final MperksData a(List<AvailableReward> availableRewards, List<HomeMperksClippedReward> clippedRewards, int pointBalance) {
        Intrinsics.j(availableRewards, "availableRewards");
        Intrinsics.j(clippedRewards, "clippedRewards");
        return new MperksData(availableRewards, clippedRewards, pointBalance);
    }

    public final List<AvailableReward> c() {
        return this.availableRewards;
    }

    public final List<HomeMperksClippedReward> d() {
        return this.clippedRewards;
    }

    /* renamed from: e, reason: from getter */
    public final int getPointBalance() {
        return this.pointBalance;
    }

    public int hashCode() {
        return (((this.availableRewards.hashCode() * 31) + this.clippedRewards.hashCode()) * 31) + Integer.hashCode(this.pointBalance);
    }

    public String toString() {
        return "MperksData(availableRewards=" + this.availableRewards + ", clippedRewards=" + this.clippedRewards + ", pointBalance=" + this.pointBalance + ')';
    }

    public /* synthetic */ MperksData(List list, List list2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? CollectionsKt.m() : list2, (i11 & 4) != 0 ? 0 : i10);
    }
}
