package h4;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14462a {

    /* renamed from: g, reason: collision with root package name */
    public static final C14462a f134821g = new C14462a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f134822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134824c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134826e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f134827f;

    public static C14462a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C14462a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f134821g.f134822a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f134821g.f134823b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f134821g.f134824c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f134821g.f134825d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f134821g.f134826e, captionStyle.getTypeface());
    }

    public C14462a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f134822a = i10;
        this.f134823b = i11;
        this.f134824c = i12;
        this.f134825d = i13;
        this.f134826e = i14;
        this.f134827f = typeface;
    }
}
