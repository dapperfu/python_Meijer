package Dv;

import Hv.AbstractC3687b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J)\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR0\u0010 \u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"LDv/g;", "", "T", "LHv/b;", "LGv/c;", "decoder", "", "klassName", "LDv/a;", "h", "(LGv/c;Ljava/lang/String;)LDv/a;", "LGv/f;", "encoder", "value", "LDv/h;", "i", "(LGv/f;Ljava/lang/Object;)LDv/h;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "j", "()Lkotlin/reflect/KClass;", "baseClass", "LFv/f;", "b", "Lkotlin/Lazy;", "()LFv/f;", "descriptor", "", "LDv/b;", "c", "Ljava/util/Map;", "class2Serializer", "d", "serialName2Serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class g<T> extends AbstractC3687b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KClass<T> baseClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<? extends T>, b<? extends T>> class2Serializer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b<? extends T>> serialName2Serializer;

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return (Fv.f) this.descriptor.getValue();
    }

    @Override // Hv.AbstractC3687b
    public a<T> h(Gv.c decoder, String klassName) {
        Intrinsics.j(decoder, "decoder");
        b<? extends T> bVar = this.serialName2Serializer.get(klassName);
        return bVar != null ? bVar : super.h(decoder, klassName);
    }

    @Override // Hv.AbstractC3687b
    public h<T> i(Gv.f encoder, T value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        b<? extends T> bVarI = this.class2Serializer.get(Reflection.b(value.getClass()));
        if (bVarI == null) {
            bVarI = super.i(encoder, value);
        }
        if (bVarI != null) {
            return bVarI;
        }
        return null;
    }

    @Override // Hv.AbstractC3687b
    public KClass<T> j() {
        return this.baseClass;
    }
}
