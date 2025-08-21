package Oj;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.helper.widget.Flow;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class g implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24355a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f24356b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f24357c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageButton f24358d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f24359e;

    /* renamed from: f, reason: collision with root package name */
    public final Flow f24360f;

    public static g a(View view) {
        int i10 = Cj.k.f4892U;
        ImageButton imageButton = (ImageButton) K4.b.a(view, i10);
        if (imageButton != null) {
            i10 = Cj.k.f4894V;
            ImageButton imageButton2 = (ImageButton) K4.b.a(view, i10);
            if (imageButton2 != null) {
                i10 = Cj.k.f4896W;
                ImageButton imageButton3 = (ImageButton) K4.b.a(view, i10);
                if (imageButton3 != null) {
                    i10 = Cj.k.f4898X;
                    ImageButton imageButton4 = (ImageButton) K4.b.a(view, i10);
                    if (imageButton4 != null) {
                        i10 = Cj.k.f4900Y;
                        Flow flow = (Flow) K4.b.a(view, i10);
                        if (flow != null) {
                            return new g((ExpandableCardView) view, imageButton, imageButton2, imageButton3, imageButton4, flow);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24355a;
    }

    private g(ExpandableCardView expandableCardView, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, Flow flow) {
        this.f24355a = expandableCardView;
        this.f24356b = imageButton;
        this.f24357c = imageButton2;
        this.f24358d = imageButton3;
        this.f24359e = imageButton4;
        this.f24360f = flow;
    }
}
