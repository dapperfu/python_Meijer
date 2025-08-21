package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class WD0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7683bE0 f71873a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f71874b;

    /* renamed from: c, reason: collision with root package name */
    public final C f71875c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f71876d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f71877e = null;

    /* renamed from: f, reason: collision with root package name */
    public final UD0 f71878f;

    private WD0(C7683bE0 c7683bE0, MediaFormat mediaFormat, C c10, Surface surface, MediaCrypto mediaCrypto, UD0 ud0) {
        this.f71873a = c7683bE0;
        this.f71874b = mediaFormat;
        this.f71875c = c10;
        this.f71876d = surface;
        this.f71878f = ud0;
    }

    public static WD0 a(C7683bE0 c7683bE0, MediaFormat mediaFormat, C c10, MediaCrypto mediaCrypto, UD0 ud0) {
        return new WD0(c7683bE0, mediaFormat, c10, null, null, ud0);
    }

    public static WD0 b(C7683bE0 c7683bE0, MediaFormat mediaFormat, C c10, Surface surface, MediaCrypto mediaCrypto) {
        return new WD0(c7683bE0, mediaFormat, c10, surface, null, null);
    }
}
