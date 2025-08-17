package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10286d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C10283c f81403a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10286d(C10283c c10283c, Handler handler) {
        super(null);
        this.f81403a = c10283c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f81403a.d();
        this.f81403a.f();
    }
}
