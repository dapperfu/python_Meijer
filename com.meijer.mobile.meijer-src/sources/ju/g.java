package ju;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public class g extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    private h f141274a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnClickListener f141275b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnLongClickListener f141276c;

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
        this.f141274a = null;
    }

    public void d(h hVar, j jVar, k kVar) {
        this.f141274a = hVar;
        if (jVar != null && hVar.n()) {
            this.itemView.setOnClickListener(this.f141275b);
        }
        if (kVar == null || !hVar.o()) {
            return;
        }
        this.itemView.setOnLongClickListener(this.f141276c);
    }

    public h e() {
        return this.f141274a;
    }

    public g(View view) {
        super(view);
        this.f141275b = new a();
        this.f141276c = new b();
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
