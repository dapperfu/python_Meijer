package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import p2.C16345a0;

/* loaded from: classes.dex */
class V implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static V f47145k;

    /* renamed from: l, reason: collision with root package name */
    private static V f47146l;

    /* renamed from: a, reason: collision with root package name */
    private final View f47147a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f47148b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47149c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f47150d = new Runnable() { // from class: androidx.appcompat.widget.T
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f47087a.h(false);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f47151e = new Runnable() { // from class: androidx.appcompat.widget.U
        @Override // java.lang.Runnable
        public final void run() {
            this.f47144a.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f47152f;

    /* renamed from: g, reason: collision with root package name */
    private int f47153g;

    /* renamed from: h, reason: collision with root package name */
    private W f47154h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f47155i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47156j;

    private void c() {
        this.f47156j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    private void b() {
        this.f47147a.removeCallbacks(this.f47150d);
    }

    private void e() {
        this.f47147a.postDelayed(this.f47150d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(V v10) {
        V v11 = f47145k;
        if (v11 != null) {
            v11.b();
        }
        f47145k = v10;
        if (v10 != null) {
            v10.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        V v10 = f47145k;
        if (v10 != null && v10.f47147a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new V(view, charSequence);
            return;
        }
        V v11 = f47146l;
        if (v11 != null && v11.f47147a == view) {
            v11.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    void d() {
        if (f47146l == this) {
            f47146l = null;
            W w10 = this.f47154h;
            if (w10 != null) {
                w10.c();
                this.f47154h = null;
                c();
                this.f47147a.removeOnAttachStateChangeListener(this);
            } else {
                FS.log_e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f47145k == this) {
            f(null);
        }
        this.f47147a.removeCallbacks(this.f47151e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) throws Resources.NotFoundException {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f47147a.isAttachedToWindow()) {
            f(null);
            V v10 = f47146l;
            if (v10 != null) {
                v10.d();
            }
            f47146l = this;
            this.f47155i = z10;
            W w10 = new W(this.f47147a.getContext());
            this.f47154h = w10;
            w10.e(this.f47147a, this.f47152f, this.f47153g, this.f47155i, this.f47148b);
            this.f47147a.addOnAttachStateChangeListener(this);
            if (this.f47155i) {
                j11 = AnimatedGradientTextView.ANIMATION_DURATION;
            } else {
                if ((ViewCompat.L(this.f47147a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f47147a.removeCallbacks(this.f47151e);
            this.f47147a.postDelayed(this.f47151e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f47154h != null && this.f47155i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f47147a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f47147a.isEnabled() && this.f47154h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    private V(View view, CharSequence charSequence) {
        this.f47147a = view;
        this.f47148b = charSequence;
        this.f47149c = C16345a0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f47156j && Math.abs(x10 - this.f47152f) <= this.f47149c && Math.abs(y10 - this.f47153g) <= this.f47149c) {
            return false;
        }
        this.f47152f = x10;
        this.f47153g = y10;
        this.f47156j = false;
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f47152f = view.getWidth() / 2;
        this.f47153g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
