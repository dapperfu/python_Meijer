package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.jC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8406jC0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f75364a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f75365b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8727mC0 f75366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8406jC0(C8727mC0 c8727mC0, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f75366c = c8727mC0;
        this.f75364a = contentResolver;
        this.f75365b = uri;
    }

    public final void a() {
        this.f75364a.registerContentObserver(this.f75365b, false, this);
    }

    public final void b() {
        this.f75364a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C8727mC0 c8727mC0 = this.f75366c;
        this.f75366c.j(C8194hC0.c(c8727mC0.f76755a, c8727mC0.f76762h, c8727mC0.f76761g));
    }
}
