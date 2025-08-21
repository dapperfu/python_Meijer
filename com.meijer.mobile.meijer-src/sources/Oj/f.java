package Oj;

import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class f implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24346a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCheckBox f24347b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCheckBox f24348c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCheckBox f24349d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCheckBox f24350e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCheckBox f24351f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialCheckBox f24352g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialCheckBox f24353h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialCheckBox f24354i;

    public static f a(View view) {
        int i10 = Cj.k.f4961u;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) K4.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = Cj.k.f4963v;
            MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) K4.b.a(view, i10);
            if (materialCheckBox2 != null) {
                i10 = Cj.k.f4965w;
                MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) K4.b.a(view, i10);
                if (materialCheckBox3 != null) {
                    i10 = Cj.k.f4967x;
                    MaterialCheckBox materialCheckBox4 = (MaterialCheckBox) K4.b.a(view, i10);
                    if (materialCheckBox4 != null) {
                        i10 = Cj.k.f4969y;
                        MaterialCheckBox materialCheckBox5 = (MaterialCheckBox) K4.b.a(view, i10);
                        if (materialCheckBox5 != null) {
                            i10 = Cj.k.f4971z;
                            MaterialCheckBox materialCheckBox6 = (MaterialCheckBox) K4.b.a(view, i10);
                            if (materialCheckBox6 != null) {
                                i10 = Cj.k.f4852A;
                                MaterialCheckBox materialCheckBox7 = (MaterialCheckBox) K4.b.a(view, i10);
                                if (materialCheckBox7 != null) {
                                    i10 = Cj.k.f4854B;
                                    MaterialCheckBox materialCheckBox8 = (MaterialCheckBox) K4.b.a(view, i10);
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

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24346a;
    }

    private f(ExpandableCardView expandableCardView, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialCheckBox materialCheckBox3, MaterialCheckBox materialCheckBox4, MaterialCheckBox materialCheckBox5, MaterialCheckBox materialCheckBox6, MaterialCheckBox materialCheckBox7, MaterialCheckBox materialCheckBox8) {
        this.f24346a = expandableCardView;
        this.f24347b = materialCheckBox;
        this.f24348c = materialCheckBox2;
        this.f24349d = materialCheckBox3;
        this.f24350e = materialCheckBox4;
        this.f24351f = materialCheckBox5;
        this.f24352g = materialCheckBox6;
        this.f24353h = materialCheckBox7;
        this.f24354i = materialCheckBox8;
    }
}
