package Fn;

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
import ks.AbstractC15413a;

/* loaded from: classes10.dex */
public class f extends AbstractC15413a<FavoriteListItem> {

    /* renamed from: v, reason: collision with root package name */
    private List<FavoriteListItem> f10764v;

    /* renamed from: w, reason: collision with root package name */
    private HashMap<String, Boolean> f10765w;

    /* renamed from: x, reason: collision with root package name */
    private d f10766x;

    class a extends AbstractC15413a.b<FavoriteListItem> {
        a(int i10, CharSequence charSequence, List list, int i11, int i12, int i13, int i14) {
            super(i10, charSequence, list, i11, i12, i13, i14);
        }

        @Override // ks.AbstractC15413a.b
        public String toString() {
            return this.f148845b.toString();
        }
    }

    public class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        TextView f10768a;

        public b(View view) {
            super(view);
            this.f10768a = (TextView) view.findViewById(T.f99724K3);
        }

        public void b(FavoriteListItem favoriteListItem) {
            this.f10768a.setText(favoriteListItem.b());
        }
    }

    public class c extends b implements MaterialCardView.a {

        /* renamed from: c, reason: collision with root package name */
        private FavoriteListItem f10770c;

        public c(MaterialCardView materialCardView) {
            super(materialCardView);
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: Fn.g
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
                f.this.f10765w.put(this.f10770c.b(), Boolean.TRUE);
            } else {
                f.this.f10765w.remove(this.f10770c.b());
            }
            List<FavoriteListItem> listF = f.this.F();
            if (f.this.f10766x != null) {
                f.this.f10766x.e(listF);
            }
        }

        @Override // Fn.f.b
        public void b(FavoriteListItem favoriteListItem) {
            super.b(favoriteListItem);
            this.f10770c = favoriteListItem;
        }
    }

    public interface d {
        void e(List<FavoriteListItem> list);
    }

    public f(Context context, List<FavoriteListItem> list) {
        super(context, null);
        G(list);
        this.f10765w = new HashMap<>();
    }

    public List<FavoriteListItem> F() {
        LinkedList linkedList = new LinkedList();
        for (FavoriteListItem favoriteListItem : this.f10764v) {
            if (this.f10765w.containsKey(favoriteListItem.b())) {
                linkedList.add(favoriteListItem);
            }
        }
        return linkedList;
    }

    public void G(List<FavoriteListItem> list) {
        if (list != null) {
            this.f10764v = list;
        } else {
            this.f10764v = Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (FavoriteListItem favoriteListItem : this.f10764v) {
            if (favoriteListItem.getIsItemInActiveList()) {
                linkedList2.add(favoriteListItem);
            } else {
                linkedList.add(favoriteListItem);
            }
        }
        LinkedList linkedList3 = new LinkedList();
        int i10 = T.f100110u9;
        linkedList3.add(new AbstractC15413a.b(i10, null, linkedList, i10, V.f100176E0));
        linkedList3.add(new a(T.f100088s9, h().getText(Y.f100406Ee), linkedList2, T.f100088s9, V.f100178F0, T.f100099t9, V.f100184I0));
        y(linkedList3);
    }

    public void H(d dVar) {
        this.f10766x = dVar;
    }

    public void I(List<FavoriteListItem> list) {
        this.f10765w = new HashMap<>();
        for (FavoriteListItem favoriteListItem : list) {
            if (this.f10764v.contains(favoriteListItem)) {
                this.f10765w.put(favoriteListItem.b(), Boolean.TRUE);
            }
        }
        notifyDataSetChanged();
    }

    public void J(boolean z10) {
        if (z10) {
            Iterator<FavoriteListItem> it = this.f10764v.iterator();
            while (it.hasNext()) {
                this.f10765w.put(it.next().b(), Boolean.TRUE);
            }
            return;
        }
        Iterator<FavoriteListItem> it2 = this.f10764v.iterator();
        while (it2.hasNext()) {
            this.f10765w.remove(it2.next().b());
        }
    }

    @Override // ks.AbstractC15413a, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return i10 == T.f100110u9 ? new c((MaterialCardView) g(viewGroup, i10)) : i10 == T.f100088s9 ? new b(g(viewGroup, i10)) : i10 == T.f100099t9 ? new AbstractC15413a.d(g(viewGroup, i10)) : super.onCreateViewHolder(viewGroup, i10);
    }

    @Override // ks.AbstractC15413a, androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        int itemViewType = getItemViewType(i10);
        if (itemViewType != T.f100110u9 && itemViewType != T.f100088s9) {
            super.onBindViewHolder(f10, i10);
            return;
        }
        FavoriteListItem item = getItem(i10);
        b bVar = (b) f10;
        bVar.b(item);
        if (itemViewType == T.f100110u9) {
            ((Checkable) bVar.itemView).setChecked(this.f10765w.containsKey(item.b()));
        }
    }
}
