package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes6.dex */
final class FS extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f67648a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Timer f67649b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.h f67650c;

    FS(GS gs2, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f67648a = alertDialog;
        this.f67649b = timer;
        this.f67650c = hVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f67648a.dismiss();
        this.f67649b.cancel();
        com.google.android.gms.ads.internal.overlay.h hVar = this.f67650c;
        if (hVar != null) {
            hVar.zzb();
        }
    }
}
