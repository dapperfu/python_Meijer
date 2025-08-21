package fj;

import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B§\u0001\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J²\u0001\u0010'\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b1\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b6\u00109R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b;\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b?\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bC\u0010BR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\b<\u0010BR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bE\u0010BR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010*R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b:\u0010JR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bD\u0010*R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\bK\u0010MR\u0014\u0010\u001c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00109¨\u0006O"}, d2 = {"Lfj/i;", "Lnk/i;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "LCo/h;", "product", "", "avgPoundsEach", "actualQuantity", "requestedQuantity", "", "substitutionNotes", "substituteItem", "Lnk/b;", "basePrice", "depositPrice", "pricePerUnit", "totalPrice", "unit", "Lfj/a;", "allDiscountDetails", "substitutionStatus", "", "isDoNotSubstitute", "<init>", "(ILCo/h;DDDLjava/lang/String;LCo/h;Lnk/b;Lnk/b;Lnk/b;Lnk/b;Ljava/lang/String;Lfj/a;Ljava/lang/String;Z)V", "quantity", "o", "(D)Lfj/i;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(ILCo/h;DDDLjava/lang/String;LCo/h;Lnk/b;Lnk/b;Lnk/b;Lnk/b;Ljava/lang/String;Lfj/a;Ljava/lang/String;Z)Lfj/i;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "LCo/h;", "g", "()LCo/h;", "c", "D", "getAvgPoundsEach", "()D", "d", "getRequestedQuantity", "f", "Ljava/lang/String;", "i", "h", "Lnk/b;", "getBasePrice", "()Lnk/b;", "getDepositPrice", "j", "k", "l", "p", "m", "Lfj/a;", "()Lfj/a;", "n", "Z", "()Z", "getQuantity", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class Entry implements nk.i, Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double avgPoundsEach;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double requestedQuantity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionNotes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails substituteItem;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b basePrice;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b depositPrice;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b pricePerUnit;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b totalPrice;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final AllDiscountDetails allDiscountDetails;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionStatus;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDoNotSubstitute;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.i$a */
    public static final class a implements Parcelable.Creator<Entry> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Entry createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Entry(parcel.readInt(), (ProductFullDetails) parcel.readParcelable(Entry.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), (ProductFullDetails) parcel.readParcelable(Entry.class.getClassLoader()), (nk.b) parcel.readParcelable(Entry.class.getClassLoader()), (nk.b) parcel.readParcelable(Entry.class.getClassLoader()), (nk.b) parcel.readParcelable(Entry.class.getClassLoader()), (nk.b) parcel.readParcelable(Entry.class.getClassLoader()), parcel.readString(), AllDiscountDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Entry[] newArray(int i10) {
            return new Entry[i10];
        }
    }

    public Entry(int i10, ProductFullDetails product, double d10, double d11, double d12, String str, ProductFullDetails productFullDetails, nk.b bVar, nk.b depositPrice, nk.b pricePerUnit, nk.b totalPrice, String unit, AllDiscountDetails allDiscountDetails, String str2, boolean z10) {
        Intrinsics.j(product, "product");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pricePerUnit, "pricePerUnit");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(unit, "unit");
        Intrinsics.j(allDiscountDetails, "allDiscountDetails");
        this.entryNumber = i10;
        this.product = product;
        this.avgPoundsEach = d10;
        this.actualQuantity = d11;
        this.requestedQuantity = d12;
        this.substitutionNotes = str;
        this.substituteItem = productFullDetails;
        this.basePrice = bVar;
        this.depositPrice = depositPrice;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
        this.unit = unit;
        this.allDiscountDetails = allDiscountDetails;
        this.substitutionStatus = str2;
        this.isDoNotSubstitute = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) other;
        return this.entryNumber == entry.entryNumber && Intrinsics.e(this.product, entry.product) && Double.compare(this.avgPoundsEach, entry.avgPoundsEach) == 0 && Double.compare(this.actualQuantity, entry.actualQuantity) == 0 && Double.compare(this.requestedQuantity, entry.requestedQuantity) == 0 && Intrinsics.e(this.substitutionNotes, entry.substitutionNotes) && Intrinsics.e(this.substituteItem, entry.substituteItem) && Intrinsics.e(this.basePrice, entry.basePrice) && Intrinsics.e(this.depositPrice, entry.depositPrice) && Intrinsics.e(this.pricePerUnit, entry.pricePerUnit) && Intrinsics.e(this.totalPrice, entry.totalPrice) && Intrinsics.e(this.unit, entry.unit) && Intrinsics.e(this.allDiscountDetails, entry.allDiscountDetails) && Intrinsics.e(this.substitutionStatus, entry.substitutionStatus) && this.isDoNotSubstitute == entry.isDoNotSubstitute;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeParcelable(this.product, flags);
        dest.writeDouble(this.avgPoundsEach);
        dest.writeDouble(this.actualQuantity);
        dest.writeDouble(this.requestedQuantity);
        dest.writeString(this.substitutionNotes);
        dest.writeParcelable(this.substituteItem, flags);
        dest.writeParcelable(this.basePrice, flags);
        dest.writeParcelable(this.depositPrice, flags);
        dest.writeParcelable(this.pricePerUnit, flags);
        dest.writeParcelable(this.totalPrice, flags);
        dest.writeString(this.unit);
        this.allDiscountDetails.writeToParcel(dest, flags);
        dest.writeString(this.substitutionStatus);
        dest.writeInt(this.isDoNotSubstitute ? 1 : 0);
    }

    public static /* synthetic */ Entry b(Entry entry, int i10, ProductFullDetails productFullDetails, double d10, double d11, double d12, String str, ProductFullDetails productFullDetails2, nk.b bVar, nk.b bVar2, nk.b bVar3, nk.b bVar4, String str2, AllDiscountDetails c14005a, String str3, boolean z10, int i11, Object obj) {
        return entry.a((i11 & 1) != 0 ? entry.entryNumber : i10, (i11 & 2) != 0 ? entry.product : productFullDetails, (i11 & 4) != 0 ? entry.avgPoundsEach : d10, (i11 & 8) != 0 ? entry.actualQuantity : d11, (i11 & 16) != 0 ? entry.requestedQuantity : d12, (i11 & 32) != 0 ? entry.substitutionNotes : str, (i11 & 64) != 0 ? entry.substituteItem : productFullDetails2, (i11 & 128) != 0 ? entry.basePrice : bVar, (i11 & 256) != 0 ? entry.depositPrice : bVar2, (i11 & 512) != 0 ? entry.pricePerUnit : bVar3, (i11 & 1024) != 0 ? entry.totalPrice : bVar4, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? entry.unit : str2, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? entry.allDiscountDetails : c14005a, (i11 & 8192) != 0 ? entry.substitutionStatus : str3, (i11 & 16384) != 0 ? entry.isDoNotSubstitute : z10);
    }

    public final Entry a(int entryNumber, ProductFullDetails product, double avgPoundsEach, double actualQuantity, double requestedQuantity, String substitutionNotes, ProductFullDetails substituteItem, nk.b basePrice, nk.b depositPrice, nk.b pricePerUnit, nk.b totalPrice, String unit, AllDiscountDetails allDiscountDetails, String substitutionStatus, boolean isDoNotSubstitute) {
        Intrinsics.j(product, "product");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pricePerUnit, "pricePerUnit");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(unit, "unit");
        Intrinsics.j(allDiscountDetails, "allDiscountDetails");
        return new Entry(entryNumber, product, avgPoundsEach, actualQuantity, requestedQuantity, substitutionNotes, substituteItem, basePrice, depositPrice, pricePerUnit, totalPrice, unit, allDiscountDetails, substitutionStatus, isDoNotSubstitute);
    }

    /* renamed from: c, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: d, reason: from getter */
    public final AllDiscountDetails getAllDiscountDetails() {
        return this.allDiscountDetails;
    }

    /* renamed from: e, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: f, reason: from getter */
    public final nk.b getPricePerUnit() {
        return this.pricePerUnit;
    }

    @Override // nk.i
    /* renamed from: g, reason: from getter and merged with bridge method [inline-methods] */
    public ProductFullDetails getProduct() {
        return this.product;
    }

    @Override // nk.i
    public double getQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: h, reason: from getter */
    public final ProductFullDetails getSubstituteItem() {
        return this.substituteItem;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.entryNumber) * 31) + this.product.hashCode()) * 31) + Double.hashCode(this.avgPoundsEach)) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Double.hashCode(this.requestedQuantity)) * 31;
        String str = this.substitutionNotes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProductFullDetails productFullDetails = this.substituteItem;
        int iHashCode3 = (iHashCode2 + (productFullDetails == null ? 0 : productFullDetails.hashCode())) * 31;
        nk.b bVar = this.basePrice;
        int iHashCode4 = (((((((((((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.depositPrice.hashCode()) * 31) + this.pricePerUnit.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.allDiscountDetails.hashCode()) * 31;
        String str2 = this.substitutionStatus;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDoNotSubstitute);
    }

    /* renamed from: i, reason: from getter */
    public final String getSubstitutionNotes() {
        return this.substitutionNotes;
    }

    /* renamed from: j, reason: from getter */
    public final String getSubstitutionStatus() {
        return this.substitutionStatus;
    }

    /* renamed from: k, reason: from getter */
    public final nk.b getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsDoNotSubstitute() {
        return this.isDoNotSubstitute;
    }

    @Override // nk.i
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Entry z2(double quantity) {
        return b(this, 0, null, 0.0d, quantity, 0.0d, null, null, null, null, null, null, null, null, null, false, 32759, null);
    }

    /* renamed from: p, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public String toString() {
        return "Entry(entryNumber=" + this.entryNumber + ", product=" + this.product + ", avgPoundsEach=" + this.avgPoundsEach + ", actualQuantity=" + this.actualQuantity + ", requestedQuantity=" + this.requestedQuantity + ", substitutionNotes=" + this.substitutionNotes + ", substituteItem=" + this.substituteItem + ", basePrice=" + this.basePrice + ", depositPrice=" + this.depositPrice + ", pricePerUnit=" + this.pricePerUnit + ", totalPrice=" + this.totalPrice + ", unit=" + this.unit + ", allDiscountDetails=" + this.allDiscountDetails + ", substitutionStatus=" + this.substitutionStatus + ", isDoNotSubstitute=" + this.isDoNotSubstitute + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Entry(int i10, ProductFullDetails productFullDetails, double d10, double d11, double d12, String str, ProductFullDetails productFullDetails2, nk.b bVar, nk.b bVar2, nk.b bVar3, nk.b bVar4, String str2, AllDiscountDetails c14005a, String str3, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        AllDiscountDetails c14005a2;
        int i12 = (i11 & 1) != 0 ? -1 : i10;
        double d13 = (i11 & 4) != 0 ? 0.0d : d10;
        double d14 = (i11 & 8) != 0 ? 0.0d : d11;
        double d15 = (i11 & 16) != 0 ? d14 : d12;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        String str4 = (i11 & 32) != 0 ? null : str;
        ProductFullDetails productFullDetails3 = (i11 & 64) != 0 ? null : productFullDetails2;
        nk.b bVarD = (i11 & 128) != 0 ? productFullDetails.D() : bVar;
        nk.b bVarF = (i11 & 256) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar2;
        nk.b bVarF2 = (i11 & 512) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar3;
        nk.b bVarF3 = (i11 & 1024) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar4;
        String str5 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str2;
        if ((i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            c14005a2 = new AllDiscountDetails(list, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            c14005a2 = c14005a;
        }
        this(i12, productFullDetails, d13, d14, d15, str4, productFullDetails3, bVarD, bVarF, bVarF2, bVarF3, str5, c14005a2, (i11 & 8192) != 0 ? null : str3, (i11 & 16384) != 0 ? false : z10);
    }
}
