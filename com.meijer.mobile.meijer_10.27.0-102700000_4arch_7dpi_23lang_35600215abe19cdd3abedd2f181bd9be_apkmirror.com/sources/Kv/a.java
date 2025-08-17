package Kv;

import Iv.AbstractC3761b;
import Jv.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "LIv/b;", "LDv/a;", "deserializer", "Lkw/g;", "source", "a", "(LIv/b;LDv/a;Lkw/g;)Ljava/lang/Object;", "kotlinx-serialization-json-okio"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {
    public static final <T> T a(AbstractC3761b abstractC3761b, Dv.a<? extends T> deserializer, InterfaceC15330g source) {
        Intrinsics.j(abstractC3761b, "<this>");
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(source, "source");
        return (T) F.a(abstractC3761b, deserializer, new Lv.a(source));
    }
}
