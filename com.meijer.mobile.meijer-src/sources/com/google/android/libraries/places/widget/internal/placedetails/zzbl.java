package com.google.android.libraries.places.widget.internal.placedetails;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzbl extends zzbp {
    private final Uri zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(Uri uri) {
        super(null);
        Intrinsics.j(uri, "uri");
        this.zza = uri;
    }

    public final Uri zza() {
        return this.zza;
    }
}
