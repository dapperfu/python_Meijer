package En;

import Fq.ShoppingListItem;
import Gn.ShoppingListTypeAheadResultItem;
import Mn.D2;
import com.meijer.mobile.meijer.V;
import hs.AbstractC14567a;
import hs.C14568b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class l extends AbstractC14567a<D2> {

    /* renamed from: d, reason: collision with root package name */
    private final List<ShoppingListTypeAheadResultItem> f9352d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final a f9353e;

    public interface a {
        void a(ShoppingListItem shoppingListItem);

        void b(String str);
    }

    @Override // hs.AbstractC14567a
    protected void f(C14568b<D2> c14568b, int i10, List<Object> list) {
        ((D2) c14568b.f136245a).K0(this.f9352d.get(i10));
        ((D2) c14568b.f136245a).M0(this.f9353e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9352d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return V.f99350T0;
    }

    public void l(List<ShoppingListTypeAheadResultItem> list) {
        this.f9352d.clear();
        this.f9352d.addAll(list);
        notifyDataSetChanged();
    }

    public l(a aVar) {
        this.f9353e = aVar;
    }
}
