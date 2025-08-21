package de;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: de.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13666f extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f128359a;

    public C13666f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f128359a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f128359a.set(imageView.getImageMatrix());
        return this.f128359a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
