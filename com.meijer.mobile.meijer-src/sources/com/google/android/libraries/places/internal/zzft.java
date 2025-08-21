package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.k;
import com.android.volley.toolbox.i;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzft extends i {
    final /* synthetic */ Map zza;

    @Override // com.android.volley.i
    public final Map getHeaders() {
        return this.zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzft(zzfx zzfxVar, String str, k.b bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, k.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
        Objects.requireNonNull(zzfxVar);
    }
}
