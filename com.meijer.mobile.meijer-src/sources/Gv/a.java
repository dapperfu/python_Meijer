package Gv;

import Ev.AbstractC3260b;
import Fv.F;
import gw.InterfaceC14418g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "LEv/b;", "Lzv/a;", "deserializer", "Lgw/g;", "source", "a", "(LEv/b;Lzv/a;Lgw/g;)Ljava/lang/Object;", "kotlinx-serialization-json-okio"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    public static final <T> T a(AbstractC3260b abstractC3260b, InterfaceC18555a<? extends T> deserializer, InterfaceC14418g source) {
        Intrinsics.j(abstractC3260b, "<this>");
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(source, "source");
        return (T) F.a(abstractC3260b, deserializer, new Hv.a(source));
    }
}
