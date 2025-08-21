package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public class Y4 {

    /* renamed from: a, reason: collision with root package name */
    protected W4 f83810a;

    protected Y4() {
    }

    @Deprecated
    public final String a(Context context, String str) throws RemoteException {
        return this.f83810a.zze(com.google.android.gms.dynamic.d.I2(context), "");
    }

    @Deprecated
    public final String b(Context context, byte[] bArr) throws RemoteException {
        return this.f83810a.zzg(com.google.android.gms.dynamic.d.I2(context), null);
    }

    public final String c(Context context, View view, Activity activity) throws RemoteException {
        return this.f83810a.zzk(com.google.android.gms.dynamic.d.I2(context), com.google.android.gms.dynamic.d.I2(null), com.google.android.gms.dynamic.d.I2(activity));
    }

    public final void d(MotionEvent motionEvent) throws RemoteException {
        this.f83810a.zzl(com.google.android.gms.dynamic.d.I2(motionEvent));
    }
}
