package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private Matrix f54076a;

    public interface a {
        void onSharedElementsReady();
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void e(List<View> list) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapA;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapA = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("sharedElement:snapshot:bitmap", bitmapA);
                bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i10 = (int) (iRound * fMin);
        int i11 = (int) (iRound2 * fMin);
        if (this.f54076a == null) {
            this.f54076a = new Matrix();
        }
        this.f54076a.set(matrix);
        this.f54076a.postTranslate(-rectF.left, -rectF.top);
        this.f54076a.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f54076a);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public View c(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
        }
        return imageView2;
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
            if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int i10 = (int) (intrinsicWidth * fMin);
            int i11 = (int) (intrinsicHeight * fMin);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect bounds = drawable.getBounds();
            int i12 = bounds.left;
            int i13 = bounds.top;
            int i14 = bounds.right;
            int i15 = bounds.bottom;
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            drawable.setBounds(i12, i13, i14, i15);
            return bitmapCreateBitmap;
        }
        return null;
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.onSharedElementsReady();
    }
}
