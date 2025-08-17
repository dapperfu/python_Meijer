package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;

/* loaded from: classes.dex */
final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f55745a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13479n f55746b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55747c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55748d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f55749a;

        /* renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f55750b;

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f55750b == null) {
                WifiManager wifiManager = (WifiManager) this.f55749a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    d3.r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f55750b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f55750b;
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
            this.f55749a = context;
        }
    }

    public void c(final boolean z10) {
        if (this.f55747c == z10) {
            return;
        }
        this.f55747c = z10;
        final boolean z11 = this.f55748d;
        this.f55746b.post(new Runnable() { // from class: androidx.media3.exoplayer.U0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55653a.f55745a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f55748d == z10) {
            return;
        }
        this.f55748d = z10;
        if (this.f55747c) {
            this.f55746b.post(new Runnable() { // from class: androidx.media3.exoplayer.V0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55739a.f55745a.a(true, z10);
                }
            });
        }
    }

    public W0(Context context, Looper looper, InterfaceC13473h interfaceC13473h) {
        this.f55745a = new a(context.getApplicationContext());
        this.f55746b = interfaceC13473h.e(looper, null);
    }
}
