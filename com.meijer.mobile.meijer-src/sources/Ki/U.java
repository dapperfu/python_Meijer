package Ki;

import ji.C15041b;
import kotlin.AbstractC18269l;
import kotlin.C18270m;
import kotlin.C18274q;
import kotlin.C18280w;
import kotlin.FontWeight;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"LKi/U;", "", "a", "LKi/W;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f17425a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000e"}, d2 = {"LKi/U$a;", "", "<init>", "()V", "Ly1/l;", "b", "Ly1/l;", "c", "()Ly1/l;", "sourceSansPro", "a", "meijerSans", "d", "meijerSansCompressed", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ki.U$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17425a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18269l sourceSansPro;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18269l meijerSans;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18269l meijerSansCompressed;

        static {
            int i10 = C15041b.f140902r;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            sourceSansPro = C18270m.a(C18274q.b(i10, companion.e(), 0, 0, 12, null), C18274q.b(C15041b.f140901q, companion.a(), 0, 0, 12, null), C18274q.b(C15041b.f140903s, companion.f(), 0, 0, 12, null));
            int i11 = C15041b.f140885a;
            FontWeight fontWeightC = companion.c();
            C18280w.Companion companion2 = C18280w.INSTANCE;
            meijerSans = C18270m.a(C18274q.b(i11, fontWeightC, companion2.b(), 0, 8, null), C18274q.b(C15041b.f140886b, companion.c(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140899o, companion.d(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140900p, companion.d(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140895k, companion.f(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140896l, companion.f(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140897m, companion.a(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140898n, companion.a(), companion2.a(), 0, 8, null));
            meijerSansCompressed = C18270m.a(C18274q.b(C15041b.f140887c, companion.c(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140888d, companion.c(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140893i, companion.d(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140894j, companion.d(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140889e, companion.f(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140890f, companion.f(), companion2.a(), 0, 8, null), C18274q.b(C15041b.f140891g, companion.a(), companion2.b(), 0, 8, null), C18274q.b(C15041b.f140892h, companion.a(), companion2.a(), 0, 8, null));
        }

        public final AbstractC18269l a() {
            return meijerSans;
        }

        public final AbstractC18269l b() {
            return meijerSansCompressed;
        }

        public final AbstractC18269l c() {
            return sourceSansPro;
        }

        private Companion() {
        }
    }
}
