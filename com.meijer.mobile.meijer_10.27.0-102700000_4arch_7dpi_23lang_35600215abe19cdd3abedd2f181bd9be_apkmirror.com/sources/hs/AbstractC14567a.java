package hs;

import android.view.ViewGroup;
import androidx.databinding.n;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* renamed from: hs.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC14567a<T extends p> extends RecyclerView.h<C14568b<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f136241c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f136242a;

    /* renamed from: b, reason: collision with root package name */
    private final n f136243b = new C2162a();

    /* renamed from: hs.a$a, reason: collision with other inner class name */
    class C2162a extends n {
        C2162a() {
        }

        @Override // androidx.databinding.n
        public boolean c(p pVar) {
            int childAdapterPosition;
            if (AbstractC14567a.this.f136242a == null || AbstractC14567a.this.f136242a.isComputingLayout() || (childAdapterPosition = AbstractC14567a.this.f136242a.getChildAdapterPosition(pVar.getRoot())) == -1) {
                return true;
            }
            AbstractC14567a.this.notifyItemChanged(childAdapterPosition, AbstractC14567a.f136241c);
            return false;
        }
    }

    protected abstract void f(C14568b<T> c14568b, int i10, List<Object> list);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f136242a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C14568b<T> c14568b, int i10) {
        throw new IllegalArgumentException("just overridden to make final.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f136242a = recyclerView;
    }

    private boolean h(List<Object> list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != f136241c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C14568b<T> c14568b, int i10, List<Object> list) {
        if (list.isEmpty() || h(list)) {
            f(c14568b, i10, list);
        }
        c14568b.f136245a.a0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C14568b<T> onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C14568b<T> c14568bB = C14568b.b(viewGroup, i10);
        c14568bB.f136245a.T(this.f136243b);
        return c14568bB;
    }
}
