package Nn;

import android.view.View;
import android.widget.ImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;

/* renamed from: Nn.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4260l0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final CardView f22106A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f22107B;

    /* renamed from: C, reason: collision with root package name */
    public final DebouncingAutoCompleteTextView f22108C;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f22109z;

    protected AbstractC4260l0(Object obj, View view, int i10, Barrier barrier, CardView cardView, ImageButton imageButton, DebouncingAutoCompleteTextView debouncingAutoCompleteTextView) {
        super(obj, view, i10);
        this.f22109z = barrier;
        this.f22106A = cardView;
        this.f22107B = imageButton;
        this.f22108C = debouncingAutoCompleteTextView;
    }
}
