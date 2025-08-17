package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public class Y4 {

    /* renamed from: a, reason: collision with root package name */
    protected W4 f82970a;

    protected Y4() {
    }

    @Deprecated
    public final String a(Context context, String str) throws RemoteException {
        return this.f82970a.zze(com.google.android.gms.dynamic.d.F2(context), "");
    }

    @Deprecated
    public final String b(Context context, byte[] bArr) throws RemoteException {
        return this.f82970a.zzg(com.google.android.gms.dynamic.d.F2(context), null);
    }

    public final String c(Context context, View view, Activity activity) throws RemoteException {
        return this.f82970a.zzk(com.google.android.gms.dynamic.d.F2(context), com.google.android.gms.dynamic.d.F2(null), com.google.android.gms.dynamic.d.F2(activity));
    }

    public final void d(MotionEvent motionEvent) throws RemoteException {
        this.f82970a.zzl(com.google.android.gms.dynamic.d.F2(motionEvent));
    }
}
