package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListItemCheckBox;

/* loaded from: classes10.dex */
public class E3 extends D3 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21325F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21326G;

    /* renamed from: D, reason: collision with root package name */
    private final MaterialCardView f21327D;

    /* renamed from: E, reason: collision with root package name */
    private long f21328E;

    public E3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f21325F, f21326G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21328E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21328E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21328E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21326G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99704I3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99724K3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99744M3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99754N3, 4);
    }

    private E3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ShoppingListItemCheckBox) objArr[1], (TextView) objArr[2], (ImageButton) objArr[3], (TextView) objArr[4]);
        this.f21328E = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f21327D = materialCardView;
        materialCardView.setTag(null);
        B0(view);
        l0();
    }
}
