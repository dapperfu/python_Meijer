package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.AbstractC13442k;
import java.util.TimerTask;

/* loaded from: classes12.dex */
public final class d extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC13442k f125667a;

    public d(AbstractC13442k abstractC13442k) {
        this.f125667a = abstractC13442k;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f125667a.cancel();
    }
}
