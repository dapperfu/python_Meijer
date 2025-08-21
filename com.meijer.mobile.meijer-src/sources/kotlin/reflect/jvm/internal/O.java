package kotlin.reflect.jvm.internal;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes14.dex */
class O implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f144036a;

    public O(Function2 function2) {
        this.f144036a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return KDeclarationContainerImpl.D(this.f144036a, obj, obj2);
    }
}
