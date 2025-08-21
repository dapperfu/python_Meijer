package Tq;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"LTq/e;", "LTq/k;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "name", "zipCode", "", "milesFrom", "<init>", "(ILjava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "u", "b", "Ljava/lang/String;", "getName", "c", "R", "d", "D", "J2", "()Ljava/lang/Double;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SimpleStoreSummary implements k, Parcelable {
    public static final Parcelable.Creator<SimpleStoreSummary> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double milesFrom;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tq.e$a */
    public static final class a implements Parcelable.Creator<SimpleStoreSummary> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleStoreSummary createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new SimpleStoreSummary(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SimpleStoreSummary[] newArray(int i10) {
            return new SimpleStoreSummary[i10];
        }
    }

    public SimpleStoreSummary(int i10, String str, String str2, double d10) {
        this.storeId = i10;
        this.name = str;
        this.zipCode = str2;
        this.milesFrom = d10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleStoreSummary)) {
            return false;
        }
        SimpleStoreSummary simpleStoreSummary = (SimpleStoreSummary) other;
        return this.storeId == simpleStoreSummary.storeId && Intrinsics.e(this.name, simpleStoreSummary.name) && Intrinsics.e(this.zipCode, simpleStoreSummary.zipCode) && Double.compare(this.milesFrom, simpleStoreSummary.milesFrom) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.storeId);
        dest.writeString(this.name);
        dest.writeString(this.zipCode);
        dest.writeDouble(this.milesFrom);
    }

    @Override // Tq.k
    public Double J2() {
        return Double.valueOf(this.milesFrom);
    }

    @Override // Tq.k
    /* renamed from: R, reason: from getter */
    public String getZipCode() {
        return this.zipCode;
    }

    @Override // Tq.k
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storeId) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zipCode;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.milesFrom);
    }

    public String toString() {
        return "SimpleStoreSummary(storeId=" + this.storeId + ", name=" + this.name + ", zipCode=" + this.zipCode + ", milesFrom=" + this.milesFrom + ')';
    }

    @Override // Tq.h
    /* renamed from: u, reason: from getter */
    public int getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ SimpleStoreSummary(int i10, String str, String str2, double d10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? 0.0d : d10);
    }
}
