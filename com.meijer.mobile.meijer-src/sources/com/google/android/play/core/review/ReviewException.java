package com.google.android.play.core.review;

import Ae.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes4.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), a.a(i10))));
    }
}
