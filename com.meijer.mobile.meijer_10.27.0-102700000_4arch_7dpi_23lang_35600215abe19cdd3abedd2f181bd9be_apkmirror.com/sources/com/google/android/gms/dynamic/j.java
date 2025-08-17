package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.fullstory.FS;

/* loaded from: classes4.dex */
final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f64992a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f64993b;

    j(Context context, Intent intent) {
        this.f64992a = context;
        this.f64993b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f64992a.startActivity(this.f64993b);
        } catch (ActivityNotFoundException e10) {
            FS.log_e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
