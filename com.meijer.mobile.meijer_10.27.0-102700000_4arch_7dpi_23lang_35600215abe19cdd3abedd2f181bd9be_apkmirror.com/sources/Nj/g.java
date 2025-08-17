package Nj;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.helper.widget.Flow;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class g implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22110a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f22111b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f22112c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageButton f22113d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f22114e;

    /* renamed from: f, reason: collision with root package name */
    public final Flow f22115f;

    public static g a(View view) {
        int i10 = Bj.k.f2847U;
        ImageButton imageButton = (ImageButton) J4.b.a(view, i10);
        if (imageButton != null) {
            i10 = Bj.k.f2849V;
            ImageButton imageButton2 = (ImageButton) J4.b.a(view, i10);
            if (imageButton2 != null) {
                i10 = Bj.k.f2851W;
                ImageButton imageButton3 = (ImageButton) J4.b.a(view, i10);
                if (imageButton3 != null) {
                    i10 = Bj.k.f2853X;
                    ImageButton imageButton4 = (ImageButton) J4.b.a(view, i10);
                    if (imageButton4 != null) {
                        i10 = Bj.k.f2855Y;
                        Flow flow = (Flow) J4.b.a(view, i10);
                        if (flow != null) {
                            return new g((ExpandableCardView) view, imageButton, imageButton2, imageButton3, imageButton4, flow);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22110a;
    }

    private g(ExpandableCardView expandableCardView, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, Flow flow) {
        this.f22110a = expandableCardView;
        this.f22111b = imageButton;
        this.f22112c = imageButton2;
        this.f22113d = imageButton3;
        this.f22114e = imageButton4;
        this.f22115f = flow;
    }
}
