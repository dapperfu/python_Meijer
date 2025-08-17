package En;

import Mn.B2;
import com.meijer.mobile.meijer.V;
import hs.AbstractC14567a;
import hs.C14568b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vs.ProductListDecorator;

/* loaded from: classes9.dex */
public class i extends AbstractC14567a<B2> {

    /* renamed from: d, reason: collision with root package name */
    private final List<ProductListDecorator> f9347d = new ArrayList();

    public void m(ProductListDecorator productListDecorator, boolean z10) {
        if (z10) {
            this.f9347d.add(0, productListDecorator);
            notifyItemInserted(0);
            return;
        }
        Iterator<ProductListDecorator> it = this.f9347d.iterator();
        int i10 = 0;
        while (it.hasNext() && !it.next().T(productListDecorator)) {
            i10++;
        }
        if (i10 <= 0) {
            this.f9347d.set(0, productListDecorator);
            notifyItemChanged(0);
        } else {
            this.f9347d.remove(i10);
            notifyItemRemoved(i10);
            this.f9347d.add(0, productListDecorator);
            notifyItemInserted(0);
        }
    }

    @Override // hs.AbstractC14567a
    protected void f(C14568b<B2> c14568b, int i10, List<Object> list) {
        ((B2) c14568b.f136245a).K0(this.f9347d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f9347d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return V.f99348S0;
    }

    public List<ProductListDecorator> l() {
        return this.f9347d;
    }
}
