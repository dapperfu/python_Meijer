package Mn;

import android.view.View;
import android.widget.ImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;

/* renamed from: Mn.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4255l0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final CardView f20774A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f20775B;

    /* renamed from: C, reason: collision with root package name */
    public final DebouncingAutoCompleteTextView f20776C;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f20777z;

    protected AbstractC4255l0(Object obj, View view, int i10, Barrier barrier, CardView cardView, ImageButton imageButton, DebouncingAutoCompleteTextView debouncingAutoCompleteTextView) {
        super(obj, view, i10);
        this.f20777z = barrier;
        this.f20774A = cardView;
        this.f20775B = imageButton;
        this.f20776C = debouncingAutoCompleteTextView;
    }
}
