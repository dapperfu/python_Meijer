package m5;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import m5.AbstractC15553c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lm5/i;", "", "Lm5/c;", "width", "height", "<init>", "(Lm5/c;Lm5/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm5/c;", "b", "()Lm5/c;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class Size {

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Size f149852d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC15553c width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC15553c height;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Size)) {
            return false;
        }
        Size size = (Size) other;
        return Intrinsics.e(this.width, size.width) && Intrinsics.e(this.height, size.height);
    }

    static {
        AbstractC15553c.b bVar = AbstractC15553c.b.f149837a;
        f149852d = new Size(bVar, bVar);
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC15553c getHeight() {
        return this.height;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC15553c getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(AbstractC15553c abstractC15553c, AbstractC15553c abstractC15553c2) {
        this.width = abstractC15553c;
        this.height = abstractC15553c2;
    }
}
