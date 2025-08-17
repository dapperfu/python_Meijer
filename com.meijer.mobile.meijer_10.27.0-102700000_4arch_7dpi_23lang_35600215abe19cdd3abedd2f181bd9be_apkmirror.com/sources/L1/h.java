package L1;

import L1.k;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR \u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\n\u0010\rR \u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001d\u0010\rR \u0010\"\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0015\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\u0005\u0010\u0017R \u0010)\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"LL1/h;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "LL1/k$c;", "b", "LL1/k$c;", "d", "()LL1/k$c;", "getStart$annotations", "()V", "start", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "LL1/k$b;", "LL1/k$b;", "e", "()LL1/k$b;", "getTop$annotations", "top", "getEnd$annotations", "end", "f", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "g", "getBottom$annotations", "bottom", "LL1/k$a;", "h", "LL1/k$a;", "getBaseline", "()LL1/k$a;", "getBaseline$annotations", "baseline", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor absoluteLeft;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k.HorizontalAnchor top;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor end;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k.VerticalAnchor absoluteRight;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k.HorizontalAnchor bottom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k.BaselineAnchor baseline;

    public h(Object id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
        this.start = new k.VerticalAnchor(id2, -2);
        this.absoluteLeft = new k.VerticalAnchor(id2, 0);
        this.top = new k.HorizontalAnchor(id2, 0);
        this.end = new k.VerticalAnchor(id2, -1);
        this.absoluteRight = new k.VerticalAnchor(id2, 1);
        this.bottom = new k.HorizontalAnchor(id2, 1);
        this.baseline = new k.BaselineAnchor(id2);
    }

    /* renamed from: a, reason: from getter */
    public final k.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final k.VerticalAnchor getEnd() {
        return this.end;
    }

    /* renamed from: c, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final k.VerticalAnchor getStart() {
        return this.start;
    }

    /* renamed from: e, reason: from getter */
    public final k.HorizontalAnchor getTop() {
        return this.top;
    }
}
