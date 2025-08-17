package be;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: be.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6235f extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f60124a;

    public C6235f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f60124a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f60124a.set(imageView.getImageMatrix());
        return this.f60124a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
