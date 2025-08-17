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
    protected Context f46189a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f46190b;

    /* renamed from: c, reason: collision with root package name */
    protected f f46191c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f46192d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f46193e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f46194f;

    /* renamed from: g, reason: collision with root package name */
    private int f46195g;

    /* renamed from: h, reason: collision with root package name */
    private int f46196h;

    /* renamed from: i, reason: collision with root package name */
    protected k f46197i;

    /* renamed from: j, reason: collision with root package name */
    private int f46198j;

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
        j.a aVar = this.f46194f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46194f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.f] */
    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        j.a aVar = this.f46194f;
        n nVar2 = nVar;
        if (aVar == null) {
            return false;
        }
        if (nVar == null) {
            nVar2 = this.f46191c;
        }
        return aVar.d(nVar2);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f46198j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f46197i;
        if (viewGroup == null) {
            return;
        }
        f fVar = this.f46191c;
        int i10 = 0;
        if (fVar != null) {
            fVar.t();
            ArrayList<h> arrayListG = this.f46191c.G();
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
        this.f46190b = context;
        this.f46193e = LayoutInflater.from(context);
        this.f46191c = fVar;
    }

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f46192d.inflate(this.f46196h, viewGroup, false);
    }

    public j.a o() {
        return this.f46194f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(h hVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        b(hVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f46197i == null) {
            k kVar = (k) this.f46192d.inflate(this.f46195g, viewGroup, false);
            this.f46197i = kVar;
            kVar.a(this.f46191c);
            i(true);
        }
        return this.f46197i;
    }

    public void r(int i10) {
        this.f46198j = i10;
    }

    public a(Context context, int i10, int i11) {
        this.f46189a = context;
        this.f46192d = LayoutInflater.from(context);
        this.f46195g = i10;
        this.f46196h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f46197i).addView(view, i10);
    }

    protected boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }
}
