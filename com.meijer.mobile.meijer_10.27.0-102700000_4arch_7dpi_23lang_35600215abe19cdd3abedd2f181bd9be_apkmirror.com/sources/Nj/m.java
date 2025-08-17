package Nj;

import android.view.View;
import android.widget.RadioGroup;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class m implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22130a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioGroup f22131b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioGroup f22132c;

    public static m a(View view) {
        int i10 = Bj.k.f2835O;
        RadioGroup radioGroup = (RadioGroup) J4.b.a(view, i10);
        if (radioGroup != null) {
            i10 = Bj.k.f2837P;
            RadioGroup radioGroup2 = (RadioGroup) J4.b.a(view, i10);
            if (radioGroup2 != null) {
                return new m((ExpandableCardView) view, radioGroup, radioGroup2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22130a;
    }

    private m(ExpandableCardView expandableCardView, RadioGroup radioGroup, RadioGroup radioGroup2) {
        this.f22130a = expandableCardView;
        this.f22131b = radioGroup;
        this.f22132c = radioGroup2;
    }
}
