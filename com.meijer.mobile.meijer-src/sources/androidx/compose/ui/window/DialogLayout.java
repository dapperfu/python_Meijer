package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.ViewCompat;
import androidx.core.view.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import p2.G;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0017¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010:R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010:R$\u0010>\u001a\u00020\n2\u0006\u00102\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/i;", "Lp2/G;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "usePlatformDefaultWidth", "decorFitsSystemWindows", "", "n", "(ZZ)V", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroidx/compose/runtime/k;", "parent", "Lkotlin/Function0;", "content", "m", "(Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "v", "Landroidx/core/view/j;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/j;)Landroidx/core/view/j;", "Landroid/view/MotionEvent;", "event", "l", "(Landroid/view/MotionEvent;)Z", "a", "(Landroidx/compose/runtime/Composer;I)V", "i", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "j", "Landroidx/compose/runtime/l0;", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "k", "Z", "hasCalledSetLayout", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class DialogLayout extends AbstractComposeView implements i, G {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 content;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean decorFitsSystemWindows;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hasCalledSetLayout;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/window/DialogLayout$a", "Landroidx/core/view/i$b;", "Landroidx/core/view/i;", "animation", "Landroidx/core/view/i$a;", "bounds", "e", "(Landroidx/core/view/i;Landroidx/core/view/i$a;)Landroidx/core/view/i$a;", "Landroidx/core/view/j;", "insets", "", "runningAnimations", "d", "(Landroidx/core/view/j;Ljava/util/List;)Landroidx/core/view/j;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends i.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.i.b
        public androidx.core.view.j d(androidx.core.view.j insets, List<androidx.core.view.i> runningAnimations) {
            DialogLayout dialogLayout = DialogLayout.this;
            if (!dialogLayout.decorFitsSystemWindows) {
                View childAt = dialogLayout.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return insets.q(iMax, iMax2, iMax3, iMax4);
                }
            }
            return insets;
        }

        @Override // androidx.core.view.i.b
        public i.a e(androidx.core.view.i animation, i.a bounds) {
            DialogLayout dialogLayout = DialogLayout.this;
            if (!dialogLayout.decorFitsSystemWindows) {
                View childAt = dialogLayout.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return bounds.c(c2.d.b(iMax, iMax2, iMax3, iMax4));
                }
            }
            return bounds;
        }
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = t1.e(f.f53149a.a(), null, 2, null);
        ViewCompat.A0(this, this);
        ViewCompat.I0(this, new a());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i10 = right - left;
        int i11 = bottom - top;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i10 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i11 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int i10 = (mode != Integer.MIN_VALUE || this.usePlatformDefaultWidth || this.decorFitsSystemWindows || getWindow().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i11 = size - paddingLeft;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = i10 - paddingTop;
        int i13 = i12 >= 0 ? i12 : 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.usePlatformDefaultWidth || this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingTop <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.window.i
    public Window getWindow() {
        return this.window;
    }

    public final void n(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        boolean z10 = (this.hasCalledSetLayout && usePlatformDefaultWidth == this.usePlatformDefaultWidth && decorFitsSystemWindows == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (z10) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i10 = usePlatformDefaultWidth ? -2 : -1;
            if (i10 == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i10, -2);
            this.hasCalledSetLayout = true;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(Composer composer, int i10) {
        composer.startReplaceGroup(1735448596);
        if (ComposerKt.M()) {
            ComposerKt.U(1735448596, i10, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    public final boolean l(MotionEvent event) {
        View childAt;
        int iD;
        float x10 = event.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = event.getY();
            if (Float.isInfinite(y10) || Float.isNaN(y10) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = getLeft() + childAt.getLeft();
            int width = childAt.getWidth() + left;
            int top = getTop() + childAt.getTop();
            int height = childAt.getHeight() + top;
            int iD2 = MathKt.d(event.getX());
            if (left <= iD2 && iD2 <= width && top <= (iD = MathKt.d(event.getY())) && iD <= height) {
                return true;
            }
        }
        return false;
    }

    public final void m(AbstractC5869k parent, Function2<? super Composer, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        d();
    }

    @Override // p2.G
    public androidx.core.view.j onApplyWindowInsets(View v10, androidx.core.view.j insets) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return insets.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return insets;
    }
}
