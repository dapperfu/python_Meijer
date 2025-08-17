package I7;

import android.content.Context;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;
import v7.C17518c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001a"}, d2 = {"LI7/f;", "", "Landroid/content/Context;", "context", "LI7/h;", "secondGenServiceLocator", "LZ7/g;", "metricsRepository", "Lqv/O;", "coroutineScope", "<init>", "(Landroid/content/Context;LI7/h;LZ7/g;Lqv/O;)V", "LI7/g;", "d", "()LI7/g;", "c", "LV7/f;", "b", "()LV7/f;", "LV7/b;", "a", "()LV7/b;", "Landroid/content/Context;", "LI7/h;", "LZ7/g;", "Lqv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h secondGenServiceLocator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Z7.g metricsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    public f(Context context, h secondGenServiceLocator, Z7.g metricsRepository, InterfaceC16622O coroutineScope) {
        Intrinsics.j(context, "context");
        Intrinsics.j(secondGenServiceLocator, "secondGenServiceLocator");
        Intrinsics.j(metricsRepository, "metricsRepository");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.context = context;
        this.secondGenServiceLocator = secondGenServiceLocator;
        this.metricsRepository = metricsRepository;
        this.coroutineScope = coroutineScope;
    }

    private final g c() {
        return new a(CollectionsKt.p(this.secondGenServiceLocator.c(), d()));
    }

    private final g d() {
        return new V7.d(new C17518c(this.context), this.context, null, 4, null);
    }

    public final V7.b a() {
        return new V7.b(this.metricsRepository);
    }

    public final V7.f b() {
        return new V7.f(this.secondGenServiceLocator.a(), c(), this.metricsRepository, 0L, this.coroutineScope, 8, null);
    }
}
