package Nn;

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

/* loaded from: classes10.dex */
public class C1 extends B1 {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f21271I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f21272J;

    /* renamed from: H, reason: collision with root package name */
    private long f21273H;

    public C1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 8, f21271I, f21272J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21273H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21273H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21273H = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21272J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99708I7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100089t, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99835V4, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100045p, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99630B2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99890a9, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 7);
    }

    private C1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[4], (ShoppingListAddItemView) objArr[2], (ImageButton) objArr[5], (RelativeLayout) objArr[3], (ProgressView) objArr[7], (ConstraintLayout) objArr[0], (RecyclerView) objArr[1], (RecyclerView) objArr[6]);
        this.f21273H = -1L;
        this.f21240E.setTag(null);
        B0(view);
        l0();
    }
}
