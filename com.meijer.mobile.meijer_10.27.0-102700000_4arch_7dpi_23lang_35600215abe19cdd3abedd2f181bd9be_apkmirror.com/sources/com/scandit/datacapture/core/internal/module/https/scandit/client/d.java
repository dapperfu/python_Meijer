package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.AbstractC13309k;
import java.util.TimerTask;

/* loaded from: classes11.dex */
public final class d extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC13309k f124715a;

    public d(AbstractC13309k abstractC13309k) {
        this.f124715a = abstractC13309k;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f124715a.cancel();
    }
}
