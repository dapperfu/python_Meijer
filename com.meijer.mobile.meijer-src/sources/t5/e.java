package t5;

import com.adobe.marketing.mobile.InterfaceC6543a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001d"}, d2 = {"Lt5/e;", "", "<init>", "()V", "", "c", "d", "", "timeout", "Lkotlin/Function0;", "task", "h", "(JLkotlin/jvm/functions/Function0;)V", "j", "", "e", "()Z", "f", "a", "Z", "g", "setTimerRunning$analytics_phoneRelease", "(Z)V", "isTimerRunning", "Lt5/g;", "b", "Lt5/g;", "referrerTimerState", "lifecycleTimerState", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isTimerRunning;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g referrerTimerState = new g("ADBReferrerTimer");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g lifecycleTimerState = new g("ADBLifecycleTimer");

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function0 task, Boolean bool) {
        Intrinsics.j(task, "$task");
        task.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function0 task, Boolean bool) {
        Intrinsics.j(task, "$task");
        task.invoke();
    }

    public final void c() {
        this.lifecycleTimerState.b();
    }

    public final void d() {
        this.referrerTimerState.b();
    }

    public final boolean e() {
        return this.lifecycleTimerState.c();
    }

    public final boolean f() {
        return this.referrerTimerState.c();
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsTimerRunning() {
        return this.isTimerRunning;
    }

    public final void h(long timeout, final Function0<Unit> task) {
        Intrinsics.j(task, "task");
        this.lifecycleTimerState.d(timeout, new InterfaceC6543a() { // from class: t5.c
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                e.i(task, (Boolean) obj);
            }
        });
    }

    public final void j(long timeout, final Function0<Unit> task) {
        Intrinsics.j(task, "task");
        this.referrerTimerState.d(timeout, new InterfaceC6543a() { // from class: t5.d
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                e.k(task, (Boolean) obj);
            }
        });
    }
}
