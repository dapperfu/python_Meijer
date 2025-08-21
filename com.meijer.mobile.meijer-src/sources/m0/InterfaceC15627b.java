package m0;

import i0.C14592e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lm0/b;", "", "LH1/d;", "", "availableSize", "spacing", "", "a", "(LH1/d;II)Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15627b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm0/b$a;", "Lm0/b;", "", "count", "<init>", "(I)V", "LH1/d;", "availableSize", "spacing", "", "a", "(LH1/d;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: m0.b$a */
    public static final class a implements InterfaceC15627b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int count;

        @Override // m0.InterfaceC15627b
        public List<Integer> a(H1.d dVar, int i10, int i11) {
            return C15632g.c(i10, this.count, i11);
        }

        public boolean equals(Object other) {
            return (other instanceof a) && this.count == ((a) other).count;
        }

        public int hashCode() {
            return -this.count;
        }

        public a(int i10) {
            boolean z10;
            this.count = i10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C14592e.a("Provided count should be larger than zero");
            }
        }
    }

    List<Integer> a(H1.d dVar, int i10, int i11);
}
