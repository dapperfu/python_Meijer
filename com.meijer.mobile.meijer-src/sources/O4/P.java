package O4;

import androidx.work.impl.model.WorkSpec;
import com.medallia.digital.mobilesdk.l3;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"LO4/P;", "", "Ljava/util/UUID;", PreferencesHelper.PREF_ID, "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Landroidx/work/impl/model/WorkSpec;", "d", "()Landroidx/work/impl/model/WorkSpec;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class P {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WorkSpec workSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> tags;

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00028\u0001H ¢\u0006\u0004\b'\u0010&R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\"\u00101\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010=\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u001e0>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"LO4/P$a;", "B", "LO4/P;", "W", "", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", PreferencesHelper.PREF_ID, "k", "(Ljava/util/UUID;)LO4/P$a;", "LO4/a;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "i", "(LO4/a;JLjava/util/concurrent/TimeUnit;)LO4/P$a;", "LO4/d;", "constraints", "j", "(LO4/d;)LO4/P$a;", "Landroidx/work/b;", "inputData", "m", "(Landroidx/work/b;)LO4/P$a;", "", "tag", "a", "(Ljava/lang/String;)LO4/P$a;", "duration", "l", "(JLjava/util/concurrent/TimeUnit;)LO4/P$a;", "b", "()LO4/P;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", "d", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Landroidx/work/impl/model/WorkSpec;", "Landroidx/work/impl/model/WorkSpec;", "h", "()Landroidx/work/impl/model/WorkSpec;", "setWorkSpec$work_runtime_release", "(Landroidx/work/impl/model/WorkSpec;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()LO4/P$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class a<B extends a<B, ?>, W extends P> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<? extends androidx.work.c> workerClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean backoffCriteriaSet;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private UUID id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private WorkSpec workSpec;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Set<String> tags;

        public abstract W c();

        public abstract B g();

        public a(Class<? extends androidx.work.c> workerClass) {
            Intrinsics.j(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.i(uuidRandomUUID, "randomUUID()");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            Intrinsics.i(string, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.i(name, "workerClass.name");
            this.workSpec = new WorkSpec(string, name);
            String name2 = workerClass.getName();
            Intrinsics.i(name2, "workerClass.name");
            this.tags = SetsKt.g(name2);
        }

        public final B a(String tag) {
            Intrinsics.j(tag, "tag");
            this.tags.add(tag);
            return (B) g();
        }

        /* renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        /* renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final Set<String> f() {
            return this.tags;
        }

        /* renamed from: h, reason: from getter */
        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final B i(EnumC4353a backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
            Intrinsics.j(backoffPolicy, "backoffPolicy");
            Intrinsics.j(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.o(timeUnit.toMillis(backoffDelay));
            return (B) g();
        }

        public final B j(C4356d constraints) {
            Intrinsics.j(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return (B) g();
        }

        public final B k(UUID id2) {
            Intrinsics.j(id2, "id");
            this.id = id2;
            String string = id2.toString();
            Intrinsics.i(string, "id.toString()");
            this.workSpec = new WorkSpec(string, this.workSpec);
            return (B) g();
        }

        public B l(long duration, TimeUnit timeUnit) {
            Intrinsics.j(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B m(androidx.work.b inputData) {
            Intrinsics.j(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) g();
        }

        public final W b() {
            boolean z10;
            W w10 = (W) c();
            C4356d c4356d = this.workSpec.constraints;
            if (!c4356d.g() && !c4356d.getRequiresBatteryNotLow() && !c4356d.getRequiresCharging() && !c4356d.getRequiresDeviceIdle()) {
                z10 = false;
            } else {
                z10 = true;
            }
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (!z10) {
                    if (workSpec.initialDelay > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            if (workSpec.getTraceTag() == null) {
                WorkSpec workSpec2 = this.workSpec;
                workSpec2.s(P.INSTANCE.b(workSpec2.workerClassName));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.i(uuidRandomUUID, "randomUUID()");
            k(uuidRandomUUID);
            return w10;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"LO4/P$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O4.P$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String workerClassName) {
            List listB1 = StringsKt.b1(workerClassName, new String[]{"."}, false, 0, 6, null);
            String str = listB1.size() == 1 ? (String) listB1.get(0) : (String) CollectionsKt.D0(listB1);
            return str.length() <= 127 ? str : StringsKt.N1(str, l3.f93324d);
        }
    }

    public P(UUID id2, WorkSpec workSpec, Set<String> tags) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(workSpec, "workSpec");
        Intrinsics.j(tags, "tags");
        this.id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    /* renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    public final Set<String> c() {
        return this.tags;
    }

    /* renamed from: d, reason: from getter */
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final String b() {
        String string = getId().toString();
        Intrinsics.i(string, "id.toString()");
        return string;
    }
}
