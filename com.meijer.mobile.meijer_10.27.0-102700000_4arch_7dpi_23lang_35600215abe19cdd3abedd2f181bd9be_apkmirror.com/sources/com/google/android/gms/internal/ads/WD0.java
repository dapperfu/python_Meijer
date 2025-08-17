package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class WD0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7558bE0 f71033a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f71034b;

    /* renamed from: c, reason: collision with root package name */
    public final C f71035c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f71036d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f71037e = null;

    /* renamed from: f, reason: collision with root package name */
    public final UD0 f71038f;

    private WD0(C7558bE0 c7558bE0, MediaFormat mediaFormat, C c10, Surface surface, MediaCrypto mediaCrypto, UD0 ud0) {
        this.f71033a = c7558bE0;
        this.f71034b = mediaFormat;
        this.f71035c = c10;
        this.f71036d = surface;
        this.f71038f = ud0;
    }

    public static WD0 a(C7558bE0 c7558bE0, MediaFormat mediaFormat, C c10, MediaCrypto mediaCrypto, UD0 ud0) {
        return new WD0(c7558bE0, mediaFormat, c10, null, null, ud0);
    }

    public static WD0 b(C7558bE0 c7558bE0, MediaFormat mediaFormat, C c10, Surface surface, MediaCrypto mediaCrypto) {
        return new WD0(c7558bE0, mediaFormat, c10, surface, null, null);
    }
}
