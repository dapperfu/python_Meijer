package com.google.android.libraries.places.api.model;

import Ee.L;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AuthorAttributions implements Parcelable {
    @RecentlyNonNull
    public abstract List<AuthorAttribution> asList();

    @RecentlyNonNull
    public static AuthorAttributions newInstance(@RecentlyNonNull List<AuthorAttribution> list) {
        return new zzbw(L.s(list));
    }
}
