package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;

/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6186d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f56236a;

    /* renamed from: b, reason: collision with root package name */
    private final a f56237b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13612n f56238c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f56239d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.d$a */
    final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final b f56240a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC13612n f56241b;

        public a(InterfaceC13612n interfaceC13612n, b bVar) {
            this.f56241b = interfaceC13612n;
            this.f56240a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (C6186d.this.f56239d) {
                this.f56240a.s();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f56241b.post(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56234a.b();
                    }
                });
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.d$b */
    public interface b {
        void s();
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z10) {
        if (z10 == this.f56239d) {
            return;
        }
        if (z10) {
            this.f56238c.post(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6186d c6186d = this.f55978a;
                    c6186d.f56236a.registerReceiver(c6186d.f56237b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f56239d = true;
        } else {
            this.f56238c.post(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6186d c6186d = this.f56232a;
                    c6186d.f56236a.unregisterReceiver(c6186d.f56237b);
                }
            });
            this.f56239d = false;
        }
    }

    public C6186d(Context context, Looper looper, Looper looper2, b bVar, InterfaceC13606h interfaceC13606h) {
        this.f56236a = context.getApplicationContext();
        this.f56238c = interfaceC13606h.e(looper, null);
        this.f56237b = new a(interfaceC13606h.e(looper2, null), bVar);
    }
}
