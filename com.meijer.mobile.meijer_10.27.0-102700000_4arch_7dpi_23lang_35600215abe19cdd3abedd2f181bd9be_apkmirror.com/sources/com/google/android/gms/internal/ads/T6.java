package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class T6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f70298a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f70299b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V6 f70300c;

    T6(V6 v62, String str, long j10) {
        this.f70298a = str;
        this.f70299b = j10;
        this.f70300c = v62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70300c.f70795a.a(this.f70298a, this.f70299b);
        V6 v62 = this.f70300c;
        v62.f70795a.b(v62.toString());
    }
}
