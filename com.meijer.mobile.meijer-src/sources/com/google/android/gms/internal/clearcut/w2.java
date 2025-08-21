package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes6.dex */
final class w2 extends ContentObserver {
    w2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        v2.f82425e.set(true);
    }
}
