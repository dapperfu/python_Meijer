package zr;

import V0.C5489q0;
import V0.C5492s0;
import Z1.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import d2.C13595a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lzr/a;", "", "Landroid/content/Context;", "context", "", "size", "<init>", "(Landroid/content/Context;I)V", "drawable", "LV0/q0;", "color", "c", "(ILV0/q0;)I", "tintColor", "Landroid/graphics/Bitmap;", "d", "(ILandroid/content/Context;LV0/q0;)Landroid/graphics/Bitmap;", "a", "(ILV0/q0;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "I", "getSize", "()I", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "cache", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18545a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LruCache<Integer, Bitmap> cache;

    public C18545a(Context context, int i10) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.size = i10;
        this.cache = new LruCache<>(i10);
    }

    public static /* synthetic */ Bitmap b(C18545a c18545a, int i10, C5489q0 c5489q0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c5489q0 = null;
        }
        return c18545a.a(i10, c5489q0);
    }

    private final int c(int drawable, C5489q0 color) {
        return ((527 + drawable) * 31) + (color != null ? C5492s0.j(color.getValue()) : 0);
    }

    private final Bitmap d(int i10, Context context, C5489q0 c5489q0) {
        Drawable drawableE = b.e(context, i10);
        if (drawableE == null) {
            return null;
        }
        drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        if (c5489q0 != null) {
            C13595a.n(drawableE, C5492s0.j(c5489q0.getValue()));
        }
        drawableE.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final Bitmap a(int drawable, C5489q0 tintColor) {
        Bitmap bitmapD;
        int iC = c(drawable, tintColor);
        if (this.cache.get(Integer.valueOf(iC)) == null && (bitmapD = d(drawable, this.context, tintColor)) != null) {
            this.cache.put(Integer.valueOf(iC), bitmapD);
        }
        qw.a.INSTANCE.q("Hits:" + this.cache.hitCount() + " Misses:" + this.cache.missCount(), new Object[0]);
        return this.cache.get(Integer.valueOf(iC));
    }
}
