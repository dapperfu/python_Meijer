package com.google.android.gms.ads.internal.offline.buffering;

import Mc.C4169y;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.InterfaceC8675ln;

/* loaded from: classes4.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8675ln f64564f;

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f64564f.zzh();
            return c.a.c();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f64564f = C4169y.a().j(context, new BinderC10061yl());
    }
}
