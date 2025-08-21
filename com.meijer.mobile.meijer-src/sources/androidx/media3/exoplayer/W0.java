package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;

/* loaded from: classes.dex */
final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f55969a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13612n f55970b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55971c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55972d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f55973a;

        /* renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f55974b;

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f55974b == null) {
                WifiManager wifiManager = (WifiManager) this.f55973a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    d3.r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f55974b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f55974b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }

        public a(Context context) {
            this.f55973a = context;
        }
    }

    public void c(final boolean z10) {
        if (this.f55971c == z10) {
            return;
        }
        this.f55971c = z10;
        final boolean z11 = this.f55972d;
        this.f55970b.post(new Runnable() { // from class: androidx.media3.exoplayer.U0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55877a.f55969a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f55972d == z10) {
            return;
        }
        this.f55972d = z10;
        if (this.f55971c) {
            this.f55970b.post(new Runnable() { // from class: androidx.media3.exoplayer.V0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55963a.f55969a.a(true, z10);
                }
            });
        }
    }

    public W0(Context context, Looper looper, InterfaceC13606h interfaceC13606h) {
        this.f55969a = new a(context.getApplicationContext());
        this.f55970b = interfaceC13606h.e(looper, null);
    }
}
