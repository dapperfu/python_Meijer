package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes6.dex */
final class FS extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f66808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Timer f66809b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.h f66810c;

    FS(GS gs2, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f66808a = alertDialog;
        this.f66809b = timer;
        this.f66810c = hVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f66808a.dismiss();
        this.f66809b.cancel();
        com.google.android.gms.ads.internal.overlay.h hVar = this.f66810c;
        if (hVar != null) {
            hVar.zzb();
        }
    }
}
