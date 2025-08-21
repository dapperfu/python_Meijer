package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class m extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final int f122765d = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);

    /* renamed from: e, reason: collision with root package name */
    public static final MainThreadHelper f122766e = new MainThreadHelper();

    /* renamed from: a, reason: collision with root package name */
    public boolean f122767a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f122768b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f122769c;

    public final ImageView a() {
        ImageView imageView = this.f122769c;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.x("statusIcon");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, n statusShowingMode) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(statusShowingMode, "statusShowingMode");
        ImageView imageView = new ImageView(getContext());
        FS.Resources_setImageResource(imageView, R.drawable.sc_ic_status_none);
        imageView.setAdjustViewBounds(true);
        Intrinsics.j(imageView, "<set-?>");
        this.f122768b = imageView;
        int i10 = f122765d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        FS.Resources_setImageResource(imageView2, R.drawable.sc_ic_status_none);
        imageView2.setAdjustViewBounds(true);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.0f);
        imageView2.setScaleY(0.0f);
        Intrinsics.j(imageView2, "<set-?>");
        this.f122769c = imageView2;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(a(), layoutParams2);
        int iOrdinal = statusShowingMode.ordinal();
        if (iOrdinal == 0) {
            imageView.setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setVisibility(8);
        }
        a(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && a().getAlpha() == 1.0f) {
            return;
        }
        if (z10 || a().getAlpha() != 0.0f) {
            ImageView imageViewA = a();
            i iVar = i.f122755a;
            MainThreadHelper mainThreadHelper = f122766e;
            mainThreadHelper.runOnMainThread(new j(imageViewA, z10, z11, iVar));
            mainThreadHelper.runOnMainThread(new l(a(), z10, z11, k.f122760a));
        }
    }

    public final void a(boolean z10) {
        if (this.f122767a) {
            this.f122767a = false;
            f122766e.runOnMainThread(new j(this, false, z10, i.f122755a));
            a(false, z10);
        }
    }
}
