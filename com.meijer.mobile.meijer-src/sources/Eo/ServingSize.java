package Eo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"LEo/i;", "Landroid/os/Parcelable;", "", "value", "unitOfMeasure", "", "index", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "getIndex", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eo.i, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ServingSize implements Parcelable {
    public static final Parcelable.Creator<ServingSize> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eo.i$a */
    public static final class a implements Parcelable.Creator<ServingSize> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ServingSize createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ServingSize(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ServingSize[] newArray(int i10) {
            return new ServingSize[i10];
        }
    }

    public ServingSize() {
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
        if (!(other instanceof ServingSize)) {
            return false;
        }
        ServingSize servingSize = (ServingSize) other;
        return Intrinsics.e(this.value, servingSize.value) && Intrinsics.e(this.unitOfMeasure, servingSize.unitOfMeasure) && this.index == servingSize.index;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.value);
        dest.writeString(this.unitOfMeasure);
        dest.writeInt(this.index);
    }

    public ServingSize(String value, String unitOfMeasure, int i10) {
        Intrinsics.j(value, "value");
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        this.value = value;
        this.unitOfMeasure = unitOfMeasure;
        this.index = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + this.unitOfMeasure.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "ServingSize(value=" + this.value + ", unitOfMeasure=" + this.unitOfMeasure + ", index=" + this.index + ')';
    }

    public /* synthetic */ ServingSize(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0 : i10);
    }
}
