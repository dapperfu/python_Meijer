package com.scandit.datacapture.core.ui.icon;

import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "iconType", "withIcon", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;)Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "", "iconColor", "withIconColor", "(Ljava/lang/Integer;)Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "backgroundColor", "withBackgroundColor", "backgroundStrokeColor", "withBackgroundStrokeColor", "", "backgroundStrokeWidth", "withBackgroundStrokeWidth", "(F)Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;", "backgroundShape", "withBackgroundShape", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;)Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "build", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ScanditIconBuilder {
    public static final float DEFAULT_STROKE_WIDTH = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private ScanditIconType f126117a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f126118b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f126119c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f126120d;

    /* renamed from: e, reason: collision with root package name */
    private float f126121e = 2.0f;

    /* renamed from: f, reason: collision with root package name */
    private ScanditIconShape f126122f;

    public final ScanditIcon build() {
        return new ScanditIcon(this.f126117a, this.f126118b, this.f126119c, this.f126120d, this.f126121e, this.f126122f);
    }

    public final ScanditIconBuilder withBackgroundColor(Integer backgroundColor) {
        this.f126119c = backgroundColor;
        return this;
    }

    public final ScanditIconBuilder withBackgroundShape(ScanditIconShape backgroundShape) {
        this.f126122f = backgroundShape;
        return this;
    }

    public final ScanditIconBuilder withBackgroundStrokeColor(Integer backgroundStrokeColor) {
        this.f126120d = backgroundStrokeColor;
        return this;
    }

    public final ScanditIconBuilder withBackgroundStrokeWidth(float backgroundStrokeWidth) {
        this.f126121e = backgroundStrokeWidth;
        return this;
    }

    public final ScanditIconBuilder withIcon(ScanditIconType iconType) {
        this.f126117a = iconType;
        return this;
    }

    public final ScanditIconBuilder withIconColor(Integer iconColor) {
        this.f126118b = iconColor;
        return this;
    }
}
