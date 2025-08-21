package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class ReportLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f145182b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReportLevel f145183c = new ReportLevel("IGNORE", 0, "ignore");

    /* renamed from: d, reason: collision with root package name */
    public static final ReportLevel f145184d = new ReportLevel("WARN", 1, "warn");

    /* renamed from: e, reason: collision with root package name */
    public static final ReportLevel f145185e = new ReportLevel("STRICT", 2, "strict");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ReportLevel[] f145186f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145187g;

    /* renamed from: a, reason: collision with root package name */
    private final String f145188a;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ReportLevel[] a() {
        return new ReportLevel[]{f145183c, f145184d, f145185e};
    }

    static {
        ReportLevel[] reportLevelArrA = a();
        f145186f = reportLevelArrA;
        f145187g = EnumEntriesKt.a(reportLevelArrA);
        f145182b = new Companion(null);
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) f145186f.clone();
    }

    public final String b() {
        return this.f145188a;
    }

    public final boolean e() {
        return this == f145183c;
    }

    public final boolean l() {
        return this == f145184d;
    }

    private ReportLevel(String str, int i10, String str2) {
        this.f145188a = str2;
    }
}
