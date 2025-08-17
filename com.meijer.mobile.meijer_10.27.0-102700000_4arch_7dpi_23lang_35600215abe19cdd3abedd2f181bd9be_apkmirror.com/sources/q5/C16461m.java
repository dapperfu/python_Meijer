package q5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.C6363i;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import m5.C15552b;
import m5.EnumC15558h;
import m5.Size;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lq5/m;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "Lm5/i;", "size", "Lm5/h;", "scale", "c", "(ZLandroid/graphics/Bitmap;Lm5/i;Lm5/h;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lm5/i;Lm5/h;Z)Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q5.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16461m {

    /* renamed from: a, reason: collision with root package name */
    public static final C16461m f156792a = new C16461m();

    private final boolean c(boolean allowInexactSize, Bitmap bitmap, Size size, EnumC15558h scale) {
        if (allowInexactSize) {
            return true;
        }
        return C6363i.c(bitmap.getWidth(), bitmap.getHeight(), C15552b.a(size) ? bitmap.getWidth() : C16458j.B(size.getWidth(), scale), C15552b.a(size) ? bitmap.getHeight() : C16458j.B(size.getHeight(), scale), scale) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, Size size, EnumC15558h scale, boolean allowInexactSize) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(allowInexactSize, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iQ = C16458j.q(drawableMutate);
        if (iQ <= 0) {
            iQ = 512;
        }
        int iJ = C16458j.j(drawableMutate);
        int i10 = iJ > 0 ? iJ : 512;
        double dC = C6363i.c(iQ, i10, C15552b.a(size) ? iQ : C16458j.B(size.getWidth(), scale), C15552b.a(size) ? i10 : C16458j.B(size.getHeight(), scale), scale);
        int iC = MathKt.c(iQ * dC);
        int iC2 = MathKt.c(dC * i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, C16449a.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    private C16461m() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == C16449a.e(config)) {
            return true;
        }
        return false;
    }
}
