package com.radiusnetworks.flybuy.sdk.data.room.dao;

import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H'¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/dao/AnalyticsEventsDao;", "", "addEvent", "", "event", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "deleteAll", "deleteById", PreferencesHelper.PREF_ID, "", "getEvents", "", "insertAll", "", "([Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AnalyticsEventsDao {
    void addEvent(AnalyticsEvent event);

    void deleteAll();

    void deleteById(String id2);

    List<AnalyticsEvent> getEvents();

    void insertAll(AnalyticsEvent... event);
}
