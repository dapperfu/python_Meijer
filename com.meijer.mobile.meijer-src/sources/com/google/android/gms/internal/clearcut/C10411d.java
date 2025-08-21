package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10411d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C10408c f82243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10411d(C10408c c10408c, Handler handler) {
        super(null);
        this.f82243a = c10408c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f82243a.d();
        this.f82243a.f();
    }
}
