package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import ye.C18208a;

/* loaded from: classes4.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), C18208a.a(i10))));
    }
}
