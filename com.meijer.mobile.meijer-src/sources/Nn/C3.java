package Nn;

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

/* loaded from: classes10.dex */
public class C3 extends B3 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f21278K;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f21279L;

    /* renamed from: I, reason: collision with root package name */
    private final RelativeLayout f21280I;

    /* renamed from: J, reason: collision with root package name */
    private long f21281J;

    public C3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 10, f21278K, f21279L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21281J = 0L;
        }
        androidx.databinding.p.Z(this.f21251D);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21281J != 0) {
                    return true;
                }
                return this.f21251D.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21281J = 2L;
        }
        this.f21251D.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(10);
        f21278K = iVar;
        iVar.a(0, new String[]{"view_include_footer_button"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f100245i1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21279L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100118v6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100067r, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100078s, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100056q, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99817T6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99835V4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99890a9, 9);
    }

    private C3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 1, (EditText) objArr[6], (ConstraintLayout) objArr[4], (TextView) objArr[5], (ShoppingListAddItemView) objArr[1], (AbstractC4225d3) objArr[2], (View) objArr[8], (RecyclerView) objArr[3], (ImageView) objArr[7], (RecyclerView) objArr[9]);
        this.f21281J = -1L;
        this.f21250C.setTag(null);
        A0(this.f21251D);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f21280I = relativeLayout;
        relativeLayout.setTag(null);
        D0(viewArr);
        l0();
    }

    private boolean O0(AbstractC4225d3 abstractC4225d3, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21281J |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4225d3) obj, i11);
    }
}
