package Fn;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.T;
import dn.AbstractC13706a;

/* loaded from: classes10.dex */
public class h extends AbstractC13706a {

    /* renamed from: i, reason: collision with root package name */
    private final a f10772i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10773j;

    /* renamed from: k, reason: collision with root package name */
    private int f10774k;

    /* renamed from: l, reason: collision with root package name */
    private int f10775l;

    public interface a {
        void j0(int i10);

        void o(int i10);

        void w(int i10, int i11);
    }

    public h(Context context, a aVar) {
        super(context, Cj.i.f4767b2, P.f99510f);
        this.f10774k = -1;
        this.f10775l = -1;
        this.f10772i = aVar;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void B(RecyclerView.F f10, int i10) {
        this.f10772i.o(f10.getAdapterPosition());
    }

    @Override // dn.AbstractC13706a
    protected void C(View view, boolean z10) {
        view.setElevation(z10 ? 15.0f : 0.0f);
    }

    public boolean D() {
        return this.f10773j;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void A(RecyclerView.F f10, int i10) {
        super.A(f10, i10);
        if (this.f10773j && i10 == 0) {
            qw.a.d("item moved from %d to %d", Integer.valueOf(this.f10774k), Integer.valueOf(this.f10775l));
            int i11 = this.f10775l;
            if (i11 != this.f10774k) {
                this.f10772i.j0(i11);
            }
            this.f10775l = -1;
            this.f10774k = -1;
        }
        boolean z10 = false;
        if (i10 == 2) {
            int adapterPosition = f10.getAdapterPosition();
            this.f10775l = adapterPosition;
            this.f10774k = adapterPosition;
            f10.itemView.performHapticFeedback(0);
        }
        if (i10 == 2) {
            z10 = true;
        }
        this.f10773j = z10;
    }

    @Override // dn.AbstractC13706a, androidx.recyclerview.widget.l.e
    public void c(RecyclerView recyclerView, RecyclerView.F f10) {
        super.c(recyclerView, f10);
    }

    @Override // androidx.recyclerview.widget.l.e
    public int k(RecyclerView recyclerView, RecyclerView.F f10) {
        boolean z10;
        int i10;
        int itemViewType = f10.getItemViewType();
        int i11 = T.f100143x9;
        boolean z11 = true;
        int i12 = 0;
        if (itemViewType == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (itemViewType != T.f100132w9 && itemViewType != i11) {
            z11 = false;
        }
        if (z10) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        if (z11) {
            i12 = 48;
        }
        return l.e.t(i10, i12);
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean y(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11) {
        if (f10.getItemViewType() != f11.getItemViewType()) {
            return false;
        }
        int adapterPosition = f10.getAdapterPosition();
        int adapterPosition2 = f11.getAdapterPosition();
        this.f10775l = adapterPosition2;
        this.f10772i.w(adapterPosition, adapterPosition2);
        return true;
    }
}
