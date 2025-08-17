package g1;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJz\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0084\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b5\u0010*R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010*R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010=R(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010*\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u0010CR\"\u0010G\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\bE\u00100\"\u0004\bF\u0010CR$\u0010M\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\f\u0012\u0004\bO\u0010\u001c\u001a\u0004\b1\u0010NR\u0011\u0010Q\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bP\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Lg1/B;", "", "Lg1/A;", PreferencesHelper.PREF_ID, "", "uptimeMillis", "LU0/f;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Lg1/O;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lg1/d;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)Lg1/B;", "d", "(JJJZFJJZILjava/util/List;J)Lg1/B;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "o", "c", "h", "Z", "i", "()Z", "e", "F", "j", "()F", "getPreviousUptimeMillis", "g", "k", "l", "I", "n", "()I", "m", "Ljava/util/List;", "_historical", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "getDownChange$ui_release", "setDownChange$ui_release", "(Z)V", "downChange", "getPositionChange$ui_release", "setPositionChange$ui_release", "positionChange", "Lg1/B;", "getConsumedDelegate$ui_release", "()Lg1/B;", "setConsumedDelegate$ui_release", "(Lg1/B;)V", "consumedDelegate", "()Ljava/util/List;", "getHistorical$annotations", "p", "isConsumed", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.B, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class PointerInputChange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pressed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousPosition;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<HistoricalChange> _historical;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean downChange;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean positionChange;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private PointerInputChange consumedDelegate;

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15, j16);
    }

    public static /* synthetic */ PointerInputChange c(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.b(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    public final void a() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.a();
        }
    }

    public final PointerInputChange b(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChangeD = d(id2, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeD.consumedDelegate = pointerInputChange;
        return pointerInputChangeD;
    }

    public final PointerInputChange d(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final List<HistoricalChange> e() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt.m() : list;
    }

    /* renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: h, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: j, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: k, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* renamed from: m, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: n, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: o, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean p() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.p() : this.downChange || this.positionChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C14167A.d(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) U0.f.s(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) U0.f.s(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + p() + ", type=" + ((Object) O.i(this.type)) + ", historical=" + e() + ",scrollDelta=" + ((Object) U0.f.s(this.scrollDelta)) + ')';
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.pressure = f10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.originalEventPosition = U0.f.INSTANCE.c();
        this.downChange = z12;
        this.positionChange = z12;
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? O.INSTANCE.d() : i10, (i11 & 1024) != 0 ? U0.f.INSTANCE.c() : j15, null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this._historical = list;
        this.originalEventPosition = j16;
    }
}
