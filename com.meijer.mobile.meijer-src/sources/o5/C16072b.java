package o5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lo5/b;", "Lo5/a;", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/widget/ImageView;", "h", "()Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "value", "d", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16072b extends AbstractC16071a<ImageView> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageView view;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C16072b) && Intrinsics.e(getView(), ((C16072b) other).getView());
    }

    @Override // o5.InterfaceC16074d
    /* renamed from: h, reason: from getter */
    public ImageView getView() {
        return this.view;
    }

    public C16072b(ImageView imageView) {
        this.view = imageView;
    }

    @Override // o5.AbstractC16071a, q5.InterfaceC16607d
    public Drawable d() {
        return getView().getDrawable();
    }

    @Override // o5.AbstractC16071a
    public void e(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
