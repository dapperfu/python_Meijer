package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.jC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8531jC0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f76204a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f76205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8852mC0 f76206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8531jC0(C8852mC0 c8852mC0, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f76206c = c8852mC0;
        this.f76204a = contentResolver;
        this.f76205b = uri;
    }

    public final void a() {
        this.f76204a.registerContentObserver(this.f76205b, false, this);
    }

    public final void b() {
        this.f76204a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C8852mC0 c8852mC0 = this.f76206c;
        this.f76206c.j(C8319hC0.c(c8852mC0.f77595a, c8852mC0.f77602h, c8852mC0.f77601g));
    }
}
