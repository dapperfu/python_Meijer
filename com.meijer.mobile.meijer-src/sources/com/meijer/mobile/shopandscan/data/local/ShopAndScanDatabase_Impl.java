package com.meijer.mobile.shopandscan.data.local;

import A4.b;
import Tp.f;
import Tp.g;
import Tp.p;
import androidx.room.C6273q;
import androidx.room.K;
import com.meijer.mobile.shopandscan.data.local.ShopAndScanDatabase_Impl;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import u4.AbstractC17349b;
import u4.InterfaceC17348a;
import w4.C17824b;
import w4.C17841s;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase_Impl;", "Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase;", "<init>", "()V", "Landroidx/room/K;", "n", "()Landroidx/room/K;", "Landroidx/room/q;", "createInvalidationTracker", "()Landroidx/room/q;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lu4/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lu4/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "LTp/g;", "h", "()LTp/g;", "LTp/a;", "g", "()LTp/a;", "Lkotlin/Lazy;", "c", "Lkotlin/Lazy;", "_shopAndScanTripDAO", "d", "_shopAndScanItemDAO", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShopAndScanDatabase_Impl extends ShopAndScanDatabase {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<g> _shopAndScanTripDAO = LazyKt.b(new Function0() { // from class: Sp.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShopAndScanDatabase_Impl.l(this.f35746a);
        }
    });

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Tp.a> _shopAndScanItemDAO = LazyKt.b(new Function0() { // from class: Sp.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShopAndScanDatabase_Impl.k(this.f35747a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase_Impl$a", "Landroidx/room/K;", "LA4/b;", "connection", "", "a", "(LA4/b;)V", "b", "f", "g", "i", "h", "Landroidx/room/K$a;", "j", "(LA4/b;)Landroidx/room/K$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends K {
        @Override // androidx.room.K
        public void f(b connection) {
            Intrinsics.j(connection, "connection");
        }

        @Override // androidx.room.K
        public void h(b connection) {
            Intrinsics.j(connection, "connection");
        }

        a() {
            super(3, "364c62616d86d005e396a49e190fc392", "9f82ef133afc474a200a5728fafd52a9");
        }

        @Override // androidx.room.K
        public void a(b connection) {
            Intrinsics.j(connection, "connection");
            A4.a.a(connection, "CREATE TABLE IF NOT EXISTS `Trip` (`tripId` TEXT NOT NULL, `startTime` TEXT NOT NULL, `isGreenville` INTEGER NOT NULL, `isCheckoutInProgress` INTEGER NOT NULL, `digitalId` INTEGER NOT NULL, `mPerksBarcode` TEXT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `zip` TEXT NOT NULL, `wasTotal` REAL NOT NULL, `nowTotal` REAL NOT NULL, `totalTax` REAL NOT NULL, `totalSavings` REAL NOT NULL, `totalPriceWithTax` REAL NOT NULL, `mmaAppVersion` TEXT NOT NULL, `osVersion` TEXT NOT NULL, `phoneModel` TEXT NOT NULL, `storeId` INTEGER, `transactionDateTime` TEXT, `transactionDateTimeUTC` TEXT, `eventTimeStamp` TEXT, `eventTimeStampUTC` TEXT, `deviceId` TEXT, `deviceOS` TEXT, `deviceAppVersion` TEXT, `deviceOSVersion` TEXT, `transactionStatus` TEXT, `transactionId` TEXT, `trackingId` TEXT, `transactionNumber` INTEGER, `terminal` INTEGER, PRIMARY KEY(`tripId`))");
            A4.a.a(connection, "CREATE TABLE IF NOT EXISTS `Items` (`itemId` TEXT NOT NULL, `source` TEXT, `remoteId` TEXT, `title` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `state` TEXT NOT NULL, `action` TEXT NOT NULL, `imageUrl` TEXT, `exception` TEXT, `isAddedToCart` INTEGER NOT NULL, `isQuantityUpdateAllowed` INTEGER NOT NULL, `itemTripId` TEXT NOT NULL, `timeAdded` TEXT NOT NULL, `timeUpdated` TEXT NOT NULL, `data` TEXT NOT NULL, `type` TEXT NOT NULL, `wasPrice` REAL, `nowPrice` REAL, `netPrice` REAL, `netPriceWithDeposit` REAL, `pricingText` TEXT, `unitDeposit` REAL, `totalDeposit` REAL, `unitSavings` REAL, `totalSavings` REAL, `restrictionTitle` TEXT, `restrictionMessage` TEXT, `isDismissed` INTEGER, `offerId` INTEGER, `couponTitle` TEXT, `description` TEXT, `redemptionStartDate` TEXT, `redemptionEndDate` TEXT, `productImageUrl` TEXT, `isClipped` INTEGER, PRIMARY KEY(`itemId`), FOREIGN KEY(`itemTripId`) REFERENCES `Trip`(`tripId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            A4.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Items_itemTripId` ON `Items` (`itemTripId`)");
            A4.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            A4.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '364c62616d86d005e396a49e190fc392')");
        }

        @Override // androidx.room.K
        public void b(b connection) {
            Intrinsics.j(connection, "connection");
            A4.a.a(connection, "DROP TABLE IF EXISTS `Trip`");
            A4.a.a(connection, "DROP TABLE IF EXISTS `Items`");
        }

        @Override // androidx.room.K
        public void g(b connection) {
            Intrinsics.j(connection, "connection");
            A4.a.a(connection, "PRAGMA foreign_keys = ON");
            ShopAndScanDatabase_Impl.this.internalInitInvalidationTracker(connection);
        }

        @Override // androidx.room.K
        public void i(b connection) {
            Intrinsics.j(connection, "connection");
            C17824b.b(connection);
        }

        @Override // androidx.room.K
        public K.a j(b connection) {
            Intrinsics.j(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tripId", new C17841s.a("tripId", "TEXT", true, 1, null, 1));
            linkedHashMap.put("startTime", new C17841s.a("startTime", "TEXT", true, 0, null, 1));
            linkedHashMap.put("isGreenville", new C17841s.a("isGreenville", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("isCheckoutInProgress", new C17841s.a("isCheckoutInProgress", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("digitalId", new C17841s.a("digitalId", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("mPerksBarcode", new C17841s.a("mPerksBarcode", "TEXT", true, 0, null, 1));
            linkedHashMap.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 0, null, 1));
            linkedHashMap.put("name", new C17841s.a("name", "TEXT", true, 0, null, 1));
            linkedHashMap.put("zip", new C17841s.a("zip", "TEXT", true, 0, null, 1));
            linkedHashMap.put("wasTotal", new C17841s.a("wasTotal", "REAL", true, 0, null, 1));
            linkedHashMap.put("nowTotal", new C17841s.a("nowTotal", "REAL", true, 0, null, 1));
            linkedHashMap.put("totalTax", new C17841s.a("totalTax", "REAL", true, 0, null, 1));
            linkedHashMap.put("totalSavings", new C17841s.a("totalSavings", "REAL", true, 0, null, 1));
            linkedHashMap.put("totalPriceWithTax", new C17841s.a("totalPriceWithTax", "REAL", true, 0, null, 1));
            linkedHashMap.put("mmaAppVersion", new C17841s.a("mmaAppVersion", "TEXT", true, 0, null, 1));
            linkedHashMap.put("osVersion", new C17841s.a("osVersion", "TEXT", true, 0, null, 1));
            linkedHashMap.put("phoneModel", new C17841s.a("phoneModel", "TEXT", true, 0, null, 1));
            linkedHashMap.put("storeId", new C17841s.a("storeId", "INTEGER", false, 0, null, 1));
            linkedHashMap.put("transactionDateTime", new C17841s.a("transactionDateTime", "TEXT", false, 0, null, 1));
            linkedHashMap.put("transactionDateTimeUTC", new C17841s.a("transactionDateTimeUTC", "TEXT", false, 0, null, 1));
            linkedHashMap.put("eventTimeStamp", new C17841s.a("eventTimeStamp", "TEXT", false, 0, null, 1));
            linkedHashMap.put("eventTimeStampUTC", new C17841s.a("eventTimeStampUTC", "TEXT", false, 0, null, 1));
            linkedHashMap.put("deviceId", new C17841s.a("deviceId", "TEXT", false, 0, null, 1));
            linkedHashMap.put("deviceOS", new C17841s.a("deviceOS", "TEXT", false, 0, null, 1));
            linkedHashMap.put("deviceAppVersion", new C17841s.a("deviceAppVersion", "TEXT", false, 0, null, 1));
            linkedHashMap.put("deviceOSVersion", new C17841s.a("deviceOSVersion", "TEXT", false, 0, null, 1));
            linkedHashMap.put("transactionStatus", new C17841s.a("transactionStatus", "TEXT", false, 0, null, 1));
            linkedHashMap.put("transactionId", new C17841s.a("transactionId", "TEXT", false, 0, null, 1));
            linkedHashMap.put("trackingId", new C17841s.a("trackingId", "TEXT", false, 0, null, 1));
            linkedHashMap.put("transactionNumber", new C17841s.a("transactionNumber", "INTEGER", false, 0, null, 1));
            linkedHashMap.put("terminal", new C17841s.a("terminal", "INTEGER", false, 0, null, 1));
            C17841s c17841s = new C17841s("Trip", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            C17841s.Companion companion = C17841s.INSTANCE;
            C17841s c17841sA = companion.a(connection, "Trip");
            if (!c17841s.equals(c17841sA)) {
                return new K.a(false, "Trip(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity).\n Expected:\n" + c17841s + "\n Found:\n" + c17841sA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("itemId", new C17841s.a("itemId", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("source", new C17841s.a("source", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("remoteId", new C17841s.a("remoteId", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("title", new C17841s.a("title", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("quantity", new C17841s.a("quantity", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("state", new C17841s.a("state", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("action", new C17841s.a("action", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("imageUrl", new C17841s.a("imageUrl", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("exception", new C17841s.a("exception", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("isAddedToCart", new C17841s.a("isAddedToCart", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("isQuantityUpdateAllowed", new C17841s.a("isQuantityUpdateAllowed", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("itemTripId", new C17841s.a("itemTripId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("timeAdded", new C17841s.a("timeAdded", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("timeUpdated", new C17841s.a("timeUpdated", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("data", new C17841s.a("data", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("type", new C17841s.a("type", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("wasPrice", new C17841s.a("wasPrice", "REAL", false, 0, null, 1));
            linkedHashMap2.put("nowPrice", new C17841s.a("nowPrice", "REAL", false, 0, null, 1));
            linkedHashMap2.put("netPrice", new C17841s.a("netPrice", "REAL", false, 0, null, 1));
            linkedHashMap2.put("netPriceWithDeposit", new C17841s.a("netPriceWithDeposit", "REAL", false, 0, null, 1));
            linkedHashMap2.put("pricingText", new C17841s.a("pricingText", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("unitDeposit", new C17841s.a("unitDeposit", "REAL", false, 0, null, 1));
            linkedHashMap2.put("totalDeposit", new C17841s.a("totalDeposit", "REAL", false, 0, null, 1));
            linkedHashMap2.put("unitSavings", new C17841s.a("unitSavings", "REAL", false, 0, null, 1));
            linkedHashMap2.put("totalSavings", new C17841s.a("totalSavings", "REAL", false, 0, null, 1));
            linkedHashMap2.put("restrictionTitle", new C17841s.a("restrictionTitle", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("restrictionMessage", new C17841s.a("restrictionMessage", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("isDismissed", new C17841s.a("isDismissed", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("offerId", new C17841s.a("offerId", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("couponTitle", new C17841s.a("couponTitle", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("description", new C17841s.a("description", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("redemptionStartDate", new C17841s.a("redemptionStartDate", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("redemptionEndDate", new C17841s.a("redemptionEndDate", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("productImageUrl", new C17841s.a("productImageUrl", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("isClipped", new C17841s.a("isClipped", "INTEGER", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new C17841s.c("Trip", "CASCADE", "NO ACTION", CollectionsKt.e("itemTripId"), CollectionsKt.e("tripId")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new C17841s.d("index_Items_itemTripId", false, CollectionsKt.e("itemTripId"), CollectionsKt.e("ASC")));
            C17841s c17841s2 = new C17841s("Items", linkedHashMap2, linkedHashSet, linkedHashSet2);
            C17841s c17841sA2 = companion.a(connection, "Items");
            if (c17841s2.equals(c17841sA2)) {
                return new K.a(true, null);
            }
            return new K.a(false, "Items(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity).\n Expected:\n" + c17841s2 + "\n Found:\n" + c17841sA2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f k(ShopAndScanDatabase_Impl shopAndScanDatabase_Impl) {
        return new f(shopAndScanDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p l(ShopAndScanDatabase_Impl shopAndScanDatabase_Impl) {
        return new p(shopAndScanDatabase_Impl);
    }

    @Override // androidx.room.G
    public void clearAllTables() {
        super.performClear(true, "Trip", "Items");
    }

    @Override // androidx.room.G
    public List<AbstractC17349b> createAutoMigrations(Map<KClass<? extends InterfaceC17348a>, ? extends InterfaceC17348a> autoMigrationSpecs) {
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.G
    protected C6273q createInvalidationTracker() {
        return new C6273q(this, new LinkedHashMap(), new LinkedHashMap(), "Trip", "Items");
    }

    @Override // com.meijer.mobile.shopandscan.data.local.ShopAndScanDatabase
    public Tp.a g() {
        return this._shopAndScanItemDAO.getValue();
    }

    @Override // androidx.room.G
    public Set<KClass<? extends InterfaceC17348a>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.G
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.b(g.class), p.INSTANCE.a());
        linkedHashMap.put(Reflection.b(Tp.a.class), f.INSTANCE.a());
        return linkedHashMap;
    }

    @Override // com.meijer.mobile.shopandscan.data.local.ShopAndScanDatabase
    public g h() {
        return this._shopAndScanTripDAO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.G
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public K createOpenDelegate() {
        return new a();
    }
}
