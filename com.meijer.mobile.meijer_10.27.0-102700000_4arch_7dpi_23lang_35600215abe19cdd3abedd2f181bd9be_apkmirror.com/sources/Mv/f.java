package Mv;

import Dv.h;
import Mv.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJX\u0010\u0010\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032/\u0010\u000f\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u0001\"\b\b\u0001\u0010\u0013*\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032)\u0010\u001b\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u0011JT\u0010!\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010 \u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\nH&¢\u0006\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"LMv/f;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "LDv/b;", "serializer", "", "b", "(Lkotlin/reflect/KClass;LDv/b;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "d", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;LDv/b;)V", "value", "LDv/h;", "defaultSerializerProvider", "c", "", "className", "LDv/a;", "defaultDeserializerProvider", "a", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface f {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Dv.b c(Dv.b bVar, List it) {
            Intrinsics.j(it, "it");
            return bVar;
        }

        public static <T> void b(f fVar, KClass<T> kClass, final Dv.b<T> serializer) {
            Intrinsics.j(kClass, "kClass");
            Intrinsics.j(serializer, "serializer");
            fVar.e(kClass, new Function1() { // from class: Mv.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.c(serializer, (List) obj);
                }
            });
        }
    }

    <Base> void a(KClass<Base> baseClass, Function1<? super String, ? extends Dv.a<? extends Base>> defaultDeserializerProvider);

    <T> void b(KClass<T> kClass, Dv.b<T> serializer);

    <Base> void c(KClass<Base> baseClass, Function1<? super Base, ? extends h<? super Base>> defaultSerializerProvider);

    <Base, Sub extends Base> void d(KClass<Base> baseClass, KClass<Sub> actualClass, Dv.b<Sub> actualSerializer);

    <T> void e(KClass<T> kClass, Function1<? super List<? extends Dv.b<?>>, ? extends Dv.b<?>> provider);
}
