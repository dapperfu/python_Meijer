package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    protected Context f46413a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f46414b;

    /* renamed from: c, reason: collision with root package name */
    protected f f46415c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f46416d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f46417e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f46418f;

    /* renamed from: g, reason: collision with root package name */
    private int f46419g;

    /* renamed from: h, reason: collision with root package name */
    private int f46420h;

    /* renamed from: i, reason: collision with root package name */
    protected k f46421i;

    /* renamed from: j, reason: collision with root package name */
    private int f46422j;

    public abstract void b(h hVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public boolean d(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(f fVar, h hVar) {
        return false;
    }

    public abstract boolean s(int i10, h hVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        j.a aVar = this.f46418f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46418f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.f] */
    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        j.a aVar = this.f46418f;
        n nVar2 = nVar;
        if (aVar == null) {
            return false;
        }
        if (nVar == null) {
            nVar2 = this.f46415c;
        }
        return aVar.d(nVar2);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f46422j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f46421i;
        if (viewGroup == null) {
            return;
        }
        f fVar = this.f46415c;
        int i10 = 0;
        if (fVar != null) {
            fVar.t();
            ArrayList<h> arrayListG = this.f46415c.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = arrayListG.get(i12);
                if (s(i11, hVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewP = p(hVar, childAt, viewGroup);
                    if (hVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        a(viewP, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, f fVar) {
        this.f46414b = context;
        this.f46417e = LayoutInflater.from(context);
        this.f46415c = fVar;
    }

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f46416d.inflate(this.f46420h, viewGroup, false);
    }

    public j.a o() {
        return this.f46418f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(h hVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        b(hVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f46421i == null) {
            k kVar = (k) this.f46416d.inflate(this.f46419g, viewGroup, false);
            this.f46421i = kVar;
            kVar.a(this.f46415c);
            i(true);
        }
        return this.f46421i;
    }

    public void r(int i10) {
        this.f46422j = i10;
    }

    public a(Context context, int i10, int i11) {
        this.f46413a = context;
        this.f46416d = LayoutInflater.from(context);
        this.f46419g = i10;
        this.f46420h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f46421i).addView(view, i10);
    }

    protected boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }
}
