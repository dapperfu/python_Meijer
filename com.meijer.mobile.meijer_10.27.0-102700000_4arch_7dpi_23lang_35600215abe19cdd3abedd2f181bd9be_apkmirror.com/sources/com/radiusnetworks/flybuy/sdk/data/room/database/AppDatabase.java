package com.radiusnetworks.flybuy.sdk.data.room.database;

import A4.c;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.room.C6136w;
import androidx.room.G;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u4.b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH ¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "Landroidx/room/G;", "<init>", "()V", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/OrderDao;", "orderDao$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/room/dao/OrderDao;", "orderDao", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;", "customerDao$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;", "customerDao", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/BeaconRegionDao;", "beaconRegionDao$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/room/dao/BeaconRegionDao;", "beaconRegionDao", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/SiteDao;", "siteDao$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/room/dao/SiteDao;", "siteDao", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AppDatabase extends G {
    private static final String DB_NAME = "app_db";
    private static AppDatabase instance;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b MIGRATION_10_11 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_10_11$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` RENAME TO `oldOrdersTable`");
            db2.S("CREATE TABLE `orders` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_siteId` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `orders` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_siteId`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_siteId`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `oldOrdersTable`");
            db2.S("DROP TABLE oldOrdersTable");
        }
    };
    private static final b MIGRATION_11_12 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_11_12$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
        }
    };
    private static final b MIGRATION_12_13 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_12_13$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE sites (id INTEGER NOT NULL PRIMARY KEY, name TEXT, phone TEXT, streetAddress TEXT, fullAddress TEXT, locality TEXT, region TEXT, country TEXT, postalCode TEXT, latitude TEXT, longitude TEXT, coverPhotoUrl TEXT, iconUrl TEXT, instructions TEXT, description TEXT, partnerIdentifier TEXT)");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_siteId`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_13_14 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_13_14$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_14_15 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_14_15$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_15_16 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_15_16$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `pickupType` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_16_17 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_16_17$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `pickupType` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_17_18 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_17_18$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `pickupType` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0,`curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_18_19 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_18_19$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` INTEGER NOT NULL, `orderState` INTEGER NOT NULL, `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `pickupType` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_geofence_latitude` TEXT, `site_geofence_longitude` TEXT, `site_geofence_radius` REAL, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0,`curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `orderState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
            db2.S("CREATE TABLE new_sites_table (id INTEGER NOT NULL PRIMARY KEY, name TEXT, phone TEXT, streetAddress TEXT, fullAddress TEXT, locality TEXT, region TEXT, country TEXT, postalCode TEXT, latitude TEXT, longitude TEXT, coverPhotoUrl TEXT, iconUrl TEXT, instructions TEXT, description TEXT, partnerIdentifier TEXT, geofence_latitude TEXT, geofence_longitude TEXT, geofence_radius REAL)");
            db2.S("INSERT INTO `new_sites_table` (`name`, `phone`, `streetAddress`, `fullAddress`, `locality`, `region`, `country`, `postalCode`, `latitude`, `longitude`, `coverPhotoUrl`, `iconUrl`, `instructions`, `description`, `partnerIdentifier`) SELECT `name`, `phone`, `streetAddress`, `fullAddress`, `locality`, `region`, `country`, `postalCode`, `latitude`, `longitude`, `coverPhotoUrl`, `iconUrl`, `instructions`, `description`, `partnerIdentifier` FROM `sites`");
            db2.S("DROP TABLE sites");
            db2.S("ALTER TABLE `new_sites_table` RENAME TO `sites`");
        }
    };
    private static final b MIGRATION_19_20 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_19_20$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `newState` TEXT DEFAULT 'created'");
            db2.S("ALTER TABLE `orders` ADD COLUMN `newCustomerState` TEXT DEFAULT \"created\"");
            db2.S("UPDATE `orders` SET newState = CASE orderState WHEN 0 THEN 'created' WHEN 1 THEN 'ready' WHEN 2 THEN 'delayed' WHEN 3 THEN 'cancelled' ELSE 'completed' END");
            db2.S("UPDATE `orders` SET newCustomerState = CASE customerState WHEN 0 THEN 'created' WHEN 1 THEN 'en_route' WHEN 2 THEN 'nearby' WHEN 3 THEN 'arrived' WHEN 4 THEN 'waiting' ELSE 'completed' END");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `newCustomerState`, `newState`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
            db2.S("CREATE TABLE new_sites_table (`id` INTEGER NOT NULL, `name` TEXT, `phone` TEXT, `streetAddress` TEXT, `fullAddress` TEXT, `locality` TEXT, `region` TEXT, `country` TEXT, `postalCode` TEXT, `latitude` TEXT, `longitude` TEXT, `coverPhotoUrl` TEXT, `iconUrl` TEXT, `instructions` TEXT, `description` TEXT, `partnerIdentifier` TEXT, `geofence_latitude` REAL DEFAULT 0, `geofence_longitude` REAL DEFAULT 0, `geofence_radius` REAL DEFAULT 0, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_sites_table` (`name`, `phone`, `streetAddress`, `fullAddress`, `locality`, `region`, `country`, `postalCode`, `latitude`, `longitude`, `coverPhotoUrl`, `iconUrl`, `instructions`, `description`, `partnerIdentifier`, `geofence_latitude`, `geofence_longitude`, `geofence_radius`) SELECT `name`, `phone`, `streetAddress`, `fullAddress`, `locality`, `region`, `country`, `postalCode`, `latitude`, `longitude`, `coverPhotoUrl`, `iconUrl`, `instructions`, `description`, `partnerIdentifier`, `geofence_latitude`, `geofence_longitude`, `geofence_radius` FROM `sites`");
            db2.S("DROP TABLE sites");
            db2.S("ALTER TABLE `new_sites_table` RENAME TO `sites`");
        }
    };
    private static final b MIGRATION_20_21 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_20_21$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_21_22 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_21_22$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `projectAccentColor` TEXT, `projectAccentTextColor` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `redemptionCode`, `customerId`, `pickup_window_start`, `pickup_window_end`, `pickupType`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_22_23 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_22_23$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `spotIdentifier` TEXT");
            db2.S("ALTER TABLE `orders` ADD COLUMN `spotIdentifierEntryEnabled` INTEGER NOT NULL DEFAULT 0");
            db2.S("ALTER TABLE `orders` ADD COLUMN `spotIdentifierInputType` TEXT NOT NULL DEFAULT 'text'");
        }
    };
    private static final b MIGRATION_23_24 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_23_24$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `partnerIdentifierForCustomer` TEXT");
            db2.S("ALTER TABLE `orders` ADD COLUMN `partnerIdentifierForCrew` TEXT");
        }
    };
    private static final b MIGRATION_24_25 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_24_25$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `wrongSiteDetectionEnabled` INTEGER NOT NULL DEFAULT 0");
            db2.S("ALTER TABLE `orders` ADD COLUMN `distanceFilteringDisabled` INTEGER NOT NULL DEFAULT 0");
            db2.S("ALTER TABLE `orders` ADD COLUMN `wrongSiteSearchRadius` REAL NOT NULL DEFAULT 40000.0");
            db2.S("ALTER TABLE `orders` ADD COLUMN `site_wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0");
            db2.S("ALTER TABLE `sites` ADD COLUMN `wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0");
        }
    };
    private static final b MIGRATION_25_26 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_25_26$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `site_operationalStatus` TEXT NOT NULL DEFAULT 'live'");
            db2.S("ALTER TABLE `sites` ADD COLUMN `operationalStatus` TEXT NOT NULL DEFAULT 'live'");
        }
    };
    private static final b MIGRATION_26_27 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_26_27$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `prearrivalSeconds` INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final b MIGRATION_27_28 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_27_28$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `sites` ADD COLUMN `prearrivalSeconds` INTEGER NOT NULL DEFAULT 0");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `partnerIdentifierForCustomer` TEXT, `partnerIdentifierForCrew` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `projectAccentColor` TEXT, `projectAccentTextColor` TEXT, `spotIdentifier` TEXT, `spotIdentifierEntryEnabled` INTEGER NOT NULL DEFAULT 0, `spotIdentifierInputType` TEXT NOT NULL DEFAULT 'text', `wrongSiteDetectionEnabled` INTEGER NOT NULL DEFAULT 0, `distanceFilteringDisabled` INTEGER NOT NULL DEFAULT 0, `wrongSiteSearchRadius` REAL NOT NULL DEFAULT 40000.0, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `site_operationalStatus` TEXT NOT NULL DEFAULT 'live', `site_prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `partnerIdentifierForCustomer`, `partnerIdentifierForCrew`, `redemptionCode`, `customerId`, `pickupType`, `customerRatingValue`, `customerRatingComments`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled`, `projectAccentColor`, `projectAccentTextColor`, `spotIdentifier`, `spotIdentifierEntryEnabled`, `spotIdentifierInputType`, `wrongSiteDetectionEnabled`, `distanceFilteringDisabled`, `wrongSiteSearchRadius`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_partnerIdentifier`, `site_wrongSiteArrivalRadius`, `site_operationalStatus`, `site_prearrivalSeconds`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `partnerIdentifierForCustomer`, `partnerIdentifierForCrew`, `redemptionCode`, `customerId`, `pickupType`, `customerRatingValue`, `customerRatingComments`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled`, `projectAccentColor`, `projectAccentTextColor`, `spotIdentifier`, `spotIdentifierEntryEnabled`, `spotIdentifierInputType`, `wrongSiteDetectionEnabled`, `distanceFilteringDisabled`, `wrongSiteSearchRadius`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_partnerIdentifier`, `site_wrongSiteArrivalRadius`, `site_operationalStatus`, `prearrivalSeconds`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_28_29 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_28_29$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `pickupConfig` TEXT NOT NULL DEFAULT ''");
        }
    };
    private static final b MIGRATION_29_30 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_29_30$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `sites` ADD COLUMN `pickupConfig` TEXT NOT NULL DEFAULT ''");
            db2.S("CREATE TABLE `new_orders_table` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `partnerIdentifierForCustomer` TEXT, `partnerIdentifierForCrew` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `projectAccentColor` TEXT, `projectAccentTextColor` TEXT, `spotIdentifier` TEXT, `spotIdentifierEntryEnabled` INTEGER NOT NULL DEFAULT 0, `spotIdentifierInputType` TEXT NOT NULL DEFAULT 'text', `wrongSiteDetectionEnabled` INTEGER NOT NULL DEFAULT 0, `distanceFilteringDisabled` INTEGER NOT NULL DEFAULT 0, `wrongSiteSearchRadius` REAL NOT NULL DEFAULT 40000.0, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `site_operationalStatus` TEXT NOT NULL DEFAULT 'live', `site_prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `site_pickupConfig` TEXT NOT NULL DEFAULT '', `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.S("INSERT INTO `new_orders_table` (`id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `partnerIdentifierForCustomer`, `partnerIdentifierForCrew`, `redemptionCode`, `customerId`, `pickupType`, `customerRatingValue`, `customerRatingComments`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled`, `projectAccentColor`, `projectAccentTextColor`, `spotIdentifier`, `spotIdentifierEntryEnabled`, `spotIdentifierInputType`, `wrongSiteDetectionEnabled`, `distanceFilteringDisabled`, `wrongSiteSearchRadius`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_partnerIdentifier`, `site_wrongSiteArrivalRadius`, `site_operationalStatus`, `site_prearrivalSeconds`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate`) SELECT `id`, `type`, `createdAt`, `arrivedAt`, `updatedAt`, `redeemedAt`, `customerState`, `state`, `etaAt`, `displayName`, `displayDetail`, `partnerIdentifier`, `partnerIdentifierForCustomer`, `partnerIdentifierForCrew`, `redemptionCode`, `customerId`, `pickupType`, `customerRatingValue`, `customerRatingComments`, `pushToken`, `alwaysShowVehicleInfoFields`, `customerNameEditingEnabled`, `pickupTypeSelectionEnabled`, `requireVehicleInfoIfVisible`, `curbsideLocalizedString`, `pickupLocalizedString`, `locationTrackingEnabled`, `projectAccentColor`, `projectAccentTextColor`, `spotIdentifier`, `spotIdentifierEntryEnabled`, `spotIdentifierInputType`, `wrongSiteDetectionEnabled`, `distanceFilteringDisabled`, `wrongSiteSearchRadius`, `pickup_window_start`, `pickup_window_end`, `site_id`, `site_name`, `site_phone`, `site_streetAddress`, `site_fullAddress`, `site_locality`, `site_region`, `site_country`, `site_postalCode`, `site_latitude`, `site_longitude`, `site_coverPhotoUrl`, `site_iconUrl`, `site_instructions`, `site_description`, `site_partnerIdentifier`, `site_wrongSiteArrivalRadius`, `site_operationalStatus`, `site_prearrivalSeconds`, `site_geofence_latitude`, `site_geofence_longitude`, `site_geofence_radius`, `customer_name`, `customer_phone`, `customer_carType`, `customer_carColor`, `customer_licensePlate` FROM `orders`");
            db2.S("CREATE TABLE new_beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL)");
            db2.S("INSERT INTO `new_beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `beacon_regions`");
            db2.S("DROP TABLE beacon_regions");
            db2.S("DROP TABLE orders");
            db2.S("ALTER TABLE `new_orders_table` RENAME TO `orders`");
            db2.S("CREATE TABLE beacon_regions (id INTEGER NOT NULL PRIMARY KEY, uuid TEXT NOT NULL, major INTEGER, minor INTEGER, order_id INTEGER NOT NULL, FOREIGN KEY(order_id) REFERENCES orders(id) ON DELETE CASCADE)");
            db2.S("INSERT INTO `beacon_regions` (`id`, `uuid`, `major`, `minor`, `order_id`) SELECT `id`, `uuid`, `major`, `minor`, `order_id` FROM `new_beacon_regions`");
            db2.S("DROP TABLE new_beacon_regions");
        }
    };
    private static final b MIGRATION_30_31 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_30_31$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `wrongSiteId` INTEGER");
        }
    };
    private static final b MIGRATION_31_32 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_31_32$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `handoffVehicleLocation` TEXT");
        }
    };
    private static final b MIGRATION_32_33 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_32_33$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `estimatedReadyAt` TEXT");
        }
    };
    private static final b MIGRATION_33_34 = new b() { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion$MIGRATION_33_34$1
        @Override // u4.b
        public void migrate(c db2) throws SQLException {
            Intrinsics.j(db2, "db");
            db2.S("ALTER TABLE `orders` ADD COLUMN `orderFiredAt` TEXT");
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\u000fR \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\u000fR \u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\u000fR \u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u000fR \u0010\u001d\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u000fR \u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\r\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b!\u0010\u000fR \u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\r\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\u000fR \u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\r\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u000fR \u0010)\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\r\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010\u000fR \u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\r\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010\u000fR \u0010/\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\r\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010\u000fR \u00102\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\r\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u000fR \u00105\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\r\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010\u000fR \u00108\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\r\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\u000fR \u0010;\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010\r\u0012\u0004\b=\u0010\u0003\u001a\u0004\b<\u0010\u000fR \u0010>\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010\r\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\u000fR \u0010A\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010\r\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010\u000fR \u0010D\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010\r\u0012\u0004\bF\u0010\u0003\u001a\u0004\bE\u0010\u000fR \u0010G\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010\r\u0012\u0004\bI\u0010\u0003\u001a\u0004\bH\u0010\u000fR \u0010J\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010\r\u0012\u0004\bL\u0010\u0003\u001a\u0004\bK\u0010\u000fR \u0010M\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010\r\u0012\u0004\bO\u0010\u0003\u001a\u0004\bN\u0010\u000fR \u0010P\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010\r\u0012\u0004\bR\u0010\u0003\u001a\u0004\bQ\u0010\u000fR \u0010S\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010\r\u0012\u0004\bU\u0010\u0003\u001a\u0004\bT\u0010\u000fR\u0014\u0010W\u001a\u00020V8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "buildDatabase", "(Landroid/content/Context;)Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "getInstance", "init", "Lu4/b;", "MIGRATION_10_11", "Lu4/b;", "getMIGRATION_10_11", "()Lu4/b;", "getMIGRATION_10_11$annotations", "MIGRATION_11_12", "getMIGRATION_11_12", "getMIGRATION_11_12$annotations", "MIGRATION_12_13", "getMIGRATION_12_13", "getMIGRATION_12_13$annotations", "MIGRATION_13_14", "getMIGRATION_13_14", "getMIGRATION_13_14$annotations", "MIGRATION_14_15", "getMIGRATION_14_15", "getMIGRATION_14_15$annotations", "MIGRATION_15_16", "getMIGRATION_15_16", "getMIGRATION_15_16$annotations", "MIGRATION_16_17", "getMIGRATION_16_17", "getMIGRATION_16_17$annotations", "MIGRATION_17_18", "getMIGRATION_17_18", "getMIGRATION_17_18$annotations", "MIGRATION_18_19", "getMIGRATION_18_19", "getMIGRATION_18_19$annotations", "MIGRATION_19_20", "getMIGRATION_19_20", "getMIGRATION_19_20$annotations", "MIGRATION_20_21", "getMIGRATION_20_21", "getMIGRATION_20_21$annotations", "MIGRATION_21_22", "getMIGRATION_21_22", "getMIGRATION_21_22$annotations", "MIGRATION_22_23", "getMIGRATION_22_23", "getMIGRATION_22_23$annotations", "MIGRATION_23_24", "getMIGRATION_23_24", "getMIGRATION_23_24$annotations", "MIGRATION_24_25", "getMIGRATION_24_25", "getMIGRATION_24_25$annotations", "MIGRATION_25_26", "getMIGRATION_25_26", "getMIGRATION_25_26$annotations", "MIGRATION_26_27", "getMIGRATION_26_27", "getMIGRATION_26_27$annotations", "MIGRATION_27_28", "getMIGRATION_27_28", "getMIGRATION_27_28$annotations", "MIGRATION_28_29", "getMIGRATION_28_29", "getMIGRATION_28_29$annotations", "MIGRATION_29_30", "getMIGRATION_29_30", "getMIGRATION_29_30$annotations", "MIGRATION_30_31", "getMIGRATION_30_31", "getMIGRATION_30_31$annotations", "MIGRATION_31_32", "getMIGRATION_31_32", "getMIGRATION_31_32$annotations", "MIGRATION_32_33", "getMIGRATION_32_33", "getMIGRATION_32_33$annotations", "MIGRATION_33_34", "getMIGRATION_33_34", "getMIGRATION_33_34$annotations", "", "DB_NAME", "Ljava/lang/String;", "instance", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getMIGRATION_10_11$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_11_12$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_12_13$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_13_14$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_14_15$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_15_16$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_16_17$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_17_18$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_18_19$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_19_20$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_20_21$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_21_22$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_22_23$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_23_24$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_24_25$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_25_26$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_26_27$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_27_28$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_28_29$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_29_30$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_30_31$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_31_32$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_32_33$annotations() {
        }

        public static /* synthetic */ void getMIGRATION_33_34$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppDatabase getInstance(Context context) {
            AppDatabase appDatabaseInit;
            Intrinsics.j(context, "context");
            AppDatabase appDatabase = AppDatabase.instance;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseInit = AppDatabase.instance;
                if (appDatabaseInit == null) {
                    appDatabaseInit = AppDatabase.INSTANCE.init(context);
                    AppDatabase.instance = appDatabaseInit;
                }
            }
            return appDatabaseInit;
        }

        public final AppDatabase init(Context context) {
            Intrinsics.j(context, "context");
            AppDatabase.instance = buildDatabase(context);
            try {
                AppDatabase appDatabase = AppDatabase.instance;
                Intrinsics.g(appDatabase);
                appDatabase.getOpenHelper().D2();
            } catch (Exception e10) {
                LogExtensionsKt.loge(this, true, e10, "Database there was an error during DB opening => trying to destroy and recreate", new Object[0]);
                AppDatabase appDatabase2 = AppDatabase.instance;
                Intrinsics.g(appDatabase2);
                appDatabase2.getOpenHelper().close();
                if (SQLiteDatabase.deleteDatabase(context.getDatabasePath(AppDatabase.DB_NAME))) {
                    AppDatabase.instance = buildDatabase(context);
                    AppDatabase appDatabase3 = AppDatabase.instance;
                    Intrinsics.g(appDatabase3);
                    appDatabase3.getOpenHelper().D2();
                }
            }
            AppDatabase appDatabase4 = AppDatabase.instance;
            Intrinsics.g(appDatabase4);
            return appDatabase4;
        }

        private final AppDatabase buildDatabase(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.i(applicationContext, "getApplicationContext(...)");
            return (AppDatabase) C6136w.a(applicationContext, AppDatabase.class, AppDatabase.DB_NAME).b(getMIGRATION_10_11()).b(getMIGRATION_11_12()).b(getMIGRATION_12_13()).b(getMIGRATION_13_14()).b(getMIGRATION_14_15()).b(getMIGRATION_15_16()).b(getMIGRATION_16_17()).b(getMIGRATION_17_18()).b(getMIGRATION_18_19()).b(getMIGRATION_19_20()).b(getMIGRATION_20_21()).b(getMIGRATION_21_22()).b(getMIGRATION_22_23()).b(getMIGRATION_23_24()).b(getMIGRATION_24_25()).b(getMIGRATION_25_26()).b(getMIGRATION_26_27()).b(getMIGRATION_27_28()).b(getMIGRATION_28_29()).b(getMIGRATION_29_30()).b(getMIGRATION_30_31()).b(getMIGRATION_31_32()).b(getMIGRATION_32_33()).b(getMIGRATION_33_34()).e().d();
        }

        public final b getMIGRATION_10_11() {
            return AppDatabase.MIGRATION_10_11;
        }

        public final b getMIGRATION_11_12() {
            return AppDatabase.MIGRATION_11_12;
        }

        public final b getMIGRATION_12_13() {
            return AppDatabase.MIGRATION_12_13;
        }

        public final b getMIGRATION_13_14() {
            return AppDatabase.MIGRATION_13_14;
        }

        public final b getMIGRATION_14_15() {
            return AppDatabase.MIGRATION_14_15;
        }

        public final b getMIGRATION_15_16() {
            return AppDatabase.MIGRATION_15_16;
        }

        public final b getMIGRATION_16_17() {
            return AppDatabase.MIGRATION_16_17;
        }

        public final b getMIGRATION_17_18() {
            return AppDatabase.MIGRATION_17_18;
        }

        public final b getMIGRATION_18_19() {
            return AppDatabase.MIGRATION_18_19;
        }

        public final b getMIGRATION_19_20() {
            return AppDatabase.MIGRATION_19_20;
        }

        public final b getMIGRATION_20_21() {
            return AppDatabase.MIGRATION_20_21;
        }

        public final b getMIGRATION_21_22() {
            return AppDatabase.MIGRATION_21_22;
        }

        public final b getMIGRATION_22_23() {
            return AppDatabase.MIGRATION_22_23;
        }

        public final b getMIGRATION_23_24() {
            return AppDatabase.MIGRATION_23_24;
        }

        public final b getMIGRATION_24_25() {
            return AppDatabase.MIGRATION_24_25;
        }

        public final b getMIGRATION_25_26() {
            return AppDatabase.MIGRATION_25_26;
        }

        public final b getMIGRATION_26_27() {
            return AppDatabase.MIGRATION_26_27;
        }

        public final b getMIGRATION_27_28() {
            return AppDatabase.MIGRATION_27_28;
        }

        public final b getMIGRATION_28_29() {
            return AppDatabase.MIGRATION_28_29;
        }

        public final b getMIGRATION_29_30() {
            return AppDatabase.MIGRATION_29_30;
        }

        public final b getMIGRATION_30_31() {
            return AppDatabase.MIGRATION_30_31;
        }

        public final b getMIGRATION_31_32() {
            return AppDatabase.MIGRATION_31_32;
        }

        public final b getMIGRATION_32_33() {
            return AppDatabase.MIGRATION_32_33;
        }

        public final b getMIGRATION_33_34() {
            return AppDatabase.MIGRATION_33_34;
        }
    }

    public abstract BeaconRegionDao beaconRegionDao$core_defaultRelease();

    public abstract CustomerDao customerDao$core_defaultRelease();

    public abstract OrderDao orderDao$core_defaultRelease();

    public abstract SiteDao siteDao$core_defaultRelease();
}
