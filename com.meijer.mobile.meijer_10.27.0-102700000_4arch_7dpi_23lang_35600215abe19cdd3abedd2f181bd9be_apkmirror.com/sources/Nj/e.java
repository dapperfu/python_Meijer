package Nj;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* loaded from: classes7.dex */
public final class e implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22095a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckableImageButton f22096b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f22097c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f22098d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f22099e;

    /* renamed from: f, reason: collision with root package name */
    public final Flow f22100f;

    public static e a(View view) {
        int i10 = Bj.k.f2904p;
        CheckableImageButton checkableImageButton = (CheckableImageButton) J4.b.a(view, i10);
        if (checkableImageButton != null) {
            i10 = Bj.k.f2907q;
            CheckableImageButton checkableImageButton2 = (CheckableImageButton) J4.b.a(view, i10);
            if (checkableImageButton2 != null) {
                i10 = Bj.k.f2910r;
                CheckableImageButton checkableImageButton3 = (CheckableImageButton) J4.b.a(view, i10);
                if (checkableImageButton3 != null) {
                    i10 = Bj.k.f2912s;
                    CheckableImageButton checkableImageButton4 = (CheckableImageButton) J4.b.a(view, i10);
                    if (checkableImageButton4 != null) {
                        i10 = Bj.k.f2914t;
                        Flow flow = (Flow) J4.b.a(view, i10);
                        if (flow != null) {
                            return new e((ExpandableCardView) view, checkableImageButton, checkableImageButton2, checkableImageButton3, checkableImageButton4, flow);
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
        return this.f22095a;
    }

    private e(ExpandableCardView expandableCardView, CheckableImageButton checkableImageButton, CheckableImageButton checkableImageButton2, CheckableImageButton checkableImageButton3, CheckableImageButton checkableImageButton4, Flow flow) {
        this.f22095a = expandableCardView;
        this.f22096b = checkableImageButton;
        this.f22097c = checkableImageButton2;
        this.f22098d = checkableImageButton3;
        this.f22099e = checkableImageButton4;
        this.f22100f = flow;
    }
}
