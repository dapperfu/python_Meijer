package En;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import cn.AbstractC6416a;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.T;

/* loaded from: classes9.dex */
public class h extends AbstractC6416a {

    /* renamed from: i, reason: collision with root package name */
    private final a f9343i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9344j;

    /* renamed from: k, reason: collision with root package name */
    private int f9345k;

    /* renamed from: l, reason: collision with root package name */
    private int f9346l;

    public interface a {
        void h0(int i10);

        void u(int i10);

        void v(int i10, int i11);
    }

    public h(Context context, a aVar) {
        super(context, Bj.i.f2722b2, P.f98653f);
        this.f9345k = -1;
        this.f9346l = -1;
        this.f9343i = aVar;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void B(RecyclerView.F f10, int i10) {
        this.f9343i.u(f10.getAdapterPosition());
    }

    @Override // cn.AbstractC6416a
    protected void C(View view, boolean z10) {
        view.setElevation(z10 ? 15.0f : 0.0f);
    }

    public boolean D() {
        return this.f9344j;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void A(RecyclerView.F f10, int i10) {
        super.A(f10, i10);
        if (this.f9344j && i10 == 0) {
            uw.a.d("item moved from %d to %d", Integer.valueOf(this.f9345k), Integer.valueOf(this.f9346l));
            int i11 = this.f9346l;
            if (i11 != this.f9345k) {
                this.f9343i.h0(i11);
            }
            this.f9346l = -1;
            this.f9345k = -1;
        }
        boolean z10 = false;
        if (i10 == 2) {
            int adapterPosition = f10.getAdapterPosition();
            this.f9346l = adapterPosition;
            this.f9345k = adapterPosition;
            f10.itemView.performHapticFeedback(0);
        }
        if (i10 == 2) {
            z10 = true;
        }
        this.f9344j = z10;
    }

    @Override // cn.AbstractC6416a, androidx.recyclerview.widget.l.e
    public void c(RecyclerView recyclerView, RecyclerView.F f10) {
        super.c(recyclerView, f10);
    }

    @Override // androidx.recyclerview.widget.l.e
    public int k(RecyclerView recyclerView, RecyclerView.F f10) {
        boolean z10;
        int i10;
        int itemViewType = f10.getItemViewType();
        int i11 = T.f99298y9;
        boolean z11 = true;
        int i12 = 0;
        if (itemViewType == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (itemViewType != T.f99287x9 && itemViewType != i11) {
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
        this.f9346l = adapterPosition2;
        this.f9343i.v(adapterPosition, adapterPosition2);
        return true;
    }
}
