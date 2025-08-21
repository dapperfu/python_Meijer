package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Jsr305Settings {

    /* renamed from: a, reason: collision with root package name */
    private final ReportLevel f145118a;

    /* renamed from: b, reason: collision with root package name */
    private final ReportLevel f145119b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<FqName, ReportLevel> f145120c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f145121d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f145122e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(ReportLevel globalLevel, ReportLevel reportLevel, Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.j(globalLevel, "globalLevel");
        Intrinsics.j(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f145118a = globalLevel;
        this.f145119b = reportLevel;
        this.f145120c = userDefinedLevelForSpecificAnnotation;
        this.f145121d = LazyKt.b(new g(this));
        ReportLevel reportLevel2 = ReportLevel.f145183c;
        this.f145122e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f145118a == jsr305Settings.f145118a && this.f145119b == jsr305Settings.f145119b && Intrinsics.e(this.f145120c, jsr305Settings.f145120c);
    }

    public int hashCode() {
        int iHashCode = this.f145118a.hashCode() * 31;
        ReportLevel reportLevel = this.f145119b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f145120c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f145118a + ", migrationLevel=" + this.f145119b + ", userDefinedLevelForSpecificAnnotation=" + this.f145120c + ')';
    }

    public final ReportLevel c() {
        return this.f145118a;
    }

    public final ReportLevel d() {
        return this.f145119b;
    }

    public final Map<FqName, ReportLevel> e() {
        return this.f145120c;
    }

    public final boolean f() {
        return this.f145122e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(Jsr305Settings jsr305Settings) {
        List listC = CollectionsKt.c();
        listC.add(jsr305Settings.f145118a.b());
        ReportLevel reportLevel = jsr305Settings.f145119b;
        if (reportLevel != null) {
            listC.add("under-migration:" + reportLevel.b());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.f145120c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + entry.getValue().b());
        }
        return (String[]) CollectionsKt.a(listC).toArray(new String[0]);
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? null : reportLevel2, (i10 & 4) != 0 ? MapsKt.k() : map);
    }
}
