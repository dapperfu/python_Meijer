package F1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"LF1/k;", "", "", "mask", "<init>", "(I)V", "other", "", "d", "(LF1/k;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final k f10177c = new k(0);

    /* renamed from: d, reason: collision with root package name */
    private static final k f10178d = new k(1);

    /* renamed from: e, reason: collision with root package name */
    private static final k f10179e = new k(2);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"LF1/k$a;", "", "<init>", "()V", "", "LF1/k;", "decorations", "a", "(Ljava/util/List;)LF1/k;", "None", "LF1/k;", "c", "()LF1/k;", "getNone$annotations", "Underline", "d", "getUnderline$annotations", "LineThrough", "b", "getLineThrough$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: F1.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(List<k> decorations) {
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i10).getMask());
            }
            return new k(numValueOf.intValue());
        }

        private Companion() {
        }

        public final k b() {
            return k.f10179e;
        }

        public final k c() {
            return k.f10177c;
        }

        public final k d() {
            return k.f10178d;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && this.mask == ((k) other).mask;
    }

    public final boolean d(k other) {
        int i10 = this.mask;
        return (other.mask | i10) == i10;
    }

    /* renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & f10178d.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & f10179e.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + J1.a.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public k(int i10) {
        this.mask = i10;
    }
}
