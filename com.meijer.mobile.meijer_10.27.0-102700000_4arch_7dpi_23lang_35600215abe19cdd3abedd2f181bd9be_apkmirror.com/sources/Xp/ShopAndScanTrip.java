package Xp;

import j$.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001:\u0004*&\"\u001fB[\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b&\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b2\u00107¨\u00068"}, d2 = {"LXp/f;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanTripID;", "tripId", "LXp/f$d;", "userDetails", "LXp/f$c;", "storeDetails", "LXp/f$b;", "cartDetails", "LXp/f$a;", "auditDetails", "", "LXp/c;", "items", "greenvilleBarcode", "j$/time/LocalDateTime", "startTime", "", "isCheckoutInProgress", "<init>", "(Ljava/lang/String;LXp/f$d;LXp/f$c;LXp/f$b;LXp/f$a;Ljava/util/List;Ljava/lang/String;Lj$/time/LocalDateTime;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "LXp/f$d;", "g", "()LXp/f$d;", "c", "LXp/f$c;", "e", "()LXp/f$c;", "d", "LXp/f$b;", "()LXp/f$b;", "LXp/f$a;", "getAuditDetails", "()LXp/f$a;", "Ljava/util/List;", "()Ljava/util/List;", "h", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "i", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xp.f, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanTrip {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tripId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserDetails userDetails;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails storeDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartDetails cartDetails;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuditDetails auditDetails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShopAndScanItem> items;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String greenvilleBarcode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime startTime;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutInProgress;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"LXp/f$a;", "", "", "mmaAppVersion", "osVersion", "phoneModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMmaAppVersion", "b", "getOsVersion", "c", "getPhoneModel", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.f$a, reason: from toString */
    public static final /* data */ class AuditDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mmaAppVersion;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String osVersion;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneModel;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuditDetails)) {
                return false;
            }
            AuditDetails auditDetails = (AuditDetails) other;
            return Intrinsics.e(this.mmaAppVersion, auditDetails.mmaAppVersion) && Intrinsics.e(this.osVersion, auditDetails.osVersion) && Intrinsics.e(this.phoneModel, auditDetails.phoneModel);
        }

        public AuditDetails(String mmaAppVersion, String osVersion, String phoneModel) {
            Intrinsics.j(mmaAppVersion, "mmaAppVersion");
            Intrinsics.j(osVersion, "osVersion");
            Intrinsics.j(phoneModel, "phoneModel");
            this.mmaAppVersion = mmaAppVersion;
            this.osVersion = osVersion;
            this.phoneModel = phoneModel;
        }

        public int hashCode() {
            return (((this.mmaAppVersion.hashCode() * 31) + this.osVersion.hashCode()) * 31) + this.phoneModel.hashCode();
        }

        public String toString() {
            return "AuditDetails(mmaAppVersion=" + this.mmaAppVersion + ", osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"LXp/f$b;", "", "", "wasTotal", "nowTotal", "totalTax", "totalSavings", "totalPriceWithTax", "<init>", "(DDDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "e", "()D", "b", "c", "d", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.f$b, reason: from toString */
    public static final /* data */ class CartDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double wasTotal;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double nowTotal;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalTax;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalSavings;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalPriceWithTax;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartDetails)) {
                return false;
            }
            CartDetails cartDetails = (CartDetails) other;
            return Double.compare(this.wasTotal, cartDetails.wasTotal) == 0 && Double.compare(this.nowTotal, cartDetails.nowTotal) == 0 && Double.compare(this.totalTax, cartDetails.totalTax) == 0 && Double.compare(this.totalSavings, cartDetails.totalSavings) == 0 && Double.compare(this.totalPriceWithTax, cartDetails.totalPriceWithTax) == 0;
        }

        /* renamed from: a, reason: from getter */
        public final double getNowTotal() {
            return this.nowTotal;
        }

        /* renamed from: b, reason: from getter */
        public final double getTotalPriceWithTax() {
            return this.totalPriceWithTax;
        }

        /* renamed from: c, reason: from getter */
        public final double getTotalSavings() {
            return this.totalSavings;
        }

        /* renamed from: d, reason: from getter */
        public final double getTotalTax() {
            return this.totalTax;
        }

        /* renamed from: e, reason: from getter */
        public final double getWasTotal() {
            return this.wasTotal;
        }

        public int hashCode() {
            return (((((((Double.hashCode(this.wasTotal) * 31) + Double.hashCode(this.nowTotal)) * 31) + Double.hashCode(this.totalTax)) * 31) + Double.hashCode(this.totalSavings)) * 31) + Double.hashCode(this.totalPriceWithTax);
        }

        public String toString() {
            return "CartDetails(wasTotal=" + this.wasTotal + ", nowTotal=" + this.nowTotal + ", totalTax=" + this.totalTax + ", totalSavings=" + this.totalSavings + ", totalPriceWithTax=" + this.totalPriceWithTax + ')';
        }

        public CartDetails(double d10, double d11, double d12, double d13, double d14) {
            this.wasTotal = d10;
            this.nowTotal = d11;
            this.totalTax = d12;
            this.totalSavings = d13;
            this.totalPriceWithTax = d14;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LXp/f$c;", "", "", "storeId", "", "storeName", "storeZipCode", "", "isGreenville", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.f$c, reason: from toString */
    public static final /* data */ class StoreDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storeName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storeZipCode;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isGreenville;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreDetails)) {
                return false;
            }
            StoreDetails storeDetails = (StoreDetails) other;
            return this.storeId == storeDetails.storeId && Intrinsics.e(this.storeName, storeDetails.storeName) && Intrinsics.e(this.storeZipCode, storeDetails.storeZipCode) && this.isGreenville == storeDetails.isGreenville;
        }

        public StoreDetails(int i10, String storeName, String storeZipCode, boolean z10) {
            Intrinsics.j(storeName, "storeName");
            Intrinsics.j(storeZipCode, "storeZipCode");
            this.storeId = i10;
            this.storeName = storeName;
            this.storeZipCode = storeZipCode;
            this.isGreenville = z10;
        }

        /* renamed from: a, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: b, reason: from getter */
        public final String getStoreName() {
            return this.storeName;
        }

        /* renamed from: c, reason: from getter */
        public final String getStoreZipCode() {
            return this.storeZipCode;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsGreenville() {
            return this.isGreenville;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.storeId) * 31) + this.storeName.hashCode()) * 31) + this.storeZipCode.hashCode()) * 31) + Boolean.hashCode(this.isGreenville);
        }

        public String toString() {
            return "StoreDetails(storeId=" + this.storeId + ", storeName=" + this.storeName + ", storeZipCode=" + this.storeZipCode + ", isGreenville=" + this.isGreenville + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LXp/f$d;", "", "", "digitalId", "", "mPerksBarcode", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.f$d, reason: from toString */
    public static final /* data */ class UserDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long digitalId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mPerksBarcode;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserDetails)) {
                return false;
            }
            UserDetails userDetails = (UserDetails) other;
            return this.digitalId == userDetails.digitalId && Intrinsics.e(this.mPerksBarcode, userDetails.mPerksBarcode);
        }

        public UserDetails(long j10, String mPerksBarcode) {
            Intrinsics.j(mPerksBarcode, "mPerksBarcode");
            this.digitalId = j10;
            this.mPerksBarcode = mPerksBarcode;
        }

        /* renamed from: a, reason: from getter */
        public final long getDigitalId() {
            return this.digitalId;
        }

        /* renamed from: b, reason: from getter */
        public final String getMPerksBarcode() {
            return this.mPerksBarcode;
        }

        public int hashCode() {
            return (Long.hashCode(this.digitalId) * 31) + this.mPerksBarcode.hashCode();
        }

        public String toString() {
            return "UserDetails(digitalId=" + this.digitalId + ", mPerksBarcode=" + this.mPerksBarcode + ')';
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanTrip)) {
            return false;
        }
        ShopAndScanTrip shopAndScanTrip = (ShopAndScanTrip) other;
        return Intrinsics.e(this.tripId, shopAndScanTrip.tripId) && Intrinsics.e(this.userDetails, shopAndScanTrip.userDetails) && Intrinsics.e(this.storeDetails, shopAndScanTrip.storeDetails) && Intrinsics.e(this.cartDetails, shopAndScanTrip.cartDetails) && Intrinsics.e(this.auditDetails, shopAndScanTrip.auditDetails) && Intrinsics.e(this.items, shopAndScanTrip.items) && Intrinsics.e(this.greenvilleBarcode, shopAndScanTrip.greenvilleBarcode) && Intrinsics.e(this.startTime, shopAndScanTrip.startTime) && this.isCheckoutInProgress == shopAndScanTrip.isCheckoutInProgress;
    }

    public ShopAndScanTrip(String tripId, UserDetails userDetails, StoreDetails storeDetails, CartDetails cartDetails, AuditDetails auditDetails, List<ShopAndScanItem> items, String str, LocalDateTime startTime, boolean z10) {
        Intrinsics.j(tripId, "tripId");
        Intrinsics.j(userDetails, "userDetails");
        Intrinsics.j(storeDetails, "storeDetails");
        Intrinsics.j(cartDetails, "cartDetails");
        Intrinsics.j(auditDetails, "auditDetails");
        Intrinsics.j(items, "items");
        Intrinsics.j(startTime, "startTime");
        this.tripId = tripId;
        this.userDetails = userDetails;
        this.storeDetails = storeDetails;
        this.cartDetails = cartDetails;
        this.auditDetails = auditDetails;
        this.items = items;
        this.greenvilleBarcode = str;
        this.startTime = startTime;
        this.isCheckoutInProgress = z10;
    }

    /* renamed from: a, reason: from getter */
    public final CartDetails getCartDetails() {
        return this.cartDetails;
    }

    /* renamed from: b, reason: from getter */
    public final String getGreenvilleBarcode() {
        return this.greenvilleBarcode;
    }

    public final List<ShopAndScanItem> c() {
        return this.items;
    }

    /* renamed from: d, reason: from getter */
    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    /* renamed from: e, reason: from getter */
    public final StoreDetails getStoreDetails() {
        return this.storeDetails;
    }

    /* renamed from: f, reason: from getter */
    public final String getTripId() {
        return this.tripId;
    }

    /* renamed from: g, reason: from getter */
    public final UserDetails getUserDetails() {
        return this.userDetails;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsCheckoutInProgress() {
        return this.isCheckoutInProgress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.tripId.hashCode() * 31) + this.userDetails.hashCode()) * 31) + this.storeDetails.hashCode()) * 31) + this.cartDetails.hashCode()) * 31) + this.auditDetails.hashCode()) * 31) + this.items.hashCode()) * 31;
        String str = this.greenvilleBarcode;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.startTime.hashCode()) * 31) + Boolean.hashCode(this.isCheckoutInProgress);
    }

    public String toString() {
        return "ShopAndScanTrip(tripId=" + this.tripId + ", userDetails=" + this.userDetails + ", storeDetails=" + this.storeDetails + ", cartDetails=" + this.cartDetails + ", auditDetails=" + this.auditDetails + ", items=" + this.items + ", greenvilleBarcode=" + this.greenvilleBarcode + ", startTime=" + this.startTime + ", isCheckoutInProgress=" + this.isCheckoutInProgress + ')';
    }
}
