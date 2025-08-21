package F5;

import F5.b;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LF5/c;", "", "<init>", "()V", "LF5/c$a;", "b", "LF5/c$a;", "a", "()LF5/c$a;", "font", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9060a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final a font = new a(new b.c(12, 14, 16, 18, 20), AbstractC18269l.INSTANCE.d());

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LF5/c$a;", "", "LF5/b$c;", "size", "Ly1/l;", "family", "<init>", "(LF5/b$c;Ly1/l;)V", "a", "LF5/b$c;", "b", "()LF5/b$c;", "Ly1/l;", "()Ly1/l;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b.c size;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC18269l family;

        public a(b.c size, AbstractC18269l family) {
            Intrinsics.j(size, "size");
            Intrinsics.j(family, "family");
            this.size = size;
            this.family = family;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC18269l getFamily() {
            return this.family;
        }

        /* renamed from: b, reason: from getter */
        public final b.c getSize() {
            return this.size;
        }
    }

    public final a a() {
        return font;
    }

    private c() {
    }
}
