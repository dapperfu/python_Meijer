package b3;

import a3.C5564d;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d3.C13466a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f59748a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f59749b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f59750c;

    /* renamed from: d, reason: collision with root package name */
    private final C5564d f59751d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f59752e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f59753f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f59754a;

        /* renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f59755b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f59756c;

        /* renamed from: d, reason: collision with root package name */
        private C5564d f59757d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f59758e;

        public b(int i10) {
            this.f59757d = C5564d.f43811g;
            this.f59754a = i10;
        }

        public g a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f59755b;
            if (onAudioFocusChangeListener != null) {
                return new g(this.f59754a, onAudioFocusChangeListener, (Handler) C13466a.e(this.f59756c), this.f59757d, this.f59758e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b d(boolean z10) {
            this.f59758e = z10;
            return this;
        }

        public b b(C5564d c5564d) {
            C13466a.e(c5564d);
            this.f59757d = c5564d;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            C13466a.e(onAudioFocusChangeListener);
            C13466a.e(handler);
            this.f59755b = onAudioFocusChangeListener;
            this.f59756c = handler;
            return this;
        }

        private b(g gVar) {
            this.f59754a = gVar.e();
            this.f59755b = gVar.f();
            this.f59756c = gVar.d();
            this.f59757d = gVar.b();
            this.f59758e = gVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f59759a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f59760b;

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            P.T0(this.f59759a, new Runnable() { // from class: b3.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59761a.f59760b.onAudioFocusChange(i10);
                }
            });
        }

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f59760b = onAudioFocusChangeListener;
            this.f59759a = P.y(handler.getLooper(), null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f59748a == gVar.f59748a && this.f59752e == gVar.f59752e && Objects.equals(this.f59749b, gVar.f59749b) && Objects.equals(this.f59750c, gVar.f59750c) && Objects.equals(this.f59751d, gVar.f59751d);
    }

    public b a() {
        return new b();
    }

    public C5564d b() {
        return this.f59751d;
    }

    AudioFocusRequest c() {
        return e.a(C13466a.e(this.f59753f));
    }

    public Handler d() {
        return this.f59750c;
    }

    public int e() {
        return this.f59748a;
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f59749b;
    }

    public boolean g() {
        return this.f59752e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f59748a), this.f59749b, this.f59750c, this.f59751d, Boolean.valueOf(this.f59752e));
    }

    g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C5564d c5564d, boolean z10) {
        this.f59748a = i10;
        this.f59750c = handler;
        this.f59751d = c5564d;
        this.f59752e = z10;
        int i11 = P.f127086a;
        if (i11 < 26) {
            this.f59749b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f59749b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f59753f = f.a(i10).setAudioAttributes(c5564d.a().f43823a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f59753f = null;
        }
    }
}
