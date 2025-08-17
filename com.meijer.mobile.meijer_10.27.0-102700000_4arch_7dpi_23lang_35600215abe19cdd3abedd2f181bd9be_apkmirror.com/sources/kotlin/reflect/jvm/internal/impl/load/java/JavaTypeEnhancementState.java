package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class JavaTypeEnhancementState {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f144204d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final JavaTypeEnhancementState f144205e = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.b(null, 1, null), a.f144209b);

    /* renamed from: a, reason: collision with root package name */
    private final Jsr305Settings f144206a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<FqName, ReportLevel> f144207b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144208c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaTypeEnhancementState a() {
            return JavaTypeEnhancementState.f144205e;
        }
    }

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<FqName, ReportLevel> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f144209b = new a();

        a() {
            super(1, JavaNullabilityAnnotationSettingsKt.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportLevel invoke(FqName p02) {
            Intrinsics.j(p02, "p0");
            return JavaNullabilityAnnotationSettingsKt.d(p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(Jsr305Settings jsr305, Function1<? super FqName, ? extends ReportLevel> getReportLevelForAnnotation) {
        Intrinsics.j(jsr305, "jsr305");
        Intrinsics.j(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f144206a = jsr305;
        this.f144207b = getReportLevelForAnnotation;
        this.f144208c = jsr305.f() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.e()) == ReportLevel.f144276c;
    }

    public final boolean b() {
        return this.f144208c;
    }

    public final Function1<FqName, ReportLevel> c() {
        return this.f144207b;
    }

    public final Jsr305Settings d() {
        return this.f144206a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f144206a + ", getReportLevelForAnnotation=" + this.f144207b + ')';
    }
}
