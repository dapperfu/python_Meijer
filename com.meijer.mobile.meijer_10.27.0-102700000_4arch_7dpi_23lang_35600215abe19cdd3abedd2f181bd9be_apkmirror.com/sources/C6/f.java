package C6;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H&¢\u0006\u0004\b)\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%H&¢\u0006\u0004\b+\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"LC6/f;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LC6/f$a;", "peek", "()LC6/f$a;", "y", "()LC6/f;", "x", "s", "F", "", "hasNext", "()Z", "", "nextName", "()Ljava/lang/String;", "nextString", "nextBoolean", "", "G2", "()Ljava/lang/Void;", "", "nextInt", "()I", "", "nextDouble", "()D", "", "nextLong", "()J", "LC6/e;", "q3", "()LC6/e;", "", "skipValue", "()V", "", "names", "r3", "(Ljava/util/List;)I", "v", "", "getPath", "()Ljava/util/List;", "a", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f extends Closeable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LC6/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3695a = new a("BEGIN_ARRAY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f3696b = new a("END_ARRAY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f3697c = new a("BEGIN_OBJECT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f3698d = new a("END_OBJECT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f3699e = new a("NAME", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f3700f = new a("STRING", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final a f3701g = new a("NUMBER", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final a f3702h = new a("LONG", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final a f3703i = new a("BOOLEAN", 8);

        /* renamed from: j, reason: collision with root package name */
        public static final a f3704j = new a("NULL", 9);

        /* renamed from: k, reason: collision with root package name */
        public static final a f3705k = new a("END_DOCUMENT", 10);

        /* renamed from: l, reason: collision with root package name */
        public static final a f3706l = new a("ANY", 11);

        /* renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ a[] f3707m;

        /* renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f3708n;

        static {
            a[] aVarArrA = a();
            f3707m = aVarArrA;
            f3708n = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f3695a, f3696b, f3697c, f3698d, f3699e, f3700f, f3701g, f3702h, f3703i, f3704j, f3705k, f3706l};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3707m.clone();
        }

        private a(String str, int i10) {
        }
    }

    f F() throws IOException;

    Void G2() throws IOException;

    List<Object> getPath();

    boolean hasNext() throws IOException;

    boolean nextBoolean() throws IOException;

    double nextDouble() throws IOException;

    int nextInt() throws IOException;

    long nextLong() throws IOException;

    String nextName() throws IOException;

    String nextString() throws IOException;

    a peek() throws IOException;

    e q3() throws IOException;

    int r3(List<String> names) throws IOException;

    f s() throws IOException;

    void skipValue() throws IOException;

    void v();

    f x() throws IOException;

    f y() throws IOException;
}
