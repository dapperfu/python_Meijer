package com.google.android.libraries.places.api.auth;

import androidx.annotation.RecentlyNonNull;
import com.google.common.util.concurrent.q;

/* loaded from: classes6.dex */
public interface PlacesAppCheckTokenProvider {
    @RecentlyNonNull
    q<String> fetchAppCheckToken();
}
