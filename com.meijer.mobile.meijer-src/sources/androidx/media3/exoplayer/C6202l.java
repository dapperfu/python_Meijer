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
import androidx.media3.exoplayer.C6202l;
import androidx.media3.exoplayer.Q0;
import d3.C13599a;
import d3.C13604f;
import d3.InterfaceC13606h;
import h3.C14453i;
import h3.C14455k;
import h3.C14456l;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6202l implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Q0 f56536a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$b */
    static final class b implements Q0 {

        /* renamed from: a, reason: collision with root package name */
        private AudioManager f56537a;

        /* renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f56538b;

        /* renamed from: c, reason: collision with root package name */
        private C13604f<Boolean> f56539c;

        /* renamed from: androidx.media3.exoplayer.l$b$a */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f56539c.f(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f56539c.f(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            C13599a.e(bVar.f56539c);
            if (d3.P.H0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f56537a = audioManager;
                a aVar = bVar.new a();
                bVar.f56538b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) C13599a.e(Looper.myLooper())));
                bVar.f56539c.f(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f56537a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) C13599a.e(bVar.f56538b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) C13599a.i(this.f56537a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = d3.P.f127888a;
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
        public void a(final Q0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC13606h interfaceC13606h) {
            C13604f<Boolean> c13604f = new C13604f<>(Boolean.TRUE, looper2, looper, interfaceC13606h, new C13604f.a() { // from class: androidx.media3.exoplayer.n
                @Override // d3.C13604f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f56539c = c13604f;
            c13604f.e(new Runnable() { // from class: androidx.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    C6202l.b.d(this.f56747a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.Q0
        public boolean b() {
            C13604f<Boolean> c13604f = this.f56539c;
            if (c13604f == null) {
                return true;
            }
            return c13604f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.Q0
        public void disable() {
            ((C13604f) C13599a.e(this.f56539c)).e(new Runnable() { // from class: androidx.media3.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    C6202l.b.e(this.f56554a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$c */
    static final class c implements Q0 {

        /* renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f56541e;

        /* renamed from: a, reason: collision with root package name */
        private MediaRouter2 f56542a;

        /* renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f56543b;

        /* renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f56544c;

        /* renamed from: d, reason: collision with root package name */
        private C13604f<Boolean> f56545d;

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
                c.this.f56545d.f(Boolean.valueOf(c.j(c.this.f56542a)));
            }
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            h3.p.a(C13599a.e(cVar.f56542a)).unregisterControllerCallback(h3.q.a(C13599a.e(cVar.f56544c)));
            cVar.f56544c = null;
            cVar.f56542a.unregisterRouteCallback(h3.s.a(C13599a.e(cVar.f56543b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            C13599a.e(cVar.f56545d);
            cVar.f56542a = MediaRouter2.getInstance(context);
            cVar.f56543b = cVar.new a();
            final C13604f<Boolean> c13604f = cVar.f56545d;
            Objects.requireNonNull(c13604f);
            Executor executor = new Executor() { // from class: h3.w
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    c13604f.e(runnable);
                }
            };
            cVar.f56542a.registerRouteCallback(executor, cVar.f56543b, f56541e);
            b bVar = cVar.new b();
            cVar.f56544c = bVar;
            cVar.f56542a.registerControllerCallback(executor, bVar);
            cVar.f56545d.f(Boolean.valueOf(j(cVar.f56542a)));
        }

        @Override // androidx.media3.exoplayer.Q0
        @SuppressLint({"ThreadSafe"})
        public void a(final Q0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC13606h interfaceC13606h) {
            C13604f<Boolean> c13604f = new C13604f<>(Boolean.TRUE, looper2, looper, interfaceC13606h, new C13604f.a() { // from class: androidx.media3.exoplayer.q
                @Override // d3.C13604f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f56545d = c13604f;
            c13604f.e(new Runnable() { // from class: androidx.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    C6202l.c.e(this.f56772a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.Q0
        public boolean b() {
            C13604f<Boolean> c13604f = this.f56545d;
            if (c13604f == null) {
                return true;
            }
            return c13604f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.Q0
        public void disable() {
            ((C13604f) C13599a.i(this.f56545d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    C6202l.c.c(this.f56752a);
                }
            });
        }

        static {
            C14456l.a();
            f56541e = C14455k.a(Ee.L.x(), false).build();
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
            int transferReason = h3.p.a(C13599a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(C14453i.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.Q0
    public void a(Q0.a aVar, Context context, Looper looper, Looper looper2, InterfaceC13606h interfaceC13606h) {
        Q0 q02 = this.f56536a;
        if (q02 != null) {
            q02.a(aVar, context, looper, looper2, interfaceC13606h);
        }
    }

    @Override // androidx.media3.exoplayer.Q0
    public boolean b() {
        Q0 q02 = this.f56536a;
        return q02 == null || q02.b();
    }

    @Override // androidx.media3.exoplayer.Q0
    public void disable() {
        Q0 q02 = this.f56536a;
        if (q02 != null) {
            q02.disable();
        }
    }

    public C6202l() {
        int i10 = d3.P.f127888a;
        if (i10 >= 35) {
            this.f56536a = new c();
        } else if (i10 >= 23) {
            this.f56536a = new b();
        } else {
            this.f56536a = null;
        }
    }
}
