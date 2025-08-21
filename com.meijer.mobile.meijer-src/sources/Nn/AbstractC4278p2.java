package Nn;

import android.view.View;
import android.widget.ImageButton;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Nn.p2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4278p2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FullWordEllipsisTextView f22186A;

    /* renamed from: z, reason: collision with root package name */
    public final ImageButton f22187z;

    @Deprecated
    public static AbstractC4278p2 N0(View view, Object obj) {
        return (AbstractC4278p2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100192M0);
    }

    protected AbstractC4278p2(Object obj, View view, int i10, ImageButton imageButton, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f22187z = imageButton;
        this.f22186A = fullWordEllipsisTextView;
    }

    public static AbstractC4278p2 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
