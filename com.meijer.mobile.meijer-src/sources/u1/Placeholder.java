package u1;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lu1/i;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LH1/v;", "a", "J", "c", "()J", "width", "b", "height", "Lu1/j;", "I", "placeholderVerticalAlign", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u1.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class Placeholder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int placeholderVerticalAlign;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return H1.v.e(this.width, placeholder.width) && H1.v.e(this.height, placeholder.height) && C17345j.i(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: a, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: b, reason: from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: c, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((H1.v.i(this.width) * 31) + H1.v.i(this.height)) * 31) + C17345j.j(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) H1.v.j(this.width)) + ", height=" + ((Object) H1.v.j(this.height)) + ", placeholderVerticalAlign=" + ((Object) C17345j.k(this.placeholderVerticalAlign)) + ')';
    }
}
