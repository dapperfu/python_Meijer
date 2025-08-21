package com.radiusnetworks.flybuy.sdk.data.room.database;

import B4.c;
import B4.d;
import android.database.SQLException;
import androidx.room.C6261e;
import androidx.room.C6273q;
import androidx.room.G;
import androidx.room.M;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao_Impl;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.AbstractC17349b;
import u4.InterfaceC17348a;
import w4.C17824b;
import w4.C17841s;

/* loaded from: classes12.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile AnalyticsEventsDao _analyticsEventsDao;
    private volatile BeaconRegionDao _beaconRegionDao;
    private volatile CustomerDao _customerDao;
    private volatile OrderDao _orderDao;
    private volatile SiteDao _siteDao;

    @Override // com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase
    public AnalyticsEventsDao analyticsEventsDao$core_defaultRelease() {
        AnalyticsEventsDao analyticsEventsDao;
        if (this._analyticsEventsDao != null) {
            return this._analyticsEventsDao;
        }
        synchronized (this) {
            try {
                if (this._analyticsEventsDao == null) {
                    this._analyticsEventsDao = new AnalyticsEventsDao_Impl(this);
                }
                analyticsEventsDao = this._analyticsEventsDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return analyticsEventsDao;
    }

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
        c cVarC2 = getOpenHelper().C2();
        try {
            beginTransaction();
            cVarC2.S("PRAGMA defer_foreign_keys = TRUE");
            cVarC2.S("DELETE FROM `customers`");
            cVarC2.S("DELETE FROM `orders`");
            cVarC2.S("DELETE FROM `beacon_regions`");
            cVarC2.S("DELETE FROM `sites`");
            cVarC2.S("DELETE FROM `analytics_events`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            cVarC2.E2("PRAGMA wal_checkpoint(FULL)").close();
            if (!cVarC2.j3()) {
                cVarC2.S("VACUUM");
            }
        }
    }

    @Override // androidx.room.G
    public C6273q createInvalidationTracker() {
        return new C6273q(this, new HashMap(0), new HashMap(0), "customers", "orders", "beacon_regions", "sites", "analytics_events");
    }

    @Override // androidx.room.G
    public d createOpenHelper(C6261e c6261e) {
        return c6261e.sqliteOpenHelperFactory.a(d.b.a(c6261e.context).d(c6261e.name).c(new M(c6261e, new M.b(35) { // from class: com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase_Impl.1
            @Override // androidx.room.M.b
            public void onPostMigrate(c cVar) {
            }

            @Override // androidx.room.M.b
            public void createAllTables(c cVar) throws SQLException {
                a.a(cVar, "CREATE TABLE IF NOT EXISTS `customers` (`id` INTEGER NOT NULL, `apiToken` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `deletedAt` TEXT, `email` TEXT, `name` TEXT NOT NULL, `phone` TEXT, `carType` TEXT, `carColor` TEXT, `licensePlate` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `orders` (`id` INTEGER NOT NULL, `type` TEXT, `createdAt` TEXT NOT NULL, `arrivedAt` TEXT, `updatedAt` TEXT NOT NULL, `redeemedAt` TEXT, `customerState` TEXT NOT NULL DEFAULT 'created', `state` TEXT NOT NULL DEFAULT 'created', `etaAt` TEXT, `displayName` TEXT, `displayDetail` TEXT, `partnerIdentifier` TEXT, `partnerIdentifierForCustomer` TEXT, `partnerIdentifierForCrew` TEXT, `redemptionCode` TEXT, `customerId` TEXT, `pickupType` TEXT, `customerRatingValue` INTEGER, `customerRatingComments` TEXT, `pushToken` TEXT, `alwaysShowVehicleInfoFields` INTEGER NOT NULL DEFAULT 0, `customerNameEditingEnabled` INTEGER NOT NULL DEFAULT 0, `pickupTypeSelectionEnabled` INTEGER NOT NULL DEFAULT 0, `requireVehicleInfoIfVisible` INTEGER NOT NULL DEFAULT 0, `curbsideLocalizedString` TEXT, `pickupLocalizedString` TEXT, `locationTrackingEnabled` INTEGER NOT NULL DEFAULT 0, `projectAccentColor` TEXT, `projectAccentTextColor` TEXT, `spotIdentifier` TEXT, `spotIdentifierEntryEnabled` INTEGER NOT NULL DEFAULT 0, `spotIdentifierInputType` TEXT NOT NULL DEFAULT 'text', `wrongSiteDetectionEnabled` INTEGER NOT NULL DEFAULT 0, `distanceFilteringDisabled` INTEGER NOT NULL DEFAULT 0, `wrongSiteSearchRadius` REAL NOT NULL DEFAULT 40000.0, `wrongSiteId` INTEGER, `handoffVehicleLocation` TEXT, `estimatedReadyAt` TEXT, `orderFiredAt` TEXT, `pickup_window_start` TEXT, `pickup_window_end` TEXT, `site_id` INTEGER NOT NULL, `site_name` TEXT, `site_phone` TEXT, `site_streetAddress` TEXT, `site_fullAddress` TEXT, `site_locality` TEXT, `site_region` TEXT, `site_country` TEXT, `site_postalCode` TEXT, `site_latitude` TEXT, `site_longitude` TEXT, `site_coverPhotoUrl` TEXT, `site_iconUrl` TEXT, `site_instructions` TEXT, `site_description` TEXT, `site_partnerIdentifier` TEXT, `site_wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `site_operationalStatus` TEXT NOT NULL DEFAULT 'live', `site_prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `site_pickupConfig` TEXT NOT NULL DEFAULT '', `site_geofence_latitude` REAL DEFAULT 0, `site_geofence_longitude` REAL DEFAULT 0, `site_geofence_radius` REAL DEFAULT 0, `customer_name` TEXT NOT NULL, `customer_phone` TEXT, `customer_carType` TEXT NOT NULL, `customer_carColor` TEXT NOT NULL, `customer_licensePlate` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `beacon_regions` (`uuid` TEXT NOT NULL, `major` INTEGER, `minor` INTEGER, `order_id` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`order_id`) REFERENCES `orders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `sites` (`id` INTEGER NOT NULL, `name` TEXT, `phone` TEXT, `streetAddress` TEXT, `fullAddress` TEXT, `locality` TEXT, `region` TEXT, `country` TEXT, `postalCode` TEXT, `latitude` TEXT, `longitude` TEXT, `coverPhotoUrl` TEXT, `iconUrl` TEXT, `instructions` TEXT, `description` TEXT, `partnerIdentifier` TEXT, `wrongSiteArrivalRadius` REAL NOT NULL DEFAULT 250.0, `operationalStatus` TEXT NOT NULL DEFAULT 'live', `prearrivalSeconds` INTEGER NOT NULL DEFAULT 0, `pickupConfig` TEXT NOT NULL DEFAULT '', `geofence_latitude` REAL DEFAULT 0, `geofence_longitude` REAL DEFAULT 0, `geofence_radius` REAL DEFAULT 0, PRIMARY KEY(`id`))");
                cVar.S("CREATE TABLE IF NOT EXISTS `analytics_events` (`guid` TEXT NOT NULL, `name` TEXT NOT NULL, `occurredAt` TEXT NOT NULL, `projectId` INTEGER NOT NULL, `orderId` INTEGER, `promotionId` INTEGER, `shortLinkId` INTEGER, `siteId` INTEGER, `data` TEXT NOT NULL, PRIMARY KEY(`guid`))");
                cVar.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '91b1e1c0e16407a6e6dda4e6f07841f5')");
            }

            @Override // androidx.room.M.b
            public void dropAllTables(c cVar) throws SQLException {
                a.a(cVar, "DROP TABLE IF EXISTS `customers`", "DROP TABLE IF EXISTS `orders`", "DROP TABLE IF EXISTS `beacon_regions`", "DROP TABLE IF EXISTS `sites`");
                cVar.S("DROP TABLE IF EXISTS `analytics_events`");
                List list = ((G) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G.b) it.next()).d(cVar);
                    }
                }
            }

            @Override // androidx.room.M.b
            public void onCreate(c cVar) {
                List list = ((G) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G.b) it.next()).b(cVar);
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
                        ((G.b) it.next()).f(cVar);
                    }
                }
            }

            @Override // androidx.room.M.b
            public M.c onValidateSchema(c cVar) {
                HashMap map = new HashMap(11);
                map.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map.put("apiToken", new C17841s.a("apiToken", "TEXT", true, 0, null, 1));
                map.put("createdAt", new C17841s.a("createdAt", "TEXT", true, 0, null, 1));
                map.put("updatedAt", new C17841s.a("updatedAt", "TEXT", true, 0, null, 1));
                map.put("deletedAt", new C17841s.a("deletedAt", "TEXT", false, 0, null, 1));
                map.put("email", new C17841s.a("email", "TEXT", false, 0, null, 1));
                map.put("name", new C17841s.a("name", "TEXT", true, 0, null, 1));
                map.put("phone", new C17841s.a("phone", "TEXT", false, 0, null, 1));
                map.put("carType", new C17841s.a("carType", "TEXT", false, 0, null, 1));
                map.put("carColor", new C17841s.a("carColor", "TEXT", false, 0, null, 1));
                map.put("licensePlate", new C17841s.a("licensePlate", "TEXT", false, 0, null, 1));
                C17841s c17841s = new C17841s("customers", map, new HashSet(0), new HashSet(0));
                C17841s c17841sA = C17841s.a(cVar, "customers");
                if (!c17841s.equals(c17841sA)) {
                    return new M.c(false, "customers(com.radiusnetworks.flybuy.sdk.data.room.domain.Customer).\n Expected:\n" + c17841s + "\n Found:\n" + c17841sA);
                }
                HashMap map2 = new HashMap(69);
                map2.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map2.put("type", new C17841s.a("type", "TEXT", false, 0, null, 1));
                map2.put("createdAt", new C17841s.a("createdAt", "TEXT", true, 0, null, 1));
                map2.put("arrivedAt", new C17841s.a("arrivedAt", "TEXT", false, 0, null, 1));
                map2.put("updatedAt", new C17841s.a("updatedAt", "TEXT", true, 0, null, 1));
                map2.put("redeemedAt", new C17841s.a("redeemedAt", "TEXT", false, 0, null, 1));
                map2.put("customerState", new C17841s.a("customerState", "TEXT", true, 0, "'created'", 1));
                map2.put("state", new C17841s.a("state", "TEXT", true, 0, "'created'", 1));
                map2.put("etaAt", new C17841s.a("etaAt", "TEXT", false, 0, null, 1));
                map2.put("displayName", new C17841s.a("displayName", "TEXT", false, 0, null, 1));
                map2.put("displayDetail", new C17841s.a("displayDetail", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifier", new C17841s.a("partnerIdentifier", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifierForCustomer", new C17841s.a("partnerIdentifierForCustomer", "TEXT", false, 0, null, 1));
                map2.put("partnerIdentifierForCrew", new C17841s.a("partnerIdentifierForCrew", "TEXT", false, 0, null, 1));
                map2.put("redemptionCode", new C17841s.a("redemptionCode", "TEXT", false, 0, null, 1));
                map2.put("customerId", new C17841s.a("customerId", "TEXT", false, 0, null, 1));
                map2.put("pickupType", new C17841s.a("pickupType", "TEXT", false, 0, null, 1));
                map2.put("customerRatingValue", new C17841s.a("customerRatingValue", "INTEGER", false, 0, null, 1));
                map2.put("customerRatingComments", new C17841s.a("customerRatingComments", "TEXT", false, 0, null, 1));
                map2.put("pushToken", new C17841s.a("pushToken", "TEXT", false, 0, null, 1));
                map2.put("alwaysShowVehicleInfoFields", new C17841s.a("alwaysShowVehicleInfoFields", "INTEGER", true, 0, "0", 1));
                map2.put("customerNameEditingEnabled", new C17841s.a("customerNameEditingEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("pickupTypeSelectionEnabled", new C17841s.a("pickupTypeSelectionEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("requireVehicleInfoIfVisible", new C17841s.a("requireVehicleInfoIfVisible", "INTEGER", true, 0, "0", 1));
                map2.put("curbsideLocalizedString", new C17841s.a("curbsideLocalizedString", "TEXT", false, 0, null, 1));
                map2.put("pickupLocalizedString", new C17841s.a("pickupLocalizedString", "TEXT", false, 0, null, 1));
                map2.put("locationTrackingEnabled", new C17841s.a("locationTrackingEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("projectAccentColor", new C17841s.a("projectAccentColor", "TEXT", false, 0, null, 1));
                map2.put("projectAccentTextColor", new C17841s.a("projectAccentTextColor", "TEXT", false, 0, null, 1));
                map2.put("spotIdentifier", new C17841s.a("spotIdentifier", "TEXT", false, 0, null, 1));
                map2.put("spotIdentifierEntryEnabled", new C17841s.a("spotIdentifierEntryEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("spotIdentifierInputType", new C17841s.a("spotIdentifierInputType", "TEXT", true, 0, "'text'", 1));
                map2.put("wrongSiteDetectionEnabled", new C17841s.a("wrongSiteDetectionEnabled", "INTEGER", true, 0, "0", 1));
                map2.put("distanceFilteringDisabled", new C17841s.a("distanceFilteringDisabled", "INTEGER", true, 0, "0", 1));
                map2.put("wrongSiteSearchRadius", new C17841s.a("wrongSiteSearchRadius", "REAL", true, 0, "40000.0", 1));
                map2.put("wrongSiteId", new C17841s.a("wrongSiteId", "INTEGER", false, 0, null, 1));
                map2.put("handoffVehicleLocation", new C17841s.a("handoffVehicleLocation", "TEXT", false, 0, null, 1));
                map2.put("estimatedReadyAt", new C17841s.a("estimatedReadyAt", "TEXT", false, 0, null, 1));
                map2.put("orderFiredAt", new C17841s.a("orderFiredAt", "TEXT", false, 0, null, 1));
                map2.put("pickup_window_start", new C17841s.a("pickup_window_start", "TEXT", false, 0, null, 1));
                map2.put("pickup_window_end", new C17841s.a("pickup_window_end", "TEXT", false, 0, null, 1));
                map2.put(NotificationsManager.INTENT_EXTRA_SITE_ID, new C17841s.a(NotificationsManager.INTENT_EXTRA_SITE_ID, "INTEGER", true, 0, null, 1));
                map2.put("site_name", new C17841s.a("site_name", "TEXT", false, 0, null, 1));
                map2.put("site_phone", new C17841s.a("site_phone", "TEXT", false, 0, null, 1));
                map2.put("site_streetAddress", new C17841s.a("site_streetAddress", "TEXT", false, 0, null, 1));
                map2.put("site_fullAddress", new C17841s.a("site_fullAddress", "TEXT", false, 0, null, 1));
                map2.put("site_locality", new C17841s.a("site_locality", "TEXT", false, 0, null, 1));
                map2.put("site_region", new C17841s.a("site_region", "TEXT", false, 0, null, 1));
                map2.put("site_country", new C17841s.a("site_country", "TEXT", false, 0, null, 1));
                map2.put("site_postalCode", new C17841s.a("site_postalCode", "TEXT", false, 0, null, 1));
                map2.put("site_latitude", new C17841s.a("site_latitude", "TEXT", false, 0, null, 1));
                map2.put("site_longitude", new C17841s.a("site_longitude", "TEXT", false, 0, null, 1));
                map2.put("site_coverPhotoUrl", new C17841s.a("site_coverPhotoUrl", "TEXT", false, 0, null, 1));
                map2.put("site_iconUrl", new C17841s.a("site_iconUrl", "TEXT", false, 0, null, 1));
                map2.put("site_instructions", new C17841s.a("site_instructions", "TEXT", false, 0, null, 1));
                map2.put("site_description", new C17841s.a("site_description", "TEXT", false, 0, null, 1));
                map2.put("site_partnerIdentifier", new C17841s.a("site_partnerIdentifier", "TEXT", false, 0, null, 1));
                map2.put("site_wrongSiteArrivalRadius", new C17841s.a("site_wrongSiteArrivalRadius", "REAL", true, 0, "250.0", 1));
                map2.put("site_operationalStatus", new C17841s.a("site_operationalStatus", "TEXT", true, 0, "'live'", 1));
                map2.put("site_prearrivalSeconds", new C17841s.a("site_prearrivalSeconds", "INTEGER", true, 0, "0", 1));
                map2.put("site_pickupConfig", new C17841s.a("site_pickupConfig", "TEXT", true, 0, "''", 1));
                map2.put("site_geofence_latitude", new C17841s.a("site_geofence_latitude", "REAL", false, 0, "0", 1));
                map2.put("site_geofence_longitude", new C17841s.a("site_geofence_longitude", "REAL", false, 0, "0", 1));
                map2.put("site_geofence_radius", new C17841s.a("site_geofence_radius", "REAL", false, 0, "0", 1));
                map2.put("customer_name", new C17841s.a("customer_name", "TEXT", true, 0, null, 1));
                map2.put("customer_phone", new C17841s.a("customer_phone", "TEXT", false, 0, null, 1));
                map2.put("customer_carType", new C17841s.a("customer_carType", "TEXT", true, 0, null, 1));
                map2.put("customer_carColor", new C17841s.a("customer_carColor", "TEXT", true, 0, null, 1));
                map2.put("customer_licensePlate", new C17841s.a("customer_licensePlate", "TEXT", true, 0, null, 1));
                C17841s c17841s2 = new C17841s("orders", map2, new HashSet(0), new HashSet(0));
                C17841s c17841sA2 = C17841s.a(cVar, "orders");
                if (!c17841s2.equals(c17841sA2)) {
                    return new M.c(false, "orders(com.radiusnetworks.flybuy.sdk.data.room.domain.Order).\n Expected:\n" + c17841s2 + "\n Found:\n" + c17841sA2);
                }
                HashMap map3 = new HashMap(5);
                map3.put("uuid", new C17841s.a("uuid", "TEXT", true, 0, null, 1));
                map3.put("major", new C17841s.a("major", "INTEGER", false, 0, null, 1));
                map3.put("minor", new C17841s.a("minor", "INTEGER", false, 0, null, 1));
                map3.put(NotificationsManager.INTENT_EXTRA_ORDER_ID, new C17841s.a(NotificationsManager.INTENT_EXTRA_ORDER_ID, "INTEGER", true, 0, null, 1));
                map3.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                HashSet hashSet = new HashSet(1);
                hashSet.add(new C17841s.c("orders", "CASCADE", "NO ACTION", Arrays.asList(NotificationsManager.INTENT_EXTRA_ORDER_ID), Arrays.asList(PreferencesHelper.PREF_ID)));
                C17841s c17841s3 = new C17841s("beacon_regions", map3, hashSet, new HashSet(0));
                C17841s c17841sA3 = C17841s.a(cVar, "beacon_regions");
                if (!c17841s3.equals(c17841sA3)) {
                    return new M.c(false, "beacon_regions(com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion).\n Expected:\n" + c17841s3 + "\n Found:\n" + c17841sA3);
                }
                HashMap map4 = new HashMap(23);
                map4.put(PreferencesHelper.PREF_ID, new C17841s.a(PreferencesHelper.PREF_ID, "INTEGER", true, 1, null, 1));
                map4.put("name", new C17841s.a("name", "TEXT", false, 0, null, 1));
                map4.put("phone", new C17841s.a("phone", "TEXT", false, 0, null, 1));
                map4.put("streetAddress", new C17841s.a("streetAddress", "TEXT", false, 0, null, 1));
                map4.put("fullAddress", new C17841s.a("fullAddress", "TEXT", false, 0, null, 1));
                map4.put(PlaceTypes.LOCALITY, new C17841s.a(PlaceTypes.LOCALITY, "TEXT", false, 0, null, 1));
                map4.put("region", new C17841s.a("region", "TEXT", false, 0, null, 1));
                map4.put(PlaceTypes.COUNTRY, new C17841s.a(PlaceTypes.COUNTRY, "TEXT", false, 0, null, 1));
                map4.put("postalCode", new C17841s.a("postalCode", "TEXT", false, 0, null, 1));
                map4.put("latitude", new C17841s.a("latitude", "TEXT", false, 0, null, 1));
                map4.put("longitude", new C17841s.a("longitude", "TEXT", false, 0, null, 1));
                map4.put("coverPhotoUrl", new C17841s.a("coverPhotoUrl", "TEXT", false, 0, null, 1));
                map4.put("iconUrl", new C17841s.a("iconUrl", "TEXT", false, 0, null, 1));
                map4.put("instructions", new C17841s.a("instructions", "TEXT", false, 0, null, 1));
                map4.put("description", new C17841s.a("description", "TEXT", false, 0, null, 1));
                map4.put("partnerIdentifier", new C17841s.a("partnerIdentifier", "TEXT", false, 0, null, 1));
                map4.put("wrongSiteArrivalRadius", new C17841s.a("wrongSiteArrivalRadius", "REAL", true, 0, "250.0", 1));
                map4.put("operationalStatus", new C17841s.a("operationalStatus", "TEXT", true, 0, "'live'", 1));
                map4.put("prearrivalSeconds", new C17841s.a("prearrivalSeconds", "INTEGER", true, 0, "0", 1));
                map4.put("pickupConfig", new C17841s.a("pickupConfig", "TEXT", true, 0, "''", 1));
                map4.put("geofence_latitude", new C17841s.a("geofence_latitude", "REAL", false, 0, "0", 1));
                map4.put("geofence_longitude", new C17841s.a("geofence_longitude", "REAL", false, 0, "0", 1));
                map4.put("geofence_radius", new C17841s.a("geofence_radius", "REAL", false, 0, "0", 1));
                C17841s c17841s4 = new C17841s("sites", map4, new HashSet(0), new HashSet(0));
                C17841s c17841sA4 = C17841s.a(cVar, "sites");
                if (!c17841s4.equals(c17841sA4)) {
                    return new M.c(false, "sites(com.radiusnetworks.flybuy.sdk.data.room.domain.Site).\n Expected:\n" + c17841s4 + "\n Found:\n" + c17841sA4);
                }
                HashMap map5 = new HashMap(9);
                map5.put("guid", new C17841s.a("guid", "TEXT", true, 1, null, 1));
                map5.put("name", new C17841s.a("name", "TEXT", true, 0, null, 1));
                map5.put("occurredAt", new C17841s.a("occurredAt", "TEXT", true, 0, null, 1));
                map5.put("projectId", new C17841s.a("projectId", "INTEGER", true, 0, null, 1));
                map5.put("orderId", new C17841s.a("orderId", "INTEGER", false, 0, null, 1));
                map5.put("promotionId", new C17841s.a("promotionId", "INTEGER", false, 0, null, 1));
                map5.put("shortLinkId", new C17841s.a("shortLinkId", "INTEGER", false, 0, null, 1));
                map5.put("siteId", new C17841s.a("siteId", "INTEGER", false, 0, null, 1));
                map5.put("data", new C17841s.a("data", "TEXT", true, 0, null, 1));
                C17841s c17841s5 = new C17841s("analytics_events", map5, new HashSet(0), new HashSet(0));
                C17841s c17841sA5 = C17841s.a(cVar, "analytics_events");
                if (c17841s5.equals(c17841sA5)) {
                    return new M.c(true, null);
                }
                return new M.c(false, "analytics_events(com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent).\n Expected:\n" + c17841s5 + "\n Found:\n" + c17841sA5);
            }

            @Override // androidx.room.M.b
            public void onPreMigrate(c cVar) {
                C17824b.c(cVar);
            }
        }, "91b1e1c0e16407a6e6dda4e6f07841f5", "79084b879e97be9ee842b0191454c9d3")).b());
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
    public List<AbstractC17349b> getAutoMigrations(Map<Class<? extends InterfaceC17348a>, InterfaceC17348a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.G
    public Set<Class<? extends InterfaceC17348a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(OrderDao.class, OrderDao_Impl.getRequiredConverters());
        map.put(CustomerDao.class, CustomerDao_Impl.getRequiredConverters());
        map.put(BeaconRegionDao.class, BeaconRegionDao_Impl.getRequiredConverters());
        map.put(SiteDao.class, SiteDao_Impl.getRequiredConverters());
        map.put(AnalyticsEventsDao.class, AnalyticsEventsDao_Impl.getRequiredConverters());
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
