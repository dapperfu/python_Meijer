package com.google.android.gms.measurement;

import Qd.m;
import Qd.n;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class AppMeasurementReceiver extends R2.a implements m {

    /* renamed from: c, reason: collision with root package name */
    private n f85695c;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f85695c == null) {
            this.f85695c = new n(this);
        }
        this.f85695c.a(context, intent);
    }

    @Override // Qd.m
    public void a(Context context, Intent intent) {
        R2.a.c(context, intent);
    }
}
