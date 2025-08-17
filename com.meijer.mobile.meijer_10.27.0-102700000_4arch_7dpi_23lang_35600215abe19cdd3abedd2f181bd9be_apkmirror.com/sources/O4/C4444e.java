package O4;

import android.os.Handler;
import android.os.Looper;
import j2.C14840h;

/* renamed from: O4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4444e implements N4.I {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f23210a = C14840h.a(Looper.getMainLooper());

    @Override // N4.I
    public void a(Runnable runnable) {
        this.f23210a.removeCallbacks(runnable);
    }

    @Override // N4.I
    public void b(long j10, Runnable runnable) {
        this.f23210a.postDelayed(runnable, j10);
    }
}
