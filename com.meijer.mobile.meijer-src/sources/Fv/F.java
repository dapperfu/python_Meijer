package Fv;

import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "LEv/b;", "json", "LFv/x;", "writer", "Lzv/h;", "serializer", "value", "", "b", "(LEv/b;LFv/x;Lzv/h;Ljava/lang/Object;)V", "Lzv/a;", "deserializer", "LFv/v;", "reader", "a", "(LEv/b;Lzv/a;LFv/v;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F {
    public static final <T> T a(AbstractC3260b json, InterfaceC18555a<? extends T> deserializer, InterfaceC3611v reader) {
        Intrinsics.j(json, "json");
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(reader, "reader");
        N nB = O.b(json, reader, null, 4, null);
        try {
            T t10 = (T) new Q(json, Z.f11024c, nB, deserializer.getDescriptor(), null).z(deserializer);
            nB.v();
            return t10;
        } finally {
            nB.V();
        }
    }

    public static final <T> void b(AbstractC3260b json, InterfaceC3613x writer, zv.h<? super T> serializer, T t10) {
        Intrinsics.j(json, "json");
        Intrinsics.j(writer, "writer");
        Intrinsics.j(serializer, "serializer");
        new S(writer, json, Z.f11024c, new Ev.s[Z.b().size()]).D(serializer, t10);
    }
}
