package com.google.android.gms.wallet;

import Td.AbstractC5232j;
import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;

@Deprecated
/* loaded from: classes6.dex */
public final class zzd extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private int f86159a;

    /* renamed from: b, reason: collision with root package name */
    private b f86160b;

    /* renamed from: c, reason: collision with root package name */
    boolean f86161c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(AbstractC5232j abstractC5232j) throws PendingIntent.CanceledException {
        if (this.f86161c) {
            return;
        }
        this.f86161c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (abstractC5232j != null) {
            a.h(activity, this.f86159a, abstractC5232j);
        } else {
            a.g(activity, this.f86159a, 0, new Intent());
        }
    }

    private final void c() {
        b bVar = this.f86160b;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f86159a = getArguments().getInt("requestCode");
        if (a.f86132b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f86160b = null;
        } else {
            this.f86160b = (b) b.f86134e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.f86161c = z10;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c();
    }

    @Override // android.app.Fragment
    public final void onResume() throws PendingIntent.CanceledException {
        super.onResume();
        b bVar = this.f86160b;
        if (bVar != null) {
            bVar.c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            FS.log_w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        b(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f86161c);
        c();
    }
}
