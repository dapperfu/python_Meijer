package Nj;

import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class f implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22101a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCheckBox f22102b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCheckBox f22103c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCheckBox f22104d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCheckBox f22105e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCheckBox f22106f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialCheckBox f22107g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialCheckBox f22108h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialCheckBox f22109i;

    public static f a(View view) {
        int i10 = Bj.k.f2916u;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) J4.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = Bj.k.f2918v;
            MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) J4.b.a(view, i10);
            if (materialCheckBox2 != null) {
                i10 = Bj.k.f2920w;
                MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) J4.b.a(view, i10);
                if (materialCheckBox3 != null) {
                    i10 = Bj.k.f2922x;
                    MaterialCheckBox materialCheckBox4 = (MaterialCheckBox) J4.b.a(view, i10);
                    if (materialCheckBox4 != null) {
                        i10 = Bj.k.f2924y;
                        MaterialCheckBox materialCheckBox5 = (MaterialCheckBox) J4.b.a(view, i10);
                        if (materialCheckBox5 != null) {
                            i10 = Bj.k.f2926z;
                            MaterialCheckBox materialCheckBox6 = (MaterialCheckBox) J4.b.a(view, i10);
                            if (materialCheckBox6 != null) {
                                i10 = Bj.k.f2807A;
                                MaterialCheckBox materialCheckBox7 = (MaterialCheckBox) J4.b.a(view, i10);
                                if (materialCheckBox7 != null) {
                                    i10 = Bj.k.f2809B;
                                    MaterialCheckBox materialCheckBox8 = (MaterialCheckBox) J4.b.a(view, i10);
                                    if (materialCheckBox8 != null) {
                                        return new f((ExpandableCardView) view, materialCheckBox, materialCheckBox2, materialCheckBox3, materialCheckBox4, materialCheckBox5, materialCheckBox6, materialCheckBox7, materialCheckBox8);
                                    }
                                }
                            }
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
        return this.f22101a;
    }

    private f(ExpandableCardView expandableCardView, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialCheckBox materialCheckBox3, MaterialCheckBox materialCheckBox4, MaterialCheckBox materialCheckBox5, MaterialCheckBox materialCheckBox6, MaterialCheckBox materialCheckBox7, MaterialCheckBox materialCheckBox8) {
        this.f22101a = expandableCardView;
        this.f22102b = materialCheckBox;
        this.f22103c = materialCheckBox2;
        this.f22104d = materialCheckBox3;
        this.f22105e = materialCheckBox4;
        this.f22106f = materialCheckBox5;
        this.f22107g = materialCheckBox6;
        this.f22108h = materialCheckBox7;
        this.f22109i = materialCheckBox8;
    }
}
