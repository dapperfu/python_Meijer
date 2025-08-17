package t4;

import A4.f;
import A4.g;
import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z4.C18379a;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\u000b\u000e\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lt4/e;", "Lz4/d;", "LA4/c;", "db", "", "sql", "<init>", "(LA4/c;Ljava/lang/String;)V", "", "d", "()V", "a", "LA4/c;", "()LA4/c;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "", "c", "Z", "isClosed", "()Z", "(Z)V", "Lt4/e$b;", "Lt4/e$c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17063e implements InterfaceC18382d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A4.c db;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt4/e$a;", "", "<init>", "()V", "", "prefix", "", "d", "(Ljava/lang/String;)Z", "s", "", "c", "(Ljava/lang/String;)I", "LA4/c;", "db", "sql", "Lt4/e;", "a", "(LA4/c;Ljava/lang/String;)Lt4/e;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t4.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbstractC17063e a(A4.c db2, String sql) {
            Intrinsics.j(db2, "db");
            Intrinsics.j(sql, "sql");
            String upperCase = StringsKt.y1(sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            String strB = b(upperCase);
            return strB == null ? new c(db2, sql) : d(strB) ? new b(db2, sql) : new c(db2, sql);
        }

        public final String b(String sql) {
            Intrinsics.j(sql, "sql");
            int iC = c(sql);
            if (iC < 0 || iC > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(iC, Math.min(iC + 3, sql.length()));
            Intrinsics.i(strSubstring, "substring(...)");
            return strSubstring;
        }

        private final int c(String s10) {
            String str;
            int i10;
            int length = s10.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = s10.charAt(i11);
                if (Intrinsics.k(cCharAt, 32) <= 0) {
                    i11++;
                } else if (cCharAt == '-') {
                    if (s10.charAt(i11 + 1) == '-') {
                        str = s10;
                        int iO0 = StringsKt.o0(str, '\n', i11 + 2, false, 4, null);
                        if (iO0 < 0) {
                            return -1;
                        }
                        i11 = iO0 + 1;
                        s10 = str;
                    } else {
                        return i11;
                    }
                } else {
                    str = s10;
                    if (cCharAt == '/') {
                        int iO02 = i11 + 1;
                        if (str.charAt(iO02) == '*') {
                            do {
                                String str2 = str;
                                iO02 = StringsKt.o0(str2, '*', iO02 + 1, false, 4, null);
                                str = str2;
                                if (iO02 < 0) {
                                    return -1;
                                }
                                i10 = iO02 + 1;
                                if (i10 >= length) {
                                    break;
                                }
                            } while (str.charAt(i10) != '/');
                            i11 = iO02 + 2;
                            s10 = str;
                        }
                    }
                    return i11;
                }
            }
            return -1;
        }

        private final boolean d(String prefix) {
            int iHashCode = prefix.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && prefix.equals("WIT")) {
                        return true;
                    }
                    return false;
                }
                if (prefix.equals("SEL")) {
                    return true;
                }
                return false;
            }
            if (prefix.equals("PRA")) {
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u0000 I2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010&J\u000f\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u000fJ\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u000fJ\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u000fR\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lt4/e$b;", "Lt4/e;", "LA4/c;", "db", "", "sql", "<init>", "(LA4/c;Ljava/lang/String;)V", "", "columnType", "index", "", "p", "(II)V", "u", "()V", "Landroid/database/Cursor;", "z", "()Landroid/database/Cursor;", "c", "w", "(Landroid/database/Cursor;I)V", "", "value", "o", "(ID)V", "", "C", "(IJ)V", "u0", "(ILjava/lang/String;)V", "I", "(I)V", "getDouble", "(I)D", "getLong", "(I)J", "P2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "N3", "()Z", "reset", "m", "close", "", "e", "[I", "bindingTypes", "", "f", "[J", "longBindings", "", "g", "[D", "doubleBindings", "", "h", "[Ljava/lang/String;", "stringBindings", "", "i", "[[B", "blobBindings", "j", "Landroid/database/Cursor;", "cursor", "k", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t4.e$b */
    private static final class b extends AbstractC17063e {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Cursor cursor;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"t4/e$b$b", "LA4/f;", "LA4/e;", "statement", "", "b", "(LA4/e;)V", "", "a", "()Ljava/lang/String;", "sql", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: t4.e$b$b, reason: collision with other inner class name */
        public static final class C2530b implements f {
            C2530b() {
            }

            @Override // A4.f
            /* renamed from: a */
            public String getQuery() {
                return b.this.getSql();
            }

            @Override // A4.f
            public void b(A4.e statement) {
                Intrinsics.j(statement, "statement");
                int length = b.this.bindingTypes.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = b.this.bindingTypes[i10];
                    if (i11 == 1) {
                        statement.C(i10, b.this.longBindings[i10]);
                    } else if (i11 == 2) {
                        statement.o(i10, b.this.doubleBindings[i10]);
                    } else if (i11 == 3) {
                        String str = b.this.stringBindings[i10];
                        Intrinsics.g(str);
                        statement.S1(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = b.this.blobBindings[i10];
                        Intrinsics.g(bArr);
                        statement.z2(i10, bArr);
                    } else if (i11 == 5) {
                        statement.I(i10);
                    }
                }
            }
        }

        private final void p(int columnType, int index) {
            int i10 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i10) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
                Intrinsics.i(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i10) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
                    Intrinsics.i(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i10) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
                    Intrinsics.i(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i10) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i10);
                    Intrinsics.i(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i10) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i10);
                Intrinsics.i(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A4.c db2, String sql) {
            super(db2, sql, null);
            Intrinsics.j(db2, "db");
            Intrinsics.j(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void u() {
            if (this.cursor == null) {
                this.cursor = getDb().X2(new C2530b());
            }
        }

        private final void w(Cursor c10, int index) {
            if (index < 0 || index >= c10.getColumnCount()) {
                C18379a.b(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final Cursor z() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public void u0(int index, String value) {
            Intrinsics.j(value, "value");
            d();
            p(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // z4.InterfaceC18382d
        public void C(int index, long value) {
            d();
            p(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // z4.InterfaceC18382d
        public void I(int index) {
            d();
            p(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // z4.InterfaceC18382d
        public boolean N3() {
            d();
            u();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // z4.InterfaceC18382d
        public String P2(int index) {
            d();
            Cursor cursorZ = z();
            w(cursorZ, index);
            String string = cursorZ.getString(index);
            Intrinsics.i(string, "getString(...)");
            return string;
        }

        @Override // z4.InterfaceC18382d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                m();
                reset();
            }
            c(true);
        }

        @Override // z4.InterfaceC18382d
        public int getColumnCount() {
            d();
            u();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // z4.InterfaceC18382d
        public String getColumnName(int index) {
            d();
            u();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                w(cursor, index);
                String columnName = cursor.getColumnName(index);
                Intrinsics.i(columnName, "getColumnName(...)");
                return columnName;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // z4.InterfaceC18382d
        public double getDouble(int index) {
            d();
            Cursor cursorZ = z();
            w(cursorZ, index);
            return cursorZ.getDouble(index);
        }

        @Override // z4.InterfaceC18382d
        public long getLong(int index) {
            d();
            Cursor cursorZ = z();
            w(cursorZ, index);
            return cursorZ.getLong(index);
        }

        @Override // z4.InterfaceC18382d
        public boolean isNull(int index) {
            d();
            Cursor cursorZ = z();
            w(cursorZ, index);
            return cursorZ.isNull(index);
        }

        public void m() {
            d();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // z4.InterfaceC18382d
        public void o(int index, double value) {
            d();
            p(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // z4.InterfaceC18382d
        public void reset() {
            d();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lt4/e$c;", "Lt4/e;", "LA4/c;", "db", "", "sql", "<init>", "(LA4/c;Ljava/lang/String;)V", "", "index", "", "value", "", "o", "(ID)V", "", "C", "(IJ)V", "u0", "(ILjava/lang/String;)V", "I", "(I)V", "getDouble", "(I)D", "getLong", "(I)J", "P2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "N3", "()Z", "reset", "()V", "close", "LA4/g;", "Landroidx/room/driver/SupportStatement;", "e", "LA4/g;", "delegate", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t4.e$c */
    private static final class c extends AbstractC17063e {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final g delegate;

        @Override // z4.InterfaceC18382d
        public void reset() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A4.c db2, String sql) {
            super(db2, sql, null);
            Intrinsics.j(db2, "db");
            Intrinsics.j(sql, "sql");
            this.delegate = db2.Y1(sql);
        }

        @Override // z4.InterfaceC18382d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            c(true);
        }

        @Override // z4.InterfaceC18382d
        public void u0(int index, String value) {
            Intrinsics.j(value, "value");
            d();
            this.delegate.S1(index, value);
        }

        @Override // z4.InterfaceC18382d
        public void C(int index, long value) {
            d();
            this.delegate.C(index, value);
        }

        @Override // z4.InterfaceC18382d
        public void I(int index) {
            d();
            this.delegate.I(index);
        }

        @Override // z4.InterfaceC18382d
        public boolean N3() {
            d();
            this.delegate.execute();
            return false;
        }

        @Override // z4.InterfaceC18382d
        public String P2(int index) {
            d();
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // z4.InterfaceC18382d
        public String getColumnName(int index) {
            d();
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public double getDouble(int index) {
            d();
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public long getLong(int index) {
            d();
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public boolean isNull(int index) {
            d();
            C18379a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // z4.InterfaceC18382d
        public void o(int index, double value) {
            d();
            this.delegate.o(index, value);
        }
    }

    public /* synthetic */ AbstractC17063e(A4.c cVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str);
    }

    private AbstractC17063e(A4.c cVar, String str) {
        this.db = cVar;
        this.sql = str;
    }

    /* renamed from: a, reason: from getter */
    protected final A4.c getDb() {
        return this.db;
    }

    /* renamed from: b, reason: from getter */
    protected final String getSql() {
        return this.sql;
    }

    protected final void c(boolean z10) {
        this.isClosed = z10;
    }

    protected final void d() {
        if (this.isClosed) {
            C18379a.b(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }
}
