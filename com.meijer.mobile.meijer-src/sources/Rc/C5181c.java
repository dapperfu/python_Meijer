package Rc;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: Rc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5181c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32345a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f32346b = 1.0f;

    private final synchronized boolean f() {
        return this.f32346b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f32346b;
    }

    public final synchronized void c(boolean z10) {
        this.f32345a = z10;
    }

    public final synchronized void d(float f10) {
        this.f32346b = f10;
    }

    public final synchronized boolean e() {
        return this.f32345a;
    }

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }
}
