package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ReportLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f144275b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReportLevel f144276c = new ReportLevel("IGNORE", 0, "ignore");

    /* renamed from: d, reason: collision with root package name */
    public static final ReportLevel f144277d = new ReportLevel("WARN", 1, "warn");

    /* renamed from: e, reason: collision with root package name */
    public static final ReportLevel f144278e = new ReportLevel("STRICT", 2, "strict");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ReportLevel[] f144279f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144280g;

    /* renamed from: a, reason: collision with root package name */
    private final String f144281a;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ReportLevel[] a() {
        return new ReportLevel[]{f144276c, f144277d, f144278e};
    }

    static {
        ReportLevel[] reportLevelArrA = a();
        f144279f = reportLevelArrA;
        f144280g = EnumEntriesKt.a(reportLevelArrA);
        f144275b = new Companion(null);
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) f144279f.clone();
    }

    public final String b() {
        return this.f144281a;
    }

    public final boolean e() {
        return this == f144276c;
    }

    public final boolean l() {
        return this == f144277d;
    }

    private ReportLevel(String str, int i10, String str2) {
        this.f144281a = str2;
    }
}
