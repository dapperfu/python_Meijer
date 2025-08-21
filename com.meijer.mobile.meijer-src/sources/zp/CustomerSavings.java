package zp;

import android.os.Parcel;
import android.os.Parcelable;
import com.medallia.digital.mobilesdk.l3;
import j$.time.LocalDateTime;
import j$.time.Year;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-¨\u0006."}, d2 = {"Lzp/a;", "Landroid/os/Parcelable;", "", "spendingTotal", "mPerksTotal", "specialsTotal", "couponsTotal", "teamMemberTotal", "savingsTotal", "", "savingsPercentage", "j$/time/LocalDateTime", "savingsSinceDate", "<init>", "(DDDDDDILj$/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getSpendingTotal", "()D", "b", "c", "f", "d", "e", "g", "I", "h", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CustomerSavings implements Parcelable {
    public static final Parcelable.Creator<CustomerSavings> CREATOR = new C2791a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double spendingTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double mPerksTotal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double specialsTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double couponsTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double teamMemberTotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savingsTotal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int savingsPercentage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime savingsSinceDate;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.a$a, reason: collision with other inner class name */
    public static final class C2791a implements Parcelable.Creator<CustomerSavings> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerSavings createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CustomerSavings(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerSavings[] newArray(int i10) {
            return new CustomerSavings[i10];
        }
    }

    public CustomerSavings() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, l3.f93323c, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSavings)) {
            return false;
        }
        CustomerSavings customerSavings = (CustomerSavings) other;
        return Double.compare(this.spendingTotal, customerSavings.spendingTotal) == 0 && Double.compare(this.mPerksTotal, customerSavings.mPerksTotal) == 0 && Double.compare(this.specialsTotal, customerSavings.specialsTotal) == 0 && Double.compare(this.couponsTotal, customerSavings.couponsTotal) == 0 && Double.compare(this.teamMemberTotal, customerSavings.teamMemberTotal) == 0 && Double.compare(this.savingsTotal, customerSavings.savingsTotal) == 0 && this.savingsPercentage == customerSavings.savingsPercentage && Intrinsics.e(this.savingsSinceDate, customerSavings.savingsSinceDate);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.spendingTotal);
        dest.writeDouble(this.mPerksTotal);
        dest.writeDouble(this.specialsTotal);
        dest.writeDouble(this.couponsTotal);
        dest.writeDouble(this.teamMemberTotal);
        dest.writeDouble(this.savingsTotal);
        dest.writeInt(this.savingsPercentage);
        dest.writeSerializable(this.savingsSinceDate);
    }

    public CustomerSavings(double d10, double d11, double d12, double d13, double d14, double d15, int i10, LocalDateTime savingsSinceDate) {
        Intrinsics.j(savingsSinceDate, "savingsSinceDate");
        this.spendingTotal = d10;
        this.mPerksTotal = d11;
        this.specialsTotal = d12;
        this.couponsTotal = d13;
        this.teamMemberTotal = d14;
        this.savingsTotal = d15;
        this.savingsPercentage = i10;
        this.savingsSinceDate = savingsSinceDate;
    }

    /* renamed from: a, reason: from getter */
    public final double getCouponsTotal() {
        return this.couponsTotal;
    }

    /* renamed from: b, reason: from getter */
    public final double getMPerksTotal() {
        return this.mPerksTotal;
    }

    /* renamed from: c, reason: from getter */
    public final int getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /* renamed from: d, reason: from getter */
    public final LocalDateTime getSavingsSinceDate() {
        return this.savingsSinceDate;
    }

    /* renamed from: e, reason: from getter */
    public final double getSavingsTotal() {
        return this.savingsTotal;
    }

    /* renamed from: f, reason: from getter */
    public final double getSpecialsTotal() {
        return this.specialsTotal;
    }

    /* renamed from: g, reason: from getter */
    public final double getTeamMemberTotal() {
        return this.teamMemberTotal;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.spendingTotal) * 31) + Double.hashCode(this.mPerksTotal)) * 31) + Double.hashCode(this.specialsTotal)) * 31) + Double.hashCode(this.couponsTotal)) * 31) + Double.hashCode(this.teamMemberTotal)) * 31) + Double.hashCode(this.savingsTotal)) * 31) + Integer.hashCode(this.savingsPercentage)) * 31) + this.savingsSinceDate.hashCode();
    }

    public String toString() {
        return "CustomerSavings(spendingTotal=" + this.spendingTotal + ", mPerksTotal=" + this.mPerksTotal + ", specialsTotal=" + this.specialsTotal + ", couponsTotal=" + this.couponsTotal + ", teamMemberTotal=" + this.teamMemberTotal + ", savingsTotal=" + this.savingsTotal + ", savingsPercentage=" + this.savingsPercentage + ", savingsSinceDate=" + this.savingsSinceDate + ')';
    }

    public /* synthetic */ CustomerSavings(double d10, double d11, double d12, double d13, double d14, double d15, int i10, LocalDateTime localDateTime, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d10, (i11 & 2) != 0 ? 0.0d : d11, (i11 & 4) != 0 ? 0.0d : d12, (i11 & 8) != 0 ? 0.0d : d13, (i11 & 16) != 0 ? 0.0d : d14, (i11 & 32) == 0 ? d15 : 0.0d, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? Year.now().atDay(1).atStartOfDay() : localDateTime);
    }
}
