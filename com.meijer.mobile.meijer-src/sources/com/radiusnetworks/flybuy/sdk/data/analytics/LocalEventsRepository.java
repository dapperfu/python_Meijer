package com.radiusnetworks.flybuy.sdk.data.analytics;

import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH¦@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/analytics/LocalEventsRepository;", "", "add", "", "event", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "deleteById", PreferencesHelper.PREF_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LocalEventsRepository {
    Object add(AnalyticsEvent analyticsEvent, Continuation<? super Unit> continuation);

    Object allEvents(Continuation<? super List<AnalyticsEvent>> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteById(String str, Continuation<? super Unit> continuation);
}
