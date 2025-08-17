package Dv;

import Hv.AbstractC3687b;
import Hv.C3689c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "T", "LHv/b;", "LGv/c;", "decoder", "", "klassName", "LDv/a;", "a", "(LHv/b;LGv/c;Ljava/lang/String;)LDv/a;", "LGv/f;", "encoder", "value", "LDv/h;", "b", "(LHv/b;LGv/f;Ljava/lang/Object;)LDv/h;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {
    public static final <T> a<T> a(AbstractC3687b<T> abstractC3687b, Gv.c decoder, String str) {
        Intrinsics.j(abstractC3687b, "<this>");
        Intrinsics.j(decoder, "decoder");
        a<T> aVarH = abstractC3687b.h(decoder, str);
        if (aVarH != null) {
            return aVarH;
        }
        C3689c.a(str, abstractC3687b.j());
        throw new KotlinNothingValueException();
    }

    public static final <T> h<T> b(AbstractC3687b<T> abstractC3687b, Gv.f encoder, T value) {
        Intrinsics.j(abstractC3687b, "<this>");
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        h<T> hVarI = abstractC3687b.i(encoder, value);
        if (hVarI != null) {
            return hVarI;
        }
        C3689c.b(Reflection.b(value.getClass()), abstractC3687b.j());
        throw new KotlinNothingValueException();
    }
}
