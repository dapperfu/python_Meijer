package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import i.C14581d;
import p2.r;

/* loaded from: classes.dex */
public class MenuPopupHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46401a;

    /* renamed from: b, reason: collision with root package name */
    private final f f46402b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46403c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46404d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46405e;

    /* renamed from: f, reason: collision with root package name */
    private View f46406f;

    /* renamed from: g, reason: collision with root package name */
    private int f46407g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46408h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f46409i;

    /* renamed from: j, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46410j;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f46411k;
    private i mPopup;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MenuPopupHelper.this.e();
        }
    }

    public MenuPopupHelper(Context context, f fVar, View view, boolean z10, int i10) {
        this(context, fVar, view, z10, i10, 0);
    }

    protected void e() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.f46410j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public MenuPopupHelper(Context context, f fVar, View view, boolean z10, int i10, int i11) {
        this.f46407g = 8388611;
        this.f46411k = new a();
        this.f46401a = context;
        this.f46402b = fVar;
        this.f46406f = view;
        this.f46403c = z10;
        this.f46404d = i10;
        this.f46405e = i11;
    }

    private i a() {
        Display defaultDisplay = ((WindowManager) this.f46401a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        i cVar = Math.min(point.x, point.y) >= this.f46401a.getResources().getDimensionPixelSize(C14581d.f136316c) ? new c(this.f46401a, this.f46406f, this.f46404d, this.f46405e, this.f46403c) : new m(this.f46401a, this.f46402b, this.f46406f, this.f46404d, this.f46405e, this.f46403c);
        cVar.m(this.f46402b);
        cVar.v(this.f46411k);
        cVar.q(this.f46406f);
        cVar.e(this.f46409i);
        cVar.s(this.f46408h);
        cVar.t(this.f46407g);
        return cVar;
    }

    public i c() {
        if (this.mPopup == null) {
            this.mPopup = a();
        }
        return this.mPopup;
    }

    public boolean d() {
        i iVar = this.mPopup;
        return iVar != null && iVar.b();
    }

    public void f(View view) {
        this.f46406f = view;
    }

    public void g(boolean z10) {
        this.f46408h = z10;
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.s(z10);
        }
    }

    public void h(int i10) {
        this.f46407g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f46410j = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f46409i = aVar;
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.e(aVar);
        }
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        i iVarC = c();
        iVarC.w(z11);
        if (z10) {
            if ((r.b(this.f46407g, this.f46406f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f46406f.getWidth();
            }
            iVarC.u(i10);
            iVarC.x(i11);
            int i12 = (int) ((this.f46401a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            iVarC.r(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        iVarC.a();
    }

    public void b() {
        if (d()) {
            this.mPopup.dismiss();
        }
    }

    public void k() {
        if (m()) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f46406f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f46406f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
