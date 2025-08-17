package Jv;

import Iv.AbstractC3761b;
import Iv.C3762c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "LIv/b;", "json", "LIv/i;", "element", "LDv/a;", "deserializer", "a", "(LIv/b;LIv/i;LDv/a;)Ljava/lang/Object;", "", "discriminator", "LIv/C;", "b", "(LIv/b;Ljava/lang/String;LIv/C;LDv/a;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Y {
    public static final <T> T a(AbstractC3761b json, Iv.i element, Dv.a<? extends T> deserializer) {
        Gv.e e10;
        Intrinsics.j(json, "json");
        Intrinsics.j(element, "element");
        Intrinsics.j(deserializer, "deserializer");
        if (element instanceof Iv.C) {
            e10 = new H(json, (Iv.C) element, null, null, 12, null);
        } else if (element instanceof C3762c) {
            e10 = new I(json, (C3762c) element);
        } else {
            if (!(element instanceof Iv.v) && !Intrinsics.e(element, Iv.z.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            e10 = new E(json, (Iv.E) element, null, 4, null);
        }
        return (T) e10.G(deserializer);
    }

    public static final <T> T b(AbstractC3761b abstractC3761b, String discriminator, Iv.C element, Dv.a<? extends T> deserializer) {
        Intrinsics.j(abstractC3761b, "<this>");
        Intrinsics.j(discriminator, "discriminator");
        Intrinsics.j(element, "element");
        Intrinsics.j(deserializer, "deserializer");
        return (T) new H(abstractC3761b, element, discriminator, deserializer.getDescriptor()).G(deserializer);
    }
}
