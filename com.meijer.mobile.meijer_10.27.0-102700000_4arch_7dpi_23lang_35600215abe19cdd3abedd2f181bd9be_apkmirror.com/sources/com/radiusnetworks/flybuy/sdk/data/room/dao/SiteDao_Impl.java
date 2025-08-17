package com.radiusnetworks.flybuy.sdk.data.room.dao;

import A4.g;
import android.database.Cursor;
import androidx.room.AbstractC6122h;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.view.AbstractC5985A;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import com.radiusnetworks.flybuy.sdk.data.room.RoomConverters;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import w4.C17753a;
import w4.C17754b;

/* loaded from: classes11.dex */
public final class SiteDao_Impl implements SiteDao {
    private final G __db;
    private final AbstractC6124j<Site> __insertionAdapterOfSite;
    private final S __preparedStmtOfDeleteAll;
    private final RoomConverters __roomConverters = new RoomConverters();
    private final AbstractC6122h<Site> __updateAdapterOfSite;

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao
    public List<Site> all() throws Throwable {
        N n10;
        int i10;
        int i11;
        String string;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        CircularRegion circularRegion;
        N nC = N.c("SELECT * FROM sites", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.__db, nC, false, null);
        try {
            int iE = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
            int iE2 = C17753a.e(cursorG, "name");
            int iE3 = C17753a.e(cursorG, "phone");
            int iE4 = C17753a.e(cursorG, "streetAddress");
            int iE5 = C17753a.e(cursorG, "fullAddress");
            int iE6 = C17753a.e(cursorG, PlaceTypes.LOCALITY);
            int iE7 = C17753a.e(cursorG, "region");
            int iE8 = C17753a.e(cursorG, PlaceTypes.COUNTRY);
            int iE9 = C17753a.e(cursorG, "postalCode");
            int iE10 = C17753a.e(cursorG, "latitude");
            int iE11 = C17753a.e(cursorG, "longitude");
            int iE12 = C17753a.e(cursorG, "coverPhotoUrl");
            int iE13 = C17753a.e(cursorG, "iconUrl");
            n10 = nC;
            try {
                int iE14 = C17753a.e(cursorG, "instructions");
                int iE15 = C17753a.e(cursorG, "description");
                int iE16 = C17753a.e(cursorG, "partnerIdentifier");
                int iE17 = C17753a.e(cursorG, "wrongSiteArrivalRadius");
                int iE18 = C17753a.e(cursorG, "operationalStatus");
                int iE19 = C17753a.e(cursorG, "prearrivalSeconds");
                int iE20 = C17753a.e(cursorG, "pickupConfig");
                int iE21 = C17753a.e(cursorG, "geofence_latitude");
                int iE22 = C17753a.e(cursorG, "geofence_longitude");
                int iE23 = C17753a.e(cursorG, "geofence_radius");
                int i18 = iE14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    int i19 = cursorG.getInt(iE);
                    String string2 = cursorG.isNull(iE2) ? null : cursorG.getString(iE2);
                    String string3 = cursorG.isNull(iE3) ? null : cursorG.getString(iE3);
                    String string4 = cursorG.isNull(iE4) ? null : cursorG.getString(iE4);
                    String string5 = cursorG.isNull(iE5) ? null : cursorG.getString(iE5);
                    String string6 = cursorG.isNull(iE6) ? null : cursorG.getString(iE6);
                    String string7 = cursorG.isNull(iE7) ? null : cursorG.getString(iE7);
                    String string8 = cursorG.isNull(iE8) ? null : cursorG.getString(iE8);
                    String string9 = cursorG.isNull(iE9) ? null : cursorG.getString(iE9);
                    String string10 = cursorG.isNull(iE10) ? null : cursorG.getString(iE10);
                    String string11 = cursorG.isNull(iE11) ? null : cursorG.getString(iE11);
                    String string12 = cursorG.isNull(iE12) ? null : cursorG.getString(iE12);
                    String string13 = cursorG.isNull(iE13) ? null : cursorG.getString(iE13);
                    int i20 = i18;
                    if (cursorG.isNull(i20)) {
                        int i21 = iE15;
                        i10 = iE;
                        i11 = i21;
                        string = null;
                    } else {
                        int i22 = iE15;
                        i10 = iE;
                        i11 = i22;
                        string = cursorG.getString(i20);
                    }
                    if (cursorG.isNull(i11)) {
                        int i23 = iE16;
                        i12 = i11;
                        i13 = i23;
                        str = null;
                    } else {
                        String string14 = cursorG.getString(i11);
                        int i24 = iE16;
                        i12 = i11;
                        i13 = i24;
                        str = string14;
                    }
                    if (cursorG.isNull(i13)) {
                        int i25 = iE17;
                        i14 = i13;
                        i15 = i25;
                        str2 = null;
                    } else {
                        String string15 = cursorG.getString(i13);
                        int i26 = iE17;
                        i14 = i13;
                        i15 = i26;
                        str2 = string15;
                    }
                    double d10 = cursorG.getDouble(i15);
                    int i27 = i15;
                    int i28 = iE18;
                    String string16 = cursorG.getString(i28);
                    iE18 = i28;
                    int i29 = iE19;
                    int i30 = cursorG.getInt(i29);
                    iE19 = i29;
                    int i31 = iE20;
                    int i32 = iE13;
                    PickupConfig pickupConfig = this.__roomConverters.toPickupConfig(cursorG.getString(i31));
                    int i33 = iE21;
                    if (cursorG.isNull(i33)) {
                        i16 = iE22;
                        if (cursorG.isNull(i16)) {
                            i17 = iE23;
                            if (cursorG.isNull(i17)) {
                                circularRegion = null;
                                iE21 = i33;
                                arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                                iE22 = i16;
                                iE23 = i17;
                                iE = i10;
                                iE15 = i12;
                                iE16 = i14;
                                iE17 = i27;
                                iE13 = i32;
                                i18 = i20;
                                iE20 = i31;
                            }
                        }
                        circularRegion = new CircularRegion(cursorG.getDouble(i33), cursorG.getDouble(i16), cursorG.getFloat(i17));
                        iE21 = i33;
                        arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                        iE22 = i16;
                        iE23 = i17;
                        iE = i10;
                        iE15 = i12;
                        iE16 = i14;
                        iE17 = i27;
                        iE13 = i32;
                        i18 = i20;
                        iE20 = i31;
                    } else {
                        i16 = iE22;
                    }
                    i17 = iE23;
                    circularRegion = new CircularRegion(cursorG.getDouble(i33), cursorG.getDouble(i16), cursorG.getFloat(i17));
                    iE21 = i33;
                    arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                    iE22 = i16;
                    iE23 = i17;
                    iE = i10;
                    iE15 = i12;
                    iE16 = i14;
                    iE17 = i27;
                    iE13 = i32;
                    i18 = i20;
                    iE20 = i31;
                }
                cursorG.close();
                n10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                n10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            n10 = nC;
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao
    public AbstractC5985A<List<Site>> allLiveData() {
        final N nC = N.c("SELECT * FROM sites", 0);
        return this.__db.getInvalidationTracker().m(new String[]{"sites"}, false, new Callable<List<Site>>() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<Site> call() throws Exception {
                int i10;
                int i11;
                String string;
                int i12;
                int i13;
                String str;
                int i14;
                int i15;
                String str2;
                int i16;
                int i17;
                CircularRegion circularRegion;
                Cursor cursorG = C17754b.g(SiteDao_Impl.this.__db, nC, false, null);
                try {
                    int iE = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
                    int iE2 = C17753a.e(cursorG, "name");
                    int iE3 = C17753a.e(cursorG, "phone");
                    int iE4 = C17753a.e(cursorG, "streetAddress");
                    int iE5 = C17753a.e(cursorG, "fullAddress");
                    int iE6 = C17753a.e(cursorG, PlaceTypes.LOCALITY);
                    int iE7 = C17753a.e(cursorG, "region");
                    int iE8 = C17753a.e(cursorG, PlaceTypes.COUNTRY);
                    int iE9 = C17753a.e(cursorG, "postalCode");
                    int iE10 = C17753a.e(cursorG, "latitude");
                    int iE11 = C17753a.e(cursorG, "longitude");
                    int iE12 = C17753a.e(cursorG, "coverPhotoUrl");
                    int iE13 = C17753a.e(cursorG, "iconUrl");
                    int iE14 = C17753a.e(cursorG, "instructions");
                    int iE15 = C17753a.e(cursorG, "description");
                    int iE16 = C17753a.e(cursorG, "partnerIdentifier");
                    int iE17 = C17753a.e(cursorG, "wrongSiteArrivalRadius");
                    int iE18 = C17753a.e(cursorG, "operationalStatus");
                    int iE19 = C17753a.e(cursorG, "prearrivalSeconds");
                    int iE20 = C17753a.e(cursorG, "pickupConfig");
                    int iE21 = C17753a.e(cursorG, "geofence_latitude");
                    int iE22 = C17753a.e(cursorG, "geofence_longitude");
                    int iE23 = C17753a.e(cursorG, "geofence_radius");
                    int i18 = iE14;
                    ArrayList arrayList = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        int i19 = cursorG.getInt(iE);
                        String string2 = cursorG.isNull(iE2) ? null : cursorG.getString(iE2);
                        String string3 = cursorG.isNull(iE3) ? null : cursorG.getString(iE3);
                        String string4 = cursorG.isNull(iE4) ? null : cursorG.getString(iE4);
                        String string5 = cursorG.isNull(iE5) ? null : cursorG.getString(iE5);
                        String string6 = cursorG.isNull(iE6) ? null : cursorG.getString(iE6);
                        String string7 = cursorG.isNull(iE7) ? null : cursorG.getString(iE7);
                        String string8 = cursorG.isNull(iE8) ? null : cursorG.getString(iE8);
                        String string9 = cursorG.isNull(iE9) ? null : cursorG.getString(iE9);
                        String string10 = cursorG.isNull(iE10) ? null : cursorG.getString(iE10);
                        String string11 = cursorG.isNull(iE11) ? null : cursorG.getString(iE11);
                        String string12 = cursorG.isNull(iE12) ? null : cursorG.getString(iE12);
                        String string13 = cursorG.isNull(iE13) ? null : cursorG.getString(iE13);
                        int i20 = i18;
                        if (cursorG.isNull(i20)) {
                            int i21 = iE15;
                            i10 = iE;
                            i11 = i21;
                            string = null;
                        } else {
                            int i22 = iE15;
                            i10 = iE;
                            i11 = i22;
                            string = cursorG.getString(i20);
                        }
                        if (cursorG.isNull(i11)) {
                            int i23 = iE16;
                            i12 = i11;
                            i13 = i23;
                            str = null;
                        } else {
                            String string14 = cursorG.getString(i11);
                            int i24 = iE16;
                            i12 = i11;
                            i13 = i24;
                            str = string14;
                        }
                        if (cursorG.isNull(i13)) {
                            int i25 = iE17;
                            i14 = i13;
                            i15 = i25;
                            str2 = null;
                        } else {
                            String string15 = cursorG.getString(i13);
                            int i26 = iE17;
                            i14 = i13;
                            i15 = i26;
                            str2 = string15;
                        }
                        double d10 = cursorG.getDouble(i15);
                        int i27 = i15;
                        int i28 = iE18;
                        String string16 = cursorG.getString(i28);
                        iE18 = i28;
                        int i29 = iE19;
                        int i30 = cursorG.getInt(i29);
                        iE19 = i29;
                        int i31 = iE20;
                        int i32 = iE2;
                        PickupConfig pickupConfig = SiteDao_Impl.this.__roomConverters.toPickupConfig(cursorG.getString(i31));
                        int i33 = iE21;
                        if (cursorG.isNull(i33)) {
                            i16 = iE22;
                            if (cursorG.isNull(i16)) {
                                i17 = iE23;
                                if (cursorG.isNull(i17)) {
                                    circularRegion = null;
                                    iE21 = i33;
                                    arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                                    iE22 = i16;
                                    iE23 = i17;
                                    iE = i10;
                                    iE15 = i12;
                                    iE16 = i14;
                                    iE2 = i32;
                                    iE17 = i27;
                                    i18 = i20;
                                    iE20 = i31;
                                }
                            }
                            circularRegion = new CircularRegion(cursorG.getDouble(i33), cursorG.getDouble(i16), cursorG.getFloat(i17));
                            iE21 = i33;
                            arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                            iE22 = i16;
                            iE23 = i17;
                            iE = i10;
                            iE15 = i12;
                            iE16 = i14;
                            iE2 = i32;
                            iE17 = i27;
                            i18 = i20;
                            iE20 = i31;
                        } else {
                            i16 = iE22;
                        }
                        i17 = iE23;
                        circularRegion = new CircularRegion(cursorG.getDouble(i33), cursorG.getDouble(i16), cursorG.getFloat(i17));
                        iE21 = i33;
                        arrayList.add(new Site(i19, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string, str, str2, circularRegion, d10, string16, i30, pickupConfig));
                        iE22 = i16;
                        iE23 = i17;
                        iE = i10;
                        iE15 = i12;
                        iE16 = i14;
                        iE2 = i32;
                        iE17 = i27;
                        i18 = i20;
                        iE20 = i31;
                    }
                    cursorG.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorG.close();
                    throw th2;
                }
            }

            public void finalize() {
                nC.h();
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            try {
                gVarAcquire.b0();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAll.release(gVarAcquire);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao
    public void insertAll(Site... siteArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSite.insert(siteArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao
    public void updateAll(Site... siteArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSite.handleMultiple(siteArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public SiteDao_Impl(G g10) {
        this.__db = g10;
        this.__insertionAdapterOfSite = new AbstractC6124j<Site>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl.1
            @Override // androidx.room.AbstractC6124j
            public void bind(g gVar, Site site) {
                gVar.C(1, site.getId());
                if (site.getName() == null) {
                    gVar.I(2);
                } else {
                    gVar.S1(2, site.getName());
                }
                if (site.getPhone() == null) {
                    gVar.I(3);
                } else {
                    gVar.S1(3, site.getPhone());
                }
                if (site.getStreetAddress() == null) {
                    gVar.I(4);
                } else {
                    gVar.S1(4, site.getStreetAddress());
                }
                if (site.getFullAddress() == null) {
                    gVar.I(5);
                } else {
                    gVar.S1(5, site.getFullAddress());
                }
                if (site.getLocality() == null) {
                    gVar.I(6);
                } else {
                    gVar.S1(6, site.getLocality());
                }
                if (site.getRegion() == null) {
                    gVar.I(7);
                } else {
                    gVar.S1(7, site.getRegion());
                }
                if (site.getCountry() == null) {
                    gVar.I(8);
                } else {
                    gVar.S1(8, site.getCountry());
                }
                if (site.getPostalCode() == null) {
                    gVar.I(9);
                } else {
                    gVar.S1(9, site.getPostalCode());
                }
                if (site.getLatitude() == null) {
                    gVar.I(10);
                } else {
                    gVar.S1(10, site.getLatitude());
                }
                if (site.getLongitude() == null) {
                    gVar.I(11);
                } else {
                    gVar.S1(11, site.getLongitude());
                }
                if (site.getCoverPhotoUrl() == null) {
                    gVar.I(12);
                } else {
                    gVar.S1(12, site.getCoverPhotoUrl());
                }
                if (site.getIconUrl() == null) {
                    gVar.I(13);
                } else {
                    gVar.S1(13, site.getIconUrl());
                }
                if (site.getInstructions() == null) {
                    gVar.I(14);
                } else {
                    gVar.S1(14, site.getInstructions());
                }
                if (site.getDescription() == null) {
                    gVar.I(15);
                } else {
                    gVar.S1(15, site.getDescription());
                }
                if (site.getPartnerIdentifier() == null) {
                    gVar.I(16);
                } else {
                    gVar.S1(16, site.getPartnerIdentifier());
                }
                gVar.o(17, site.getWrongSiteArrivalRadius());
                gVar.S1(18, site.getOperationalStatus());
                gVar.C(19, site.getPrearrivalSeconds());
                gVar.S1(20, SiteDao_Impl.this.__roomConverters.fromPickupConfig(site.getPickupConfig()));
                CircularRegion geofence = site.getGeofence();
                if (geofence != null) {
                    gVar.o(21, geofence.getLatitude());
                    gVar.o(22, geofence.getLongitude());
                    gVar.o(23, geofence.getRadius());
                } else {
                    gVar.I(21);
                    gVar.I(22);
                    gVar.I(23);
                }
            }

            @Override // androidx.room.S
            public String createQuery() {
                return "INSERT OR REPLACE INTO `sites` (`id`,`name`,`phone`,`streetAddress`,`fullAddress`,`locality`,`region`,`country`,`postalCode`,`latitude`,`longitude`,`coverPhotoUrl`,`iconUrl`,`instructions`,`description`,`partnerIdentifier`,`wrongSiteArrivalRadius`,`operationalStatus`,`prearrivalSeconds`,`pickupConfig`,`geofence_latitude`,`geofence_longitude`,`geofence_radius`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfSite = new AbstractC6122h<Site>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl.2
            @Override // androidx.room.AbstractC6122h
            public void bind(g gVar, Site site) {
                gVar.C(1, site.getId());
                if (site.getName() == null) {
                    gVar.I(2);
                } else {
                    gVar.S1(2, site.getName());
                }
                if (site.getPhone() == null) {
                    gVar.I(3);
                } else {
                    gVar.S1(3, site.getPhone());
                }
                if (site.getStreetAddress() == null) {
                    gVar.I(4);
                } else {
                    gVar.S1(4, site.getStreetAddress());
                }
                if (site.getFullAddress() == null) {
                    gVar.I(5);
                } else {
                    gVar.S1(5, site.getFullAddress());
                }
                if (site.getLocality() == null) {
                    gVar.I(6);
                } else {
                    gVar.S1(6, site.getLocality());
                }
                if (site.getRegion() == null) {
                    gVar.I(7);
                } else {
                    gVar.S1(7, site.getRegion());
                }
                if (site.getCountry() == null) {
                    gVar.I(8);
                } else {
                    gVar.S1(8, site.getCountry());
                }
                if (site.getPostalCode() == null) {
                    gVar.I(9);
                } else {
                    gVar.S1(9, site.getPostalCode());
                }
                if (site.getLatitude() == null) {
                    gVar.I(10);
                } else {
                    gVar.S1(10, site.getLatitude());
                }
                if (site.getLongitude() == null) {
                    gVar.I(11);
                } else {
                    gVar.S1(11, site.getLongitude());
                }
                if (site.getCoverPhotoUrl() == null) {
                    gVar.I(12);
                } else {
                    gVar.S1(12, site.getCoverPhotoUrl());
                }
                if (site.getIconUrl() == null) {
                    gVar.I(13);
                } else {
                    gVar.S1(13, site.getIconUrl());
                }
                if (site.getInstructions() == null) {
                    gVar.I(14);
                } else {
                    gVar.S1(14, site.getInstructions());
                }
                if (site.getDescription() == null) {
                    gVar.I(15);
                } else {
                    gVar.S1(15, site.getDescription());
                }
                if (site.getPartnerIdentifier() == null) {
                    gVar.I(16);
                } else {
                    gVar.S1(16, site.getPartnerIdentifier());
                }
                gVar.o(17, site.getWrongSiteArrivalRadius());
                gVar.S1(18, site.getOperationalStatus());
                gVar.C(19, site.getPrearrivalSeconds());
                gVar.S1(20, SiteDao_Impl.this.__roomConverters.fromPickupConfig(site.getPickupConfig()));
                CircularRegion geofence = site.getGeofence();
                if (geofence != null) {
                    gVar.o(21, geofence.getLatitude());
                    gVar.o(22, geofence.getLongitude());
                    gVar.o(23, geofence.getRadius());
                } else {
                    gVar.I(21);
                    gVar.I(22);
                    gVar.I(23);
                }
                gVar.C(24, site.getId());
            }

            @Override // androidx.room.AbstractC6122h, androidx.room.S
            public String createQuery() {
                return "UPDATE OR ABORT `sites` SET `id` = ?,`name` = ?,`phone` = ?,`streetAddress` = ?,`fullAddress` = ?,`locality` = ?,`region` = ?,`country` = ?,`postalCode` = ?,`latitude` = ?,`longitude` = ?,`coverPhotoUrl` = ?,`iconUrl` = ?,`instructions` = ?,`description` = ?,`partnerIdentifier` = ?,`wrongSiteArrivalRadius` = ?,`operationalStatus` = ?,`prearrivalSeconds` = ?,`pickupConfig` = ?,`geofence_latitude` = ?,`geofence_longitude` = ?,`geofence_radius` = ? WHERE `id` = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new S(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao_Impl.3
            @Override // androidx.room.S
            public String createQuery() {
                return "DELETE FROM sites";
            }
        };
    }
}
