package com.google.android.libraries.places.widget.internal.photoviewer;

import Y6.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.resource.bitmap.AbstractC6515h;
import com.fullstory.FS;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class zza extends AbstractC6515h {
    private final float zza;
    private final float zzb;
    private final Context zzc;

    @Override // V6.e
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        if (Float.valueOf(this.zza).equals(Float.valueOf(zzaVar.zza))) {
            if (Float.valueOf(this.zzb).equals(Float.valueOf(zzaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public zza(Context ctx, float f10, float f11) {
        Intrinsics.j(ctx, "ctx");
        this.zza = 25.0f;
        this.zzb = 0.125f;
        Context applicationContext = ctx.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.zzc = applicationContext;
        double d10 = 25.0f;
        if (d10 < 0.0d || d10 > 25.0d) {
            throw new IllegalArgumentException("Blur radius must be between 0 and 25!");
        }
    }

    @Override // V6.e
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.places.widget.internal.photoviewer.BlurTransformation", Float.valueOf(this.zza), Float.valueOf(this.zzb));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6515h
    protected final Bitmap transform(d pool, Bitmap toTransform, int i10, int i11) {
        Intrinsics.j(pool, "pool");
        Intrinsics.j(toTransform, "toTransform");
        float width = toTransform.getWidth();
        float f10 = this.zzb;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(toTransform, Math.round(width * f10), Math.round(toTransform.getHeight() * f10), false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        RenderScript renderScriptCreate = RenderScript.create(this.zzc);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        try {
            scriptIntrinsicBlurCreate.setRadius(this.zza);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } finally {
            FS.bitmap_recycle(bitmapCreateScaledBitmap);
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
        }
    }

    @Override // V6.e
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.j(messageDigest, "messageDigest");
        byte[] bytes = "blurred".getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        messageDigest.update((byte) (this.zza * 10.0f));
        messageDigest.update((byte) (this.zzb * 10.0f));
    }
}
