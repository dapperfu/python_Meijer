package Iv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIv/b;", "from", "Lkotlin/Function1;", "LIv/e;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "a", "(LIv/b;Lkotlin/jvm/functions/Function1;)LIv/b;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u {
    public static final AbstractC3761b a(AbstractC3761b from, Function1<? super C3764e, Unit> builderAction) {
        Intrinsics.j(from, "from");
        Intrinsics.j(builderAction, "builderAction");
        C3764e c3764e = new C3764e(from);
        builderAction.invoke(c3764e);
        return new t(c3764e.a(), c3764e.getSerializersModule());
    }

    public static /* synthetic */ AbstractC3761b b(AbstractC3761b abstractC3761b, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC3761b = AbstractC3761b.INSTANCE;
        }
        return a(abstractC3761b, function1);
    }
}
