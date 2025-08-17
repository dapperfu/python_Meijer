package androidx.media3.exoplayer.audio;

import a3.C5564d;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import d3.C13466a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f55890a;

    /* renamed from: b, reason: collision with root package name */
    private final f f55891b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f55892c;

    /* renamed from: d, reason: collision with root package name */
    private final c f55893d;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f55894e;

    /* renamed from: f, reason: collision with root package name */
    private final d f55895f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f55896g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f55897h;

    /* renamed from: i, reason: collision with root package name */
    private C5564d f55898i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55899j;

    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f55890a, b.this.f55898i, b.this.f55897h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (P.r(audioDeviceInfoArr, b.this.f55897h)) {
                b.this.f55897h = null;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f55890a, b.this.f55898i, b.this.f55897h));
        }
    }

    private final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f55901a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f55902b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f55901a = contentResolver;
            this.f55902b = uri;
        }

        public void a() {
            this.f55901a.registerContentObserver(this.f55902b, false, this);
        }

        public void b() {
            this.f55901a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f55890a, b.this.f55898i, b.this.f55897h));
        }
    }

    public interface f {
        void a(androidx.media3.exoplayer.audio.a aVar);
    }

    /* renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    private static final class C1124b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            b3.m.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            b3.m.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                b bVar = b.this;
                bVar.f(androidx.media3.exoplayer.audio.a.f(context, intent, bVar.f55898i, b.this.f55897h));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.a aVar) {
        if (!this.f55899j || aVar.equals(this.f55896g)) {
            return;
        }
        this.f55896g = aVar;
        this.f55891b.a(aVar);
    }

    public androidx.media3.exoplayer.audio.a g() {
        c cVar;
        if (this.f55899j) {
            return (androidx.media3.exoplayer.audio.a) C13466a.e(this.f55896g);
        }
        this.f55899j = true;
        d dVar = this.f55895f;
        if (dVar != null) {
            dVar.a();
        }
        if (P.f127086a >= 23 && (cVar = this.f55893d) != null) {
            C1124b.a(this.f55890a, cVar, this.f55892c);
        }
        androidx.media3.exoplayer.audio.a aVarF = androidx.media3.exoplayer.audio.a.f(this.f55890a, this.f55890a.registerReceiver(this.f55894e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f55892c), this.f55898i, this.f55897h);
        this.f55896g = aVarF;
        return aVarF;
    }

    public void h(C5564d c5564d) {
        this.f55898i = c5564d;
        f(androidx.media3.exoplayer.audio.a.e(this.f55890a, c5564d, this.f55897h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.c cVar = this.f55897h;
        if (Objects.equals(audioDeviceInfo, cVar == null ? null : cVar.f55905a)) {
            return;
        }
        androidx.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f55897h = cVar2;
        f(androidx.media3.exoplayer.audio.a.e(this.f55890a, this.f55898i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f55899j) {
            this.f55896g = null;
            if (P.f127086a >= 23 && (cVar = this.f55893d) != null) {
                C1124b.b(this.f55890a, cVar);
            }
            this.f55890a.unregisterReceiver(this.f55894e);
            d dVar = this.f55895f;
            if (dVar != null) {
                dVar.b();
            }
            this.f55899j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Context context, f fVar, C5564d c5564d, androidx.media3.exoplayer.audio.c cVar) {
        c cVar2;
        Context applicationContext = context.getApplicationContext();
        this.f55890a = applicationContext;
        this.f55891b = (f) C13466a.e(fVar);
        this.f55898i = c5564d;
        this.f55897h = cVar;
        Handler handlerB = P.B();
        this.f55892c = handlerB;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (P.f127086a >= 23) {
            cVar2 = new c();
        } else {
            cVar2 = null;
        }
        this.f55893d = cVar2;
        this.f55894e = new e();
        Uri uriI = androidx.media3.exoplayer.audio.a.i();
        this.f55895f = uriI != null ? new d(handlerB, applicationContext.getContentResolver(), uriI) : null;
    }
}
