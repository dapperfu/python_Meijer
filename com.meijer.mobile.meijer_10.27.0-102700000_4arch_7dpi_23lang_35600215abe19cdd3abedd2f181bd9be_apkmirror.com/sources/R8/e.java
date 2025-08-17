package R8;

import R8.a;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p9.C16270a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"LR8/e;", "", "Ll9/b;", "concurrentHandlerHolder", "Lp9/a;", "currentActivityProvider", "", "LR8/a;", "lifecycleActions", "<init>", "(Ll9/b;Lp9/a;Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "", "LR8/a$a;", "lifecycles", "", "e", "(Landroid/app/Activity;Ljava/util/List;)V", "activityLifecycleAction", "c", "(LR8/a;)V", "a", "Ll9/b;", "g", "()Ll9/b;", "b", "Lp9/a;", "h", "()Lp9/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "d", "j", "triggerOnActivityActions", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16270a currentActivityProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<R8.a> lifecycleActions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<R8.a> triggerOnActivityActions;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(b.a((R8.a) t10)), Integer.valueOf(b.a((R8.a) t11)));
        }
    }

    public e(l9.b concurrentHandlerHolder, C16270a currentActivityProvider, List<R8.a> lifecycleActions) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(currentActivityProvider, "currentActivityProvider");
        Intrinsics.j(lifecycleActions, "lifecycleActions");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.currentActivityProvider = currentActivityProvider;
        this.lifecycleActions = lifecycleActions;
        this.triggerOnActivityActions = new ArrayList();
    }

    public void c(final R8.a activityLifecycleAction) {
        Intrinsics.j(activityLifecycleAction, "activityLifecycleAction");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: R8.c
            @Override // java.lang.Runnable
            public final void run() {
                e.d(this.f31939a, activityLifecycleAction);
            }
        });
    }

    public void e(final Activity activity, final List<? extends a.EnumC0721a> lifecycles) {
        Intrinsics.j(lifecycles, "lifecycles");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: R8.d
            @Override // java.lang.Runnable
            public final void run() {
                e.f(this.f31941a, lifecycles, activity);
            }
        });
    }

    /* renamed from: g, reason: from getter */
    public l9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    /* renamed from: h, reason: from getter */
    public C16270a getCurrentActivityProvider() {
        return this.currentActivityProvider;
    }

    public List<R8.a> i() {
        return this.lifecycleActions;
    }

    public List<R8.a> j() {
        return this.triggerOnActivityActions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e eVar, R8.a aVar) {
        Activity activityA = eVar.getCurrentActivityProvider().a();
        eVar.j().add(aVar);
        if (activityA != null) {
            Iterator<T> it = eVar.j().iterator();
            while (it.hasNext()) {
                ((R8.a) it.next()).a(activityA);
            }
            eVar.j().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, List list, Activity activity) {
        List listP0 = CollectionsKt.P0(eVar.i(), eVar.j());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (list.contains(((R8.a) obj).getTriggeringLifecycle())) {
                arrayList.add(obj);
            }
        }
        for (R8.a aVar : CollectionsKt.Z0(arrayList, new a())) {
            aVar.a(activity);
            if (!aVar.getRepeatable()) {
                eVar.i().remove(aVar);
                eVar.j().remove(aVar);
            }
        }
    }
}
