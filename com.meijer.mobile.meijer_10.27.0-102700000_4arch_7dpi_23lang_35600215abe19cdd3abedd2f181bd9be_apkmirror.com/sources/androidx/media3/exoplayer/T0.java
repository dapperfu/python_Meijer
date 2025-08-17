package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;

/* loaded from: classes.dex */
final class T0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f55646a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13479n f55647b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55648c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55649d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f55650a;

        /* renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f55651b;

        @SuppressLint({"WakelockTimeout"})
        public void a(boolean z10, boolean z11) {
            if (z10 && this.f55651b == null) {
                PowerManager powerManager = (PowerManager) this.f55650a.getSystemService("power");
                if (powerManager == null) {
                    d3.r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f55651b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f55651b;
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
            this.f55650a = context;
        }
    }

    public void c(final boolean z10) {
        if (this.f55648c == z10) {
            return;
        }
        this.f55648c = z10;
        final boolean z11 = this.f55649d;
        this.f55647b.post(new Runnable() { // from class: androidx.media3.exoplayer.S0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55642a.f55646a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f55649d == z10) {
            return;
        }
        this.f55649d = z10;
        if (this.f55648c) {
            this.f55647b.post(new Runnable() { // from class: androidx.media3.exoplayer.R0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55639a.f55646a.a(true, z10);
                }
            });
        }
    }

    public T0(Context context, Looper looper, InterfaceC13473h interfaceC13473h) {
        this.f55646a = new a(context.getApplicationContext());
        this.f55647b = interfaceC13473h.e(looper, null);
    }
}
