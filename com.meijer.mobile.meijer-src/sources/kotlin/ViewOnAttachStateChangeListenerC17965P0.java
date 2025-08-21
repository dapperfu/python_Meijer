package kotlin;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lx0/P0;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onGlobalLayoutCallback", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "c", "p0", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "a", "Landroid/view/View;", "Lkotlin/jvm/functions/Function0;", "", "Z", "isListeningToGlobalLayout", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.P0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC17965P0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onGlobalLayoutCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningToGlobalLayout;

    private final void b() {
        if (this.isListeningToGlobalLayout || !this.view.isAttachedToWindow()) {
            return;
        }
        this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = true;
    }

    private final void c() {
        if (this.isListeningToGlobalLayout) {
            this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.onGlobalLayoutCallback.invoke();
    }

    public ViewOnAttachStateChangeListenerC17965P0(View view, Function0<Unit> function0) {
        this.view = view;
        this.onGlobalLayoutCallback = function0;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    public final void a() {
        c();
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p02) {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p02) {
        c();
    }
}
