package com.google.android.gms.ads.internal.offline.buffering;

import Oc.C4447y;
import Pc.a;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.BinderC10186yl;
import com.google.android.gms.internal.ads.InterfaceC8800ln;

/* loaded from: classes4.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8800ln f65403f;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f65403f = C4447y.a().j(context, new BinderC10186yl());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f65403f.G8(d.I2(getApplicationContext()), new a(getInputData().e("uri"), getInputData().e("gws_query_id"), getInputData().e("image_url")));
            return c.a.c();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
