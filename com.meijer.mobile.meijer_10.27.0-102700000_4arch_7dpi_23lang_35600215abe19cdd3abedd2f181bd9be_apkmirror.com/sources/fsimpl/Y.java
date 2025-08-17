package fsimpl;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.fullstory.FS;

/* loaded from: classes14.dex */
public class Y implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    private Drawable f131444b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f131445c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f131446d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f131447e;

    /* renamed from: f, reason: collision with root package name */
    private long f131448f;

    /* renamed from: a, reason: collision with root package name */
    private final C13949aa f131443a = new C13949aa();

    /* renamed from: g, reason: collision with root package name */
    private int f131449g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f131450h = -1;

    private Bitmap a(Bitmap bitmap) {
        Bitmap bitmapA = C14106fx.a(bitmap, true);
        int width = bitmapA.getWidth();
        int height = bitmapA.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i11 = 0; i11 < i10; i11++) {
            if ((iArr[i11] >>> 24) > 136) {
                iArr[i11] = -1;
            } else {
                iArr[i11] = 0;
            }
        }
        bitmapA.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapA;
    }

    private Drawable a(Context context) {
        if (this.f131444b == null) {
            this.f131444b = b(context);
        }
        return this.f131444b;
    }

    private Drawable a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        Drawable drawable = context.getDrawable(typedValue.resourceId);
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setRadius(i10 / 2);
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets a(TextView textView, int i10, int i11, View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout());
        view.setPadding(textView.getPaddingLeft(), insets.top, textView.getPaddingRight(), i10);
        view.setMinimumHeight(i11 + insets.top);
        return windowInsets;
    }

    private WindowManager.LayoutParams a() {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 1000, 280, -3);
        layoutParams.gravity = 49;
        if (Build.VERSION.SDK_INT < 30) {
            i10 = Build.VERSION.SDK_INT >= 28 ? 1 : 3;
            return layoutParams;
        }
        layoutParams.layoutInDisplayCutoutMode = i10;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        this.f131445c = c(activity);
        activity.getWindowManager().addView(this.f131445c, a());
        this.f131446d = d(activity);
        activity.getWindowManager().addView(this.f131446d, b());
        a(this.f131445c);
        this.f131443a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, View view) {
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        b(activity);
    }

    private void a(TextView textView) {
        if (this.f131447e == null) {
            this.f131447e = c();
        }
        this.f131447e.setTarget(textView);
        this.f131447e.setCurrentPlayTime(this.f131448f);
        this.f131447e.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, int i10) {
        float width = textView.getWidth() / 2.0f;
        float f10 = i10;
        this.f131443a.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, width, f10, width, f10});
    }

    private Drawable b(Context context) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), android.R.drawable.ic_menu_close_clear_cancel);
        Bitmap bitmapA = a(bitmapDecodeResource);
        bitmapDecodeResource.recycle();
        return new BitmapDrawable(context.getResources(), bitmapA);
    }

    private WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 296, -3);
        layoutParams.gravity = 8388661;
        return layoutParams;
    }

    private void b(Activity activity) {
        if (this.f131445c != null) {
            activity.getWindowManager().removeView(this.f131445c);
            this.f131445c = null;
        }
        if (this.f131446d != null) {
            activity.getWindowManager().removeView(this.f131446d);
            this.f131446d = null;
        }
        d();
        this.f131443a.b();
    }

    private int c(Context context) {
        if (this.f131449g == -1) {
            this.f131449g = (int) TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        }
        return this.f131449g;
    }

    private ObjectAnimator c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) Property.of(TextView.class, Float.TYPE, "alpha"), 0.04f, 0.5f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1600L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        return objectAnimatorOfFloat;
    }

    private TextView c(Activity activity) {
        final TextView textView = new TextView(activity);
        textView.setTag("FSPreviewMode");
        textView.setText("Preview Mode");
        final int iC = c((Context) activity);
        textView.setMinHeight(iC);
        textView.setTextColor(C14102ft.a(activity) ? -16777216 : -1);
        textView.setPaintFlags(32);
        textView.setBackground(this.f131443a);
        textView.setGravity(17);
        final int iApplyDimension = (int) TypedValue.applyDimension(1, 4.0f, activity.getResources().getDisplayMetrics());
        textView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: fsimpl.Y$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return Y.a(textView, iApplyDimension, iC, view, windowInsets);
            }
        });
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: fsimpl.Y$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.a(textView, iApplyDimension);
            }
        });
        FS.unmask(textView);
        return textView;
    }

    private int d(Context context) {
        if (this.f131450h == -1) {
            this.f131450h = (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        }
        return this.f131450h;
    }

    private ImageView d(final Activity activity) {
        ImageView imageView = new ImageView(activity);
        imageView.setTag("FSPreviewMode");
        int iC = c((Context) activity);
        int iD = d((Context) activity);
        imageView.setMinimumWidth(iC);
        imageView.setMaxWidth(iC);
        imageView.setPadding(iD, iD, iD, iD);
        imageView.setAdjustViewBounds(true);
        imageView.setImageDrawable(a((Context) activity));
        imageView.setForeground(a(activity, iC));
        imageView.setImageTintList(ColorStateList.valueOf(C14102ft.a(activity) ? -16777216 : -1));
        imageView.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC13950ab(null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fsimpl.Y$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(activity, view);
            }
        });
        FS.unmask(imageView);
        return imageView;
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f131447e;
        if (objectAnimator != null) {
            this.f131448f = objectAnimator.getCurrentPlayTime();
            this.f131447e.setTarget(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (decorView.isAttachedToWindow()) {
            a(activity);
        } else {
            decorView.addOnAttachStateChangeListener(new Z(this, decorView, activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
