package B2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LB2/n;", "T", "LB2/I;", "LB2/D;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "LB2/s;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(LB2/D;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "LB2/J;", "a", "()LB2/J;", "LB2/D;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "d", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2917n<T> implements I<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f2425e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2426f = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D<T> serializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<File, s> coordinatorProducer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<File> produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "LB2/s;", "a", "(Ljava/io/File;)LB2/s;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.n$a */
    public static final class a extends Lambda implements Function1<File, s> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f2430f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            Intrinsics.j(it, "it");
            return u.a(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LB2/n$b;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B2.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> a() {
            return C2917n.f2425e;
        }

        public final Object b() {
            return C2917n.f2426f;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B2.n$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f2431f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f2431f = file;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Companion companion = C2917n.INSTANCE;
            Object objB = companion.b();
            File file = this.f2431f;
            synchronized (objB) {
                companion.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f143329a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2917n(D<T> serializer, Function1<? super File, ? extends s> coordinatorProducer, Function0<? extends File> produceFile) {
        Intrinsics.j(serializer, "serializer");
        Intrinsics.j(coordinatorProducer, "coordinatorProducer");
        Intrinsics.j(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // B2.I
    public J<T> a() throws IOException {
        File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (f2426f) {
            String path = file.getAbsolutePath();
            Set<String> set = f2425e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.i(path, "path");
            set.add(path);
        }
        Intrinsics.i(file, "file");
        return new C2918o(file, this.serializer, this.coordinatorProducer.invoke(file), new c(file));
    }

    public /* synthetic */ C2917n(D d10, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, (i10 & 2) != 0 ? a.f2430f : function1, function0);
    }
}
