package Jk;

import Ik.Validation;
import Ik.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJk/f;", "T", "LJk/k;", "Lkotlin/reflect/KProperty0;", "LIk/b;", "field", "<init>", "(Lkotlin/reflect/KProperty0;)V", "", "LIk/c;", "d", "()Ljava/util/List;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f<T> extends k<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(KProperty0<Validation<T>> field) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
    }

    @Override // Jk.k
    public List<Ik.c> d() {
        return CollectionsKt.e(new c.Pending(getFieldName()));
    }
}
