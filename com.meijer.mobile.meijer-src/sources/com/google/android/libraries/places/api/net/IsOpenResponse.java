package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class IsOpenResponse {
    @RecentlyNonNull
    public static IsOpenResponse newInstance(Boolean bool) {
        return new zzr(bool);
    }

    @RecentlyNullable
    public abstract Boolean isOpen();
}
