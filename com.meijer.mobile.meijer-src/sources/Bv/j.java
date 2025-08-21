package Bv;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"LBv/f;", "", "a", "(LBv/f;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(LBv/f;)V", "elementDescriptors", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Bv/j$a", "", "LBv/f;", "", "hasNext", "()Z", "a", "()LBv/f;", "", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Iterator<f>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int elementsLeft;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f3724b;

        a(f fVar) {
            this.f3724b = fVar;
            this.elementsLeft = fVar.i();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f3724b;
            int i10 = fVar.i();
            int i11 = this.elementsLeft;
            this.elementsLeft = i11 - 1;
            return fVar.l(i10 - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements Iterable<f>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f3725a;

        public b(f fVar) {
            this.f3725a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f3725a);
        }
    }

    public static final Iterable<f> a(f fVar) {
        Intrinsics.j(fVar, "<this>");
        return new b(fVar);
    }
}
