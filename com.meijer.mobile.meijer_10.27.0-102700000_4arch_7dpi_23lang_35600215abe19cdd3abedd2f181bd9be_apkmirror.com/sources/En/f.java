package En;

import Fq.FavoriteListItem;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.Y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ks.AbstractC15310a;

/* loaded from: classes9.dex */
public class f extends AbstractC15310a<FavoriteListItem> {

    /* renamed from: v, reason: collision with root package name */
    private List<FavoriteListItem> f9335v;

    /* renamed from: w, reason: collision with root package name */
    private HashMap<String, Boolean> f9336w;

    /* renamed from: x, reason: collision with root package name */
    private d f9337x;

    class a extends AbstractC15310a.b<FavoriteListItem> {
        a(int i10, CharSequence charSequence, List list, int i11, int i12, int i13, int i14) {
            super(i10, charSequence, list, i11, i12, i13, i14);
        }

        @Override // ks.AbstractC15310a.b
        public String toString() {
            return this.f147935b.toString();
        }
    }

    public class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        TextView f9339a;

        public b(View view) {
            super(view);
            this.f9339a = (TextView) view.findViewById(T.f98868K3);
        }

        public void b(FavoriteListItem favoriteListItem) {
            this.f9339a.setText(favoriteListItem.b());
        }
    }

    public class c extends b implements MaterialCardView.a {

        /* renamed from: c, reason: collision with root package name */
        private FavoriteListItem f9341c;

        public c(MaterialCardView materialCardView) {
            super(materialCardView);
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: En.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((MaterialCardView) view).toggle();
                }
            });
            materialCardView.setOnCheckedChangeListener(this);
        }

        @Override // com.google.android.material.card.MaterialCardView.a
        public void a(MaterialCardView materialCardView, boolean z10) {
            if (z10) {
                f.this.f9336w.put(this.f9341c.b(), Boolean.TRUE);
            } else {
                f.this.f9336w.remove(this.f9341c.b());
            }
            List<FavoriteListItem> listF = f.this.F();
            if (f.this.f9337x != null) {
                f.this.f9337x.e(listF);
            }
        }

        @Override // En.f.b
        public void b(FavoriteListItem favoriteListItem) {
            super.b(favoriteListItem);
            this.f9341c = favoriteListItem;
        }
    }

    public interface d {
        void e(List<FavoriteListItem> list);
    }

    public f(Context context, List<FavoriteListItem> list) {
        super(context, null);
        G(list);
        this.f9336w = new HashMap<>();
    }

    public List<FavoriteListItem> F() {
        LinkedList linkedList = new LinkedList();
        for (FavoriteListItem favoriteListItem : this.f9335v) {
            if (this.f9336w.containsKey(favoriteListItem.b())) {
                linkedList.add(favoriteListItem);
            }
        }
        return linkedList;
    }

    public void G(List<FavoriteListItem> list) {
        if (list != null) {
            this.f9335v = list;
        } else {
            this.f9335v = Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (FavoriteListItem favoriteListItem : this.f9335v) {
            if (favoriteListItem.getIsItemInActiveList()) {
                linkedList2.add(favoriteListItem);
            } else {
                linkedList.add(favoriteListItem);
            }
        }
        LinkedList linkedList3 = new LinkedList();
        int i10 = T.f99265v9;
        linkedList3.add(new AbstractC15310a.b(i10, null, linkedList, i10, V.f99320E0));
        linkedList3.add(new a(T.f99243t9, h().getText(Y.f99488Be), linkedList2, T.f99243t9, V.f99322F0, T.f99254u9, V.f99328I0));
        y(linkedList3);
    }

    public void H(d dVar) {
        this.f9337x = dVar;
    }

    public void I(List<FavoriteListItem> list) {
        this.f9336w = new HashMap<>();
        for (FavoriteListItem favoriteListItem : list) {
            if (this.f9335v.contains(favoriteListItem)) {
                this.f9336w.put(favoriteListItem.b(), Boolean.TRUE);
            }
        }
        notifyDataSetChanged();
    }

    public void J(boolean z10) {
        if (z10) {
            Iterator<FavoriteListItem> it = this.f9335v.iterator();
            while (it.hasNext()) {
                this.f9336w.put(it.next().b(), Boolean.TRUE);
            }
            return;
        }
        Iterator<FavoriteListItem> it2 = this.f9335v.iterator();
        while (it2.hasNext()) {
            this.f9336w.remove(it2.next().b());
        }
    }

    @Override // ks.AbstractC15310a, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return i10 == T.f99265v9 ? new c((MaterialCardView) f(viewGroup, i10)) : i10 == T.f99243t9 ? new b(f(viewGroup, i10)) : i10 == T.f99254u9 ? new AbstractC15310a.d(f(viewGroup, i10)) : super.onCreateViewHolder(viewGroup, i10);
    }

    @Override // ks.AbstractC15310a, androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        int itemViewType = getItemViewType(i10);
        if (itemViewType != T.f99265v9 && itemViewType != T.f99243t9) {
            super.onBindViewHolder(f10, i10);
            return;
        }
        FavoriteListItem item = getItem(i10);
        b bVar = (b) f10;
        bVar.b(item);
        if (itemViewType == T.f99265v9) {
            ((Checkable) bVar.itemView).setChecked(this.f9336w.containsKey(item.b()));
        }
    }
}
