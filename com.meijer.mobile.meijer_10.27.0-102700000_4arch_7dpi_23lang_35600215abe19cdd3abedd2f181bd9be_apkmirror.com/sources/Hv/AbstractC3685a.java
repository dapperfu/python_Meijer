package Hv;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\n*\u00028\u0002H$¢\u0006\u0004\b\u0014\u0010\u000eJ\u0013\u0010\u0015\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0019*\u00028\u00022\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J1\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010$\u001a\u00020#H$¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b(\u0010)\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"LHv/a;", "Element", "Collection", "Builder", "LDv/b;", "<init>", "()V", "LGv/c;", "decoder", "builder", "", "o", "(LGv/c;Ljava/lang/Object;)I", "j", "(Ljava/lang/Object;)I", "", "i", "(Ljava/lang/Object;)Ljava/util/Iterator;", "f", "()Ljava/lang/Object;", "g", "q", "(Ljava/lang/Object;)Ljava/lang/Object;", "p", "size", "", "h", "(Ljava/lang/Object;I)V", "LGv/e;", "previous", "k", "(LGv/e;Ljava/lang/Object;)Ljava/lang/Object;", "d", "(LGv/e;)Ljava/lang/Object;", "index", "", "checkIndex", "m", "(LGv/c;ILjava/lang/Object;Z)V", "startIndex", "l", "(LGv/c;Ljava/lang/Object;II)V", "LHv/p;", "LHv/N;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Hv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC3685a<Element, Collection, Builder> implements Dv.b<Collection> {
    public /* synthetic */ AbstractC3685a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Builder f();

    protected abstract int g(Builder builder);

    protected abstract void h(Builder builder, int i10);

    protected abstract Iterator<Element> i(Collection collection);

    protected abstract int j(Collection collection);

    protected abstract void l(Gv.c decoder, Builder builder, int startIndex, int size);

    protected abstract void m(Gv.c decoder, int index, Builder builder, boolean checkIndex);

    protected abstract Builder p(Collection collection);

    protected abstract Collection q(Builder builder);

    private AbstractC3685a() {
    }

    public static /* synthetic */ void n(AbstractC3685a abstractC3685a, Gv.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC3685a.m(cVar, i10, obj, z10);
    }

    @Override // Dv.a
    public Collection d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return k(decoder, null);
    }

    public final Collection k(Gv.e decoder, Collection previous) {
        Builder builderF;
        Intrinsics.j(decoder, "decoder");
        if (previous == null || (builderF = p(previous)) == null) {
            builderF = f();
        }
        Builder builder = builderF;
        int iG = g(builder);
        Gv.c cVarC = decoder.c(a());
        if (!cVarC.n()) {
            while (true) {
                int iV = cVarC.v(a());
                if (iV == -1) {
                    break;
                }
                n(this, cVarC, iG + iV, builder, false, 8, null);
            }
        } else {
            l(cVarC, builder, iG, o(cVarC, builder));
        }
        cVarC.a(a());
        return q(builder);
    }

    private final int o(Gv.c decoder, Builder builder) {
        int iC = decoder.C(a());
        h(builder, iC);
        return iC;
    }
}
