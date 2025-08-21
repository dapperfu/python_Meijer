package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.AuthorAttributions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"authorAttributions", "Lcom/google/android/libraries/places/api/model/AuthorAttributions;", "", "Lcom/google/android/libraries/places/api/model/AuthorAttribution;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthorAttributionsKt {
    public static final AuthorAttributions authorAttributions(@RecentlyNonNull List<? extends AuthorAttribution> authorAttributions) {
        Intrinsics.j(authorAttributions, "authorAttributions");
        AuthorAttributions authorAttributionsNewInstance = AuthorAttributions.newInstance(authorAttributions);
        Intrinsics.i(authorAttributionsNewInstance, "newInstance(...)");
        return authorAttributionsNewInstance;
    }
}
