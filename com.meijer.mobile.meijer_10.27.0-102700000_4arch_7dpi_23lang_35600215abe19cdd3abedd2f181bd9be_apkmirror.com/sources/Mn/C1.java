package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public class C1 extends B1 {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f19939I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f19940J;

    /* renamed from: H, reason: collision with root package name */
    private long f19941H;

    public C1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 8, f19939I, f19940J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19941H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19941H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19941H = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19940J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98862J7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99233t, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98979V4, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99189p, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98773B2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99045b9, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 7);
    }

    private C1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[4], (ShoppingListAddItemView) objArr[2], (ImageButton) objArr[5], (RelativeLayout) objArr[3], (ProgressView) objArr[7], (ConstraintLayout) objArr[0], (RecyclerView) objArr[1], (RecyclerView) objArr[6]);
        this.f19941H = -1L;
        this.f19908E.setTag(null);
        D0(view);
        o0();
    }
}
