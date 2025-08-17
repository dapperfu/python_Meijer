package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListItemCheckBox;

/* loaded from: classes9.dex */
public class E3 extends D3 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f19993F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f19994G;

    /* renamed from: D, reason: collision with root package name */
    private final MaterialCardView f19995D;

    /* renamed from: E, reason: collision with root package name */
    private long f19996E;

    public E3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f19993F, f19994G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19996E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19996E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19996E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19994G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98848I3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98868K3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98888M3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98898N3, 4);
    }

    private E3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ShoppingListItemCheckBox) objArr[1], (TextView) objArr[2], (ImageButton) objArr[3], (TextView) objArr[4]);
        this.f19996E = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f19995D = materialCardView;
        materialCardView.setTag(null);
        D0(view);
        o0();
    }
}
