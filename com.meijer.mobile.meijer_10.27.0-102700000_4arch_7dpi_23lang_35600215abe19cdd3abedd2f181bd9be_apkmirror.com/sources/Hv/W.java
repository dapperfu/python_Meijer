package Hv;

import Fv.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"LHv/W;", "", "T", "LDv/b;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "LGv/f;", "encoder", "value", "", "b", "(LGv/f;Ljava/lang/Object;)V", "LGv/e;", "decoder", "d", "(LGv/e;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "", "", "Ljava/util/List;", "_annotations", "LFv/f;", "c", "Lkotlin/Lazy;", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class W<T> implements Dv.b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T objectInstance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    public W(final String serialName, T objectInstance) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = CollectionsKt.m();
        this.descriptor = LazyKt.a(LazyThreadSafetyMode.f142380b, new Function0() { // from class: Hv.U
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return W.h(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f h(String str, final W w10) {
        return Fv.l.c(str, n.d.f11136a, new Fv.f[0], new Function1() { // from class: Hv.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return W.i(this.f13305a, (Fv.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(W w10, Fv.a buildSerialDescriptor) {
        Intrinsics.j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(w10._annotations);
        return Unit.f142422a;
    }

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return (Fv.f) this.descriptor.getValue();
    }

    @Override // Dv.h
    public void b(Gv.f encoder, T value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        encoder.c(getDescriptor()).a(getDescriptor());
    }

    @Override // Dv.a
    public T d(Gv.e decoder) {
        int iV;
        Intrinsics.j(decoder, "decoder");
        Fv.f descriptor = getDescriptor();
        Gv.c cVarC = decoder.c(descriptor);
        if (cVarC.n() || (iV = cVarC.v(getDescriptor())) == -1) {
            Unit unit = Unit.f142422a;
            cVarC.a(descriptor);
            return this.objectInstance;
        }
        throw new SerializationException("Unexpected index " + iV);
    }
}
