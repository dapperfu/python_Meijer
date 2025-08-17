package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzot extends f {
    private final ImageView zza;
    private final Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzot(ImageView view, Function1 function1) {
        super(view);
        Intrinsics.j(view, "view");
        this.zza = view;
        this.zzb = function1;
    }

    @Override // com.bumptech.glide.request.target.f, com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.j
    public final void onLoadFailed(Drawable drawable) {
        Function1 function1 = this.zzb;
        if (function1 != null) {
            function1.invoke(this.zza);
        }
    }

    @Override // com.bumptech.glide.request.target.f
    public final /* bridge */ /* synthetic */ void setResource(Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        this.zza.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzos
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.setImageBitmap(bitmap);
            }
        });
    }
}
