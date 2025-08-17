package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.R;

/* loaded from: classes7.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    private static int getStyleColor(int i10) {
        if (i10 == 3) {
            return -3407872;
        }
        if (i10 == 4) {
            return -16737844;
        }
        if (i10 == 5) {
            return -10053376;
        }
        if (i10 != 6) {
            return i10 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int getTextStyle(int i10) {
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? R.style.amu_Bubble_TextAppearance_Light : R.style.amu_Bubble_TextAppearance_Dark;
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setTextAppearance(Context context, int i10) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    private float rotateAnchor(float f10, float f11) {
        int i10 = this.mRotation;
        if (i10 == 0) {
            return f10;
        }
        if (i10 == 1) {
            return 1.0f - f11;
        }
        if (i10 == 2) {
            return 1.0f - f10;
        }
        if (i10 == 3) {
            return f11;
        }
        throw new IllegalStateException();
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    public void setBackground(Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.mContainer.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setColor(int i10) {
        this.mBackground.setColor(i10);
        setBackground(this.mBackground);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.mContentView.setPadding(i10, i11, i12, i13);
    }

    public void setContentRotation(int i10) {
        this.mRotationLayout.setViewRotation(i10);
    }

    public void setContentView(View view) {
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view);
        this.mContentView = view;
        View viewFindViewById = this.mRotationLayout.findViewById(R.id.amu_text);
        this.mTextView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void setRotation(int i10) {
        this.mRotation = ((i10 + 360) % 360) / 90;
    }

    public IconGenerator(Context context) {
        this.mContext = context;
        this.mBackground = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.mContainer = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    public void setStyle(int i10) {
        setColor(getStyleColor(i10));
        setTextAppearance(this.mContext, getTextStyle(i10));
    }

    public void setTextAppearance(int i10) {
        setTextAppearance(this.mContext, i10);
    }

    public Bitmap makeIcon() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i10 = this.mRotation;
        if (i10 == 1 || i10 == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i11 = this.mRotation;
        if (i11 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i11 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.mContainer.draw(canvas);
        return bitmapCreateBitmap;
    }
}
