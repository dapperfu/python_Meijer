package com.scandit.datacapture.core.ui.style;

import com.scandit.datacapture.core.internal.module.extensions.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/Brush;", "", "", "fillColor", "strokeColor", "", "strokeWidth", "<init>", "(IIF)V", "", "preserveAlpha", "copy", "(IIZ)Lcom/scandit/datacapture/core/ui/style/Brush;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getFillColor", "b", "getStrokeColor", "c", "F", "getStrokeWidth", "()F", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int fillColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int strokeColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float strokeWidth;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/Brush$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "transparent", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Brush transparent() {
            return new Brush(0, 0, 0.0f);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final Brush transparent() {
        return INSTANCE.transparent();
    }

    public final Brush copy(int fillColor, int strokeColor, boolean preserveAlpha) {
        if (preserveAlpha) {
            return new Brush((fillColor & 16777215) | ((this.fillColor >>> 24) << 24), (strokeColor & 16777215) | ((this.strokeColor >>> 24) << 24), this.strokeWidth);
        }
        if (preserveAlpha) {
            throw new NoWhenBranchMatchedException();
        }
        return new Brush(fillColor, strokeColor, this.strokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(Brush.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.core.ui.style.Brush");
        Brush brush = (Brush) other;
        return this.fillColor == brush.fillColor && this.strokeColor == brush.strokeColor && this.strokeWidth == brush.strokeWidth;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Float.hashCode(this.strokeWidth) + (((this.fillColor * 31) + this.strokeColor) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Brush{fillColor=");
        int i10 = this.fillColor;
        char[] cArr = new char[9];
        for (int i11 = 8; i11 > 0; i11--) {
            cArr[i11] = a.f124612a[i10 & 15].charValue();
            i10 >>>= 4;
        }
        cArr[0] = '#';
        sb2.append(new String(cArr));
        sb2.append(", strokeColor=");
        int i12 = this.strokeColor;
        char[] cArr2 = new char[9];
        for (int i13 = 8; i13 > 0; i13--) {
            cArr2[i13] = a.f124612a[i12 & 15].charValue();
            i12 >>>= 4;
        }
        cArr2[0] = '#';
        sb2.append(new String(cArr2));
        sb2.append(", strokeWidth=");
        sb2.append(this.strokeWidth);
        sb2.append('}');
        return sb2.toString();
    }

    public Brush(int i10, int i11, float f10) {
        this.fillColor = i10;
        this.strokeColor = i11;
        this.strokeWidth = f10;
    }
}
