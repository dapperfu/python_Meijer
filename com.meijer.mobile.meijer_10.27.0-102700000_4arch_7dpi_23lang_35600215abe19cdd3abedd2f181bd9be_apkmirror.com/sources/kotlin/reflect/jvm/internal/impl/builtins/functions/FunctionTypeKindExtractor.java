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
/* loaded from: classes13.dex */
public final class FunctionTypeKindExtractor {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f143482c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final FunctionTypeKindExtractor f143483d = new FunctionTypeKindExtractor(CollectionsKt.p(FunctionTypeKind.Function.f143478f, FunctionTypeKind.SuspendFunction.f143481f, FunctionTypeKind.KFunction.f143479f, FunctionTypeKind.KSuspendFunction.f143480f));

    /* renamed from: a, reason: collision with root package name */
    private final List<FunctionTypeKind> f143484a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<FqName, List<FunctionTypeKind>> f143485b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FunctionTypeKindExtractor a() {
            return FunctionTypeKindExtractor.f143483d;
        }
    }

    public static final class KindWithArity {

        /* renamed from: a, reason: collision with root package name */
        private final FunctionTypeKind f143486a;

        /* renamed from: b, reason: collision with root package name */
        private final int f143487b;

        public final FunctionTypeKind a() {
            return this.f143486a;
        }

        public final int b() {
            return this.f143487b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.e(this.f143486a, kindWithArity.f143486a) && this.f143487b == kindWithArity.f143487b;
        }

        public int hashCode() {
            return (this.f143486a.hashCode() * 31) + Integer.hashCode(this.f143487b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f143486a + ", arity=" + this.f143487b + ')';
        }

        public KindWithArity(FunctionTypeKind kind, int i10) {
            Intrinsics.j(kind, "kind");
            this.f143486a = kind;
            this.f143487b = i10;
        }

        public final FunctionTypeKind c() {
            return this.f143486a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(List<? extends FunctionTypeKind> kinds) {
        Intrinsics.j(kinds, "kinds");
        this.f143484a = kinds;
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
        this.f143485b = linkedHashMap;
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
        List<FunctionTypeKind> list = this.f143485b.get(packageFqName);
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
