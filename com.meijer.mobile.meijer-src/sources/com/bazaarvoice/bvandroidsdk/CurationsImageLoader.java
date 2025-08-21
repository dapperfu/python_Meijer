package com.bazaarvoice.bvandroidsdk;

import android.widget.ImageView;

/* loaded from: classes4.dex */
public interface CurationsImageLoader {
    void cancel(Object obj);

    Object getTag(ImageView imageView);

    void loadInto(ImageView imageView, String str, int i10, int i11);
}
