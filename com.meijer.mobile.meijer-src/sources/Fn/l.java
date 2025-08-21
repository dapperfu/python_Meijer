package Fn;

import Fq.ShoppingListItem;
import Hn.ShoppingListTypeAheadResultItem;
import Nn.D2;
import com.meijer.mobile.meijer.V;
import hs.AbstractC14573a;
import hs.C14574b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class l extends AbstractC14573a<D2> {

    /* renamed from: d, reason: collision with root package name */
    private final List<ShoppingListTypeAheadResultItem> f10781d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final a f10782e;

    public interface a {
        void a(ShoppingListItem shoppingListItem);

        void b(String str);
    }

    @Override // hs.AbstractC14573a
    protected void g(C14574b<D2> c14574b, int i10, List<Object> list) {
        ((D2) c14574b.f136154a).M0(this.f10781d.get(i10));
        ((D2) c14574b.f136154a).N0(this.f10782e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f10781d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return V.f100206T0;
    }

    public void l(List<ShoppingListTypeAheadResultItem> list) {
        this.f10781d.clear();
        this.f10781d.addAll(list);
        notifyDataSetChanged();
    }

    public l(a aVar) {
        this.f10782e = aVar;
    }
}
