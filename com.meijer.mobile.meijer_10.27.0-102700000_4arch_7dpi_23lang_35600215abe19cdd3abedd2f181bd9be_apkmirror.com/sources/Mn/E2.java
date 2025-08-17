package Mn;

import En.l;
import Gn.ShoppingListTypeAheadResultItem;
import Nn.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import y2.C18157a;

/* loaded from: classes9.dex */
public class E2 extends D2 implements a.InterfaceC0367a {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f19987I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f19988J = null;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f19989E;

    /* renamed from: F, reason: collision with root package name */
    private final View.OnClickListener f19990F;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f19991G;

    /* renamed from: H, reason: collision with root package name */
    private long f19992H;

    public E2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f19987I, f19988J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f19992H;
            this.f19992H = 0L;
        }
        ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem = this.f19968C;
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
            zj.f.a(this.f19970z, isFavorite);
            C18157a.b(this.f19967B, title);
        }
        if ((j10 & 4) != 0) {
            this.f19989E.setOnClickListener(this.f19990F);
            this.f19966A.setOnClickListener(this.f19991G);
        }
    }

    @Override // Nn.a.InterfaceC0367a
    public final void b(int i10, View view) {
        if (i10 == 1) {
            ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem = this.f19968C;
            l.a aVar = this.f19969D;
            if (aVar == null || shoppingListTypeAheadResultItem == null) {
                return;
            }
            aVar.a(shoppingListTypeAheadResultItem.a());
            return;
        }
        if (i10 != 2) {
            return;
        }
        ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem2 = this.f19968C;
        l.a aVar2 = this.f19969D;
        if (aVar2 == null || shoppingListTypeAheadResultItem2 == null) {
            return;
        }
        aVar2.b(shoppingListTypeAheadResultItem2.getTitle());
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19992H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19992H = 4L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private E2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (ImageButton) objArr[3], (FullWordEllipsisTextView) objArr[2]);
        this.f19992H = -1L;
        this.f19970z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19989E = constraintLayout;
        constraintLayout.setTag(null);
        this.f19966A.setTag(null);
        this.f19967B.setTag(null);
        D0(view);
        this.f19990F = new Nn.a(this, 1);
        this.f19991G = new Nn.a(this, 2);
        o0();
    }

    @Override // Mn.D2
    public void K0(ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem) {
        this.f19968C = shoppingListTypeAheadResultItem;
        synchronized (this) {
            this.f19992H |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }

    @Override // Mn.D2
    public void M0(l.a aVar) {
        this.f19969D = aVar;
        synchronized (this) {
            this.f19992H |= 2;
        }
        notifyPropertyChanged(11);
        super.A0();
    }
}
