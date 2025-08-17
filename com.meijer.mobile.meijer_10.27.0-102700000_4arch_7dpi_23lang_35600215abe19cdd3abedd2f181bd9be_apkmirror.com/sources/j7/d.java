package j7;

import android.content.Context;
import j7.InterfaceC14872b;

/* loaded from: classes4.dex */
final class d implements InterfaceC14872b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f139491a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC14872b.a f139492b;

    @Override // j7.l
    public void onDestroy() {
    }

    private void a() {
        r.a(this.f139491a).d(this.f139492b);
    }

    private void b() {
        r.a(this.f139491a).e(this.f139492b);
    }

    d(Context context, InterfaceC14872b.a aVar) {
        this.f139491a = context.getApplicationContext();
        this.f139492b = aVar;
    }

    @Override // j7.l
    public void onStart() {
        a();
    }

    @Override // j7.l
    public void onStop() {
        b();
    }
}
