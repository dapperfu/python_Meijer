package w4;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b%\u0010$R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lw4/h;", "LA4/d;", "", "name", "", "getColumnIndex", "(Ljava/lang/String;)I", "index", "", "value", "", "o", "(ID)V", "", "C", "(IJ)V", "u0", "(ILjava/lang/String;)V", "I", "(I)V", "getDouble", "(I)D", "getLong", "(I)J", "", "k2", "(I)Z", "O2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "N3", "()Z", "reset", "()V", "close", "a", "LA4/d;", "delegate", "", "b", "Ljava/util/Map;", "columnNameToIndexMap", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17830h implements A4.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A4.d delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> columnNameToIndexMap;

    @Override // A4.d
    public void C(int index, long value) {
        this.delegate.C(index, value);
    }

    @Override // A4.d
    public void I(int index) {
        this.delegate.I(index);
    }

    @Override // A4.d
    public boolean N3() {
        return this.delegate.N3();
    }

    @Override // A4.d
    public String O2(int index) {
        return this.delegate.O2(index);
    }

    @Override // A4.d, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // A4.d
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    public final int getColumnIndex(String name) {
        Intrinsics.j(name, "name");
        Integer num = this.columnNameToIndexMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // A4.d
    public String getColumnName(int index) {
        return this.delegate.getColumnName(index);
    }

    @Override // A4.d
    public double getDouble(int index) {
        return this.delegate.getDouble(index);
    }

    @Override // A4.d
    public long getLong(int index) {
        return this.delegate.getLong(index);
    }

    @Override // A4.d
    public boolean isNull(int index) {
        return this.delegate.isNull(index);
    }

    @Override // A4.d
    public boolean k2(int index) {
        return this.delegate.k2(index);
    }

    @Override // A4.d
    public void o(int index, double value) {
        this.delegate.o(index, value);
    }

    @Override // A4.d
    public void reset() {
        this.delegate.reset();
    }

    @Override // A4.d
    public void u0(int index, String value) {
        Intrinsics.j(value, "value");
        this.delegate.u0(index, value);
    }
}
