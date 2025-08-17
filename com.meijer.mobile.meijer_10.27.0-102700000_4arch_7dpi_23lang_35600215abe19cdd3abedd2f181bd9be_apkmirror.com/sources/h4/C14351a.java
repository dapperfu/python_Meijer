package h4;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14351a {

    /* renamed from: g, reason: collision with root package name */
    public static final C14351a f134350g = new C14351a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f134351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134355e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f134356f;

    public static C14351a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C14351a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f134350g.f134351a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f134350g.f134352b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f134350g.f134353c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f134350g.f134354d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f134350g.f134355e, captionStyle.getTypeface());
    }

    public C14351a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f134351a = i10;
        this.f134352b = i11;
        this.f134353c = i12;
        this.f134354d = i13;
        this.f134355e = i14;
        this.f134356f = typeface;
    }
}
