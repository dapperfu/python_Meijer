package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.android.gms.internal.ads.Ya0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7356Ya0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71573a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f71574b;

    /* renamed from: c, reason: collision with root package name */
    private float f71575c;

    /* renamed from: d, reason: collision with root package name */
    private final C8545kb0 f71576d;

    private final float c() {
        AudioManager audioManager = this.f71574b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                return 1.0f;
            }
        }
        return f10;
    }

    private final void d() {
        this.f71576d.d(this.f71575c);
    }

    public final void b() {
        this.f71573a.getContentResolver().unregisterContentObserver(this);
    }

    public C7356Ya0(Handler handler, Context context, C7290Wa0 c7290Wa0, C8545kb0 c8545kb0) {
        super(handler);
        this.f71573a = context;
        this.f71574b = (AudioManager) context.getSystemService("audio");
        this.f71576d = c8545kb0;
    }

    public final void a() {
        this.f71575c = c();
        d();
        this.f71573a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (fC != this.f71575c) {
            this.f71575c = fC;
            d();
        }
    }
}
