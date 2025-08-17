package Ji;

import ii.C14731b;
import kotlin.AbstractC18142l;
import kotlin.C18143m;
import kotlin.C18147q;
import kotlin.C18153w;
import kotlin.FontWeight;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"LJi/U;", "", "a", "LJi/W;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f15881a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000e"}, d2 = {"LJi/U$a;", "", "<init>", "()V", "Ly1/l;", "b", "Ly1/l;", "c", "()Ly1/l;", "sourceSansPro", "a", "meijerSans", "d", "meijerSansCompressed", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ji.U$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15881a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18142l sourceSansPro;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18142l meijerSans;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC18142l meijerSansCompressed;

        static {
            int i10 = C14731b.f138016r;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            sourceSansPro = C18143m.a(C18147q.b(i10, companion.e(), 0, 0, 12, null), C18147q.b(C14731b.f138015q, companion.a(), 0, 0, 12, null), C18147q.b(C14731b.f138017s, companion.f(), 0, 0, 12, null));
            int i11 = C14731b.f137999a;
            FontWeight fontWeightC = companion.c();
            C18153w.Companion companion2 = C18153w.INSTANCE;
            meijerSans = C18143m.a(C18147q.b(i11, fontWeightC, companion2.b(), 0, 8, null), C18147q.b(C14731b.f138000b, companion.c(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138013o, companion.d(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138014p, companion.d(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138009k, companion.f(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138010l, companion.f(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138011m, companion.a(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138012n, companion.a(), companion2.a(), 0, 8, null));
            meijerSansCompressed = C18143m.a(C18147q.b(C14731b.f138001c, companion.c(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138002d, companion.c(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138007i, companion.d(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138008j, companion.d(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138003e, companion.f(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138004f, companion.f(), companion2.a(), 0, 8, null), C18147q.b(C14731b.f138005g, companion.a(), companion2.b(), 0, 8, null), C18147q.b(C14731b.f138006h, companion.a(), companion2.a(), 0, 8, null));
        }

        public final AbstractC18142l a() {
            return meijerSans;
        }

        public final AbstractC18142l b() {
            return meijerSansCompressed;
        }

        public final AbstractC18142l c() {
            return sourceSansPro;
        }

        private Companion() {
        }
    }
}
