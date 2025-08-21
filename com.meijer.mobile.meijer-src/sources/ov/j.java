package ov;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "Lov/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lov/g;", "a", "(ILov/a;Lkotlin/jvm/functions/Function1;)Lov/g;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {
    public static final <E> g<E> a(int i10, EnumC16325a enumC16325a, Function1<? super E, Unit> function1) {
        if (i10 == -2) {
            return enumC16325a == EnumC16325a.f155824a ? new e(g.INSTANCE.a(), function1) : new q(1, enumC16325a, function1);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? enumC16325a == EnumC16325a.f155824a ? new e(i10, function1) : new q(i10, enumC16325a, function1) : new e(a.e.API_PRIORITY_OTHER, function1) : enumC16325a == EnumC16325a.f155824a ? new e(0, function1) : new q(1, enumC16325a, function1);
        }
        if (enumC16325a == EnumC16325a.f155824a) {
            return new q(1, EnumC16325a.f155825b, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ g b(int i10, EnumC16325a enumC16325a, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC16325a = EnumC16325a.f155824a;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, enumC16325a, function1);
    }
}
