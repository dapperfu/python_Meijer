package O4;

import O4.P;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"LO4/y;", "LO4/P;", "LO4/y$a;", "builder", "<init>", "(LO4/y$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y extends P {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LO4/y$a;", "LO4/P$a;", "LO4/y;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "n", "()LO4/y;", "o", "()LO4/y$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends P.a<a, y> {
        @Override // O4.P.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.c> workerClass) {
            super(workerClass);
            Intrinsics.j(workerClass, "workerClass");
        }

        @Override // O4.P.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public y c() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new y(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LO4/y$b;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "LO4/y;", "a", "(Ljava/lang/Class;)LO4/y;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: O4.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final y a(Class<? extends androidx.work.c> workerClass) {
            Intrinsics.j(workerClass, "workerClass");
            return new a(workerClass).b();
        }
    }

    @JvmStatic
    public static final y e(Class<? extends androidx.work.c> cls) {
        return INSTANCE.a(cls);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.f());
        Intrinsics.j(builder, "builder");
    }
}
