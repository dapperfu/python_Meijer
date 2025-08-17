package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

@SourceDebugExtension
/* loaded from: classes13.dex */
public class JvmNameResolverBase implements NameResolver {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f145657d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f145658e;

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f145659f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f145660g;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f145661a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f145662b;

    /* renamed from: c, reason: collision with root package name */
    private final List<JvmProtoBuf.StringTableTypes.Record> f145663c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strB0 = CollectionsKt.B0(CollectionsKt.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f145658e = strB0;
        List<String> listP = CollectionsKt.p(strB0 + "/Any", strB0 + "/Nothing", strB0 + "/Unit", strB0 + "/Throwable", strB0 + "/Number", strB0 + "/Byte", strB0 + "/Double", strB0 + "/Float", strB0 + "/Int", strB0 + "/Long", strB0 + "/Short", strB0 + "/Boolean", strB0 + "/Char", strB0 + "/CharSequence", strB0 + "/String", strB0 + "/Comparable", strB0 + "/Enum", strB0 + "/Array", strB0 + "/ByteArray", strB0 + "/DoubleArray", strB0 + "/FloatArray", strB0 + "/IntArray", strB0 + "/LongArray", strB0 + "/ShortArray", strB0 + "/BooleanArray", strB0 + "/CharArray", strB0 + "/Cloneable", strB0 + "/Annotation", strB0 + "/collections/Iterable", strB0 + "/collections/MutableIterable", strB0 + "/collections/Collection", strB0 + "/collections/MutableCollection", strB0 + "/collections/List", strB0 + "/collections/MutableList", strB0 + "/collections/Set", strB0 + "/collections/MutableSet", strB0 + "/collections/Map", strB0 + "/collections/MutableMap", strB0 + "/collections/Map.Entry", strB0 + "/collections/MutableMap.MutableEntry", strB0 + "/collections/Iterator", strB0 + "/collections/MutableIterator", strB0 + "/collections/ListIterator", strB0 + "/collections/MutableListIterator");
        f145659f = listP;
        Iterable<IndexedValue> iterableS1 = CollectionsKt.s1(listP);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(iterableS1, 10)), 16));
        for (IndexedValue indexedValue : iterableS1) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f145660g = linkedHashMap;
    }

    public JvmNameResolverBase(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.j(strings, "strings");
        Intrinsics.j(localNameIndices, "localNameIndices");
        Intrinsics.j(records, "records");
        this.f145661a = strings;
        this.f145662b = localNameIndices;
        this.f145663c = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean a(int i10) {
        return this.f145662b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.getString(int):java.lang.String");
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String b(int i10) {
        return getString(i10);
    }
}
