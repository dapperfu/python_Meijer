package kotlin;

import i0.C14589e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Ln0/e;", "T", "", "", "index", "Ln0/e$a;", "get", "(I)Ln0/e$a;", "fromIndex", "toIndex", "Lkotlin/Function1;", "", "block", "a", "(IILkotlin/jvm/functions/Function1;)V", "getSize", "()I", "size", "Ln0/P;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15745e<T> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln0/e$a;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "a", "I", "b", "()I", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: n0.e$a */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final T value;

        /* renamed from: a, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: b, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T c() {
            return this.value;
        }

        public a(int i10, int i11, T t10) {
            boolean z10;
            this.startIndex = i10;
            this.size = i11;
            this.value = t10;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C14589e.a("startIndex should be >= 0");
            }
            if (!(i11 > 0)) {
                C14589e.a("size should be > 0");
            }
        }
    }

    void a(int fromIndex, int toIndex, Function1<? super a<? extends T>, Unit> block);

    a<T> get(int index);

    int getSize();
}
