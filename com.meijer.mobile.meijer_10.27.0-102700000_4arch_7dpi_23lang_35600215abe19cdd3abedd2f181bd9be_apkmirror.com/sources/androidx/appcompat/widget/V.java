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
import p2.C16200a0;

/* loaded from: classes.dex */
class V implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static V f46921k;

    /* renamed from: l, reason: collision with root package name */
    private static V f46922l;

    /* renamed from: a, reason: collision with root package name */
    private final View f46923a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f46924b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46925c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f46926d = new Runnable() { // from class: androidx.appcompat.widget.T
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f46863a.h(false);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f46927e = new Runnable() { // from class: androidx.appcompat.widget.U
        @Override // java.lang.Runnable
        public final void run() {
            this.f46920a.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f46928f;

    /* renamed from: g, reason: collision with root package name */
    private int f46929g;

    /* renamed from: h, reason: collision with root package name */
    private W f46930h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46931i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46932j;

    private void c() {
        this.f46932j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    private void b() {
        this.f46923a.removeCallbacks(this.f46926d);
    }

    private void e() {
        this.f46923a.postDelayed(this.f46926d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(V v10) {
        V v11 = f46921k;
        if (v11 != null) {
            v11.b();
        }
        f46921k = v10;
        if (v10 != null) {
            v10.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        V v10 = f46921k;
        if (v10 != null && v10.f46923a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new V(view, charSequence);
            return;
        }
        V v11 = f46922l;
        if (v11 != null && v11.f46923a == view) {
            v11.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    void d() {
        if (f46922l == this) {
            f46922l = null;
            W w10 = this.f46930h;
            if (w10 != null) {
                w10.c();
                this.f46930h = null;
                c();
                this.f46923a.removeOnAttachStateChangeListener(this);
            } else {
                FS.log_e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f46921k == this) {
            f(null);
        }
        this.f46923a.removeCallbacks(this.f46927e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) throws Resources.NotFoundException {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f46923a.isAttachedToWindow()) {
            f(null);
            V v10 = f46922l;
            if (v10 != null) {
                v10.d();
            }
            f46922l = this;
            this.f46931i = z10;
            W w10 = new W(this.f46923a.getContext());
            this.f46930h = w10;
            w10.e(this.f46923a, this.f46928f, this.f46929g, this.f46931i, this.f46924b);
            this.f46923a.addOnAttachStateChangeListener(this);
            if (this.f46931i) {
                j11 = AnimatedGradientTextView.ANIMATION_DURATION;
            } else {
                if ((ViewCompat.L(this.f46923a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f46923a.removeCallbacks(this.f46927e);
            this.f46923a.postDelayed(this.f46927e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f46930h != null && this.f46931i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f46923a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f46923a.isEnabled() && this.f46930h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    private V(View view, CharSequence charSequence) {
        this.f46923a = view;
        this.f46924b = charSequence;
        this.f46925c = C16200a0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f46932j && Math.abs(x10 - this.f46928f) <= this.f46925c && Math.abs(y10 - this.f46929g) <= this.f46925c) {
            return false;
        }
        this.f46928f = x10;
        this.f46929g = y10;
        this.f46932j = false;
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f46928f = view.getWidth() / 2;
        this.f46929g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
