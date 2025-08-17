package com.radiusnetworks.flybuy.sdk.data.room.dao;

import A4.g;
import Z.C;
import android.database.Cursor;
import androidx.room.AbstractC6122h;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.RoomConverters;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderAndBeaconRegions;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w4.C17753a;
import w4.C17754b;
import w4.C17762j;
import w4.C17770r;

/* loaded from: classes11.dex */
public final class BeaconRegionDao_Impl implements BeaconRegionDao {
    private final G __db;
    private final AbstractC6122h<BeaconRegion> __deletionAdapterOfBeaconRegion;
    private final AbstractC6124j<BeaconRegion> __insertionAdapterOfBeaconRegion;
    private final S __preparedStmtOfDeleteAll;
    private final RoomConverters __roomConverters = new RoomConverters();

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public void delete(BeaconRegion beaconRegion) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfBeaconRegion.handle(beaconRegion);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
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

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public List<BeaconRegion> findBeaconRegionsForOrder(int i10) {
        N nC = N.c("SELECT * FROM beacon_regions WHERE order_id = ?", 1);
        nC.C(1, i10);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.__db, nC, false, null);
        try {
            int iE = C17753a.e(cursorG, "uuid");
            int iE2 = C17753a.e(cursorG, "major");
            int iE3 = C17753a.e(cursorG, "minor");
            int iE4 = C17753a.e(cursorG, "order_id");
            int iE5 = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                UUID uuidFromString = this.__roomConverters.fromString(cursorG.isNull(iE) ? null : cursorG.getString(iE));
                if (uuidFromString == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                BeaconRegion beaconRegion = new BeaconRegion(uuidFromString, cursorG.isNull(iE2) ? null : Integer.valueOf(cursorG.getInt(iE2)), cursorG.isNull(iE3) ? null : Integer.valueOf(cursorG.getInt(iE3)), cursorG.getInt(iE4));
                beaconRegion.setId(cursorG.getInt(iE5));
                arrayList.add(beaconRegion);
            }
            cursorG.close();
            nC.h();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            nC.h();
            throw th2;
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public AbstractC5985A<List<BeaconRegion>> getAll() {
        final N nC = N.c("SELECT * FROM beacon_regions", 0);
        return this.__db.getInvalidationTracker().m(new String[]{"beacon_regions"}, false, new Callable<List<BeaconRegion>>() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<BeaconRegion> call() throws Exception {
                Cursor cursorG = C17754b.g(BeaconRegionDao_Impl.this.__db, nC, false, null);
                try {
                    int iE = C17753a.e(cursorG, "uuid");
                    int iE2 = C17753a.e(cursorG, "major");
                    int iE3 = C17753a.e(cursorG, "minor");
                    int iE4 = C17753a.e(cursorG, "order_id");
                    int iE5 = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
                    ArrayList arrayList = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        UUID uuidFromString = BeaconRegionDao_Impl.this.__roomConverters.fromString(cursorG.isNull(iE) ? null : cursorG.getString(iE));
                        if (uuidFromString == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        BeaconRegion beaconRegion = new BeaconRegion(uuidFromString, cursorG.isNull(iE2) ? null : Integer.valueOf(cursorG.getInt(iE2)), cursorG.isNull(iE3) ? null : Integer.valueOf(cursorG.getInt(iE3)), cursorG.getInt(iE4));
                        beaconRegion.setId(cursorG.getInt(iE5));
                        arrayList.add(beaconRegion);
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

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public AbstractC5985A<List<BeaconRegion>> getBeaconRegionsForOrder(int i10) {
        final N nC = N.c("SELECT * FROM beacon_regions WHERE order_id = ?", 1);
        nC.C(1, i10);
        return this.__db.getInvalidationTracker().m(new String[]{"beacon_regions"}, false, new Callable<List<BeaconRegion>>() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<BeaconRegion> call() throws Exception {
                Cursor cursorG = C17754b.g(BeaconRegionDao_Impl.this.__db, nC, false, null);
                try {
                    int iE = C17753a.e(cursorG, "uuid");
                    int iE2 = C17753a.e(cursorG, "major");
                    int iE3 = C17753a.e(cursorG, "minor");
                    int iE4 = C17753a.e(cursorG, "order_id");
                    int iE5 = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
                    ArrayList arrayList = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        UUID uuidFromString = BeaconRegionDao_Impl.this.__roomConverters.fromString(cursorG.isNull(iE) ? null : cursorG.getString(iE));
                        if (uuidFromString == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        BeaconRegion beaconRegion = new BeaconRegion(uuidFromString, cursorG.isNull(iE2) ? null : Integer.valueOf(cursorG.getInt(iE2)), cursorG.isNull(iE3) ? null : Integer.valueOf(cursorG.getInt(iE3)), cursorG.getInt(iE4));
                        beaconRegion.setId(cursorG.getInt(iE5));
                        arrayList.add(beaconRegion);
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

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public AbstractC5985A<List<OrderAndBeaconRegions>> getOrderAndBeaconRegions() {
        final N nC = N.c("SELECT * FROM orders", 0);
        return this.__db.getInvalidationTracker().m(new String[]{"beacon_regions", "orders"}, true, new Callable<List<OrderAndBeaconRegions>>() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.6
            /* JADX WARN: Removed duplicated region for block: B:211:0x05b9  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x05be A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:216:0x05cb  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x05d0 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:221:0x05dd  */
            /* JADX WARN: Removed duplicated region for block: B:223:0x05e4 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:226:0x05f1  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x05f8 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:231:0x0605  */
            /* JADX WARN: Removed duplicated region for block: B:233:0x060c A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:236:0x0619  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x0620 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:241:0x062d  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x0634 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:246:0x0641  */
            /* JADX WARN: Removed duplicated region for block: B:248:0x0648 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:251:0x0655  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x065c A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:256:0x0669  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x0670 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:261:0x067d  */
            /* JADX WARN: Removed duplicated region for block: B:263:0x0684 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:266:0x0691  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x0698 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:271:0x06a5  */
            /* JADX WARN: Removed duplicated region for block: B:273:0x06ac A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:276:0x06b9  */
            /* JADX WARN: Removed duplicated region for block: B:278:0x06c0 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:281:0x06cd  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x06d4 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:286:0x070d A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:294:0x0728  */
            /* JADX WARN: Removed duplicated region for block: B:298:0x075b  */
            /* JADX WARN: Removed duplicated region for block: B:300:0x0762 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:4:0x0019, B:5:0x022c, B:7:0x0232, B:9:0x0240, B:13:0x0259, B:14:0x0271, B:16:0x0277, B:20:0x028a, B:24:0x0296, B:27:0x02a4, B:32:0x02b3, B:36:0x02c9, B:38:0x02d5, B:42:0x02e1, B:46:0x02ff, B:51:0x031b, B:56:0x032d, B:61:0x0341, B:66:0x0355, B:71:0x0369, B:76:0x037d, B:81:0x0391, B:86:0x03a5, B:91:0x03bd, B:96:0x03d1, B:101:0x03e5, B:106:0x03f7, B:111:0x0407, B:116:0x0417, B:121:0x0427, B:126:0x043b, B:131:0x044f, B:136:0x045f, B:141:0x0473, B:146:0x0487, B:151:0x049b, B:156:0x04ad, B:161:0x04cd, B:166:0x04dd, B:171:0x04fd, B:176:0x0511, B:181:0x0526, B:186:0x0541, B:188:0x0553, B:194:0x0569, B:199:0x057e, B:201:0x058a, B:206:0x0599, B:208:0x05a5, B:209:0x05ad, B:214:0x05c5, B:219:0x05d7, B:224:0x05eb, B:229:0x05ff, B:234:0x0613, B:239:0x0627, B:244:0x063b, B:249:0x064f, B:254:0x0663, B:259:0x0677, B:264:0x068b, B:269:0x069f, B:274:0x06b3, B:279:0x06c7, B:284:0x06db, B:286:0x070d, B:288:0x0715, B:295:0x072d, B:296:0x0740, B:301:0x0769, B:300:0x0762, B:283:0x06d4, B:278:0x06c0, B:273:0x06ac, B:268:0x0698, B:263:0x0684, B:258:0x0670, B:253:0x065c, B:248:0x0648, B:243:0x0634, B:238:0x0620, B:233:0x060c, B:228:0x05f8, B:223:0x05e4, B:218:0x05d0, B:213:0x05be, B:302:0x07bc, B:303:0x07c1, B:205:0x0594, B:304:0x07c2, B:305:0x07c7, B:198:0x0575, B:185:0x053c, B:180:0x051d, B:175:0x050a, B:170:0x04f2, B:150:0x0494, B:145:0x0480, B:140:0x046c, B:130:0x0448, B:125:0x0434, B:100:0x03de, B:95:0x03ca, B:90:0x03b2, B:85:0x039e, B:80:0x038a, B:75:0x0376, B:70:0x0362, B:65:0x034e, B:60:0x033a, B:55:0x0326, B:50:0x0314, B:45:0x02fb, B:41:0x02dd, B:306:0x07c8, B:307:0x07cd, B:35:0x02c5, B:31:0x02ae, B:308:0x07ce, B:309:0x07d3, B:23:0x0292, B:19:0x0284, B:310:0x07d4), top: B:320:0x0019, outer: #1 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.radiusnetworks.flybuy.sdk.data.room.domain.OrderAndBeaconRegions> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 2042
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.AnonymousClass6.call():java.util.List");
            }

            public void finalize() {
                nC.h();
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao
    public void insertAll(BeaconRegion... beaconRegionArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBeaconRegion.insert(beaconRegionArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public BeaconRegionDao_Impl(G g10) {
        this.__db = g10;
        this.__insertionAdapterOfBeaconRegion = new AbstractC6124j<BeaconRegion>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.1
            @Override // androidx.room.AbstractC6124j
            public void bind(g gVar, BeaconRegion beaconRegion) {
                String strUuidToString = BeaconRegionDao_Impl.this.__roomConverters.uuidToString(beaconRegion.getUuid());
                if (strUuidToString == null) {
                    gVar.I(1);
                } else {
                    gVar.S1(1, strUuidToString);
                }
                if (beaconRegion.getMajor() == null) {
                    gVar.I(2);
                } else {
                    gVar.C(2, beaconRegion.getMajor().intValue());
                }
                if (beaconRegion.getMinor() == null) {
                    gVar.I(3);
                } else {
                    gVar.C(3, beaconRegion.getMinor().intValue());
                }
                gVar.C(4, beaconRegion.getOrderId());
                gVar.C(5, beaconRegion.getId());
            }

            @Override // androidx.room.S
            public String createQuery() {
                return "INSERT OR REPLACE INTO `beacon_regions` (`uuid`,`major`,`minor`,`order_id`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
            }
        };
        this.__deletionAdapterOfBeaconRegion = new AbstractC6122h<BeaconRegion>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.2
            @Override // androidx.room.AbstractC6122h
            public void bind(g gVar, BeaconRegion beaconRegion) {
                gVar.C(1, beaconRegion.getId());
            }

            @Override // androidx.room.AbstractC6122h, androidx.room.S
            public String createQuery() {
                return "DELETE FROM `beacon_regions` WHERE `id` = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new S(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao_Impl.3
            @Override // androidx.room.S
            public String createQuery() {
                return "DELETE FROM beacon_regions";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipbeaconRegionsAscomRadiusnetworksFlybuySdkDataRoomDomainBeaconRegion(C<ArrayList<BeaconRegion>> c10) {
        String string;
        Integer numValueOf;
        Integer numValueOf2;
        if (c10.f()) {
            return;
        }
        if (c10.m() > 999) {
            C17762j.c(c10, true, new Function1() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeaconRegionDao_Impl.a(this.f119965a, (C) obj);
                }
            });
            return;
        }
        StringBuilder sbB = C17770r.b();
        sbB.append("SELECT `uuid`,`major`,`minor`,`order_id`,`id` FROM `beacon_regions` WHERE `order_id` IN (");
        int iM = c10.m();
        C17770r.a(sbB, iM);
        sbB.append(")");
        N nC = N.c(sbB.toString(), iM);
        int i10 = 1;
        for (int i11 = 0; i11 < c10.m(); i11++) {
            nC.C(i10, c10.g(i11));
            i10++;
        }
        Cursor cursorG = C17754b.g(this.__db, nC, false, null);
        try {
            int iD = C17753a.d(cursorG, "order_id");
            if (iD == -1) {
                cursorG.close();
                return;
            }
            while (cursorG.moveToNext()) {
                ArrayList<BeaconRegion> arrayListD = c10.d(cursorG.getLong(iD));
                if (arrayListD != null) {
                    if (cursorG.isNull(0)) {
                        string = null;
                    } else {
                        string = cursorG.getString(0);
                    }
                    UUID uuidFromString = this.__roomConverters.fromString(string);
                    if (uuidFromString != null) {
                        if (cursorG.isNull(1)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(cursorG.getInt(1));
                        }
                        if (cursorG.isNull(2)) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(cursorG.getInt(2));
                        }
                        BeaconRegion beaconRegion = new BeaconRegion(uuidFromString, numValueOf, numValueOf2, cursorG.getInt(3));
                        beaconRegion.setId(cursorG.getInt(4));
                        arrayListD.add(beaconRegion);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                }
            }
            cursorG.close();
        } catch (Throwable th2) {
            cursorG.close();
            throw th2;
        }
    }

    public static /* synthetic */ Unit a(BeaconRegionDao_Impl beaconRegionDao_Impl, C c10) {
        beaconRegionDao_Impl.__fetchRelationshipbeaconRegionsAscomRadiusnetworksFlybuySdkDataRoomDomainBeaconRegion(c10);
        return Unit.f142422a;
    }
}
