package Nn;

import Fn.l;
import Hn.ShoppingListTypeAheadResultItem;
import On.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import y2.C18284a;

/* loaded from: classes10.dex */
public class E2 extends D2 implements a.InterfaceC0406a {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f21319I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f21320J = null;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f21321E;

    /* renamed from: F, reason: collision with root package name */
    private final View.OnClickListener f21322F;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f21323G;

    /* renamed from: H, reason: collision with root package name */
    private long f21324H;

    public E2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21319I, f21320J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21324H;
            this.f21324H = 0L;
        }
        ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem = this.f21300C;
        long j11 = 5 & j10;
        boolean isFavorite = false;
        String title = null;
        if (j11 != 0) {
            if (shoppingListTypeAheadResultItem != null) {
                title = shoppingListTypeAheadResultItem.getTitle();
                isFavorite = shoppingListTypeAheadResultItem.getIsFavorite();
            }
            isFavorite = !isFavorite;
        }
        if (j11 != 0) {
            Aj.f.a(this.f21302z, isFavorite);
            C18284a.b(this.f21299B, title);
        }
        if ((j10 & 4) != 0) {
            this.f21321E.setOnClickListener(this.f21322F);
            this.f21298A.setOnClickListener(this.f21323G);
        }
    }

    @Override // On.a.InterfaceC0406a
    public final void b(int i10, View view) {
        if (i10 == 1) {
            ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem = this.f21300C;
            l.a aVar = this.f21301D;
            if (aVar == null || shoppingListTypeAheadResultItem == null) {
                return;
            }
            aVar.a(shoppingListTypeAheadResultItem.a());
            return;
        }
        if (i10 != 2) {
            return;
        }
        ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem2 = this.f21300C;
        l.a aVar2 = this.f21301D;
        if (aVar2 == null || shoppingListTypeAheadResultItem2 == null) {
            return;
        }
        aVar2.b(shoppingListTypeAheadResultItem2.getTitle());
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21324H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21324H = 4L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private E2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (ImageButton) objArr[3], (FullWordEllipsisTextView) objArr[2]);
        this.f21324H = -1L;
        this.f21302z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21321E = constraintLayout;
        constraintLayout.setTag(null);
        this.f21298A.setTag(null);
        this.f21299B.setTag(null);
        B0(view);
        this.f21322F = new On.a(this, 1);
        this.f21323G = new On.a(this, 2);
        l0();
    }

    @Override // Nn.D2
    public void M0(ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem) {
        this.f21300C = shoppingListTypeAheadResultItem;
        synchronized (this) {
            this.f21324H |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }

    @Override // Nn.D2
    public void N0(l.a aVar) {
        this.f21301D = aVar;
        synchronized (this) {
            this.f21324H |= 2;
        }
        notifyPropertyChanged(11);
        super.z0();
    }
}
