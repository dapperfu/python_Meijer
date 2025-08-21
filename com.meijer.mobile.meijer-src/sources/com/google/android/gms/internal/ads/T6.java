package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class T6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71138a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f71139b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V6 f71140c;

    T6(V6 v62, String str, long j10) {
        this.f71138a = str;
        this.f71139b = j10;
        this.f71140c = v62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71140c.f71635a.a(this.f71138a, this.f71139b);
        V6 v62 = this.f71140c;
        v62.f71635a.b(v62.toString());
    }
}
