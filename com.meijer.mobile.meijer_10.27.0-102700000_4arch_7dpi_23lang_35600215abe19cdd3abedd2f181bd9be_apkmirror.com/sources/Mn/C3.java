package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes9.dex */
public class C3 extends B3 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f19946K;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f19947L;

    /* renamed from: I, reason: collision with root package name */
    private final RelativeLayout f19948I;

    /* renamed from: J, reason: collision with root package name */
    private long f19949J;

    public C3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 10, f19946K, f19947L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19949J = 0L;
        }
        androidx.databinding.p.Y(this.f19919D);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f19949J != 0) {
                    return true;
                }
                return this.f19919D.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19949J = 2L;
        }
        this.f19919D.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(10);
        f19946K = iVar;
        iVar.a(0, new String[]{"view_include_footer_button"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f99389i1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19947L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99273w6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99211r, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99222s, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99200q, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98971U6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98979V4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99045b9, 9);
    }

    private C3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 1, (EditText) objArr[6], (ConstraintLayout) objArr[4], (TextView) objArr[5], (ShoppingListAddItemView) objArr[1], (AbstractC4220d3) objArr[2], (View) objArr[8], (RecyclerView) objArr[3], (ImageView) objArr[7], (RecyclerView) objArr[9]);
        this.f19949J = -1L;
        this.f19918C.setTag(null);
        C0(this.f19919D);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f19948I = relativeLayout;
        relativeLayout.setTag(null);
        E0(viewArr);
        o0();
    }

    private boolean O0(AbstractC4220d3 abstractC4220d3, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f19949J |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4220d3) obj, i11);
    }
}
