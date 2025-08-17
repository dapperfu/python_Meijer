package com.google.maps.android.ktx;

import Kd.C3945c;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class GoogleMapKt$awaitSnapshot$2$1 implements C3945c.w {
    final /* synthetic */ Continuation<Bitmap> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitSnapshot$2$1(Continuation<? super Bitmap> continuation) {
        this.$continuation = continuation;
    }

    @Override // Kd.C3945c.w
    public final void onSnapshotReady(Bitmap bitmap) {
        this.$continuation.resumeWith(Result.b(bitmap));
    }
}
