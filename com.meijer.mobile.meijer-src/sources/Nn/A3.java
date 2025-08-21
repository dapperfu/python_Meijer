package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.AddFromFavoritesView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes10.dex */
public class A3 extends z3 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21222H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21223I;

    /* renamed from: F, reason: collision with root package name */
    private final AddFromFavoritesView f21224F;

    /* renamed from: G, reason: collision with root package name */
    private long f21225G;

    public A3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 7, f21222H, f21223I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21225G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21225G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21225G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21223I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99835V4, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100045p, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99630B2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99890a9, 6);
    }

    private A3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (LinearLayout) objArr[4], (ShoppingListAddItemView) objArr[1], (ImageButton) objArr[5], (RelativeLayout) objArr[3], (RecyclerView) objArr[0], (RecyclerView) objArr[6]);
        this.f21225G = -1L;
        this.f22504A.setTag(null);
        AddFromFavoritesView addFromFavoritesView = (AddFromFavoritesView) objArr[2];
        this.f21224F = addFromFavoritesView;
        addFromFavoritesView.setTag(null);
        this.f22507D.setTag(null);
        D0(viewArr);
        l0();
    }
}
