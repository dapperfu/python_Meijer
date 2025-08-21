package androidx.media3.exoplayer;

import a3.C5647d;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b3.g;
import d3.C13599a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6192g {

    /* renamed from: a, reason: collision with root package name */
    private final De.w<AudioManager> f56363a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f56364b;

    /* renamed from: c, reason: collision with root package name */
    private a f56365c;

    /* renamed from: d, reason: collision with root package name */
    private C5647d f56366d;

    /* renamed from: f, reason: collision with root package name */
    private int f56368f;

    /* renamed from: h, reason: collision with root package name */
    private b3.g f56370h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f56371i;

    /* renamed from: g, reason: collision with root package name */
    private float f56369g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f56367e = 0;

    /* renamed from: androidx.media3.exoplayer.g$a */
    public interface a {
        void d(float f10);

        void e(int i10);
    }

    private static int d(C5647d c5647d) {
        if (c5647d == null) {
            return 0;
        }
        switch (c5647d.f44637c) {
            case 0:
                d3.r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c5647d.f44635a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                d3.r.i("AudioFocusManager", "Unidentified audio usage: " + c5647d.f44637c);
                return 0;
            case 16:
                return 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            d3.r.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private boolean m(int i10) {
        return i10 != 1 && this.f56368f == 1;
    }

    public void h() {
        this.f56365c = null;
        c();
        l(0);
    }

    private void c() {
        int i10 = this.f56367e;
        if (i10 == 1 || i10 == 0 || this.f56370h == null) {
            return;
        }
        b3.m.b(this.f56363a.get(), this.f56370h);
    }

    private void e(int i10) {
        a aVar = this.f56365c;
        if (aVar != null) {
            aVar.e(i10);
        }
    }

    private int i() {
        if (this.f56367e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        b3.g gVar = this.f56370h;
        if (gVar == null || this.f56371i) {
            this.f56370h = (gVar == null ? new g.b(this.f56368f) : gVar.a()).b((C5647d) C13599a.e(this.f56366d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f56358a.g(i10);
                }
            }, this.f56364b).a();
            this.f56371i = false;
        }
        return b3.m.h(this.f56363a.get(), this.f56370h);
    }

    private void l(int i10) {
        if (this.f56367e == i10) {
            return;
        }
        this.f56367e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f56369g == f10) {
            return;
        }
        this.f56369g = f10;
        a aVar = this.f56365c;
        if (aVar != null) {
            aVar.d(f10);
        }
    }

    private boolean o() {
        C5647d c5647d = this.f56366d;
        return c5647d != null && c5647d.f44635a == 1;
    }

    public float f() {
        return this.f56369g;
    }

    public void k(C5647d c5647d) {
        if (Objects.equals(this.f56366d, c5647d)) {
            return;
        }
        this.f56366d = c5647d;
        int iD = d(c5647d);
        this.f56368f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        C13599a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public C6192g(final Context context, Looper looper, a aVar) {
        this.f56363a = De.x.a(new De.w() { // from class: androidx.media3.exoplayer.f
            @Override // De.w
            public final Object get() {
                return b3.m.c(context);
            }
        });
        this.f56365c = aVar;
        this.f56364b = new Handler(looper);
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f56367e;
        if (i11 != 1) {
            if (i11 == 3) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
}
