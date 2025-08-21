package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;

/* loaded from: classes.dex */
final class T0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f55870a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13612n f55871b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55872c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55873d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f55874a;

        /* renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f55875b;

        @SuppressLint({"WakelockTimeout"})
        public void a(boolean z10, boolean z11) {
            if (z10 && this.f55875b == null) {
                PowerManager powerManager = (PowerManager) this.f55874a.getSystemService("power");
                if (powerManager == null) {
                    d3.r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f55875b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f55875b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }

        public a(Context context) {
            this.f55874a = context;
        }
    }

    public void c(final boolean z10) {
        if (this.f55872c == z10) {
            return;
        }
        this.f55872c = z10;
        final boolean z11 = this.f55873d;
        this.f55871b.post(new Runnable() { // from class: androidx.media3.exoplayer.S0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55866a.f55870a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f55873d == z10) {
            return;
        }
        this.f55873d = z10;
        if (this.f55872c) {
            this.f55871b.post(new Runnable() { // from class: androidx.media3.exoplayer.R0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55863a.f55870a.a(true, z10);
                }
            });
        }
    }

    public T0(Context context, Looper looper, InterfaceC13606h interfaceC13606h) {
        this.f55870a = new a(context.getApplicationContext());
        this.f55871b = interfaceC13606h.e(looper, null);
    }
}
