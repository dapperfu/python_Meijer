package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.android.gms.internal.ads.Ya0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7481Ya0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72413a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f72414b;

    /* renamed from: c, reason: collision with root package name */
    private float f72415c;

    /* renamed from: d, reason: collision with root package name */
    private final C8670kb0 f72416d;

    private final float c() {
        AudioManager audioManager = this.f72414b;
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
        this.f72416d.d(this.f72415c);
    }

    public final void b() {
        this.f72413a.getContentResolver().unregisterContentObserver(this);
    }

    public C7481Ya0(Handler handler, Context context, C7415Wa0 c7415Wa0, C8670kb0 c8670kb0) {
        super(handler);
        this.f72413a = context;
        this.f72414b = (AudioManager) context.getSystemService("audio");
        this.f72416d = c8670kb0;
    }

    public final void a() {
        this.f72415c = c();
        d();
        this.f72413a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (fC != this.f72415c) {
            this.f72415c = fC;
            d();
        }
    }
}
