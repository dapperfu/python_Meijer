package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.ParseError;
import com.android.volley.i;
import com.android.volley.k;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class i extends com.android.volley.i<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private k.b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public i(String str, k.b<Bitmap> bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, k.a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new com.android.volley.c(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i10;
        this.mMaxHeight = i11;
        this.mScaleType = scaleType;
    }

    static int findBestSampleSize(int i10, int i11, int i12, int i13) {
        double dMin = Math.min(i10 / i12, i11 / i13);
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private com.android.volley.k<Bitmap> doParse(com.android.volley.h hVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = hVar.f63753b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i10, i11, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i11, i10, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i10, i11, resizedDimension, resizedDimension2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > resizedDimension || bitmapDecodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, resizedDimension, resizedDimension2, true);
                FS.bitmap_recycle(bitmapDecodeByteArray);
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? com.android.volley.k.a(new ParseError(hVar)) : com.android.volley.k.c(bitmapDecodeByteArray, e.e(hVar));
    }

    private static int getResizedDimension(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (i12 * (i11 / i13));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = i13 / i12;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.i
    public void deliverResponse(Bitmap bitmap) {
        k.b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.i
    public i.c getPriority() {
        return i.c.LOW;
    }

    @Override // com.android.volley.i
    protected com.android.volley.k<Bitmap> parseNetworkResponse(com.android.volley.h hVar) {
        com.android.volley.k<Bitmap> kVarDoParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    kVarDoParse = doParse(hVar);
                } catch (OutOfMemoryError e10) {
                    com.android.volley.n.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(hVar.f63753b.length), getUrl());
                    return com.android.volley.k.a(new ParseError(e10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVarDoParse;
    }

    @Override // com.android.volley.i
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Deprecated
    public i(String str, k.b<Bitmap> bVar, int i10, int i11, Bitmap.Config config, k.a aVar) {
        this(str, bVar, i10, i11, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
