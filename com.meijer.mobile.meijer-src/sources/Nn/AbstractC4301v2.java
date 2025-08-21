package Nn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Nn.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4301v2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f22376A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f22377B;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f22378z;

    @Deprecated
    public static AbstractC4301v2 N0(View view, Object obj) {
        return (AbstractC4301v2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100198P0);
    }

    protected AbstractC4301v2(Object obj, View view, int i10, FrameLayout frameLayout, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f22378z = frameLayout;
        this.f22376A = imageView;
        this.f22377B = fullWordEllipsisTextView;
    }

    public static AbstractC4301v2 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
