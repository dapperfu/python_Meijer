package kotlin.reflect.jvm.internal.impl.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* renamed from: a, reason: collision with root package name */
    private ArrayMap<T> f147961a;

    protected AttributeArrayOwner(ArrayMap<T> arrayMap) {
        Intrinsics.j(arrayMap, "arrayMap");
        this.f147961a = arrayMap;
    }

    private final String n(ArrayMap<T> arrayMap, int i10, String str) {
        T next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(arrayMap.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map<String, Integer> mapB = f().b();
        sb4.append("[");
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(CollectionsKt.x(arrayMap, 10));
        int i11 = 0;
        for (T t10 : arrayMap) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            Iterator<T> it = mapB.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + t10);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final ArrayMap<T> a() {
        return this.f147961a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final void h(String keyQualifiedName, T value) {
        Intrinsics.j(keyQualifiedName, "keyQualifiedName");
        Intrinsics.j(value, "value");
        int iE = f().e(keyQualifiedName);
        int iA = this.f147961a.a();
        if (iA == 0) {
            ArrayMap<T> arrayMap = this.f147961a;
            if (!(arrayMap instanceof EmptyArrayMap)) {
                throw new IllegalStateException(n(arrayMap, 0, "EmptyArrayMap"));
            }
            this.f147961a = new OneElementArrayMap(value, iE);
            return;
        }
        if (iA == 1) {
            ArrayMap<T> arrayMap2 = this.f147961a;
            try {
                Intrinsics.h(arrayMap2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.h() == iE) {
                    this.f147961a = new OneElementArrayMap(value, iE);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    arrayMapImpl.f(oneElementArrayMap.h(), oneElementArrayMap.k());
                    this.f147961a = arrayMapImpl;
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(n(arrayMap2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.f147961a.f(iE, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.f147974a;
        Intrinsics.h(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(emptyArrayMap);
    }
}
