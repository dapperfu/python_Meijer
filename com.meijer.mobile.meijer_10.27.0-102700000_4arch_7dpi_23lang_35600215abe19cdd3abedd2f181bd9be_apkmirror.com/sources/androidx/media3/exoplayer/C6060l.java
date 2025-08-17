package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.C6060l;
import androidx.media3.exoplayer.Q0;
import d3.C13466a;
import d3.C13471f;
import d3.InterfaceC13473h;
import h3.C14340i;
import h3.C14342k;
import h3.C14343l;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6060l implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Q0 f56312a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$b */
    static final class b implements Q0 {

        /* renamed from: a, reason: collision with root package name */
        private AudioManager f56313a;

        /* renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f56314b;

        /* renamed from: c, reason: collision with root package name */
        private C13471f<Boolean> f56315c;

        /* renamed from: androidx.media3.exoplayer.l$b$a */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f56315c.f(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f56315c.f(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            C13466a.e(bVar.f56315c);
            if (d3.P.H0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f56313a = audioManager;
                a aVar = bVar.new a();
                bVar.f56314b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) C13466a.e(Looper.myLooper())));
                bVar.f56315c.f(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f56313a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) C13466a.e(bVar.f56314b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) C13466a.i(this.f56313a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = d3.P.f127086a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.Q0
        public void a(final Q0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC13473h interfaceC13473h) {
            C13471f<Boolean> c13471f = new C13471f<>(Boolean.TRUE, looper2, looper, interfaceC13473h, new C13471f.a() { // from class: androidx.media3.exoplayer.n
                @Override // d3.C13471f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f56315c = c13471f;
            c13471f.e(new Runnable() { // from class: androidx.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    C6060l.b.d(this.f56523a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.Q0
        public boolean b() {
            C13471f<Boolean> c13471f = this.f56315c;
            if (c13471f == null) {
                return true;
            }
            return c13471f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.Q0
        public void disable() {
            ((C13471f) C13466a.e(this.f56315c)).e(new Runnable() { // from class: androidx.media3.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    C6060l.b.e(this.f56330a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$c */
    static final class c implements Q0 {

        /* renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f56317e;

        /* renamed from: a, reason: collision with root package name */
        private MediaRouter2 f56318a;

        /* renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f56319b;

        /* renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f56320c;

        /* renamed from: d, reason: collision with root package name */
        private C13471f<Boolean> f56321d;

        /* renamed from: androidx.media3.exoplayer.l$c$a */
        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        /* renamed from: androidx.media3.exoplayer.l$c$b */
        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f56321d.f(Boolean.valueOf(c.j(c.this.f56318a)));
            }
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            h3.p.a(C13466a.e(cVar.f56318a)).unregisterControllerCallback(h3.q.a(C13466a.e(cVar.f56320c)));
            cVar.f56320c = null;
            cVar.f56318a.unregisterRouteCallback(h3.s.a(C13466a.e(cVar.f56319b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            C13466a.e(cVar.f56321d);
            cVar.f56318a = MediaRouter2.getInstance(context);
            cVar.f56319b = cVar.new a();
            final C13471f<Boolean> c13471f = cVar.f56321d;
            Objects.requireNonNull(c13471f);
            Executor executor = new Executor() { // from class: h3.w
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    c13471f.e(runnable);
                }
            };
            cVar.f56318a.registerRouteCallback(executor, cVar.f56319b, f56317e);
            b bVar = cVar.new b();
            cVar.f56320c = bVar;
            cVar.f56318a.registerControllerCallback(executor, bVar);
            cVar.f56321d.f(Boolean.valueOf(j(cVar.f56318a)));
        }

        @Override // androidx.media3.exoplayer.Q0
        @SuppressLint({"ThreadSafe"})
        public void a(final Q0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC13473h interfaceC13473h) {
            C13471f<Boolean> c13471f = new C13471f<>(Boolean.TRUE, looper2, looper, interfaceC13473h, new C13471f.a() { // from class: androidx.media3.exoplayer.q
                @Override // d3.C13471f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f56321d = c13471f;
            c13471f.e(new Runnable() { // from class: androidx.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    C6060l.c.e(this.f56548a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.Q0
        public boolean b() {
            C13471f<Boolean> c13471f = this.f56321d;
            if (c13471f == null) {
                return true;
            }
            return c13471f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.Q0
        public void disable() {
            ((C13471f) C13466a.i(this.f56321d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    C6060l.c.c(this.f56528a);
                }
            });
        }

        static {
            C14343l.a();
            f56317e = C14342k.a(Ce.L.x(), false).build();
        }

        private static boolean i(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if ((i10 != 1 && i10 != 2) || !z10) {
                    return false;
                }
                return true;
            }
            if (suitabilityStatus != 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean j(MediaRouter2 mediaRouter2) {
            int transferReason = h3.p.a(C13466a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(C14340i.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.Q0
    public void a(Q0.a aVar, Context context, Looper looper, Looper looper2, InterfaceC13473h interfaceC13473h) {
        Q0 q02 = this.f56312a;
        if (q02 != null) {
            q02.a(aVar, context, looper, looper2, interfaceC13473h);
        }
    }

    @Override // androidx.media3.exoplayer.Q0
    public boolean b() {
        Q0 q02 = this.f56312a;
        return q02 == null || q02.b();
    }

    @Override // androidx.media3.exoplayer.Q0
    public void disable() {
        Q0 q02 = this.f56312a;
        if (q02 != null) {
            q02.disable();
        }
    }

    public C6060l() {
        int i10 = d3.P.f127086a;
        if (i10 >= 35) {
            this.f56312a = new c();
        } else if (i10 >= 23) {
            this.f56312a = new b();
        } else {
            this.f56312a = null;
        }
    }
}
