package a1;

import V0.AbstractC5324i0;
import V0.F1;
import V0.G1;
import V0.s1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\"\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b4\u0010/R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b7\u00103R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010!R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b<\u00103R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\bA\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"La1/s;", "La1/p;", "", "name", "", "La1/h;", "pathData", "LV0/s1;", "pathFillType", "LV0/i0;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "LV0/F1;", "strokeLineCap", "LV0/G1;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILV0/i0;FLV0/i0;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "c", "I", "n", "d", "LV0/i0;", "()LV0/i0;", "e", "F", "f", "()F", "o", "g", "p", "t", "i", "q", "j", "r", "s", "l", "x", "m", "v", "w", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<h> pathData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pathFillType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5324i0 fill;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float fillAlpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5324i0 stroke;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float strokeAlpha;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineWidth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineCap;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineJoin;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineMiter;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float trimPathStart;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float trimPathEnd;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float trimPathOffset;

    public /* synthetic */ s(String str, List list, int i10, AbstractC5324i0 abstractC5324i0, float f10, AbstractC5324i0 abstractC5324i02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, abstractC5324i0, f10, abstractC5324i02, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && s.class == other.getClass()) {
            s sVar = (s) other;
            return Intrinsics.e(this.name, sVar.name) && Intrinsics.e(this.fill, sVar.fill) && this.fillAlpha == sVar.fillAlpha && Intrinsics.e(this.stroke, sVar.stroke) && this.strokeAlpha == sVar.strokeAlpha && this.strokeLineWidth == sVar.strokeLineWidth && F1.e(this.strokeLineCap, sVar.strokeLineCap) && G1.e(this.strokeLineJoin, sVar.strokeLineJoin) && this.strokeLineMiter == sVar.strokeLineMiter && this.trimPathStart == sVar.trimPathStart && this.trimPathEnd == sVar.trimPathEnd && this.trimPathOffset == sVar.trimPathOffset && s1.d(this.pathFillType, sVar.pathFillType) && Intrinsics.e(this.pathData, sVar.pathData);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s(String str, List<? extends h> list, int i10, AbstractC5324i0 abstractC5324i0, float f10, AbstractC5324i0 abstractC5324i02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i10;
        this.fill = abstractC5324i0;
        this.fillAlpha = f10;
        this.stroke = abstractC5324i02;
        this.strokeAlpha = f11;
        this.strokeLineWidth = f12;
        this.strokeLineCap = i11;
        this.strokeLineJoin = i12;
        this.strokeLineMiter = f13;
        this.trimPathStart = f14;
        this.trimPathEnd = f15;
        this.trimPathOffset = f16;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5324i0 getFill() {
        return this.fill;
    }

    /* renamed from: f, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        AbstractC5324i0 abstractC5324i0 = this.fill;
        int iHashCode2 = (((iHashCode + (abstractC5324i0 != null ? abstractC5324i0.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        AbstractC5324i0 abstractC5324i02 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (abstractC5324i02 != null ? abstractC5324i02.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + F1.f(this.strokeLineCap)) * 31) + G1.f(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + s1.e(this.pathFillType);
    }

    public final List<h> k() {
        return this.pathData;
    }

    /* renamed from: n, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC5324i0 getStroke() {
        return this.stroke;
    }

    /* renamed from: p, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: q, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* renamed from: r, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* renamed from: s, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* renamed from: t, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* renamed from: v, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* renamed from: w, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* renamed from: x, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }
}
