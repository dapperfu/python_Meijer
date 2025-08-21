package androidx.compose.material.ripple;

import B0.d;
import P0.k;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "LB0/d;", "Landroidx/compose/material/ripple/RippleHostView;", "(LB0/d;)Landroidx/compose/material/ripple/RippleHostView;", "a", "(LB0/d;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Landroidx/compose/material/ripple/a;", "d", "Landroidx/compose/material/ripple/a;", "rippleHostMap", "e", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<RippleHostView> rippleHosts;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<RippleHostView> unusedRippleHosts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a rippleHostMap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final RippleHostView b(d dVar) {
        RippleHostView rippleHostViewB = this.rippleHostMap.b(dVar);
        if (rippleHostViewB != null) {
            return rippleHostViewB;
        }
        RippleHostView rippleHostView = (RippleHostView) CollectionsKt.L(this.unusedRippleHosts);
        if (rippleHostView == null) {
            if (this.nextHostIndex > CollectionsKt.o(this.rippleHosts)) {
                rippleHostView = new RippleHostView(getContext());
                addView(rippleHostView);
                this.rippleHosts.add(rippleHostView);
            } else {
                rippleHostView = this.rippleHosts.get(this.nextHostIndex);
                d dVarA = this.rippleHostMap.a(rippleHostView);
                if (dVarA != null) {
                    dVarA.x1();
                    this.rippleHostMap.c(dVarA);
                    rippleHostView.d();
                }
            }
            int i10 = this.nextHostIndex;
            if (i10 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i10 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(dVar, rippleHostView);
        return rippleHostView;
    }

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new a();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(k.f25224J, Boolean.TRUE);
    }

    public final void a(d dVar) {
        dVar.x1();
        RippleHostView rippleHostViewB = this.rippleHostMap.b(dVar);
        if (rippleHostViewB != null) {
            rippleHostViewB.d();
            this.rippleHostMap.c(dVar);
            this.unusedRippleHosts.add(rippleHostViewB);
        }
    }
}
