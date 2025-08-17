package P0;

import P0.BiasAbsoluteAlignment;
import P0.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u0005\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\bR \u0010$\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R \u0010(\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\"¨\u0006)"}, d2 = {"LP0/a;", "", "<init>", "()V", "LP0/e;", "b", "LP0/e;", "a", "()LP0/e;", "getTopLeft$annotations", "TopLeft", "c", "getTopRight$annotations", "TopRight", "d", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "e", "getCenterRight", "getCenterRight$annotations", "CenterRight", "f", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "g", "getBottomRight", "getBottomRight$annotations", "BottomRight", "LP0/e$b;", "h", "LP0/e$b;", "getLeft", "()LP0/e$b;", "getLeft$annotations", "Left", "i", "getRight", "getRight$annotations", "Right", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24471a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final e TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final e TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final e CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final e CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final e BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final e BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final e.b Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final e.b Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    public final e a() {
        return TopLeft;
    }

    public final e b() {
        return TopRight;
    }

    private a() {
    }
}
