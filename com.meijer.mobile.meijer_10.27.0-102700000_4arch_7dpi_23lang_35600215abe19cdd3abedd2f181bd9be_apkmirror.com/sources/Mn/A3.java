package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.AddFromFavoritesView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes9.dex */
public class A3 extends z3 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f19890H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f19891I;

    /* renamed from: F, reason: collision with root package name */
    private final AddFromFavoritesView f19892F;

    /* renamed from: G, reason: collision with root package name */
    private long f19893G;

    public A3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 7, f19890H, f19891I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19893G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19893G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19893G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19891I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98979V4, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99189p, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98773B2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99045b9, 6);
    }

    private A3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (LinearLayout) objArr[4], (ShoppingListAddItemView) objArr[1], (ImageButton) objArr[5], (RelativeLayout) objArr[3], (RecyclerView) objArr[0], (RecyclerView) objArr[6]);
        this.f19893G = -1L;
        this.f21172A.setTag(null);
        AddFromFavoritesView addFromFavoritesView = (AddFromFavoritesView) objArr[2];
        this.f19892F = addFromFavoritesView;
        addFromFavoritesView.setTag(null);
        this.f21175D.setTag(null);
        E0(viewArr);
        o0();
    }
}
