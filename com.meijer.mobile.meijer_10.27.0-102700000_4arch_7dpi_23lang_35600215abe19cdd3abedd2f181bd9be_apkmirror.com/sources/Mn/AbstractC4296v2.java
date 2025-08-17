package Mn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Mn.v2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4296v2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f21044A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f21045B;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f21046z;

    @Deprecated
    public static AbstractC4296v2 M0(View view, Object obj) {
        return (AbstractC4296v2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99342P0);
    }

    protected AbstractC4296v2(Object obj, View view, int i10, FrameLayout frameLayout, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f21046z = frameLayout;
        this.f21044A = imageView;
        this.f21045B = fullWordEllipsisTextView;
    }

    public static AbstractC4296v2 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
