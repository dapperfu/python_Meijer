package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    private static final a f145055c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, AnnotationQualifierApplicabilityType> f145056d;

    /* renamed from: a, reason: collision with root package name */
    private final JavaTypeEnhancementState f145057a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Object, TAnnotation> f145058b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        Intrinsics.j(extractNullability, "$this$extractNullability");
        return false;
    }

    protected abstract Iterable<String> c(TAnnotation tannotation, boolean z10);

    protected abstract FqName k(TAnnotation tannotation);

    protected abstract Object l(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> m(TAnnotation tannotation);

    public abstract boolean o();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String strB = annotationQualifierApplicabilityType.b();
            if (linkedHashMap.get(strB) == null) {
                linkedHashMap.put(strB, annotationQualifierApplicabilityType);
            }
        }
        f145056d = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.j(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f145057a = javaTypeEnhancementState;
        this.f145058b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<AnnotationQualifierApplicabilityType> b(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.f145062e) ? SetsKt.l(SetsKt.k(ArraysKt.t1(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.f145063f), set) : set;
    }

    private final ReportLevel t(TAnnotation tannotation) {
        Iterable<String> iterableC;
        String str;
        ReportLevel reportLevel = this.f145057a.d().e().get(k(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationJ = j(tannotation, JvmAnnotationNamesKt.p());
        if (tannotationJ == null || (iterableC = c(tannotationJ, false)) == null || (str = (String) CollectionsKt.t0(iterableC)) == null) {
            return null;
        }
        ReportLevel reportLevelD = this.f145057a.d().d();
        if (reportLevelD != null) {
            return reportLevelD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.f145184d;
                }
            } else if (str.equals("STRICT")) {
                return ReportLevel.f145185e;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.f145183c;
        }
        return null;
    }

    private final JavaDefaultQualifiers u(TAnnotation tannotation) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        if (this.f145057a.b() || (javaDefaultQualifiers = JavaDefaultQualifiersKt.a().get(k(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelR = r(tannotation);
        if (reportLevelR == ReportLevel.f145183c) {
            reportLevelR = null;
        }
        if (reportLevelR == null) {
            return null;
        }
        return JavaDefaultQualifiers.b(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.b(javaDefaultQualifiers.d(), null, reportLevelR.l(), 1, null), null, false, 6, null);
    }

    private final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> w(TAnnotation tannotation) {
        TAnnotation tannotationJ;
        TAnnotation next;
        if (this.f145057a.d().f() || (tannotationJ = j(tannotation, JvmAnnotationNamesKt.g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = m(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable<String> iterableC = c(tannotationJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableC.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f145056d.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(next, b(linkedHashSet));
    }

    public final JavaTypeQualifiersByElementType d(JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMapB;
        Intrinsics.j(annotations, "annotations");
        if (!this.f145057a.b()) {
            ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = annotations.iterator();
            while (it.hasNext()) {
                JavaDefaultQualifiers javaDefaultQualifiersE = e(it.next());
                if (javaDefaultQualifiersE != null) {
                    arrayList.add(javaDefaultQualifiersE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (JavaDefaultQualifiers javaDefaultQualifiers : arrayList) {
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : javaDefaultQualifiers.e()) {
                        if (enumMap.containsKey(annotationQualifierApplicabilityType) && o()) {
                            JavaDefaultQualifiers javaDefaultQualifiers2 = (JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType);
                            if (javaDefaultQualifiers2 != null) {
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD = javaDefaultQualifiers2.d();
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD2 = javaDefaultQualifiers.d();
                                if (!Intrinsics.e(nullabilityQualifierWithMigrationStatusD2, nullabilityQualifierWithMigrationStatusD) && (!nullabilityQualifierWithMigrationStatusD2.d() || nullabilityQualifierWithMigrationStatusD.d())) {
                                    javaDefaultQualifiers2 = (nullabilityQualifierWithMigrationStatusD2.d() || !nullabilityQualifierWithMigrationStatusD.d()) ? null : javaDefaultQualifiers;
                                }
                                enumMap.put((EnumMap) annotationQualifierApplicabilityType, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers2);
                            }
                        } else {
                            enumMap.put((EnumMap) annotationQualifierApplicabilityType, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers);
                        }
                    }
                }
                EnumMap enumMap2 = (javaTypeQualifiersByElementType == null || (enumMapB = javaTypeQualifiersByElementType.b()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapB);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = (AnnotationQualifierApplicabilityType) entry.getKey();
                    JavaDefaultQualifiers javaDefaultQualifiers3 = (JavaDefaultQualifiers) entry.getValue();
                    if (javaDefaultQualifiers3 != null) {
                        enumMap2.put((EnumMap) annotationQualifierApplicabilityType2, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new JavaTypeQualifiersByElementType(enumMap2);
                }
            }
        }
        return javaTypeQualifiersByElementType;
    }

    public final MutabilityQualifier g(Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.j(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqNameK = k(it.next());
            if (CollectionsKt.h0(JvmAnnotationNamesKt.o(), fqNameK)) {
                mutabilityQualifier = MutabilityQualifier.f145552a;
            } else if (CollectionsKt.h0(JvmAnnotationNamesKt.l(), fqNameK)) {
                mutabilityQualifier = MutabilityQualifier.f145553b;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    public final NullabilityQualifierWithMigrationStatus h(Iterable<? extends TAnnotation> annotations, Function1<? super TAnnotation, Boolean> forceWarning) {
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (it.hasNext()) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusI = i(it.next(), forceWarning);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (nullabilityQualifierWithMigrationStatusI != null && !Intrinsics.e(nullabilityQualifierWithMigrationStatusI, nullabilityQualifierWithMigrationStatus) && (!nullabilityQualifierWithMigrationStatusI.d() || nullabilityQualifierWithMigrationStatus.d())) {
                    if (nullabilityQualifierWithMigrationStatusI.d() || !nullabilityQualifierWithMigrationStatus.d()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusI;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    public final boolean p(TAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        TAnnotation tannotationJ = j(annotation, StandardNames.FqNames.f144241H);
        if (tannotationJ == null) {
            return false;
        }
        Iterable<String> iterableC = c(tannotationJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation v(TAnnotation annotation) {
        TAnnotation tannotationV;
        Intrinsics.j(annotation, "annotation");
        if (this.f145057a.d().f()) {
            return null;
        }
        if (CollectionsKt.h0(JvmAnnotationNamesKt.a(), k(annotation)) || n(annotation, JvmAnnotationNamesKt.f())) {
            return annotation;
        }
        if (!n(annotation, JvmAnnotationNamesKt.h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f145058b;
        Object objL = l(annotation);
        TAnnotation tannotation = concurrentHashMap.get(objL);
        if (tannotation != null) {
            return tannotation;
        }
        Iterator<TAnnotation> it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationV = null;
                break;
            }
            tannotationV = v(it.next());
            if (tannotationV != null) {
                break;
            }
        }
        if (tannotationV == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objL, tannotationV);
        return tannotationPutIfAbsent == null ? tannotationV : tannotationPutIfAbsent;
    }

    private final JavaDefaultQualifiers e(TAnnotation tannotation) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusI;
        JavaDefaultQualifiers javaDefaultQualifiersU = u(tannotation);
        if (javaDefaultQualifiersU != null) {
            return javaDefaultQualifiersU;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> pairW = w(tannotation);
        if (pairW == null) {
            return null;
        }
        TAnnotation tannotationA = pairW.a();
        Set<AnnotationQualifierApplicabilityType> setB = pairW.b();
        ReportLevel reportLevelT = t(tannotation);
        if (reportLevelT == null) {
            reportLevelT = s(tannotationA);
        }
        if (reportLevelT.e() || (nullabilityQualifierWithMigrationStatusI = i(tannotationA, kotlin.reflect.jvm.internal.impl.load.java.a.f145222a)) == null) {
            return null;
        }
        return new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.b(nullabilityQualifierWithMigrationStatusI, null, reportLevelT.l(), 1, null), setB, false, 4, null);
    }

    private final NullabilityQualifierWithMigrationStatus i(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusQ;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusQ2 = q(tannotation, function1.invoke(tannotation).booleanValue());
        if (nullabilityQualifierWithMigrationStatusQ2 != null) {
            return nullabilityQualifierWithMigrationStatusQ2;
        }
        TAnnotation tannotationV = v(tannotation);
        if (tannotationV == null) {
            return null;
        }
        ReportLevel reportLevelS = s(tannotation);
        if (reportLevelS.e() || (nullabilityQualifierWithMigrationStatusQ = q(tannotationV, function1.invoke(tannotationV).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.b(nullabilityQualifierWithMigrationStatusQ, null, reportLevelS.l(), 1, null);
    }

    private final TAnnotation j(TAnnotation tannotation, FqName fqName) {
        for (TAnnotation tannotation2 : m(tannotation)) {
            if (Intrinsics.e(k(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean n(TAnnotation tannotation, FqName fqName) {
        Iterable<TAnnotation> iterableM = m(tannotation);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableM.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(k(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145559b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r2 = r5.f145057a
            kotlin.jvm.functions.Function1 r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.e()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145560c
            goto L8d
        L29:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145559b
            goto L8d
        L36:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145558a
            goto L8d
        L43:
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.t0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145558a
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145559b
            goto L8d
        L8b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f145560c
        L8d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            boolean r1 = r2.l()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.q(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    private final ReportLevel r(TAnnotation tannotation) {
        FqName fqNameK = k(tannotation);
        if (fqNameK != null && JavaDefaultQualifiersKt.b().containsKey(fqNameK)) {
            return this.f145057a.c().invoke(fqNameK);
        }
        return s(tannotation);
    }

    private final ReportLevel s(TAnnotation tannotation) {
        ReportLevel reportLevelT = t(tannotation);
        if (reportLevelT != null) {
            return reportLevelT;
        }
        return this.f145057a.d().c();
    }
}
