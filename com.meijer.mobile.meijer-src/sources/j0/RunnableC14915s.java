package j0;

import android.os.Build;
import android.view.View;
import androidx.core.view.i;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00106\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lj0/s;", "Landroidx/core/view/i$b;", "Ljava/lang/Runnable;", "Lp2/G;", "Landroid/view/View$OnAttachStateChangeListener;", "Lj0/P;", "composeInsets", "<init>", "(Lj0/P;)V", "Landroidx/core/view/i;", "animation", "", "c", "(Landroidx/core/view/i;)V", "Landroidx/core/view/i$a;", "bounds", "e", "(Landroidx/core/view/i;Landroidx/core/view/i$a;)Landroidx/core/view/i$a;", "Landroidx/core/view/j;", "insets", "", "runningAnimations", "d", "(Landroidx/core/view/j;Ljava/util/List;)Landroidx/core/view/j;", "b", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/j;)Landroidx/core/view/j;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Lj0/P;", "getComposeInsets", "()Lj0/P;", "", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "f", "Landroidx/core/view/j;", "getSavedInsets", "()Landroidx/core/view/j;", "setSavedInsets", "(Landroidx/core/view/j;)V", "savedInsets", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC14915s extends i.b implements Runnable, p2.G, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14895P composeInsets;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean runningAnimation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.core.view.j savedInsets;

    @Override // androidx.core.view.i.b
    public void b(androidx.core.view.i animation) {
        this.prepared = false;
        this.runningAnimation = false;
        androidx.core.view.j jVar = this.savedInsets;
        if (animation.a() != 0 && jVar != null) {
            this.composeInsets.m(jVar);
            this.composeInsets.n(jVar);
            C14895P.l(this.composeInsets, jVar, 0, 2, null);
        }
        this.savedInsets = null;
        super.b(animation);
    }

    @Override // androidx.core.view.i.b
    public void c(androidx.core.view.i animation) {
        this.prepared = true;
        this.runningAnimation = true;
        super.c(animation);
    }

    @Override // androidx.core.view.i.b
    public i.a e(androidx.core.view.i animation, i.a bounds) {
        this.prepared = false;
        return super.e(animation, bounds);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
    }

    @Override // androidx.core.view.i.b
    public androidx.core.view.j d(androidx.core.view.j insets, List<androidx.core.view.i> runningAnimations) {
        C14895P.l(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? androidx.core.view.j.f54193b : insets;
    }

    @Override // p2.G
    public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j insets) {
        this.savedInsets = insets;
        this.composeInsets.n(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.m(insets);
            C14895P.l(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? androidx.core.view.j.f54193b : insets;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            androidx.core.view.j jVar = this.savedInsets;
            if (jVar != null) {
                this.composeInsets.m(jVar);
                C14895P.l(this.composeInsets, jVar, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public RunnableC14915s(C14895P c14895p) {
        super(!c14895p.getConsumes() ? 1 : 0);
        this.composeInsets = c14895p;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}
