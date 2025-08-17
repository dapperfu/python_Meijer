package Hv;

import Gv.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b$\u0010#R\u0014\u0010'\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010&\u0082\u0001\u0001(¨\u0006)"}, d2 = {"LHv/N;", "Key", "Value", "Collection", "", "Builder", "LHv/a;", "", "LDv/b;", "keySerializer", "valueSerializer", "<init>", "(LDv/b;LDv/b;)V", "LGv/c;", "decoder", "builder", "", "startIndex", "size", "", "t", "(LGv/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "u", "(LGv/c;ILjava/util/Map;Z)V", "LGv/f;", "encoder", "value", "b", "(LGv/f;Ljava/lang/Object;)V", "a", "LDv/b;", "r", "()LDv/b;", "s", "LFv/f;", "()LFv/f;", "descriptor", "LHv/H;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class N<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC3685a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dv.b<Key> keySerializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Dv.b<Value> valueSerializer;

    public /* synthetic */ N(Dv.b bVar, Dv.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public abstract Fv.f getDescriptor();

    private N(Dv.b<Key> bVar, Dv.b<Value> bVar2) {
        super(null);
        this.keySerializer = bVar;
        this.valueSerializer = bVar2;
    }

    @Override // Dv.h
    public void b(Gv.f encoder, Collection value) {
        Intrinsics.j(encoder, "encoder");
        int iJ = j(value);
        Fv.f descriptor = getDescriptor();
        Gv.d dVarX = encoder.x(descriptor, iJ);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itI = i(value);
        int i10 = 0;
        while (itI.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itI.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i11 = i10 + 1;
            dVarX.z(getDescriptor(), i10, r(), key);
            i10 += 2;
            dVarX.z(getDescriptor(), i11, s(), value2);
        }
        dVarX.a(descriptor);
    }

    public final Dv.b<Key> r() {
        return this.keySerializer;
    }

    public final Dv.b<Value> s() {
        return this.valueSerializer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(Gv.c decoder, Builder builder, int startIndex, int size) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgressionW = RangesKt.w(RangesKt.x(0, size * 2), 2);
        int first = intProgressionW.getFirst();
        int last = intProgressionW.getLast();
        int step = intProgressionW.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            m(decoder, startIndex + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(Gv.c decoder, int index, Builder builder, boolean checkIndex) {
        int iV;
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        Object objC = c.a.c(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            iV = decoder.v(getDescriptor());
            if (iV != index + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + iV).toString());
            }
        } else {
            iV = index + 1;
        }
        int i10 = iV;
        builder.put(objC, (!builder.containsKey(objC) || (this.valueSerializer.getDescriptor().getKind() instanceof Fv.e)) ? c.a.c(decoder, getDescriptor(), i10, this.valueSerializer, null, 8, null) : decoder.m(getDescriptor(), i10, this.valueSerializer, MapsKt.l(builder, objC)));
    }
}
