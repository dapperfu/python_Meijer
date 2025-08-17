package d7;

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
    private final x f127283a = x.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f127284b;

    /* renamed from: c, reason: collision with root package name */
    private final int f127285c;

    /* renamed from: d, reason: collision with root package name */
    private final V6.b f127286d;

    /* renamed from: e, reason: collision with root package name */
    private final o f127287e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f127288f;

    /* renamed from: g, reason: collision with root package name */
    private final V6.h f127289g;

    class a implements ImageDecoder$OnPartialImageListener {
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }

        a() {
        }
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f127283a.f(this.f127284b, this.f127285c, this.f127288f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f127286d == V6.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f127284b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f127285c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f127287e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            FS.log_v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        V6.h hVar = this.f127289g;
        if (hVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((hVar == V6.h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public i(int i10, int i11, V6.g gVar) {
        boolean z10;
        this.f127284b = i10;
        this.f127285c = i11;
        this.f127286d = (V6.b) gVar.a(s.f64082f);
        this.f127287e = (o) gVar.a(o.f64077h);
        V6.f<Boolean> fVar = s.f64086j;
        if (gVar.a(fVar) != null && ((Boolean) gVar.a(fVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f127288f = z10;
        this.f127289g = (V6.h) gVar.a(s.f64083g);
    }
}
