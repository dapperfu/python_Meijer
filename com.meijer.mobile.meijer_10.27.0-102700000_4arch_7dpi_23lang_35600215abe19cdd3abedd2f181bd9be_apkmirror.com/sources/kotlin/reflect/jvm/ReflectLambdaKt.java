package kotlin.reflect.jvm;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Lkotlin/Function;", "Lkotlin/reflect/KFunction;", "a", "(Lkotlin/Function;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReflectLambdaKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f142973b = new a();

        a() {
            super(2, MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleFunctionDescriptor invoke(MemberDeserializer p02, ProtoBuf.Function p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            return p02.s(p12);
        }
    }

    @ExperimentalReflectionOnLambdas
    public static final <R> KFunction<R> a(Function<? extends R> function) {
        Intrinsics.j(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> pairJ = JvmProtoBufUtil.j(strArrD1, metadata.d2());
        JvmNameResolver jvmNameResolverA = pairJ.a();
        ProtoBuf.Function functionB = pairJ.b();
        MetadataVersion metadataVersion = new MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = function.getClass();
        ProtoBuf.TypeTable typeTableS0 = functionB.s0();
        Intrinsics.i(typeTableS0, "getTypeTable(...)");
        return new KFunctionImpl(EmptyContainerForLocal.f142991d, (SimpleFunctionDescriptor) UtilKt.h(cls, functionB, jvmNameResolverA, new TypeTable(typeTableS0), metadataVersion, a.f142973b));
    }
}
