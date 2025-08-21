package xd;

/* renamed from: xd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC18166j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C18168l f170685a;

    /* synthetic */ RunnableC18166j(C18168l c18168l, C18165i c18165i) {
        this.f170685a = c18168l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f170685a.a();
        if (jA == -1 || com.google.android.gms.common.util.i.d().a() <= jA) {
            return;
        }
        C18168l.e(this.f170685a.f170687a);
    }
}
