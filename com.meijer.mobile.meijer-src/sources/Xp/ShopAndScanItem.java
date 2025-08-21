package Xp;

import com.meijer.mobile.shopandscan.data.model.error.ShopAndScanItemException;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b8\b\u0081\b\u0018\u00002\u00020\u0001:\u0007=.92315B½\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010(R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010(R\u001f\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b.\u0010?R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\b1\u0010AR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010HR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b5\u0010KR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b;\u0010L\u001a\u0004\bI\u0010MR\u001f\u0010\u001b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b=\u0010(R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bC\u0010N\u001a\u0004\b3\u0010OR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bF\u0010RR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b9\u0010UR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bP\u0010XR\u0017\u0010$\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bY\u0010W\u001a\u0004\bS\u0010X¨\u0006Z"}, d2 = {"LXp/c;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanTripID;", "tripId", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "localId", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemRemoteID;", "remoteId", "LXp/c$g;", "timestamp", "LXp/c$f;", "state", "LXp/c$a;", "action", "LXp/a;", "barcode", "title", "", "quantity", "LXp/c$c;", "price", "LXp/c$b;", "deposit", "LXp/c$d;", "savings", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanImageURL;", "imageUrl", "LXp/b;", "coupon", "LXp/c$e;", "restriction", "Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "exception", "", "isAddedToCart", "isQuantityUpdateAllowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LXp/c$g;LXp/c$f;LXp/c$a;LXp/a;Ljava/lang/String;ILXp/c$c;LXp/c$b;LXp/c$d;Ljava/lang/String;LXp/b;LXp/c$e;Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTripId", "b", "g", "c", "getRemoteId", "d", "LXp/c$g;", "m", "()LXp/c$g;", "e", "LXp/c$f;", "l", "()LXp/c$f;", "f", "LXp/c$a;", "()LXp/c$a;", "LXp/a;", "()LXp/a;", "h", "n", "i", "I", "j", "LXp/c$c;", "()LXp/c$c;", "k", "LXp/c$b;", "()LXp/c$b;", "LXp/c$d;", "()LXp/c$d;", "LXp/b;", "()LXp/b;", "o", "LXp/c$e;", "()LXp/c$e;", "p", "Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "()Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "q", "Z", "()Z", "r", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xp.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tripId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String localId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String remoteId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Timestamp timestamp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final f state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final a action;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Xp.a barcode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Price price;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Deposit deposit;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings savings;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanCoupon coupon;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanItemRestriction restriction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanItemException exception;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedToCart;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isQuantityUpdateAllowed;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LXp/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42407a = new a("ADD", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f42408b = new a("REMOVE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f42409c = new a("UPDATE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f42410d = new a("IDLE", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f42411e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42412f;

        static {
            a[] aVarArrA = a();
            f42411e = aVarArrA;
            f42412f = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f42407a, f42408b, f42409c, f42410d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f42411e.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LXp/c$b;", "", "", "unitDeposit", "totalDeposit", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "getUnitDeposit", "()Ljava/lang/Double;", "b", "getTotalDeposit", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$b, reason: from toString */
    public static final /* data */ class Deposit {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double unitDeposit;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double totalDeposit;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deposit)) {
                return false;
            }
            Deposit deposit = (Deposit) other;
            return Intrinsics.e(this.unitDeposit, deposit.unitDeposit) && Intrinsics.e(this.totalDeposit, deposit.totalDeposit);
        }

        public int hashCode() {
            Double d10 = this.unitDeposit;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.totalDeposit;
            return iHashCode + (d11 != null ? d11.hashCode() : 0);
        }

        public String toString() {
            return "Deposit(unitDeposit=" + this.unitDeposit + ", totalDeposit=" + this.totalDeposit + ')';
        }

        public Deposit(Double d10, Double d11) {
            this.unitDeposit = d10;
            this.totalDeposit = d11;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"LXp/c$c;", "", "", "wasPrice", "nowPrice", "netPrice", "netPriceWithDeposit", "", "pricingText", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "b", "c", "d", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class Price {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double wasPrice;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double nowPrice;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double netPrice;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double netPriceWithDeposit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pricingText;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.e(this.wasPrice, price.wasPrice) && Intrinsics.e(this.nowPrice, price.nowPrice) && Intrinsics.e(this.netPrice, price.netPrice) && Intrinsics.e(this.netPriceWithDeposit, price.netPriceWithDeposit) && Intrinsics.e(this.pricingText, price.pricingText);
        }

        /* renamed from: a, reason: from getter */
        public final Double getNetPrice() {
            return this.netPrice;
        }

        /* renamed from: b, reason: from getter */
        public final Double getNetPriceWithDeposit() {
            return this.netPriceWithDeposit;
        }

        /* renamed from: c, reason: from getter */
        public final Double getNowPrice() {
            return this.nowPrice;
        }

        /* renamed from: d, reason: from getter */
        public final String getPricingText() {
            return this.pricingText;
        }

        /* renamed from: e, reason: from getter */
        public final Double getWasPrice() {
            return this.wasPrice;
        }

        public int hashCode() {
            Double d10 = this.wasPrice;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.nowPrice;
            int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.netPrice;
            int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.netPriceWithDeposit;
            int iHashCode4 = (iHashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.pricingText;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Price(wasPrice=" + this.wasPrice + ", nowPrice=" + this.nowPrice + ", netPrice=" + this.netPrice + ", netPriceWithDeposit=" + this.netPriceWithDeposit + ", pricingText=" + this.pricingText + ')';
        }

        public Price(Double d10, Double d11, Double d12, Double d13, String str) {
            this.wasPrice = d10;
            this.nowPrice = d11;
            this.netPrice = d12;
            this.netPriceWithDeposit = d13;
            this.pricingText = str;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"LXp/c$d;", "", "", "unitSavings", "totalSavings", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "getUnitSavings", "()Ljava/lang/Double;", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$d, reason: from toString */
    public static final /* data */ class Savings {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double unitSavings;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double totalSavings;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) other;
            return Intrinsics.e(this.unitSavings, savings.unitSavings) && Intrinsics.e(this.totalSavings, savings.totalSavings);
        }

        /* renamed from: a, reason: from getter */
        public final Double getTotalSavings() {
            return this.totalSavings;
        }

        public int hashCode() {
            Double d10 = this.unitSavings;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.totalSavings;
            return iHashCode + (d11 != null ? d11.hashCode() : 0);
        }

        public String toString() {
            return "Savings(unitSavings=" + this.unitSavings + ", totalSavings=" + this.totalSavings + ')';
        }

        public Savings(Double d10, Double d11) {
            this.unitSavings = d10;
            this.totalSavings = d11;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LXp/c$e;", "", "", "title", "message", "", "isDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$e, reason: from toString */
    public static final /* data */ class ShopAndScanItemRestriction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDismissed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShopAndScanItemRestriction)) {
                return false;
            }
            ShopAndScanItemRestriction shopAndScanItemRestriction = (ShopAndScanItemRestriction) other;
            return Intrinsics.e(this.title, shopAndScanItemRestriction.title) && Intrinsics.e(this.message, shopAndScanItemRestriction.message) && this.isDismissed == shopAndScanItemRestriction.isDismissed;
        }

        public ShopAndScanItemRestriction(String title, String message, boolean z10) {
            Intrinsics.j(title, "title");
            Intrinsics.j(message, "message");
            this.title = title;
            this.message = message;
            this.isDismissed = z10;
        }

        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsDismissed() {
            return this.isDismissed;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.isDismissed);
        }

        public String toString() {
            return "ShopAndScanItemRestriction(title=" + this.title + ", message=" + this.message + ", isDismissed=" + this.isDismissed + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LXp/c$f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42425a = new f("SYNCING", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final f f42426b = new f("SYNCED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final f f42427c = new f("ERROR", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ f[] f42428d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42429e;

        static {
            f[] fVarArrA = a();
            f42428d = fVarArrA;
            f42429e = EnumEntriesKt.a(fVarArrA);
        }

        private static final /* synthetic */ f[] a() {
            return new f[]{f42425a, f42426b, f42427c};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f42428d.clone();
        }

        private f(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LXp/c$g;", "", "j$/time/LocalDateTime", "timeAdded", "timeUpdated", "<init>", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.c$g, reason: from toString */
    public static final /* data */ class Timestamp {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDateTime timeAdded;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDateTime timeUpdated;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timestamp)) {
                return false;
            }
            Timestamp timestamp = (Timestamp) other;
            return Intrinsics.e(this.timeAdded, timestamp.timeAdded) && Intrinsics.e(this.timeUpdated, timestamp.timeUpdated);
        }

        public Timestamp(LocalDateTime timeAdded, LocalDateTime timeUpdated) {
            Intrinsics.j(timeAdded, "timeAdded");
            Intrinsics.j(timeUpdated, "timeUpdated");
            this.timeAdded = timeAdded;
            this.timeUpdated = timeUpdated;
        }

        /* renamed from: a, reason: from getter */
        public final LocalDateTime getTimeAdded() {
            return this.timeAdded;
        }

        /* renamed from: b, reason: from getter */
        public final LocalDateTime getTimeUpdated() {
            return this.timeUpdated;
        }

        public int hashCode() {
            return (this.timeAdded.hashCode() * 31) + this.timeUpdated.hashCode();
        }

        public String toString() {
            return "Timestamp(timeAdded=" + this.timeAdded + ", timeUpdated=" + this.timeUpdated + ')';
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanItem)) {
            return false;
        }
        ShopAndScanItem shopAndScanItem = (ShopAndScanItem) other;
        return Intrinsics.e(this.tripId, shopAndScanItem.tripId) && Intrinsics.e(this.localId, shopAndScanItem.localId) && Intrinsics.e(this.remoteId, shopAndScanItem.remoteId) && Intrinsics.e(this.timestamp, shopAndScanItem.timestamp) && this.state == shopAndScanItem.state && this.action == shopAndScanItem.action && Intrinsics.e(this.barcode, shopAndScanItem.barcode) && Intrinsics.e(this.title, shopAndScanItem.title) && this.quantity == shopAndScanItem.quantity && Intrinsics.e(this.price, shopAndScanItem.price) && Intrinsics.e(this.deposit, shopAndScanItem.deposit) && Intrinsics.e(this.savings, shopAndScanItem.savings) && Intrinsics.e(this.imageUrl, shopAndScanItem.imageUrl) && Intrinsics.e(this.coupon, shopAndScanItem.coupon) && Intrinsics.e(this.restriction, shopAndScanItem.restriction) && Intrinsics.e(this.exception, shopAndScanItem.exception) && this.isAddedToCart == shopAndScanItem.isAddedToCart && this.isQuantityUpdateAllowed == shopAndScanItem.isQuantityUpdateAllowed;
    }

    public ShopAndScanItem(String tripId, String localId, String str, Timestamp timestamp, f state, a action, Xp.a barcode, String title, int i10, Price price, Deposit deposit, Savings savings, String str2, ShopAndScanCoupon shopAndScanCoupon, ShopAndScanItemRestriction shopAndScanItemRestriction, ShopAndScanItemException shopAndScanItemException, boolean z10, boolean z11) {
        Intrinsics.j(tripId, "tripId");
        Intrinsics.j(localId, "localId");
        Intrinsics.j(timestamp, "timestamp");
        Intrinsics.j(state, "state");
        Intrinsics.j(action, "action");
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(title, "title");
        this.tripId = tripId;
        this.localId = localId;
        this.remoteId = str;
        this.timestamp = timestamp;
        this.state = state;
        this.action = action;
        this.barcode = barcode;
        this.title = title;
        this.quantity = i10;
        this.price = price;
        this.deposit = deposit;
        this.savings = savings;
        this.imageUrl = str2;
        this.coupon = shopAndScanCoupon;
        this.restriction = shopAndScanItemRestriction;
        this.exception = shopAndScanItemException;
        this.isAddedToCart = z10;
        this.isQuantityUpdateAllowed = z11;
    }

    /* renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final Xp.a getBarcode() {
        return this.barcode;
    }

    /* renamed from: c, reason: from getter */
    public final ShopAndScanCoupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: d, reason: from getter */
    public final Deposit getDeposit() {
        return this.deposit;
    }

    /* renamed from: e, reason: from getter */
    public final ShopAndScanItemException getException() {
        return this.exception;
    }

    /* renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    /* renamed from: h, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    public int hashCode() {
        int iHashCode = ((this.tripId.hashCode() * 31) + this.localId.hashCode()) * 31;
        String str = this.remoteId;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.timestamp.hashCode()) * 31) + this.state.hashCode()) * 31) + this.action.hashCode()) * 31) + this.barcode.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31;
        Price price = this.price;
        int iHashCode3 = (iHashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        Deposit deposit = this.deposit;
        int iHashCode4 = (iHashCode3 + (deposit == null ? 0 : deposit.hashCode())) * 31;
        Savings savings = this.savings;
        int iHashCode5 = (iHashCode4 + (savings == null ? 0 : savings.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShopAndScanCoupon shopAndScanCoupon = this.coupon;
        int iHashCode7 = (iHashCode6 + (shopAndScanCoupon == null ? 0 : shopAndScanCoupon.hashCode())) * 31;
        ShopAndScanItemRestriction shopAndScanItemRestriction = this.restriction;
        int iHashCode8 = (iHashCode7 + (shopAndScanItemRestriction == null ? 0 : shopAndScanItemRestriction.hashCode())) * 31;
        ShopAndScanItemException shopAndScanItemException = this.exception;
        return ((((iHashCode8 + (shopAndScanItemException != null ? shopAndScanItemException.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAddedToCart)) * 31) + Boolean.hashCode(this.isQuantityUpdateAllowed);
    }

    /* renamed from: i, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: j, reason: from getter */
    public final ShopAndScanItemRestriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: k, reason: from getter */
    public final Savings getSavings() {
        return this.savings;
    }

    /* renamed from: l, reason: from getter */
    public final f getState() {
        return this.state;
    }

    /* renamed from: m, reason: from getter */
    public final Timestamp getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsAddedToCart() {
        return this.isAddedToCart;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsQuantityUpdateAllowed() {
        return this.isQuantityUpdateAllowed;
    }

    public String toString() {
        return "ShopAndScanItem(tripId=" + this.tripId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", timestamp=" + this.timestamp + ", state=" + this.state + ", action=" + this.action + ", barcode=" + this.barcode + ", title=" + this.title + ", quantity=" + this.quantity + ", price=" + this.price + ", deposit=" + this.deposit + ", savings=" + this.savings + ", imageUrl=" + this.imageUrl + ", coupon=" + this.coupon + ", restriction=" + this.restriction + ", exception=" + this.exception + ", isAddedToCart=" + this.isAddedToCart + ", isQuantityUpdateAllowed=" + this.isQuantityUpdateAllowed + ')';
    }
}
