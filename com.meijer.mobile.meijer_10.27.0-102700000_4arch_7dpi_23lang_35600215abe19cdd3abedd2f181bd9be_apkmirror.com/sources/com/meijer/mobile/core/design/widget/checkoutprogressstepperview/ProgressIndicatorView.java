package com.meijer.mobile.core.design.widget.checkoutprogressstepperview;

import Bj.f;
import Bj.j;
import Bj.o;
import Bj.p;
import Bj.q;
import Z1.b;
import ak.AbstractC5607a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import b2.C6187h;
import bk.d;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u0010,\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010/\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010)R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020(008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000204008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u0016\u00107\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0016\u00109\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010)R\u0016\u0010;\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010)R\u0016\u0010=\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R\u0016\u0010?\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010)R\u0016\u0010A\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010)R\u0016\u0010C\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0016\u0010E\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010)R\u0016\u0010G\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010)R\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010N\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010IR\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010ZR\u0014\u0010a\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010ZR\u0014\u0010c\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010ZR\u0014\u0010e\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010ZR\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010IR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00102¨\u0006h"}, d2 = {"Lcom/meijer/mobile/core/design/widget/checkoutprogressstepperview/ProgressIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "b", "c", "()V", "", "", "labels", "setLabels", "(Ljava/util/List;)V", "a", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "currentStep", "d", "(Ljava/util/List;I)V", "", "F", "circleDiameter", "circleRadius", "circleStroke", "borderCircleRadius", "e", "distanceBetweenIndicatorAndLabel", "", "f", "Ljava/util/List;", "circleXCenter", "Landroid/graphics/Rect;", "g", "statusIconDimensions", "circleYCenter", "i", "textY", "j", "textSize", "k", "barLeft", "l", "barRight", "m", "barTop", "n", "barBottom", "o", "barSegmentWidth", "p", "barThickness", "q", "I", "completeCircleColor", "r", "inCompleteCircleColor", "s", "borderLessCircleColor", "t", "labelTextColor", "u", "textFont", "Landroid/graphics/drawable/Drawable;", "v", "Landroid/graphics/drawable/Drawable;", "inProgressIcon", "completeIcon", "Landroid/graphics/Paint;", "x", "Landroid/graphics/Paint;", "stepTextPaint", "y", "inCompleteBarPaint", "z", "completeCirclePaint", "A", "inProgressCirclePaint", "B", "inCompleteCirclePaint", "C", "borderLessCirclePaint", "D", "E", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProgressIndicatorView extends View {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Paint inProgressCirclePaint;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Paint inCompleteCirclePaint;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Paint borderLessCirclePaint;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int currentStep;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private List<String> labels;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float circleDiameter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float circleRadius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float circleStroke;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float borderCircleRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float distanceBetweenIndicatorAndLabel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<Float> circleXCenter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Rect> statusIconDimensions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float circleYCenter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float textY;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float textSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float barLeft;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float barRight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float barTop;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float barBottom;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float barSegmentWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float barThickness;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int completeCircleColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int inCompleteCircleColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int borderLessCircleColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int labelTextColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int textFont;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Drawable inProgressIcon;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Drawable completeIcon;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Paint stepTextPaint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Paint inCompleteBarPaint;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Paint completeCirclePaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.f2610i);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    private final void a() {
        Paint paint = this.stepTextPaint;
        paint.setColor(b.c(getContext(), this.labelTextColor));
        paint.setTypeface(C6187h.h(getContext(), this.textFont));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.textSize);
        Paint paint2 = this.inCompleteBarPaint;
        paint2.setColor(b.c(getContext(), this.inCompleteCircleColor));
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = this.completeCirclePaint;
        paint3.setColor(b.c(getContext(), this.completeCircleColor));
        paint3.setStyle(style);
        Paint paint4 = this.inProgressCirclePaint;
        paint4.setColor(b.c(getContext(), this.completeCircleColor));
        paint4.setStrokeWidth(this.circleStroke);
        Paint.Style style2 = Paint.Style.STROKE;
        paint4.setStyle(style2);
        Paint paint5 = this.inCompleteCirclePaint;
        paint5.setColor(b.c(getContext(), this.inCompleteCircleColor));
        paint5.setStrokeWidth(this.circleStroke);
        paint5.setStyle(style2);
        Paint paint6 = this.borderLessCirclePaint;
        paint6.setColor(b.c(getContext(), this.borderLessCircleColor));
        paint6.setStyle(style);
    }

    private final void b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int[] ProgressIndicatorView = q.f3088L;
        Intrinsics.i(ProgressIndicatorView, "ProgressIndicatorView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, ProgressIndicatorView, defStyleAttr, defStyleRes);
        this.circleDiameter = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3091O, 0);
        this.borderCircleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3090N, 0);
        this.circleStroke = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3092P, 0);
        this.barThickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3089M, 0);
        this.distanceBetweenIndicatorAndLabel = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3097U, 0);
        this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.f3093Q, 0);
        this.completeCircleColor = typedArrayObtainStyledAttributes.getResourceId(q.f3095S, R.color.white);
        this.inCompleteCircleColor = typedArrayObtainStyledAttributes.getResourceId(q.f3098V, R.color.white);
        this.borderLessCircleColor = typedArrayObtainStyledAttributes.getResourceId(q.f3094R, R.color.white);
        this.labelTextColor = typedArrayObtainStyledAttributes.getResourceId(q.f3100X, R.color.white);
        this.textFont = typedArrayObtainStyledAttributes.getResourceId(q.f3101Y, j.f2804b);
        this.completeIcon = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f3096T);
        this.inProgressIcon = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f3099W);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void c() {
        d.e(this, AbstractC5607a.INSTANCE.d(o.f3030m0, Integer.valueOf(this.currentStep + 1), Integer.valueOf(this.labels.size()), this.labels.get(this.currentStep)));
    }

    private final void setLabels(List<String> labels) {
        this.labels = labels;
        int size = labels.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.statusIconDimensions.add(new Rect());
        }
    }

    public final void d(List<String> labels, int currentStep) {
        Intrinsics.j(labels, "labels");
        setLabels(labels);
        if (currentStep != this.currentStep && currentStep >= 0 && currentStep < labels.size()) {
            this.currentStep = currentStep;
        }
        invalidate();
        c();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(this.barLeft, this.barTop, this.barRight, this.barBottom, this.completeCirclePaint);
        canvas.drawRect(this.barLeft + (this.barSegmentWidth * this.currentStep), this.barTop, this.barRight, this.barBottom, this.inCompleteBarPaint);
        int size = this.labels.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = this.currentStep;
            if (i10 < i11) {
                canvas.drawCircle(this.circleXCenter.get(i10).floatValue(), this.circleYCenter, this.circleRadius, this.completeCirclePaint);
                Drawable drawable = this.completeIcon;
                if (drawable != null) {
                    drawable.setBounds(this.statusIconDimensions.get(i10));
                }
                Drawable drawable2 = this.completeIcon;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            } else if (i10 == i11) {
                canvas.drawCircle(this.circleXCenter.get(i10).floatValue(), this.circleYCenter, this.borderCircleRadius, this.inProgressCirclePaint);
                canvas.drawCircle(this.circleXCenter.get(i10).floatValue(), this.circleYCenter, this.borderCircleRadius, this.borderLessCirclePaint);
                Drawable drawable3 = this.inProgressIcon;
                if (drawable3 != null) {
                    drawable3.setBounds(this.statusIconDimensions.get(i10));
                }
                Drawable drawable4 = this.inProgressIcon;
                if (drawable4 != null) {
                    drawable4.draw(canvas);
                }
            } else {
                canvas.drawCircle(this.circleXCenter.get(i10).floatValue(), this.circleYCenter, this.borderCircleRadius, this.inCompleteCirclePaint);
                canvas.drawCircle(this.circleXCenter.get(i10).floatValue(), this.circleYCenter, this.borderCircleRadius, this.borderLessCirclePaint);
            }
            canvas.drawText(this.labels.get(i10), this.circleXCenter.get(i10).floatValue(), this.textY, this.stepTextPaint);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, p.f3072p);
        Intrinsics.j(context, "context");
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        float f10 = this.circleDiameter;
        float f11 = 2;
        this.circleRadius = f10 / f11;
        this.barSegmentWidth = (paddingLeft - f10) / (this.labels.size() - 1);
        this.circleYCenter = getPaddingTop() + this.circleRadius;
        float paddingLeft2 = getPaddingLeft();
        int size2 = this.labels.size();
        for (int i10 = 0; i10 < size2; i10++) {
            this.circleXCenter.add(Float.valueOf(this.circleRadius + paddingLeft2));
            Rect rect = this.statusIconDimensions.get(i10);
            float fFloatValue = this.circleXCenter.get(i10).floatValue();
            float f12 = this.circleRadius;
            int i11 = (int) (fFloatValue - f12);
            int i12 = (int) (this.circleYCenter - f12);
            float fFloatValue2 = this.circleXCenter.get(i10).floatValue();
            float f13 = this.circleRadius;
            rect.set(i11, i12, (int) (fFloatValue2 + f13), (int) (this.circleYCenter + f13));
            paddingLeft2 += this.barSegmentWidth;
        }
        float paddingTop = getPaddingTop();
        float f14 = this.circleRadius;
        float f15 = paddingTop + f14;
        this.circleYCenter = f15;
        this.textY = (((f15 + f14) + this.distanceBetweenIndicatorAndLabel) + this.stepTextPaint.getTextSize()) - this.stepTextPaint.descent();
        float paddingTop2 = getPaddingTop() + this.circleRadius;
        float f16 = this.barThickness;
        float f17 = paddingTop2 - (f16 / f11);
        this.barTop = f17;
        this.barBottom = f17 + f16;
        this.barLeft = getPaddingLeft() + this.circleRadius;
        this.barRight = (size - getPaddingRight()) - this.circleRadius;
        setMeasuredDimension(size, (int) (this.textY + this.stepTextPaint.descent() + getPaddingBottom()));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.j(context, "context");
        this.circleXCenter = new ArrayList();
        this.statusIconDimensions = new ArrayList();
        this.stepTextPaint = new Paint(1);
        this.inCompleteBarPaint = new Paint(1);
        this.completeCirclePaint = new Paint(1);
        this.inProgressCirclePaint = new Paint(1);
        this.inCompleteCirclePaint = new Paint(1);
        this.borderLessCirclePaint = new Paint(1);
        this.labels = CollectionsKt.m();
        b(context, attributeSet, i10, i11);
        a();
    }
}
