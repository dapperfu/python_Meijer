package Cj;

import android.widget.ImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/ImageButton;", "", "color", "", "b", "(Landroid/widget/ImageButton;I)V", "a", "(Landroid/widget/ImageButton;)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    public static final void a(ImageButton imageButton) {
        Intrinsics.j(imageButton, "<this>");
        imageButton.setColorFilter(Z1.b.c(imageButton.getContext(), g.f4666h));
        imageButton.setEnabled(false);
    }

    public static final void b(ImageButton imageButton, int i10) {
        Intrinsics.j(imageButton, "<this>");
        imageButton.setColorFilter(i10);
        imageButton.setEnabled(true);
    }
}
