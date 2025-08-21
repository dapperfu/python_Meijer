package kotlin;

import i0.C14592e;
import kotlin.InterfaceC15872e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\tR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006#"}, d2 = {"Ln0/P;", "T", "Ln0/e;", "<init>", "()V", "", "itemIndex", "Ln0/e$a;", "d", "(I)Ln0/e$a;", "index", "", "c", "(Ln0/e$a;I)Z", "size", "value", "", "b", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "a", "(IILkotlin/jvm/functions/Function1;)V", "get", "LD0/c;", "LD0/c;", "intervals", "<set-?>", "I", "getSize", "()I", "Ln0/e$a;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15857P<T> implements InterfaceC15872e<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<InterfaceC15872e.a<T>> intervals = new D0.c<>(new InterfaceC15872e.a[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15872e.a<? extends T> lastInterval;

    private final InterfaceC15872e.a<T> d(int itemIndex) {
        InterfaceC15872e.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && c(aVar, itemIndex)) {
            return aVar;
        }
        D0.c<InterfaceC15872e.a<T>> cVar = this.intervals;
        InterfaceC15872e.a aVar2 = (InterfaceC15872e.a<? extends T>) cVar.content[C15873f.b(cVar, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // kotlin.InterfaceC15872e
    public void a(int fromIndex, int toIndex, Function1<? super InterfaceC15872e.a<? extends T>, Unit> block) {
        if (fromIndex < 0 || fromIndex >= getSize()) {
            C14592e.e("Index " + fromIndex + ", size " + getSize());
        }
        if (toIndex < 0 || toIndex >= getSize()) {
            C14592e.e("Index " + toIndex + ", size " + getSize());
        }
        if (!(toIndex >= fromIndex)) {
            C14592e.a("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')');
        }
        int iB = C15873f.b(this.intervals, fromIndex);
        int startIndex = this.intervals.content[iB].getStartIndex();
        while (startIndex <= toIndex) {
            InterfaceC15872e.a<T> aVar = this.intervals.content[iB];
            block.invoke(aVar);
            startIndex += aVar.getSize();
            iB++;
        }
    }

    public final void b(int size, T value) {
        if (!(size >= 0)) {
            C14592e.a("size should be >=0");
        }
        if (size == 0) {
            return;
        }
        InterfaceC15872e.a<T> aVar = new InterfaceC15872e.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.c(aVar);
    }

    @Override // kotlin.InterfaceC15872e
    public InterfaceC15872e.a<T> get(int index) {
        if (index < 0 || index >= getSize()) {
            C14592e.e("Index " + index + ", size " + getSize());
        }
        return d(index);
    }

    @Override // kotlin.InterfaceC15872e
    public int getSize() {
        return this.size;
    }

    private final boolean c(InterfaceC15872e.a<? extends T> aVar, int i10) {
        int startIndex = aVar.getStartIndex();
        if (i10 >= aVar.getStartIndex() + aVar.getSize() || startIndex > i10) {
            return false;
        }
        return true;
    }
}
