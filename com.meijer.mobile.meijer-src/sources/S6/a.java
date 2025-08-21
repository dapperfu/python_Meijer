package S6;

import R6.t;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LS6/a;", "", "LR6/b;", "bgTaskService", "LR6/t;", "taskType", "<init>", "(LR6/b;LR6/t;)V", "a", "LR6/b;", "b", "LR6/t;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final R6.b bgTaskService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final t taskType;

    public a(R6.b bVar, t tVar) {
        this.bgTaskService = bVar;
        this.taskType = tVar;
    }

    public /* synthetic */ a(R6.b bVar, t tVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? t.DEFAULT : tVar);
    }
}
