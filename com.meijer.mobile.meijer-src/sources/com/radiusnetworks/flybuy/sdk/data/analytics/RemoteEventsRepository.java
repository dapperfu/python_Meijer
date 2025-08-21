package com.radiusnetworks.flybuy.sdk.data.analytics;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&J \u0010\n\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/analytics/RemoteEventsRepository;", "", "sendEvents", "", "events", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "callback", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "sync", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RemoteEventsRepository {
    void sendEvents(List<AnalyticsEvent> events, Function1<? super SdkError, Unit> callback);

    void sync(Function1<? super SdkError, Unit> callback);
}
