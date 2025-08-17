package Sa;

import Ra.C5180a;
import Ra.l;
import Ra.m;
import Ra.p;
import Ra.q;
import Ra.r;
import Ra.s;
import Ra.x;
import Ra.z;
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
    private Context f33508a;

    /* renamed from: b, reason: collision with root package name */
    private z f33509b;

    /* renamed from: c, reason: collision with root package name */
    private e f33510c;

    /* renamed from: d, reason: collision with root package name */
    private SourceImageView.e f33511d;

    /* renamed from: e, reason: collision with root package name */
    private SourceImageView.c f33512e;

    /* renamed from: f, reason: collision with root package name */
    private SourceImageView.d f33513f;

    /* renamed from: g, reason: collision with root package name */
    private a.c f33514g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.flipp.sfml.views.a> f33515h;

    /* renamed from: i, reason: collision with root package name */
    private f f33516i;

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
            if (lVar instanceof C5180a) {
                C5180a c5180a = (C5180a) lVar;
                CollapsibleLinearLayout collapsibleLinearLayoutH = this.f33510c.h(viewGroup.getContext(), lVar.o(), c5180a.D());
                collapsibleLinearLayoutH.setExposeTriggerTitle(c5180a.A());
                collapsibleLinearLayoutH.setCollapseType(c5180a.z());
                collapsibleLinearLayoutH.l(c5180a.B(), c5180a.C());
                zoomScrollView2 = zoomScrollView;
                collapsibleLinearLayoutP = collapsibleLinearLayoutH;
            } else if (lVar instanceof q) {
                q qVar = (q) lVar;
                zoomScrollView2 = zoomScrollView;
                ?? L10 = this.f33510c.l(viewGroup.getContext(), zoomScrollView2, this.f33512e, this.f33513f, true);
                com.flipp.sfml.views.a aVar = new com.flipp.sfml.views.a(L10);
                aVar.d().e(qVar.u()).b(this.f33514g).b(this.f33516i).d(qVar.A()).f(qVar.v()).i(qVar.y()).h(qVar.x()).j(qVar.z()).g(qVar.w()).c();
                List<com.flipp.sfml.views.a> list = this.f33515h;
                collapsibleLinearLayoutP = L10;
                if (list != null) {
                    list.add(aVar);
                    collapsibleLinearLayoutP = L10;
                }
            } else {
                zoomScrollView2 = zoomScrollView;
                if (lVar instanceof m) {
                    collapsibleLinearLayoutP = this.f33510c.j(viewGroup.getContext(), ((s) lVar).x(), lVar.o());
                } else if (lVar instanceof s) {
                    collapsibleLinearLayoutP = this.f33510c.n(viewGroup.getContext(), ((s) lVar).x(), lVar.o());
                } else if (lVar instanceof p) {
                    ?? K10 = this.f33510c.k(viewGroup.getContext(), ((p) lVar).u(), lVar.o(), zoomScrollView2, this.f33511d, this.f33512e, this.f33513f, this.f33516i);
                    zoomScrollView2 = zoomScrollView2;
                    collapsibleLinearLayoutP = K10;
                } else {
                    collapsibleLinearLayoutP = lVar instanceof x ? this.f33510c.p(viewGroup.getContext(), ((x) lVar).u(), lVar.o(), true) : null;
                }
            }
            if (collapsibleLinearLayoutP != null) {
                this.f33510c.d(collapsibleLinearLayoutP, lVar);
                this.f33510c.y(collapsibleLinearLayoutP, lVar);
                this.f33510c.c(viewGroup, collapsibleLinearLayoutP, lVar);
                if ((collapsibleLinearLayoutP instanceof ViewGroup) && (lVar instanceof r)) {
                    a(collapsibleLinearLayoutP, (r) lVar, zoomScrollView2);
                }
            }
            zoomScrollView = zoomScrollView2;
        }
    }

    public ViewGroup b() {
        e eVar = (e) Qa.c.c(e.class);
        this.f33510c = eVar;
        ZoomScrollView zoomScrollView = (ZoomScrollView) eVar.o(this.f33508a);
        FrameLayout frameLayout = new FrameLayout(this.f33508a);
        frameLayout.setBackgroundColor(-1);
        zoomScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        a(frameLayout, this.f33509b.g(), zoomScrollView);
        return zoomScrollView;
    }

    public g c(f fVar) {
        this.f33516i = fVar;
        return this;
    }

    public g d(SourceImageView.e eVar) {
        this.f33511d = eVar;
        return this;
    }

    public g e(List<com.flipp.sfml.views.a> list) {
        this.f33515h = list;
        return this;
    }

    public g f(SourceImageView.d dVar) {
        this.f33513f = dVar;
        return this;
    }

    public g(Context context, z zVar) {
        this.f33508a = context;
        this.f33509b = zVar;
    }
}
