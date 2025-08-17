package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    @Override // androidx.cardview.widget.c
    public void l() {
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.b(new d(colorStateList, f10));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f11);
        o(bVar, f12);
    }

    a() {
    }

    private d p(b bVar) {
        return (d) bVar.d();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, float f10) {
        p(bVar).h(f10);
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return p(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return p(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList e(b bVar) {
        return p(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar) {
        o(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        o(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k(b bVar) {
        if (!bVar.c()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fD = d(bVar);
        float fB = b(bVar);
        int iCeil = (int) Math.ceil(e.a(fD, fB, bVar.e()));
        int iCeil2 = (int) Math.ceil(e.b(fD, fB, bVar.e()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.c
    public float m(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void o(b bVar, float f10) {
        p(bVar).g(f10, bVar.c(), bVar.e());
        k(bVar);
    }
}
