package com.google.android.gms.ads.internal.offline.buffering;

import Mc.C4169y;
import Nc.a;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.InterfaceC8675ln;

/* loaded from: classes4.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8675ln f64563f;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f64563f = C4169y.a().j(context, new BinderC10061yl());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f64563f.P0(d.F2(getApplicationContext()), new a(getInputData().e("uri"), getInputData().e("gws_query_id"), getInputData().e("image_url")));
            return c.a.c();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
