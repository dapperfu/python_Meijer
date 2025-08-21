package B4;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0015"}, d2 = {"LB4/a;", "LB4/f;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "LB4/e;", "statement", "", "b", "(LB4/e;)V", "a", "Ljava/lang/String;", "[Ljava/lang/Object;", "()Ljava/lang/String;", "sql", "c", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String query;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] bindArgs;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LB4/a$a;", "", "<init>", "()V", "LB4/e;", "statement", "", "index", "arg", "", "a", "(LB4/e;ILjava/lang/Object;)V", "", "bindArgs", "b", "(LB4/e;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B4.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final void a(e statement, int index, Object arg) {
            if (arg == null) {
                statement.I(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.y2(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.o(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.o(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.C(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.C(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.C(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.C(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.S1(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.C(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @JvmStatic
        public final void b(e statement, Object[] bindArgs) {
            Intrinsics.j(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = bindArgs[i10];
                i10++;
                a(statement, i10, obj);
            }
        }
    }

    public a(String query, Object[] objArr) {
        Intrinsics.j(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @Override // B4.f
    /* renamed from: a, reason: from getter */
    public String getQuery() {
        return this.query;
    }

    @Override // B4.f
    public void b(e statement) {
        Intrinsics.j(statement, "statement");
        INSTANCE.b(statement, this.bindArgs);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.j(query, "query");
    }
}
