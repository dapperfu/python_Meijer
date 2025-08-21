package g5;

import d5.EnumC13623g;
import d5.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg5/m;", "Lg5/h;", "Ld5/q;", "source", "", "mimeType", "Ld5/g;", "dataSource", "<init>", "(Ld5/q;Ljava/lang/String;Ld5/g;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ld5/q;", "b", "()Ld5/q;", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "c", "Ld5/g;", "()Ld5/g;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13623g dataSource;

    public m(q qVar, String str, EnumC13623g enumC13623g) {
        super(null);
        this.source = qVar;
        this.mimeType = str;
        this.dataSource = enumC13623g;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.e(this.source, mVar.source) && Intrinsics.e(this.mimeType, mVar.mimeType) && this.dataSource == mVar.dataSource;
    }

    /* renamed from: a, reason: from getter */
    public final EnumC13623g getDataSource() {
        return this.dataSource;
    }

    /* renamed from: b, reason: from getter */
    public final q getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.dataSource.hashCode();
    }
}
