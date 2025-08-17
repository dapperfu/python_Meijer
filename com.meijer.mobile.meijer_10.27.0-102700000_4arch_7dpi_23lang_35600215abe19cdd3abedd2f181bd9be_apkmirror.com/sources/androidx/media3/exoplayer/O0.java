package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.O0;
import d3.C13466a;
import d3.C13471f;
import d3.InterfaceC13473h;

/* loaded from: classes.dex */
final class O0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f55621a;

    /* renamed from: b, reason: collision with root package name */
    private final b f55622b;

    /* renamed from: c, reason: collision with root package name */
    private final C13471f<c> f55623c;

    /* renamed from: d, reason: collision with root package name */
    private AudioManager f55624d;

    /* renamed from: e, reason: collision with root package name */
    private d f55625e;

    /* renamed from: f, reason: collision with root package name */
    private int f55626f;

    public interface b {
        void E(int i10, boolean z10);

        void m(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (O0.this.f55625e == null) {
                return;
            }
            O0.this.f55623c.f(O0.this.h(((c) O0.this.f55623c.d()).f55627a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            O0.this.f55623c.e(new Runnable() { // from class: androidx.media3.exoplayer.P0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.d.a(this.f55636a);
                }
            });
        }
    }

    public static /* synthetic */ c a(c cVar) {
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f55627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55628b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f55629c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55630d;

        /* renamed from: e, reason: collision with root package name */
        public final int f55631e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f55627a = i10;
            this.f55628b = i11;
            this.f55629c = z10;
            this.f55630d = i12;
            this.f55631e = i13;
        }
    }

    public static /* synthetic */ c b(O0 o02, c cVar) {
        d dVar = o02.f55625e;
        if (dVar != null) {
            try {
                o02.f55621a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                d3.r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            o02.f55625e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void d(O0 o02, int i10) {
        o02.f55624d = (AudioManager) C13466a.i((AudioManager) o02.f55621a.getSystemService("audio"));
        d dVar = new d();
        try {
            o02.f55621a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            o02.f55625e = dVar;
        } catch (RuntimeException e10) {
            d3.r.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        o02.f55623c.f(o02.h(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i10) {
        C13466a.e(this.f55624d);
        return new c(i10, b3.m.f(this.f55624d, i10), b3.m.g(this.f55624d, i10), b3.m.e(this.f55624d, i10), b3.m.d(this.f55624d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c cVar, c cVar2) {
        boolean z10 = cVar.f55629c;
        if (!z10 && cVar2.f55629c) {
            this.f55626f = cVar.f55628b;
        }
        int i10 = cVar.f55628b;
        int i11 = cVar2.f55628b;
        if (i10 != i11 || z10 != cVar2.f55629c) {
            this.f55622b.E(i11, cVar2.f55629c);
        }
        int i12 = cVar.f55627a;
        int i13 = cVar2.f55627a;
        if (i12 == i13 && cVar.f55630d == cVar2.f55630d && cVar.f55631e == cVar2.f55631e) {
            return;
        }
        this.f55622b.m(i13);
    }

    public int i() {
        return this.f55623c.d().f55631e;
    }

    public int j() {
        return this.f55623c.d().f55630d;
    }

    public void l() {
        this.f55623c.g(new Be.g() { // from class: androidx.media3.exoplayer.M0
            @Override // Be.g
            public final Object apply(Object obj) {
                return O0.a((O0.c) obj);
            }
        }, new Be.g() { // from class: androidx.media3.exoplayer.N0
            @Override // Be.g
            public final Object apply(Object obj) {
                return O0.b(this.f55619a, (O0.c) obj);
            }
        });
    }

    public O0(Context context, b bVar, final int i10, Looper looper, Looper looper2, InterfaceC13473h interfaceC13473h) {
        this.f55621a = context.getApplicationContext();
        this.f55622b = bVar;
        C13471f<c> c13471f = new C13471f<>(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC13473h, new C13471f.a() { // from class: androidx.media3.exoplayer.K0
            @Override // d3.C13471f.a
            public final void a(Object obj, Object obj2) {
                this.f55613a.k((O0.c) obj, (O0.c) obj2);
            }
        });
        this.f55623c = c13471f;
        c13471f.e(new Runnable() { // from class: androidx.media3.exoplayer.L0
            @Override // java.lang.Runnable
            public final void run() {
                O0.d(this.f55615a, i10);
            }
        });
    }
}
