package hs;

import android.view.ViewGroup;
import androidx.databinding.n;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* renamed from: hs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC14573a<T extends p> extends RecyclerView.h<C14574b<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f136150c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f136151a;

    /* renamed from: b, reason: collision with root package name */
    private final n f136152b = new C2157a();

    /* renamed from: hs.a$a, reason: collision with other inner class name */
    class C2157a extends n {
        C2157a() {
        }

        @Override // androidx.databinding.n
        public boolean c(p pVar) {
            int childAdapterPosition;
            if (AbstractC14573a.this.f136151a == null || AbstractC14573a.this.f136151a.isComputingLayout() || (childAdapterPosition = AbstractC14573a.this.f136151a.getChildAdapterPosition(pVar.getRoot())) == -1) {
                return true;
            }
            AbstractC14573a.this.notifyItemChanged(childAdapterPosition, AbstractC14573a.f136150c);
            return false;
        }
    }

    protected abstract void g(C14574b<T> c14574b, int i10, List<Object> list);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f136151a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C14574b<T> c14574b, int i10) {
        throw new IllegalArgumentException("just overridden to make final.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f136151a = recyclerView;
    }

    private boolean h(List<Object> list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != f136150c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C14574b<T> c14574b, int i10, List<Object> list) {
        if (list.isEmpty() || h(list)) {
            g(c14574b, i10, list);
        }
        c14574b.f136154a.a0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C14574b<T> onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C14574b<T> c14574bB = C14574b.b(viewGroup, i10);
        c14574bB.f136154a.T(this.f136152b);
        return c14574bB;
    }
}
