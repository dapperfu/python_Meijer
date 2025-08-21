package Ua;

import Ta.C5327a;
import Ta.l;
import Ta.m;
import Ta.p;
import Ta.q;
import Ta.r;
import Ta.s;
import Ta.x;
import Ta.z;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.flipp.sfml.views.CollapsibleLinearLayout;
import com.flipp.sfml.views.SourceImageView;
import com.flipp.sfml.views.ZoomScrollView;
import com.flipp.sfml.views.a;
import java.util.List;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Context f37384a;

    /* renamed from: b, reason: collision with root package name */
    private z f37385b;

    /* renamed from: c, reason: collision with root package name */
    private e f37386c;

    /* renamed from: d, reason: collision with root package name */
    private SourceImageView.e f37387d;

    /* renamed from: e, reason: collision with root package name */
    private SourceImageView.c f37388e;

    /* renamed from: f, reason: collision with root package name */
    private SourceImageView.d f37389f;

    /* renamed from: g, reason: collision with root package name */
    private a.c f37390g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.flipp.sfml.views.a> f37391h;

    /* renamed from: i, reason: collision with root package name */
    private f f37392i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    private void a(ViewGroup viewGroup, r rVar, ZoomScrollView zoomScrollView) {
        ZoomScrollView zoomScrollView2;
        CollapsibleLinearLayout collapsibleLinearLayoutP;
        if (rVar == null) {
            return;
        }
        for (l lVar : rVar.v()) {
            if (lVar instanceof C5327a) {
                C5327a c5327a = (C5327a) lVar;
                CollapsibleLinearLayout collapsibleLinearLayoutH = this.f37386c.h(viewGroup.getContext(), lVar.o(), c5327a.D());
                collapsibleLinearLayoutH.setExposeTriggerTitle(c5327a.A());
                collapsibleLinearLayoutH.setCollapseType(c5327a.z());
                collapsibleLinearLayoutH.l(c5327a.B(), c5327a.C());
                zoomScrollView2 = zoomScrollView;
                collapsibleLinearLayoutP = collapsibleLinearLayoutH;
            } else if (lVar instanceof q) {
                q qVar = (q) lVar;
                zoomScrollView2 = zoomScrollView;
                ?? L10 = this.f37386c.l(viewGroup.getContext(), zoomScrollView2, this.f37388e, this.f37389f, true);
                com.flipp.sfml.views.a aVar = new com.flipp.sfml.views.a(L10);
                aVar.d().e(qVar.u()).b(this.f37390g).b(this.f37392i).d(qVar.A()).f(qVar.v()).i(qVar.y()).h(qVar.x()).j(qVar.z()).g(qVar.w()).c();
                List<com.flipp.sfml.views.a> list = this.f37391h;
                collapsibleLinearLayoutP = L10;
                if (list != null) {
                    list.add(aVar);
                    collapsibleLinearLayoutP = L10;
                }
            } else {
                zoomScrollView2 = zoomScrollView;
                if (lVar instanceof m) {
                    collapsibleLinearLayoutP = this.f37386c.j(viewGroup.getContext(), ((s) lVar).x(), lVar.o());
                } else if (lVar instanceof s) {
                    collapsibleLinearLayoutP = this.f37386c.n(viewGroup.getContext(), ((s) lVar).x(), lVar.o());
                } else if (lVar instanceof p) {
                    ?? K10 = this.f37386c.k(viewGroup.getContext(), ((p) lVar).u(), lVar.o(), zoomScrollView2, this.f37387d, this.f37388e, this.f37389f, this.f37392i);
                    zoomScrollView2 = zoomScrollView2;
                    collapsibleLinearLayoutP = K10;
                } else {
                    collapsibleLinearLayoutP = lVar instanceof x ? this.f37386c.p(viewGroup.getContext(), ((x) lVar).u(), lVar.o(), true) : null;
                }
            }
            if (collapsibleLinearLayoutP != null) {
                this.f37386c.d(collapsibleLinearLayoutP, lVar);
                this.f37386c.y(collapsibleLinearLayoutP, lVar);
                this.f37386c.c(viewGroup, collapsibleLinearLayoutP, lVar);
                if ((collapsibleLinearLayoutP instanceof ViewGroup) && (lVar instanceof r)) {
                    a(collapsibleLinearLayoutP, (r) lVar, zoomScrollView2);
                }
            }
            zoomScrollView = zoomScrollView2;
        }
    }

    public ViewGroup b() {
        e eVar = (e) Sa.c.c(e.class);
        this.f37386c = eVar;
        ZoomScrollView zoomScrollView = (ZoomScrollView) eVar.o(this.f37384a);
        FrameLayout frameLayout = new FrameLayout(this.f37384a);
        frameLayout.setBackgroundColor(-1);
        zoomScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        a(frameLayout, this.f37385b.g(), zoomScrollView);
        return zoomScrollView;
    }

    public g c(f fVar) {
        this.f37392i = fVar;
        return this;
    }

    public g d(SourceImageView.e eVar) {
        this.f37387d = eVar;
        return this;
    }

    public g e(List<com.flipp.sfml.views.a> list) {
        this.f37391h = list;
        return this;
    }

    public g f(SourceImageView.d dVar) {
        this.f37389f = dVar;
        return this;
    }

    public g(Context context, z zVar) {
        this.f37384a = context;
        this.f37385b = zVar;
    }
}
