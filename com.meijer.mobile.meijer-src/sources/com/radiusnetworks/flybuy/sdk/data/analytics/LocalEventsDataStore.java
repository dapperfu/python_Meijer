package com.radiusnetworks.flybuy.sdk.data.analytics;

import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/analytics/LocalEventsDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/analytics/LocalEventsRepository;", "db", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "(Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;)V", "add", "", "event", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "deleteById", PreferencesHelper.PREF_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocalEventsDataStore implements LocalEventsRepository {
    private final AppDatabase db;

    public LocalEventsDataStore(AppDatabase db2) {
        Intrinsics.j(db2, "db");
        this.db = db2;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsRepository
    public Object add(AnalyticsEvent analyticsEvent, Continuation<? super Unit> continuation) {
        this.db.analyticsEventsDao$core_defaultRelease().addEvent(analyticsEvent);
        return Unit.f143329a;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsRepository
    public Object allEvents(Continuation<? super List<AnalyticsEvent>> continuation) {
        return this.db.analyticsEventsDao$core_defaultRelease().getEvents();
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsRepository
    public Object deleteAll(Continuation<? super Unit> continuation) {
        this.db.analyticsEventsDao$core_defaultRelease().deleteAll();
        return Unit.f143329a;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsRepository
    public Object deleteById(String str, Continuation<? super Unit> continuation) {
        this.db.analyticsEventsDao$core_defaultRelease().deleteById(str);
        return Unit.f143329a;
    }
}
