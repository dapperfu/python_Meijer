package l7;

import android.content.Context;
import l7.InterfaceC15471b;

/* loaded from: classes4.dex */
final class d implements InterfaceC15471b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f149507a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC15471b.a f149508b;

    @Override // l7.l
    public void onDestroy() {
    }

    private void a() {
        r.a(this.f149507a).d(this.f149508b);
    }

    private void b() {
        r.a(this.f149507a).e(this.f149508b);
    }

    d(Context context, InterfaceC15471b.a aVar) {
        this.f149507a = context.getApplicationContext();
        this.f149508b = aVar;
    }

    @Override // l7.l
    public void onStart() {
        a();
    }

    @Override // l7.l
    public void onStop() {
        b();
    }
}
