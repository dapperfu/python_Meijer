package nu;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public class g extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    private h f152824a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnClickListener f152825b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnLongClickListener f152826c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.b(g.this);
        }
    }

    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            g.c(g.this);
            return false;
        }
    }

    public void f() {
        this.f152824a = null;
    }

    public void d(h hVar, j jVar, k kVar) {
        this.f152824a = hVar;
        if (jVar != null && hVar.n()) {
            this.itemView.setOnClickListener(this.f152825b);
        }
        if (kVar == null || !hVar.o()) {
            return;
        }
        this.itemView.setOnLongClickListener(this.f152826c);
    }

    public h e() {
        return this.f152824a;
    }

    public g(View view) {
        super(view);
        this.f152825b = new a();
        this.f152826c = new b();
    }

    static /* synthetic */ j b(g gVar) {
        gVar.getClass();
        return null;
    }

    static /* synthetic */ k c(g gVar) {
        gVar.getClass();
        return null;
    }
}
