package com.google.android.gms.measurement;

import Od.m;
import Od.n;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class AppMeasurementReceiver extends R2.a implements m {

    /* renamed from: c, reason: collision with root package name */
    private n f84855c;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f84855c == null) {
            this.f84855c = new n(this);
        }
        this.f84855c.a(context, intent);
    }

    @Override // Od.m
    public void a(Context context, Intent intent) {
        R2.a.c(context, intent);
    }
}
