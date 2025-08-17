package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;

/* loaded from: classes4.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent c() {
        return a().T();
    }

    public void d(Activity activity, int i10) throws IntentSender.SendIntentException {
        a().g1(activity, i10);
    }
}
