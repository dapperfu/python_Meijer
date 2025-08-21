package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public final class JavaTypeEnhancementState {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f145111d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final JavaTypeEnhancementState f145112e = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.b(null, 1, null), a.f145116b);

    /* renamed from: a, reason: collision with root package name */
    private final Jsr305Settings f145113a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<FqName, ReportLevel> f145114b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145115c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaTypeEnhancementState a() {
            return JavaTypeEnhancementState.f145112e;
        }
    }

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<FqName, ReportLevel> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f145116b = new a();

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
        this.f145113a = jsr305;
        this.f145114b = getReportLevelForAnnotation;
        this.f145115c = jsr305.f() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.e()) == ReportLevel.f145183c;
    }

    public final boolean b() {
        return this.f145115c;
    }

    public final Function1<FqName, ReportLevel> c() {
        return this.f145114b;
    }

    public final Jsr305Settings d() {
        return this.f145113a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f145113a + ", getReportLevelForAnnotation=" + this.f145114b + ')';
    }
}
