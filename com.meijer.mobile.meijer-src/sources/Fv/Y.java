package Fv;

import Ev.AbstractC3260b;
import Ev.C3261c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "LEv/b;", "json", "LEv/i;", "element", "Lzv/a;", "deserializer", "a", "(LEv/b;LEv/i;Lzv/a;)Ljava/lang/Object;", "", "discriminator", "LEv/C;", "b", "(LEv/b;Ljava/lang/String;LEv/C;Lzv/a;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Y {
    public static final <T> T a(AbstractC3260b json, Ev.i element, InterfaceC18555a<? extends T> deserializer) {
        Cv.e e10;
        Intrinsics.j(json, "json");
        Intrinsics.j(element, "element");
        Intrinsics.j(deserializer, "deserializer");
        if (element instanceof Ev.C) {
            e10 = new H(json, (Ev.C) element, null, null, 12, null);
        } else if (element instanceof C3261c) {
            e10 = new I(json, (C3261c) element);
        } else {
            if (!(element instanceof Ev.v) && !Intrinsics.e(element, Ev.z.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            e10 = new E(json, (Ev.E) element, null, 4, null);
        }
        return (T) e10.z(deserializer);
    }

    public static final <T> T b(AbstractC3260b abstractC3260b, String discriminator, Ev.C element, InterfaceC18555a<? extends T> deserializer) {
        Intrinsics.j(abstractC3260b, "<this>");
        Intrinsics.j(discriminator, "discriminator");
        Intrinsics.j(element, "element");
        Intrinsics.j(deserializer, "deserializer");
        return (T) new H(abstractC3260b, element, discriminator, deserializer.getDescriptor()).z(deserializer);
    }
}
