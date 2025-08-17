package R6;

import Q6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LR6/c;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "b", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "LQ6/a;", "bgTaskService", "LQ6/n;", "taskType", "", "c", "(LQ6/a;LQ6/n;)V", "", "a", "Ljava/util/List;", "properties", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Lazy<?>> properties = new ArrayList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    static final class a<T> extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f31910f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f31910f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.f31910f.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bugsnag/android/internal/dag/DependencyModule$resolveDependencies$1$1"}, k = 3, mv = {1, 4, 2})
    static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q6.a f31912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f31913c;

        b(Q6.a aVar, n nVar) {
            this.f31912b = aVar;
            this.f31913c = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = c.this.properties.iterator();
            while (it.hasNext()) {
                ((Lazy) it.next()).getValue();
            }
        }
    }

    public final <T> Lazy<T> b(Function0<? extends T> initializer) {
        Lazy<T> lazyB = LazyKt.b(new a(initializer));
        this.properties.add(lazyB);
        return lazyB;
    }

    public final void c(Q6.a bgTaskService, n taskType) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.b(bgTaskService.c(taskType, new b(bgTaskService, taskType)).get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
        }
    }
}
