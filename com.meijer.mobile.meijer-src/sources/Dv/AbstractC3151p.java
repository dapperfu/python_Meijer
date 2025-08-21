package Dv;

import Cv.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\"\u0082\u0001\u0002$%¨\u0006&"}, d2 = {"LDv/p;", "Element", "Collection", "Builder", "LDv/a;", "Lzv/b;", "elementSerializer", "<init>", "(Lzv/b;)V", "", "index", "element", "", "s", "(Ljava/lang/Object;ILjava/lang/Object;)V", "LCv/f;", "encoder", "value", "b", "(LCv/f;Ljava/lang/Object;)V", "LCv/c;", "decoder", "builder", "startIndex", "size", "l", "(LCv/c;Ljava/lang/Object;II)V", "", "checkIndex", "m", "(LCv/c;ILjava/lang/Object;Z)V", "a", "Lzv/b;", "LBv/f;", "()LBv/f;", "descriptor", "LDv/q;", "LDv/j0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: Dv.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3151p<Element, Collection, Builder> extends AbstractC3127a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zv.b<Element> elementSerializer;

    public /* synthetic */ AbstractC3151p(zv.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    public abstract Bv.f a();

    protected abstract void s(Builder builder, int i10, Element element);

    private AbstractC3151p(zv.b<Element> bVar) {
        super(null);
        this.elementSerializer = bVar;
    }

    @Override // zv.h
    public void b(Cv.f encoder, Collection value) {
        Intrinsics.j(encoder, "encoder");
        int iJ = j(value);
        Bv.f fVarA = a();
        Cv.d dVarH = encoder.h(fVarA, iJ);
        Iterator<Element> itI = i(value);
        for (int i10 = 0; i10 < iJ; i10++) {
            dVarH.l(a(), i10, this.elementSerializer, itI.next());
        }
        dVarH.a(fVarA);
    }

    @Override // Dv.AbstractC3127a
    protected final void l(Cv.c decoder, Builder builder, int startIndex, int size) {
        Intrinsics.j(decoder, "decoder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i10 = 0; i10 < size; i10++) {
            m(decoder, startIndex + i10, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Dv.AbstractC3127a
    protected void m(Cv.c decoder, int index, Builder builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        s(builder, index, c.a.c(decoder, a(), index, this.elementSerializer, null, 8, null));
    }
}
