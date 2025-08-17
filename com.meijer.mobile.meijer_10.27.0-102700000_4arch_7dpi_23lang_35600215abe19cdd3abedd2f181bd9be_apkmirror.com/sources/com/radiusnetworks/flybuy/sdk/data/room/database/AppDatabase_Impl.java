package com.radiusnetworks.flybuy.sdk.data.room.database;

import A4.c;
import A4.d;
import android.database.SQLException;
import androidx.room.C6119e;
import androidx.room.C6131q;
import androidx.room.G;
import androidx.room.M;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.InterfaceC17221a;
import u4.b;
import w4.C17754b;
import w4.C17771s;

/* loaded from: classes11.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile BeaconRegionDao _beaconRegionDao;
    private volatile CustomerDao _customerDao;
    private volatile OrderDao _orderDao;
    private volatile SiteDao _siteDao;

    @Override // com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase
    public BeaconRegionDao beaconRegionDao$core_defaultRelease() {
        BeaconRegionDao beaconRegionDao;
        if (this._beaconRegionDao != null) {
            return this._beaconRegionDao;
        }
        synchronized (this) {
            try {
                if (this._beaconRegionDao == null) {
                    this._beaconRegionDao = new BeaconRegionDao_Impl(this);
                }
                beaconRegionDao = this._beaconRegionDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return beaconRegionDao;
    }

    @Override // androidx.room.G
    public void clearAllTables() throws SQLException {
        assertNotMainThread();
        c cVarD2 = getOpenHelper().D2();
        try {
            beginTransaction();
            cVarD2.S("PRAGMA defer_foreign_keys = TRUE");
            cVarD2.S("DELETE FROM `customers`");
            cVarD2.S("DELETE FROM `orders`");
            cVarD2.S("DELETE FROM `beacon_regions`");
            cVarD2.S("DELETE FROM `sites`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            cVarD2.F2("PRAGMA wal_checkpoint(FULL)").close();
            if (!cVarD2.j3()) {
                cVarD2.S("VACUUM");
            }
        }
    }

    @Override // androidx.room.G
    public C6131q createInvalidationTracker() {
        return new C6131q(this, new HashMap(0), new HashMap(0), "customers", "orders", "beacon_regions", "sites");
    }

    @Override // androidx.room.G
    public d createOpenHelper(C6119e c6119e) {
        return c6119e.sqliteOpenHelperFactory.a(d.b.a(c6119e.context).d(c6119e.name).c(new M(c6119e, new M.b(34) { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase_Impl.1
            @Override // androidx.room.M.b
            public void onPostMigrate(c cVar) {
            }

            @Override // androidx.room.M.b
            public void createAllTables(c cVar) throws SQLException {
                cVar.S("CREATE TABLE IF NOT EXISTS `customers` (`id` INTEGER NOT NULL, `apiToken` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `deletedAt` TEXT, `email` TEXT, `name` TEXT NOT NULL, `phone` TEXT, `carType` TEXT, `carColor` TEXT, `licensePlate` TEXT, PRIMARY KEY(`id`))");
                cVar.S("CREATE TABLE IF NOT EXISTS `orders` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `partnerIdentifierForCustomer` TEXT, `partnerIdentifierForCrew` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `projectAccentColor` TEXT, `projectAccentTextColor` TEXT, `spotIdentifier` TEXT, `spotIdentifierEntryEnabled` INTEGER NOT NULL DEFAULT 0, `spotIdentifierInputType` TEXT NOT NULL DEFAULT 'text', `wrongSiteDetectionEnabled` INTEGER NOT NULL DEFAULT 0, `distanceFilteringDisabled` INTEGER NOT NULL DEFAULT 0, `wrongSiteSearchRadius` REAL NOT NULL DEFAULT 40000.0, `wrongSiteId` INTEGER, `handoffVehicleLocation` TEXT, `estimatedReadyAt` TEXT, `orderFiredAt` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `site_operationalStatus` TEXT NOT NULL DEFAULT 'live', `site_prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `site_pickupConfig` TEXT NOT NULL DEFAULT '', `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))");
                cVar.S("CREATE TABLE IF NOT EXISTS `beacon_regions` (`uuid` TEXT NOT NULL, `major` INTEGER, `minor` INTEGER, `order_id` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`order_id`) REFERENCES `orders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                cVar.S("CREATE TABLE IF NOT EXISTS `sites` (`id` INTEGER NOT NULL, `name` TEXT, `phone` TEXT, `streetAddress` TEXT, `fullAddress` TEXT, `locality` TEXT, `region` TEXT, `country` TEXT, `postalCode` TEXT, `latitude` TEXT, `longitude` TEXT, `coverPhotoUrl` TEXT, `iconUrl` TEXT, `instructions` TEXT, `description` TEXT, `partnerIdentifier` TEXT, `wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `operationalStatus` TEXT NOT NULL DEFAULT 'live', `prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `pickupConfig` TEXT NOT NULL DEFAULT '', `geofence_latitude` REAL DEFAULT 0, `geofence_longitude` REAL DEFAULT 0, `geofence_radius` REAL DEFAULT 0, PRIMARY KEY(`id`))");
                cVar.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9e245313709e91c5921e9e96901cd15a')");
            }

            @Override // androidx.room.M.b
            public void dropAllTables(c cVar) throws SQLException {
                cVar.S("DROP TABLE IF EXISTS `customers`");
                cVar.S("DROP TABLE IF EXISTS `orders`");
                cVar.S("DROP TABLE IF EXISTS `beacon_regions`");
                cVar.S("DROP TABLE IF EXISTS `sites`");
                List list = ((G) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G.b) it.next()).c(cVar);
                    }
                }
            }

            @Override // androidx.room.M.b
            public void onCreate(c cVar) {
                List list = ((G) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G.b) it.next()).a(cVar);
                    }
                }
            }

            @Override // androidx.room.M.b
            public void onOpen(c cVar) throws SQLException {
                ((G) AppDatabase_Impl.this).mDatabase = cVar;
                cVar.S("PRAGMA foreign_keys = ON");
                AppDatabase_Impl.this.internalInitInvalidationTracker(cVar);
                List list = ((G) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G.b) it.next()).e(cVar);
                    }
                }
            }

            @Override // androidx.room.M.b
            public M.c onValidateSchema(c cVar) {
                HashMap map = new HashMap(11);
                map.put(PreferencesHelper.PREF_ID, new C17771s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map.put("apiToken", new C17771s.a("apiToken", "TEXT", true, 0, null, 1));
                map.put("createdAt", new C17771s.a("createdAt", "TEXT", true, 0, null, 1));
                map.put("updatedAt", new C17771s.a("updatedAt", "TEXT", true, 0, null, 1));
                map.put("deletedAt", new C17771s.a("deletedAt", "TEXT", false, 0, null, 1));
                map.put("email", new C17771s.a("email", "TEXT", false, 0, null, 1));
                map.put("name", new C17771s.a("name", "TEXT", true, 0, null, 1));
                map.put("phone", new C17771s.a("phone", "TEXT", false, 0, null, 1));
                map.put("carType", new C17771s.a("carType", "TEXT", false, 0, null, 1));
                map.put("carColor", new C17771s.a("carColor", "TEXT", false, 0, null, 1));
                map.put("licensePlate", new C17771s.a("licensePlate", "TEXT", false, 0, null, 1));
                C17771s c17771s = new C17771s("customers", map, new HashSet(0), new HashSet(0));
                C17771s c17771sA = C17771s.a(cVar, "customers");
                if (!c17771s.equals(c17771sA)) {
                    return new M.c(false, "customers(com.radiusnetworks.flybuy.sdk.data.room.domain.Customer).\n Expected:\n" + c17771s + "\n Found:\n" + c17771sA);
                }
                HashMap map2 = new HashMap(69);
                map2.put(PreferencesHelper.PREF_ID, new C17771s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map2.put("type", new C17771s.a("type", "TEXT", false, 0, null, 1));
                map2.put("createdAt", new C17771s.a("createdAt", "TEXT", true, 0, null, 1));
                map2.put("arrivedAt", new C17771s.a("arrivedAt", "TEXT", false, 0, null, 1));
                map2.put("updatedAt", new C17771s.a("updatedAt", "TEXT", true, 0, null, 1));
                map2.put("redeemedAt", new C17771s.a("redeemedAt", "TEXT", false, 0, null, 1));
                map2.put("customerState", new C17771s.a("customerState", "TEXT", true, 0, "'created'", 1));
                map2.put("state", new C17771s.a("state", "TEXT", true, 0, "'created'", 1));
                map2.put("etaAt", new C17771s.a("etaAt", "TEXT", false, 0, null, 1));
                map2.put("displayName", new C17771s.a("displayName", "TEXT", false, 0, null, 1));
                map2.put("displayDetail", new C17771s.a("displayDetail", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifier", new C17771s.a("partnerIdentifier", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifierForCustomer", new C17771s.a("partnerIdentifierForCustomer", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifierForCrew", new C17771s.a("partnerIdentifierForCrew", "TEXT", false, 0, null, 1));
                map2.put("redemptionCode", new C17771s.a("redemptionCode", "TEXT", false, 0, null, 1));
                map2.put("customerId", new C17771s.a("customerId", "TEXT", false, 0, null, 1));
                map2.put("pickupType", new C17771s.a("pickupType", "TEXT", false, 0, null, 1));
                map2.put("customerRatingValue", new C17771s.a("customerRatingValue", "INTEGER", false, 0, null, 1));
                map2.put("customerRatingComments", new C17771s.a("customerRatingComments", "TEXT", false, 0, null, 1));
                map2.put("pushToken", new C17771s.a("pushToken", "TEXT", false, 0, null, 1));
                map2.put("alwaysShowVehicleInfoFields", new C17771s.a("alwaysShowVehicleInfoFields", "INTEGER", true, 0, "0", 1));
                map2.put("customerNameEditingEnabled", new C17771s.a("customerNameEditingEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("pickupTypeSelectionEnabled", new C17771s.a("pickupTypeSelectionEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("requireVehicleInfoIfVisible", new C17771s.a("requireVehicleInfoIfVisible", "INTEGER", true, 0, "0", 1));
                map2.put("curbsideLocalizedString", new C17771s.a("curbsideLocalizedString", "TEXT", false, 0, null, 1));
                map2.put("pickupLocalizedString", new C17771s.a("pickupLocalizedString", "TEXT", false, 0, null, 1));
                map2.put("locationTrackingEnabled", new C17771s.a("locationTrackingEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("projectAccentColor", new C17771s.a("projectAccentColor", "TEXT", false, 0, null, 1));
                map2.put("projectAccentTextColor", new C17771s.a("projectAccentTextColor", "TEXT", false, 0, null, 1));
                map2.put("spotIdentifier", new C17771s.a("spotIdentifier", "TEXT", false, 0, null, 1));
                map2.put("spotIdentifierEntryEnabled", new C17771s.a("spotIdentifierEntryEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("spotIdentifierInputType", new C17771s.a("spotIdentifierInputType", "TEXT", true, 0, "'text'", 1));
                map2.put("wrongSiteDetectionEnabled", new C17771s.a("wrongSiteDetectionEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("distanceFilteringDisabled", new C17771s.a("distanceFilteringDisabled", "INTEGER", true, 0, "0", 1));
                map2.put("wrongSiteSearchRadius", new C17771s.a("wrongSiteSearchRadius", "REAL", true, 0, "40000.0", 1));
                map2.put("wrongSiteId", new C17771s.a("wrongSiteId", "INTEGER", false, 0, null, 1));
                map2.put("handoffVehicleLocation", new C17771s.a("handoffVehicleLocation", "TEXT", false, 0, null, 1));
                map2.put("estimatedReadyAt", new C17771s.a("estimatedReadyAt", "TEXT", false, 0, null, 1));
                map2.put("orderFiredAt", new C17771s.a("orderFiredAt", "TEXT", false, 0, null, 1));
                map2.put("pickup_window_start", new C17771s.a("pickup_window_start", "TEXT", false, 0, null, 1));
                map2.put("pickup_window_end", new C17771s.a("pickup_window_end", "TEXT", false, 0, null, 1));
                map2.put("site_id", new C17771s.a("site_id", "INTEGER", true, 0, null, 1));
                map2.put("site_name", new C17771s.a("site_name", "TEXT", false, 0, null, 1));
                map2.put("site_phone", new C17771s.a("site_phone", "TEXT", false, 0, null, 1));
                map2.put("site_streetAddress", new C17771s.a("site_streetAddress", "TEXT", false, 0, null, 1));
                map2.put("site_fullAddress", new C17771s.a("site_fullAddress", "TEXT", false, 0, null, 1));
                map2.put("site_locality", new C17771s.a("site_locality", "TEXT", false, 0, null, 1));
                map2.put("site_region", new C17771s.a("site_region", "TEXT", false, 0, null, 1));
                map2.put("site_country", new C17771s.a("site_country", "TEXT", false, 0, null, 1));
                map2.put("site_postalCode", new C17771s.a("site_postalCode", "TEXT", false, 0, null, 1));
                map2.put("site_latitude", new C17771s.a("site_latitude", "TEXT", false, 0, null, 1));
                map2.put("site_longitude", new C17771s.a("site_longitude", "TEXT", false, 0, null, 1));
                map2.put("site_coverPhotoUrl", new C17771s.a("site_coverPhotoUrl", "TEXT", false, 0, null, 1));
                map2.put("site_iconUrl", new C17771s.a("site_iconUrl", "TEXT", false, 0, null, 1));
                map2.put("site_instructions", new C17771s.a("site_instructions", "TEXT", false, 0, null, 1));
                map2.put("site_description", new C17771s.a("site_description", "TEXT", false, 0, null, 1));
                map2.put("site_partnerIdentifier", new C17771s.a("site_partnerIdentifier", "TEXT", false, 0, null, 1));
                map2.put("site_wrongSiteArrivalRadius", new C17771s.a("site_wrongSiteArrivalRadius", "REAL", true, 0, "250.0", 1));
                map2.put("site_operationalStatus", new C17771s.a("site_operationalStatus", "TEXT", true, 0, "'live'", 1));
                map2.put("site_prearrivalSeconds", new C17771s.a("site_prearrivalSeconds", "INTEGER", true, 0, "0", 1));
                map2.put("site_pickupConfig", new C17771s.a("site_pickupConfig", "TEXT", true, 0, "''", 1));
                map2.put("site_geofence_latitude", new C17771s.a("site_geofence_latitude", "REAL", false, 0, "0", 1));
                map2.put("site_geofence_longitude", new C17771s.a("site_geofence_longitude", "REAL", false, 0, "0", 1));
                map2.put("site_geofence_radius", new C17771s.a("site_geofence_radius", "REAL", false, 0, "0", 1));
                map2.put("customer_name", new C17771s.a("customer_name", "TEXT", true, 0, null, 1));
                map2.put("customer_phone", new C17771s.a("customer_phone", "TEXT", false, 0, null, 1));
                map2.put("customer_carType", new C17771s.a("customer_carType", "TEXT", true, 0, null, 1));
                map2.put("customer_carColor", new C17771s.a("customer_carColor", "TEXT", true, 0, null, 1));
                map2.put("customer_licensePlate", new C17771s.a("customer_licensePlate", "TEXT", true, 0, null, 1));
                C17771s c17771s2 = new C17771s("orders", map2, new HashSet(0), new HashSet(0));
                C17771s c17771sA2 = C17771s.a(cVar, "orders");
                if (!c17771s2.equals(c17771sA2)) {
                    return new M.c(false, "orders(com.radiusnetworks.flybuy.sdk.data.room.domain.Order).\n Expected:\n" + c17771s2 + "\n Found:\n" + c17771sA2);
                }
                HashMap map3 = new HashMap(5);
                map3.put("uuid", new C17771s.a("uuid", "TEXT", true, 0, null, 1));
                map3.put("major", new C17771s.a("major", "INTEGER", false, 0, null, 1));
                map3.put("minor", new C17771s.a("minor", "INTEGER", false, 0, null, 1));
                map3.put("order_id", new C17771s.a("order_id", "INTEGER", true, 0, null, 1));
                map3.put(PreferencesHelper.PREF_ID, new C17771s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                HashSet hashSet = new HashSet(1);
                hashSet.add(new C17771s.c("orders", "CASCADE", "NO ACTION", Arrays.asList("order_id"), Arrays.asList(PreferencesHelper.PREF_ID)));
                C17771s c17771s3 = new C17771s("beacon_regions", map3, hashSet, new HashSet(0));
                C17771s c17771sA3 = C17771s.a(cVar, "beacon_regions");
                if (!c17771s3.equals(c17771sA3)) {
                    return new M.c(false, "beacon_regions(com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion).\n Expected:\n" + c17771s3 + "\n Found:\n" + c17771sA3);
                }
                HashMap map4 = new HashMap(23);
                map4.put(PreferencesHelper.PREF_ID, new C17771s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map4.put("name", new C17771s.a("name", "TEXT", false, 0, null, 1));
                map4.put("phone", new C17771s.a("phone", "TEXT", false, 0, null, 1));
                map4.put("streetAddress", new C17771s.a("streetAddress", "TEXT", false, 0, null, 1));
                map4.put("fullAddress", new C17771s.a("fullAddress", "TEXT", false, 0, null, 1));
                map4.put(PlaceTypes.LOCALITY, new C17771s.a(PlaceTypes.LOCALITY, "TEXT", false, 0, null, 1));
                map4.put("region", new C17771s.a("region", "TEXT", false, 0, null, 1));
                map4.put(PlaceTypes.COUNTRY, new C17771s.a(PlaceTypes.COUNTRY, "TEXT", false, 0, null, 1));
                map4.put("postalCode", new C17771s.a("postalCode", "TEXT", false, 0, null, 1));
                map4.put("latitude", new C17771s.a("latitude", "TEXT", false, 0, null, 1));
                map4.put("longitude", new C17771s.a("longitude", "TEXT", false, 0, null, 1));
                map4.put("coverPhotoUrl", new C17771s.a("coverPhotoUrl", "TEXT", false, 0, null, 1));
                map4.put("iconUrl", new C17771s.a("iconUrl", "TEXT", false, 0, null, 1));
                map4.put("instructions", new C17771s.a("instructions", "TEXT", false, 0, null, 1));
                map4.put("description", new C17771s.a("description", "TEXT", false, 0, null, 1));
                map4.put("partnerIdentifier", new C17771s.a("partnerIdentifier", "TEXT", false, 0, null, 1));
                map4.put("wrongSiteArrivalRadius", new C17771s.a("wrongSiteArrivalRadius", "REAL", true, 0, "250.0", 1));
                map4.put("operationalStatus", new C17771s.a("operationalStatus", "TEXT", true, 0, "'live'", 1));
                map4.put("prearrivalSeconds", new C17771s.a("prearrivalSeconds", "INTEGER", true, 0, "0", 1));
                map4.put("pickupConfig", new C17771s.a("pickupConfig", "TEXT", true, 0, "''", 1));
                map4.put("geofence_latitude", new C17771s.a("geofence_latitude", "REAL", false, 0, "0", 1));
                map4.put("geofence_longitude", new C17771s.a("geofence_longitude", "REAL", false, 0, "0", 1));
                map4.put("geofence_radius", new C17771s.a("geofence_radius", "REAL", false, 0, "0", 1));
                C17771s c17771s4 = new C17771s("sites", map4, new HashSet(0), new HashSet(0));
                C17771s c17771sA4 = C17771s.a(cVar, "sites");
                if (c17771s4.equals(c17771sA4)) {
                    return new M.c(true, null);
                }
                return new M.c(false, "sites(com.radiusnetworks.flybuy.sdk.data.room.domain.Site).\n Expected:\n" + c17771s4 + "\n Found:\n" + c17771sA4);
            }

            @Override // androidx.room.M.b
            public void onPreMigrate(c cVar) {
                C17754b.b(cVar);
            }
        }, "9e245313709e91c5921e9e96901cd15a", "38f2ff12ff5ac9652293111a394fdd5a")).b());
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase
    public CustomerDao customerDao$core_defaultRelease() {
        CustomerDao customerDao;
        if (this._customerDao != null) {
            return this._customerDao;
        }
        synchronized (this) {
            try {
                if (this._customerDao == null) {
                    this._customerDao = new CustomerDao_Impl(this);
                }
                customerDao = this._customerDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return customerDao;
    }

    @Override // androidx.room.G
    public List<b> getAutoMigrations(Map<Class<? extends InterfaceC17221a>, InterfaceC17221a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17221a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(OrderDao.class, OrderDao_Impl.getRequiredConverters());
        map.put(CustomerDao.class, CustomerDao_Impl.getRequiredConverters());
        map.put(BeaconRegionDao.class, BeaconRegionDao_Impl.getRequiredConverters());
        map.put(SiteDao.class, SiteDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase
    public OrderDao orderDao$core_defaultRelease() {
        OrderDao orderDao;
        if (this._orderDao != null) {
            return this._orderDao;
        }
        synchronized (this) {
            try {
                if (this._orderDao == null) {
                    this._orderDao = new OrderDao_Impl(this);
                }
                orderDao = this._orderDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return orderDao;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase
    public SiteDao siteDao$core_defaultRelease() {
        SiteDao siteDao;
        if (this._siteDao != null) {
            return this._siteDao;
        }
        synchronized (this) {
            try {
                if (this._siteDao == null) {
                    this._siteDao = new SiteDao_Impl(this);
                }
                siteDao = this._siteDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return siteDao;
    }
}
