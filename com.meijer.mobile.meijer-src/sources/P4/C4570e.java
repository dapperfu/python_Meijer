package P4;

import android.os.Handler;
import android.os.Looper;
import j2.C14928h;

/* renamed from: P4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4570e implements O4.I {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f25550a = C14928h.a(Looper.getMainLooper());

    @Override // O4.I
    public void a(Runnable runnable) {
        this.f25550a.removeCallbacks(runnable);
    }

    @Override // O4.I
    public void b(long j10, Runnable runnable) {
        this.f25550a.postDelayed(runnable, j10);
    }
}
