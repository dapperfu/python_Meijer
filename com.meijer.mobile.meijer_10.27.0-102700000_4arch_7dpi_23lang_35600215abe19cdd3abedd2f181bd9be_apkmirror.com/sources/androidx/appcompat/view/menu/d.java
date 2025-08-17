package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import i.C14581g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f46239a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f46240b;

    /* renamed from: c, reason: collision with root package name */
    f f46241c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f46242d;

    /* renamed from: e, reason: collision with root package name */
    int f46243e;

    /* renamed from: f, reason: collision with root package name */
    int f46244f;

    /* renamed from: g, reason: collision with root package name */
    int f46245g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f46246h;

    /* renamed from: i, reason: collision with root package name */
    a f46247i;

    /* renamed from: j, reason: collision with root package name */
    private int f46248j;

    private class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f46249a = -1;

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                d dVar = d.this;
                view = dVar.f46240b.inflate(dVar.f46245g, viewGroup, false);
            }
            ((k.a) view).b(getItem(i10), 0);
            return view;
        }

        public a() {
            a();
        }

        void a() {
            h hVarX = d.this.f46241c.x();
            if (hVarX != null) {
                ArrayList<h> arrayListB = d.this.f46241c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListB.get(i10) == hVarX) {
                        this.f46249a = i10;
                        return;
                    }
                }
            }
            this.f46249a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h getItem(int i10) {
            ArrayList<h> arrayListB = d.this.f46241c.B();
            int i11 = i10 + d.this.f46243e;
            int i12 = this.f46249a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = d.this.f46241c.B().size() - d.this.f46243e;
            return this.f46249a < 0 ? size : size - 1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context, int i10) {
        this(i10, 0);
        this.f46239a = context;
        this.f46240b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(f fVar, h hVar) {
        return false;
    }

    public ListAdapter a() {
        if (this.f46247i == null) {
            this.f46247i = new a();
        }
        return this.f46247i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f46242d == null) {
            this.f46242d = (ExpandedMenuView) this.f46240b.inflate(C14581g.f136654g, viewGroup, false);
            if (this.f46247i == null) {
                this.f46247i = new a();
            }
            this.f46242d.setAdapter((ListAdapter) this.f46247i);
            this.f46242d.setOnItemClickListener(this);
        }
        return this.f46242d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        j.a aVar = this.f46246h;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46246h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f46248j;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.f46242d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        a aVar = this.f46247i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, f fVar) {
        if (this.f46244f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f46244f);
            this.f46239a = contextThemeWrapper;
            this.f46240b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f46239a != null) {
            this.f46239a = context;
            if (this.f46240b == null) {
                this.f46240b = LayoutInflater.from(context);
            }
        }
        this.f46241c = fVar;
        a aVar = this.f46247i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f46242d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f46242d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f46241c.P(this.f46247i.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        new g(nVar).b(null);
        j.a aVar = this.f46246h;
        if (aVar != null) {
            aVar.d(nVar);
            return true;
        }
        return true;
    }

    public d(int i10, int i11) {
        this.f46245g = i10;
        this.f46244f = i11;
    }
}
