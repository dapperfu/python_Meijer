package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import i.C14578d;
import p2.r;

/* loaded from: classes.dex */
public class MenuPopupHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46177a;

    /* renamed from: b, reason: collision with root package name */
    private final f f46178b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46179c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46180d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46181e;

    /* renamed from: f, reason: collision with root package name */
    private View f46182f;

    /* renamed from: g, reason: collision with root package name */
    private int f46183g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46184h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f46185i;

    /* renamed from: j, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46186j;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f46187k;
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
        PopupWindow.OnDismissListener onDismissListener = this.f46186j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public MenuPopupHelper(Context context, f fVar, View view, boolean z10, int i10, int i11) {
        this.f46183g = 8388611;
        this.f46187k = new a();
        this.f46177a = context;
        this.f46178b = fVar;
        this.f46182f = view;
        this.f46179c = z10;
        this.f46180d = i10;
        this.f46181e = i11;
    }

    private i a() {
        Display defaultDisplay = ((WindowManager) this.f46177a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        i cVar = Math.min(point.x, point.y) >= this.f46177a.getResources().getDimensionPixelSize(C14578d.f136559c) ? new c(this.f46177a, this.f46182f, this.f46180d, this.f46181e, this.f46179c) : new m(this.f46177a, this.f46178b, this.f46182f, this.f46180d, this.f46181e, this.f46179c);
        cVar.m(this.f46178b);
        cVar.v(this.f46187k);
        cVar.q(this.f46182f);
        cVar.e(this.f46185i);
        cVar.s(this.f46184h);
        cVar.t(this.f46183g);
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
        this.f46182f = view;
    }

    public void g(boolean z10) {
        this.f46184h = z10;
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.s(z10);
        }
    }

    public void h(int i10) {
        this.f46183g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f46186j = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f46185i = aVar;
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.e(aVar);
        }
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        i iVarC = c();
        iVarC.w(z11);
        if (z10) {
            if ((r.b(this.f46183g, this.f46182f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f46182f.getWidth();
            }
            iVarC.u(i10);
            iVarC.x(i11);
            int i12 = (int) ((this.f46177a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
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
        if (this.f46182f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f46182f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
