package vd;

/* renamed from: vd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC17554j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C17556l f164649a;

    /* synthetic */ RunnableC17554j(C17556l c17556l, C17553i c17553i) {
        this.f164649a = c17556l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f164649a.a();
        if (jA == -1 || com.google.android.gms.common.util.i.d().a() <= jA) {
            return;
        }
        C17556l.e(this.f164649a.f164651a);
    }
}
