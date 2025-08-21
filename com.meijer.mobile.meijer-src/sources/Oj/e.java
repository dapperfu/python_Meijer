package Oj;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* loaded from: classes8.dex */
public final class e implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24340a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckableImageButton f24341b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f24342c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f24343d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f24344e;

    /* renamed from: f, reason: collision with root package name */
    public final Flow f24345f;

    public static e a(View view) {
        int i10 = Cj.k.f4949p;
        CheckableImageButton checkableImageButton = (CheckableImageButton) K4.b.a(view, i10);
        if (checkableImageButton != null) {
            i10 = Cj.k.f4952q;
            CheckableImageButton checkableImageButton2 = (CheckableImageButton) K4.b.a(view, i10);
            if (checkableImageButton2 != null) {
                i10 = Cj.k.f4955r;
                CheckableImageButton checkableImageButton3 = (CheckableImageButton) K4.b.a(view, i10);
                if (checkableImageButton3 != null) {
                    i10 = Cj.k.f4957s;
                    CheckableImageButton checkableImageButton4 = (CheckableImageButton) K4.b.a(view, i10);
                    if (checkableImageButton4 != null) {
                        i10 = Cj.k.f4959t;
                        Flow flow = (Flow) K4.b.a(view, i10);
                        if (flow != null) {
                            return new e((ExpandableCardView) view, checkableImageButton, checkableImageButton2, checkableImageButton3, checkableImageButton4, flow);
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
        return this.f24340a;
    }

    private e(ExpandableCardView expandableCardView, CheckableImageButton checkableImageButton, CheckableImageButton checkableImageButton2, CheckableImageButton checkableImageButton3, CheckableImageButton checkableImageButton4, Flow flow) {
        this.f24340a = expandableCardView;
        this.f24341b = checkableImageButton;
        this.f24342c = checkableImageButton2;
        this.f24343d = checkableImageButton3;
        this.f24344e = checkableImageButton4;
        this.f24345f = flow;
    }
}
