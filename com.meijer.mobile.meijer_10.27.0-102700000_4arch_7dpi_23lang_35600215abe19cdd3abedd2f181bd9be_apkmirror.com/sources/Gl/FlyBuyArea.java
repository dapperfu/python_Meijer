package Gl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"LGl/a;", "Landroid/os/Parcelable;", "", "areaId", "", "areaName", "", "probability", "<init>", "(JLjava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getAreaId", "()J", "b", "Ljava/lang/String;", "getAreaName", "c", "D", "getProbability", "()D", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gl.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FlyBuyArea implements Parcelable {
    public static final Parcelable.Creator<FlyBuyArea> CREATOR = new C0173a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long areaId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String areaName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double probability;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gl.a$a, reason: collision with other inner class name */
    public static final class C0173a implements Parcelable.Creator<FlyBuyArea> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FlyBuyArea createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FlyBuyArea(parcel.readLong(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FlyBuyArea[] newArray(int i10) {
            return new FlyBuyArea[i10];
        }
    }

    public FlyBuyArea() {
        this(0L, null, 0.0d, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyArea)) {
            return false;
        }
        FlyBuyArea flyBuyArea = (FlyBuyArea) other;
        return this.areaId == flyBuyArea.areaId && Intrinsics.e(this.areaName, flyBuyArea.areaName) && Double.compare(this.probability, flyBuyArea.probability) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.areaId);
        dest.writeString(this.areaName);
        dest.writeDouble(this.probability);
    }

    public FlyBuyArea(long j10, String areaName, double d10) {
        Intrinsics.j(areaName, "areaName");
        this.areaId = j10;
        this.areaName = areaName;
        this.probability = d10;
    }

    public int hashCode() {
        return (((Long.hashCode(this.areaId) * 31) + this.areaName.hashCode()) * 31) + Double.hashCode(this.probability);
    }

    public String toString() {
        return "FlyBuyArea(areaId=" + this.areaId + ", areaName=" + this.areaName + ", probability=" + this.probability + ')';
    }

    public /* synthetic */ FlyBuyArea(long j10, String str, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "Pickup Parking" : str, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
