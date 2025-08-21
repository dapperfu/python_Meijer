package J9;

import a9.C5673e;
import g9.c;
import g9.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u0018B\u008f\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012$\u0010\u000b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00070\n\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R2\u0010\u000b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"LJ9/a;", "Ljava/lang/Runnable;", "Lg9/c;", "LF9/a;", "Lg9/d;", "repository", "LM9/b;", "", "predicate", "querySpecification", "LS8/c;", "chunker", "LA9/c;", "merger", "Ly9/b;", "requestManager", "LJ9/a$a;", "requestStrategy", "La9/e;", "connectionWatchDog", "<init>", "(Lg9/c;LM9/b;Lg9/d;LS8/c;LS8/c;Ly9/b;LJ9/a$a;La9/e;)V", "requestModel", "", "a", "(LA9/c;)V", "run", "()V", "Lg9/c;", "b", "LM9/b;", "c", "Lg9/d;", "d", "LS8/c;", "e", "f", "Ly9/b;", "g", "LJ9/a$a;", "h", "La9/e;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<F9.a, d> repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final M9.b<List<F9.a>> predicate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d querySpecification;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final S8.c<List<F9.a>, List<List<F9.a>>> chunker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S8.c<List<F9.a>, A9.c> merger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final EnumC0257a requestStrategy;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C5673e connectionWatchDog;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LJ9/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: J9.a$a, reason: collision with other inner class name */
    public static final class EnumC0257a {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0257a f15674a = new EnumC0257a("PERSISTENT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0257a f15675b = new EnumC0257a("TRANSIENT", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0257a[] f15676c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15677d;

        static {
            EnumC0257a[] enumC0257aArrA = a();
            f15676c = enumC0257aArrA;
            f15677d = EnumEntriesKt.a(enumC0257aArrA);
        }

        private static final /* synthetic */ EnumC0257a[] a() {
            return new EnumC0257a[]{f15674a, f15675b};
        }

        public static EnumC0257a valueOf(String str) {
            return (EnumC0257a) Enum.valueOf(EnumC0257a.class, str);
        }

        public static EnumC0257a[] values() {
            return (EnumC0257a[]) f15676c.clone();
        }

        private EnumC0257a(String str, int i10) {
        }
    }

    public a(c<F9.a, d> repository, M9.b<List<F9.a>> predicate, d querySpecification, S8.c<List<F9.a>, List<List<F9.a>>> chunker, S8.c<List<F9.a>, A9.c> merger, y9.b requestManager, EnumC0257a requestStrategy, C5673e connectionWatchDog) {
        Intrinsics.j(repository, "repository");
        Intrinsics.j(predicate, "predicate");
        Intrinsics.j(querySpecification, "querySpecification");
        Intrinsics.j(chunker, "chunker");
        Intrinsics.j(merger, "merger");
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(requestStrategy, "requestStrategy");
        Intrinsics.j(connectionWatchDog, "connectionWatchDog");
        this.repository = repository;
        this.predicate = predicate;
        this.querySpecification = querySpecification;
        this.chunker = chunker;
        this.merger = merger;
        this.requestManager = requestManager;
        this.requestStrategy = requestStrategy;
        this.connectionWatchDog = connectionWatchDog;
    }

    private final void a(A9.c requestModel) {
        EnumC0257a enumC0257a = this.requestStrategy;
        if (enumC0257a == EnumC0257a.f15674a) {
            this.requestManager.b(requestModel, null);
        } else if (enumC0257a == EnumC0257a.f15675b) {
            this.requestManager.d(requestModel);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.connectionWatchDog.b()) {
            List<F9.a> listB = this.repository.b(this.querySpecification);
            if (this.predicate.a(listB)) {
                for (List<F9.a> list : this.chunker.a(listB)) {
                    a(this.merger.a(list));
                    this.repository.remove(new G9.a(list));
                }
            }
        }
    }
}
