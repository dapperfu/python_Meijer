package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
abstract class b0 extends e0 {

    protected enum a {
        UserJourneyData,
        FormData,
        Template,
        Resource,
        Feedback,
        AnalyticsData,
        MediaFeedback,
        WorkerManager,
        LocalNotification,
        QuarantineRule
    }

    b0() {
    }

    protected abstract a getDataTableObjectType();
}
