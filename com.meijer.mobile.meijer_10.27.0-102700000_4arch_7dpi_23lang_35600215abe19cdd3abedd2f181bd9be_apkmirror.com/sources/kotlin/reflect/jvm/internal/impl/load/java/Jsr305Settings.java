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
/* loaded from: classes13.dex */
public final class Jsr305Settings {

    /* renamed from: a, reason: collision with root package name */
    private final ReportLevel f144211a;

    /* renamed from: b, reason: collision with root package name */
    private final ReportLevel f144212b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<FqName, ReportLevel> f144213c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f144214d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f144215e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(ReportLevel globalLevel, ReportLevel reportLevel, Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.j(globalLevel, "globalLevel");
        Intrinsics.j(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f144211a = globalLevel;
        this.f144212b = reportLevel;
        this.f144213c = userDefinedLevelForSpecificAnnotation;
        this.f144214d = LazyKt.b(new g(this));
        ReportLevel reportLevel2 = ReportLevel.f144276c;
        this.f144215e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f144211a == jsr305Settings.f144211a && this.f144212b == jsr305Settings.f144212b && Intrinsics.e(this.f144213c, jsr305Settings.f144213c);
    }

    public int hashCode() {
        int iHashCode = this.f144211a.hashCode() * 31;
        ReportLevel reportLevel = this.f144212b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f144213c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f144211a + ", migrationLevel=" + this.f144212b + ", userDefinedLevelForSpecificAnnotation=" + this.f144213c + ')';
    }

    public final ReportLevel c() {
        return this.f144211a;
    }

    public final ReportLevel d() {
        return this.f144212b;
    }

    public final Map<FqName, ReportLevel> e() {
        return this.f144213c;
    }

    public final boolean f() {
        return this.f144215e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(Jsr305Settings jsr305Settings) {
        List listC = CollectionsKt.c();
        listC.add(jsr305Settings.f144211a.b());
        ReportLevel reportLevel = jsr305Settings.f144212b;
        if (reportLevel != null) {
            listC.add("under-migration:" + reportLevel.b());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.f144213c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + entry.getValue().b());
        }
        return (String[]) CollectionsKt.a(listC).toArray(new String[0]);
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? null : reportLevel2, (i10 & 4) != 0 ? MapsKt.k() : map);
    }
}
