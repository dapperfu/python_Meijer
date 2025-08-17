package Mn;

import android.view.View;
import android.widget.ImageButton;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Mn.p2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4273p2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FullWordEllipsisTextView f20854A;

    /* renamed from: z, reason: collision with root package name */
    public final ImageButton f20855z;

    @Deprecated
    public static AbstractC4273p2 M0(View view, Object obj) {
        return (AbstractC4273p2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99336M0);
    }

    protected AbstractC4273p2(Object obj, View view, int i10, ImageButton imageButton, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f20855z = imageButton;
        this.f20854A = fullWordEllipsisTextView;
    }

    public static AbstractC4273p2 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
