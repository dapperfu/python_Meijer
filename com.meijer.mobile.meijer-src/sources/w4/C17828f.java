package w4;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lw4/f;", "", "", PreferencesHelper.PREF_ID, "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "a", "(Lw4/f;)I", "I", "e", "()I", "b", "getSequence", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "l", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: w4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17828f implements Comparable<C17828f> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int sequence;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String from;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String to;

    public C17828f(int i10, int i11, String from, String to2) {
        Intrinsics.j(from, "from");
        Intrinsics.j(to2, "to");
        this.id = i10;
        this.sequence = i11;
        this.from = from;
        this.to = to2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C17828f other) {
        Intrinsics.j(other, "other");
        int i10 = this.id - other.id;
        return i10 == 0 ? this.sequence - other.sequence : i10;
    }

    /* renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: l, reason: from getter */
    public final String getTo() {
        return this.to;
    }
}
