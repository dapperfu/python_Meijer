package Mv;

import Dv.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001b¨\u0006\u001c"}, d2 = {"LMv/c;", "", "<init>", "()V", "T", "Lkotlin/reflect/KClass;", "kClass", "", "LDv/b;", "typeArgumentsSerializers", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)LDv/b;", "baseClass", "value", "LDv/h;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)LDv/h;", "", "serializedClassName", "LDv/a;", "d", "(Lkotlin/reflect/KClass;Ljava/lang/String;)LDv/a;", "LMv/f;", "collector", "", "a", "(LMv/f;)V", "LMv/b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(f collector);

    public abstract <T> Dv.b<T> b(KClass<T> kClass, List<? extends Dv.b<?>> typeArgumentsSerializers);

    public abstract <T> Dv.a<T> d(KClass<? super T> baseClass, String serializedClassName);

    public abstract <T> h<T> e(KClass<? super T> baseClass, T value);

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Dv.b c(c cVar, KClass kClass, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.m();
        }
        return cVar.b(kClass, list);
    }
}
