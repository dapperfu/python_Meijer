package fj;

import Fo.Savings;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lfj/a;", "Landroid/os/Parcelable;", "", "Lfj/A;", "discounts", "LFo/c;", "totalSavings", "<init>", "(Ljava/util/List;LFo/c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LFo/c;", "()LFo/c;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AllDiscountDetails implements Parcelable {
    public static final Parcelable.Creator<AllDiscountDetails> CREATOR = new C2089a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromoDiscount> discounts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings totalSavings;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.a$a, reason: collision with other inner class name */
    public static final class C2089a implements Parcelable.Creator<AllDiscountDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AllDiscountDetails createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(PromoDiscount.CREATOR.createFromParcel(parcel));
            }
            return new AllDiscountDetails(arrayList, (Savings) parcel.readParcelable(AllDiscountDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AllDiscountDetails[] newArray(int i10) {
            return new AllDiscountDetails[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllDiscountDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDiscountDetails)) {
            return false;
        }
        AllDiscountDetails allDiscountDetails = (AllDiscountDetails) other;
        return Intrinsics.e(this.discounts, allDiscountDetails.discounts) && Intrinsics.e(this.totalSavings, allDiscountDetails.totalSavings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        List<PromoDiscount> list = this.discounts;
        dest.writeInt(list.size());
        Iterator<PromoDiscount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.totalSavings, flags);
    }

    public AllDiscountDetails(List<PromoDiscount> discounts, Savings totalSavings) {
        Intrinsics.j(discounts, "discounts");
        Intrinsics.j(totalSavings, "totalSavings");
        this.discounts = discounts;
        this.totalSavings = totalSavings;
    }

    public final List<PromoDiscount> a() {
        return this.discounts;
    }

    /* renamed from: b, reason: from getter */
    public final Savings getTotalSavings() {
        return this.totalSavings;
    }

    public int hashCode() {
        return (this.discounts.hashCode() * 31) + this.totalSavings.hashCode();
    }

    public String toString() {
        return "AllDiscountDetails(discounts=" + this.discounts + ", totalSavings=" + this.totalSavings + ')';
    }

    public /* synthetic */ AllDiscountDetails(List list, Savings savings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new Savings(null, 0.0d, 3, null) : savings);
    }
}
