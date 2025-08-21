package com.radiusnetworks.flybuy.sdk.data.room.dao;

import B4.g;
import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import com.radiusnetworks.flybuy.sdk.data.room.RoomConverters;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17823a;
import w4.C17824b;

/* loaded from: classes12.dex */
public final class AnalyticsEventsDao_Impl implements AnalyticsEventsDao {
    private final G __db;
    private final AbstractC6266j<AnalyticsEvent> __insertionAdapterOfAnalyticsEvent;
    private final S __preparedStmtOfDeleteAll;
    private final S __preparedStmtOfDeleteById;
    private final RoomConverters __roomConverters = new RoomConverters();

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao
    public void addEvent(AnalyticsEvent analyticsEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAnalyticsEvent.insert((AbstractC6266j<AnalyticsEvent>) analyticsEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            try {
                gVarAcquire.a0();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAll.release(gVarAcquire);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao
    public void deleteById(String str) {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfDeleteById.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.__db.beginTransaction();
            try {
                gVarAcquire.a0();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteById.release(gVarAcquire);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao
    public List<AnalyticsEvent> getEvents() {
        N nC = N.c("SELECT * FROM analytics_events", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.__db, nC, false, null);
        try {
            int iE = C17823a.e(cursorG, "guid");
            int iE2 = C17823a.e(cursorG, "name");
            int iE3 = C17823a.e(cursorG, "occurredAt");
            int iE4 = C17823a.e(cursorG, "projectId");
            int iE5 = C17823a.e(cursorG, "orderId");
            int iE6 = C17823a.e(cursorG, "promotionId");
            int iE7 = C17823a.e(cursorG, "shortLinkId");
            int iE8 = C17823a.e(cursorG, "siteId");
            int iE9 = C17823a.e(cursorG, "data");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iE);
                String string2 = cursorG.getString(iE2);
                OffsetDateTime offsetDateTime = this.__roomConverters.toOffsetDateTime(cursorG.isNull(iE3) ? null : cursorG.getString(iE3));
                if (offsetDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.OffsetDateTime', but it was NULL.");
                }
                arrayList.add(new AnalyticsEvent(string, string2, offsetDateTime, cursorG.getInt(iE4), cursorG.isNull(iE5) ? null : Integer.valueOf(cursorG.getInt(iE5)), cursorG.isNull(iE6) ? null : Integer.valueOf(cursorG.getInt(iE6)), cursorG.isNull(iE7) ? null : Integer.valueOf(cursorG.getInt(iE7)), cursorG.isNull(iE8) ? null : Integer.valueOf(cursorG.getInt(iE8)), this.__roomConverters.toStringMap(cursorG.getString(iE9))));
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

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao
    public void insertAll(AnalyticsEvent... analyticsEventArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAnalyticsEvent.insert(analyticsEventArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public AnalyticsEventsDao_Impl(G g10) {
        this.__db = g10;
        this.__insertionAdapterOfAnalyticsEvent = new AbstractC6266j<AnalyticsEvent>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao_Impl.1
            @Override // androidx.room.AbstractC6266j
            public void bind(g gVar, AnalyticsEvent analyticsEvent) {
                gVar.S1(1, analyticsEvent.getGuid());
                gVar.S1(2, analyticsEvent.getName());
                String strFromOffsetDateTime = AnalyticsEventsDao_Impl.this.__roomConverters.fromOffsetDateTime(analyticsEvent.getOccurredAt());
                if (strFromOffsetDateTime == null) {
                    gVar.I(3);
                } else {
                    gVar.S1(3, strFromOffsetDateTime);
                }
                gVar.C(4, analyticsEvent.getProjectId());
                if (analyticsEvent.getOrderId() == null) {
                    gVar.I(5);
                } else {
                    gVar.C(5, analyticsEvent.getOrderId().intValue());
                }
                if (analyticsEvent.getPromotionId() == null) {
                    gVar.I(6);
                } else {
                    gVar.C(6, analyticsEvent.getPromotionId().intValue());
                }
                if (analyticsEvent.getShortLinkId() == null) {
                    gVar.I(7);
                } else {
                    gVar.C(7, analyticsEvent.getShortLinkId().intValue());
                }
                if (analyticsEvent.getSiteId() == null) {
                    gVar.I(8);
                } else {
                    gVar.C(8, analyticsEvent.getSiteId().intValue());
                }
                gVar.S1(9, AnalyticsEventsDao_Impl.this.__roomConverters.fromStringMap(analyticsEvent.getData()));
            }

            @Override // androidx.room.S
            public String createQuery() {
                return "INSERT OR REPLACE INTO `analytics_events` (`guid`,`name`,`occurredAt`,`projectId`,`orderId`,`promotionId`,`shortLinkId`,`siteId`,`data`) VALUES (?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteById = new S(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao_Impl.2
            @Override // androidx.room.S
            public String createQuery() {
                return "DELETE FROM analytics_events WHERE guid = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new S(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao_Impl.3
            @Override // androidx.room.S
            public String createQuery() {
                return "DELETE FROM analytics_events";
            }
        };
    }
}
