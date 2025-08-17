package Fq;

import Co.ProductFullDetails;
import Co.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0001&B\u00ad\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J´\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010-\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b5\u0010)\"\u0004\b9\u0010:R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00103\u001a\u0004\b;\u0010%\"\u0004\b<\u0010=R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b>\u0010%R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\b@\u0010)\"\u0004\bA\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010B\u001a\u0004\bF\u0010D\"\u0004\bG\u0010HR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\b?\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010/\u001a\u0004\bP\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bL\u0010Q\u001a\u0004\bI\u0010RR\u0011\u0010T\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u0010DR\u0013\u0010W\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bE\u0010VR\u0011\u0010Y\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bX\u0010DR\u0011\u0010[\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bZ\u0010D¨\u0006]"}, d2 = {"LFq/c;", "Landroid/os/Parcelable;", "", "listItemId", "", "listItemTypeId", "itemDisplayOrder", "", "itemPartNumber", "itemDescription", "quantity", "storeId", "notes", "", "isComplete", "isFavorite", "listingId", "j$/time/LocalDate", "promotionStart", "promotionEnd", "couponId", "LCo/h;", "productDetails", "<init>", "(JIILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ZZLjava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDate;JLCo/h;)V", "item", "w", "(LFq/c;)Z", "E", "(LFq/c;)LFq/c;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JIILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ZZLjava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDate;JLCo/h;)LFq/c;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "f", "()J", "b", "I", "g", "c", "d", "Ljava/lang/String;", "e", "A", "(Ljava/lang/String;)V", "q", "C", "(I)V", "u", "h", "i", "B", "Z", "r", "()Z", "j", "t", "y", "(Z)V", "k", "l", "Lj$/time/LocalDate;", "o", "()Lj$/time/LocalDate;", "m", "n", "H", "LCo/h;", "()LCo/h;", "s", "isCoupon", "Lmk/c;", "()Lmk/c;", "product", "x", "isWeeklyAd", "v", "isProduct", "p", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Fq.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShoppingListItem implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long listItemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int listItemTypeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemDisplayOrder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPartNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String itemDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private int quantity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String notes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isComplete;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isFavorite;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String listingId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate promotionStart;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate promotionEnd;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long couponId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails productDetails;
    public static final Parcelable.Creator<ShoppingListItem> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fq.c$b */
    public static final class b implements Parcelable.Creator<ShoppingListItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShoppingListItem createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string3 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new ShoppingListItem(j10, i10, i11, string, string2, i12, i13, string3, z11, parcel.readInt() == 0 ? z10 : true, parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readLong(), (ProductFullDetails) parcel.readParcelable(ShoppingListItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShoppingListItem[] newArray(int i10) {
            return new ShoppingListItem[i10];
        }
    }

    @JvmOverloads
    public ShoppingListItem() {
        this(0L, 0, 0, null, null, 0, 0, null, false, false, null, null, null, 0L, null, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListItem)) {
            return false;
        }
        ShoppingListItem shoppingListItem = (ShoppingListItem) other;
        return this.listItemId == shoppingListItem.listItemId && this.listItemTypeId == shoppingListItem.listItemTypeId && this.itemDisplayOrder == shoppingListItem.itemDisplayOrder && Intrinsics.e(this.itemPartNumber, shoppingListItem.itemPartNumber) && Intrinsics.e(this.itemDescription, shoppingListItem.itemDescription) && this.quantity == shoppingListItem.quantity && this.storeId == shoppingListItem.storeId && Intrinsics.e(this.notes, shoppingListItem.notes) && this.isComplete == shoppingListItem.isComplete && this.isFavorite == shoppingListItem.isFavorite && Intrinsics.e(this.listingId, shoppingListItem.listingId) && Intrinsics.e(this.promotionStart, shoppingListItem.promotionStart) && Intrinsics.e(this.promotionEnd, shoppingListItem.promotionEnd) && this.couponId == shoppingListItem.couponId && Intrinsics.e(this.productDetails, shoppingListItem.productDetails);
    }

    public final boolean w(ShoppingListItem item) {
        if (item == null) {
            return false;
        }
        long j10 = item.listItemId;
        if (j10 > 0) {
            long j11 = this.listItemId;
            if (j11 > 0) {
                return j10 == j11;
            }
        }
        String str = item.itemDescription;
        return str != null && StringsKt.H(str, this.itemDescription, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.listItemId);
        dest.writeInt(this.listItemTypeId);
        dest.writeInt(this.itemDisplayOrder);
        dest.writeString(this.itemPartNumber);
        dest.writeString(this.itemDescription);
        dest.writeInt(this.quantity);
        dest.writeInt(this.storeId);
        dest.writeString(this.notes);
        dest.writeInt(this.isComplete ? 1 : 0);
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeString(this.listingId);
        dest.writeSerializable(this.promotionStart);
        dest.writeSerializable(this.promotionEnd);
        dest.writeLong(this.couponId);
        dest.writeParcelable(this.productDetails, flags);
    }

    @JvmOverloads
    public ShoppingListItem(long j10, int i10, int i11, String str, String str2, int i12, int i13, String str3, boolean z10, boolean z11, String str4, LocalDate localDate, LocalDate localDate2, long j11, ProductFullDetails productFullDetails) {
        this.listItemId = j10;
        this.listItemTypeId = i10;
        this.itemDisplayOrder = i11;
        this.itemPartNumber = str;
        this.itemDescription = str2;
        this.quantity = i12;
        this.storeId = i13;
        this.notes = str3;
        this.isComplete = z10;
        this.isFavorite = z11;
        this.listingId = str4;
        this.promotionStart = localDate;
        this.promotionEnd = localDate2;
        this.couponId = j11;
        this.productDetails = productFullDetails;
    }

    public final void A(String str) {
        this.itemDescription = str;
    }

    public final void B(String str) {
        this.notes = str;
    }

    public final void C(int i10) {
        this.quantity = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Fq.ShoppingListItem E(Fq.ShoppingListItem r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            if (r1 == 0) goto L59
            long r2 = r1.listItemId
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
        Le:
            r7 = r2
            goto L13
        L10:
            long r2 = r0.listItemId
            goto Le
        L13:
            java.lang.String r12 = r1.itemDescription
            int r13 = r1.quantity
            boolean r2 = r1.isFavorite
            java.lang.String r15 = r1.notes
            boolean r3 = r1.isComplete
            java.lang.String r11 = r1.itemPartNumber
            long r9 = r1.couponId
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 <= 0) goto L28
        L25:
            r21 = r9
            goto L2b
        L28:
            long r9 = r0.couponId
            goto L25
        L2b:
            java.lang.String r4 = r1.listingId
            if (r4 == 0) goto L3d
            boolean r5 = kotlin.text.StringsKt.r0(r4)
            if (r5 != 0) goto L36
            goto L37
        L36:
            r4 = 0
        L37:
            if (r4 != 0) goto L3a
            goto L3d
        L3a:
            r18 = r4
            goto L40
        L3d:
            java.lang.String r4 = r0.listingId
            goto L3a
        L40:
            j$.time.LocalDate r1 = r1.promotionEnd
            Fq.c r6 = new Fq.c
            r24 = 18502(0x4846, float:2.5927E-41)
            r25 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            r19 = 0
            r23 = 0
            r20 = r1
            r17 = r2
            r16 = r3
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25)
            return r6
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fq.ShoppingListItem.E(Fq.c):Fq.c");
    }

    /* renamed from: H, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    public final ShoppingListItem a(long listItemId, int listItemTypeId, int itemDisplayOrder, String itemPartNumber, String itemDescription, int quantity, int storeId, String notes, boolean isComplete, boolean isFavorite, String listingId, LocalDate promotionStart, LocalDate promotionEnd, long couponId, ProductFullDetails productDetails) {
        return new ShoppingListItem(listItemId, listItemTypeId, itemDisplayOrder, itemPartNumber, itemDescription, quantity, storeId, notes, isComplete, isFavorite, listingId, promotionStart, promotionEnd, couponId, productDetails);
    }

    /* renamed from: c, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    /* renamed from: d, reason: from getter */
    public final int getItemDisplayOrder() {
        return this.itemDisplayOrder;
    }

    /* renamed from: e, reason: from getter */
    public final String getItemPartNumber() {
        return this.itemPartNumber;
    }

    /* renamed from: f, reason: from getter */
    public final long getListItemId() {
        return this.listItemId;
    }

    /* renamed from: g, reason: from getter */
    public final int getListItemTypeId() {
        return this.listItemTypeId;
    }

    /* renamed from: h, reason: from getter */
    public final String getListingId() {
        return this.listingId;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.listItemId) * 31) + Integer.hashCode(this.listItemTypeId)) * 31) + Integer.hashCode(this.itemDisplayOrder)) * 31;
        String str = this.itemPartNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDescription;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str3 = this.notes;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isComplete)) * 31) + Boolean.hashCode(this.isFavorite)) * 31;
        String str4 = this.listingId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate = this.promotionStart;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.promotionEnd;
        int iHashCode7 = (((iHashCode6 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31) + Long.hashCode(this.couponId)) * 31;
        ProductFullDetails productFullDetails = this.productDetails;
        return iHashCode7 + (productFullDetails != null ? productFullDetails.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final mk.c j() {
        String str = this.itemPartNumber;
        if (str == null || StringsKt.r0(str)) {
            return null;
        }
        String str2 = this.itemPartNumber;
        String str3 = this.itemDescription;
        Intrinsics.g(str3);
        return l.d(str2, str3);
    }

    /* renamed from: k, reason: from getter */
    public final ProductFullDetails getProductDetails() {
        return this.productDetails;
    }

    /* renamed from: n, reason: from getter */
    public final LocalDate getPromotionEnd() {
        return this.promotionEnd;
    }

    /* renamed from: o, reason: from getter */
    public final LocalDate getPromotionStart() {
        return this.promotionStart;
    }

    /* renamed from: q, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final boolean s() {
        return this.couponId > 0;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        return "ShoppingListItem(listItemId=" + this.listItemId + ", listItemTypeId=" + this.listItemTypeId + ", itemDisplayOrder=" + this.itemDisplayOrder + ", itemPartNumber=" + this.itemPartNumber + ", itemDescription=" + this.itemDescription + ", quantity=" + this.quantity + ", storeId=" + this.storeId + ", notes=" + this.notes + ", isComplete=" + this.isComplete + ", isFavorite=" + this.isFavorite + ", listingId=" + this.listingId + ", promotionStart=" + this.promotionStart + ", promotionEnd=" + this.promotionEnd + ", couponId=" + this.couponId + ", productDetails=" + this.productDetails + ')';
    }

    /* renamed from: u, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public final boolean v() {
        String str = this.itemPartNumber;
        return !(str == null || StringsKt.r0(str));
    }

    public final boolean x() {
        String str = this.listingId;
        return !(str == null || StringsKt.r0(str));
    }

    public final void y(boolean z10) {
        this.isFavorite = z10;
    }

    public /* synthetic */ ShoppingListItem(long j10, int i10, int i11, String str, String str2, int i12, int i13, String str3, boolean z10, boolean z11, String str4, LocalDate localDate, LocalDate localDate2, long j11, ProductFullDetails productFullDetails, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j10, (i14 & 2) != 0 ? 0 : i10, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? 1 : i12, (i14 & 64) != 0 ? 0 : i13, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? false : z10, (i14 & 512) == 0 ? z11 : false, (i14 & 1024) != 0 ? null : str4, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? null : localDate, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : localDate2, (i14 & 8192) != 0 ? 0L : j11, (i14 & 16384) != 0 ? null : productFullDetails);
    }
}
