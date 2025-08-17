package Eo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"LEo/a;", "Landroid/os/Parcelable;", "", "name", "value", "unitOfMeasure", "dailyPercentageValue", "", "index", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "c", "d", "e", "I", "getIndex", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eo.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Nutrient implements Parcelable {
    public static final Parcelable.Creator<Nutrient> CREATOR = new C0131a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dailyPercentageValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eo.a$a, reason: collision with other inner class name */
    public static final class C0131a implements Parcelable.Creator<Nutrient> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Nutrient createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Nutrient(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Nutrient[] newArray(int i10) {
            return new Nutrient[i10];
        }
    }

    public Nutrient() {
        this(null, null, null, null, 0, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Nutrient)) {
            return false;
        }
        Nutrient nutrient = (Nutrient) other;
        return Intrinsics.e(this.name, nutrient.name) && Intrinsics.e(this.value, nutrient.value) && Intrinsics.e(this.unitOfMeasure, nutrient.unitOfMeasure) && Intrinsics.e(this.dailyPercentageValue, nutrient.dailyPercentageValue) && this.index == nutrient.index;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeString(this.unitOfMeasure);
        dest.writeString(this.dailyPercentageValue);
        dest.writeInt(this.index);
    }

    public Nutrient(String name, String str, String str2, String str3, int i10) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.value = str;
        this.unitOfMeasure = str2;
        this.dailyPercentageValue = str3;
        this.index = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getDailyPercentageValue() {
        return this.dailyPercentageValue;
    }

    /* renamed from: b, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unitOfMeasure;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dailyPercentageValue;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "Nutrient(name=" + this.name + ", value=" + this.value + ", unitOfMeasure=" + this.unitOfMeasure + ", dailyPercentageValue=" + this.dailyPercentageValue + ", index=" + this.index + ')';
    }

    public /* synthetic */ Nutrient(String str, String str2, String str3, String str4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? 0 : i10);
    }
}
