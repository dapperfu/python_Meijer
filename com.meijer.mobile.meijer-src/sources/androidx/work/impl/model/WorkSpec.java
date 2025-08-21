package androidx.work.impl.model;

import O4.AbstractC4373v;
import O4.C4356d;
import O4.E;
import O4.EnumC4353a;
import O4.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.model.WorkSpec;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import q.InterfaceC16578a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0003;=/Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b#\u0010&B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0000¢\u0006\u0004\b#\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0019¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u0082\u0002\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u00109\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010<R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010JR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010CR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010CR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010CR\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010I\u001a\u0004\bE\u00108\"\u0004\bR\u0010SR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bA\u00108R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010C\u001a\u0004\bB\u00100\"\u0004\bM\u0010,R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010I\u001a\u0004\bD\u00108\"\u0004\bN\u0010SR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bF\u00108R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010<\u001a\u0004\bH\u00104\"\u0004\bQ\u0010YR\u0011\u0010Z\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bL\u00102R\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bK\u00102¨\u0006]"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", PreferencesHelper.PREF_ID, "LO4/N$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "LO4/d;", "constraints", "", "runAttemptCount", "LO4/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "LO4/E;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "<init>", "(Ljava/lang/String;LO4/N$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLO4/d;ILO4/a;JJJJZLO4/E;IIJIILjava/lang/String;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "", "o", "(J)V", "r", "(JJ)V", "c", "()J", "l", "()Z", "toString", "()Ljava/lang/String;", "d", "(Ljava/lang/String;LO4/N$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLO4/d;ILO4/a;JJJJZLO4/E;IIJIILjava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LO4/N$c;", "e", "Landroidx/work/b;", "f", "g", "J", "h", "i", "j", "LO4/d;", "k", "I", "LO4/a;", "m", "n", "p", "q", "Z", "LO4/E;", "s", "setPeriodCount", "(I)V", "t", "u", "v", "w", "x", "(Ljava/lang/String;)V", "isPeriodic", "isBackedOff", "y", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class WorkSpec {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final InterfaceC16578a<List<WorkInfoPojo>, List<N>> f59451A;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    private static final String f59453z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public N.c state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public String workerClassName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public String inputMergerClassName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public androidx.work.b input;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public androidx.work.b output;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long initialDelay;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long intervalDuration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long flexDuration;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public C4356d constraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int runAttemptCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public EnumC4353a backoffPolicy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long backoffDelayDuration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long lastEnqueueTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long minimumRetentionDuration;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long scheduleRequestedAt;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public boolean expedited;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public E outOfQuotaPolicy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int periodCount;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int generation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long nextScheduleTimeOverride;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int nextScheduleTimeOverrideGeneration;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final int stopReason;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String traceTag;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/work/impl/model/WorkSpec$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "LO4/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILO4/a;JJIZJJJJ)J", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Lq/a;", "", "Landroidx/work/impl/model/WorkSpec$c;", "LO4/N;", "WORK_INFO_MAPPER", "Lq/a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.model.WorkSpec$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a(boolean isBackedOff, int runAttemptCount, EnumC4353a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            Intrinsics.j(backoffPolicy, "backoffPolicy");
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : RangesKt.g(nextScheduleTimeOverride, 900000 + lastEnqueueTime);
            }
            if (isBackedOff) {
                return RangesKt.l(backoffPolicy == EnumC4353a.LINEAR ? backoffDelayDuration * runAttemptCount : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L) + lastEnqueueTime;
            }
            if (isPeriodic) {
                long j10 = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                return (flexDuration == intervalDuration || periodCount != 0) ? j10 : j10 + (intervalDuration - flexDuration);
            }
            if (lastEnqueueTime == -1) {
                return Long.MAX_VALUE;
            }
            return lastEnqueueTime + initialDelay;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/model/WorkSpec$b;", "", "", PreferencesHelper.PREF_ID, "LO4/N$c;", "state", "<init>", "(Ljava/lang/String;LO4/N$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LO4/N$c;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.model.WorkSpec$b, reason: from toString */
    public static final /* data */ class IdAndState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @JvmField
        public String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @JvmField
        public N.c state;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return Intrinsics.e(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }

        public IdAndState(String id2, N.c state) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(state, "state");
            this.id = id2;
            this.state = state;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b9\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u0010!\"\u0004\bO\u0010LR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010(R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u0011\u0010a\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0011\u0010b\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010`¨\u0006c"}, d2 = {"Landroidx/work/impl/model/WorkSpec$c;", "", "", PreferencesHelper.PREF_ID, "LO4/N$c;", "state", "Landroidx/work/b;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "LO4/d;", "constraints", "", "runAttemptCount", "LO4/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;LO4/N$c;Landroidx/work/b;JJJLO4/d;ILO4/a;JJIIJILjava/util/List;Ljava/util/List;)V", "LO4/N$b;", "b", "()LO4/N$b;", "a", "()J", "LO4/N;", "e", "()LO4/N;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "LO4/N$c;", "getState", "()LO4/N$c;", "c", "Landroidx/work/b;", "getOutput", "()Landroidx/work/b;", "d", "J", "getInitialDelay", "getIntervalDuration", "f", "getFlexDuration", "g", "LO4/d;", "getConstraints", "()LO4/d;", "h", "I", "getRunAttemptCount", "i", "LO4/a;", "getBackoffPolicy", "()LO4/a;", "setBackoffPolicy", "(LO4/a;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "q", "getProgress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.model.WorkSpec$c, reason: from toString */
    public static final /* data */ class WorkInfoPojo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final N.c state;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final androidx.work.b output;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long initialDelay;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long intervalDuration;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long flexDuration;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final C4356d constraints;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int runAttemptCount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private EnumC4353a backoffPolicy;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private long backoffDelayDuration;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private long lastEnqueueTime;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private int periodCount;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int generation;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final long nextScheduleTimeOverride;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stopReason;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> tags;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<androidx.work.b> progress;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return Intrinsics.e(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.e(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && Intrinsics.e(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.e(this.tags, workInfoPojo.tags) && Intrinsics.e(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public WorkInfoPojo(String id2, N.c state, androidx.work.b output, long j10, long j11, long j12, C4356d constraints, int i10, EnumC4353a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List<String> tags, List<androidx.work.b> progress) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(state, "state");
            Intrinsics.j(output, "output");
            Intrinsics.j(constraints, "constraints");
            Intrinsics.j(backoffPolicy, "backoffPolicy");
            Intrinsics.j(tags, "tags");
            Intrinsics.j(progress, "progress");
            this.id = id2;
            this.state = state;
            this.output = output;
            this.initialDelay = j10;
            this.intervalDuration = j11;
            this.flexDuration = j12;
            this.constraints = constraints;
            this.runAttemptCount = i10;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j13;
            this.lastEnqueueTime = j14;
            this.periodCount = i11;
            this.generation = i12;
            this.nextScheduleTimeOverride = j15;
            this.stopReason = i13;
            this.tags = tags;
            this.progress = progress;
        }

        private final long a() {
            if (this.state == N.c.ENQUEUED) {
                return WorkSpec.INSTANCE.a(c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        private final N.b b() {
            long j10 = this.intervalDuration;
            if (j10 != 0) {
                return new N.b(j10, this.flexDuration);
            }
            return null;
        }

        public final boolean c() {
            return this.state == N.c.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean d() {
            return this.intervalDuration != 0;
        }

        public final N e() {
            androidx.work.b bVar = !this.progress.isEmpty() ? this.progress.get(0) : androidx.work.b.f59339c;
            UUID uuidFromString = UUID.fromString(this.id);
            Intrinsics.i(uuidFromString, "fromString(id)");
            return new N(uuidFromString, this.state, new HashSet(this.tags), this.output, bVar, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, b(), a(), this.stopReason);
        }
    }

    public WorkSpec(String id2, N.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C4356d constraints, int i10, EnumC4353a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, E outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(state, "state");
        Intrinsics.j(workerClassName, "workerClassName");
        Intrinsics.j(inputMergerClassName, "inputMergerClassName");
        Intrinsics.j(input, "input");
        Intrinsics.j(output, "output");
        Intrinsics.j(constraints, "constraints");
        Intrinsics.j(backoffPolicy, "backoffPolicy");
        Intrinsics.j(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
        this.nextScheduleTimeOverride = j17;
        this.nextScheduleTimeOverrideGeneration = i13;
        this.stopReason = i14;
        this.traceTag = str;
    }

    public static /* synthetic */ WorkSpec e(WorkSpec workSpec, String str, N.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C4356d c4356d, int i10, EnumC4353a enumC4353a, long j13, long j14, long j15, long j16, boolean z10, E e10, int i11, int i12, long j17, int i13, int i14, String str4, int i15, Object obj) {
        String str5;
        int i16;
        EnumC4353a enumC4353a2;
        long j18;
        long j19;
        long j20;
        long j21;
        E e11;
        int i17;
        int i18;
        long j22;
        N.c cVar2;
        int i19;
        boolean z11;
        String str6;
        String str7;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        long j23;
        long j24;
        long j25;
        C4356d c4356d2;
        int i20;
        String str8 = (i15 & 1) != 0 ? workSpec.id : str;
        N.c cVar3 = (i15 & 2) != 0 ? workSpec.state : cVar;
        String str9 = (i15 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i15 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        androidx.work.b bVar5 = (i15 & 16) != 0 ? workSpec.input : bVar;
        androidx.work.b bVar6 = (i15 & 32) != 0 ? workSpec.output : bVar2;
        long j26 = (i15 & 64) != 0 ? workSpec.initialDelay : j10;
        long j27 = (i15 & 128) != 0 ? workSpec.intervalDuration : j11;
        long j28 = (i15 & 256) != 0 ? workSpec.flexDuration : j12;
        C4356d c4356d3 = (i15 & 512) != 0 ? workSpec.constraints : c4356d;
        int i21 = (i15 & 1024) != 0 ? workSpec.runAttemptCount : i10;
        String str11 = str8;
        EnumC4353a enumC4353a3 = (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? workSpec.backoffPolicy : enumC4353a;
        N.c cVar4 = cVar3;
        long j29 = (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? workSpec.backoffDelayDuration : j13;
        long j30 = (i15 & 8192) != 0 ? workSpec.lastEnqueueTime : j14;
        long j31 = (i15 & 16384) != 0 ? workSpec.minimumRetentionDuration : j15;
        long j32 = (i15 & 32768) != 0 ? workSpec.scheduleRequestedAt : j16;
        boolean z12 = (i15 & 65536) != 0 ? workSpec.expedited : z10;
        long j33 = j32;
        E e12 = (i15 & 131072) != 0 ? workSpec.outOfQuotaPolicy : e10;
        int i22 = (i15 & 262144) != 0 ? workSpec.periodCount : i11;
        E e13 = e12;
        int i23 = (i15 & 524288) != 0 ? workSpec.generation : i12;
        int i24 = i22;
        long j34 = (i15 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j17;
        int i25 = (i15 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i13;
        int i26 = (i15 & 4194304) != 0 ? workSpec.stopReason : i14;
        if ((i15 & 8388608) != 0) {
            i16 = i25;
            str5 = workSpec.traceTag;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            e11 = e13;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            cVar2 = cVar4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c4356d2 = c4356d3;
            i20 = i21;
            enumC4353a2 = enumC4353a3;
        } else {
            str5 = str4;
            i16 = i25;
            enumC4353a2 = enumC4353a3;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            e11 = e13;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            cVar2 = cVar4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c4356d2 = c4356d3;
            i20 = i21;
        }
        return workSpec.d(str11, cVar2, str6, str7, bVar3, bVar4, j23, j24, j25, c4356d2, i20, enumC4353a2, j18, j19, j20, j21, z11, e11, i17, i18, j22, i16, i19, str5);
    }

    public final WorkSpec d(String id2, N.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long initialDelay, long intervalDuration, long flexDuration, C4356d constraints, int runAttemptCount, EnumC4353a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, E outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, String traceTag) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(state, "state");
        Intrinsics.j(workerClassName, "workerClassName");
        Intrinsics.j(inputMergerClassName, "inputMergerClassName");
        Intrinsics.j(input, "input");
        Intrinsics.j(output, "output");
        Intrinsics.j(constraints, "constraints");
        Intrinsics.j(backoffPolicy, "backoffPolicy");
        Intrinsics.j(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) other;
        return Intrinsics.e(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.e(this.workerClassName, workSpec.workerClassName) && Intrinsics.e(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.e(this.input, workSpec.input) && Intrinsics.e(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.e(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && Intrinsics.e(this.traceTag, workSpec.traceTag);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    static {
        String strI = AbstractC4373v.i("WorkSpec");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkSpec\")");
        f59453z = strI;
        f59451A = new InterfaceC16578a() { // from class: W4.m
            @Override // q.InterfaceC16578a
            public final Object apply(Object obj) {
                return WorkSpec.b((List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).e());
        }
        return arrayList;
    }

    public final long c() {
        return INSTANCE.a(m(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, n(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    /* renamed from: f, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: g, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* renamed from: h, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* renamed from: i, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: j, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* renamed from: k, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean l() {
        return !Intrinsics.e(C4356d.f23154k, this.constraints);
    }

    public final boolean m() {
        return this.state == N.c.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean n() {
        return this.intervalDuration != 0;
    }

    public final void p(long j10) {
        this.nextScheduleTimeOverride = j10;
    }

    public final void q(int i10) {
        this.nextScheduleTimeOverrideGeneration = i10;
    }

    public final void s(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public final void o(long backoffDelayDuration) {
        if (backoffDelayDuration > 18000000) {
            AbstractC4373v.e().k(f59453z, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            AbstractC4373v.e().k(f59453z, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.p(backoffDelayDuration, 10000L, 18000000L);
    }

    public final void r(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            AbstractC4373v.e().k(f59453z, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.g(intervalDuration, 900000L);
        if (flexDuration < 300000) {
            AbstractC4373v.e().k(f59453z, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            AbstractC4373v.e().k(f59453z, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = RangesKt.p(flexDuration, 300000L, this.intervalDuration);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, N.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C4356d c4356d, int i10, EnumC4353a enumC4353a, long j13, long j14, long j15, long j16, boolean z10, E e10, int i11, int i12, long j17, int i13, int i14, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        N.c cVar2 = (i15 & 2) != 0 ? N.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.i(name, "OverwritingInputMerger::class.java.name");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, cVar2, str2, str5, (i15 & 16) != 0 ? androidx.work.b.f59339c : bVar, (i15 & 32) != 0 ? androidx.work.b.f59339c : bVar2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? C4356d.f23154k : c4356d, (i15 & 1024) != 0 ? 0 : i10, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? EnumC4353a.EXPONENTIAL : enumC4353a, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? E.RUN_AS_NON_EXPEDITED_WORK_REQUEST : e10, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (i15 & 8388608) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        Intrinsics.j(id2, "id");
        Intrinsics.j(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.b(other.input), new androidx.work.b(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new C4356d(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, 524288, null);
        Intrinsics.j(newId, "newId");
        Intrinsics.j(other, "other");
    }
}
