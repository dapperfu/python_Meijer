package L1;

import L1.k;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\rR \u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\r¨\u0006\u001d"}, d2 = {"LL1/y;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "LL1/k$c;", "b", "LL1/k$c;", "getStart", "()LL1/k$c;", "getStart$annotations", "()V", "start", "c", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "d", "getEnd", "getEnd$annotations", "end", "e", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor absoluteLeft;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor end;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor absoluteRight;

    public y(Object id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
        this.start = new k.VerticalAnchor(id2, -2);
        this.absoluteLeft = new k.VerticalAnchor(id2, 0);
        this.end = new k.VerticalAnchor(id2, -1);
        this.absoluteRight = new k.VerticalAnchor(id2, 1);
    }
}
