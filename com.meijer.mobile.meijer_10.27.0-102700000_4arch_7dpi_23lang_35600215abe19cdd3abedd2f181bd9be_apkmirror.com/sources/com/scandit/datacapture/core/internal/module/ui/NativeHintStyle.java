package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MarginsF;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeHintStyle {

    @DjinniGenerated
    public static final class CppProxy extends NativeHintStyle {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125157a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native Anchor native_getAnchor(long j10);

        private native NativeColor native_getBackgroundColor(long j10);

        private native boolean native_getCanBeDismissed(long j10);

        private native float native_getCornerRadius(long j10);

        private native boolean native_getFitToText(long j10);

        private native NativeHintFont native_getFont(long j10);

        private native NativeHintAnchor native_getHintAnchor(long j10);

        private native float native_getHintAnchorOffset(long j10);

        private native NativeHintCornerStyle native_getHintCornerStyle(long j10);

        private native NativeHintHeight native_getHintHeight(long j10);

        private native NativeHintIcon native_getHintIcon(long j10);

        private native NativeHintWidth native_getHintWidth(long j10);

        private native float native_getHorizontalMargin(long j10);

        private native NativeColor native_getIconColor(long j10);

        private native String native_getIconResource(long j10);

        private native float native_getLineHeight(long j10);

        private native int native_getMaxLines(long j10);

        private native float native_getMaxWidthFraction(long j10);

        private native MarginsF native_getPadding(long j10);

        private native NativeHintAlignment native_getTextAlignment(long j10);

        private native NativeColor native_getTextColor(long j10);

        private native float native_getTextSize(long j10);

        private native int native_getTextWeight(long j10);

        private native float native_getVerticalOffsetRatio(long j10);

        private native boolean native_isAnimatedIntoView(long j10);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public Anchor getAnchor() {
            return native_getAnchor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getBackgroundColor() {
            return native_getBackgroundColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public boolean getCanBeDismissed() {
            return native_getCanBeDismissed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getCornerRadius() {
            return native_getCornerRadius(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public boolean getFitToText() {
            return native_getFitToText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintFont getFont() {
            return native_getFont(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintAnchor getHintAnchor() {
            return native_getHintAnchor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getHintAnchorOffset() {
            return native_getHintAnchorOffset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintCornerStyle getHintCornerStyle() {
            return native_getHintCornerStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintHeight getHintHeight() {
            return native_getHintHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintIcon getHintIcon() {
            return native_getHintIcon(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintWidth getHintWidth() {
            return native_getHintWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getHorizontalMargin() {
            return native_getHorizontalMargin(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getIconColor() {
            return native_getIconColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public String getIconResource() {
            return native_getIconResource(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getLineHeight() {
            return native_getLineHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public int getMaxLines() {
            return native_getMaxLines(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getMaxWidthFraction() {
            return native_getMaxWidthFraction(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public MarginsF getPadding() {
            return native_getPadding(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeHintAlignment getTextAlignment() {
            return native_getTextAlignment(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public NativeColor getTextColor() {
            return native_getTextColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getTextSize() {
            return native_getTextSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public int getTextWeight() {
            return native_getTextWeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public float getVerticalOffsetRatio() {
            return native_getVerticalOffsetRatio(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintStyle
        public boolean isAnimatedIntoView() {
            return native_isAnimatedIntoView(this.nativeRef);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public abstract Anchor getAnchor();

    public abstract NativeColor getBackgroundColor();

    public abstract boolean getCanBeDismissed();

    public abstract float getCornerRadius();

    public abstract boolean getFitToText();

    public abstract NativeHintFont getFont();

    public abstract NativeHintAnchor getHintAnchor();

    public abstract float getHintAnchorOffset();

    public abstract NativeHintCornerStyle getHintCornerStyle();

    public abstract NativeHintHeight getHintHeight();

    public abstract NativeHintIcon getHintIcon();

    public abstract NativeHintWidth getHintWidth();

    public abstract float getHorizontalMargin();

    public abstract NativeColor getIconColor();

    public abstract String getIconResource();

    public abstract float getLineHeight();

    public abstract int getMaxLines();

    public abstract float getMaxWidthFraction();

    public abstract MarginsF getPadding();

    public abstract NativeHintAlignment getTextAlignment();

    public abstract NativeColor getTextColor();

    public abstract float getTextSize();

    public abstract int getTextWeight();

    public abstract float getVerticalOffsetRatio();

    public abstract boolean isAnimatedIntoView();
}
