package c8;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc8/h;", "Lc8/g;", "Lc8/j;", "nativeGenerator", "Lc8/f;", "composeGenerator", "<init>", "(Lc8/j;Lc8/f;)V", "", "Lc8/c;", "touchList", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/View;", "interactView", "Lc8/e;", "a", "(Ljava/util/List;Landroid/view/ViewGroup;Landroid/view/View;)Lc8/e;", "Lc8/a;", "composeHitEvent", "b", "(Ljava/util/List;Lc8/a;)Lc8/e;", "Lc8/j;", "Lc8/f;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j nativeGenerator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f composeGenerator;

    public h(j nativeGenerator, f composeGenerator) {
        Intrinsics.j(nativeGenerator, "nativeGenerator");
        Intrinsics.j(composeGenerator, "composeGenerator");
        this.nativeGenerator = nativeGenerator;
        this.composeGenerator = composeGenerator;
    }

    @Override // c8.g
    public TouchUserInteraction a(List<TouchEvent> touchList, ViewGroup rootView, View interactView) {
        Intrinsics.j(touchList, "touchList");
        Intrinsics.j(rootView, "rootView");
        return this.nativeGenerator.a(touchList, rootView, interactView);
    }

    @Override // c8.g
    public TouchUserInteraction b(List<TouchEvent> touchList, C6374a composeHitEvent) {
        Intrinsics.j(touchList, "touchList");
        return this.composeGenerator.a(touchList, composeHitEvent);
    }
}
