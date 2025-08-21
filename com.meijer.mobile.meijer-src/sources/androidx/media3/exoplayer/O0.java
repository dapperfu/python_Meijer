package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.O0;
import d3.C13599a;
import d3.C13604f;
import d3.InterfaceC13606h;

/* loaded from: classes.dex */
final class O0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f55845a;

    /* renamed from: b, reason: collision with root package name */
    private final b f55846b;

    /* renamed from: c, reason: collision with root package name */
    private final C13604f<c> f55847c;

    /* renamed from: d, reason: collision with root package name */
    private AudioManager f55848d;

    /* renamed from: e, reason: collision with root package name */
    private d f55849e;

    /* renamed from: f, reason: collision with root package name */
    private int f55850f;

    public interface b {
        void E(int i10, boolean z10);

        void m(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (O0.this.f55849e == null) {
                return;
            }
            O0.this.f55847c.f(O0.this.h(((c) O0.this.f55847c.d()).f55851a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            O0.this.f55847c.e(new Runnable() { // from class: androidx.media3.exoplayer.P0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.d.a(this.f55860a);
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
        public final int f55851a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55852b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f55853c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55854d;

        /* renamed from: e, reason: collision with root package name */
        public final int f55855e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f55851a = i10;
            this.f55852b = i11;
            this.f55853c = z10;
            this.f55854d = i12;
            this.f55855e = i13;
        }
    }

    public static /* synthetic */ c b(O0 o02, c cVar) {
        d dVar = o02.f55849e;
        if (dVar != null) {
            try {
                o02.f55845a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                d3.r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            o02.f55849e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void d(O0 o02, int i10) {
        o02.f55848d = (AudioManager) C13599a.i((AudioManager) o02.f55845a.getSystemService("audio"));
        d dVar = new d();
        try {
            o02.f55845a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            o02.f55849e = dVar;
        } catch (RuntimeException e10) {
            d3.r.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        o02.f55847c.f(o02.h(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i10) {
        C13599a.e(this.f55848d);
        return new c(i10, b3.m.f(this.f55848d, i10), b3.m.g(this.f55848d, i10), b3.m.e(this.f55848d, i10), b3.m.d(this.f55848d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c cVar, c cVar2) {
        boolean z10 = cVar.f55853c;
        if (!z10 && cVar2.f55853c) {
            this.f55850f = cVar.f55852b;
        }
        int i10 = cVar.f55852b;
        int i11 = cVar2.f55852b;
        if (i10 != i11 || z10 != cVar2.f55853c) {
            this.f55846b.E(i11, cVar2.f55853c);
        }
        int i12 = cVar.f55851a;
        int i13 = cVar2.f55851a;
        if (i12 == i13 && cVar.f55854d == cVar2.f55854d && cVar.f55855e == cVar2.f55855e) {
            return;
        }
        this.f55846b.m(i13);
    }

    public int i() {
        return this.f55847c.d().f55855e;
    }

    public int j() {
        return this.f55847c.d().f55854d;
    }

    public void l() {
        this.f55847c.g(new De.g() { // from class: androidx.media3.exoplayer.M0
            @Override // De.g
            public final Object apply(Object obj) {
                return O0.a((O0.c) obj);
            }
        }, new De.g() { // from class: androidx.media3.exoplayer.N0
            @Override // De.g
            public final Object apply(Object obj) {
                return O0.b(this.f55843a, (O0.c) obj);
            }
        });
    }

    public O0(Context context, b bVar, final int i10, Looper looper, Looper looper2, InterfaceC13606h interfaceC13606h) {
        this.f55845a = context.getApplicationContext();
        this.f55846b = bVar;
        C13604f<c> c13604f = new C13604f<>(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC13606h, new C13604f.a() { // from class: androidx.media3.exoplayer.K0
            @Override // d3.C13604f.a
            public final void a(Object obj, Object obj2) {
                this.f55837a.k((O0.c) obj, (O0.c) obj2);
            }
        });
        this.f55847c = c13604f;
        c13604f.e(new Runnable() { // from class: androidx.media3.exoplayer.L0
            @Override // java.lang.Runnable
            public final void run() {
                O0.d(this.f55839a, i10);
            }
        });
    }
}
