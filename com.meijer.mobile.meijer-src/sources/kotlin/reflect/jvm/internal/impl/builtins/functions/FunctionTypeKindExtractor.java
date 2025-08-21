package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FunctionTypeKindExtractor {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f144389c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final FunctionTypeKindExtractor f144390d = new FunctionTypeKindExtractor(CollectionsKt.p(FunctionTypeKind.Function.f144385f, FunctionTypeKind.SuspendFunction.f144388f, FunctionTypeKind.KFunction.f144386f, FunctionTypeKind.KSuspendFunction.f144387f));

    /* renamed from: a, reason: collision with root package name */
    private final List<FunctionTypeKind> f144391a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<FqName, List<FunctionTypeKind>> f144392b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FunctionTypeKindExtractor a() {
            return FunctionTypeKindExtractor.f144390d;
        }
    }

    public static final class KindWithArity {

        /* renamed from: a, reason: collision with root package name */
        private final FunctionTypeKind f144393a;

        /* renamed from: b, reason: collision with root package name */
        private final int f144394b;

        public final FunctionTypeKind a() {
            return this.f144393a;
        }

        public final int b() {
            return this.f144394b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.e(this.f144393a, kindWithArity.f144393a) && this.f144394b == kindWithArity.f144394b;
        }

        public int hashCode() {
            return (this.f144393a.hashCode() * 31) + Integer.hashCode(this.f144394b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f144393a + ", arity=" + this.f144394b + ')';
        }

        public KindWithArity(FunctionTypeKind kind, int i10) {
            Intrinsics.j(kind, "kind");
            this.f144393a = kind;
            this.f144394b = i10;
        }

        public final FunctionTypeKind c() {
            return this.f144393a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(List<? extends FunctionTypeKind> kinds) {
        Intrinsics.j(kinds, "kinds");
        this.f144391a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            FqName fqNameB = ((FunctionTypeKind) obj).b();
            Object arrayList = linkedHashMap.get(fqNameB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fqNameB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f144392b = linkedHashMap;
    }

    public final FunctionTypeKind b(FqName packageFqName, String className) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(className, "className");
        KindWithArity kindWithArityC = c(packageFqName, className);
        if (kindWithArityC != null) {
            return kindWithArityC.c();
        }
        return null;
    }

    public final KindWithArity c(FqName packageFqName, String className) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(className, "className");
        List<FunctionTypeKind> list = this.f144392b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (StringsKt.W(className, functionTypeKind.a(), false, 2, null)) {
                String strSubstring = className.substring(functionTypeKind.a().length());
                Intrinsics.i(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new KindWithArity(functionTypeKind, numD.intValue());
                }
            }
        }
        return null;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }
}
