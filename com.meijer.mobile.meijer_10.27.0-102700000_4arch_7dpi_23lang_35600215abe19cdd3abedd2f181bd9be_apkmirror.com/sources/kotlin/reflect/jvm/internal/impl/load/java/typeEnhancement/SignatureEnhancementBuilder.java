package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes13.dex */
final class SignatureEnhancementBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, PredefinedFunctionEnhancementInfo> f144671a = new LinkedHashMap();

    public final class ClassEnhancementBuilder {

        /* renamed from: a, reason: collision with root package name */
        private final String f144672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SignatureEnhancementBuilder f144673b;

        @SourceDebugExtension
        public final class FunctionEnhancementBuilder {

            /* renamed from: a, reason: collision with root package name */
            private final String f144674a;

            /* renamed from: b, reason: collision with root package name */
            private final String f144675b;

            /* renamed from: c, reason: collision with root package name */
            private final List<Pair<String, TypeEnhancementInfo>> f144676c;

            /* renamed from: d, reason: collision with root package name */
            private Pair<String, TypeEnhancementInfo> f144677d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ClassEnhancementBuilder f144678e;

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String functionName, String str) {
                Intrinsics.j(functionName, "functionName");
                this.f144678e = classEnhancementBuilder;
                this.f144674a = functionName;
                this.f144675b = str;
                this.f144676c = new ArrayList();
                this.f144677d = TuplesKt.a("V", null);
            }

            public final Pair<String, PredefinedFunctionEnhancementInfo> a() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f144829a;
                String strC = this.f144678e.c();
                String str = this.f144674a;
                List<Pair<String, TypeEnhancementInfo>> list = this.f144676c;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String strM = signatureBuildingComponents.m(strC, signatureBuildingComponents.k(str, arrayList, this.f144677d.c()));
                TypeEnhancementInfo typeEnhancementInfoD = this.f144677d.d();
                List<Pair<String, TypeEnhancementInfo>> list2 = this.f144676c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).d());
                }
                return TuplesKt.a(strM, new PredefinedFunctionEnhancementInfo(typeEnhancementInfoD, arrayList2, this.f144675b));
            }

            public final void b(String type, JavaTypeQualifiers... qualifiers) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.j(type, "type");
                Intrinsics.j(qualifiers, "qualifiers");
                List<Pair<String, TypeEnhancementInfo>> list = this.f144676c;
                if (qualifiers.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> iterableV1 = ArraysKt.v1(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(iterableV1, 10)), 16));
                    for (IndexedValue indexedValue : iterableV1) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (JavaTypeQualifiers) indexedValue.d());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(TuplesKt.a(type, typeEnhancementInfo));
            }

            public final void c(String type, JavaTypeQualifiers... qualifiers) {
                Intrinsics.j(type, "type");
                Intrinsics.j(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableV1 = ArraysKt.v1(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(iterableV1, 10)), 16));
                for (IndexedValue indexedValue : iterableV1) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (JavaTypeQualifiers) indexedValue.d());
                }
                this.f144677d = TuplesKt.a(type, new TypeEnhancementInfo(linkedHashMap));
            }

            public final void d(JvmPrimitiveType type) {
                Intrinsics.j(type, "type");
                String strL = type.l();
                Intrinsics.i(strL, "getDesc(...)");
                this.f144677d = TuplesKt.a(strL, null);
            }
        }

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            Intrinsics.j(className, "className");
            this.f144673b = signatureEnhancementBuilder;
            this.f144672a = className;
        }

        public static /* synthetic */ void b(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.a(str, str2, function1);
        }

        public final void a(String name, String str, Function1<? super FunctionEnhancementBuilder, Unit> block) {
            Intrinsics.j(name, "name");
            Intrinsics.j(block, "block");
            Map map = this.f144673b.f144671a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name, str);
            block.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairA = functionEnhancementBuilder.a();
            map.put(pairA.c(), pairA.d());
        }

        public final String c() {
            return this.f144672a;
        }
    }

    public final Map<String, PredefinedFunctionEnhancementInfo> b() {
        return this.f144671a;
    }
}
