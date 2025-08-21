package f7;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.x;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class i implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final x f131612a = x.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f131613b;

    /* renamed from: c, reason: collision with root package name */
    private final int f131614c;

    /* renamed from: d, reason: collision with root package name */
    private final X6.b f131615d;

    /* renamed from: e, reason: collision with root package name */
    private final o f131616e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f131617f;

    /* renamed from: g, reason: collision with root package name */
    private final X6.h f131618g;

    class a implements ImageDecoder$OnPartialImageListener {
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }

        a() {
        }
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f131612a.f(this.f131613b, this.f131614c, this.f131617f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f131615d == X6.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f131613b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f131614c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f131616e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            FS.log_v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        X6.h hVar = this.f131618g;
        if (hVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((hVar == X6.h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public i(int i10, int i11, X6.g gVar) {
        boolean z10;
        this.f131613b = i10;
        this.f131614c = i11;
        this.f131615d = (X6.b) gVar.a(s.f64922f);
        this.f131616e = (o) gVar.a(o.f64917h);
        X6.f<Boolean> fVar = s.f64926j;
        if (gVar.a(fVar) != null && ((Boolean) gVar.a(fVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f131617f = z10;
        this.f131618g = (X6.h) gVar.a(s.f64923g);
    }
}
