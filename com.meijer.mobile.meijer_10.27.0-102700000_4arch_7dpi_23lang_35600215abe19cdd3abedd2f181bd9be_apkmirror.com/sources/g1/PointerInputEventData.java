package g1;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b \u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103R\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b)\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lg1/E;", "", "Lg1/A;", PreferencesHelper.PREF_ID, "", "uptime", "LU0/f;", "positionOnScreen", "position", "", "down", "", "pressure", "Lg1/O;", "type", "activeHover", "", "Lg1/d;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "k", "c", "g", "f", "e", "Z", "()Z", "F", "h", "()F", "I", "j", "i", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.E, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class PointerInputEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean down;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activeHover;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HistoricalChange> historical;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrollDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long originalEventPosition;

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return C14167A.b(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && U0.f.j(this.positionOnScreen, pointerInputEventData.positionOnScreen) && U0.f.j(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && O.g(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.e(this.historical, pointerInputEventData.historical) && U0.f.j(this.scrollDelta, pointerInputEventData.scrollDelta) && U0.f.j(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    private PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<HistoricalChange> list, long j14, long j15) {
        this.id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z10;
        this.pressure = f10;
        this.type = i10;
        this.activeHover = z11;
        this.historical = list;
        this.scrollDelta = j14;
        this.originalEventPosition = j15;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> c() {
        return this.historical;
    }

    /* renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: f, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: g, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* renamed from: h, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return (((((((((((((((((((C14167A.c(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + U0.f.o(this.positionOnScreen)) * 31) + U0.f.o(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + O.h(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + U0.f.o(this.scrollDelta)) * 31) + U0.f.o(this.originalEventPosition);
    }

    /* renamed from: i, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: j, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: k, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) C14167A.d(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) U0.f.s(this.positionOnScreen)) + ", position=" + ((Object) U0.f.s(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) O.i(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) U0.f.s(this.scrollDelta)) + ", originalEventPosition=" + ((Object) U0.f.s(this.originalEventPosition)) + ')';
    }
}
