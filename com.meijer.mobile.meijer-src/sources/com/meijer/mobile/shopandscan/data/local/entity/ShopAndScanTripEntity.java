package com.meijer.mobile.shopandscan.data.local.entity;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u0005+$ \u0014(BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b4\u00103¨\u00065"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "", "", "tripId", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;", "user", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;", PlaceTypes.STORE, "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;", "cart", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;", "audit", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "header", "startTime", "", "isGreenville", "isCheckoutInProgress", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;Ljava/lang/String;ZZ)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;", "i", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;", "c", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;", "g", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;", "d", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;", "e", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;", "f", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "Z", "k", "()Z", "j", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanTripEntity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tripId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final User user;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Store store;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cart cart;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Audit audit;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionHeader header;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startTime;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGreenville;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutInProgress;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$a;", "", "", "mmaAppVersion", "osVersion", "phoneModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$a, reason: from toString */
    public static final /* data */ class Audit {

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
            if (!(other instanceof Audit)) {
                return false;
            }
            Audit audit = (Audit) other;
            return Intrinsics.e(this.mmaAppVersion, audit.mmaAppVersion) && Intrinsics.e(this.osVersion, audit.osVersion) && Intrinsics.e(this.phoneModel, audit.phoneModel);
        }

        public int hashCode() {
            return (((this.mmaAppVersion.hashCode() * 31) + this.osVersion.hashCode()) * 31) + this.phoneModel.hashCode();
        }

        public String toString() {
            return "Audit(mmaAppVersion=" + this.mmaAppVersion + ", osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ')';
        }

        public Audit(String mmaAppVersion, String osVersion, String phoneModel) {
            Intrinsics.j(mmaAppVersion, "mmaAppVersion");
            Intrinsics.j(osVersion, "osVersion");
            Intrinsics.j(phoneModel, "phoneModel");
            this.mmaAppVersion = mmaAppVersion;
            this.osVersion = osVersion;
            this.phoneModel = phoneModel;
        }

        /* renamed from: a, reason: from getter */
        public final String getMmaAppVersion() {
            return this.mmaAppVersion;
        }

        /* renamed from: b, reason: from getter */
        public final String getOsVersion() {
            return this.osVersion;
        }

        /* renamed from: c, reason: from getter */
        public final String getPhoneModel() {
            return this.phoneModel;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$b;", "", "", "wasTotal", "nowTotal", "totalTax", "totalSavings", "totalPriceWithTax", "<init>", "(DDDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "e", "()D", "b", "c", "d", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$b, reason: from toString */
    public static final /* data */ class Cart {

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
            if (!(other instanceof Cart)) {
                return false;
            }
            Cart cart = (Cart) other;
            return Double.compare(this.wasTotal, cart.wasTotal) == 0 && Double.compare(this.nowTotal, cart.nowTotal) == 0 && Double.compare(this.totalTax, cart.totalTax) == 0 && Double.compare(this.totalSavings, cart.totalSavings) == 0 && Double.compare(this.totalPriceWithTax, cart.totalPriceWithTax) == 0;
        }

        public int hashCode() {
            return (((((((Double.hashCode(this.wasTotal) * 31) + Double.hashCode(this.nowTotal)) * 31) + Double.hashCode(this.totalTax)) * 31) + Double.hashCode(this.totalSavings)) * 31) + Double.hashCode(this.totalPriceWithTax);
        }

        public String toString() {
            return "Cart(wasTotal=" + this.wasTotal + ", nowTotal=" + this.nowTotal + ", totalTax=" + this.totalTax + ", totalSavings=" + this.totalSavings + ", totalPriceWithTax=" + this.totalPriceWithTax + ')';
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

        public Cart(double d10, double d11, double d12, double d13, double d14) {
            this.wasTotal = d10;
            this.nowTotal = d11;
            this.totalTax = d12;
            this.totalSavings = d13;
            this.totalPriceWithTax = d14;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$c;", "", "", PreferencesHelper.PREF_ID, "", "name", "zip", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$c, reason: from toString */
    public static final /* data */ class Store {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String zip;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Store)) {
                return false;
            }
            Store store = (Store) other;
            return this.id == store.id && Intrinsics.e(this.name, store.name) && Intrinsics.e(this.zip, store.zip);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.zip.hashCode();
        }

        public String toString() {
            return "Store(id=" + this.id + ", name=" + this.name + ", zip=" + this.zip + ')';
        }

        public Store(int i10, String name, String zip) {
            Intrinsics.j(name, "name");
            Intrinsics.j(zip, "zip");
            this.id = i10;
            this.name = name;
            this.zip = zip;
        }

        /* renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: c, reason: from getter */
        public final String getZip() {
            return this.zip;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001\u001cBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b$\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b)\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b*\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u0017¨\u0006-"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "", "", "storeId", "", "transactionDateTime", "transactionDateTimeUTC", "eventTimeStamp", "eventTimeStampUTC", "deviceId", "deviceOS", "deviceAppVersion", "deviceOSVersion", "transactionStatus", "transactionId", "trackingId", "transactionNumber", "terminal", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/lang/String;", "j", "c", "k", "d", "e", "f", "h", "i", "n", "l", "m", "o", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$d, reason: from toString */
    public static final /* data */ class TransactionHeader {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionDateTime;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionDateTimeUTC;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventTimeStamp;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventTimeStampUTC;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceId;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceOS;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceAppVersion;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceOSVersion;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionStatus;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionId;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String trackingId;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int transactionNumber;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int terminal;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d$a;", "", "<init>", "()V", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "", "a", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;)Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$d$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String a(TransactionHeader transactionHeader) {
                Intrinsics.j(transactionHeader, "<this>");
                return "SS" + StringsKt.C0(String.valueOf(transactionHeader.getStoreId()), 5, '0') + transactionHeader.getTransactionId() + transactionHeader.getTerminal();
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionHeader)) {
                return false;
            }
            TransactionHeader transactionHeader = (TransactionHeader) other;
            return this.storeId == transactionHeader.storeId && Intrinsics.e(this.transactionDateTime, transactionHeader.transactionDateTime) && Intrinsics.e(this.transactionDateTimeUTC, transactionHeader.transactionDateTimeUTC) && Intrinsics.e(this.eventTimeStamp, transactionHeader.eventTimeStamp) && Intrinsics.e(this.eventTimeStampUTC, transactionHeader.eventTimeStampUTC) && Intrinsics.e(this.deviceId, transactionHeader.deviceId) && Intrinsics.e(this.deviceOS, transactionHeader.deviceOS) && Intrinsics.e(this.deviceAppVersion, transactionHeader.deviceAppVersion) && Intrinsics.e(this.deviceOSVersion, transactionHeader.deviceOSVersion) && Intrinsics.e(this.transactionStatus, transactionHeader.transactionStatus) && Intrinsics.e(this.transactionId, transactionHeader.transactionId) && Intrinsics.e(this.trackingId, transactionHeader.trackingId) && this.transactionNumber == transactionHeader.transactionNumber && this.terminal == transactionHeader.terminal;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((Integer.hashCode(this.storeId) * 31) + this.transactionDateTime.hashCode()) * 31) + this.transactionDateTimeUTC.hashCode()) * 31) + this.eventTimeStamp.hashCode()) * 31) + this.eventTimeStampUTC.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceOS.hashCode()) * 31) + this.deviceAppVersion.hashCode()) * 31) + this.deviceOSVersion.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + Integer.hashCode(this.transactionNumber)) * 31) + Integer.hashCode(this.terminal);
        }

        public String toString() {
            return "TransactionHeader(storeId=" + this.storeId + ", transactionDateTime=" + this.transactionDateTime + ", transactionDateTimeUTC=" + this.transactionDateTimeUTC + ", eventTimeStamp=" + this.eventTimeStamp + ", eventTimeStampUTC=" + this.eventTimeStampUTC + ", deviceId=" + this.deviceId + ", deviceOS=" + this.deviceOS + ", deviceAppVersion=" + this.deviceAppVersion + ", deviceOSVersion=" + this.deviceOSVersion + ", transactionStatus=" + this.transactionStatus + ", transactionId=" + this.transactionId + ", trackingId=" + this.trackingId + ", transactionNumber=" + this.transactionNumber + ", terminal=" + this.terminal + ')';
        }

        public TransactionHeader(int i10, String transactionDateTime, String transactionDateTimeUTC, String eventTimeStamp, String eventTimeStampUTC, String deviceId, String deviceOS, String deviceAppVersion, String deviceOSVersion, String transactionStatus, String transactionId, String trackingId, int i11, int i12) {
            Intrinsics.j(transactionDateTime, "transactionDateTime");
            Intrinsics.j(transactionDateTimeUTC, "transactionDateTimeUTC");
            Intrinsics.j(eventTimeStamp, "eventTimeStamp");
            Intrinsics.j(eventTimeStampUTC, "eventTimeStampUTC");
            Intrinsics.j(deviceId, "deviceId");
            Intrinsics.j(deviceOS, "deviceOS");
            Intrinsics.j(deviceAppVersion, "deviceAppVersion");
            Intrinsics.j(deviceOSVersion, "deviceOSVersion");
            Intrinsics.j(transactionStatus, "transactionStatus");
            Intrinsics.j(transactionId, "transactionId");
            Intrinsics.j(trackingId, "trackingId");
            this.storeId = i10;
            this.transactionDateTime = transactionDateTime;
            this.transactionDateTimeUTC = transactionDateTimeUTC;
            this.eventTimeStamp = eventTimeStamp;
            this.eventTimeStampUTC = eventTimeStampUTC;
            this.deviceId = deviceId;
            this.deviceOS = deviceOS;
            this.deviceAppVersion = deviceAppVersion;
            this.deviceOSVersion = deviceOSVersion;
            this.transactionStatus = transactionStatus;
            this.transactionId = transactionId;
            this.trackingId = trackingId;
            this.transactionNumber = i11;
            this.terminal = i12;
        }

        /* renamed from: a, reason: from getter */
        public final String getDeviceAppVersion() {
            return this.deviceAppVersion;
        }

        /* renamed from: b, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: c, reason: from getter */
        public final String getDeviceOS() {
            return this.deviceOS;
        }

        /* renamed from: d, reason: from getter */
        public final String getDeviceOSVersion() {
            return this.deviceOSVersion;
        }

        /* renamed from: e, reason: from getter */
        public final String getEventTimeStamp() {
            return this.eventTimeStamp;
        }

        /* renamed from: f, reason: from getter */
        public final String getEventTimeStampUTC() {
            return this.eventTimeStampUTC;
        }

        /* renamed from: g, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: h, reason: from getter */
        public final int getTerminal() {
            return this.terminal;
        }

        /* renamed from: i, reason: from getter */
        public final String getTrackingId() {
            return this.trackingId;
        }

        /* renamed from: j, reason: from getter */
        public final String getTransactionDateTime() {
            return this.transactionDateTime;
        }

        /* renamed from: k, reason: from getter */
        public final String getTransactionDateTimeUTC() {
            return this.transactionDateTimeUTC;
        }

        /* renamed from: l, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: m, reason: from getter */
        public final int getTransactionNumber() {
            return this.transactionNumber;
        }

        /* renamed from: n, reason: from getter */
        public final String getTransactionStatus() {
            return this.transactionStatus;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$e;", "", "", "digitalId", "", "mPerksBarcode", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$e, reason: from toString */
    public static final /* data */ class User {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long digitalId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mPerksBarcode;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return this.digitalId == user.digitalId && Intrinsics.e(this.mPerksBarcode, user.mPerksBarcode);
        }

        public int hashCode() {
            return (Long.hashCode(this.digitalId) * 31) + this.mPerksBarcode.hashCode();
        }

        public String toString() {
            return "User(digitalId=" + this.digitalId + ", mPerksBarcode=" + this.mPerksBarcode + ')';
        }

        public User(long j10, String mPerksBarcode) {
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
    }

    public static /* synthetic */ ShopAndScanTripEntity b(ShopAndScanTripEntity shopAndScanTripEntity, String str, User user, Store store, Cart cart, Audit audit, TransactionHeader transactionHeader, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shopAndScanTripEntity.tripId;
        }
        if ((i10 & 2) != 0) {
            user = shopAndScanTripEntity.user;
        }
        if ((i10 & 4) != 0) {
            store = shopAndScanTripEntity.store;
        }
        if ((i10 & 8) != 0) {
            cart = shopAndScanTripEntity.cart;
        }
        if ((i10 & 16) != 0) {
            audit = shopAndScanTripEntity.audit;
        }
        if ((i10 & 32) != 0) {
            transactionHeader = shopAndScanTripEntity.header;
        }
        if ((i10 & 64) != 0) {
            str2 = shopAndScanTripEntity.startTime;
        }
        if ((i10 & 128) != 0) {
            z10 = shopAndScanTripEntity.isGreenville;
        }
        if ((i10 & 256) != 0) {
            z11 = shopAndScanTripEntity.isCheckoutInProgress;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        TransactionHeader transactionHeader2 = transactionHeader;
        String str3 = str2;
        Audit audit2 = audit;
        Store store2 = store;
        return shopAndScanTripEntity.a(str, user, store2, cart, audit2, transactionHeader2, str3, z12, z13);
    }

    public final ShopAndScanTripEntity a(String tripId, User user, Store store, Cart cart, Audit audit, TransactionHeader header, String startTime, boolean isGreenville, boolean isCheckoutInProgress) {
        Intrinsics.j(tripId, "tripId");
        Intrinsics.j(user, "user");
        Intrinsics.j(store, "store");
        Intrinsics.j(cart, "cart");
        Intrinsics.j(audit, "audit");
        Intrinsics.j(startTime, "startTime");
        return new ShopAndScanTripEntity(tripId, user, store, cart, audit, header, startTime, isGreenville, isCheckoutInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanTripEntity)) {
            return false;
        }
        ShopAndScanTripEntity shopAndScanTripEntity = (ShopAndScanTripEntity) other;
        return Intrinsics.e(this.tripId, shopAndScanTripEntity.tripId) && Intrinsics.e(this.user, shopAndScanTripEntity.user) && Intrinsics.e(this.store, shopAndScanTripEntity.store) && Intrinsics.e(this.cart, shopAndScanTripEntity.cart) && Intrinsics.e(this.audit, shopAndScanTripEntity.audit) && Intrinsics.e(this.header, shopAndScanTripEntity.header) && Intrinsics.e(this.startTime, shopAndScanTripEntity.startTime) && this.isGreenville == shopAndScanTripEntity.isGreenville && this.isCheckoutInProgress == shopAndScanTripEntity.isCheckoutInProgress;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.tripId.hashCode() * 31) + this.user.hashCode()) * 31) + this.store.hashCode()) * 31) + this.cart.hashCode()) * 31) + this.audit.hashCode()) * 31;
        TransactionHeader transactionHeader = this.header;
        return ((((((iHashCode + (transactionHeader == null ? 0 : transactionHeader.hashCode())) * 31) + this.startTime.hashCode()) * 31) + Boolean.hashCode(this.isGreenville)) * 31) + Boolean.hashCode(this.isCheckoutInProgress);
    }

    public String toString() {
        return "ShopAndScanTripEntity(tripId=" + this.tripId + ", user=" + this.user + ", store=" + this.store + ", cart=" + this.cart + ", audit=" + this.audit + ", header=" + this.header + ", startTime=" + this.startTime + ", isGreenville=" + this.isGreenville + ", isCheckoutInProgress=" + this.isCheckoutInProgress + ')';
    }

    public ShopAndScanTripEntity(String tripId, User user, Store store, Cart cart, Audit audit, TransactionHeader transactionHeader, String startTime, boolean z10, boolean z11) {
        Intrinsics.j(tripId, "tripId");
        Intrinsics.j(user, "user");
        Intrinsics.j(store, "store");
        Intrinsics.j(cart, "cart");
        Intrinsics.j(audit, "audit");
        Intrinsics.j(startTime, "startTime");
        this.tripId = tripId;
        this.user = user;
        this.store = store;
        this.cart = cart;
        this.audit = audit;
        this.header = transactionHeader;
        this.startTime = startTime;
        this.isGreenville = z10;
        this.isCheckoutInProgress = z11;
    }

    /* renamed from: c, reason: from getter */
    public final Audit getAudit() {
        return this.audit;
    }

    /* renamed from: d, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    /* renamed from: e, reason: from getter */
    public final TransactionHeader getHeader() {
        return this.header;
    }

    /* renamed from: f, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: g, reason: from getter */
    public final Store getStore() {
        return this.store;
    }

    /* renamed from: h, reason: from getter */
    public final String getTripId() {
        return this.tripId;
    }

    /* renamed from: i, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsCheckoutInProgress() {
        return this.isCheckoutInProgress;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsGreenville() {
        return this.isGreenville;
    }
}
