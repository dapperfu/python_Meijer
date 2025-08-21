package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "a", "Ljava/util/concurrent/TimeUnit;", "b", "()Ljava/util/concurrent/TimeUnit;", "c", "d", "e", "f", "g", "h", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public final class DurationUnit {

    /* renamed from: b, reason: collision with root package name */
    public static final DurationUnit f148414b = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final DurationUnit f148415c = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final DurationUnit f148416d = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final DurationUnit f148417e = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final DurationUnit f148418f = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final DurationUnit f148419g = new DurationUnit("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h, reason: collision with root package name */
    public static final DurationUnit f148420h = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ DurationUnit[] f148421i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f148422j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TimeUnit timeUnit;

    private static final /* synthetic */ DurationUnit[] a() {
        return new DurationUnit[]{f148414b, f148415c, f148416d, f148417e, f148418f, f148419g, f148420h};
    }

    static {
        DurationUnit[] durationUnitArrA = a();
        f148421i = durationUnitArrA;
        f148422j = EnumEntriesKt.a(durationUnitArrA);
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f148421i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    private DurationUnit(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }
}
