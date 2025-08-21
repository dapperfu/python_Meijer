package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.fullstory.FS;
import i.C14581d;
import i.C14583f;
import i.C14584g;
import i.C14586i;

/* loaded from: classes.dex */
class W {

    /* renamed from: a, reason: collision with root package name */
    private final Context f47161a;

    /* renamed from: b, reason: collision with root package name */
    private final View f47162b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f47163c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f47164d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f47165e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f47166f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f47167g;

    boolean d() {
        return this.f47162b.getParent() != null;
    }

    W(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f47164d = layoutParams;
        this.f47165e = new Rect();
        this.f47166f = new int[2];
        this.f47167g = new int[2];
        this.f47161a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C14584g.f136421q, (ViewGroup) null);
        this.f47162b = viewInflate;
        this.f47163c = (TextView) viewInflate.findViewById(C14583f.f136397s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C14586i.f136436a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i12;
        int i13;
        int dimensionPixelSize;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f47161a.getResources().getDimensionPixelOffset(C14581d.f136324k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f47161a.getResources().getDimensionPixelOffset(C14581d.f136323j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f47161a.getResources();
        if (z10) {
            i13 = C14581d.f136326m;
        } else {
            i13 = C14581d.f136325l;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i13);
        View viewB = b(view);
        if (viewB == null) {
            FS.log_e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f47165e);
        Rect rect = this.f47165e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f47161a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            } else {
                dimensionPixelSize = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f47165e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f47167g);
        view.getLocationOnScreen(this.f47166f);
        int[] iArr = this.f47166f;
        int i14 = iArr[0];
        int[] iArr2 = this.f47167g;
        int i15 = i14 - iArr2[0];
        iArr[0] = i15;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i15 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f47162b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f47162b.getMeasuredHeight();
        int i16 = this.f47166f[1];
        int i17 = ((i12 + i16) - dimensionPixelOffset3) - measuredHeight;
        int i18 = i16 + height + dimensionPixelOffset3;
        if (z10) {
            if (i17 >= 0) {
                layoutParams.y = i17;
                return;
            } else {
                layoutParams.y = i18;
                return;
            }
        }
        if (measuredHeight + i18 <= this.f47165e.height()) {
            layoutParams.y = i18;
        } else {
            layoutParams.y = i17;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (!d()) {
            return;
        }
        ((WindowManager) this.f47161a.getSystemService("window")).removeView(this.f47162b);
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f47163c.setText(charSequence);
        a(view, i10, i11, z10, this.f47164d);
        ((WindowManager) this.f47161a.getSystemService("window")).addView(this.f47162b, this.f47164d);
    }
}
