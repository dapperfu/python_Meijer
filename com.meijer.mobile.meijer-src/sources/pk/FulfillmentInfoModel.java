package pk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\n\u0010+¨\u0006,"}, d2 = {"Lpk/c;", "Landroid/os/Parcelable;", "", "unitId", "", "fulfillmentTypeName", "fulfillmentTypeId", "fulfillmentPartnerName", "fulfillmentPartnerId", "", "isEnabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getUnitId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getFulfillmentTypeName", "c", "getFulfillmentTypeId", "d", "getFulfillmentPartnerName", "e", "getFulfillmentPartnerId", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class FulfillmentInfoModel implements Parcelable {
    public static final Parcelable.Creator<FulfillmentInfoModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentTypeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fulfillmentTypeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartnerName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fulfillmentPartnerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isEnabled;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.c$a */
    public static final class a implements Parcelable.Creator<FulfillmentInfoModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FulfillmentInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FulfillmentInfoModel(numValueOf, string, numValueOf2, string2, numValueOf3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FulfillmentInfoModel[] newArray(int i10) {
            return new FulfillmentInfoModel[i10];
        }
    }

    public FulfillmentInfoModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentInfoModel)) {
            return false;
        }
        FulfillmentInfoModel fulfillmentInfoModel = (FulfillmentInfoModel) other;
        return Intrinsics.e(this.unitId, fulfillmentInfoModel.unitId) && Intrinsics.e(this.fulfillmentTypeName, fulfillmentInfoModel.fulfillmentTypeName) && Intrinsics.e(this.fulfillmentTypeId, fulfillmentInfoModel.fulfillmentTypeId) && Intrinsics.e(this.fulfillmentPartnerName, fulfillmentInfoModel.fulfillmentPartnerName) && Intrinsics.e(this.fulfillmentPartnerId, fulfillmentInfoModel.fulfillmentPartnerId) && Intrinsics.e(this.isEnabled, fulfillmentInfoModel.isEnabled);
    }

    public FulfillmentInfoModel(Integer num, String str, Integer num2, String str2, Integer num3, Boolean bool) {
        this.unitId = num;
        this.fulfillmentTypeName = str;
        this.fulfillmentTypeId = num2;
        this.fulfillmentPartnerName = str2;
        this.fulfillmentPartnerId = num3;
        this.isEnabled = bool;
    }

    public int hashCode() {
        Integer num = this.unitId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fulfillmentTypeName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.fulfillmentTypeId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.fulfillmentPartnerName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.fulfillmentPartnerId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "FulfillmentInfoModel(unitId=" + this.unitId + ", fulfillmentTypeName=" + this.fulfillmentTypeName + ", fulfillmentTypeId=" + this.fulfillmentTypeId + ", fulfillmentPartnerName=" + this.fulfillmentPartnerName + ", fulfillmentPartnerId=" + this.fulfillmentPartnerId + ", isEnabled=" + this.isEnabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.unitId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.fulfillmentTypeName);
        Integer num2 = this.fulfillmentTypeId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.fulfillmentPartnerName);
        Integer num3 = this.fulfillmentPartnerId;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ FulfillmentInfoModel(Integer num, String str, Integer num2, String str2, Integer num3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? 0 : num2, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? 0 : num3, (i10 & 32) != 0 ? Boolean.FALSE : bool);
    }
}
