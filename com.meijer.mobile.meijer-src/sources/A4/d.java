package A4;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J!\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0003H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0016H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H&¢\u0006\u0004\b#\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"LA4/d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "index", "", "value", "", "o", "(ID)V", "", "C", "(IJ)V", "", "u0", "(ILjava/lang/String;)V", "I", "(I)V", "getDouble", "(I)D", "getLong", "(I)J", "", "k2", "(I)Z", "O2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "N3", "()Z", "reset", "()V", "close", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public interface d extends AutoCloseable {
    void C(int index, long value);

    void I(int index);

    boolean N3();

    String O2(int index);

    @Override // java.lang.AutoCloseable
    void close();

    int getColumnCount();

    String getColumnName(int index);

    double getDouble(int index);

    long getLong(int index);

    boolean isNull(int index);

    void o(int index, double value);

    void reset();

    void u0(int index, String value);

    default boolean k2(int index) {
        if (getLong(index) != 0) {
            return true;
        }
        return false;
    }
}
