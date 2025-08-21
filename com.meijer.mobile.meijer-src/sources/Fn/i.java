package Fn;

import Nn.B2;
import com.meijer.mobile.meijer.V;
import hs.AbstractC14573a;
import hs.C14574b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vs.ProductListDecorator;

/* loaded from: classes10.dex */
public class i extends AbstractC14573a<B2> {

    /* renamed from: d, reason: collision with root package name */
    private final List<ProductListDecorator> f10776d = new ArrayList();

    public void m(ProductListDecorator productListDecorator, boolean z10) {
        if (z10) {
            this.f10776d.add(0, productListDecorator);
            notifyItemInserted(0);
            return;
        }
        Iterator<ProductListDecorator> it = this.f10776d.iterator();
        int i10 = 0;
        while (it.hasNext() && !it.next().T(productListDecorator)) {
            i10++;
        }
        if (i10 <= 0) {
            this.f10776d.set(0, productListDecorator);
            notifyItemChanged(0);
        } else {
            this.f10776d.remove(i10);
            notifyItemRemoved(i10);
            this.f10776d.add(0, productListDecorator);
            notifyItemInserted(0);
        }
    }

    @Override // hs.AbstractC14573a
    protected void g(C14574b<B2> c14574b, int i10, List<Object> list) {
        ((B2) c14574b.f136154a).M0(this.f10776d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f10776d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return V.f100204S0;
    }

    public List<ProductListDecorator> l() {
        return this.f10776d;
    }
}
